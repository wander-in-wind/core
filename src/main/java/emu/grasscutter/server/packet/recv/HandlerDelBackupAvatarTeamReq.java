package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.DelBackupAvatarTeamReqOuterClass.DelBackupAvatarTeamReq;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketAvatarTeamAllDataNotify;
import emu.grasscutter.server.packet.send.PacketDelBackupAvatarTeamRsp;
import org.jetbrains.annotations.NotNull;

@Opcodes(PacketOpcodes.DelBackupAvatarTeamReq)
public class HandlerDelBackupAvatarTeamReq extends PacketHandler {
    @Override
    public void handle(@NotNull GameSession session, byte[] header, byte[] payload) throws Exception {
        DelBackupAvatarTeamReq req = DelBackupAvatarTeamReq.parseFrom(payload);
        int teamId = req.getBackupAvatarTeamId();
        boolean result = session.getPlayer().getTeamManager().removeCustomTeam(teamId);

        // Send packets.
        if (result) {
            session.getPlayer().sendPacket(new PacketAvatarTeamAllDataNotify(session.getPlayer()));
        }
        session.getPlayer().sendPacket(new PacketDelBackupAvatarTeamRsp(
            result ? Retcode.RET_SUCC : Retcode.RET_FAIL,
            teamId));
    }
}
