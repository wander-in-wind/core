package emu.grasscutter.game.drop;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.DataLoader;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.common.DropItemData;
import emu.grasscutter.data.excels.DropMaterialData;
import emu.grasscutter.data.excels.DropTableData;
import emu.grasscutter.game.entity.EntityItem;
import emu.grasscutter.game.entity.EntityMonster;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.inventory.ItemType;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.server.game.BaseGameSystem;
import emu.grasscutter.server.game.GameServer;
import emu.grasscutter.server.packet.send.PacketDropHintNotify;
import emu.grasscutter.server.packet.send.PacketGadgetAutoPickDropInfoNotify;
import emu.grasscutter.utils.Position;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public final class DropSystem extends BaseGameSystem {
    private final Int2ObjectMap<DropTableData> dropTable;
    private final Map<String, List<BaseDropData>> chestReward;
    private final Map<String, List<BaseDropData>> monsterDrop;
    private final Random rand;

    // TODO: don't know how to determine boss level.Have to hard-code the data from wiki.
    private final int[] bossLevel = {36, 37, 41, 50, 62, 72, 83, 91, 93};

    public DropSystem(GameServer server) {
        super(server);

        this.rand = new Random();
        this.dropTable = GameData.getDropTableDataMap();
        this.chestReward = new HashMap<>();
        this.monsterDrop = new HashMap<>();

        try {
            var dataList = DataLoader.loadList("ChestDrop.json", ChestDropData.class);
            for (var i : dataList) {
                if (!chestReward.containsKey(i.getIndex())) {
                    chestReward.put(i.getIndex(), new ArrayList<>());
                }
                chestReward.get(i.getIndex()).add(i);
            }
        } catch (Exception ignored) {
            Grasscutter.getLogger().error("Unable to load chest drop data. Please place ChestDrop.json in data folder.");
        }

        try {
            var dataList = DataLoader.loadList("MonsterDrop.json", BaseDropData.class);
            for (var i : dataList) {
                if (!monsterDrop.containsKey(i.getIndex())) {
                    monsterDrop.put(i.getIndex(), new ArrayList<>());
                }
                monsterDrop.get(i.getIndex()).add(i);
            }
        } catch (Exception ignored) {
            Grasscutter.getLogger().error("Unable to load monster drop data. Please place MonsterDrop.json in data folder.");
        }
    }

    private int queryDropData(String dropTag, int level, Map<String, List<BaseDropData>> rewards) {
        if (!rewards.containsKey(dropTag)) return 0;

        var rewardList = rewards.get(dropTag);
        BaseDropData dropData = null;
        int minLevel = 0;
        for (var i : rewardList) {
            if (level >= i.getMinLevel() && i.getMinLevel() > minLevel) {
                minLevel = i.getMinLevel();
                dropData = i;
            }
        }
        if (dropData == null) return 0;
        return dropData.getDropId();
    }

    @Nullable
    public Collection<GameItem> handleEntityDrop(int entityId, String subfieldName) {
        var subfieldInfo = GameData.getEntityDropDataMap().get(entityId);
        if (subfieldInfo == null) return null;
        for (var entry : subfieldInfo.getSubfields()) {
            if (entry.getSubfieldName().equals(subfieldName)) {
                var dropSubfieldData = GameData.getDropSubfieldDataMap().get(entry.getSubfieldId());
                return processDrop(dropSubfieldData.getDropId(), 1);
            }
        }
        return null;
    }

    @Nullable
    public Collection<GameItem> handleDungeonRewardDrop(int dropId, boolean doubleReward) {
        return processDrop(dropId, doubleReward ? 2 : 1);
    }

    public boolean handleMonsterDrop(EntityMonster monster) {
        // the drop items consist of two parts
        // first part
        int dropId = monster.getMonsterData().getKillDropId();
        var items = processDrop(dropId, 1);
        if (items == null) return false;

        //second part
        var sceneMonster = monster.getMetaMonster();
        if (sceneMonster != null) {
            if (sceneMonster.drop_tag != null) {
                int level = monster.getLevel();
                dropId = queryDropData(sceneMonster.drop_tag, level, monsterDrop);
            } else {
                dropId = sceneMonster.drop_id;
            }
            var drop = processDrop(dropId, 1);
            if (drop != null) items.addAll(drop);
        }

        // now dropId must be non-null
        var dropData = dropTable.get(dropId);
        if (dropData.isFallToGround()) {
            dropItems(items, ActionReason.MonsterDie, monster, monster.getScene().getPlayers().get(0), true);
        } else {
            for (Player p : monster.getScene().getPlayers()) {
                p.getInventory().addItems(items, ActionReason.MonsterDie);
            }
        }
        return true;
    }

    public boolean handleChestDrop(int chestDropId, int dropCount, GameEntity bornFrom) {
        var items = processDrop(chestDropId, dropCount);
        if (items == null) return false;
        var dropData = dropTable.get(chestDropId);
        if (dropData.isFallToGround()) {
            dropItems(items, ActionReason.OpenChest, bornFrom, bornFrom.getWorld().getHost(), false);
        } else {
            bornFrom.getWorld().getHost().getInventory().addItems(items, ActionReason.OpenChest);
        }
        return true;
    }

    public boolean handleChestDrop(String dropTag, int level, GameEntity bornFrom) {
        int dropId = queryDropData(dropTag, level, chestReward);
        if (dropId == 0) return false;
        return handleChestDrop(dropId, 1, bornFrom);
    }

    public boolean handleBossChestDrop(String dropTag, Player player) {
        int dropId = queryDropData(dropTag, bossLevel[player.getWorldLevel()], chestReward);
        return handleFloraChestDrop(dropId, player, false);
    }

    public boolean handleFloraChestDrop(int dropId, Player player, boolean doubleReward) {
        var items = processDrop(dropId, doubleReward ? 2 : 1);
        if (items == null) return false;
        player.getInventory().addItems(items, ActionReason.OpenWorldBossChest);
        player.sendPacket(new PacketGadgetAutoPickDropInfoNotify(items));
        return true;
    }

    /**
     * Roll the drop reward
     *
     * @return if there is no drop entry for the dropId, return null.
     */
    @Nullable
    private Collection<GameItem> processDrop(int dropId, int count) {
        var dropData = dropTable.get(dropId);
        if (dropData == null) return null;
        Int2ObjectMap<GameItem> items = new Int2ObjectOpenHashMap<>();
        for (int i = 0; i < count; i++) processDrop(dropData, items);
        return items.values();
    }

    // `items` is used to store drop items and pile them
    private void processDrop(DropTableData dropData, Int2ObjectMap<GameItem> items) {
        //TODO:Not clear on the meaning of some fields,like "dropLevel".Will ignore them.
        //TODO:solve drop limits,like everydayLimit.
        if (dropData.getRandomType() == 0) { // select one from pool
            int weightSum = dropData.getDropVec().stream()
                .filter(i -> i.getId() != 0)
                .mapToInt(DropItemData::getWeight)
                .sum();
            if (weightSum == 0) return;
            int weight = rand.nextInt(weightSum);
            int sum = 0;
            for (var i : dropData.getDropVec()) {
                int id = i.getId();
                if (id == 0) continue;
                sum += i.getWeight();
                if (weight < sum) {
                    //win the item
                    addReward(i, items);
                    break; // win only one pool
                }
            }
        } else if (dropData.getRandomType() == 1) { // select multiple
            for (var i : dropData.getDropVec()) {
                int id = i.getId();
                if (id == 0) continue;
                if (rand.nextInt(10000) < i.getWeight()) {
                    //win the item
                    addReward(i, items);
                }
            }
        }
    }

    private void addReward(DropItemData dropEntry, Int2ObjectMap<GameItem> items) {
        var id = dropEntry.getId();
        int amount = calculateDropAmount(dropEntry.getCountRange());
        if (amount <= 0) return;
        if (dropTable.containsKey(id)) {
            processDrop(dropTable.get(id), items);
        } else {
            if (items.containsKey(id)) {
                var item = items.get(id);
                item.setCount(item.getCount() + amount);
            } else {
                items.put(id, new GameItem(id, amount));
            }
        }
    }

    private int calculateDropAmount(String countRange) {
        int amount;
        if (countRange.contains(";")) {
            String[] ranges = countRange.split(";");
            amount = rand.nextInt(Integer.parseInt(ranges[0]), Integer.parseInt(ranges[1]) + 1);
        } else if (countRange.contains(".")) {
            double expectAmount = Double.parseDouble(countRange);
            amount = (int) expectAmount;
            if (rand.nextDouble() < expectAmount - amount) amount++;
        } else {
            amount = Integer.parseInt(countRange);
        }
        return amount;
    }

    /**
     * @param share Whether other players in the scene could see the drop items.
     */
    public void dropItem(GameItem item, ActionReason reason, @Nullable Player player, @NotNull GameEntity bornFrom, boolean share) {
        DropMaterialData drop = GameData.getDropMaterialDataMap().get(item.getItemId());
        if ((drop != null && drop.isAutoPick()) || (item.getItemData().getItemType() == ItemType.ITEM_VIRTUAL && item.getItemData().getGadgetId() == 0)) {
            if (player != null) giveItem(item, reason, player, share);
        } else {
            var scene = bornFrom.getScene();
            var itemData = GameData.getItemDataMap().get(item.getItemId());
            if (itemData == null) return;
            if (itemData.isEquip()) { // equip cannot pile, drop separately
                float range = (1.5f + (.05f * item.getCount()));
                for (int j = 0; j < item.getCount(); j++) {
                    Position pos = bornFrom.getPosition().nearby2d(range).addY(0.5f);
                    EntityItem entity = new EntityItem(scene, player, itemData, pos, 1, share);
                    scene.addEntity(entity);
                }
            } else {
                EntityItem entity = new EntityItem(scene, player, itemData,
                    bornFrom.getPosition().nearby2d(1f).addY(0.5f), // nearby2d() will clone the position
                    item.getCount(), share);
                scene.addEntity(entity);
            }
        }
    }

    public void dropItems(Collection<GameItem> items, ActionReason reason, GameEntity bornFrom, Player player, boolean share) {
        for (var i : items) {
            dropItem(i, reason, player, bornFrom, share);
        }
    }

    private void giveItem(GameItem item, ActionReason reason, @NotNull Player player, boolean share) {
        if (share) {
            for (var p : player.getScene().getPlayers()) {
                p.getInventory().addItem(item, reason);
                p.sendPacket(new PacketDropHintNotify(item.getItemId(), player.getPosition().toProto()));
            }
        } else {
            player.getInventory().addItem(item, reason);
            player.sendPacket(new PacketDropHintNotify(item.getItemId(), player.getPosition().toProto()));
        }
    }

    private void giveItems(List<GameItem> items, ActionReason reason, Player player, boolean share) {
        //don't know whether we need PacketDropHintNotify.
        if (share) {
            for (var p : player.getScene().getPlayers()) {
                p.getInventory().addItems(items, reason);
                p.sendPacket(new PacketDropHintNotify(items, player.getPosition().toProto()));
            }
        } else {
            player.getInventory().addItems(items, reason);
            player.sendPacket(new PacketDropHintNotify(items, player.getPosition().toProto()));
        }
    }

}
