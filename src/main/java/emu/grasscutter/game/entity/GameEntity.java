package emu.grasscutter.game.entity;

import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.ability.AbilityModifierController;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.*;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.game.world.SpawnDataEntry;
import emu.grasscutter.game.world.World;
import emu.grasscutter.net.proto.FightPropPairOuterClass.FightPropPair;
import emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo;
import emu.grasscutter.net.proto.MotionStateOuterClass.MotionState;
import emu.grasscutter.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import emu.grasscutter.net.proto.VectorOuterClass.Vector;
import emu.grasscutter.scripts.data.controller.EntityController;
import emu.grasscutter.server.event.entity.EntityDamageEvent;
import emu.grasscutter.server.event.entity.EntityDeathEvent;
import emu.grasscutter.server.packet.send.PacketEntityFightPropUpdateNotify;
import emu.grasscutter.utils.Position;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

import javax.annotation.Nullable;
import java.util.*;

public abstract class GameEntity {
    @Getter private final Scene scene;
    @Getter protected int id;
    @Getter @Setter private SpawnDataEntry spawnEntry;

    @Getter @Setter private int blockId;
    @Getter @Setter private int configId;
    @Getter @Setter private int groupId;

    @Getter @Setter private MotionState motionState;
    @Getter @Setter private int lastMoveSceneTimeMs;
    @Getter @Setter private int lastMoveReliableSeq;

    @Getter @Setter private boolean lockHP;

    @Getter protected Set<Player> owners;

    // Lua controller for specific actions
    @Getter @Setter private EntityController entityController;
    @Getter private ElementType lastAttackType = ElementType.None;

    @Getter private final List<Ability> instancedAbilities = new ArrayList<>();
    @Getter private final Int2ObjectMap<AbilityModifierController> instancedModifiers = new Int2ObjectOpenHashMap<>();
    @Getter private final Map<String, Float> globalAbilityValues = new HashMap<>();

    public GameEntity(Scene scene) {
        this.scene = scene;
        this.motionState = MotionState.MOTION_STATE_NONE;
    }

    public EntityType getEntityType() {
        return EntityIdType.fromEntityId(this.getId()).getType();
    }

    public abstract int getEntityTypeId();

    public World getWorld() {
        return this.getScene().getWorld();
    }

    public boolean isAlive() {
        return true;
    }

    public LifeState getLifeState() {
        return this.isAlive() ? LifeState.LIFE_ALIVE : LifeState.LIFE_DEAD;
    }

    @Nullable
    public abstract Int2FloatMap getFightProperties();

    public Optional<Int2FloatMap> getFightPropertiesOpt() {
        return Optional.ofNullable(this.getFightProperties());
    }

    public abstract Position getPosition();

    public abstract Position getRotation();

    public void setFightProperty(FightProperty prop, float value) {
        this.setFightProperty(prop.getId(), value);
    }

    public void setFightProperty(int id, float value) {
        this.getFightPropertiesOpt().ifPresent(
            props -> props.put(id, value)
        );
    }

    public void addFightProperty(FightProperty prop, float value) {
        this.getFightPropertiesOpt().ifPresent(
            props -> props.put(prop.getId(), props.getOrDefault(prop.getId(), 0f) + value)
        );
    }

    public float getFightProperty(FightProperty prop) {
        val props = this.getFightProperties();
        if (props == null) return 0f;
        return props.get(prop.getId());
    }

    public boolean hasFightProperty(FightProperty prop) {
        val props = this.getFightProperties();
        if (props == null) return false;
        return props.containsKey(prop.getId());
    }

    public void addAllFightPropsToEntityInfo(SceneEntityInfo.Builder entityInfo) {
        this.getFightPropertiesOpt().ifPresent(map -> {
            map.forEach((key, value) -> {
                if (key == 0) return;
                entityInfo.addFightPropList(FightPropPair.newBuilder().setPropType(key).setPropValue(value).build());
            });
        });
    }

    protected MotionInfo getMotionInfo() {
        MotionInfo proto = MotionInfo.newBuilder()
            .setPos(this.getPosition().toProto())
            .setRot(this.getRotation().toProto())
            .setSpeed(Vector.newBuilder())
            .setState(this.getMotionState())
            .build();

        return proto;
    }

    public float heal(float amount) {
        return heal(amount, false);
    }

