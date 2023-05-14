package emu.grasscutter.game.ability;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.binout.AbilityMixinData;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;

import java.util.Map;

public class AbilityLocalIdGenerator {
    public enum ConfigAbilitySubContainerType
    {
        NONE(0),
        ACTION(1),
        MIXIN(2),
        MODIFIER_ACTION(3),
        MODIFIER_MIXIN(4);

        public long value;

        ConfigAbilitySubContainerType(long value) {
            this.value = value;
        }
    }

    public ConfigAbilitySubContainerType type;
    public long ModifierIndex = 0;
    public long ConfigIndex = 0;
    public long MixinIndex = 0;
    private long ActionIndex = 0;

    public AbilityLocalIdGenerator(ConfigAbilitySubContainerType type)
    {
        this.type = type;
    }

    public void InitializeActionLocalIds(AbilityModifierAction[] actions, Map<Integer, AbilityModifierAction> localIdToAction)
    {
        InitializeActionLocalIds(actions, localIdToAction, false);
    }

    public void InitializeActionLocalIds(AbilityModifierAction[] actions, Map<Integer, AbilityModifierAction> localIdToAction, boolean preserveActionIndex) {
        if (actions == null) return;
        if (!preserveActionIndex) ActionIndex = 0;
        for (int i = 0; i < actions.length; i++)
        {
            ActionIndex++;
            long id = GetLocalId();
            localIdToAction.put((int)id, actions[i]);

            if (actions[i].actions != null) InitializeActionLocalIds(actions[i].actions, localIdToAction, true);
            else {
                if (actions[i].successActions != null)
                    InitializeActionLocalIds(actions[i].successActions, localIdToAction, true); //Need to check this specific order
                if (actions[i].failActions != null)
                    InitializeActionLocalIds(actions[i].failActions, localIdToAction, true);
            }
        }
        if (!preserveActionIndex) ActionIndex = 0;
    }

    public void InitializeMixinsLocalIds(AbilityMixinData[] mixins, Map<Integer, AbilityMixinData> localIdToAction) {
        if (mixins == null) return;
        MixinIndex = 0;
        for (int i = 0; i < mixins.length; i++) {
            long id = GetLocalId();
            localIdToAction.put((int) id, mixins[i]);

            MixinIndex++;
        }
        MixinIndex = 0;
    }

    public long GetLocalId()
    {
        switch (type)
        {
            case ACTION:
                return type.value + (ConfigIndex << 3) + (ActionIndex << 9);
            case MIXIN:
                return type.value + (MixinIndex << 3) + (ConfigIndex << 9) + (ActionIndex << 15);
            case MODIFIER_ACTION:
                return type.value + (ModifierIndex << 3) + (ConfigIndex << 9) + (ActionIndex << 15);
            case MODIFIER_MIXIN:
                return type.value + (ModifierIndex << 3) + (MixinIndex << 9) + (ConfigIndex << 15) + (ActionIndex << 21);
            case NONE:
                Grasscutter.getLogger().error("Ability local id generator using NONE type.");
                break;
        }

        return -1;
    }
}
