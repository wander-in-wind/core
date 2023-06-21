package emu.grasscutter.game.quest.content;

import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;
import emu.grasscutter.data.common.quest.SubQuestData.QuestContentCondition;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_ENTER_MY_WORLD;

@QuestValueContent(QUEST_CONTENT_ENTER_MY_WORLD)
public class ContentEnterMyWorld extends BaseContent {
    // params[0] scene ID
    @Override
    public boolean execute(GameQuest quest, QuestContentCondition condition, String paramStr, int... params) {
        //Sometimes `condition.getParam()` is empty, this often happens in dungeon quests and quest should fail if player enters big world
        //So trigger by default
        int sceneId = condition.getParam(0);
        if (sceneId == 0) return true;
        return sceneId == params[0];
    }

}
