package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.data.common.BaseTrialAvatarTemplateData;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@ResourceType(name = "TrialAvatarTemplateExcelConfigData.json")
@EqualsAndHashCode(callSuper=false)
@Data
public class TrialAvatarTemplateData extends GameResource implements BaseTrialAvatarTemplateData {
    private int TrialAvatarLevel;
    private List<Integer> TrialReliquaryList;
    private int TrialAvatarSkillLevel;

    @Override
    public int getId() {
        return TrialAvatarLevel;
    }
}
