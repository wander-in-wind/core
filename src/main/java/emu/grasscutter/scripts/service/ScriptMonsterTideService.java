package emu.grasscutter.scripts.service;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.entity.EntityMonster;
import emu.grasscutter.scripts.SceneScriptManager;
import emu.grasscutter.scripts.constants.EventType;
import emu.grasscutter.scripts.data.SceneGroup;
import emu.grasscutter.scripts.data.SceneMonster;
import emu.grasscutter.scripts.data.ScriptArgs;
import emu.grasscutter.scripts.listener.ScriptMonsterListener;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ScriptMonsterTideService {
    private final SceneScriptManager sceneScriptManager;
    private final SceneGroup currentGroup;
    private final AtomicInteger monsterAlive;
    private final AtomicInteger monsterTotalCount;
    private final AtomicInteger monsterKillCount;
    private final int tideIndex;
    private final int stageLimitMin;
    private final int stageLimitMax;
    private final ConcurrentLinkedQueue<Integer> monsterConfigOrders;
    private final List<Integer> monsterConfigIds;
    private final OnMonsterCreated onMonsterCreated = new OnMonsterCreated();
    private final OnMonsterDead onMonsterDead = new OnMonsterDead();

    public ScriptMonsterTideService(SceneScriptManager sceneScriptManager, int tideIndex, SceneGroup group, Integer[] monsterConfigIds, int totalCount, int stageLimitMin, int stageLimitMax) {
        this.sceneScriptManager = sceneScriptManager;
        this.currentGroup = group;
        this.tideIndex = tideIndex;
        this.stageLimitMin = stageLimitMin;
        this.stageLimitMax = stageLimitMax;
        this.monsterTotalCount = new AtomicInteger(totalCount);
        this.monsterKillCount = new AtomicInteger(0);
        this.monsterAlive = new AtomicInteger(0);
        this.monsterConfigOrders = new ConcurrentLinkedQueue<>(List.of(monsterConfigIds));
        this.monsterConfigIds = List.of(monsterConfigIds);

        this.sceneScriptManager.getScriptMonsterSpawnService().addMonsterCreatedListener(onMonsterCreated);
        this.sceneScriptManager.getScriptMonsterSpawnService().addMonsterDeadListener(onMonsterDead);
        // spawn the first turn
        for (int i = 0; i < this.stageLimitMin; i++) {
            sceneScriptManager.addEntity(this.sceneScriptManager.createMonster(group.id, group.block_id, getNextMonster()));
        }
    }

    public SceneMonster getNextMonster() {
        var nextId = this.monsterConfigOrders.poll();
        if (currentGroup.monsters.containsKey(nextId)) {
            return currentGroup.monsters.get(nextId);
        }
        // TODO some monster config_id do not exist in groups, so temporarily set it to the first
        Grasscutter.getLogger().warn("monster config_id {} not found in group {}", nextId, currentGroup.id);
        return currentGroup.monsters.values().stream().findFirst().orElse(null);
    }

    public class OnMonsterCreated implements ScriptMonsterListener {
        @Override
        public void onNotify(EntityMonster sceneMonster) {
            if (monsterConfigIds.contains(sceneMonster.getConfigId()) && stageLimitMin > 0) {
                monsterAlive.incrementAndGet();
                monsterTotalCount.decrementAndGet();
            }
        }
    }

    public class OnMonsterDead implements ScriptMonsterListener {
        @Override
        public void onNotify(EntityMonster sceneMonster) {
            //Notice: number of monsters alive should be between stageLimitMin and stageLimitMax
            //TODO: even there is no monster dead, we should also spawn the next one after a certain time, but keep the number of the monsters alive less than stageLimitMax

            monsterKillCount.incrementAndGet();
            if (monsterAlive.decrementAndGet() < stageLimitMin && monsterTotalCount.get() > 0) {
                // add more
                sceneScriptManager.addEntity(sceneScriptManager.createMonster(currentGroup.id, currentGroup.block_id, getNextMonster()));
                return;
            }
            if (monsterTotalCount.get() <= 0) {
                sceneScriptManager.callEvent(new ScriptArgs(currentGroup.id, EventType.EVENT_MONSTER_TIDE_DIE, monsterKillCount.get()).setEventSource(String.valueOf(tideIndex)));
            }
        }

    }

    public void unload(){
        this.sceneScriptManager.getScriptMonsterSpawnService().removeMonsterCreatedListener(onMonsterCreated);
        this.sceneScriptManager.getScriptMonsterSpawnService().removeMonsterDeadListener(onMonsterDead);
    }
}
