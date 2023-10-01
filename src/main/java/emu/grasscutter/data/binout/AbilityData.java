package emu.grasscutter.data.binout;

import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.game.ability.AbilityLocalIdGenerator;
import emu.grasscutter.game.ability.AbilityLocalIdGenerator.ConfigAbilitySubContainerType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AbilityData {
    public String abilityName;
    public Map<String, AbilityModifier> modifiers;
    public boolean isDynamicAbility;
    public Map<String, Float> abilitySpecials;
    public AbilityModifierAction[] onAdded;
    public AbilityModifierAction[] onRemoved;
    public AbilityModifierAction[] onAbilityStart;
    public AbilityModifierAction[] onKill;
    public AbilityModifierAction[] onFieldEnter;
    public AbilityModifierAction[] onExit;
    public AbilityModifierAction[] onAttach;
    public AbilityModifierAction[] onDetach;
    public AbilityModifierAction[] onAvatarIn;
    public AbilityModifierAction[] onAvatarOut;
    public AbilityModifierAction[] onTriggerAvatarRay;
    public AbilityModifierAction[] onVehicleIn;
    public AbilityModifierAction[] onVehicleOut;
    // abilityMixins
    public AbilityMixinData[] abilityMixins;

    public final Map<Integer, AbilityModifierAction> localIdToAction = new HashMap<>();
    public final Map<Integer, AbilityMixinData> localIdToMixin = new HashMap<>();

    private boolean _initialized = false;
    public void initialize() {
        if(_initialized) return;
        _initialized = true;

        initializeMixins();
        initializeModifiers();
        initializeActions();
    }

    private void initializeActions() {
        AbilityLocalIdGenerator generator = new AbilityLocalIdGenerator(ConfigAbilitySubContainerType.ACTION);
        generator.ConfigIndex = 0;

        generator.InitializeActionLocalIds(onAdded, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onRemoved, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onAbilityStart, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onKill, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onFieldEnter, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onExit, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onAttach, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onDetach, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onAvatarIn, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onAvatarOut, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onTriggerAvatarRay, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onVehicleIn, localIdToAction);
        generator.ConfigIndex++;
        generator.InitializeActionLocalIds(onVehicleOut, localIdToAction);
    }

    private void initializeMixins() {
        if (abilityMixins != null) {
            AbilityLocalIdGenerator generator = new AbilityLocalIdGenerator(ConfigAbilitySubContainerType.MIXIN);
            generator.ModifierIndex = 0;
            generator.ConfigIndex = 0;

            generator.InitializeMixinsLocalIds(abilityMixins, localIdToMixin);
        }
    }

    private void initializeModifiers() {
        if(modifiers == null) return;

        List<AbilityModifier> _modifiers = modifiers.entrySet().stream()
            .sorted(Map.Entry.comparingByKey()).map(entry -> entry.getValue()).collect(Collectors.toList());
        long modifierIndex = 0;
        for (int i = 0; i < _modifiers.size(); i++) {
            long configIndex = 0L;
            var modifier = _modifiers.get(i);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onAdded, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onRemoved, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onBeingHit, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onAttackLanded, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onHittingOther, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onThinkInterval, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onKill, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onCrash, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onAvatarIn, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onAvatarOut, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onReconnect, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onChangeAuthority, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onVehicleIn, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onVehicleOut, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onZoneEnter, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onZoneExit, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onHeal, localIdToAction);
            initializeActionSubCategory(modifierIndex, configIndex++, modifier.onBeingHealed, localIdToAction);

            if (modifier.modifierMixins != null) {
                AbilityLocalIdGenerator generator = new AbilityLocalIdGenerator(ConfigAbilitySubContainerType.MODIFIER_MIXIN);
                generator.ModifierIndex = modifierIndex;
                generator.ConfigIndex = 0;

                generator.InitializeMixinsLocalIds(modifier.modifierMixins, localIdToMixin);
            }

            modifierIndex++;
        }
    }

    private void initializeActionSubCategory(long modifierIndex, long configIndex, AbilityModifierAction[] actions, Map<Integer, AbilityModifierAction> localIdToAction) {
        if(actions == null) return;

        AbilityLocalIdGenerator generator = new AbilityLocalIdGenerator(ConfigAbilitySubContainerType.MODIFIER_ACTION);
        generator.ModifierIndex = modifierIndex;
        generator.ConfigIndex = configIndex;

        generator.InitializeActionLocalIds(actions, localIdToAction);
    }
}
