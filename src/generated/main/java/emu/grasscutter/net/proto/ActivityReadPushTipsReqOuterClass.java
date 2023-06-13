// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityReadPushTipsReq.proto

package emu.grasscutter.net.proto;

public final class ActivityReadPushTipsReqOuterClass {
  private ActivityReadPushTipsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityReadPushTipsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityReadPushTipsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
     * @return A list containing the activityPushTipsIdList.
     */
    java.util.List<java.lang.Integer> getActivityPushTipsIdListList();
    /**
     * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
     * @return The count of activityPushTipsIdList.
     */
    int getActivityPushTipsIdListCount();
    /**
     * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The activityPushTipsIdList at the given index.
     */
    int getActivityPushTipsIdList(int index);

    /**
     * <code>uint32 activity_id = 7;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 8145
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ActivityReadPushTipsReq}
   */
  public static final class ActivityReadPushTipsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityReadPushTipsReq)
      ActivityReadPushTipsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityReadPushTipsReq.newBuilder() to construct.
    private ActivityReadPushTipsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityReadPushTipsReq() {
      activityPushTipsIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityReadPushTipsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityReadPushTipsReq(
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
            case 56: {

              activityId_ = input.readUInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                activityPushTipsIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              activityPushTipsIdList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                activityPushTipsIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                activityPushTipsIdList_.addInt(input.readUInt32());
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
          activityPushTipsIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.internal_static_ActivityReadPushTipsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.internal_static_ActivityReadPushTipsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq.class, emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq.Builder.class);
    }

    public static final int ACTIVITY_PUSH_TIPS_ID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList activityPushTipsIdList_;
    /**
     * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
     * @return A list containing the activityPushTipsIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getActivityPushTipsIdListList() {
      return activityPushTipsIdList_;
    }
    /**
     * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
     * @return The count of activityPushTipsIdList.
     */
    public int getActivityPushTipsIdListCount() {
      return activityPushTipsIdList_.size();
    }
    /**
     * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The activityPushTipsIdList at the given index.
     */
    public int getActivityPushTipsIdList(int index) {
      return activityPushTipsIdList_.getInt(index);
    }
    private int activityPushTipsIdListMemoizedSerializedSize = -1;

    public static final int ACTIVITY_ID_FIELD_NUMBER = 7;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 7;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      if (activityId_ != 0) {
        output.writeUInt32(7, activityId_);
      }
      if (getActivityPushTipsIdListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(activityPushTipsIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < activityPushTipsIdList_.size(); i++) {
        output.writeUInt32NoTag(activityPushTipsIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, activityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < activityPushTipsIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(activityPushTipsIdList_.getInt(i));
        }
        size += dataSize;
        if (!getActivityPushTipsIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        activityPushTipsIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq other = (emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq) obj;

      if (!getActivityPushTipsIdListList()
          .equals(other.getActivityPushTipsIdListList())) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
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
      if (getActivityPushTipsIdListCount() > 0) {
        hash = (37 * hash) + ACTIVITY_PUSH_TIPS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getActivityPushTipsIdListList().hashCode();
      }
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq prototype) {
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
     * CmdId: 8145
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ActivityReadPushTipsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityReadPushTipsReq)
        emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.internal_static_ActivityReadPushTipsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.internal_static_ActivityReadPushTipsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq.class, emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq.newBuilder()
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
        activityPushTipsIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.internal_static_ActivityReadPushTipsReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq build() {
        emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq buildPartial() {
        emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq result = new emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          activityPushTipsIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.activityPushTipsIdList_ = activityPushTipsIdList_;
        result.activityId_ = activityId_;
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
        if (other instanceof emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq other) {
        if (other == emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq.getDefaultInstance()) return this;
        if (!other.activityPushTipsIdList_.isEmpty()) {
          if (activityPushTipsIdList_.isEmpty()) {
            activityPushTipsIdList_ = other.activityPushTipsIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActivityPushTipsIdListIsMutable();
            activityPushTipsIdList_.addAll(other.activityPushTipsIdList_);
          }
          onChanged();
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList activityPushTipsIdList_ = emptyIntList();
      private void ensureActivityPushTipsIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          activityPushTipsIdList_ = mutableCopy(activityPushTipsIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
       * @return A list containing the activityPushTipsIdList.
       */
      public java.util.List<java.lang.Integer>
          getActivityPushTipsIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(activityPushTipsIdList_) : activityPushTipsIdList_;
      }
      /**
       * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
       * @return The count of activityPushTipsIdList.
       */
      public int getActivityPushTipsIdListCount() {
        return activityPushTipsIdList_.size();
      }
      /**
       * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
       * @param index The index of the element to return.
       * @return The activityPushTipsIdList at the given index.
       */
      public int getActivityPushTipsIdList(int index) {
        return activityPushTipsIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The activityPushTipsIdList to set.
       * @return This builder for chaining.
       */
      public Builder setActivityPushTipsIdList(
          int index, int value) {
        ensureActivityPushTipsIdListIsMutable();
        activityPushTipsIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
       * @param value The activityPushTipsIdList to add.
       * @return This builder for chaining.
       */
      public Builder addActivityPushTipsIdList(int value) {
        ensureActivityPushTipsIdListIsMutable();
        activityPushTipsIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
       * @param values The activityPushTipsIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllActivityPushTipsIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureActivityPushTipsIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, activityPushTipsIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 activity_push_tips_id_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityPushTipsIdList() {
        activityPushTipsIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 7;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 7;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityReadPushTipsReq)
    }

    // @@protoc_insertion_point(class_scope:ActivityReadPushTipsReq)
    private static final emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq();
    }

    public static emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityReadPushTipsReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivityReadPushTipsReq>() {
      @java.lang.Override
      public ActivityReadPushTipsReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityReadPushTipsReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityReadPushTipsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityReadPushTipsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityReadPushTipsReqOuterClass.ActivityReadPushTipsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityReadPushTipsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityReadPushTipsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ActivityReadPushTipsReq.proto\"R\n\027Activ" +
      "ityReadPushTipsReq\022\"\n\032activity_push_tips" +
      "_id_list\030\016 \003(\r\022\023\n\013activity_id\030\007 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityReadPushTipsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityReadPushTipsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityReadPushTipsReq_descriptor,
        new java.lang.String[] { "ActivityPushTipsIdList", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
