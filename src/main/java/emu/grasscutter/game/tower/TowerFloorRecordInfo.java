package emu.grasscutter.game.tower;

import dev.morphia.annotations.Entity;
import emu.grasscutter.net.proto.TowerFloorRecordOuterClass;
import emu.grasscutter.net.proto.TowerLevelRecordOuterClass;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.Builder;
import lombok.Getter;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Getter
@Builder(builderMethodName = "of")
public class TowerFloorRecordInfo {
    /**
     * FloorId in config
     */
    private int floorId;
    /**
     * LevelId - Stars
     */
    private final Map<Integer, Integer> passedLevelMap = new Int2IntArrayMap();
    /**
     * Satisfied conditions to get stars
     * entry: [levelIndex from 0 to 2, passed cond]
     */
    private final Map<Integer, TowerLevelRecordInfo> passedLevelRecordMap = new Int2ObjectOpenHashMap<>();
    private final Set<Integer> receivedStarBounty = new HashSet<>();
    /**
     * Number of star bounty claimed
     */
    private int floorStarRewardProgress;

    public static TowerFloorRecordInfo create(int floorId) {
        return TowerFloorRecordInfo.of()
            .floorId(floorId)
            .build();
    }

    public int getStarCount() {
        return this.passedLevelMap.values().stream().mapToInt(Integer::intValue).sum();
    }

    public boolean update(int levelId, int levelIndex, int star) {
        int oldStarCount = this.passedLevelMap.getOrDefault(levelId, 0);
        if (oldStarCount >= star) return false;

        this.passedLevelMap.put(levelId, star);
        this.passedLevelRecordMap.computeIfAbsent(levelIndex - 1, f -> TowerLevelRecordInfo.create(levelId)).update(star);
        return true;
    }

    public void onGetReward(List<Integer> rewardIds) {
        this.receivedStarBounty.addAll(rewardIds);
        this.floorStarRewardProgress = this.receivedStarBounty.size();
    }

    public int getBestLevelIndex() {
        return this.passedLevelRecordMap.keySet().stream().mapToInt(Integer::intValue).map(key -> key + 1).max().orElse(0);
    }

    public TowerFloorRecordOuterClass.TowerFloorRecord toProto() {
        return TowerFloorRecordOuterClass.TowerFloorRecord.newBuilder()
            .setFloorId(this.floorId)
            .setFloorStarRewardProgress(this.floorStarRewardProgress)
            .putAllPassedLevelMap(this.passedLevelMap)
            .addAllPassedLevelRecordList(this.passedLevelRecordMap.values().stream()
                .map(TowerLevelRecordInfo::toProto)
                .sorted(Comparator.comparing(TowerLevelRecordOuterClass.TowerLevelRecord::getLevelId)).toList())
            .build();
    }
}
