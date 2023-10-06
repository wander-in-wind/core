package emu.grasscutter.game.entity.gadget.chest;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.entity.gadget.GadgetChest;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.server.packet.send.PacketGadgetAutoPickDropInfoNotify;
import lombok.val;

import java.util.Arrays;

public class BossChestInteractHandler implements ChestInteractHandler{
    @Override
    public boolean isTwoStep() {
        return true;
    }

    @Override
    public boolean onInteract(GadgetChest chest, Player player) {
        return this.onInteract(chest,player,false);
    }

    public boolean onInteract(GadgetChest chest, Player player, boolean useCondensedResin) {
        val worldDataManager = chest.getGadget().getScene().getWorld().getServer().getWorldDataSystem();
        val monster = chest.getGadget().getMetaGadget().group.monsters.get(chest.getGadget().getMetaGadget().boss_chest.monster_config_id);
        val reward = worldDataManager.getRewardByBossId(monster.monster_id);

        if (reward == null) {
            val dungeonManager = player.getScene().getDungeonManager();

            if(dungeonManager != null){
                return dungeonManager.getStatueDrops(player, useCondensedResin, chest.getGadget().getGroupId());
            }
            Grasscutter.getLogger().warn("Could not found the reward of boss monster {}", monster.monster_id);
            return false;
        }

        val rewards = Arrays.stream(reward.getPreviewItems())
            .map(param -> new GameItem(param.getId(), Math.max(param.getCount(), 1)))
            .toList();

        player.getInventory().addItems(rewards, ActionReason.OpenWorldBossChest);
        player.sendPacket(new PacketGadgetAutoPickDropInfoNotify(rewards));
        return true;
    }
}
