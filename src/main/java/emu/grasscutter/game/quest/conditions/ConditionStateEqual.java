package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.data.common.quest.SubQuestData;
import emu.grasscutter.data.common.quest.SubQuestData.QuestAcceptCondition;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestSystem;
import emu.grasscutter.game.quest.QuestValueCond;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestCond.QUEST_COND_STATE_EQUAL;

@QuestValueCond(QUEST_COND_STATE_EQUAL)
public class ConditionStateEqual extends BaseCondition {

    @Override
    public boolean execute(Player owner, SubQuestData questData, QuestAcceptCondition condition, String paramStr, int... params) {
        val questId = condition.getParam()[0];
        val questStateValue = condition.getParam()[1];
        GameQuest checkQuest = owner.getQuestManager().getQuestById(questId);
        return checkQuest != null && checkQuest.getState().getValue() == questStateValue;
    }

}
