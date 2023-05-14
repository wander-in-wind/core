package emu.grasscutter.game.entity.interfaces;

import emu.grasscutter.game.ability.AbilityManager;

import javax.annotation.Nullable;
import java.util.Collection;

public interface BaseAbilityEntity<T> {
    void initAbilities();

    @Nullable
    Collection<T> getAbilityData();

    AbilityManager getAbilityTargetManager();

}
