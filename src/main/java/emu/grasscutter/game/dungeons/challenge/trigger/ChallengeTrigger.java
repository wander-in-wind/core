package emu.grasscutter.game.dungeons.challenge.trigger;

import emu.grasscutter.game.dungeons.challenge.WorldChallenge;
import emu.grasscutter.game.entity.EntityGadget;
import emu.grasscutter.game.entity.EntityMonster;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.game.props.ElementReactionType;
import emu.grasscutter.scripts.data.SceneTrigger;
import emu.grasscutter.server.packet.send.PacketChallengeDataNotify;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
public abstract class ChallengeTrigger {
    private final int paramIndex;
    private final AtomicInteger score = new AtomicInteger(0);
    private final AtomicInteger goal;

    public ChallengeTrigger(int paramIndex, int goal) {
        this.paramIndex = paramIndex;
        this.goal = new AtomicInteger(goal);
    }

    /**
     * Trigger start action, sends PacketChallengeDataNotify
     */
    public void onBegin(WorldChallenge challenge) {
        if (this.paramIndex < 1) return;

        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(challenge, this.paramIndex, this.score.get()));
    }

    /**
     * Trigger when monster died
     */
    public void onMonsterDeath(WorldChallenge challenge, EntityMonster monster){}

    /**
     * Trigger constantly to check if challenge progress exceeds time limit
     */
    public void onCheckTimeout(WorldChallenge challenge){}

    /**
     * Trigger when damaging gadget
     */
    public void onGadgetDamage(WorldChallenge challenge, EntityGadget gadget){}

    /**
     * Trigger when interact with gadget, i.e. kill barrels, slime balloons etc.
     */
    public void onGroupTrigger(WorldChallenge challenge, SceneTrigger trigger){}

    /**
     * Trigger when an elemental reaction occurred
     */
    public void onElementReaction(WorldChallenge challenge, GameEntity defender, ElementReactionType reactionType) {}

    /**
     * Trigger when damaging monster or player's shield
     */
    public void onDamageMonsterOrShield(WorldChallenge challenge, float damage) {}

    /**
     * Trigger when child challenge finishes or fails
     */
    public void onIncFailSuccScore(WorldChallenge challenge, boolean useSucc, int score) {}
}
