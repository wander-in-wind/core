package emu.grasscutter.scripts.data;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.scripts.ScriptLoader;
import emu.grasscutter.scripts.lua_engine.LuaScript;
import emu.grasscutter.scripts.lua_engine.ScriptType;
import lombok.Setter;
import lombok.ToString;
import lombok.val;

import javax.script.ScriptException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ToString
@Setter
public class SceneMeta {

    public SceneConfig config;
    public Map<Integer, SceneBlock> blocks;
    public Map<Integer, SceneGroup> groups;

    public LuaScript context;

    public static SceneMeta of(int sceneId) {
        return new SceneMeta().load(sceneId);
    }

    public SceneMeta load(int sceneId) {
        // Get compiled script if cached
        val cs = ScriptLoader.getScript("Scene/" + sceneId + "/scene" + sceneId + ".lua", ScriptType.DATA_STORAGE);

        if (cs == null) {
            Grasscutter.getLogger().warn("No script found for scene " + sceneId);
            return null;
        }

        // Eval script
        try {
            cs.evaluate();

            this.config = cs.getGlobalVariable("scene_config", SceneConfig.class);

            // TODO optimize later
            // Create blocks
            List<Integer> blockIds = cs.getGlobalVariableList("blocks", Integer.class);
            List<SceneBlock> blocks = cs.getGlobalVariableList("block_rects", SceneBlock.class);

            for (int i = 0; i < blocks.size(); i++) {
                SceneBlock block = blocks.get(i);
                block.id = blockIds.get(i);
            }

            this.blocks = blocks.stream().collect(Collectors.toMap(b -> b.id, b -> b, (a, b) -> a));

            //load all blocks
            this.groups = new HashMap<>();
            for (var block : this.blocks.values()) {
                block.load(sceneId);
                groups.putAll(block.groups);
            }

        } catch (ScriptException exception) {
            Grasscutter.getLogger().error("An error occurred while running a script.", exception);
            return null;
        }
        Grasscutter.getLogger().debug("Successfully loaded metadata in scene {}.", sceneId);
        return this;
    }
}
