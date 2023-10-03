package emu.grasscutter.game.world;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameDepot;
import emu.grasscutter.data.binout.SceneNpcBornEntry;
import emu.grasscutter.data.binout.routes.Route;
import emu.grasscutter.data.excels.*;
import emu.grasscutter.data.server.Grid;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.dungeons.DungeonManager;
import emu.grasscutter.game.dungeons.challenge.WorldChallenge;
import emu.grasscutter.game.dungeons.enums.DungeonPassConditionType;
import emu.grasscutter.game.dungeons.settle_listeners.DungeonSettleListener;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.entity.gadget.GadgetWorktop;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.player.TeamInfo;
import emu.grasscutter.game.props.*;
import emu.grasscutter.game.quest.QuestGroupSuite;
import emu.grasscutter.game.world.SpawnDataEntry.GridBlockId;
import emu.grasscutter.game.world.data.TeleportProperties;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.proto.AttackResultOuterClass.AttackResult;
import emu.grasscutter.net.proto.EnterTypeOuterClass;
import emu.grasscutter.net.proto.SelectWorktopOptionReqOuterClass;
import emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType;
import emu.grasscutter.scripts.SceneIndexManager;
import emu.grasscutter.scripts.SceneScriptManager;
import emu.grasscutter.scripts.constants.EventType;
import emu.grasscutter.scripts.data.SceneBlock;
import emu.grasscutter.scripts.data.SceneGroup;
import emu.grasscutter.scripts.data.ScriptArgs;
import emu.grasscutter.server.event.player.PlayerTeleportEvent;
import emu.grasscutter.server.packet.send.*;
import emu.grasscutter.utils.KahnsSort;
import emu.grasscutter.utils.Position;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import lombok.Getter;
import lombok.Setter;
import lombok.val;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


public class Scene {
    @Getter private final World world;
    @Getter private final SceneData sceneData;
    @Getter private final List<Player> players = new CopyOnWriteArrayList<>();
    @Getter private final Map<Integer, GameEntity> entities = new ConcurrentHashMap<>();
    @Getter private final Map<Integer, GameEntity> weaponEntities = new ConcurrentHashMap<>();
    private final Set<SpawnDataEntry> spawnedEntities = ConcurrentHashMap.newKeySet();
    @Getter private final Set<SpawnDataEntry> deadSpawnedEntities = ConcurrentHashMap.newKeySet();
    @Getter private final Set<SceneGroup> loadedGroups = ConcurrentHashMap.newKeySet();
    @Getter private final Set<Integer> loadedGroupIds = ConcurrentHashMap.newKeySet();
    private final Set<Integer> replacedGroup = ConcurrentHashMap.newKeySet();
    private final HashSet<Integer> unlockedForces = new HashSet<>();
    private final List<Runnable> afterLoadedCallbacks = new ArrayList<>();
    private final long startWorldTime;
    @Getter @Setter DungeonManager dungeonManager;
    @Getter Int2ObjectMap<Route> sceneRoutes;
    private Set<SpawnDataEntry.GridBlockId> loadedGridBlocks = new HashSet<>();
    @Getter @Setter private boolean dontDestroyWhenEmpty;

    @Getter @Setter private int autoCloseTime;
    @Getter @Setter private int time;
    private long startTime;

    @Getter private final SceneScriptManager scriptManager;
    @Getter @Setter private WorldChallenge challenge;
    @Getter private final List<DungeonSettleListener> dungeonSettleListeners = new ArrayList<>();
    @Getter @Setter private int prevScene; // id of the previous scene
    @Getter @Setter private int prevScenePoint;
    @Getter @Setter private int killedMonsterCount;
    @Getter @Setter private int killChestCount;
    private Set<SceneNpcBornEntry> npcBornEntrySet = ConcurrentHashMap.newKeySet();
    @Getter private boolean finishedLoading = false;
    @Getter private int tickCount = 0;
    @Getter private boolean isPaused = false;

    @Getter private final GameEntity sceneEntity;

    public Scene(World world, SceneData sceneData) {
        this.world = world;
        this.sceneData = sceneData;

        this.prevScene = 3;
        this.sceneRoutes = GameData.getSceneRoutes(getId());

        this.startWorldTime = world.getWorldTime();

        this.scriptManager = new SceneScriptManager(this);

        //Create scene entity
        this.sceneEntity = new EntityScene(this);
    }

    public int getId() {
        return sceneData.getId();
    }

