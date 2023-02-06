package emu.grasscutter.game.dungeons;

import emu.grasscutter.net.proto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DungeonTrialTeam {
    List<Integer> trialAvatarIds;
    TrialAvatarGrantRecord.GrantReason grantReason;
}
