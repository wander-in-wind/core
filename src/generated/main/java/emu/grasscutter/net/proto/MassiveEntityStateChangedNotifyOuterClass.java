// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MassiveEntityStateChangedNotify.proto

package emu.grasscutter.net.proto;

public final class MassiveEntityStateChangedNotifyOuterClass {
  private MassiveEntityStateChangedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MassiveEntityStateChangedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MassiveEntityStateChangedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState> 
        getMassiveEntityStateListList();
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState getMassiveEntityStateList(int index);
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    int getMassiveEntityStateListCount();
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder> 
        getMassiveEntityStateListOrBuilderList();
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder getMassiveEntityStateListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 370
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code MassiveEntityStateChangedNotify}
   */
  public static final class MassiveEntityStateChangedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MassiveEntityStateChangedNotify)
      MassiveEntityStateChangedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MassiveEntityStateChangedNotify.newBuilder() to construct.
    private MassiveEntityStateChangedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MassiveEntityStateChangedNotify() {
      massiveEntityStateList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MassiveEntityStateChangedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MassiveEntityStateChangedNotify(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                massiveEntityStateList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState>();
                mutable_bitField0_ |= 0x00000001;
              }
              massiveEntityStateList_.add(
                  input.readMessage(emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.parser(), extensionRegistry));
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
          massiveEntityStateList_ = java.util.Collections.unmodifiableList(massiveEntityStateList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.internal_static_MassiveEntityStateChangedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.internal_static_MassiveEntityStateChangedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify.class, emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify.Builder.class);
    }

    public static final int MASSIVE_ENTITY_STATE_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState> massiveEntityStateList_;
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState> getMassiveEntityStateListList() {
      return massiveEntityStateList_;
    }
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder> 
        getMassiveEntityStateListOrBuilderList() {
      return massiveEntityStateList_;
    }
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    @java.lang.Override
    public int getMassiveEntityStateListCount() {
      return massiveEntityStateList_.size();
    }
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState getMassiveEntityStateList(int index) {
      return massiveEntityStateList_.get(index);
    }
    /**
     * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder getMassiveEntityStateListOrBuilder(
        int index) {
      return massiveEntityStateList_.get(index);
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
      for (int i = 0; i < massiveEntityStateList_.size(); i++) {
        output.writeMessage(4, massiveEntityStateList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < massiveEntityStateList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, massiveEntityStateList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify other = (emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify) obj;

      if (!getMassiveEntityStateListList()
          .equals(other.getMassiveEntityStateListList())) return false;
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
      if (getMassiveEntityStateListCount() > 0) {
        hash = (37 * hash) + MASSIVE_ENTITY_STATE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMassiveEntityStateListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify prototype) {
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
     * CmdId: 370
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code MassiveEntityStateChangedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MassiveEntityStateChangedNotify)
        emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.internal_static_MassiveEntityStateChangedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.internal_static_MassiveEntityStateChangedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify.class, emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify.newBuilder()
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
          getMassiveEntityStateListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (massiveEntityStateListBuilder_ == null) {
          massiveEntityStateList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          massiveEntityStateListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.internal_static_MassiveEntityStateChangedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify build() {
        emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify buildPartial() {
        emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify result = new emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify(this);
        int from_bitField0_ = bitField0_;
        if (massiveEntityStateListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            massiveEntityStateList_ = java.util.Collections.unmodifiableList(massiveEntityStateList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.massiveEntityStateList_ = massiveEntityStateList_;
        } else {
          result.massiveEntityStateList_ = massiveEntityStateListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify other) {
        if (other == emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify.getDefaultInstance()) return this;
        if (massiveEntityStateListBuilder_ == null) {
          if (!other.massiveEntityStateList_.isEmpty()) {
            if (massiveEntityStateList_.isEmpty()) {
              massiveEntityStateList_ = other.massiveEntityStateList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMassiveEntityStateListIsMutable();
              massiveEntityStateList_.addAll(other.massiveEntityStateList_);
            }
            onChanged();
          }
        } else {
          if (!other.massiveEntityStateList_.isEmpty()) {
            if (massiveEntityStateListBuilder_.isEmpty()) {
              massiveEntityStateListBuilder_.dispose();
              massiveEntityStateListBuilder_ = null;
              massiveEntityStateList_ = other.massiveEntityStateList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              massiveEntityStateListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMassiveEntityStateListFieldBuilder() : null;
            } else {
              massiveEntityStateListBuilder_.addAllMessages(other.massiveEntityStateList_);
            }
          }
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
        emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState> massiveEntityStateList_ =
        java.util.Collections.emptyList();
      private void ensureMassiveEntityStateListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          massiveEntityStateList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState>(massiveEntityStateList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder> massiveEntityStateListBuilder_;

      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState> getMassiveEntityStateListList() {
        if (massiveEntityStateListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(massiveEntityStateList_);
        } else {
          return massiveEntityStateListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public int getMassiveEntityStateListCount() {
        if (massiveEntityStateListBuilder_ == null) {
          return massiveEntityStateList_.size();
        } else {
          return massiveEntityStateListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState getMassiveEntityStateList(int index) {
        if (massiveEntityStateListBuilder_ == null) {
          return massiveEntityStateList_.get(index);
        } else {
          return massiveEntityStateListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder setMassiveEntityStateList(
          int index, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState value) {
        if (massiveEntityStateListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMassiveEntityStateListIsMutable();
          massiveEntityStateList_.set(index, value);
          onChanged();
        } else {
          massiveEntityStateListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder setMassiveEntityStateList(
          int index, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder builderForValue) {
        if (massiveEntityStateListBuilder_ == null) {
          ensureMassiveEntityStateListIsMutable();
          massiveEntityStateList_.set(index, builderForValue.build());
          onChanged();
        } else {
          massiveEntityStateListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder addMassiveEntityStateList(emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState value) {
        if (massiveEntityStateListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMassiveEntityStateListIsMutable();
          massiveEntityStateList_.add(value);
          onChanged();
        } else {
          massiveEntityStateListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder addMassiveEntityStateList(
          int index, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState value) {
        if (massiveEntityStateListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMassiveEntityStateListIsMutable();
          massiveEntityStateList_.add(index, value);
          onChanged();
        } else {
          massiveEntityStateListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder addMassiveEntityStateList(
          emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder builderForValue) {
        if (massiveEntityStateListBuilder_ == null) {
          ensureMassiveEntityStateListIsMutable();
          massiveEntityStateList_.add(builderForValue.build());
          onChanged();
        } else {
          massiveEntityStateListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder addMassiveEntityStateList(
          int index, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder builderForValue) {
        if (massiveEntityStateListBuilder_ == null) {
          ensureMassiveEntityStateListIsMutable();
          massiveEntityStateList_.add(index, builderForValue.build());
          onChanged();
        } else {
          massiveEntityStateListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder addAllMassiveEntityStateList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState> values) {
        if (massiveEntityStateListBuilder_ == null) {
          ensureMassiveEntityStateListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, massiveEntityStateList_);
          onChanged();
        } else {
          massiveEntityStateListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder clearMassiveEntityStateList() {
        if (massiveEntityStateListBuilder_ == null) {
          massiveEntityStateList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          massiveEntityStateListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public Builder removeMassiveEntityStateList(int index) {
        if (massiveEntityStateListBuilder_ == null) {
          ensureMassiveEntityStateListIsMutable();
          massiveEntityStateList_.remove(index);
          onChanged();
        } else {
          massiveEntityStateListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder getMassiveEntityStateListBuilder(
          int index) {
        return getMassiveEntityStateListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder getMassiveEntityStateListOrBuilder(
          int index) {
        if (massiveEntityStateListBuilder_ == null) {
          return massiveEntityStateList_.get(index);  } else {
          return massiveEntityStateListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder> 
           getMassiveEntityStateListOrBuilderList() {
        if (massiveEntityStateListBuilder_ != null) {
          return massiveEntityStateListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(massiveEntityStateList_);
        }
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder addMassiveEntityStateListBuilder() {
        return getMassiveEntityStateListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.getDefaultInstance());
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder addMassiveEntityStateListBuilder(
          int index) {
        return getMassiveEntityStateListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.getDefaultInstance());
      }
      /**
       * <code>repeated .MassiveEntityState massive_entity_state_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder> 
           getMassiveEntityStateListBuilderList() {
        return getMassiveEntityStateListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder> 
          getMassiveEntityStateListFieldBuilder() {
        if (massiveEntityStateListBuilder_ == null) {
          massiveEntityStateListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityState.Builder, emu.grasscutter.net.proto.MassiveEntityStateOuterClass.MassiveEntityStateOrBuilder>(
                  massiveEntityStateList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          massiveEntityStateList_ = null;
        }
        return massiveEntityStateListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MassiveEntityStateChangedNotify)
    }

    // @@protoc_insertion_point(class_scope:MassiveEntityStateChangedNotify)
    private static final emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify();
    }

    public static emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MassiveEntityStateChangedNotify>
        PARSER = new com.google.protobuf.AbstractParser<MassiveEntityStateChangedNotify>() {
      @java.lang.Override
      public MassiveEntityStateChangedNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MassiveEntityStateChangedNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MassiveEntityStateChangedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MassiveEntityStateChangedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MassiveEntityStateChangedNotifyOuterClass.MassiveEntityStateChangedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MassiveEntityStateChangedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MassiveEntityStateChangedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%MassiveEntityStateChangedNotify.proto\032" +
      "\030MassiveEntityState.proto\"Y\n\037MassiveEnti" +
      "tyStateChangedNotify\0226\n\031massive_entity_s" +
      "tate_list\030\004 \003(\0132\023.MassiveEntityStateB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MassiveEntityStateOuterClass.getDescriptor(),
        });
    internal_static_MassiveEntityStateChangedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MassiveEntityStateChangedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MassiveEntityStateChangedNotify_descriptor,
        new java.lang.String[] { "MassiveEntityStateList", });
    emu.grasscutter.net.proto.MassiveEntityStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
