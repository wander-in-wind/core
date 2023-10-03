package emu.grasscutter.game.dungeons.dungeon_entry;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.binout.ScenePointEntry;
import emu.grasscutter.data.common.PointData;
import emu.grasscutter.data.common.quest.SubQuestData;
import emu.grasscutter.data.excels.DungeonData;
import emu.grasscutter.data.excels.DungeonRosterData;
import emu.grasscutter.data.excels.DungeonSerialData;
import emu.grasscutter.game.player.BasePlayerManager;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameMainQuest;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.enums.QuestContent;
import emu.grasscutter.game.quest.enums.QuestState;
import emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo;
import emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.NonNull;
import lombok.val;

import java.util.*;
import java.util.stream.Stream;

/**
 * TODO sync resin usage with statue drops
 */
public class DungeonEntryManager extends BasePlayerManager {
    /**
     * entry: [(sceneId << 16) + pointId, dungeonId]
     */
    private final Map<Integer, List<Integer>> plotDungeonEntries = new Int2ObjectOpenHashMap<>();

    public DungeonEntryManager(@NonNull Player player) {
        super(player);
    }

    private DungeonEntryItem getDungeonEntryItem() {
        return this.player.getDungeonEntryItem();
    }

    private Map<Integer, WeeklyBossRecord> getBossRecordMap() {
        return Optional.ofNullable(getDungeonEntryItem()).map(DungeonEntryItem::getBossRecordMap).orElse(Map.of());
    }

    public void onLogin() {
        // check if player needs quest dungeon entry
        this.player.getQuestManager().getMainQuests().values().stream()
            .map(GameMainQuest::getChildQuests).map(Map::values).flatMap(Collection::stream)
            .filter(quest -> quest.getState() == QuestState.QUEST_STATE_UNFINISHED)
            .map(GameQuest::getQuestData).map(SubQuestData::getFinishCond).flatMap(List::stream)
            .filter(cond -> cond.getType() == QuestContent.QUEST_CONTENT_ENTER_DUNGEON)
            .map(cond -> GameData.getDungeonEntriesMap().get(cond.getParam()[0]))
            .forEach(entries -> this.plotDungeonEntries.computeIfAbsent(
                entries.getEntryKey(), f -> new ArrayList<>()).add(entries.getDungeonId()));

        // builds weekly boss information if its missing
        getDungeonEntryItem().checkForNewBoss();
        getDungeonEntryItem().buildRosterDungeon();
        getDungeonEntryItem().resetWeeklyBoss();
    }

    public DungeonEntryInfo toProto(DungeonData data) {
        val proto = DungeonEntryInfo.newBuilder();
        Optional.ofNullable(GameData.getDungeonSerialDataMap().get(data.getSerialId()))
            .map(DungeonSerialData::getId).map(getBossRecordMap()::get)
            .ifPresent(bossRecord -> proto.setWeeklyBossResinDiscountInfo(bossRecord.toProto())
                .setBossChestNum(bossRecord.getTakeNum())
                .setMaxBossChestNum(bossRecord.getMaxTakeNumLimit())
                .setNextRefreshTime(bossRecord.getNextRefreshTime()));

        return proto.setDungeonId(data.getId())
            .setIsPassed(getDungeonEntryItem().getPassedDungeons().contains(data.getId()))
            .build();
    }

    /**
     * Record weekly boss information after completing dungeon
     */
    public void updateDungeonEntryInfo(DungeonData dungeonData) {
        getDungeonEntryItem().addDungeon(dungeonData.getId());
        getDungeonEntryItem().updateWeeklyBossInfo(dungeonData.getSerialId());
    }

    public List<Integer> getPlotDungeonById(int sceneId, int pointId) {
        return this.plotDungeonEntries.get((sceneId << 16) + pointId);
    }

    public WeeklyBossResinDiscountInfo getWeeklyBossDiscountInfo(DungeonData dungeonData) {
        return Optional.ofNullable(getBossRecordMap().get(dungeonData.getSerialId()))
            .filter(WeeklyBossRecord::canTakeReward).map(WeeklyBossRecord::toProto)
            .orElse(null);
    }

    /**
     * Get dungeon information for specific entries
     */
    public List<DungeonData> getDungeonEntries(int sceneId, int pointId) {
        // basic dungeon entries including daily domains and weekly bosses, not including Azhdaha here
        val basicDungeons = Optional.ofNullable(GameData.getScenePointEntryById(sceneId, pointId))
            .map(ScenePointEntry::getPointData).map(PointData::getDungeonIds).stream().parallel()
            .flatMapToInt(Arrays::stream).mapToObj(GameData.getDungeonDataMap()::get)
            .filter(Objects::nonNull).toList();

        // quest entries
        val plotDungeons = Optional.ofNullable(getPlotDungeonById(sceneId, pointId)).stream().parallel()
            .flatMap(List::stream).map(dungeonId -> GameData.getDungeonDataMap().get(dungeonId.intValue()))
            .filter(Objects::nonNull).toList();

        // dungeon that will rotate regularly, like Azhdaha weekly boss
        val rosterDungeons = Optional.ofNullable(GameData.getScenePointEntryById(sceneId, pointId))
            .map(ScenePointEntry::getPointData).map(PointData::getDungeonRosterList).stream().parallel()
            .flatMapToInt(Arrays::stream).mapToObj(GameData.getDungeonRosterDataMap()::get).filter(Objects::nonNull)
            .map(rosterData -> getBossRecordMap().values().stream().parallel().map(WeeklyBossRecord::getRosterCycleRecord)
                .filter(Objects::nonNull).map(RosterCycleRecord::getSelectedPool)
                .map(rosterData.getRosterPool()::get).filter(Objects::nonNull).toList())
            .flatMap(List::stream).map(DungeonRosterData.RosterPool::getDungeonList).flatMapToInt(Arrays::stream)
            .mapToObj(GameData.getDungeonDataMap()::get).toList();

        return Stream.of(basicDungeons, plotDungeons, rosterDungeons).flatMap(Collection::stream)
            .filter(data -> this.player.getLevel() >= data.getLimitLevel())
            .filter(data -> data.getId() != 69) // TODO, this dungeon is causing problem, find out why
            .toList();
    }
}
