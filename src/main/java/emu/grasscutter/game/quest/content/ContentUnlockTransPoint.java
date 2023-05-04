package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_UNLOCK_TRANS_POINT;

@QuestValueContent(QUEST_CONTENT_UNLOCK_TRANS_POINT)
public class ContentUnlockTransPoint extends BaseContent {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        val sceneId = condition.getParam()[0];
        val scenePointId = condition.getParam()[1];
        val scenePoints = quest.getOwner().getUnlockedScenePoints().get(sceneId);
        return scenePoints != null && scenePoints.contains(scenePointId);
    }
}
