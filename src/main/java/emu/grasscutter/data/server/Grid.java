package emu.grasscutter.data.server;

import java.util.*;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.utils.GridPosition;
import emu.grasscutter.utils.Position;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.val;

public class Grid {
    public Map<GridPosition, Set<Integer>> grid;

    public Int2ObjectMap<Int2ObjectMap<Set<Integer>>> gridOptimized;

    private HashSet<Integer> nearbyGroups = new HashSet<>(100);

    private void Optimize() {
        if(gridOptimized == null) {
            gridOptimized = new Int2ObjectOpenHashMap<>();
            grid.forEach((k, v) -> {
                int x = k.getX() & 0xFFFF;
                int z = k.getZ() & 0xFFFF;
                if(!gridOptimized.containsKey(x)) {
                    gridOptimized.put(x, new Int2ObjectOpenHashMap<>());
                    gridOptimized.get(x).put(z, v);
                } else {
                    val zG = gridOptimized.get(x);
                    if(!zG.containsKey(z)) {
                        zG.put(z, v);
                    } else {
                        zG.get(z).addAll(v);
                    }
                }
            });
        }
    }

    public Set<Integer> GetGroup(GridPosition pos) {
        int x = pos.getX() & 0xFFFF;
        int z = pos.getZ() & 0xFFFF;
        if(!gridOptimized.containsKey(x)) return new HashSet<>();
        val xG = gridOptimized.get(x);
        if(!xG.containsKey(z)) return new HashSet<>();
        return xG.get(z);
    }

    public Set<Integer> getNearbyGroups(int vision_level, Position position) {
        Optimize();

        int width = Grasscutter.getConfig().server.game.visionOptions[vision_level].gridWidth;
        int vision_range = Grasscutter.getConfig().server.game.visionOptions[vision_level].visionRange;
        int vision_range_grid = vision_range / width;

        GridPosition pos = new GridPosition(position, width);

        nearbyGroups.clear();
        //construct a nearby pisition list, add 1 more because a player can be in an edge case, this should not affect much the loading
        for(int x = 0; x < vision_range_grid + 1; x++) {
            for(int z = 0; z < vision_range_grid + 1; z++) {
                nearbyGroups.addAll(GetGroup(pos.addClone( x,  z)));
                nearbyGroups.addAll(GetGroup(pos.addClone(-x,  z)));
                nearbyGroups.addAll(GetGroup(pos.addClone( x, -z)));
                nearbyGroups.addAll(GetGroup(pos.addClone(-x, -z)));
                //nearbyGroups.addAll(grid.getOrDefault(pos.addClone( x,  z), new HashSet<>()));
                //nearbyGroups.addAll(grid.getOrDefault(pos.addClone(-x,  z), new HashSet<>()));
                //nearbyGroups.addAll(grid.getOrDefault(pos.addClone( x, -z), new HashSet<>()));
                //nearbyGroups.addAll(grid.getOrDefault(pos.addClone(-x, -z), new HashSet<>()));
            }
        }

        return nearbyGroups;
    }
}
