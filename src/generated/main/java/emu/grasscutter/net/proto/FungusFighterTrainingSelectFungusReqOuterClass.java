// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterTrainingSelectFungusReq.proto

package emu.grasscutter.net.proto;

public final class FungusFighterTrainingSelectFungusReqOuterClass {
  private FungusFighterTrainingSelectFungusReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterTrainingSelectFungusReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterTrainingSelectFungusReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 fight_fungus_id_list = 6;</code>
     * @return A list containing the fightFungusIdList.
     */
    java.util.List<java.lang.Integer> getFightFungusIdListList();
    /**
     * <code>repeated uint32 fight_fungus_id_list = 6;</code>
     * @return The count of fightFungusIdList.
     */
    int getFightFungusIdListCount();
    /**
     * <code>repeated uint32 fight_fungus_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The fightFungusIdList at the given index.
     */
    int getFightFungusIdList(int index);

    /**
     * <code>repeated uint32 backup_fungus_id_list = 14;</code>
     * @return A list containing the backupFungusIdList.
     */
    java.util.List<java.lang.Integer> getBackupFungusIdListList();
    /**
     * <code>repeated uint32 backup_fungus_id_list = 14;</code>
     * @return The count of backupFungusIdList.
     */
    int getBackupFungusIdListCount();
    /**
     * <code>repeated uint32 backup_fungus_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The backupFungusIdList at the given index.
     */
    int getBackupFungusIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 21230
   * Name: MGEPGOKKALB
   * </pre>
   *
   * Protobuf type {@code FungusFighterTrainingSelectFungusReq}
   */
  public static final class FungusFighterTrainingSelectFungusReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterTrainingSelectFungusReq)
      FungusFighterTrainingSelectFungusReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterTrainingSelectFungusReq.newBuilder() to construct.
    private FungusFighterTrainingSelectFungusReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterTrainingSelectFungusReq() {
      fightFungusIdList_ = emptyIntList();
      backupFungusIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterTrainingSelectFungusReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterTrainingSelectFungusReq(
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
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fightFungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fightFungusIdList_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fightFungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fightFungusIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                backupFungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              backupFungusIdList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                backupFungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                backupFungusIdList_.addInt(input.readUInt32());
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
          fightFungusIdList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          backupFungusIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.class, emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.Builder.class);
    }

    public static final int FIGHT_FUNGUS_ID_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList fightFungusIdList_;
    /**
     * <code>repeated uint32 fight_fungus_id_list = 6;</code>
     * @return A list containing the fightFungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFightFungusIdListList() {
      return fightFungusIdList_;
    }
    /**
     * <code>repeated uint32 fight_fungus_id_list = 6;</code>
     * @return The count of fightFungusIdList.
     */
    public int getFightFungusIdListCount() {
      return fightFungusIdList_.size();
    }
    /**
     * <code>repeated uint32 fight_fungus_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The fightFungusIdList at the given index.
     */
    public int getFightFungusIdList(int index) {
      return fightFungusIdList_.getInt(index);
    }
    private int fightFungusIdListMemoizedSerializedSize = -1;

    public static final int BACKUP_FUNGUS_ID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList backupFungusIdList_;
    /**
     * <code>repeated uint32 backup_fungus_id_list = 14;</code>
     * @return A list containing the backupFungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getBackupFungusIdListList() {
      return backupFungusIdList_;
    }
    /**
     * <code>repeated uint32 backup_fungus_id_list = 14;</code>
     * @return The count of backupFungusIdList.
     */
    public int getBackupFungusIdListCount() {
      return backupFungusIdList_.size();
    }
    /**
     * <code>repeated uint32 backup_fungus_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The backupFungusIdList at the given index.
     */
    public int getBackupFungusIdList(int index) {
      return backupFungusIdList_.getInt(index);
    }
    private int backupFungusIdListMemoizedSerializedSize = -1;

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
      if (getFightFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(fightFungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fightFungusIdList_.size(); i++) {
        output.writeUInt32NoTag(fightFungusIdList_.getInt(i));
      }
      if (getBackupFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(backupFungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < backupFungusIdList_.size(); i++) {
        output.writeUInt32NoTag(backupFungusIdList_.getInt(i));
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
        for (int i = 0; i < fightFungusIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fightFungusIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFightFungusIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fightFungusIdListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < backupFungusIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(backupFungusIdList_.getInt(i));
        }
        size += dataSize;
        if (!getBackupFungusIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        backupFungusIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq other = (emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq) obj;

      if (!getFightFungusIdListList()
          .equals(other.getFightFungusIdListList())) return false;
      if (!getBackupFungusIdListList()
          .equals(other.getBackupFungusIdListList())) return false;
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
      if (getFightFungusIdListCount() > 0) {
        hash = (37 * hash) + FIGHT_FUNGUS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFightFungusIdListList().hashCode();
      }
      if (getBackupFungusIdListCount() > 0) {
        hash = (37 * hash) + BACKUP_FUNGUS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBackupFungusIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq prototype) {
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
     * CmdId: 21230
     * Name: MGEPGOKKALB
     * </pre>
     *
     * Protobuf type {@code FungusFighterTrainingSelectFungusReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterTrainingSelectFungusReq)
        emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.class, emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.newBuilder()
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
        fightFungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        backupFungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq build() {
        emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq buildPartial() {
        emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq result = new emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fightFungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fightFungusIdList_ = fightFungusIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          backupFungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.backupFungusIdList_ = backupFungusIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq) {
          return mergeFrom((emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq other) {
        if (other == emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.getDefaultInstance()) return this;
        if (!other.fightFungusIdList_.isEmpty()) {
          if (fightFungusIdList_.isEmpty()) {
            fightFungusIdList_ = other.fightFungusIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFightFungusIdListIsMutable();
            fightFungusIdList_.addAll(other.fightFungusIdList_);
          }
          onChanged();
        }
        if (!other.backupFungusIdList_.isEmpty()) {
          if (backupFungusIdList_.isEmpty()) {
            backupFungusIdList_ = other.backupFungusIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBackupFungusIdListIsMutable();
            backupFungusIdList_.addAll(other.backupFungusIdList_);
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
        emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList fightFungusIdList_ = emptyIntList();
      private void ensureFightFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fightFungusIdList_ = mutableCopy(fightFungusIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 6;</code>
       * @return A list containing the fightFungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getFightFungusIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fightFungusIdList_) : fightFungusIdList_;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 6;</code>
       * @return The count of fightFungusIdList.
       */
      public int getFightFungusIdListCount() {
        return fightFungusIdList_.size();
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 6;</code>
       * @param index The index of the element to return.
       * @return The fightFungusIdList at the given index.
       */
      public int getFightFungusIdList(int index) {
        return fightFungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The fightFungusIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFightFungusIdList(
          int index, int value) {
        ensureFightFungusIdListIsMutable();
        fightFungusIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 6;</code>
       * @param value The fightFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFightFungusIdList(int value) {
        ensureFightFungusIdListIsMutable();
        fightFungusIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 6;</code>
       * @param values The fightFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFightFungusIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFightFungusIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fightFungusIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFightFungusIdList() {
        fightFungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList backupFungusIdList_ = emptyIntList();
      private void ensureBackupFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          backupFungusIdList_ = mutableCopy(backupFungusIdList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 14;</code>
       * @return A list containing the backupFungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getBackupFungusIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(backupFungusIdList_) : backupFungusIdList_;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 14;</code>
       * @return The count of backupFungusIdList.
       */
      public int getBackupFungusIdListCount() {
        return backupFungusIdList_.size();
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 14;</code>
       * @param index The index of the element to return.
       * @return The backupFungusIdList at the given index.
       */
      public int getBackupFungusIdList(int index) {
        return backupFungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The backupFungusIdList to set.
       * @return This builder for chaining.
       */
      public Builder setBackupFungusIdList(
          int index, int value) {
        ensureBackupFungusIdListIsMutable();
        backupFungusIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 14;</code>
       * @param value The backupFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addBackupFungusIdList(int value) {
        ensureBackupFungusIdListIsMutable();
        backupFungusIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 14;</code>
       * @param values The backupFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllBackupFungusIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBackupFungusIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, backupFungusIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBackupFungusIdList() {
        backupFungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:FungusFighterTrainingSelectFungusReq)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterTrainingSelectFungusReq)
    private static final emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq();
    }

    public static emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterTrainingSelectFungusReq>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterTrainingSelectFungusReq>() {
      @java.lang.Override
      public FungusFighterTrainingSelectFungusReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterTrainingSelectFungusReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterTrainingSelectFungusReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterTrainingSelectFungusReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*FungusFighterTrainingSelectFungusReq.p" +
      "roto\"c\n$FungusFighterTrainingSelectFungu" +
      "sReq\022\034\n\024fight_fungus_id_list\030\006 \003(\r\022\035\n\025ba" +
      "ckup_fungus_id_list\030\016 \003(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterTrainingSelectFungusReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterTrainingSelectFungusReq_descriptor,
        new java.lang.String[] { "FightFungusIdList", "BackupFungusIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