    public SceneType getSceneType() {
        return sceneData.getSceneType();
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public GameEntity getEntityById(int id) {
        if (id == 0x13800001) return this.sceneEntity;
        else if (id == this.world.getLevelEntityId()) return this.world.getEntity();

        val teamEntityPlayer = this.players.stream().filter(p -> p.getTeamManager().getEntity().getId() == id).findAny();
        if (teamEntityPlayer.isPresent()) return teamEntityPlayer.get().getTeamManager().getEntity();

        var entity = this.entities.get(id);
        if (entity == null) entity = this.weaponEntities.get(id);
        if (entity == null && EntityIdType.idFromEntityId(id) == EntityIdType.AVATAR.getId()) {
            for (var player : getPlayers()) {
                for (var avatar : player.getTeamManager().getActiveTeam()) {
                    if (avatar.getId() == id) return avatar;
                }
            }
        }

        return entity;
    }

    public GameEntity getEntityByConfigId(int configId) {
        return this.entities.values().stream()
            .filter(x -> x.getConfigId() == configId)
            .findFirst()
            .orElse(null);
    }

    public GameEntity getEntityByConfigId(int configId, int groupId) {
        return this.entities.values().stream()
            .filter(x -> x.getConfigId() == configId && x.getGroupId() == groupId)
            .findFirst()
            .orElse(null);
    }

    @Nullable
    public Route getSceneRouteById(int routeId) {
        return sceneRoutes.get(routeId);
    }

    public void setPaused(boolean paused) {
        if (isPaused != paused) {
            isPaused = paused;
            broadcastPacket(new PacketSceneTimeNotify(this));
        }
    }

    public int getSceneTime() {
        return (int) (world.getWorldTime() - startWorldTime);
    }

    public int getSceneTimeSeconds() {
        return getSceneTime() / 1000;
    }

    public void addDungeonSettleObserver(DungeonSettleListener dungeonSettleListener) {
        this.dungeonSettleListeners.add(dungeonSettleListener);
    }

    public void triggerDungeonEvent(DungeonPassConditionType conditionType, int... params) {
        if (dungeonManager == null) return;
        dungeonManager.triggerEvent(conditionType, params);
    }

    public boolean isInScene(GameEntity entity) {
        return this.entities.containsKey(entity.getId());
    }

    public synchronized void addPlayer(Player player) {
        // Check if player already in
        if (this.players.contains(player)) return;

        // Remove player from prev scene
        if (player.getScene() != null) player.getScene().removePlayer(player);

        // Add
        this.players.add(player);
        player.setSceneId(getId());
        player.setScene(this);

        setupPlayerAvatars(player);
    }

    public synchronized void removePlayer(Player player) {
        // Remove from challenge if leaving
        if (this.getChallenge() != null && this.getChallenge().inProgress()) {
            player.sendPacket(new PacketDungeonChallengeFinishNotify(this.getChallenge()));
        }

        // Remove player from scene
        this.players.remove(player);
        player.setScene(null);

        // Remove player avatars
        removePlayerAvatars(player);

        // Remove player gadgets
        player.getTeamManager().getGadgets().forEach(this::removeEntity);

        // Deregister scene if not in use
        if (getPlayerCount() <= 0 && !this.dontDestroyWhenEmpty) {
            this.scriptManager.onDestroy();
            this.world.deregisterScene(this);
        }
        saveGroups();
    }

    private void setupPlayerAvatars(@NotNull Player player) {
        // Clear entities from old team
        val activeTeam = player.getTeamManager().getActiveTeam();
        activeTeam.clear();
        Optional.ofNullable(player.getTeamManager().getCurrentTeamInfo()).map(TeamInfo::getAvatars).stream()
            .flatMap(List::stream).map(player.getAvatars()::getAvatarById)
            .map(avatar -> new EntityAvatar(player.getScene(), avatar)).forEach(activeTeam::add);
    }

    private synchronized void removePlayerAvatars(@NotNull Player player) {
        removeEntities(player.getTeamManager().getActiveTeam(), VisionType.VISION_TYPE_MISS);
    }

    public void spawnPlayer(Player player) {
        val teamManager = player.getTeamManager();
        val curAvatarEntity = teamManager.getCurrentAvatarEntity();
        if (isInScene(curAvatarEntity)) return;

        if (curAvatarEntity.getFightProperty(FightProperty.FIGHT_PROP_CUR_HP) <= 0f) {
            curAvatarEntity.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP, 1f);
        }

        addEntity(curAvatarEntity);

        // Notify the client of any extra skill charges
        teamManager.getActiveTeam().stream().map(EntityAvatar::getAvatar).forEach(Avatar::sendSkillExtraChargeMap);
    }

    private void addEntityDirectly(GameEntity entity) {
        this.entities.put(entity.getId(), entity);
        entity.onCreate(); // Call entity create event
    }

    public synchronized void addEntity(GameEntity entity) {
        addEntityDirectly(entity);
        broadcastPacket(new PacketSceneEntityAppearNotify(entity));
    }

    public synchronized void addEntityToSingleClient(Player player, GameEntity entity) {
        addEntityDirectly(entity);
        player.sendPacket(new PacketSceneEntityAppearNotify(entity));

    }

