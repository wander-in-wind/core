package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.tower.TowerFloorRecordInfo;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.TowerFloorRecordChangeNotifyOuterClass.TowerFloorRecordChangeNotify;

import java.util.List;

public class PacketTowerFloorRecordChangeNotify extends BasePacket {

    public PacketTowerFloorRecordChangeNotify(List<TowerFloorRecordInfo> infoS, boolean canEnterScheduleFloor) {
        super(PacketOpcodes.TowerFloorRecordChangeNotify);

        this.setData(TowerFloorRecordChangeNotify.newBuilder()
            .addAllTowerFloorRecordList(infoS.stream().map(TowerFloorRecordInfo::toProto).toList())
            .setIsFinishedEntranceFloor(canEnterScheduleFloor)
            .build());
    }
}
