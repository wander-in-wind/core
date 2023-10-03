package emu.grasscutter.game.dungeons.challenge.trigger;

import emu.grasscutter.game.dungeons.challenge.WorldChallenge;
import emu.grasscutter.server.packet.send.PacketChallengeDataNotify;

public class TimeTrigger extends ChallengeTrigger {
    private final boolean RUN_FAIL;

    public TimeTrigger(int paramIndex, int goal) {
        this(paramIndex, goal, true);
    }

    /**
     * Used when challenge have time limit.
     * shouldFail == false represents formal 'ForTimeTrigger'
     * shouldFail == true represents formal 'InTimeTrigger'
     */
    public TimeTrigger(int paramIndex, int goal, boolean shouldFail) {
        super(paramIndex, goal);
        this.RUN_FAIL = shouldFail;
    }

    @Override
    public void onBegin(WorldChallenge challenge) {
        if (getParamIndex() < 1) return; // when challenge is FreezeInTime

        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(
            challenge, getParamIndex(), challenge.getStartedAt() + getGoal().get()));
    }

    @Override
    public void onCheckTimeout(WorldChallenge challenge) {
        if (challenge.getScene().getSceneTimeSeconds() - challenge.getStartedAt() < getGoal().get()) return;

        if (getParamIndex() < 1) { // when challenge is FreezeInTime
            challenge.resetFreezeTime();
            return;
        }

        if (this.RUN_FAIL) challenge.fail();
        else challenge.done();
    }
}