    public void addDropEntity(GameItem item, GameEntity bornForm, Player player, boolean share) {
        // TODO:optimize EntityItem.java. Maybe we should make other players can't see
        // the ItemEntity.
        ItemData itemData = GameData.getItemDataMap().get(item.getItemId());
        if (itemData == null)
            return;
        if (itemData.isEquip()) {
            float range = (1.5f + (.05f * item.getCount()));
            for (int j = 0; j < item.getCount(); j++) {
                Position pos = bornForm.getPosition().nearby2d(range).addY(0.5f);
                EntityItem entity = new EntityItem(this, player, itemData, pos, item.getCount(), share);
                addEntity(entity);
            }
        } else {
            EntityItem entity = new EntityItem(this, player, itemData, bornForm.getPosition().clone().addY(0.5f),
                item.getCount(), share);
            addEntity(entity);
        }

    }

    public void addEntities(Collection<? extends GameEntity> entities) {
        addEntities(entities, VisionType.VISION_TYPE_BORN);
    }

    public void updateEntity(GameEntity entity) {
        this.broadcastPacket(new PacketSceneEntityUpdateNotify(entity));
    }

    public void updateEntity(GameEntity entity, VisionType type) {
        this.broadcastPacket(new PacketSceneEntityUpdateNotify(List.of(entity), type));
    }

    private static <T> List<List<T>> chopped(List<T> list, final int L) {
        List<List<T>> parts = new ArrayList<>();
        final int N = list.size();
        for (int i = 0; i < N; i += L) {
            parts.add(new ArrayList<>(
                list.subList(i, Math.min(N, i + L)))
            );
        }
        return parts;
    }

    public synchronized void addEntities(Collection<? extends GameEntity> entities, VisionType visionType) {
        if (entities == null || entities.isEmpty()) return;

        entities.forEach(this::addEntityDirectly);

        for(val l : chopped(new ArrayList<>(entities), 100)) {
            this.broadcastPacket(new PacketSceneEntityAppearNotify(l, visionType));
        }
    }

    private GameEntity removeEntityDirectly(GameEntity entity) {
        var removed = getEntities().remove(entity.getId());
        if (removed != null) {
            removed.onRemoved();//Call entity remove event
        }

        //if(entity instanceof EntityWeapon) {
        //    Grasscutter.getLogger().warn("Weapon removed {}: ", entity.getId());
//
        //    for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
        //        Grasscutter.getLogger().warn(ste.toString());
        //    }
        //}
        return removed;
    }

    public void removeEntity(GameEntity entity) {
        removeEntity(entity, VisionType.VISION_TYPE_DIE);
    }

    public synchronized void removeEntity(GameEntity entity, VisionType visionType) {
        GameEntity removed = this.removeEntityDirectly(entity);
        if (removed != null) {
            this.broadcastPacket(new PacketSceneEntityDisappearNotify(removed, visionType));
        }
    }

    public synchronized void removeEntities(List<? extends GameEntity> entity, VisionType visionType) {
        var toRemove = entity.stream()
            .filter(Objects::nonNull)
            .map(this::removeEntityDirectly)
            .filter(Objects::nonNull)
            .toList();
        if (!toRemove.isEmpty()) {
            this.broadcastPacket(new PacketSceneEntityDisappearNotify(toRemove, visionType));
        }
    }

    public synchronized void replaceEntity(EntityAvatar oldEntity, EntityAvatar newEntity) {
        removeEntityDirectly(oldEntity);
        addEntityDirectly(newEntity);
        broadcastPacket(new PacketSceneEntityDisappearNotify(oldEntity, VisionType.VISION_TYPE_REPLACE));
        broadcastPacket(new PacketSceneEntityAppearNotify(newEntity, VisionType.VISION_TYPE_REPLACE, oldEntity.getId()));
    }

    public void showOtherEntities(Player player) {
        GameEntity currentEntity = player.getTeamManager().getCurrentAvatarEntity();
        List<GameEntity> entities = this.getEntities().values().stream().filter(entity -> entity != currentEntity).toList();

        player.sendPacket(new PacketSceneEntityAppearNotify(entities, VisionType.VISION_TYPE_MEET));
    }

    public void handleAttack(AttackResult result) {
        //GameEntity attacker = getEntityById(result.getAttackerId());
        val target = getEntityById(result.getDefenseId());
        val attackType = ElementType.getTypeByValue(result.getElementType());
        if (target == null) return;

        // God-mode check
        if (target instanceof EntityAvatar entityAvatar) {
            if (entityAvatar.getPlayer().isInGodMode()) return;

            if (result.getDamage() != result.getDamageShield()) { // when avatar actually have a shield
                //TODO check
                Optional.ofNullable(this.challenge).ifPresent(c ->
                    c.onDamageMonsterOrShield(getEntityById(result.getAttackerId()), result.getDamageShield() - result.getDamage()));
            }
        }
        target.damage(result.getDamage(), result.getAttackerId(), attackType);
        if (target instanceof EntityGadget gadget) {
            Optional.ofNullable(this.challenge).ifPresent(c -> c.onGadgetDamage(gadget));
        }
    }

