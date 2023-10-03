package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq;
import emu.grasscutter.server.game.GameSession;
import lombok.val;

@Opcodes(PacketOpcodes.TowerEnterLevelReq)
public class HandlerTowerEnterLevelReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        val req = TowerEnterLevelReq.parseFrom(payload);

        session.getPlayer().getTowerManager().enterLevel(req.getEnterPointId());
    }
}
