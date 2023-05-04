package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_REFRESH_GROUP_MONSTER)
public class ExecRefreshGroupMonster extends QuestExecHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var groupId = Integer.parseInt(paramStr[0]);

        return quest.getOwner().getScene().getScriptManager().refreshGroupMonster(groupId);
    }

}
