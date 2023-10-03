package emu.grasscutter.game.dungeons.dungeon_results;

import emu.grasscutter.data.excels.DungeonData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.dungeons.DungeonEndStats;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.inventory.ItemType;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.proto.DungeonSettleNotifyOuterClass.DungeonSettleNotify;
import emu.grasscutter.net.proto.ParamListOuterClass.ParamList;
import emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData;
import emu.grasscutter.utils.Utils;
import lombok.Builder;
import lombok.Getter;
import lombok.val;

import java.util.*;
import java.util.stream.Collectors;

import static emu.grasscutter.game.dungeons.enums.DungeonInvolveType.INVOLVE_SINGLE_MULTIPLE;

/**
 * Shows dungeon results
 */
public class BaseDungeonResult {
    private final DungeonData dungeonData;
    @Getter private final DungeonEndStats dungeonStats;
    private final Player player;

    @Builder(builderMethodName = "BaseBuilder", setterPrefix = "set")
    protected BaseDungeonResult(DungeonData dungeonData, DungeonEndStats dungeonStats, Player player) {
        this.dungeonData = dungeonData;
        this.dungeonStats = dungeonStats;
        this.player = player;
    }

    /**
     * Could be different depending on dungeon types
     */
    protected void onProto(DungeonSettleNotify.Builder builder) {
    }

    /**
     * Show player's area to improve, not completed
     */
    private void getStrengthenPointData(DungeonSettleNotify.Builder builder) {
        if (this.dungeonStats.dungeonResult().isSuccess() ||
            this.dungeonData.getInvolveType() != INVOLVE_SINGLE_MULTIPLE) return;

        val playerActiveTeam = this.player.getTeamManager().getActiveTeam();
        builder.putAllStrengthenPointDataMap(Arrays.stream(StrengthenPointType.values()).collect(
            Collectors.toMap(StrengthenPointType::getValue, type -> switch (type) {
                case LEVEL -> StrengthenPointData.newBuilder()
                    .setBasePoint(playerActiveTeam.size() * 90)
                    .setCurPoint(playerActiveTeam.stream()
                        .map(EntityAvatar::getAvatar).map(Avatar::getLevel)
                        .reduce(0, Integer::sum))
                    .build();
                case WEAPON -> StrengthenPointData.newBuilder()
                    .setBasePoint(playerActiveTeam.size() * 90)
                    .setCurPoint(playerActiveTeam.stream()
                        .map(EntityAvatar::getAvatar).map(Avatar::getEquips)
                        .map(Map::values).flatMap(Collection::stream)
                        .filter(item -> item.getItemType() == ItemType.ITEM_WEAPON)
                        .map(GameItem::getLevel)
                        .reduce(0, Integer::sum))
                    .build();
                case TALENT -> StrengthenPointData.newBuilder()
                    .setBasePoint(100000).setCurPoint(50000).build();
                case ARTIFACT -> StrengthenPointData.newBuilder()
                    .setBasePoint(playerActiveTeam.size() * 20)
                    .setCurPoint(playerActiveTeam.stream()
                        .map(EntityAvatar::getAvatar).map(Avatar::getEquips)
                        .map(Map::values).flatMap(Collection::stream)
                        .filter(item -> item.getItemType() == ItemType.ITEM_RELIQUARY)
                        .map(GameItem::getLevel)
                        .reduce(0, Integer::sum))
                    .build();
            })));
    }

    public final DungeonSettleNotify.Builder getProto(){
        val success = this.dungeonStats.getDungeonResult().isSuccess();
        val builder = DungeonSettleNotify.newBuilder()
            .setUseTime(this.dungeonStats.getTimeTaken())
            .setDungeonId(this.dungeonData.getId())
            .setIsSuccess(success)
            .setCloseTime(getCloseTime())
            .setResult(success ? 1 : 3)
            .setCreatePlayerUid(this.player.getUid());

        // TODO check
        val tempSettleMap = new HashMap<Integer, ParamList.Builder>();
        Optional.ofNullable(this.dungeonData.getSettleShows()).stream()
            .flatMap(List::stream)
            .forEach(showType -> tempSettleMap.computeIfAbsent(showType.getId(), f -> ParamList.newBuilder())
                .addParamList(switch (showType) {
                    case SETTLE_SHOW_TIME_COST -> this.dungeonStats.getTimeTaken();
                    case SETTLE_SHOW_KILL_MONSTER_COUNT -> this.dungeonStats.getKilledMonsters();
                    case SETTLE_SHOW_OPEN_CHEST_COUNT -> this.dungeonStats.getOpenChestCount();
                    default -> 0;
                }));

        builder.putAllSettleShow(tempSettleMap.entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().build())));

        getStrengthenPointData(builder);
        onProto(builder);
        return builder;
    }

    private int getCloseTime() {
        return Utils.getCurrentSeconds() + switch (this.dungeonStats.getDungeonResult()) {
            case COMPLETED -> this.dungeonData.getSettleCountdownTime();
            case FAILED -> this.dungeonData.getFailSettleCountdownTime();
            case QUIT -> this.dungeonData.getQuitSettleCountdownTime();
        };
    }

    public enum DungeonEndReason{
        COMPLETED,
        FAILED,
        QUIT;

        public boolean isSuccess(){
            return this == COMPLETED;
        }
    }

    @Getter
    private enum StrengthenPointType {
        LEVEL(1),
        WEAPON(2),
        ARTIFACT(3),
        TALENT(4);

        private final int value;

        StrengthenPointType(int value) {
            this.value = value;
        }
    }
}
