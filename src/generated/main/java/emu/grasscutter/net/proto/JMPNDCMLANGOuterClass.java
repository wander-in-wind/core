// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JMPNDCMLANG.proto

package emu.grasscutter.net.proto;

public final class JMPNDCMLANGOuterClass {
  private JMPNDCMLANGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JMPNDCMLANGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JMPNDCMLANG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
     * @return A list containing the mBAHMIFNCEP.
     */
    java.util.List<java.lang.Integer> getMBAHMIFNCEPList();
    /**
     * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
     * @return The count of mBAHMIFNCEP.
     */
    int getMBAHMIFNCEPCount();
    /**
     * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
     * @param index The index of the element to return.
     * @return The mBAHMIFNCEP at the given index.
     */
    int getMBAHMIFNCEP(int index);

    /**
     * <code>repeated uint32 LDDHBPFALPI = 4;</code>
     * @return A list containing the lDDHBPFALPI.
     */
    java.util.List<java.lang.Integer> getLDDHBPFALPIList();
    /**
     * <code>repeated uint32 LDDHBPFALPI = 4;</code>
     * @return The count of lDDHBPFALPI.
     */
    int getLDDHBPFALPICount();
    /**
     * <code>repeated uint32 LDDHBPFALPI = 4;</code>
     * @param index The index of the element to return.
     * @return The lDDHBPFALPI at the given index.
     */
    int getLDDHBPFALPI(int index);
  }
  /**
   * Protobuf type {@code JMPNDCMLANG}
   */
  public static final class JMPNDCMLANG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JMPNDCMLANG)
      JMPNDCMLANGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JMPNDCMLANG.newBuilder() to construct.
    private JMPNDCMLANG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JMPNDCMLANG() {
      mBAHMIFNCEP_ = emptyIntList();
      lDDHBPFALPI_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JMPNDCMLANG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JMPNDCMLANG(
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
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                lDDHBPFALPI_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              lDDHBPFALPI_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                lDDHBPFALPI_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                lDDHBPFALPI_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mBAHMIFNCEP_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              mBAHMIFNCEP_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                mBAHMIFNCEP_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                mBAHMIFNCEP_.addInt(input.readUInt32());
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
          lDDHBPFALPI_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          mBAHMIFNCEP_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.internal_static_JMPNDCMLANG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.internal_static_JMPNDCMLANG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG.class, emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG.Builder.class);
    }

    public static final int MBAHMIFNCEP_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList mBAHMIFNCEP_;
    /**
     * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
     * @return A list containing the mBAHMIFNCEP.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMBAHMIFNCEPList() {
      return mBAHMIFNCEP_;
    }
    /**
     * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
     * @return The count of mBAHMIFNCEP.
     */
    public int getMBAHMIFNCEPCount() {
      return mBAHMIFNCEP_.size();
    }
    /**
     * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
     * @param index The index of the element to return.
     * @return The mBAHMIFNCEP at the given index.
     */
    public int getMBAHMIFNCEP(int index) {
      return mBAHMIFNCEP_.getInt(index);
    }
    private int mBAHMIFNCEPMemoizedSerializedSize = -1;

    public static final int LDDHBPFALPI_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList lDDHBPFALPI_;
    /**
     * <code>repeated uint32 LDDHBPFALPI = 4;</code>
     * @return A list containing the lDDHBPFALPI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLDDHBPFALPIList() {
      return lDDHBPFALPI_;
    }
    /**
     * <code>repeated uint32 LDDHBPFALPI = 4;</code>
     * @return The count of lDDHBPFALPI.
     */
    public int getLDDHBPFALPICount() {
      return lDDHBPFALPI_.size();
    }
    /**
     * <code>repeated uint32 LDDHBPFALPI = 4;</code>
     * @param index The index of the element to return.
     * @return The lDDHBPFALPI at the given index.
     */
    public int getLDDHBPFALPI(int index) {
      return lDDHBPFALPI_.getInt(index);
    }
    private int lDDHBPFALPIMemoizedSerializedSize = -1;

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
      if (getLDDHBPFALPIList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(lDDHBPFALPIMemoizedSerializedSize);
      }
      for (int i = 0; i < lDDHBPFALPI_.size(); i++) {
        output.writeUInt32NoTag(lDDHBPFALPI_.getInt(i));
      }
      if (getMBAHMIFNCEPList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(mBAHMIFNCEPMemoizedSerializedSize);
      }
      for (int i = 0; i < mBAHMIFNCEP_.size(); i++) {
        output.writeUInt32NoTag(mBAHMIFNCEP_.getInt(i));
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
        for (int i = 0; i < lDDHBPFALPI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(lDDHBPFALPI_.getInt(i));
        }
        size += dataSize;
        if (!getLDDHBPFALPIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lDDHBPFALPIMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mBAHMIFNCEP_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mBAHMIFNCEP_.getInt(i));
        }
        size += dataSize;
        if (!getMBAHMIFNCEPList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mBAHMIFNCEPMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG other = (emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG) obj;

      if (!getMBAHMIFNCEPList()
          .equals(other.getMBAHMIFNCEPList())) return false;
      if (!getLDDHBPFALPIList()
          .equals(other.getLDDHBPFALPIList())) return false;
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
      if (getMBAHMIFNCEPCount() > 0) {
        hash = (37 * hash) + MBAHMIFNCEP_FIELD_NUMBER;
        hash = (53 * hash) + getMBAHMIFNCEPList().hashCode();
      }
      if (getLDDHBPFALPICount() > 0) {
        hash = (37 * hash) + LDDHBPFALPI_FIELD_NUMBER;
        hash = (53 * hash) + getLDDHBPFALPIList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG prototype) {
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
     * Protobuf type {@code JMPNDCMLANG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JMPNDCMLANG)
        emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.internal_static_JMPNDCMLANG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.internal_static_JMPNDCMLANG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG.class, emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG.newBuilder()
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
        mBAHMIFNCEP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        lDDHBPFALPI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.internal_static_JMPNDCMLANG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG build() {
        emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG buildPartial() {
        emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG result = new emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          mBAHMIFNCEP_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mBAHMIFNCEP_ = mBAHMIFNCEP_;
        if (((bitField0_ & 0x00000002) != 0)) {
          lDDHBPFALPI_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.lDDHBPFALPI_ = lDDHBPFALPI_;
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
        if (other instanceof emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG) {
          return mergeFrom((emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG other) {
        if (other == emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG.getDefaultInstance()) return this;
        if (!other.mBAHMIFNCEP_.isEmpty()) {
          if (mBAHMIFNCEP_.isEmpty()) {
            mBAHMIFNCEP_ = other.mBAHMIFNCEP_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMBAHMIFNCEPIsMutable();
            mBAHMIFNCEP_.addAll(other.mBAHMIFNCEP_);
          }
          onChanged();
        }
        if (!other.lDDHBPFALPI_.isEmpty()) {
          if (lDDHBPFALPI_.isEmpty()) {
            lDDHBPFALPI_ = other.lDDHBPFALPI_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLDDHBPFALPIIsMutable();
            lDDHBPFALPI_.addAll(other.lDDHBPFALPI_);
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
        emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList mBAHMIFNCEP_ = emptyIntList();
      private void ensureMBAHMIFNCEPIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mBAHMIFNCEP_ = mutableCopy(mBAHMIFNCEP_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
       * @return A list containing the mBAHMIFNCEP.
       */
      public java.util.List<java.lang.Integer>
          getMBAHMIFNCEPList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mBAHMIFNCEP_) : mBAHMIFNCEP_;
      }
      /**
       * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
       * @return The count of mBAHMIFNCEP.
       */
      public int getMBAHMIFNCEPCount() {
        return mBAHMIFNCEP_.size();
      }
      /**
       * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
       * @param index The index of the element to return.
       * @return The mBAHMIFNCEP at the given index.
       */
      public int getMBAHMIFNCEP(int index) {
        return mBAHMIFNCEP_.getInt(index);
      }
      /**
       * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
       * @param index The index to set the value at.
       * @param value The mBAHMIFNCEP to set.
       * @return This builder for chaining.
       */
      public Builder setMBAHMIFNCEP(
          int index, int value) {
        ensureMBAHMIFNCEPIsMutable();
        mBAHMIFNCEP_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
       * @param value The mBAHMIFNCEP to add.
       * @return This builder for chaining.
       */
      public Builder addMBAHMIFNCEP(int value) {
        ensureMBAHMIFNCEPIsMutable();
        mBAHMIFNCEP_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
       * @param values The mBAHMIFNCEP to add.
       * @return This builder for chaining.
       */
      public Builder addAllMBAHMIFNCEP(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMBAHMIFNCEPIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mBAHMIFNCEP_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MBAHMIFNCEP = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMBAHMIFNCEP() {
        mBAHMIFNCEP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList lDDHBPFALPI_ = emptyIntList();
      private void ensureLDDHBPFALPIIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          lDDHBPFALPI_ = mutableCopy(lDDHBPFALPI_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 LDDHBPFALPI = 4;</code>
       * @return A list containing the lDDHBPFALPI.
       */
      public java.util.List<java.lang.Integer>
          getLDDHBPFALPIList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(lDDHBPFALPI_) : lDDHBPFALPI_;
      }
      /**
       * <code>repeated uint32 LDDHBPFALPI = 4;</code>
       * @return The count of lDDHBPFALPI.
       */
      public int getLDDHBPFALPICount() {
        return lDDHBPFALPI_.size();
      }
      /**
       * <code>repeated uint32 LDDHBPFALPI = 4;</code>
       * @param index The index of the element to return.
       * @return The lDDHBPFALPI at the given index.
       */
      public int getLDDHBPFALPI(int index) {
        return lDDHBPFALPI_.getInt(index);
      }
      /**
       * <code>repeated uint32 LDDHBPFALPI = 4;</code>
       * @param index The index to set the value at.
       * @param value The lDDHBPFALPI to set.
       * @return This builder for chaining.
       */
      public Builder setLDDHBPFALPI(
          int index, int value) {
        ensureLDDHBPFALPIIsMutable();
        lDDHBPFALPI_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LDDHBPFALPI = 4;</code>
       * @param value The lDDHBPFALPI to add.
       * @return This builder for chaining.
       */
      public Builder addLDDHBPFALPI(int value) {
        ensureLDDHBPFALPIIsMutable();
        lDDHBPFALPI_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LDDHBPFALPI = 4;</code>
       * @param values The lDDHBPFALPI to add.
       * @return This builder for chaining.
       */
      public Builder addAllLDDHBPFALPI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLDDHBPFALPIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lDDHBPFALPI_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LDDHBPFALPI = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLDDHBPFALPI() {
        lDDHBPFALPI_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:JMPNDCMLANG)
    }

    // @@protoc_insertion_point(class_scope:JMPNDCMLANG)
    private static final emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG();
    }

    public static emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JMPNDCMLANG>
        PARSER = new com.google.protobuf.AbstractParser<JMPNDCMLANG>() {
      @java.lang.Override
      public JMPNDCMLANG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JMPNDCMLANG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JMPNDCMLANG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JMPNDCMLANG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JMPNDCMLANGOuterClass.JMPNDCMLANG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JMPNDCMLANG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JMPNDCMLANG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JMPNDCMLANG.proto\"7\n\013JMPNDCMLANG\022\023\n\013MB" +
      "AHMIFNCEP\030\014 \003(\r\022\023\n\013LDDHBPFALPI\030\004 \003(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JMPNDCMLANG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JMPNDCMLANG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JMPNDCMLANG_descriptor,
        new java.lang.String[] { "MBAHMIFNCEP", "LDDHBPFALPI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
