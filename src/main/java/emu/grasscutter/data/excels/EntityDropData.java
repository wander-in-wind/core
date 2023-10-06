package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.data.ResourceType.LoadPriority;
import lombok.Getter;

@ResourceType(name = {"EntityDropExcelConfigData.json"}, loadPriority = LoadPriority.HIGH)
@Getter
public class EntityDropData extends GameResource {
    private int entityId;
    private DropSubfieldEntry[] subfields;

    @Override
    public int getId() {
        return entityId;
    }

    @Getter
    public static class DropSubfieldEntry {
        private String subfieldName;
        private int subfieldId;
    }
}
