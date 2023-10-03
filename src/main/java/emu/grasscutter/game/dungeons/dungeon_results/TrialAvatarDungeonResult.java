package emu.grasscutter.game.dungeons.dungeon_results;

import emu.grasscutter.data.excels.DungeonData;
import emu.grasscutter.game.dungeons.DungeonEndStats;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.proto.DungeonSettleNotifyOuterClass;
import emu.grasscutter.net.proto.TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify;
import lombok.Builder;

public class TrialAvatarDungeonResult extends BaseDungeonResult {
    int trialCharacterIndexId;

    @Builder(builderMethodName = "TrialAvatarBuilder", setterPrefix = "set")
    private TrialAvatarDungeonResult(DungeonData dungeonData, DungeonEndStats dungeonStats, Player player, int trialCharacterIndexId) {
        super(dungeonData, dungeonStats, player);
        this.trialCharacterIndexId = trialCharacterIndexId;
    }

    @Override
    protected void onProto(DungeonSettleNotifyOuterClass.DungeonSettleNotify.Builder builder) {
        if (getDungeonStats().dungeonResult() == DungeonEndReason.COMPLETED) { // TODO check if it's the first pass(?)
            builder.setTrialAvatarFirstPassDungeonNotify(TrialAvatarFirstPassDungeonNotify.newBuilder()
                .setTrialAvatarIndexId(this.trialCharacterIndexId));
        }
    }
}
