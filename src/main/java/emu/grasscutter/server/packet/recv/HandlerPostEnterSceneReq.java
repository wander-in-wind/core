package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.quest.enums.QuestContent;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketPostEnterSceneRsp;

@Opcodes(PacketOpcodes.PostEnterSceneReq)
public class HandlerPostEnterSceneReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var player = session.getPlayer();
        var sceneId = player.getSceneId();
        var scene = player.getScene();
        var questManager = player.getQuestManager();

        switch (scene.getSceneType()) {
            case SCENE_ROOM -> questManager.queueEvent(QuestContent.QUEST_CONTENT_ENTER_ROOM, sceneId, 0);
            case SCENE_WORLD -> {
                questManager.queueEvent(QuestContent.QUEST_CONTENT_ENTER_MY_WORLD, scene.getId());
                questManager.queueEvent(QuestContent.QUEST_CONTENT_ENTER_MY_WORLD_SCENE, scene.getId());
            }
            case SCENE_DUNGEON -> {
                var dungeonManager = scene.getDungeonManager();
                if (dungeonManager != null) dungeonManager.startDungeon();
            }
        }

        if (scene.getPrevScene() != sceneId) {
            questManager.queueEvent(QuestContent.QUEST_CONTENT_LEAVE_SCENE, scene.getPrevScene());
        }


        session.send(new PacketPostEnterSceneRsp(player));
    }
}
