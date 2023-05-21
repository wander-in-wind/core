package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.data.binout.quest.SubQuestData;
import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.QuestValueCond;
import emu.grasscutter.game.quest.enums.QuestCond;
import lombok.val;

@QuestValueCond(QuestCond.QUEST_COND_OPEN_STATE_EQUAL)
public class ConditionOpenStateEqual extends BaseCondition {

    @Override
    public boolean execute(Player owner, SubQuestData questData, QuestData.QuestAcceptCondition condition, String paramStr, int... params) {
        val openStateId = condition.getParam()[0];
        val requiredState = condition.getParam()[1];
        return owner.getProgressManager().getOpenState(openStateId) == requiredState;
    }

}