    public void killEntity(GameEntity target) {
        killEntity(target, 0);
    }

    public void killEntity(GameEntity target, int attackerId) {
        GameEntity attacker = null;

        if (attackerId > 0) attacker = getEntityById(attackerId);

        if (attacker != null) {
            // Check codex
            if (attacker instanceof EntityClientGadget gadgetAttacker) {
                var clientGadgetOwner = getEntityById(gadgetAttacker.getOwnerEntityId());
                if (clientGadgetOwner instanceof EntityAvatar) {
                    ((EntityClientGadget) attacker).getOwner().getCodex().checkAnimal(target, CodexAnimalData.CountType.CODEX_COUNT_TYPE_KILL);
                }
            } else if (attacker instanceof EntityAvatar avatarAttacker) {
                avatarAttacker.getPlayer().getCodex().checkAnimal(target, CodexAnimalData.CountType.CODEX_COUNT_TYPE_KILL);
            }
        }

        // Packet
        broadcastPacket(new PacketLifeStateChangeNotify(attackerId, target, LifeState.LIFE_DEAD));


        // Remove entity from world
        removeEntity(target);

        // Death event
        target.onDeath(attackerId);
        // Reward drop
        if (target instanceof EntityMonster monster) {
            if (getSceneType() != SceneType.SCENE_DUNGEON && attacker != null) {
                if (monster.getMetaMonster() != null && !world.getServer().getDropSystem().handleMonsterDrop(monster)) {
                    Grasscutter.getLogger().warn("Can not solve monster drop: drop_id = {}, drop_tag = {}. Falling back to legacy drop system.", monster.getMetaMonster().drop_id, monster.getMetaMonster().drop_tag);
                    world.getServer().getDropSystemLegacy().callDrop(monster);
                }
            }
            triggerDungeonEvent(DungeonPassConditionType.DUNGEON_COND_KILL_MONSTER_COUNT, ++this.killedMonsterCount);
        } else if (target instanceof EntityGadget gadget) {
            Optional.ofNullable(gadget.getGadgetData())
                .filter(data -> data.getType() == EntityType.Chest)
                .ifPresent(data -> this.killChestCount++);
        }
    }

    public void onTick() {
        // disable script for home
        if (getSceneType() == SceneType.SCENE_HOME_WORLD || getSceneType() == SceneType.SCENE_HOME_ROOM) {
            finishLoading();
            return;
        }
        if (this.scriptManager.isInit()) {
            //this.checkBlocks();
            if (tickCount % 2 == 0) {
                checkGroups();
            }
        } else {
            // TEMPORARY
            checkSpawns();
        }
        // Triggers
        this.scriptManager.checkRegions();

        if (challenge != null) {
            challenge.onCheckTimeOut();
        }

        val sceneTime = getSceneTimeSeconds();
        getEntities().forEach((eid, e) -> e.onTick(sceneTime));

        checkNpcGroup();
        finishLoading();
        checkPlayerRespawn();
        if (tickCount % 10 == 0) {
            broadcastPacket(new PacketSceneTimeNotify(this));
        }
        tickCount++;
    }

    private void checkPlayerRespawn() {
        if (this.scriptManager.getConfig() == null) return;

        val diePos = this.scriptManager.getConfig().die_y;
        // Check if we need a respawn
        this.players.stream().filter(p -> diePos >= p.getPosition().getY()).forEach(this::respawnPlayer);
        this.entities.values().stream().filter(e -> diePos >= e.getPosition().getY()).forEach(this::killEntity);
    }

    public Position getDefaultLocation(Player player) {
        val defaultPosition = getScriptManager().getConfig().born_pos;
        return defaultPosition != null ? defaultPosition : player.getPosition();
    }

    private Position getDefaultRot(Player player) {
        val defaultRotation = getScriptManager().getConfig().born_rot;
        return defaultRotation != null ? defaultRotation : player.getRotation();
    }

    private Position getRespawnLocation(Player player) {
        //TODO get last valid location the player stood on
        val lastCheckpointPos = dungeonManager != null ? dungeonManager.getRespawnLocation() : null;
        return lastCheckpointPos != null ? lastCheckpointPos : getDefaultLocation(player);
    }

    private Position getRespawnRotation(Player player) {
        val lastCheckpointRot = dungeonManager != null ? dungeonManager.getRespawnRotation() : null;
        return lastCheckpointRot != null ? lastCheckpointRot : getDefaultRot(player);

    }

