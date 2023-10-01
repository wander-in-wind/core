package emu.grasscutter.data.excels;

import dev.morphia.annotations.Transient;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.data.common.FightPropData;
import emu.grasscutter.data.common.ItemParamData;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@ResourceType(name = "ProudSkillExcelConfigData.json")
public class ProudSkillData extends GameResource {
    private int proudSkillId;
    @Getter private int proudSkillGroupId;
    @Getter private int level;
    @Getter private int coinCost;
    @Getter private int breakLevel;
    @Getter private int proudSkillType;
    @Getter private String openConfig;
    @Getter private List<ItemParamData> costItems;
    @Getter private List<String> filterConds;
    @Getter private List<String> lifeEffectParams;
    @Getter private FightPropData[] addProps;
    @Getter private float[] paramList;
    @Getter private long[] paramDescList;
    @Getter private long nameTextMapHash;
    @Transient private Iterable<ItemParamData> totalCostItems;

    @Transient @Getter private final Object2FloatMap<String> paramListMap = new Object2FloatOpenHashMap<String>();

    @Override
    public int getId() {
        return proudSkillId;
    }

    public Iterable<ItemParamData> getTotalCostItems() {
        if (this.totalCostItems == null) {
            ArrayList<ItemParamData> total = (this.costItems != null) ? new ArrayList<>(this.costItems) : new ArrayList<>(1);
            if (this.coinCost > 0)
                total.add(new ItemParamData(202, this.coinCost));
            this.totalCostItems = total;
        }
        return this.totalCostItems;
    }

    @Override
    public void onLoad() {
        // Fight props
        ArrayList<FightPropData> parsed = new ArrayList<FightPropData>(getAddProps().length);
        for (FightPropData prop : getAddProps()) {
            if (prop.getPropType() != null && prop.getValue() != 0f) {
                prop.onLoad();
                parsed.add(prop);
            }
        }
        this.addProps = parsed.toArray(new FightPropData[parsed.size()]);

        for (int i = 0; i < paramList.length; i++) {
            paramListMap.put(Integer.toString(i + 1), paramList[i]);
        }
    }
}
