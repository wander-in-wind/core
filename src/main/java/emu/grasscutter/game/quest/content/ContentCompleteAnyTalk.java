package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;
import lombok.val;

import java.util.Arrays;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_COMPLETE_ANY_TALK;

@QuestValueContent(QUEST_CONTENT_COMPLETE_ANY_TALK)
public class ContentCompleteAnyTalk extends BaseContent {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        val talkId = params[0];
        val conditionTalk = Arrays.stream(condition.getParamStr().split(","))
            .mapToInt(Integer::parseInt)
            .toArray();
        return Arrays.stream(conditionTalk).anyMatch(tids -> tids == talkId)
            || Arrays.stream(conditionTalk).anyMatch(tids -> {
            val checkMainQuest = quest.getOwner().getQuestManager().getMainQuestByTalkId(tids);
            if (checkMainQuest == null) {
                return false;
            }
            val talkData = checkMainQuest.getTalks().get(talkId);
            return talkData != null;
        });
    }

}