    public boolean respawnPlayer(Player player) {
        player.getTeamManager().onAvatarDieDamage();

        // todo should probably respawn the player at the last valid location
        return this.world.transferPlayerToScene(player, TeleportProperties.builder()
            .sceneId(getId())
            .prevSceneId(getId())
            .prevPos(player.getPosition())
            .teleportTo(getRespawnLocation(player))
            .teleportRot(getRespawnRotation(player))
            .teleportType(PlayerTeleportEvent.TeleportType.INTERNAL)
            .worldType(Optional.ofNullable(this.dungeonManager).map(data -> 13).orElse(14))
            .enterType(EnterTypeOuterClass.EnterType.ENTER_TYPE_GOTO)
            .dungeonId(Optional.ofNullable(this.dungeonManager).map(DungeonManager::getDungeonData).map(DungeonData::getId).orElse(0))
            .enterReason(this.dungeonManager != null ? EnterReason.DungeonReviveOnWaypoint : EnterReason.Revival)
            .build());
    }

    public void finishLoading() {
        if (finishedLoading) {
            return;
        }
        this.finishedLoading = true;
        afterLoadedCallbacks.forEach(Runnable::run);
        afterLoadedCallbacks.clear();
    }

    public void runWhenFinished(Runnable runnable) {
        if (isFinishedLoading()) {
            runnable.run();
            return;
        }
        afterLoadedCallbacks.add(runnable);
    }

    public int getEntityLevel(int baseLevel, int worldLevelOverride) {
        int level = worldLevelOverride > 0 ? worldLevelOverride + baseLevel - 22 : baseLevel;
        level = Math.min(level, 100);
        level = Math.max(level, 1);

        return level;
    }

    public void checkNpcGroup() {
        Set<SceneNpcBornEntry> npcBornEntries = ConcurrentHashMap.newKeySet();
        for (Player player : this.getPlayers()) {
            npcBornEntries.addAll(loadNpcForPlayer(player));
        }

        // clear the unreachable group for client
        var toUnload = this.npcBornEntrySet.stream()
            .filter(i -> !npcBornEntries.contains(i))
            .map(SceneNpcBornEntry::getGroupId)
            .toList();

        if (!toUnload.isEmpty()) {
            broadcastPacket(new PacketGroupUnloadNotify(toUnload));
            Grasscutter.getLogger().debug("Unload NPC Group {}", toUnload);
        }
        // exchange the new npcBornEntry Set
        this.npcBornEntrySet = npcBornEntries;
    }

    public synchronized void checkSpawns() {
        Set<SpawnDataEntry.GridBlockId> loadedGridBlocks = new HashSet<>();
        for (Player player : this.getPlayers()) {
            Collections.addAll(loadedGridBlocks, GridBlockId.getAdjacentGridBlockIds(player.getSceneId(), player.getPosition()));
        }
        if (this.loadedGridBlocks.containsAll(loadedGridBlocks)) {  // Don't recalculate static spawns if nothing has changed
            return;
        }
        this.loadedGridBlocks = loadedGridBlocks;
        var spawnLists = GameDepot.getSpawnLists();
        Set<SpawnDataEntry> visible = new HashSet<>();
        for (var block : loadedGridBlocks) {
            var spawns = spawnLists.get(block);
            if (spawns != null) {
                visible.addAll(spawns);
            }
        }

        // World level
        WorldLevelData worldLevelData = GameData.getWorldLevelDataMap().get(getWorld().getWorldLevel());
        int worldLevelOverride = 0;

        if (worldLevelData != null) {
            worldLevelOverride = worldLevelData.getMonsterLevel();
        }

        // Todo
        List<GameEntity> toAdd = new ArrayList<>();
        List<GameEntity> toRemove = new ArrayList<>();
        var spawnedEntities = this.spawnedEntities;
        for (SpawnDataEntry entry : visible) {
            // If spawn entry is in our view and hasn't been spawned/killed yet, we should spawn it
            if (!spawnedEntities.contains(entry) && !this.getDeadSpawnedEntities().contains(entry)) {
                // Entity object holder
                GameEntity entity = null;

                // Check if spawn entry is monster or gadget
                if (entry.getMonsterId() > 0) {
                    MonsterData data = GameData.getMonsterDataMap().get(entry.getMonsterId());
                    if (data == null) continue;

                    int level = this.getEntityLevel(entry.getLevel(), worldLevelOverride);

                    EntityMonster monster = new EntityMonster(this, data, entry.getPos(), level);
                    monster.getRotation().set(entry.getRot());
                    monster.setGroupId(entry.getGroup().getGroupId());
                    monster.setPoseId(entry.getPoseId());
                    monster.setConfigId(entry.getConfigId());
                    monster.setSpawnEntry(entry);

                    entity = monster;
                } else if (entry.getGadgetId() > 0) {
                    EntityGadget gadget = new EntityGadget(this, entry.getGadgetId(), entry.getPos(), entry.getRot());
                    gadget.setGroupId(entry.getGroup().getGroupId());
                    gadget.setConfigId(entry.getConfigId());
                    gadget.setSpawnEntry(entry);
                    int state = entry.getGadgetState();
                    if (state > 0) {
                        gadget.setState(state);
                    }
                    gadget.buildContent();

                    gadget.setFightProperty(FightProperty.FIGHT_PROP_BASE_HP, Float.POSITIVE_INFINITY);
                    gadget.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP, Float.POSITIVE_INFINITY);
                    gadget.setFightProperty(FightProperty.FIGHT_PROP_MAX_HP, Float.POSITIVE_INFINITY);

                    entity = gadget;
                }

                if (entity == null) continue;

                // Add to scene and spawned list
                toAdd.add(entity);
                spawnedEntities.add(entry);
            }
        }

