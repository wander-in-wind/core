package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.common.quest.SubQuestData;
import emu.grasscutter.data.common.quest.SubQuestData.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.QuestSystem;
import emu.grasscutter.game.quest.QuestValueCond;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestCond.QUEST_COND_COMPLETE_TALK;

@QuestValueCond(QUEST_COND_COMPLETE_TALK)
public class ConditionCompleteTalk extends BaseCondition {

    @Override
    public boolean execute(Player owner, SubQuestData questData, QuestAcceptCondition condition, String paramStr, int... params) {
        val requiredTalkId = condition.getParam()[0];
        val unknownParam = condition.getParam()[1]; // e.g. 3 for 7081601
        val eventTalkId = params[0];

        if(requiredTalkId == eventTalkId) {
            return true;
        }

        val checkMainQuest = owner.getQuestManager().getMainQuestByTalkId(requiredTalkId);
        if (checkMainQuest == null || GameData.getMainQuestDataMap().get(checkMainQuest.getParentQuestId()).getTalks() == null) {
            QuestSystem.getLogger().debug("Warning: mainQuest {} hasn't been started yet, or has no talks", requiredTalkId / 100);
            return false;
        }
        val talkData = checkMainQuest.getTalks().get(requiredTalkId);
        return talkData != null || checkMainQuest.getChildQuestById(requiredTalkId) != null;
    }

}
