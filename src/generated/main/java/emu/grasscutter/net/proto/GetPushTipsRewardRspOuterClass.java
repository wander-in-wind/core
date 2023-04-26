// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetPushTipsRewardRsp.proto

package emu.grasscutter.net.proto;

public final class GetPushTipsRewardRspOuterClass {
  private GetPushTipsRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetPushTipsRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetPushTipsRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 push_tips_id_list = 13;</code>
     * @return A list containing the pushTipsIdList.
     */
    java.util.List<java.lang.Integer> getPushTipsIdListList();
    /**
     * <code>repeated uint32 push_tips_id_list = 13;</code>
     * @return The count of pushTipsIdList.
     */
    int getPushTipsIdListCount();
    /**
     * <code>repeated uint32 push_tips_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The pushTipsIdList at the given index.
     */
    int getPushTipsIdList(int index);

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2250
   * Name: FDNOEEEKJKP
   * </pre>
   *
   * Protobuf type {@code GetPushTipsRewardRsp}
   */
  public static final class GetPushTipsRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetPushTipsRewardRsp)
      GetPushTipsRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetPushTipsRewardRsp.newBuilder() to construct.
    private GetPushTipsRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetPushTipsRewardRsp() {
      pushTipsIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetPushTipsRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetPushTipsRewardRsp(
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pushTipsIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              pushTipsIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                pushTipsIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                pushTipsIdList_.addInt(input.readUInt32());
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
          pushTipsIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.internal_static_GetPushTipsRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.internal_static_GetPushTipsRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp.class, emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp.Builder.class);
    }

    public static final int PUSH_TIPS_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList pushTipsIdList_;
    /**
     * <code>repeated uint32 push_tips_id_list = 13;</code>
     * @return A list containing the pushTipsIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getPushTipsIdListList() {
      return pushTipsIdList_;
    }
    /**
     * <code>repeated uint32 push_tips_id_list = 13;</code>
     * @return The count of pushTipsIdList.
     */
    public int getPushTipsIdListCount() {
      return pushTipsIdList_.size();
    }
    /**
     * <code>repeated uint32 push_tips_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The pushTipsIdList at the given index.
     */
    public int getPushTipsIdList(int index) {
      return pushTipsIdList_.getInt(index);
    }
    private int pushTipsIdListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (getPushTipsIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(pushTipsIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < pushTipsIdList_.size(); i++) {
        output.writeUInt32NoTag(pushTipsIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < pushTipsIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(pushTipsIdList_.getInt(i));
        }
        size += dataSize;
        if (!getPushTipsIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        pushTipsIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp other = (emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp) obj;

      if (!getPushTipsIdListList()
          .equals(other.getPushTipsIdListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getPushTipsIdListCount() > 0) {
        hash = (37 * hash) + PUSH_TIPS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPushTipsIdListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp prototype) {
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
     * CmdId: 2250
     * Name: FDNOEEEKJKP
     * </pre>
     *
     * Protobuf type {@code GetPushTipsRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetPushTipsRewardRsp)
        emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.internal_static_GetPushTipsRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.internal_static_GetPushTipsRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp.class, emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp.newBuilder()
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
        pushTipsIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.internal_static_GetPushTipsRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp build() {
        emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp buildPartial() {
        emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp result = new emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          pushTipsIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pushTipsIdList_ = pushTipsIdList_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp other) {
        if (other == emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp.getDefaultInstance()) return this;
        if (!other.pushTipsIdList_.isEmpty()) {
          if (pushTipsIdList_.isEmpty()) {
            pushTipsIdList_ = other.pushTipsIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePushTipsIdListIsMutable();
            pushTipsIdList_.addAll(other.pushTipsIdList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList pushTipsIdList_ = emptyIntList();
      private void ensurePushTipsIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pushTipsIdList_ = mutableCopy(pushTipsIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 push_tips_id_list = 13;</code>
       * @return A list containing the pushTipsIdList.
       */
      public java.util.List<java.lang.Integer>
          getPushTipsIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(pushTipsIdList_) : pushTipsIdList_;
      }
      /**
       * <code>repeated uint32 push_tips_id_list = 13;</code>
       * @return The count of pushTipsIdList.
       */
      public int getPushTipsIdListCount() {
        return pushTipsIdList_.size();
      }
      /**
       * <code>repeated uint32 push_tips_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The pushTipsIdList at the given index.
       */
      public int getPushTipsIdList(int index) {
        return pushTipsIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 push_tips_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The pushTipsIdList to set.
       * @return This builder for chaining.
       */
      public Builder setPushTipsIdList(
          int index, int value) {
        ensurePushTipsIdListIsMutable();
        pushTipsIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 push_tips_id_list = 13;</code>
       * @param value The pushTipsIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPushTipsIdList(int value) {
        ensurePushTipsIdListIsMutable();
        pushTipsIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 push_tips_id_list = 13;</code>
       * @param values The pushTipsIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllPushTipsIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePushTipsIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pushTipsIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 push_tips_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPushTipsIdList() {
        pushTipsIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetPushTipsRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:GetPushTipsRewardRsp)
    private static final emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp();
    }

    public static emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPushTipsRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetPushTipsRewardRsp>() {
      @java.lang.Override
      public GetPushTipsRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPushTipsRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetPushTipsRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPushTipsRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetPushTipsRewardRspOuterClass.GetPushTipsRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPushTipsRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPushTipsRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GetPushTipsRewardRsp.proto\"B\n\024GetPushT" +
      "ipsRewardRsp\022\031\n\021push_tips_id_list\030\r \003(\r\022" +
      "\017\n\007retcode\030\005 \001(\005B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetPushTipsRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetPushTipsRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPushTipsRewardRsp_descriptor,
        new java.lang.String[] { "PushTipsIdList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
