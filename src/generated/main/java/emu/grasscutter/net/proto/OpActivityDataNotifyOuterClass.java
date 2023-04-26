// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpActivityDataNotify.proto

package emu.grasscutter.net.proto;

public final class OpActivityDataNotifyOuterClass {
  private OpActivityDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpActivityDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpActivityDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo> 
        getOpActivityInfoListList();
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfoList(int index);
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    int getOpActivityInfoListCount();
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
        getOpActivityInfoListOrBuilderList();
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 5189
   * Name: NDKAKLBNOPA
   * </pre>
   *
   * Protobuf type {@code OpActivityDataNotify}
   */
  public static final class OpActivityDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpActivityDataNotify)
      OpActivityDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpActivityDataNotify.newBuilder() to construct.
    private OpActivityDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpActivityDataNotify() {
      opActivityInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpActivityDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpActivityDataNotify(
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                opActivityInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              opActivityInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.parser(), extensionRegistry));
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
          opActivityInfoList_ = java.util.Collections.unmodifiableList(opActivityInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.class, emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.Builder.class);
    }

    public static final int OP_ACTIVITY_INFO_LIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo> opActivityInfoList_;
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo> getOpActivityInfoListList() {
      return opActivityInfoList_;
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
        getOpActivityInfoListOrBuilderList() {
      return opActivityInfoList_;
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    @java.lang.Override
    public int getOpActivityInfoListCount() {
      return opActivityInfoList_.size();
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfoList(int index) {
      return opActivityInfoList_.get(index);
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoListOrBuilder(
        int index) {
      return opActivityInfoList_.get(index);
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
      for (int i = 0; i < opActivityInfoList_.size(); i++) {
        output.writeMessage(6, opActivityInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < opActivityInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, opActivityInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify other = (emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify) obj;

      if (!getOpActivityInfoListList()
          .equals(other.getOpActivityInfoListList())) return false;
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
      if (getOpActivityInfoListCount() > 0) {
        hash = (37 * hash) + OP_ACTIVITY_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOpActivityInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify prototype) {
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
     * CmdId: 5189
     * Name: NDKAKLBNOPA
     * </pre>
     *
     * Protobuf type {@code OpActivityDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpActivityDataNotify)
        emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.class, emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.newBuilder()
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
          getOpActivityInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (opActivityInfoListBuilder_ == null) {
          opActivityInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          opActivityInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify build() {
        emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify buildPartial() {
        emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify result = new emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (opActivityInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            opActivityInfoList_ = java.util.Collections.unmodifiableList(opActivityInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.opActivityInfoList_ = opActivityInfoList_;
        } else {
          result.opActivityInfoList_ = opActivityInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify other) {
        if (other == emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.getDefaultInstance()) return this;
        if (opActivityInfoListBuilder_ == null) {
          if (!other.opActivityInfoList_.isEmpty()) {
            if (opActivityInfoList_.isEmpty()) {
              opActivityInfoList_ = other.opActivityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOpActivityInfoListIsMutable();
              opActivityInfoList_.addAll(other.opActivityInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.opActivityInfoList_.isEmpty()) {
            if (opActivityInfoListBuilder_.isEmpty()) {
              opActivityInfoListBuilder_.dispose();
              opActivityInfoListBuilder_ = null;
              opActivityInfoList_ = other.opActivityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              opActivityInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOpActivityInfoListFieldBuilder() : null;
            } else {
              opActivityInfoListBuilder_.addAllMessages(other.opActivityInfoList_);
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
        emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo> opActivityInfoList_ =
        java.util.Collections.emptyList();
      private void ensureOpActivityInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          opActivityInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo>(opActivityInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> opActivityInfoListBuilder_;

      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo> getOpActivityInfoListList() {
        if (opActivityInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(opActivityInfoList_);
        } else {
          return opActivityInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public int getOpActivityInfoListCount() {
        if (opActivityInfoListBuilder_ == null) {
          return opActivityInfoList_.size();
        } else {
          return opActivityInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfoList(int index) {
        if (opActivityInfoListBuilder_ == null) {
          return opActivityInfoList_.get(index);
        } else {
          return opActivityInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder setOpActivityInfoList(
          int index, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.set(index, value);
          onChanged();
        } else {
          opActivityInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder setOpActivityInfoList(
          int index, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder builderForValue) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          opActivityInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder addOpActivityInfoList(emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(value);
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder addOpActivityInfoList(
          int index, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(index, value);
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder addOpActivityInfoList(
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder builderForValue) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder addOpActivityInfoList(
          int index, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder builderForValue) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder addAllOpActivityInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo> values) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, opActivityInfoList_);
          onChanged();
        } else {
          opActivityInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder clearOpActivityInfoList() {
        if (opActivityInfoListBuilder_ == null) {
          opActivityInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          opActivityInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public Builder removeOpActivityInfoList(int index) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.remove(index);
          onChanged();
        } else {
          opActivityInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder getOpActivityInfoListBuilder(
          int index) {
        return getOpActivityInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoListOrBuilder(
          int index) {
        if (opActivityInfoListBuilder_ == null) {
          return opActivityInfoList_.get(index);  } else {
          return opActivityInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
           getOpActivityInfoListOrBuilderList() {
        if (opActivityInfoListBuilder_ != null) {
          return opActivityInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(opActivityInfoList_);
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder addOpActivityInfoListBuilder() {
        return getOpActivityInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder addOpActivityInfoListBuilder(
          int index) {
        return getOpActivityInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder> 
           getOpActivityInfoListBuilderList() {
        return getOpActivityInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
          getOpActivityInfoListFieldBuilder() {
        if (opActivityInfoListBuilder_ == null) {
          opActivityInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder>(
                  opActivityInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          opActivityInfoList_ = null;
        }
        return opActivityInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:OpActivityDataNotify)
    }

    // @@protoc_insertion_point(class_scope:OpActivityDataNotify)
    private static final emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify();
    }

    public static emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpActivityDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<OpActivityDataNotify>() {
      @java.lang.Override
      public OpActivityDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpActivityDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OpActivityDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpActivityDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OpActivityDataNotifyOuterClass.OpActivityDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpActivityDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpActivityDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032OpActivityDataNotify.proto\032\024OpActivity" +
      "Info.proto\"F\n\024OpActivityDataNotify\022.\n\025op" +
      "_activity_info_list\030\006 \003(\0132\017.OpActivityIn" +
      "foB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.getDescriptor(),
        });
    internal_static_OpActivityDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpActivityDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpActivityDataNotify_descriptor,
        new java.lang.String[] { "OpActivityInfoList", });
    emu.grasscutter.net.proto.OpActivityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
