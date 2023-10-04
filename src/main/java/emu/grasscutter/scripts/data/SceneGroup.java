package emu.grasscutter.scripts.data;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.world.GroupReplacementData;
import emu.grasscutter.scripts.ScriptLoader;
import emu.grasscutter.scripts.lua_engine.LuaScript;
import emu.grasscutter.scripts.lua_engine.ScriptType;
import emu.grasscutter.utils.Position;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.val;

import java.util.*;
import java.util.stream.Collectors;

@ToString
@Setter
public class SceneGroup {
    public transient int block_id; // Not an actual variable in the scripts but we will keep it here for reference

    public int id;
    public int refresh_id;
    public Position pos;

    public Map<Integer,SceneMonster> monsters; // <ConfigId, Monster>
    public Map<Integer, SceneNPC> npcs; // <ConfigId, Npc>
    public Map<Integer, SceneGadget> gadgets; // <ConfigId, Gadgets>
    public Map<String, SceneTrigger> triggers;
    public Map<Integer, SceneRegion> regions;
    public List<SceneSuite> suites;
    public List<SceneVar> variables;

    public SceneBusiness business;
    public SceneGarbage garbages;
    public SceneInitConfig init_config;
    @Getter public boolean dynamic_load = false;

    public SceneReplaceable is_replaceable;

    private transient boolean loaded; // Not an actual variable in the scripts either
    private transient LuaScript script;
    //private transient Bindings bindings;
    public static SceneGroup of(int groupId) {
        var group = new SceneGroup();
        group.id = groupId;
        return group;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public int getBusinessType() {
        return this.business == null ? 0 : this.business.type;
    }

    public List<SceneGadget> getGarbageGadgets() {
        return this.garbages == null ? null : this.garbages.gadgets;
    }

    public LuaScript getScript() {
        return this.script;
    }

    public SceneSuite getSuiteByIndex(int index) {
        if(index < 1 || index > suites.size()) {
            return null;
        }
        return this.suites.get(index - 1);
    }

    public synchronized SceneGroup load(int sceneId) {
        if (this.loaded) {
            return this;
        }
        // Set flag here so if there is no script, we don't call this function over and over again.
        this.setLoaded(true);

        val cs = ScriptLoader.getScript("Scene/" + sceneId + "/scene" + sceneId + "_group" + this.id + ".lua", ScriptType.EXECUTABLE);

        if (cs == null) {
            return this;
        }

        this.script = cs;

        // Eval script
        try {
            cs.evaluate();

            // Set
            this.monsters = cs.getGlobalVariableList("monsters", SceneMonster.class).stream()
                    .collect(Collectors.toMap(x -> x.config_id, y -> y, (a, b) -> a));
            this.monsters.values().forEach(m -> m.group = this);

            this.npcs =  cs.getGlobalVariableList("npcs", SceneNPC.class).stream()
                    .collect(Collectors.toMap(x -> x.config_id, y -> y, (a, b) -> a));
            this.npcs.values().forEach(m -> m.group = this);

            this.gadgets = cs.getGlobalVariableList("gadgets", SceneGadget.class).stream()
                    .collect(Collectors.toMap(x -> x.config_id, y -> y, (a, b) -> a));
            this.gadgets.values().forEach(m -> m.group = this);

            this.triggers = cs.getGlobalVariableList("triggers", SceneTrigger.class).stream()
                    .collect(Collectors.toMap(SceneTrigger::getName, y -> y, (a, b) -> a));
            this.triggers.values().forEach(t -> t.currentGroup = this);

            this.suites = cs.getGlobalVariableList("suites", SceneSuite.class);
            this.regions = cs.getGlobalVariableList("regions", SceneRegion.class).stream()
                .collect(Collectors.toMap(x -> x.config_id, y -> y, (a, b) -> a));
            this.regions.values().forEach(m -> m.group = this);

            this.init_config = cs.getGlobalVariable("init_config", SceneInitConfig.class);

            // Garbages // TODO: fix properly later
            /*Object garbagesValue = this.bindings.get("garbages");
            if (garbagesValue instanceof LuaValue garbagesTable) {
                this.garbages = new SceneGarbage();
                if (garbagesTable.checktable().get("gadgets") != LuaValue.NIL) {
                    this.garbages.gadgets = ScriptLoader.getSerializer().toList(SceneGadget.class, garbagesTable.checktable().get("gadgets").checktable());
                    this.garbages.gadgets.forEach(m -> m.group = this);
                }
            }*/

            // Add variables to suite
            this.variables = cs.getGlobalVariableList("variables", SceneVar.class);

            // Add monsters and gadgets to suite
            this.suites.forEach(i -> i.init(this));

        } catch (Exception e) {
            Grasscutter.getLogger().error("An error occurred while loading group " + this.id + " in scene " + sceneId + ".", e);
        }

        Grasscutter.getLogger().debug("Successfully loaded group {} in scene {}.", this.id, sceneId);
        return this;
    }

    public int findInitSuiteIndex(int exclude_index) { //TODO: Investigate end index
        if(init_config == null) return 1;
        if(init_config.io_type == 1) return init_config.suite; //IO TYPE FLOW
        if(init_config.rand_suite) {
            if(suites.size() == 1) {
                return init_config.suite;
            } else {
                List<Integer> randSuiteList = new ArrayList<>();
                for(int i = 0; i < suites.size(); i++) {
                    if(i == exclude_index) continue;

                    var suite = suites.get(i);
                    for (int j = 0; j < suite.rand_weight; j++) randSuiteList.add(Integer.valueOf(i + 1));
                }
                return randSuiteList.get(new Random().nextInt(randSuiteList.size()));
            }
        }
        return init_config.suite;
    }

    public Optional<SceneBossChest> searchBossChestInGroup() {
        return this.gadgets.values().stream().map(g -> g.boss_chest).filter(Objects::nonNull)
            .filter(bossChest -> bossChest.monster_config_id > 0)
            .findFirst();
    }

    public List<SceneGroup> getReplaceableGroups(Collection<SceneGroup> loadedGroups) {
        return this.is_replaceable == null ? List.of() :
            Optional.ofNullable(GameData.getGroupReplacements().get(this.id)).stream()
                .map(GroupReplacementData::getReplace_groups)
                .flatMap(List::stream)
                .map(replacementId -> loadedGroups.stream().filter(g -> g.id == replacementId).findFirst())
                .filter(Optional::isPresent).map(Optional::get)
                .filter(replacementGroup -> replacementGroup.is_replaceable != null)
                .filter(replacementGroup -> (replacementGroup.is_replaceable.value
                                             && replacementGroup.is_replaceable.version <= this.is_replaceable.version)
                                            || replacementGroup.is_replaceable.new_bin_only)
                .toList();
    }
}
