// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BartenderStartLevelRsp.proto

package emu.grasscutter.net.proto;

public final class BartenderStartLevelRspOuterClass {
  private BartenderStartLevelRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BartenderStartLevelRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BartenderStartLevelRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 order_list = 8;</code>
     * @return A list containing the orderList.
     */
    java.util.List<java.lang.Integer> getOrderListList();
    /**
     * <code>repeated uint32 order_list = 8;</code>
     * @return The count of orderList.
     */
    int getOrderListCount();
    /**
     * <code>repeated uint32 order_list = 8;</code>
     * @param index The index of the element to return.
     * @return The orderList at the given index.
     */
    int getOrderList(int index);

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 time = 5;</code>
     * @return The time.
     */
    int getTime();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * Name: NHOJHEBAMEC
   * CmdId: 8747
   * </pre>
   *
   * Protobuf type {@code BartenderStartLevelRsp}
   */
  public static final class BartenderStartLevelRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BartenderStartLevelRsp)
      BartenderStartLevelRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BartenderStartLevelRsp.newBuilder() to construct.
    private BartenderStartLevelRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BartenderStartLevelRsp() {
      orderList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BartenderStartLevelRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BartenderStartLevelRsp(
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
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 40: {

              time_ = input.readUInt32();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                orderList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              orderList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                orderList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                orderList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {

              levelId_ = input.readUInt32();
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
          orderList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.internal_static_BartenderStartLevelRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.internal_static_BartenderStartLevelRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp.class, emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp.Builder.class);
    }

    public static final int ORDER_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList orderList_;
    /**
     * <code>repeated uint32 order_list = 8;</code>
     * @return A list containing the orderList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOrderListList() {
      return orderList_;
    }
    /**
     * <code>repeated uint32 order_list = 8;</code>
     * @return The count of orderList.
     */
    public int getOrderListCount() {
      return orderList_.size();
    }
    /**
     * <code>repeated uint32 order_list = 8;</code>
     * @param index The index of the element to return.
     * @return The orderList at the given index.
     */
    public int getOrderList(int index) {
      return orderList_.getInt(index);
    }
    private int orderListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TIME_FIELD_NUMBER = 5;
    private int time_;
    /**
     * <code>uint32 time = 5;</code>
     * @return The time.
     */
    @java.lang.Override
    public int getTime() {
      return time_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
        output.writeInt32(4, retcode_);
      }
      if (time_ != 0) {
        output.writeUInt32(5, time_);
      }
      if (getOrderListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(orderListMemoizedSerializedSize);
      }
      for (int i = 0; i < orderList_.size(); i++) {
        output.writeUInt32NoTag(orderList_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
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
          .computeInt32Size(4, retcode_);
      }
      if (time_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, time_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < orderList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(orderList_.getInt(i));
        }
        size += dataSize;
        if (!getOrderListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        orderListMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp other = (emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp) obj;

      if (!getOrderListList()
          .equals(other.getOrderListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getTime()
          != other.getTime()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      if (getOrderListCount() > 0) {
        hash = (37 * hash) + ORDER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOrderListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp prototype) {
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
     * Name: NHOJHEBAMEC
     * CmdId: 8747
     * </pre>
     *
     * Protobuf type {@code BartenderStartLevelRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BartenderStartLevelRsp)
        emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.internal_static_BartenderStartLevelRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.internal_static_BartenderStartLevelRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp.class, emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp.newBuilder()
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
        orderList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        time_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.internal_static_BartenderStartLevelRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp build() {
        emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp buildPartial() {
        emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp result = new emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          orderList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orderList_ = orderList_;
        result.retcode_ = retcode_;
        result.time_ = time_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp) {
          return mergeFrom((emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp other) {
        if (other == emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp.getDefaultInstance()) return this;
        if (!other.orderList_.isEmpty()) {
          if (orderList_.isEmpty()) {
            orderList_ = other.orderList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrderListIsMutable();
            orderList_.addAll(other.orderList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getTime() != 0) {
          setTime(other.getTime());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList orderList_ = emptyIntList();
      private void ensureOrderListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          orderList_ = mutableCopy(orderList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 order_list = 8;</code>
       * @return A list containing the orderList.
       */
      public java.util.List<java.lang.Integer>
          getOrderListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(orderList_) : orderList_;
      }
      /**
       * <code>repeated uint32 order_list = 8;</code>
       * @return The count of orderList.
       */
      public int getOrderListCount() {
        return orderList_.size();
      }
      /**
       * <code>repeated uint32 order_list = 8;</code>
       * @param index The index of the element to return.
       * @return The orderList at the given index.
       */
      public int getOrderList(int index) {
        return orderList_.getInt(index);
      }
      /**
       * <code>repeated uint32 order_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The orderList to set.
       * @return This builder for chaining.
       */
      public Builder setOrderList(
          int index, int value) {
        ensureOrderListIsMutable();
        orderList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 order_list = 8;</code>
       * @param value The orderList to add.
       * @return This builder for chaining.
       */
      public Builder addOrderList(int value) {
        ensureOrderListIsMutable();
        orderList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 order_list = 8;</code>
       * @param values The orderList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOrderList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOrderListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orderList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 order_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOrderList() {
        orderList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int time_ ;
      /**
       * <code>uint32 time = 5;</code>
       * @return The time.
       */
      @java.lang.Override
      public int getTime() {
        return time_;
      }
      /**
       * <code>uint32 time = 5;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(int value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        
        time_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BartenderStartLevelRsp)
    }

    // @@protoc_insertion_point(class_scope:BartenderStartLevelRsp)
    private static final emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp();
    }

    public static emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BartenderStartLevelRsp>
        PARSER = new com.google.protobuf.AbstractParser<BartenderStartLevelRsp>() {
      @java.lang.Override
      public BartenderStartLevelRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BartenderStartLevelRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BartenderStartLevelRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BartenderStartLevelRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BartenderStartLevelRspOuterClass.BartenderStartLevelRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BartenderStartLevelRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BartenderStartLevelRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BartenderStartLevelRsp.proto\"]\n\026Barten" +
      "derStartLevelRsp\022\022\n\norder_list\030\010 \003(\r\022\017\n\007" +
      "retcode\030\004 \001(\005\022\014\n\004time\030\005 \001(\r\022\020\n\010level_id\030" +
      "\n \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BartenderStartLevelRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BartenderStartLevelRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BartenderStartLevelRsp_descriptor,
        new java.lang.String[] { "OrderList", "Retcode", "Time", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
