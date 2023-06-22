package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.common.quest.SubQuestData.QuestExecParam;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_DEL_PACK_ITEM)
public class ExecDelPackItem extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestExecParam condition, String... paramStr) {
        int itemId = Integer.parseInt(paramStr[0]);
        int amount = Integer.parseInt(paramStr[1]);
        return quest.getOwner().getInventory().removeItem(new GameItem(itemId), amount);
    }
}
