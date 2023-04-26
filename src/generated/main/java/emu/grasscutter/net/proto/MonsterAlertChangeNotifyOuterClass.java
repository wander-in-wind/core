// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterAlertChangeNotify.proto

package emu.grasscutter.net.proto;

public final class MonsterAlertChangeNotifyOuterClass {
  private MonsterAlertChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterAlertChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MonsterAlertChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 is_alert = 14;</code>
     * @return The isAlert.
     */
    int getIsAlert();

    /**
     * <code>repeated uint32 monster_entity_list = 2;</code>
     * @return A list containing the monsterEntityList.
     */
    java.util.List<java.lang.Integer> getMonsterEntityListList();
    /**
     * <code>repeated uint32 monster_entity_list = 2;</code>
     * @return The count of monsterEntityList.
     */
    int getMonsterEntityListCount();
    /**
     * <code>repeated uint32 monster_entity_list = 2;</code>
     * @param index The index of the element to return.
     * @return The monsterEntityList at the given index.
     */
    int getMonsterEntityList(int index);

    /**
     * <code>uint32 avatar_entity_id = 3;</code>
     * @return The avatarEntityId.
     */
    int getAvatarEntityId();
  }
  /**
   * <pre>
   * CmdId: 397
   * Name: PGOGJAJLDBM
   * </pre>
   *
   * Protobuf type {@code MonsterAlertChangeNotify}
   */
  public static final class MonsterAlertChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MonsterAlertChangeNotify)
      MonsterAlertChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterAlertChangeNotify.newBuilder() to construct.
    private MonsterAlertChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterAlertChangeNotify() {
      monsterEntityList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MonsterAlertChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonsterAlertChangeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                monsterEntityList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              monsterEntityList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                monsterEntityList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                monsterEntityList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {

              avatarEntityId_ = input.readUInt32();
              break;
            }
            case 112: {

              isAlert_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          monsterEntityList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.internal_static_MonsterAlertChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.internal_static_MonsterAlertChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify.class, emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify.Builder.class);
    }

    public static final int IS_ALERT_FIELD_NUMBER = 14;
    private int isAlert_;
    /**
     * <code>uint32 is_alert = 14;</code>
     * @return The isAlert.
     */
    @java.lang.Override
    public int getIsAlert() {
      return isAlert_;
    }

    public static final int MONSTER_ENTITY_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList monsterEntityList_;
    /**
     * <code>repeated uint32 monster_entity_list = 2;</code>
     * @return A list containing the monsterEntityList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMonsterEntityListList() {
      return monsterEntityList_;
    }
    /**
     * <code>repeated uint32 monster_entity_list = 2;</code>
     * @return The count of monsterEntityList.
     */
    public int getMonsterEntityListCount() {
      return monsterEntityList_.size();
    }
    /**
     * <code>repeated uint32 monster_entity_list = 2;</code>
     * @param index The index of the element to return.
     * @return The monsterEntityList at the given index.
     */
    public int getMonsterEntityList(int index) {
      return monsterEntityList_.getInt(index);
    }
    private int monsterEntityListMemoizedSerializedSize = -1;

    public static final int AVATAR_ENTITY_ID_FIELD_NUMBER = 3;
    private int avatarEntityId_;
    /**
     * <code>uint32 avatar_entity_id = 3;</code>
     * @return The avatarEntityId.
     */
    @java.lang.Override
    public int getAvatarEntityId() {
      return avatarEntityId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getMonsterEntityListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(monsterEntityListMemoizedSerializedSize);
      }
      for (int i = 0; i < monsterEntityList_.size(); i++) {
        output.writeUInt32NoTag(monsterEntityList_.getInt(i));
      }
      if (avatarEntityId_ != 0) {
        output.writeUInt32(3, avatarEntityId_);
      }
      if (isAlert_ != 0) {
        output.writeUInt32(14, isAlert_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < monsterEntityList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(monsterEntityList_.getInt(i));
        }
        size += dataSize;
        if (!getMonsterEntityListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        monsterEntityListMemoizedSerializedSize = dataSize;
      }
      if (avatarEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, avatarEntityId_);
      }
      if (isAlert_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, isAlert_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify other = (emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify) obj;

      if (getIsAlert()
          != other.getIsAlert()) return false;
      if (!getMonsterEntityListList()
          .equals(other.getMonsterEntityListList())) return false;
      if (getAvatarEntityId()
          != other.getAvatarEntityId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_ALERT_FIELD_NUMBER;
      hash = (53 * hash) + getIsAlert();
      if (getMonsterEntityListCount() > 0) {
        hash = (37 * hash) + MONSTER_ENTITY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterEntityListList().hashCode();
      }
      hash = (37 * hash) + AVATAR_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 397
     * Name: PGOGJAJLDBM
     * </pre>
     *
     * Protobuf type {@code MonsterAlertChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MonsterAlertChangeNotify)
        emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.internal_static_MonsterAlertChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.internal_static_MonsterAlertChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify.class, emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAlert_ = 0;

        monsterEntityList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.internal_static_MonsterAlertChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify build() {
        emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify buildPartial() {
        emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify result = new emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify(this);
        int from_bitField0_ = bitField0_;
        result.isAlert_ = isAlert_;
        if (((bitField0_ & 0x00000001) != 0)) {
          monsterEntityList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.monsterEntityList_ = monsterEntityList_;
        result.avatarEntityId_ = avatarEntityId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify other) {
        if (other == emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify.getDefaultInstance()) return this;
        if (other.getIsAlert() != 0) {
          setIsAlert(other.getIsAlert());
        }
        if (!other.monsterEntityList_.isEmpty()) {
          if (monsterEntityList_.isEmpty()) {
            monsterEntityList_ = other.monsterEntityList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMonsterEntityListIsMutable();
            monsterEntityList_.addAll(other.monsterEntityList_);
          }
          onChanged();
        }
        if (other.getAvatarEntityId() != 0) {
          setAvatarEntityId(other.getAvatarEntityId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int isAlert_ ;
      /**
       * <code>uint32 is_alert = 14;</code>
       * @return The isAlert.
       */
      @java.lang.Override
      public int getIsAlert() {
        return isAlert_;
      }
      /**
       * <code>uint32 is_alert = 14;</code>
       * @param value The isAlert to set.
       * @return This builder for chaining.
       */
      public Builder setIsAlert(int value) {
        
        isAlert_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 is_alert = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAlert() {
        
        isAlert_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList monsterEntityList_ = emptyIntList();
      private void ensureMonsterEntityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          monsterEntityList_ = mutableCopy(monsterEntityList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 monster_entity_list = 2;</code>
       * @return A list containing the monsterEntityList.
       */
      public java.util.List<java.lang.Integer>
          getMonsterEntityListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(monsterEntityList_) : monsterEntityList_;
      }
      /**
       * <code>repeated uint32 monster_entity_list = 2;</code>
       * @return The count of monsterEntityList.
       */
      public int getMonsterEntityListCount() {
        return monsterEntityList_.size();
      }
      /**
       * <code>repeated uint32 monster_entity_list = 2;</code>
       * @param index The index of the element to return.
       * @return The monsterEntityList at the given index.
       */
      public int getMonsterEntityList(int index) {
        return monsterEntityList_.getInt(index);
      }
      /**
       * <code>repeated uint32 monster_entity_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The monsterEntityList to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterEntityList(
          int index, int value) {
        ensureMonsterEntityListIsMutable();
        monsterEntityList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 monster_entity_list = 2;</code>
       * @param value The monsterEntityList to add.
       * @return This builder for chaining.
       */
      public Builder addMonsterEntityList(int value) {
        ensureMonsterEntityListIsMutable();
        monsterEntityList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 monster_entity_list = 2;</code>
       * @param values The monsterEntityList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMonsterEntityList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMonsterEntityListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, monsterEntityList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 monster_entity_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterEntityList() {
        monsterEntityList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int avatarEntityId_ ;
      /**
       * <code>uint32 avatar_entity_id = 3;</code>
       * @return The avatarEntityId.
       */
      @java.lang.Override
      public int getAvatarEntityId() {
        return avatarEntityId_;
      }
      /**
       * <code>uint32 avatar_entity_id = 3;</code>
       * @param value The avatarEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarEntityId(int value) {
        
        avatarEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarEntityId() {
        
        avatarEntityId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MonsterAlertChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:MonsterAlertChangeNotify)
    private static final emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify();
    }

    public static emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterAlertChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<MonsterAlertChangeNotify>() {
      @java.lang.Override
      public MonsterAlertChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MonsterAlertChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MonsterAlertChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterAlertChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MonsterAlertChangeNotifyOuterClass.MonsterAlertChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterAlertChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterAlertChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036MonsterAlertChangeNotify.proto\"c\n\030Mons" +
      "terAlertChangeNotify\022\020\n\010is_alert\030\016 \001(\r\022\033" +
      "\n\023monster_entity_list\030\002 \003(\r\022\030\n\020avatar_en" +
      "tity_id\030\003 \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MonsterAlertChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MonsterAlertChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterAlertChangeNotify_descriptor,
        new java.lang.String[] { "IsAlert", "MonsterEntityList", "AvatarEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
