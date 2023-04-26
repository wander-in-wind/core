// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgModifyAdd.proto

package emu.grasscutter.net.proto;

public final class GCGMsgModifyAddOuterClass {
  private GCGMsgModifyAddOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgModifyAddOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgModifyAdd)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pos = 6;</code>
     * @return The pos.
     */
    int getPos();

    /**
     * <code>uint32 controller_id = 13;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>uint32 owner_card_guid = 8;</code>
     * @return The ownerCardGuid.
     */
    int getOwnerCardGuid();

    /**
     * <code>.GCGReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 2;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason();

    /**
     * <code>repeated uint32 card_guid_list = 15;</code>
     * @return A list containing the cardGuidList.
     */
    java.util.List<java.lang.Integer> getCardGuidListList();
    /**
     * <code>repeated uint32 card_guid_list = 15;</code>
     * @return The count of cardGuidList.
     */
    int getCardGuidListCount();
    /**
     * <code>repeated uint32 card_guid_list = 15;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    int getCardGuidList(int index);
  }
  /**
   * <pre>
   * Name: KLKGODCFLBJ
   * </pre>
   *
   * Protobuf type {@code GCGMsgModifyAdd}
   */
  public static final class GCGMsgModifyAdd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgModifyAdd)
      GCGMsgModifyAddOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgModifyAdd.newBuilder() to construct.
    private GCGMsgModifyAdd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgModifyAdd() {
      reason_ = 0;
      cardGuidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgModifyAdd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgModifyAdd(
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
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 48: {

              pos_ = input.readUInt32();
              break;
            }
            case 64: {

              ownerCardGuid_ = input.readUInt32();
              break;
            }
            case 104: {

              controllerId_ = input.readUInt32();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cardGuidList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cardGuidList_.addInt(input.readUInt32());
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
          cardGuidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.internal_static_GCGMsgModifyAdd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.internal_static_GCGMsgModifyAdd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd.class, emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 6;
    private int pos_;
    /**
     * <code>uint32 pos = 6;</code>
     * @return The pos.
     */
    @java.lang.Override
    public int getPos() {
      return pos_;
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 13;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 13;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int OWNER_CARD_GUID_FIELD_NUMBER = 8;
    private int ownerCardGuid_;
    /**
     * <code>uint32 owner_card_guid = 8;</code>
     * @return The ownerCardGuid.
     */
    @java.lang.Override
    public int getOwnerCardGuid() {
      return ownerCardGuid_;
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private int reason_;
    /**
     * <code>.GCGReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
    }

    public static final int CARD_GUID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList cardGuidList_;
    /**
     * <code>repeated uint32 card_guid_list = 15;</code>
     * @return A list containing the cardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardGuidListList() {
      return cardGuidList_;
    }
    /**
     * <code>repeated uint32 card_guid_list = 15;</code>
     * @return The count of cardGuidList.
     */
    public int getCardGuidListCount() {
      return cardGuidList_.size();
    }
    /**
     * <code>repeated uint32 card_guid_list = 15;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    public int getCardGuidList(int index) {
      return cardGuidList_.getInt(index);
    }
    private int cardGuidListMemoizedSerializedSize = -1;

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
      if (reason_ != emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(2, reason_);
      }
      if (pos_ != 0) {
        output.writeUInt32(6, pos_);
      }
      if (ownerCardGuid_ != 0) {
        output.writeUInt32(8, ownerCardGuid_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(13, controllerId_);
      }
      if (getCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(cardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardGuidList_.size(); i++) {
        output.writeUInt32NoTag(cardGuidList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, reason_);
      }
      if (pos_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, pos_);
      }
      if (ownerCardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, ownerCardGuid_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, controllerId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < cardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd other = (emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd) obj;

      if (getPos()
          != other.getPos()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (getOwnerCardGuid()
          != other.getOwnerCardGuid()) return false;
      if (reason_ != other.reason_) return false;
      if (!getCardGuidListList()
          .equals(other.getCardGuidListList())) return false;
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
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos();
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + OWNER_CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerCardGuid();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      if (getCardGuidListCount() > 0) {
        hash = (37 * hash) + CARD_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd prototype) {
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
     * Name: KLKGODCFLBJ
     * </pre>
     *
     * Protobuf type {@code GCGMsgModifyAdd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgModifyAdd)
        emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAddOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.internal_static_GCGMsgModifyAdd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.internal_static_GCGMsgModifyAdd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd.class, emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd.newBuilder()
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
        pos_ = 0;

        controllerId_ = 0;

        ownerCardGuid_ = 0;

        reason_ = 0;

        cardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.internal_static_GCGMsgModifyAdd_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd build() {
        emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd buildPartial() {
        emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd result = new emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd(this);
        int from_bitField0_ = bitField0_;
        result.pos_ = pos_;
        result.controllerId_ = controllerId_;
        result.ownerCardGuid_ = ownerCardGuid_;
        result.reason_ = reason_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardGuidList_ = cardGuidList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd other) {
        if (other == emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd.getDefaultInstance()) return this;
        if (other.getPos() != 0) {
          setPos(other.getPos());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getOwnerCardGuid() != 0) {
          setOwnerCardGuid(other.getOwnerCardGuid());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (!other.cardGuidList_.isEmpty()) {
          if (cardGuidList_.isEmpty()) {
            cardGuidList_ = other.cardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCardGuidListIsMutable();
            cardGuidList_.addAll(other.cardGuidList_);
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
        emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int pos_ ;
      /**
       * <code>uint32 pos = 6;</code>
       * @return The pos.
       */
      @java.lang.Override
      public int getPos() {
        return pos_;
      }
      /**
       * <code>uint32 pos = 6;</code>
       * @param value The pos to set.
       * @return This builder for chaining.
       */
      public Builder setPos(int value) {
        
        pos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pos = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPos() {
        
        pos_ = 0;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 13;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 13;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int ownerCardGuid_ ;
      /**
       * <code>uint32 owner_card_guid = 8;</code>
       * @return The ownerCardGuid.
       */
      @java.lang.Override
      public int getOwnerCardGuid() {
        return ownerCardGuid_;
      }
      /**
       * <code>uint32 owner_card_guid = 8;</code>
       * @param value The ownerCardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerCardGuid(int value) {
        
        ownerCardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_card_guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerCardGuid() {
        
        ownerCardGuid_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 2;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 2;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 2;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 2;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cardGuidList_ = emptyIntList();
      private void ensureCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_ = mutableCopy(cardGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 card_guid_list = 15;</code>
       * @return A list containing the cardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getCardGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardGuidList_) : cardGuidList_;
      }
      /**
       * <code>repeated uint32 card_guid_list = 15;</code>
       * @return The count of cardGuidList.
       */
      public int getCardGuidListCount() {
        return cardGuidList_.size();
      }
      /**
       * <code>repeated uint32 card_guid_list = 15;</code>
       * @param index The index of the element to return.
       * @return The cardGuidList at the given index.
       */
      public int getCardGuidList(int index) {
        return cardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_guid_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The cardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuidList(
          int index, int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 15;</code>
       * @param value The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addCardGuidList(int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 15;</code>
       * @param values The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuidList() {
        cardGuidList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGMsgModifyAdd)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgModifyAdd)
    private static final emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd();
    }

    public static emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgModifyAdd>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgModifyAdd>() {
      @java.lang.Override
      public GCGMsgModifyAdd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgModifyAdd(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgModifyAdd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgModifyAdd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgModifyAddOuterClass.GCGMsgModifyAdd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgModifyAdd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgModifyAdd_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GCGMsgModifyAdd.proto\032\017GCGReason.proto" +
      "\"\202\001\n\017GCGMsgModifyAdd\022\013\n\003pos\030\006 \001(\r\022\025\n\rcon" +
      "troller_id\030\r \001(\r\022\027\n\017owner_card_guid\030\010 \001(" +
      "\r\022\032\n\006reason\030\002 \001(\0162\n.GCGReason\022\026\n\016card_gu" +
      "id_list\030\017 \003(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGReasonOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgModifyAdd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgModifyAdd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgModifyAdd_descriptor,
        new java.lang.String[] { "Pos", "ControllerId", "OwnerCardGuid", "Reason", "CardGuidList", });
    emu.grasscutter.net.proto.GCGReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