    public float heal(float amount, boolean mute) {
        if (this.getFightProperties() == null) {
            return 0f;
        }

        float curHp = this.getFightProperty(FightProperty.FIGHT_PROP_CUR_HP);
        float maxHp = this.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP);

        if (curHp >= maxHp) {
            return 0f;
        }

        float healed = Math.min(maxHp - curHp, amount);
        this.addFightProperty(FightProperty.FIGHT_PROP_CUR_HP, healed);

        this.getScene().broadcastPacket(new PacketEntityFightPropUpdateNotify(this, FightProperty.FIGHT_PROP_CUR_HP));

        return healed;
    }

    public void damage(float amount) {
        this.damage(amount, 0, ElementType.None);
    }

    public void damage(float amount, ElementType attackType) {
        this.damage(amount, 0, attackType);
    }

    public void damage(float amount, int killerId, ElementType attackType) {
        // Check if the entity has properties.
        if (!hasFightProperty(FightProperty.FIGHT_PROP_CUR_HP)) {
            return;
        }

        // Invoke entity damage event.
        EntityDamageEvent event = new EntityDamageEvent(this, amount, attackType, this.getScene().getEntityById(killerId));
        event.call();
        if (event.isCanceled()) {
            return; // If the event is canceled, do not damage the entity.
        }

        float curHp = getFightProperty(FightProperty.FIGHT_PROP_CUR_HP);
        if (curHp != Float.POSITIVE_INFINITY && !lockHP || lockHP && curHp <= event.getDamage()) {
            // Add negative HP to the current HP property.
            this.addFightProperty(FightProperty.FIGHT_PROP_CUR_HP, -(event.getDamage()));
        }

        this.lastAttackType = attackType;

        // Check if dead
        boolean isDead = false;
        if (this.getFightProperty(FightProperty.FIGHT_PROP_CUR_HP) <= 0f) {
            this.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP, 0f);
            isDead = true;
        }
        callLuaHPEvent(event);
        callAbilityBeHurt(event);

        // Packets
        this.getScene().broadcastPacket(new PacketEntityFightPropUpdateNotify(this, FightProperty.FIGHT_PROP_CUR_HP));

        // Check if dead.
        if (isDead) {
            this.getScene().killEntity(this, killerId);
        }
    }

    public void callLuaHPEvent(EntityDamageEvent event) {
        if (entityController != null) {
            entityController.onBeHurt(this, event.getAttackElementType(), true);//todo is host handling
        }
    }

    public void callAbilityBeHurt(EntityDamageEvent event) {
        //instancedAbilities.forEach(ability -> ability.onBeingHit(event));
    }

    /**
     * Move this entity to a new position.
     *
     * @param position The new position.
     * @param rotation The new rotation.
     */
    public void move(Position position, Position rotation) {
        // Set the position and rotation.
        this.getPosition().set(position);
        this.getRotation().set(rotation);
    }

    /**
     * Called when a player interacts with this entity
     *
     * @param player      Player that is interacting with this entity
     * @param interactReq Interact request protobuf data
     */
    public void onInteract(Player player, GadgetInteractReq interactReq) {

    }

    /**
     * Called when this entity is added to the world
     */
    public void onCreate() {

    }

    public void onRemoved() {

    }

    public boolean dropSubfield(String subfieldName) {
        var dropSystem = scene.getWorld().getServer().getDropSystem();
        var items = dropSystem.handleEntityDrop(getEntityTypeId(), subfieldName);
        if (items == null) return false;
        dropSystem.dropItems(items, ActionReason.SubfieldDrop, this, null, true);
        return true;
    }

    public void onTick(int sceneTime) {
        if (entityController != null) {
            entityController.onTimer(this, sceneTime);
        }
    }

    public int onClientExecuteRequest(int param1, int param2, int param3) {
        if (entityController != null) {
            return entityController.onClientExecuteRequest(this, param1, param2, param3);
        }
        return 0;
    }

    /**
     * Called when this entity dies
     *
     * @param killerId Entity id of the entity that killed this entity
     */
    public void onDeath(int killerId) {
        // Invoke entity death event.
        EntityDeathEvent event = new EntityDeathEvent(this, killerId);
        event.call();

        if (entityController != null) {
            entityController.onDie(this, getLastAttackType());
        }
    }

    public abstract SceneEntityInfo toProto();
}
