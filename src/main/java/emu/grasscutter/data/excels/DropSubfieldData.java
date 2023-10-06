package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.data.ResourceType.LoadPriority;
import lombok.Getter;

@ResourceType(name = {"DropSubfieldExcelConfigData.json"}, loadPriority = LoadPriority.HIGH)
@Getter
public class DropSubfieldData extends GameResource {
    private int subfieldId;
    private int levelLimit;
    private int dropId;

    @Override
    public int getId() {
        return subfieldId;
    }
}
