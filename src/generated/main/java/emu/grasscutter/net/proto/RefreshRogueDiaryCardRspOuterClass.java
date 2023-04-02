// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshRogueDiaryCardRsp.proto

package emu.grasscutter.net.proto;

public final class RefreshRogueDiaryCardRspOuterClass {
  private RefreshRogueDiaryCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshRogueDiaryCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RefreshRogueDiaryCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 rand_card_list = 10;</code>
     * @return A list containing the randCardList.
     */
    java.util.List<java.lang.Integer> getRandCardListList();
    /**
     * <code>repeated uint32 rand_card_list = 10;</code>
     * @return The count of randCardList.
     */
    int getRandCardListCount();
    /**
     * <code>repeated uint32 rand_card_list = 10;</code>
     * @param index The index of the element to return.
     * @return The randCardList at the given index.
     */
    int getRandCardList(int index);

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: HEMIOOMFBFM
   * CmdId: 8105
   * </pre>
   *
   * Protobuf type {@code RefreshRogueDiaryCardRsp}
   */
  public static final class RefreshRogueDiaryCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RefreshRogueDiaryCardRsp)
      RefreshRogueDiaryCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshRogueDiaryCardRsp.newBuilder() to construct.
    private RefreshRogueDiaryCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshRogueDiaryCardRsp() {
      randCardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RefreshRogueDiaryCardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshRogueDiaryCardRsp(
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
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                randCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              randCardList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                randCardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                randCardList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
          randCardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.class, emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.Builder.class);
    }

    public static final int RAND_CARD_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList randCardList_;
    /**
     * <code>repeated uint32 rand_card_list = 10;</code>
     * @return A list containing the randCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRandCardListList() {
      return randCardList_;
    }
    /**
     * <code>repeated uint32 rand_card_list = 10;</code>
     * @return The count of randCardList.
     */
    public int getRandCardListCount() {
      return randCardList_.size();
    }
    /**
     * <code>repeated uint32 rand_card_list = 10;</code>
     * @param index The index of the element to return.
     * @return The randCardList at the given index.
     */
    public int getRandCardList(int index) {
      return randCardList_.getInt(index);
    }
    private int randCardListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
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
      if (getRandCardListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(randCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < randCardList_.size(); i++) {
        output.writeUInt32NoTag(randCardList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
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
        for (int i = 0; i < randCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(randCardList_.getInt(i));
        }
        size += dataSize;
        if (!getRandCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        randCardListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp other = (emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp) obj;

      if (!getRandCardListList()
          .equals(other.getRandCardListList())) return false;
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
      if (getRandCardListCount() > 0) {
        hash = (37 * hash) + RAND_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRandCardListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp prototype) {
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
     * Name: HEMIOOMFBFM
     * CmdId: 8105
     * </pre>
     *
     * Protobuf type {@code RefreshRogueDiaryCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RefreshRogueDiaryCardRsp)
        emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.class, emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.newBuilder()
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
        randCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp build() {
        emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp buildPartial() {
        emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp result = new emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          randCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.randCardList_ = randCardList_;
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
        if (other instanceof emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp other) {
        if (other == emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.getDefaultInstance()) return this;
        if (!other.randCardList_.isEmpty()) {
          if (randCardList_.isEmpty()) {
            randCardList_ = other.randCardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRandCardListIsMutable();
            randCardList_.addAll(other.randCardList_);
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
        emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList randCardList_ = emptyIntList();
      private void ensureRandCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          randCardList_ = mutableCopy(randCardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 rand_card_list = 10;</code>
       * @return A list containing the randCardList.
       */
      public java.util.List<java.lang.Integer>
          getRandCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(randCardList_) : randCardList_;
      }
      /**
       * <code>repeated uint32 rand_card_list = 10;</code>
       * @return The count of randCardList.
       */
      public int getRandCardListCount() {
        return randCardList_.size();
      }
      /**
       * <code>repeated uint32 rand_card_list = 10;</code>
       * @param index The index of the element to return.
       * @return The randCardList at the given index.
       */
      public int getRandCardList(int index) {
        return randCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 rand_card_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The randCardList to set.
       * @return This builder for chaining.
       */
      public Builder setRandCardList(
          int index, int value) {
        ensureRandCardListIsMutable();
        randCardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rand_card_list = 10;</code>
       * @param value The randCardList to add.
       * @return This builder for chaining.
       */
      public Builder addRandCardList(int value) {
        ensureRandCardListIsMutable();
        randCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rand_card_list = 10;</code>
       * @param values The randCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRandCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRandCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, randCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rand_card_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandCardList() {
        randCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
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


      // @@protoc_insertion_point(builder_scope:RefreshRogueDiaryCardRsp)
    }

    // @@protoc_insertion_point(class_scope:RefreshRogueDiaryCardRsp)
    private static final emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp();
    }

    public static emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RefreshRogueDiaryCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<RefreshRogueDiaryCardRsp>() {
      @java.lang.Override
      public RefreshRogueDiaryCardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RefreshRogueDiaryCardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RefreshRogueDiaryCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshRogueDiaryCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshRogueDiaryCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RefreshRogueDiaryCardRsp.proto\"C\n\030Refr" +
      "eshRogueDiaryCardRsp\022\026\n\016rand_card_list\030\n" +
      " \003(\r\022\017\n\007retcode\030\017 \001(\005B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RefreshRogueDiaryCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshRogueDiaryCardRsp_descriptor,
        new java.lang.String[] { "RandCardList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
