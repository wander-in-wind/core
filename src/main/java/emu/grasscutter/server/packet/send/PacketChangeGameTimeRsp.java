package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp;

public class PacketChangeGameTimeRsp extends BasePacket {

	public PacketChangeGameTimeRsp(Player player, int extraDays) {
		super(PacketOpcodes.ChangeGameTimeRsp);

		ChangeGameTimeRsp proto = ChangeGameTimeRsp.newBuilder()
				.setCurGameTime(player.getWorld().getGameTime())
                .setExtraDays(extraDays)
				.build();

		this.setData(proto);
	}
}
