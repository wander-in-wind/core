package emu.grasscutter.game.dungeons.challenge.factory;

import emu.grasscutter.game.dungeons.challenge.ChallengeInfo;
import emu.grasscutter.game.dungeons.challenge.ChallengeScoreInfo;
import emu.grasscutter.game.dungeons.challenge.WorldChallenge;
import emu.grasscutter.game.dungeons.challenge.enums.ChallengeType;
import emu.grasscutter.game.dungeons.challenge.trigger.DamageCountTrigger;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.scripts.data.SceneGroup;

import java.util.List;

import static emu.grasscutter.game.dungeons.challenge.enums.ChallengeType.CHALLENGE_MONSTER_DAMAGE_COUNT;
import static emu.grasscutter.game.dungeons.challenge.enums.ChallengeType.CHALLENGE_SHEILD_ABSORB_DAMAGE_COUNT;

@ChallengeTypeValue(type = {CHALLENGE_MONSTER_DAMAGE_COUNT, CHALLENGE_SHEILD_ABSORB_DAMAGE_COUNT})
public class MonsterOrShieldDamageCountChallengeFactoryHandler extends ChallengeFactoryHandler {
    /**
     * Build a new challenge
     *
     * @param params: [damageCount or absorbDamage, unused1, unused2, unused3]
     */
    @Override
    public WorldChallenge build(ChallengeType type, ChallengeInfo header, List<Integer> params, ChallengeScoreInfo scoreInfo, Scene scene, SceneGroup group) {
        return new WorldChallenge(
            scene, group,
            header,
            List.of(params.get(0)), // parameters
            buildChallengeTrigger(List.of(new DamageCountTrigger(1, params.get(0)))),
            scoreInfo
        );
    }
}
