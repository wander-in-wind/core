package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.common.quest.SubQuestData.QuestExecParam;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_DEL_PACK_ITEM_BATCH)
public class ExecDelPackItemBatch extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestExecParam condition, String... paramStr) {
        // input is like this: "100497:999,100498:999,100499:999"
        var items = paramStr[0].split(",");
        boolean success = true;
        for (var itemString : items){
            var itemFields = itemString.split(":");
            var itemId = Integer.parseInt(itemFields[0]);
            var amount = Integer.parseInt(itemFields[1]);
            if (!quest.getOwner().getInventory().removeItem(new GameItem(itemId), amount)) {
                success = false;
            }
        }
        return success;
    }
}
