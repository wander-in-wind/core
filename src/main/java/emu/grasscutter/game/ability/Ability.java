package emu.grasscutter.game.ability;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.binout.AbilityData;
import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Ability {
    @Getter private final AbilityData data;
    @Getter private final GameEntity owner;
    @Getter private final Player playerOwner;

    @Getter private final AbilityManager manager;

    @Getter private final Map<String, AbilityModifierController> modifiers = new HashMap<>();
    @Getter private final Object2FloatMap<String> abilitySpecials = new Object2FloatOpenHashMap<String>();

    @Getter private static final Map<String, Object2FloatMap<String>> abilitySpecialsModified = new HashMap<String, Object2FloatMap<String>>();

    @Getter private final int hash;

    public Ability(AbilityData data, GameEntity owner, Player playerOwner) {
        this.data = data;
        this.owner = owner;
        this.manager = owner.getWorld().getHost().getAbilityManager();
        if (this.data.abilitySpecials != null)
            for (var entry : this.data.abilitySpecials.entrySet())
                abilitySpecials.put(entry.getKey(), entry.getValue().floatValue());
        //if(abilitySpecialsModified.containsKey(this.data.abilityName)) {//Modify talent data
        //    abilitySpecials.putAll(abilitySpecialsModified.get(this.data.abilityName));
        //}

        this.playerOwner = playerOwner;

        hash = AbilityHash(data.abilityName);

        data.initialize();
    }

    public static int AbilityHash(String str)
    {
        long hash = 0;
        char[] asCharArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
        {
            hash = ((asCharArray[i] + 131 * hash) & 0xFFFFFFFFL);
        }
        return (int)hash;
    }

    public static String getAbilityName(AbilityString abString) {
        if (abString.hasStr()) return abString.getStr();
        if (abString.hasHash()) return GameData.getAbilityHashes().get(abString.getHash());

        return null;
    }
}
