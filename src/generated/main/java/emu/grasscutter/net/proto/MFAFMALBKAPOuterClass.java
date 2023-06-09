// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MFAFMALBKAP.proto

package emu.grasscutter.net.proto;

public final class MFAFMALBKAPOuterClass {
  private MFAFMALBKAPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MFAFMALBKAPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MFAFMALBKAP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 9;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>repeated uint32 EELEBKMIBBK = 15;</code>
     * @return A list containing the eELEBKMIBBK.
     */
    java.util.List<java.lang.Integer> getEELEBKMIBBKList();
    /**
     * <code>repeated uint32 EELEBKMIBBK = 15;</code>
     * @return The count of eELEBKMIBBK.
     */
    int getEELEBKMIBBKCount();
    /**
     * <code>repeated uint32 EELEBKMIBBK = 15;</code>
     * @param index The index of the element to return.
     * @return The eELEBKMIBBK at the given index.
     */
    int getEELEBKMIBBK(int index);

    /**
     * <code>uint32 face_type = 2;</code>
     * @return The faceType.
     */
    int getFaceType();

    /**
     * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
     * @return A list containing the aHCKEKMDMLJ.
     */
    java.util.List<java.lang.Integer> getAHCKEKMDMLJList();
    /**
     * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
     * @return The count of aHCKEKMDMLJ.
     */
    int getAHCKEKMDMLJCount();
    /**
     * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
     * @param index The index of the element to return.
     * @return The aHCKEKMDMLJ at the given index.
     */
    int getAHCKEKMDMLJ(int index);

    /**
     * <code>uint32 num = 7;</code>
     * @return The num.
     */
    int getNum();

