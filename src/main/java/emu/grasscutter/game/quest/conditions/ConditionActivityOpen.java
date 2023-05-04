package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.QuestValueCond;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestCond.QUEST_COND_ACTIVITY_OPEN;

@QuestValueCond(QUEST_COND_ACTIVITY_OPEN)
public class ConditionActivityOpen extends BaseCondition {

    @Override
    public boolean execute(Player owner, QuestData questData, QuestData.QuestAcceptCondition condition, String paramStr, int... params) {
        val activityId = condition.getParam()[0];
        return owner.getActivityManager().isActivityActive(activityId);
    }

}
