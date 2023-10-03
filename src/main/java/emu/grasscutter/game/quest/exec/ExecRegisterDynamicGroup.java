package emu.grasscutter.game.quest.exec;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestGroupSuite;
import emu.grasscutter.game.quest.QuestSystem;
import emu.grasscutter.game.quest.QuestValueExec;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import emu.grasscutter.data.common.quest.SubQuestData.QuestExecParam;
import emu.grasscutter.game.world.Scene;

@QuestValueExec(QuestExec.QUEST_EXEC_REGISTER_DYNAMIC_GROUP)
public class ExecRegisterDynamicGroup extends QuestExecHandler {

    @Override
    public boolean execute(GameQuest quest, QuestExecParam condition, String... paramStr) {
        var sceneId = Integer.parseInt(paramStr[0]);
        var groupId = Integer.parseInt(paramStr[1]);

        QuestSystem.getLogger().info("Registering group {}", groupId);

        Scene scene = quest.getOwner().getWorld().getSceneById(sceneId);
        if(scene == null) return false;

        int suiteId = scene.loadDynamicGroup(groupId);
        if(suiteId == -1) return false;

        quest.getMainQuest().getQuestGroupSuites().add(QuestGroupSuite.of()
            .scene(sceneId)
            .group(groupId)
            .suite(suiteId)
            .build());

        QuestSystem.getLogger().debug("Registered group {}, suite {} in scene {}", groupId, suiteId, scene.getId());

        return true;
    }

}
