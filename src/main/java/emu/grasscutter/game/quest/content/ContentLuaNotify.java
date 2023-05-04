package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_LUA_NOTIFY;

@QuestValueContent(QUEST_CONTENT_LUA_NOTIFY)
public class ContentLuaNotify extends BaseContent {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        return condition.getParamStr().equals(paramStr);
    }

}