    /**
     * <code>uint32 EJKLKNPMHMC = 1;</code>
     * @return The eJKLKNPMHMC.
     */
    int getEJKLKNPMHMC();
  }
  /**
   * <pre>
   * Name: MFAFMALBKAP
   * </pre>
   *
   * Protobuf type {@code MFAFMALBKAP}
   */
  public static final class MFAFMALBKAP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MFAFMALBKAP)
      MFAFMALBKAPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MFAFMALBKAP.newBuilder() to construct.
    private MFAFMALBKAP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MFAFMALBKAP() {
      eELEBKMIBBK_ = emptyIntList();
      aHCKEKMDMLJ_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MFAFMALBKAP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MFAFMALBKAP(
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
            case 8: {

              eJKLKNPMHMC_ = input.readUInt32();
              break;
            }
            case 16: {

              faceType_ = input.readUInt32();
              break;
            }
            case 56: {

              num_ = input.readUInt32();
              break;
            }
            case 72: {

              cardId_ = input.readUInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                aHCKEKMDMLJ_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              aHCKEKMDMLJ_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                aHCKEKMDMLJ_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                aHCKEKMDMLJ_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                eELEBKMIBBK_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              eELEBKMIBBK_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                eELEBKMIBBK_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                eELEBKMIBBK_.addInt(input.readUInt32());
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          aHCKEKMDMLJ_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          eELEBKMIBBK_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.internal_static_MFAFMALBKAP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.internal_static_MFAFMALBKAP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP.class, emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 9;
    private int cardId_;
    /**
     * <code>uint32 card_id = 9;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int EELEBKMIBBK_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList eELEBKMIBBK_;
    /**
     * <code>repeated uint32 EELEBKMIBBK = 15;</code>
     * @return A list containing the eELEBKMIBBK.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEELEBKMIBBKList() {
      return eELEBKMIBBK_;
    }
    /**
     * <code>repeated uint32 EELEBKMIBBK = 15;</code>
     * @return The count of eELEBKMIBBK.
     */
    public int getEELEBKMIBBKCount() {
      return eELEBKMIBBK_.size();
    }
    /**
     * <code>repeated uint32 EELEBKMIBBK = 15;</code>
     * @param index The index of the element to return.
     * @return The eELEBKMIBBK at the given index.
     */
    public int getEELEBKMIBBK(int index) {
      return eELEBKMIBBK_.getInt(index);
    }
    private int eELEBKMIBBKMemoizedSerializedSize = -1;

    public static final int FACE_TYPE_FIELD_NUMBER = 2;
    private int faceType_;
    /**
     * <code>uint32 face_type = 2;</code>
     * @return The faceType.
     */
    @java.lang.Override
    public int getFaceType() {
      return faceType_;
    }

    public static final int AHCKEKMDMLJ_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList aHCKEKMDMLJ_;
    /**
     * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
     * @return A list containing the aHCKEKMDMLJ.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAHCKEKMDMLJList() {
      return aHCKEKMDMLJ_;
    }
    /**
     * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
     * @return The count of aHCKEKMDMLJ.
     */
    public int getAHCKEKMDMLJCount() {
      return aHCKEKMDMLJ_.size();
    }
    /**
     * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
     * @param index The index of the element to return.
     * @return The aHCKEKMDMLJ at the given index.
     */
    public int getAHCKEKMDMLJ(int index) {
      return aHCKEKMDMLJ_.getInt(index);
    }
    private int aHCKEKMDMLJMemoizedSerializedSize = -1;

    public static final int NUM_FIELD_NUMBER = 7;
    private int num_;
    /**
     * <code>uint32 num = 7;</code>
     * @return The num.
     */
    @java.lang.Override
    public int getNum() {
      return num_;
    }

    public static final int EJKLKNPMHMC_FIELD_NUMBER = 1;
    private int eJKLKNPMHMC_;
    /**
     * <code>uint32 EJKLKNPMHMC = 1;</code>
     * @return The eJKLKNPMHMC.
     */
    @java.lang.Override
    public int getEJKLKNPMHMC() {
      return eJKLKNPMHMC_;
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
      if (eJKLKNPMHMC_ != 0) {
        output.writeUInt32(1, eJKLKNPMHMC_);
      }
      if (faceType_ != 0) {
        output.writeUInt32(2, faceType_);
      }
      if (num_ != 0) {
        output.writeUInt32(7, num_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(9, cardId_);
      }
      if (getAHCKEKMDMLJList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(aHCKEKMDMLJMemoizedSerializedSize);
      }
      for (int i = 0; i < aHCKEKMDMLJ_.size(); i++) {
        output.writeUInt32NoTag(aHCKEKMDMLJ_.getInt(i));
      }
      if (getEELEBKMIBBKList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(eELEBKMIBBKMemoizedSerializedSize);
      }
      for (int i = 0; i < eELEBKMIBBK_.size(); i++) {
        output.writeUInt32NoTag(eELEBKMIBBK_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eJKLKNPMHMC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, eJKLKNPMHMC_);
      }
      if (faceType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, faceType_);
      }
      if (num_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, num_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cardId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < aHCKEKMDMLJ_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(aHCKEKMDMLJ_.getInt(i));
        }
        size += dataSize;
        if (!getAHCKEKMDMLJList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        aHCKEKMDMLJMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < eELEBKMIBBK_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(eELEBKMIBBK_.getInt(i));
        }
        size += dataSize;
        if (!getEELEBKMIBBKList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        eELEBKMIBBKMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP other = (emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (!getEELEBKMIBBKList()
          .equals(other.getEELEBKMIBBKList())) return false;
      if (getFaceType()
          != other.getFaceType()) return false;
      if (!getAHCKEKMDMLJList()
          .equals(other.getAHCKEKMDMLJList())) return false;
      if (getNum()
          != other.getNum()) return false;
      if (getEJKLKNPMHMC()
          != other.getEJKLKNPMHMC()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      if (getEELEBKMIBBKCount() > 0) {
        hash = (37 * hash) + EELEBKMIBBK_FIELD_NUMBER;
        hash = (53 * hash) + getEELEBKMIBBKList().hashCode();
      }
      hash = (37 * hash) + FACE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFaceType();
      if (getAHCKEKMDMLJCount() > 0) {
        hash = (37 * hash) + AHCKEKMDMLJ_FIELD_NUMBER;
        hash = (53 * hash) + getAHCKEKMDMLJList().hashCode();
      }
      hash = (37 * hash) + NUM_FIELD_NUMBER;
      hash = (53 * hash) + getNum();
      hash = (37 * hash) + EJKLKNPMHMC_FIELD_NUMBER;
      hash = (53 * hash) + getEJKLKNPMHMC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP prototype) {
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
     * Name: MFAFMALBKAP
     * </pre>
     *
     * Protobuf type {@code MFAFMALBKAP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MFAFMALBKAP)
        emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.internal_static_MFAFMALBKAP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.internal_static_MFAFMALBKAP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP.class, emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP.newBuilder()
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
        cardId_ = 0;

        eELEBKMIBBK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        faceType_ = 0;

        aHCKEKMDMLJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        num_ = 0;

        eJKLKNPMHMC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.internal_static_MFAFMALBKAP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP build() {
        emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP buildPartial() {
        emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP result = new emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP(this);
        int from_bitField0_ = bitField0_;
        result.cardId_ = cardId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          eELEBKMIBBK_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.eELEBKMIBBK_ = eELEBKMIBBK_;
        result.faceType_ = faceType_;
        if (((bitField0_ & 0x00000002) != 0)) {
          aHCKEKMDMLJ_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.aHCKEKMDMLJ_ = aHCKEKMDMLJ_;
        result.num_ = num_;
        result.eJKLKNPMHMC_ = eJKLKNPMHMC_;
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
        if (other instanceof emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP) {
          return mergeFrom((emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP other) {
        if (other == emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (!other.eELEBKMIBBK_.isEmpty()) {
          if (eELEBKMIBBK_.isEmpty()) {
            eELEBKMIBBK_ = other.eELEBKMIBBK_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEELEBKMIBBKIsMutable();
            eELEBKMIBBK_.addAll(other.eELEBKMIBBK_);
          }
          onChanged();
        }
        if (other.getFaceType() != 0) {
          setFaceType(other.getFaceType());
        }
        if (!other.aHCKEKMDMLJ_.isEmpty()) {
          if (aHCKEKMDMLJ_.isEmpty()) {
            aHCKEKMDMLJ_ = other.aHCKEKMDMLJ_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAHCKEKMDMLJIsMutable();
            aHCKEKMDMLJ_.addAll(other.aHCKEKMDMLJ_);
          }
          onChanged();
        }
        if (other.getNum() != 0) {
          setNum(other.getNum());
        }
        if (other.getEJKLKNPMHMC() != 0) {
          setEJKLKNPMHMC(other.getEJKLKNPMHMC());
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
        emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 9;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 9;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList eELEBKMIBBK_ = emptyIntList();
      private void ensureEELEBKMIBBKIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          eELEBKMIBBK_ = mutableCopy(eELEBKMIBBK_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 EELEBKMIBBK = 15;</code>
       * @return A list containing the eELEBKMIBBK.
       */
      public java.util.List<java.lang.Integer>
          getEELEBKMIBBKList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(eELEBKMIBBK_) : eELEBKMIBBK_;
      }
      /**
       * <code>repeated uint32 EELEBKMIBBK = 15;</code>
       * @return The count of eELEBKMIBBK.
       */
      public int getEELEBKMIBBKCount() {
        return eELEBKMIBBK_.size();
      }
      /**
       * <code>repeated uint32 EELEBKMIBBK = 15;</code>
       * @param index The index of the element to return.
       * @return The eELEBKMIBBK at the given index.
       */
      public int getEELEBKMIBBK(int index) {
        return eELEBKMIBBK_.getInt(index);
      }
      /**
       * <code>repeated uint32 EELEBKMIBBK = 15;</code>
       * @param index The index to set the value at.
       * @param value The eELEBKMIBBK to set.
       * @return This builder for chaining.
       */
      public Builder setEELEBKMIBBK(
          int index, int value) {
        ensureEELEBKMIBBKIsMutable();
        eELEBKMIBBK_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 EELEBKMIBBK = 15;</code>
       * @param value The eELEBKMIBBK to add.
       * @return This builder for chaining.
       */
      public Builder addEELEBKMIBBK(int value) {
        ensureEELEBKMIBBKIsMutable();
        eELEBKMIBBK_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 EELEBKMIBBK = 15;</code>
       * @param values The eELEBKMIBBK to add.
       * @return This builder for chaining.
       */
      public Builder addAllEELEBKMIBBK(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEELEBKMIBBKIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eELEBKMIBBK_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 EELEBKMIBBK = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEELEBKMIBBK() {
        eELEBKMIBBK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int faceType_ ;
      /**
       * <code>uint32 face_type = 2;</code>
       * @return The faceType.
       */
      @java.lang.Override
      public int getFaceType() {
        return faceType_;
      }
      /**
       * <code>uint32 face_type = 2;</code>
       * @param value The faceType to set.
       * @return This builder for chaining.
       */
      public Builder setFaceType(int value) {
        
        faceType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 face_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceType() {
        
        faceType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList aHCKEKMDMLJ_ = emptyIntList();
      private void ensureAHCKEKMDMLJIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          aHCKEKMDMLJ_ = mutableCopy(aHCKEKMDMLJ_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
       * @return A list containing the aHCKEKMDMLJ.
       */
      public java.util.List<java.lang.Integer>
          getAHCKEKMDMLJList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(aHCKEKMDMLJ_) : aHCKEKMDMLJ_;
      }
      /**
       * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
       * @return The count of aHCKEKMDMLJ.
       */
      public int getAHCKEKMDMLJCount() {
        return aHCKEKMDMLJ_.size();
      }
      /**
       * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
       * @param index The index of the element to return.
       * @return The aHCKEKMDMLJ at the given index.
       */
      public int getAHCKEKMDMLJ(int index) {
        return aHCKEKMDMLJ_.getInt(index);
      }
      /**
       * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
       * @param index The index to set the value at.
       * @param value The aHCKEKMDMLJ to set.
       * @return This builder for chaining.
       */
      public Builder setAHCKEKMDMLJ(
          int index, int value) {
        ensureAHCKEKMDMLJIsMutable();
        aHCKEKMDMLJ_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
       * @param value The aHCKEKMDMLJ to add.
       * @return This builder for chaining.
       */
      public Builder addAHCKEKMDMLJ(int value) {
        ensureAHCKEKMDMLJIsMutable();
        aHCKEKMDMLJ_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
       * @param values The aHCKEKMDMLJ to add.
       * @return This builder for chaining.
       */
      public Builder addAllAHCKEKMDMLJ(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAHCKEKMDMLJIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aHCKEKMDMLJ_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 AHCKEKMDMLJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAHCKEKMDMLJ() {
        aHCKEKMDMLJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int num_ ;
      /**
       * <code>uint32 num = 7;</code>
       * @return The num.
       */
      @java.lang.Override
      public int getNum() {
        return num_;
      }
      /**
       * <code>uint32 num = 7;</code>
       * @param value The num to set.
       * @return This builder for chaining.
       */
      public Builder setNum(int value) {
        
        num_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 num = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearNum() {
        
        num_ = 0;
        onChanged();
        return this;
      }

      private int eJKLKNPMHMC_ ;
      /**
       * <code>uint32 EJKLKNPMHMC = 1;</code>
       * @return The eJKLKNPMHMC.
       */
      @java.lang.Override
      public int getEJKLKNPMHMC() {
        return eJKLKNPMHMC_;
      }
      /**
       * <code>uint32 EJKLKNPMHMC = 1;</code>
       * @param value The eJKLKNPMHMC to set.
       * @return This builder for chaining.
       */
      public Builder setEJKLKNPMHMC(int value) {
        
        eJKLKNPMHMC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EJKLKNPMHMC = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEJKLKNPMHMC() {
        
        eJKLKNPMHMC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MFAFMALBKAP)
    }

    // @@protoc_insertion_point(class_scope:MFAFMALBKAP)
    private static final emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP();
    }

    public static emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MFAFMALBKAP>
        PARSER = new com.google.protobuf.AbstractParser<MFAFMALBKAP>() {
      @java.lang.Override
      public MFAFMALBKAP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MFAFMALBKAP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MFAFMALBKAP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MFAFMALBKAP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MFAFMALBKAPOuterClass.MFAFMALBKAP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MFAFMALBKAP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MFAFMALBKAP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MFAFMALBKAP.proto\"}\n\013MFAFMALBKAP\022\017\n\007ca" +
      "rd_id\030\t \001(\r\022\023\n\013EELEBKMIBBK\030\017 \003(\r\022\021\n\tface" +
      "_type\030\002 \001(\r\022\023\n\013AHCKEKMDMLJ\030\016 \003(\r\022\013\n\003num\030" +
      "\007 \001(\r\022\023\n\013EJKLKNPMHMC\030\001 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MFAFMALBKAP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MFAFMALBKAP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MFAFMALBKAP_descriptor,
        new java.lang.String[] { "CardId", "EELEBKMIBBK", "FaceType", "AHCKEKMDMLJ", "Num", "EJKLKNPMHMC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
