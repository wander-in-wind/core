package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_WORKTOP_SELECT;

@QuestValueContent(QUEST_CONTENT_WORKTOP_SELECT)
public class ContentWorktopSelect extends BaseContent {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        return condition.getParam()[0] == params[0] || condition.getParam()[1] == params[1];
    }
}
