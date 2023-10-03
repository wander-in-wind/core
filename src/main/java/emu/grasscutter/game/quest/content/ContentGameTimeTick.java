package emu.grasscutter.game.quest.content;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.common.quest.SubQuestData;
import emu.grasscutter.data.common.quest.SubQuestData.QuestContentCondition;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestSystem;
import emu.grasscutter.game.quest.QuestValueContent;
import emu.grasscutter.game.quest.enums.QuestContent;
import lombok.val;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_GAME_TIME_TICK;

@QuestValueContent(QUEST_CONTENT_GAME_TIME_TICK)
public class ContentGameTimeTick extends BaseContent {

    @Override
    public boolean isEvent(SubQuestData questData, QuestContentCondition condition, QuestContent type, String paramStr, int... params) {
        return condition.getType() == type;
    }

    @Override
    public int initialCheck(GameQuest quest, SubQuestData questData, QuestContentCondition condition) {
        return isTimeMet(quest, condition) ? 1 : 0;
    }

    @Override
    public int updateProgress(GameQuest quest, int currentProgress, QuestContentCondition condition, String paramStr, int... params) {
        return isTimeMet(quest, condition) ? 1 : 0;
    }

    private boolean isTimeMet(GameQuest quest, QuestContentCondition condition) {
        if (condition.getParamString() == null) {
            QuestSystem.getLogger().error("Quest {} has no param string for QUEST_CONTENT_GAME_TIME_TICK!", quest.getSubQuestId());
            return false;
        }
        val daysSinceStart = quest.getOwner().getWorld().getTotalGameTimeDays() - quest.getStartGameDay();
        val currentHour = quest.getOwner().getWorld().getGameTimeHours();

        // params[0] is days since start, str is hours of day
        val range = condition.getParamString().split(",");
        val from = Integer.parseInt(range[0]);
        val to = Integer.parseInt(range[1]);

        val daysToPass = condition.getParam()[0];
        // if to is at the beginning of the day, we need to pass it one more time
        val daysMod = to < from && daysToPass > 0 && currentHour < to ? 1 : 0;

        val isTimeMet = from < to ? currentHour >= from && currentHour < to
            : currentHour < to || currentHour >= from;

        val isDaysSinceMet = daysSinceStart >= daysToPass + daysMod;

        return isTimeMet && isDaysSinceMet;
    }

}

