package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_COMPLETE_TALK;

@QuestValueContent(QUEST_CONTENT_COMPLETE_TALK)
public class ContentCompleteTalk extends BaseContent {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        val talkId = condition.getParam()[0];
        val checkMainQuest = quest.getOwner().getQuestManager().getMainQuestByTalkId(talkId);
        if (checkMainQuest == null) {
            return false;
        }

        val talkData = checkMainQuest.getTalks().get(talkId);
        return talkData != null;
    }
}
