package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import lombok.val;

import java.util.Arrays;

@QuestValueExec(QuestExec.QUEST_EXEC_SET_OPEN_STATE)
public class ExecSetOpenState extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        val param = Arrays.stream(paramStr)
            .filter(i -> !i.isBlank())
            .mapToInt(Integer::parseInt)
            .toArray();

        quest.getOwner().getProgressManager().forceSetOpenState(param[0], param[1]);
        return true;
    }
}
