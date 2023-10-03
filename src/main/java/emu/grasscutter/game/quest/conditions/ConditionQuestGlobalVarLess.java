package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.common.quest.SubQuestData;
import emu.grasscutter.data.common.quest.SubQuestData.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.QuestSystem;
import emu.grasscutter.game.quest.QuestValueCond;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestCond.QUEST_COND_QUEST_GLOBAL_VAR_LESS;

@QuestValueCond(QUEST_COND_QUEST_GLOBAL_VAR_LESS)
public class ConditionQuestGlobalVarLess extends BaseCondition {

    @Override
    public boolean execute(Player owner, SubQuestData questData, QuestAcceptCondition condition, String paramStr, int... params) {
        val questId = condition.getParam()[0];
        val maxValue = condition.getParam()[1];
        Integer questGlobalVarValue = owner.getQuestManager().getQuestGlobalVarValue(questId);
        QuestSystem.getLogger().debug("questGlobarVar {} {} : {}", questId, maxValue, questGlobalVarValue);
        return questGlobalVarValue < maxValue;
    }

}
