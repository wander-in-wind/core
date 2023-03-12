package emu.grasscutter.data.binout;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigGadgetAbility {
    private String abilityID;
    private String abilityName;
    private String abilityOverride;
}
