package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;

import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestSystem;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import emu.grasscutter.data.common.quest.SubQuestData.QuestExecParam;

@QuestValueExec(QuestExec.QUEST_EXEC_REMOVE_TRIAL_AVATAR)
public class ExecRemoveTrialAvatar extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestExecParam condition, String... paramStr) {
        if (quest.getOwner().removeTrialAvatarForQuest(Integer.parseInt(paramStr[0]))) {
            QuestSystem.getLogger().info("Removed trial avatar from team for quest {}", quest.getSubQuestId());
            return true;
        }
        return false;
    }
}
