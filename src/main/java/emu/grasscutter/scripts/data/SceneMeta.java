package emu.grasscutter.scripts.data;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.scripts.ScriptLoader;
import lombok.Setter;
import lombok.ToString;

import javax.script.Bindings;
import javax.script.CompiledScript;
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

    public Bindings context;

    public static SceneMeta of(int sceneId) {
        return new SceneMeta().load(sceneId);
    }

    public SceneMeta load(int sceneId) {
        // Get compiled script if cached
        CompiledScript cs = ScriptLoader.getScript("Scene/" + sceneId + "/scene" + sceneId + ".lua");

        if (cs == null) {
            Grasscutter.getLogger().warn("No script found for scene " + sceneId);
            return null;
        }

        // Create bindings
        this.context = ScriptLoader.getEngine().createBindings();

        // Eval script
        try {
            cs.eval(this.context);

            this.config = ScriptLoader.getSerializer().toObject(SceneConfig.class, this.context.get("scene_config"));

            // TODO optimize later
            // Create blocks
            List<Integer> blockIds = ScriptLoader.getSerializer().toList(Integer.class, this.context.get("blocks"));
            List<SceneBlock> blocks = ScriptLoader.getSerializer().toList(SceneBlock.class, this.context.get("block_rects"));

            for (int i = 0; i < blocks.size(); i++) {
                SceneBlock block = blocks.get(i);
                block.id = blockIds.get(i);
            }

            this.blocks = blocks.stream().collect(Collectors.toMap(b -> b.id, b -> b, (a, b) -> a));

            //load all blocks
            this.groups = new HashMap<>();
            for (var block : this.blocks.values()) {
                block.load(sceneId, this.context);
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
