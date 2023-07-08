package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.entity.EntityGadget;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.game.quest.enums.QuestContent;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq;
import emu.grasscutter.scripts.constants.EventType;
import emu.grasscutter.scripts.data.ScriptArgs;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketSelectWorktopOptionRsp;

@Opcodes(PacketOpcodes.SelectWorktopOptionReq)
public class HandlerSelectWorktopOptionReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SelectWorktopOptionReq req = SelectWorktopOptionReq.parseFrom(payload);

        try {
            GameEntity entity = session.getPlayer().getScene().getEntityById(req.getGadgetEntityId());

            if (!(entity instanceof EntityGadget)) {
                return;
            }
            //Call legacy worktop handler, now only used by legacy blossom system, maybe we can deprecate it later
            session.getPlayer().getScene().selectWorktopOptionWith(req);
            //Call script-based worktop handler
            session.getPlayer().getScene().getScriptManager().callEvent(
                    new ScriptArgs(entity.getGroupId(), EventType.EVENT_SELECT_OPTION, entity.getConfigId(), req.getOptionId())
            );
            session.getPlayer().getQuestManager().queueEvent(QuestContent.QUEST_CONTENT_WORKTOP_SELECT, entity.getConfigId(), req.getOptionId());
        } finally {
            // Always send packet
            session.send(new PacketSelectWorktopOptionRsp(req.getGadgetEntityId(), req.getOptionId()));
        }
    }

}
