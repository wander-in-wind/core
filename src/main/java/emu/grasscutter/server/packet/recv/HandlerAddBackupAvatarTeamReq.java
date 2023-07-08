package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketAddBackupAvatarTeamRsp;
import emu.grasscutter.server.packet.send.PacketAvatarTeamAllDataNotify;
import org.jetbrains.annotations.NotNull;

@Opcodes(PacketOpcodes.AddBackupAvatarTeamReq)
public class HandlerAddBackupAvatarTeamReq extends PacketHandler {
    @Override
    public void handle(@NotNull GameSession session, byte[] header, byte[] payload) throws Exception {
        boolean result = session.getPlayer().getTeamManager().addNewCustomTeam();
        // Send packets.
        if (result) {
            session.getPlayer().sendPacket(new PacketAvatarTeamAllDataNotify(session.getPlayer()));
        }
        session.getPlayer().sendPacket(new PacketAddBackupAvatarTeamRsp(result ? Retcode.RET_SUCC : Retcode.RET_FAIL));
    }
}
