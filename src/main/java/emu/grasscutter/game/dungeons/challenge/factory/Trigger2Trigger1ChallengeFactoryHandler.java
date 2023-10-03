package emu.grasscutter.game.dungeons.challenge.factory;

import emu.grasscutter.game.dungeons.challenge.ChallengeInfo;
import emu.grasscutter.game.dungeons.challenge.ChallengeScoreInfo;
import emu.grasscutter.game.dungeons.challenge.WorldChallenge;
import emu.grasscutter.game.dungeons.challenge.enums.ChallengeType;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.scripts.data.SceneGroup;

import java.util.List;

import static emu.grasscutter.game.dungeons.challenge.enums.ChallengeType.CHALLENGE_TRIGGER2_AVOID_TRIGGER1;

/**
 * TODO
 */
@ChallengeTypeValue(type = CHALLENGE_TRIGGER2_AVOID_TRIGGER1)
public class Trigger2Trigger1ChallengeFactoryHandler extends ChallengeFactoryHandler {
    /**
     * Build a new challenge
     *
     * @param params: [platformGoalPoint, triggerTag2, triggerCount2, unused1, triggerTag1, triggerCount1]
     *                Start challenge with 666,203,{ 26,888,8,2,999,1 }
     */
    @Override
    public WorldChallenge build(ChallengeType type, ChallengeInfo header, List<Integer> params, ChallengeScoreInfo scoreInfo, Scene scene, SceneGroup group) {
        return new WorldChallenge(
            scene, group,
            header,
            List.of(), // parameters
            buildChallengeTrigger(List.of()),
            scoreInfo
        );
    }
}
