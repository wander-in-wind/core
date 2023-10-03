package emu.grasscutter.game.managers.blossom;

import dev.morphia.annotations.Entity;
import emu.grasscutter.GameConstants;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.common.BaseBlossomROSData;
import emu.grasscutter.data.excels.BlossomChestData;
import emu.grasscutter.data.excels.BlossomGroupsData;
import emu.grasscutter.data.excels.BlossomRefreshData;
import emu.grasscutter.data.excels.CityData;
import emu.grasscutter.data.excels.WorldLevelData;
import emu.grasscutter.game.managers.blossom.enums.BlossomRefreshType;
import emu.grasscutter.net.proto.BlossomBriefInfoOuterClass.BlossomBriefInfo;
import emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo;
import emu.grasscutter.scripts.data.SceneGroup;
import emu.grasscutter.utils.Position;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.val;
import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Getter
@Builder(builderMethodName = "of", setterPrefix = "set")
@ToString
@Entity
public class BlossomSchedule implements BaseBlossomROSData {
    // brief info related
    private final int sceneId;
    private final int cityId;
    private final Position position;
    private final int resin;
    private final int monsterLevel;
    private final int rewardId;
    // both info related
    private final int circleCampId;
    private final int refreshId;
    @Setter private int state;
    // schedule info related
    private int progress;
    private int round;
    private final int finishProgress;
    private final Set<Integer> remainingUid = new HashSet<>();
    // gadget info related
    private final int groupId;
    private final int decorateGroupId;
    // extra
    private final BlossomRefreshType refreshType;
    private String lastCycledTime;

    /**
     * Builder function
     */
    public static BlossomSchedule create(@NotNull BaseBlossomROSData baseData, @NotNull BlossomGroupsData groupsData, int worldLevel) {
        final int sceneId = Optional.ofNullable(GameData.getCityDataMap().get(groupsData.getCityId())).map(CityData::getSceneId)
            .orElse(3);

        return Optional.ofNullable(SceneGroup.of(groupsData.getNewGroupId()).load(sceneId))
            .map(group -> group.gadgets)
            .map(Map::values)
            .stream().flatMap(Collection::stream)
            .filter(gadget -> gadget.gadget_id == baseData.getRefreshType().getGadgetId())
            .map(gadget -> BlossomSchedule.of()
                .setSceneId(sceneId)
                .setCityId(baseData.getCityId())
                .setPosition(gadget.pos)
                .setResin(getResinCost(baseData.getRefreshType()))
                .setMonsterLevel(getMonsterLevel(worldLevel))
                .setRewardId(baseData.getRewardId(worldLevel))
                .setCircleCampId(groupsData.getId())
                .setRefreshId(baseData.getRefreshId())
                .setFinishProgress(groupsData.getFinishProgress())
                .setGroupId(groupsData.getNewGroupId())
                .setDecorateGroupId(groupsData.getDecorateGroupId())
                .setRefreshType(baseData.getRefreshType())
                .setLastCycledTime(getLastRefreshTimeStr(baseData))
                .build())
            .findFirst().orElse(null);
    }

    // TODO move some these to utility class
    private static String getLastRefreshTimeStr(BaseBlossomROSData baseData) {
        return ZonedDateTime.now(GameConstants.ZONE_ID).with(getRefreshHour(baseData)).format(GameConstants.TIME_FORMATTER_FULL);
    }

    public ZonedDateTime getLastCycleZonedTime() {
        return toZonedDateTimeFull(this.lastCycledTime);
    }

    private static ZonedDateTime toZonedDateTimeFull(String timeStr) {
        return ZonedDateTime.parse(timeStr, GameConstants.TIME_FORMATTER_FULL.withZone(GameConstants.ZONE_ID));
    }

    protected LocalTime getRefreshHour() {
        return getRefreshHour(this);
    }

    static LocalTime getRefreshHour(BaseBlossomROSData baseData) {
        return Optional.ofNullable(GameData.getBlossomRefreshDataMap().get(baseData.getRefreshId()))
            .map(BlossomRefreshData::getRefreshTime).map(BlossomSchedule::getRefreshHour)
            .orElse(LocalTime.of(GameConstants.REFRESH_HOUR, 0, 0));
    }

    static LocalTime getRefreshHour(String timeStr) {
        return LocalTime.parse(timeStr, GameConstants.TIME_FORMATTER_TIME_ONLY);
    }

    boolean shouldReset() {
        return shouldReset(ZonedDateTime.now(GameConstants.ZONE_ID), getLastCycleZonedTime(), getRefreshHour());
    }

    private static boolean shouldReset(ZonedDateTime currentDateTime, ZonedDateTime lastRefreshDateTime, LocalTime refreshHour) {
        val todayRefreshHour = currentDateTime.with(refreshHour); // adjust time to get today's refresh time
        // if last refresh time equals to today's refresh time, then we should not reset
        return lastRefreshDateTime == null || !lastRefreshDateTime.isEqual(todayRefreshHour) || lastRefreshDateTime.isBefore(todayRefreshHour);
    }

    /**
     * Get resin cost of current blossom camp
     */
    private static int getResinCost(BlossomRefreshType refreshType) {
        return GameData.getBlossomChestDataMap().values().stream()
            .filter(c -> c.getBlossomRefreshType() == refreshType)
            .map(BlossomChestData::getResin)
            .findFirst().orElse(0);
    }

    /**
     * Get suitable monster level for player depending on his world level
     */
    private static int getMonsterLevel(int worldLevel) {
        return Optional.ofNullable(GameData.getWorldLevelDataMap().get(worldLevel))
            .map(WorldLevelData::getMonsterLevel)
            .orElse(26);
    }

    /**
     * Add blossom camp challenge progress (i.e. when monster die)
     */
    public void addProgress() {
        if (getProgress() < getFinishProgress()) {
            this.progress += 1;
        }
    }

    /**
     * Check if this blossom challenge has finished
     */
    public boolean isFinished() {
        return this.progress >= this.finishProgress;
    }

    /**
     * Works like challenge but blossom style
     */
    public BlossomScheduleInfo toScheduleProto() {
        return BlossomScheduleInfo.newBuilder()
            .setFinishProgress(this.finishProgress)
            .setRefreshId(this.refreshId)
            .setState(this.state)
            .setRound(this.round)
            .setCircleCampId(this.circleCampId)
            .setProgress(this.progress)
            .build();
    }

    /**
     * Blossom camp information, updates the map's icon, I think...
     */
    public BlossomBriefInfo toBriefProto() {
        return BlossomBriefInfo.newBuilder()
            .setSceneId(this.sceneId)
            .setCityId(this.cityId)
            .setPos(this.position.toProto())
            .setResin(this.resin)
            .setMonsterLevel(this.monsterLevel)
            .setRewardId(this.rewardId)
            .setCircleCampId(this.circleCampId)
            .setRefreshId(this.refreshId)
            .setState(this.state) // 0: loaded, 1: spawned, 2:started, 3: finished
            .build();
    }

    /**
     * Interface contract to cooperate with refresh data
     */
    @Override
    public int getRewardId(int worldLevel) {
        return this.rewardId;
    }
}
