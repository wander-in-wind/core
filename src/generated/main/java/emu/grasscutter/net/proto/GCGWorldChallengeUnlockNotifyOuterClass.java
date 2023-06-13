// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGWorldChallengeUnlockNotify.proto

package emu.grasscutter.net.proto;

public final class GCGWorldChallengeUnlockNotifyOuterClass {
  private GCGWorldChallengeUnlockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGWorldChallengeUnlockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGWorldChallengeUnlockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 unlock_id_list = 8;</code>
     * @return A list containing the unlockIdList.
     */
    java.util.List<java.lang.Integer> getUnlockIdListList();
    /**
     * <code>repeated uint32 unlock_id_list = 8;</code>
     * @return The count of unlockIdList.
     */
    int getUnlockIdListCount();
    /**
     * <code>repeated uint32 unlock_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The unlockIdList at the given index.
     */
    int getUnlockIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 7204
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GCGWorldChallengeUnlockNotify}
   */
  public static final class GCGWorldChallengeUnlockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGWorldChallengeUnlockNotify)
      GCGWorldChallengeUnlockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGWorldChallengeUnlockNotify.newBuilder() to construct.
    private GCGWorldChallengeUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGWorldChallengeUnlockNotify() {
      unlockIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGWorldChallengeUnlockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGWorldChallengeUnlockNotify(
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
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unlockIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unlockIdList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unlockIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unlockIdList_.addInt(input.readUInt32());
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
          unlockIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.internal_static_GCGWorldChallengeUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.internal_static_GCGWorldChallengeUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify.class, emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify.Builder.class);
    }

    public static final int UNLOCK_ID_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList unlockIdList_;
    /**
     * <code>repeated uint32 unlock_id_list = 8;</code>
     * @return A list containing the unlockIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnlockIdListList() {
      return unlockIdList_;
    }
    /**
     * <code>repeated uint32 unlock_id_list = 8;</code>
     * @return The count of unlockIdList.
     */
    public int getUnlockIdListCount() {
      return unlockIdList_.size();
    }
    /**
     * <code>repeated uint32 unlock_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The unlockIdList at the given index.
     */
    public int getUnlockIdList(int index) {
      return unlockIdList_.getInt(index);
    }
    private int unlockIdListMemoizedSerializedSize = -1;

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
      if (getUnlockIdListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(unlockIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < unlockIdList_.size(); i++) {
        output.writeUInt32NoTag(unlockIdList_.getInt(i));
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
        for (int i = 0; i < unlockIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unlockIdList_.getInt(i));
        }
        size += dataSize;
        if (!getUnlockIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unlockIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify other = (emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify) obj;

      if (!getUnlockIdListList()
          .equals(other.getUnlockIdListList())) return false;
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
      if (getUnlockIdListCount() > 0) {
        hash = (37 * hash) + UNLOCK_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUnlockIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify prototype) {
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
     * CmdId: 7204
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GCGWorldChallengeUnlockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGWorldChallengeUnlockNotify)
        emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.internal_static_GCGWorldChallengeUnlockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.internal_static_GCGWorldChallengeUnlockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify.class, emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify.newBuilder()
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
        unlockIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.internal_static_GCGWorldChallengeUnlockNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify build() {
        emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify buildPartial() {
        emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify result = new emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unlockIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unlockIdList_ = unlockIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify other) {
        if (other == emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify.getDefaultInstance()) return this;
        if (!other.unlockIdList_.isEmpty()) {
          if (unlockIdList_.isEmpty()) {
            unlockIdList_ = other.unlockIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnlockIdListIsMutable();
            unlockIdList_.addAll(other.unlockIdList_);
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
        emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unlockIdList_ = emptyIntList();
      private void ensureUnlockIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unlockIdList_ = mutableCopy(unlockIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 unlock_id_list = 8;</code>
       * @return A list containing the unlockIdList.
       */
      public java.util.List<java.lang.Integer>
          getUnlockIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unlockIdList_) : unlockIdList_;
      }
      /**
       * <code>repeated uint32 unlock_id_list = 8;</code>
       * @return The count of unlockIdList.
       */
      public int getUnlockIdListCount() {
        return unlockIdList_.size();
      }
      /**
       * <code>repeated uint32 unlock_id_list = 8;</code>
       * @param index The index of the element to return.
       * @return The unlockIdList at the given index.
       */
      public int getUnlockIdList(int index) {
        return unlockIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 unlock_id_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The unlockIdList to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockIdList(
          int index, int value) {
        ensureUnlockIdListIsMutable();
        unlockIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlock_id_list = 8;</code>
       * @param value The unlockIdList to add.
       * @return This builder for chaining.
       */
      public Builder addUnlockIdList(int value) {
        ensureUnlockIdListIsMutable();
        unlockIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlock_id_list = 8;</code>
       * @param values The unlockIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnlockIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnlockIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unlockIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlock_id_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockIdList() {
        unlockIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGWorldChallengeUnlockNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGWorldChallengeUnlockNotify)
    private static final emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify();
    }

    public static emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGWorldChallengeUnlockNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGWorldChallengeUnlockNotify>() {
      @java.lang.Override
      public GCGWorldChallengeUnlockNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGWorldChallengeUnlockNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGWorldChallengeUnlockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGWorldChallengeUnlockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGWorldChallengeUnlockNotifyOuterClass.GCGWorldChallengeUnlockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGWorldChallengeUnlockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGWorldChallengeUnlockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GCGWorldChallengeUnlockNotify.proto\"7\n" +
      "\035GCGWorldChallengeUnlockNotify\022\026\n\016unlock" +
      "_id_list\030\010 \003(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGWorldChallengeUnlockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGWorldChallengeUnlockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGWorldChallengeUnlockNotify_descriptor,
        new java.lang.String[] { "UnlockIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
