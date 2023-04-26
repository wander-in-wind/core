// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshRoguelikeDungeonCardRsp.proto

package emu.grasscutter.net.proto;

public final class RefreshRoguelikeDungeonCardRspOuterClass {
  private RefreshRoguelikeDungeonCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshRoguelikeDungeonCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RefreshRoguelikeDungeonCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 res_card_list = 14;</code>
     * @return A list containing the resCardList.
     */
    java.util.List<java.lang.Integer> getResCardListList();
    /**
     * <code>repeated uint32 res_card_list = 14;</code>
     * @return The count of resCardList.
     */
    int getResCardListCount();
    /**
     * <code>repeated uint32 res_card_list = 14;</code>
     * @param index The index of the element to return.
     * @return The resCardList at the given index.
     */
    int getResCardList(int index);

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8844
   * Name: CGNGOIAICCF
   * </pre>
   *
   * Protobuf type {@code RefreshRoguelikeDungeonCardRsp}
   */
  public static final class RefreshRoguelikeDungeonCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RefreshRoguelikeDungeonCardRsp)
      RefreshRoguelikeDungeonCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshRoguelikeDungeonCardRsp.newBuilder() to construct.
    private RefreshRoguelikeDungeonCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshRoguelikeDungeonCardRsp() {
      resCardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RefreshRoguelikeDungeonCardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshRoguelikeDungeonCardRsp(
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
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                resCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              resCardList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                resCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                resCardList_.addInt(input.readUInt32());
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
          resCardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.internal_static_RefreshRoguelikeDungeonCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.internal_static_RefreshRoguelikeDungeonCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp.class, emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp.Builder.class);
    }

    public static final int RES_CARD_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList resCardList_;
    /**
     * <code>repeated uint32 res_card_list = 14;</code>
     * @return A list containing the resCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getResCardListList() {
      return resCardList_;
    }
    /**
     * <code>repeated uint32 res_card_list = 14;</code>
     * @return The count of resCardList.
     */
    public int getResCardListCount() {
      return resCardList_.size();
    }
    /**
     * <code>repeated uint32 res_card_list = 14;</code>
     * @param index The index of the element to return.
     * @return The resCardList at the given index.
     */
    public int getResCardList(int index) {
      return resCardList_.getInt(index);
    }
    private int resCardListMemoizedSerializedSize = -1;

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
      if (getResCardListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(resCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < resCardList_.size(); i++) {
        output.writeUInt32NoTag(resCardList_.getInt(i));
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
        for (int i = 0; i < resCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(resCardList_.getInt(i));
        }
        size += dataSize;
        if (!getResCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        resCardListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp other = (emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp) obj;

      if (!getResCardListList()
          .equals(other.getResCardListList())) return false;
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
      if (getResCardListCount() > 0) {
        hash = (37 * hash) + RES_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getResCardListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp prototype) {
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
     * CmdId: 8844
     * Name: CGNGOIAICCF
     * </pre>
     *
     * Protobuf type {@code RefreshRoguelikeDungeonCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RefreshRoguelikeDungeonCardRsp)
        emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.internal_static_RefreshRoguelikeDungeonCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.internal_static_RefreshRoguelikeDungeonCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp.class, emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp.newBuilder()
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
        resCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.internal_static_RefreshRoguelikeDungeonCardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp build() {
        emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp buildPartial() {
        emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp result = new emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          resCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resCardList_ = resCardList_;
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
        if (other instanceof emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp other) {
        if (other == emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp.getDefaultInstance()) return this;
        if (!other.resCardList_.isEmpty()) {
          if (resCardList_.isEmpty()) {
            resCardList_ = other.resCardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResCardListIsMutable();
            resCardList_.addAll(other.resCardList_);
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
        emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList resCardList_ = emptyIntList();
      private void ensureResCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          resCardList_ = mutableCopy(resCardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 res_card_list = 14;</code>
       * @return A list containing the resCardList.
       */
      public java.util.List<java.lang.Integer>
          getResCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(resCardList_) : resCardList_;
      }
      /**
       * <code>repeated uint32 res_card_list = 14;</code>
       * @return The count of resCardList.
       */
      public int getResCardListCount() {
        return resCardList_.size();
      }
      /**
       * <code>repeated uint32 res_card_list = 14;</code>
       * @param index The index of the element to return.
       * @return The resCardList at the given index.
       */
      public int getResCardList(int index) {
        return resCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 res_card_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The resCardList to set.
       * @return This builder for chaining.
       */
      public Builder setResCardList(
          int index, int value) {
        ensureResCardListIsMutable();
        resCardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 res_card_list = 14;</code>
       * @param value The resCardList to add.
       * @return This builder for chaining.
       */
      public Builder addResCardList(int value) {
        ensureResCardListIsMutable();
        resCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 res_card_list = 14;</code>
       * @param values The resCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllResCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureResCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 res_card_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearResCardList() {
        resCardList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:RefreshRoguelikeDungeonCardRsp)
    }

    // @@protoc_insertion_point(class_scope:RefreshRoguelikeDungeonCardRsp)
    private static final emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp();
    }

    public static emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RefreshRoguelikeDungeonCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<RefreshRoguelikeDungeonCardRsp>() {
      @java.lang.Override
      public RefreshRoguelikeDungeonCardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RefreshRoguelikeDungeonCardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RefreshRoguelikeDungeonCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshRoguelikeDungeonCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RefreshRoguelikeDungeonCardRspOuterClass.RefreshRoguelikeDungeonCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshRoguelikeDungeonCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshRoguelikeDungeonCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$RefreshRoguelikeDungeonCardRsp.proto\"H" +
      "\n\036RefreshRoguelikeDungeonCardRsp\022\025\n\rres_" +
      "card_list\030\016 \003(\r\022\017\n\007retcode\030\005 \001(\005B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RefreshRoguelikeDungeonCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RefreshRoguelikeDungeonCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshRoguelikeDungeonCardRsp_descriptor,
        new java.lang.String[] { "ResCardList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
