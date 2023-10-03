package emu.grasscutter.game.dungeons.challenge.factory;

import emu.grasscutter.game.dungeons.challenge.ChallengeInfo;
import emu.grasscutter.game.dungeons.challenge.ChallengeScoreInfo;
import emu.grasscutter.game.dungeons.challenge.WorldChallenge;
import emu.grasscutter.game.dungeons.challenge.enums.ChallengeType;
import emu.grasscutter.game.dungeons.challenge.trigger.KillMonsterTrigger;
import emu.grasscutter.game.dungeons.challenge.trigger.TimeTrigger;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.scripts.data.SceneGroup;
import lombok.val;

import java.util.List;

import static emu.grasscutter.game.dungeons.challenge.enums.ChallengeType.CHALLENGE_TIME_FLY;

@ChallengeTypeValue(type = CHALLENGE_TIME_FLY)
public class TimeFlyChallengeFactoryHandler extends ChallengeFactoryHandler {
    /**
     * Build a new challenge
     *
     * @param params: [groupId, monsterKillCount, timeLimit, incTimerCount]
     *                ActiveChallenge with 1, 195, 240610006, 6, 60, 60
     */
    @Override
    public WorldChallenge build(ChallengeType type, ChallengeInfo header, List<Integer> params, ChallengeScoreInfo scoreInfo, Scene scene, SceneGroup group) {
        val realGroup = scene.getScriptManager().getGroupById(params.get(0));
        return new WorldChallenge(
            scene, realGroup,
            header,
            List.of(params.get(1), params.get(2)), // parameters
            buildChallengeTrigger(List.of(new KillMonsterTrigger(1, params.get(1), params.get(3)), new TimeTrigger(2, params.get(2)))),
            scoreInfo
        );
    }
}
