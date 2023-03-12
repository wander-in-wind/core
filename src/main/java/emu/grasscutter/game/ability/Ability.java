package emu.grasscutter.game.ability;

import java.util.HashMap;
import java.util.Map;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.binout.AbilityData;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.data.common.DynamicFloat;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.server.event.entity.EntityDamageEvent;
import lombok.Getter;

public class Ability {
    @Getter private AbilityData data;
    @Getter private GameEntity owner;

    @Getter private Map<String, AbilityModifierController> modifiers = new HashMap<>();

    @Getter private int hash;

    public Ability(AbilityData data, GameEntity owner) {
        this.data = data;
        this.owner = owner;

        hash = AbilityHash(data.abilityName);

        data.initialize();
    }

    public void executeModifierAction(AbilityModifierAction action) {
        Grasscutter.getLogger().warn("{}: Action {}", data.abilityName, action.type);
        switch(action.type) {
            case ApplyModifier:
                {
                    var modifierData = data.modifiers.get(action.modifierName);
                    if(modifierData == null) {
                        Grasscutter.getLogger().debug("Modifier {} not found", action.modifierName);
                        return;
                    }

                    if(modifierData.stacking != null && modifierData.stacking.compareTo("Unique") == 0 &&
                        modifiers.values().stream().filter(m -> m.getData().equals(modifierData)).count() != 0) {
                        return;
                    }

                    AbilityModifierController modifier = new AbilityModifierController(this, modifierData);
                    modifiers.put(action.modifierName, modifier);
                    modifier.onAdded();

                    if(modifierData.duration != DynamicFloat.ZERO) {
                        Grasscutter.getGameServer().getScheduler().scheduleAsyncTask(() -> {
                            try {
                                Thread.sleep((int)(modifierData.duration.get() * 1000));
                                modifier.onRemoved();
                            } catch (InterruptedException e) {

                            }
                        });
                    }
                }
                break;
            case ExecuteGadgetLua:
                if(owner.getEntityController() != null)
                    owner.getEntityController().onClientExecuteRequest(owner, action.param1, action.param2, action.param3);
                break;
            case KillSelf:
                owner.getScene().killEntity(owner);
                break;
            default:
                Grasscutter.getLogger().debug("Unimplemented action {}", action.type);
                break;
        }
    }

    public void onAdded() {
        if(data.onAdded == null) return;

        for (AbilityModifierAction action : data.onAdded) {
            executeModifierAction(action);
        }
    }

    public void onRemoved() {
        Map<String, AbilityModifierController> tempModifiers = new HashMap<>(modifiers);
        tempModifiers.values().forEach(m -> m.onRemoved());
    }

    public void onBeingHit(EntityDamageEvent event) {
        Map<String, AbilityModifierController> tempModifiers = new HashMap<>(modifiers);
        tempModifiers.values().forEach(m -> m.onBeingHit(event));
    }

    public static int AbilityHash(String str)
    {
        long hash = 0;
        char[] asCharArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
        {
            hash = ((asCharArray[i] + 131 * hash) & 0xFFFFFFFF) >> 0;
        }
        return (int)hash;
    }
}
