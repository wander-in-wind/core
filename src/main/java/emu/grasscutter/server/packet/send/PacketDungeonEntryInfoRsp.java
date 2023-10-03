package emu.grasscutter.server.packet.send;

import emu.grasscutter.data.common.PointData;
import emu.grasscutter.data.excels.DungeonData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo;
import emu.grasscutter.net.proto.DungeonEntryInfoRspOuterClass.DungeonEntryInfoRsp;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import lombok.val;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PacketDungeonEntryInfoRsp extends BasePacket {
    public PacketDungeonEntryInfoRsp(Player player, int sceneId, int pointId) {
        super(PacketOpcodes.DungeonEntryInfoRsp);

        val proto =
            DungeonEntryInfoRsp.newBuilder().setPointId(pointId);
        val entries = player.getDungeonEntryManager().getDungeonEntries(sceneId, pointId);
        proto.addAllDungeonEntryList(entries.stream().map(player.getDungeonEntryManager()::toProto).toList());

        entries.stream().min(Comparator.comparingInt(data -> Math.abs(data.getLimitLevel() - player.getLevel())))
            .map(DungeonData::getId).ifPresent(proto::setRecommendDungeonId);

        this.setData(proto.setRetcode(!entries.isEmpty() ? Retcode.RET_SUCC_VALUE : Retcode.RET_FAIL_VALUE));
    }
    /**
     * Used in conjunction with quest-related dungeons.
     *
     * @param pointData The data associated with the dungeon.
     * @param additional A collection of additional quest-related dungeon IDs.
     */
    public PacketDungeonEntryInfoRsp(PointData pointData, List<Integer> additional) {
        super(PacketOpcodes.DungeonEntryInfoRsp);

        var packet = DungeonEntryInfoRsp.newBuilder()
            .setPointId(pointData.getId());

        // Add dungeon IDs from the point data.
        if (pointData.getDungeonIds() != null) {
            Arrays.stream(pointData.getDungeonIds())
                .forEach(id -> packet.addDungeonEntryList(
                    DungeonEntryInfo.newBuilder().setDungeonId(id)));
        }

        // Add additional dungeon IDs.
        additional.forEach(id -> packet.addDungeonEntryList(
            DungeonEntryInfo.newBuilder().setDungeonId(id)));

        this.setData(packet);
    }

    public PacketDungeonEntryInfoRsp() {
        super(PacketOpcodes.DungeonEntryInfoRsp);

        DungeonEntryInfoRsp proto = DungeonEntryInfoRsp.newBuilder().setRetcode(1).build();

        this.setData(proto);
    }
}
