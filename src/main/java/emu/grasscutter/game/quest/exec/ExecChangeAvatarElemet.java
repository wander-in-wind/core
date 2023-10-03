package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.props.ElementType;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestSystem;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import emu.grasscutter.data.common.quest.SubQuestData.QuestExecParam;
import lombok.val;

/**
 * Changes the main avatar's element. First parameter is the elementType id
 */
@QuestValueExec(QuestExec.QUEST_EXEC_CHANGE_AVATAR_ELEMET)
public class ExecChangeAvatarElemet extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestExecParam condition, String... paramStr) {
        val targetElement = ElementType.getTypeByValue(Integer.parseInt(paramStr[0]));
        val owner = quest.getOwner();
        val mainAvatar = owner.getAvatars().getAvatarById(owner.getMainCharacterId());

        if(mainAvatar == null){
            QuestSystem.getLogger().error("Failed to get main avatar for use {}", quest.getOwner().getUid());
            return false;
        }

        QuestSystem.getLogger().info("Changing avatar element to {} for quest {}", targetElement.name(), quest.getSubQuestId());
        return mainAvatar.changeElement(targetElement);
    }
}