        for (GameEntity entity : this.getEntities().values()) {
            var spawnEntry = entity.getSpawnEntry();
            if (spawnEntry != null && !(entity instanceof EntityWeapon) && !visible.contains(spawnEntry)) {
                toRemove.add(entity);
                spawnedEntities.remove(spawnEntry);
            }
        }

        if (!toAdd.isEmpty()) {
            toAdd.forEach(this::addEntityDirectly);
            this.broadcastPacket(new PacketSceneEntityAppearNotify(toAdd, VisionType.VISION_TYPE_BORN));
        }
        if (!toRemove.isEmpty()) {
            toRemove.forEach(this::removeEntityDirectly);
            this.broadcastPacket(new PacketSceneEntityDisappearNotify(toRemove, VisionType.VISION_TYPE_REMOVE));
        }
    }

    public Set<Integer> getPlayerActiveGroups(Player player) {
        // consider the borders' entities of blocks, so we check if contains by index
        Position playerPosition = player.getPosition();
        Set<Integer> activeGroups = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            Grid grid = getScriptManager().getGroupGrids().get(i);

            activeGroups.addAll(grid.getNearbyGroups(i, playerPosition));
        }

        return activeGroups;
    }

    public void checkGroups() {
        boolean anyPlayerMoved = false;
        for (var player : this.players) {
            var lastPosition = player.getLastCheckedPosition();
            //Player didn't move
            if (lastPosition != null && lastPosition.equal2d(player.getPosition())) continue;
            player.setLastCheckedPosition(player.getPosition().clone());
            anyPlayerMoved = true;
        }
        if (!anyPlayerMoved) return;
        Set<Integer> visible = new HashSet<>();
        players.forEach(p -> visible.addAll(getPlayerActiveGroups(p)));

        //unload invisible groups
        for (SceneGroup group : this.loadedGroups) {
            if (!visible.contains(group.id) && !group.dynamic_load)
                unloadGroup(scriptManager.getBlocks().get(group.block_id), group.id);
        }

        //load visible groups
        List<SceneGroup> toLoad = new ArrayList<>();
        for (var g : visible) {
            if (loadedGroupIds.contains(g)) continue;
            var group = scriptManager.getGroups().get(g);
            if (group != null && !group.dynamic_load) {
                toLoad.add(group);
            }
        }

        this.onLoadGroup(toLoad);
        if (!toLoad.isEmpty()) this.onRegisterGroups();
    }

    /**
     * Load specific (dynamic loaded) group
     * don't load the group if it was replaced by other groups, TODO should probably log the failed loading reason
     */
    public int loadDynamicGroup(int groupId) {
        return this.scriptManager.getGroupInstanceById(groupId) != null || this.replacedGroup.contains(groupId) ? -1 :
            Optional.ofNullable(this.scriptManager.getGroupById(groupId))
                .map(group -> group.init_config).map(config -> config.suite).orElse(-1);
    }

    public boolean unregisterDynamicGroup(int groupId){
        val group = this.scriptManager.getGroupById(groupId);
        if(group == null) return false;

        val block = this.scriptManager.getBlocks().get(group.block_id);
        unloadGroup(block, groupId);

        val toRestore = Optional.ofNullable(block.groups.get(groupId)).map(g -> g.getReplaceableGroups(block.groups.values()))
            .stream().flatMap(List::stream).filter(replacement -> this.replacedGroup.remove(replacement.id)).toList();
        if (!toRestore.isEmpty()) {
            onLoadGroup(toRestore);
            Grasscutter.getLogger().info("Unregistered group: {}", groupId);
            Grasscutter.getLogger().info("Replaced groups: {}", this.replacedGroup);
        }
        return true;
    }

    /**
     * Check if a spawning group(1) will replace other groups(2). If so, unload groups(2)
     */
    public void onRegisterGroups() {
        // Create the graph
        val groupList = new HashSet<Integer>();
        val nodes = GameData.getGroupReplacements().values().stream()
            .filter(replacement -> this.loadedGroups.stream().filter(group -> group.dynamic_load)
                .anyMatch(group -> group.id == replacement.id)) // dynamic groups
//            .filter(replacement -> getReplacedGroup().stream().noneMatch(replacement.replace_groups::contains))
            .peek(replacement -> Grasscutter.getLogger().info("Graph ordering replacement {}", replacement))
            .peek(replacement -> groupList.add(replacement.id))
            .peek(replacement -> groupList.addAll(replacement.replace_groups))
            .map(replacement -> replacement.replace_groups
                .stream().map(id -> new KahnsSort.Node(replacement.id, id)).toList())
            .flatMap(List::stream)
            .collect(Collectors.toSet());

        // Now we can start unloading and loading groups :D
        Optional.ofNullable(KahnsSort.doSort(new KahnsSort.Graph(
                nodes.stream().toList(), groupList.stream().toList()))).stream().flatMap(List::stream)
            .map(groupId -> this.loadedGroups.stream().filter(g -> g.id == groupId).findFirst()) // isGroupJoinReplacement
            .filter(Optional::isPresent).map(Optional::get)
            .map(targetGroup -> targetGroup.getReplaceableGroups(this.loadedGroups))
            .flatMap(List::stream)
            .filter(replacement -> !this.replacedGroup.contains(replacement.id))
            .peek(replacement -> this.replacedGroup.add(replacement.id))
            .peek(replacement -> Grasscutter.getLogger().info("Graph ordering: unloaded {}", replacement.id))
            .peek(replacement -> Grasscutter.getLogger().info("Replaced groups: {}", this.replacedGroup))
            .forEach(replacement -> unloadGroup(this.scriptManager.getBlocks().get(replacement.block_id), replacement.id));
    }

    public void loadTriggerFromGroup(SceneGroup group, String triggerName) {
        //Load triggers and regions
        this.scriptManager.registerTrigger(group.triggers.values().stream().filter(p -> p.getName().contains(triggerName)).toList());
        group.regions.values().stream().filter(q -> q.config_id == Integer.parseInt(triggerName.substring(13)))
            .map(region -> new EntityRegion(this, region)).forEach(this.scriptManager::registerRegion);
    }

    /**
     * Load specific group(s), used when this
     * 1) group is came into player's sight (or visible)
     * 2) group is being registered
     */
    public void onLoadGroup(List<SceneGroup> groups) {
        if (groups == null || groups.isEmpty()) {
            return;
        }
        for (SceneGroup group : groups) {
            if (group == null || this.loadedGroups.contains(group)) continue;

            // We load the script files for the groups here
            this.getScriptManager().loadGroupFromScript(group);
        }

        // Spawn gadgets AFTER triggers are added
        // TODO
        var entities = new ArrayList<GameEntity>();
        var entitiesBorn = new ArrayList<GameEntity>();
        for (SceneGroup group : groups) {
            if (this.loadedGroups.contains(group)) continue;
            if (group.init_config == null) continue;

            SceneGroupInstance groupInstance = this.scriptManager.getGroupInstanceById(group.id);
            var cachedInstance = this.scriptManager.getCachedGroupInstanceById(group.id);
            if(cachedInstance != null) {
                cachedInstance.setLuaGroup(group);
                groupInstance = cachedInstance;
            }
            this.scriptManager.refreshGroup(groupInstance, 0, false, entitiesBorn); //This is what the official server does

            this.loadedGroups.add(group);
            this.loadedGroupIds.add(group.id);
        }

        scriptManager.meetEntities(entities);
        scriptManager.addEntities(entitiesBorn);
        groups.forEach(g -> scriptManager.callEvent(new ScriptArgs(g.id, EventType.EVENT_GROUP_LOAD, g.id)));
        Grasscutter.getLogger().info("Scene {} loaded {} group(s)", this.getId(), groups.size());
    }

    /**
     * Remove specific group, used when this
     * 1) group is not within player's sight (or not visible)
     * 2) group is replaced by other groups
     * 3) group is being unregistered
     */
    private void unloadGroup(SceneBlock block, int groupId) {
        removeEntities(this.entities.values().stream().filter(Objects::nonNull).filter(e ->
            e.getBlockId() == block.id && e.getGroupId() == groupId).toList(), VisionType.VISION_TYPE_REMOVE);


        SceneGroup group = block.groups.get(groupId);
        if (group.triggers != null) {
            group.triggers.values().forEach(getScriptManager()::deregisterTrigger);
        }
        if (group.regions != null) {
            group.regions.values().forEach(getScriptManager()::deregisterRegion);
        }

        this.loadedGroups.remove(group);
        broadcastPacket(new PacketGroupUnloadNotify(List.of(groupId)));
        scriptManager.unregisterGroup(group);
    }

    // Gadgets

    public void onPlayerCreateGadget(EntityClientGadget gadget) {
        // Directly add
        addEntityDirectly(gadget);

        // Add to owner's gadget list
        gadget.getOwner().getTeamManager().getGadgets().add(gadget);

        // Optimization
        if (this.players.stream().anyMatch(p -> p != gadget.getOwner())) { // if there is other players in scene
            broadcastPacketToOthers(gadget.getOwner(), new PacketSceneEntityAppearNotify(gadget));
        }
    }

    public void onPlayerDestroyGadget(int entityId) {
        if (!(this.entities.get(entityId) instanceof EntityClientGadget gadget)) return;

        // Get and remove entity
        removeEntityDirectly(gadget);

        // Remove from owner's gadget list
        gadget.getOwner().getTeamManager().getGadgets().remove(gadget);

        // Optimization
        if (this.players.stream().anyMatch(p -> p != gadget.getOwner())) { // if there is other players in scene
            broadcastPacketToOthers(gadget.getOwner(), new PacketSceneEntityDisappearNotify(gadget, VisionType.VISION_TYPE_DIE));
        }
    }

    // Broadcasting

    /**
     * Send packets to all players in world
     */
    public void broadcastPacket(BasePacket packet) {
        // Send to all players - might have to check if player has been sent data packets
        broadcastPacketToOthers(null, packet);
    }

    /**
     * Send packets to all players in world excluding one, which normally is the owner
     */
    public void broadcastPacketToOthers(Player excludedPlayer, BasePacket packet) {
        this.players.stream().filter(p -> p != excludedPlayer).forEach(p -> p.sendPacket(packet));
    }

    public void addItemEntity(int itemId, int amount, GameEntity bornForm) {
        val itemData = GameData.getItemDataMap().get(itemId);
        if (itemData == null) return;

        if (itemData.isEquip()) {
            val range = (1.5f + (.05f * amount));
            for (int i = 0; i < amount; i++) {
                val pos = bornForm.getPosition().nearby2d(range).addZ(.9f);  // Why Z?
                addEntity(new EntityItem(this, null, itemData, pos, 1));
            }
        } else {
            addEntity(new EntityItem(this, null, itemData, bornForm.getPosition().clone().addZ(.9f), amount));
        }
    }

    public void loadNpcForPlayerEnter(Player player) {
        this.npcBornEntrySet.addAll(loadNpcForPlayer(player));
    }

    private List<SceneNpcBornEntry> loadNpcForPlayer(Player player) {
        val pos = player.getPosition();
        val data = GameData.getSceneNpcBornData().get(getId());
        if (data == null) return List.of();

        val npcList = SceneIndexManager.queryNeighbors(data.getIndex(), pos.toDoubleArray(),
            Grasscutter.getConfig().server.game.loadEntitiesForPlayerRange);

        val sceneNpcBornEntries = npcList.stream().filter(i -> !this.npcBornEntrySet.contains(i)).toList();

        if (!sceneNpcBornEntries.isEmpty()) {
            broadcastPacket(new PacketGroupSuiteNotify(sceneNpcBornEntries));
            Grasscutter.getLogger().debug("Loaded Npc Group Suite {}", sceneNpcBornEntries);
        }
        return npcList;
    }

    public void loadGroupForQuest(List<QuestGroupSuite> sceneGroupSuite) {
        if (!this.scriptManager.isInit()) return;

        sceneGroupSuite.forEach(i -> {
            var group = scriptManager.getGroupById(i.getGroup());
            if (group == null) return;
            var groupInstance = scriptManager.getGroupInstanceById(i.getGroup());
            var suite = group.getSuiteByIndex(i.getSuite());
            if (suite == null || groupInstance == null) return;
            scriptManager.refreshGroup(groupInstance, i.getSuite(), false);
        });
    }

    public void unlockForce(int force) {
        unlockedForces.add(force);
        broadcastPacket(new PacketSceneForceUnlockNotify(force, true));
    }

    public void lockForce(int force) {
        unlockedForces.remove(force);
        broadcastPacket(new PacketSceneForceLockNotify(force));
    }

    public void selectWorktopOptionWith(SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq req) {
        GameEntity entity = getEntityById(req.getGadgetEntityId());
        if (entity == null) return;
        // Handle
        if (entity instanceof EntityGadget gadget && gadget.getContent() instanceof GadgetWorktop worktop) {
            boolean shouldDelete = worktop.onSelectWorktopOption(req);
            if (shouldDelete) entity.getScene().removeEntity(entity, VisionType.VISION_TYPE_REMOVE);
        }
    }

    public void saveGroups() {
        this.scriptManager.getCachedGroupInstances().values().forEach(SceneGroupInstance::save);
    }
}
