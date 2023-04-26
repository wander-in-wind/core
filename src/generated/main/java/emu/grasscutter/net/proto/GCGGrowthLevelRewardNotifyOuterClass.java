// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGGrowthLevelRewardNotify.proto

package emu.grasscutter.net.proto;

public final class GCGGrowthLevelRewardNotifyOuterClass {
  private GCGGrowthLevelRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGGrowthLevelRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGGrowthLevelRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 level_reward_taken_list = 12;</code>
     * @return A list containing the levelRewardTakenList.
     */
    java.util.List<java.lang.Integer> getLevelRewardTakenListList();
    /**
     * <code>repeated uint32 level_reward_taken_list = 12;</code>
     * @return The count of levelRewardTakenList.
     */
    int getLevelRewardTakenListCount();
    /**
     * <code>repeated uint32 level_reward_taken_list = 12;</code>
     * @param index The index of the element to return.
     * @return The levelRewardTakenList at the given index.
     */
    int getLevelRewardTakenList(int index);
  }
  /**
   * <pre>
   * CmdId: 7470
   * Name: OPKHNAMFACE
   * </pre>
   *
   * Protobuf type {@code GCGGrowthLevelRewardNotify}
   */
  public static final class GCGGrowthLevelRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGGrowthLevelRewardNotify)
      GCGGrowthLevelRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGGrowthLevelRewardNotify.newBuilder() to construct.
    private GCGGrowthLevelRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGGrowthLevelRewardNotify() {
      levelRewardTakenList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGGrowthLevelRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGGrowthLevelRewardNotify(
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
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                levelRewardTakenList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              levelRewardTakenList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                levelRewardTakenList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                levelRewardTakenList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          levelRewardTakenList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.class, emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.Builder.class);
    }

    public static final int LEVEL_REWARD_TAKEN_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList levelRewardTakenList_;
    /**
     * <code>repeated uint32 level_reward_taken_list = 12;</code>
     * @return A list containing the levelRewardTakenList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLevelRewardTakenListList() {
      return levelRewardTakenList_;
    }
    /**
     * <code>repeated uint32 level_reward_taken_list = 12;</code>
     * @return The count of levelRewardTakenList.
     */
    public int getLevelRewardTakenListCount() {
      return levelRewardTakenList_.size();
    }
    /**
     * <code>repeated uint32 level_reward_taken_list = 12;</code>
     * @param index The index of the element to return.
     * @return The levelRewardTakenList at the given index.
     */
    public int getLevelRewardTakenList(int index) {
      return levelRewardTakenList_.getInt(index);
    }
    private int levelRewardTakenListMemoizedSerializedSize = -1;

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
      if (getLevelRewardTakenListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(levelRewardTakenListMemoizedSerializedSize);
      }
      for (int i = 0; i < levelRewardTakenList_.size(); i++) {
        output.writeUInt32NoTag(levelRewardTakenList_.getInt(i));
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
        for (int i = 0; i < levelRewardTakenList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(levelRewardTakenList_.getInt(i));
        }
        size += dataSize;
        if (!getLevelRewardTakenListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        levelRewardTakenListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify other = (emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify) obj;

      if (!getLevelRewardTakenListList()
          .equals(other.getLevelRewardTakenListList())) return false;
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
      if (getLevelRewardTakenListCount() > 0) {
        hash = (37 * hash) + LEVEL_REWARD_TAKEN_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLevelRewardTakenListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify prototype) {
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
     * CmdId: 7470
     * Name: OPKHNAMFACE
     * </pre>
     *
     * Protobuf type {@code GCGGrowthLevelRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGGrowthLevelRewardNotify)
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.class, emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.newBuilder()
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
        levelRewardTakenList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify build() {
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify buildPartial() {
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify result = new emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          levelRewardTakenList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.levelRewardTakenList_ = levelRewardTakenList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify other) {
        if (other == emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.getDefaultInstance()) return this;
        if (!other.levelRewardTakenList_.isEmpty()) {
          if (levelRewardTakenList_.isEmpty()) {
            levelRewardTakenList_ = other.levelRewardTakenList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLevelRewardTakenListIsMutable();
            levelRewardTakenList_.addAll(other.levelRewardTakenList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList levelRewardTakenList_ = emptyIntList();
      private void ensureLevelRewardTakenListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          levelRewardTakenList_ = mutableCopy(levelRewardTakenList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 level_reward_taken_list = 12;</code>
       * @return A list containing the levelRewardTakenList.
       */
      public java.util.List<java.lang.Integer>
          getLevelRewardTakenListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(levelRewardTakenList_) : levelRewardTakenList_;
      }
      /**
       * <code>repeated uint32 level_reward_taken_list = 12;</code>
       * @return The count of levelRewardTakenList.
       */
      public int getLevelRewardTakenListCount() {
        return levelRewardTakenList_.size();
      }
      /**
       * <code>repeated uint32 level_reward_taken_list = 12;</code>
       * @param index The index of the element to return.
       * @return The levelRewardTakenList at the given index.
       */
      public int getLevelRewardTakenList(int index) {
        return levelRewardTakenList_.getInt(index);
      }
      /**
       * <code>repeated uint32 level_reward_taken_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The levelRewardTakenList to set.
       * @return This builder for chaining.
       */
      public Builder setLevelRewardTakenList(
          int index, int value) {
        ensureLevelRewardTakenListIsMutable();
        levelRewardTakenList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 level_reward_taken_list = 12;</code>
       * @param value The levelRewardTakenList to add.
       * @return This builder for chaining.
       */
      public Builder addLevelRewardTakenList(int value) {
        ensureLevelRewardTakenListIsMutable();
        levelRewardTakenList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 level_reward_taken_list = 12;</code>
       * @param values The levelRewardTakenList to add.
       * @return This builder for chaining.
       */
      public Builder addAllLevelRewardTakenList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLevelRewardTakenListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, levelRewardTakenList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 level_reward_taken_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelRewardTakenList() {
        levelRewardTakenList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GCGGrowthLevelRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGGrowthLevelRewardNotify)
    private static final emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify();
    }

    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGGrowthLevelRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGGrowthLevelRewardNotify>() {
      @java.lang.Override
      public GCGGrowthLevelRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGGrowthLevelRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGGrowthLevelRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGGrowthLevelRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGGrowthLevelRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GCGGrowthLevelRewardNotify.proto\"=\n\032GC" +
      "GGrowthLevelRewardNotify\022\037\n\027level_reward" +
      "_taken_list\030\014 \003(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGGrowthLevelRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGGrowthLevelRewardNotify_descriptor,
        new java.lang.String[] { "LevelRewardTakenList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
