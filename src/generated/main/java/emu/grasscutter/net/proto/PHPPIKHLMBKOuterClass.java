// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PHPPIKHLMBK.proto

package emu.grasscutter.net.proto;

public final class PHPPIKHLMBKOuterClass {
  private PHPPIKHLMBKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PHPPIKHLMBKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PHPPIKHLMBK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 JNNABCBJFIF = 2;</code>
     * @return A list containing the jNNABCBJFIF.
     */
    java.util.List<java.lang.Integer> getJNNABCBJFIFList();
    /**
     * <code>repeated uint32 JNNABCBJFIF = 2;</code>
     * @return The count of jNNABCBJFIF.
     */
    int getJNNABCBJFIFCount();
    /**
     * <code>repeated uint32 JNNABCBJFIF = 2;</code>
     * @param index The index of the element to return.
     * @return The jNNABCBJFIF at the given index.
     */
    int getJNNABCBJFIF(int index);

    /**
     * <code>repeated uint32 MNNPHOJCILP = 13;</code>
     * @return A list containing the mNNPHOJCILP.
     */
    java.util.List<java.lang.Integer> getMNNPHOJCILPList();
    /**
     * <code>repeated uint32 MNNPHOJCILP = 13;</code>
     * @return The count of mNNPHOJCILP.
     */
    int getMNNPHOJCILPCount();
    /**
     * <code>repeated uint32 MNNPHOJCILP = 13;</code>
     * @param index The index of the element to return.
     * @return The mNNPHOJCILP at the given index.
     */
    int getMNNPHOJCILP(int index);
  }
  /**
   * <pre>
   * Name: PHPPIKHLMBK
   * </pre>
   *
   * Protobuf type {@code PHPPIKHLMBK}
   */
  public static final class PHPPIKHLMBK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PHPPIKHLMBK)
      PHPPIKHLMBKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PHPPIKHLMBK.newBuilder() to construct.
    private PHPPIKHLMBK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PHPPIKHLMBK() {
      jNNABCBJFIF_ = emptyIntList();
      mNNPHOJCILP_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PHPPIKHLMBK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PHPPIKHLMBK(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                jNNABCBJFIF_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              jNNABCBJFIF_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                jNNABCBJFIF_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                jNNABCBJFIF_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                mNNPHOJCILP_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              mNNPHOJCILP_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                mNNPHOJCILP_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                mNNPHOJCILP_.addInt(input.readUInt32());
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
          jNNABCBJFIF_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          mNNPHOJCILP_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.internal_static_PHPPIKHLMBK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.internal_static_PHPPIKHLMBK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK.class, emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK.Builder.class);
    }

    public static final int JNNABCBJFIF_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList jNNABCBJFIF_;
    /**
     * <code>repeated uint32 JNNABCBJFIF = 2;</code>
     * @return A list containing the jNNABCBJFIF.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getJNNABCBJFIFList() {
      return jNNABCBJFIF_;
    }
    /**
     * <code>repeated uint32 JNNABCBJFIF = 2;</code>
     * @return The count of jNNABCBJFIF.
     */
    public int getJNNABCBJFIFCount() {
      return jNNABCBJFIF_.size();
    }
    /**
     * <code>repeated uint32 JNNABCBJFIF = 2;</code>
     * @param index The index of the element to return.
     * @return The jNNABCBJFIF at the given index.
     */
    public int getJNNABCBJFIF(int index) {
      return jNNABCBJFIF_.getInt(index);
    }
    private int jNNABCBJFIFMemoizedSerializedSize = -1;

    public static final int MNNPHOJCILP_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList mNNPHOJCILP_;
    /**
     * <code>repeated uint32 MNNPHOJCILP = 13;</code>
     * @return A list containing the mNNPHOJCILP.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMNNPHOJCILPList() {
      return mNNPHOJCILP_;
    }
    /**
     * <code>repeated uint32 MNNPHOJCILP = 13;</code>
     * @return The count of mNNPHOJCILP.
     */
    public int getMNNPHOJCILPCount() {
      return mNNPHOJCILP_.size();
    }
    /**
     * <code>repeated uint32 MNNPHOJCILP = 13;</code>
     * @param index The index of the element to return.
     * @return The mNNPHOJCILP at the given index.
     */
    public int getMNNPHOJCILP(int index) {
      return mNNPHOJCILP_.getInt(index);
    }
    private int mNNPHOJCILPMemoizedSerializedSize = -1;

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
      if (getJNNABCBJFIFList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(jNNABCBJFIFMemoizedSerializedSize);
      }
      for (int i = 0; i < jNNABCBJFIF_.size(); i++) {
        output.writeUInt32NoTag(jNNABCBJFIF_.getInt(i));
      }
      if (getMNNPHOJCILPList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(mNNPHOJCILPMemoizedSerializedSize);
      }
      for (int i = 0; i < mNNPHOJCILP_.size(); i++) {
        output.writeUInt32NoTag(mNNPHOJCILP_.getInt(i));
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
        for (int i = 0; i < jNNABCBJFIF_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(jNNABCBJFIF_.getInt(i));
        }
        size += dataSize;
        if (!getJNNABCBJFIFList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        jNNABCBJFIFMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mNNPHOJCILP_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mNNPHOJCILP_.getInt(i));
        }
        size += dataSize;
        if (!getMNNPHOJCILPList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mNNPHOJCILPMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK other = (emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK) obj;

      if (!getJNNABCBJFIFList()
          .equals(other.getJNNABCBJFIFList())) return false;
      if (!getMNNPHOJCILPList()
          .equals(other.getMNNPHOJCILPList())) return false;
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
      if (getJNNABCBJFIFCount() > 0) {
        hash = (37 * hash) + JNNABCBJFIF_FIELD_NUMBER;
        hash = (53 * hash) + getJNNABCBJFIFList().hashCode();
      }
      if (getMNNPHOJCILPCount() > 0) {
        hash = (37 * hash) + MNNPHOJCILP_FIELD_NUMBER;
        hash = (53 * hash) + getMNNPHOJCILPList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK prototype) {
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
     * Name: PHPPIKHLMBK
     * </pre>
     *
     * Protobuf type {@code PHPPIKHLMBK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PHPPIKHLMBK)
        emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.internal_static_PHPPIKHLMBK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.internal_static_PHPPIKHLMBK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK.class, emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK.newBuilder()
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
        jNNABCBJFIF_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        mNNPHOJCILP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.internal_static_PHPPIKHLMBK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK build() {
        emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK buildPartial() {
        emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK result = new emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          jNNABCBJFIF_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jNNABCBJFIF_ = jNNABCBJFIF_;
        if (((bitField0_ & 0x00000002) != 0)) {
          mNNPHOJCILP_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.mNNPHOJCILP_ = mNNPHOJCILP_;
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
        if (other instanceof emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK) {
          return mergeFrom((emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK other) {
        if (other == emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK.getDefaultInstance()) return this;
        if (!other.jNNABCBJFIF_.isEmpty()) {
          if (jNNABCBJFIF_.isEmpty()) {
            jNNABCBJFIF_ = other.jNNABCBJFIF_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJNNABCBJFIFIsMutable();
            jNNABCBJFIF_.addAll(other.jNNABCBJFIF_);
          }
          onChanged();
        }
        if (!other.mNNPHOJCILP_.isEmpty()) {
          if (mNNPHOJCILP_.isEmpty()) {
            mNNPHOJCILP_ = other.mNNPHOJCILP_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMNNPHOJCILPIsMutable();
            mNNPHOJCILP_.addAll(other.mNNPHOJCILP_);
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
        emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList jNNABCBJFIF_ = emptyIntList();
      private void ensureJNNABCBJFIFIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          jNNABCBJFIF_ = mutableCopy(jNNABCBJFIF_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 JNNABCBJFIF = 2;</code>
       * @return A list containing the jNNABCBJFIF.
       */
      public java.util.List<java.lang.Integer>
          getJNNABCBJFIFList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(jNNABCBJFIF_) : jNNABCBJFIF_;
      }
      /**
       * <code>repeated uint32 JNNABCBJFIF = 2;</code>
       * @return The count of jNNABCBJFIF.
       */
      public int getJNNABCBJFIFCount() {
        return jNNABCBJFIF_.size();
      }
      /**
       * <code>repeated uint32 JNNABCBJFIF = 2;</code>
       * @param index The index of the element to return.
       * @return The jNNABCBJFIF at the given index.
       */
      public int getJNNABCBJFIF(int index) {
        return jNNABCBJFIF_.getInt(index);
      }
      /**
       * <code>repeated uint32 JNNABCBJFIF = 2;</code>
       * @param index The index to set the value at.
       * @param value The jNNABCBJFIF to set.
       * @return This builder for chaining.
       */
      public Builder setJNNABCBJFIF(
          int index, int value) {
        ensureJNNABCBJFIFIsMutable();
        jNNABCBJFIF_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JNNABCBJFIF = 2;</code>
       * @param value The jNNABCBJFIF to add.
       * @return This builder for chaining.
       */
      public Builder addJNNABCBJFIF(int value) {
        ensureJNNABCBJFIFIsMutable();
        jNNABCBJFIF_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JNNABCBJFIF = 2;</code>
       * @param values The jNNABCBJFIF to add.
       * @return This builder for chaining.
       */
      public Builder addAllJNNABCBJFIF(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureJNNABCBJFIFIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jNNABCBJFIF_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JNNABCBJFIF = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearJNNABCBJFIF() {
        jNNABCBJFIF_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList mNNPHOJCILP_ = emptyIntList();
      private void ensureMNNPHOJCILPIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          mNNPHOJCILP_ = mutableCopy(mNNPHOJCILP_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 MNNPHOJCILP = 13;</code>
       * @return A list containing the mNNPHOJCILP.
       */
      public java.util.List<java.lang.Integer>
          getMNNPHOJCILPList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(mNNPHOJCILP_) : mNNPHOJCILP_;
      }
      /**
       * <code>repeated uint32 MNNPHOJCILP = 13;</code>
       * @return The count of mNNPHOJCILP.
       */
      public int getMNNPHOJCILPCount() {
        return mNNPHOJCILP_.size();
      }
      /**
       * <code>repeated uint32 MNNPHOJCILP = 13;</code>
       * @param index The index of the element to return.
       * @return The mNNPHOJCILP at the given index.
       */
      public int getMNNPHOJCILP(int index) {
        return mNNPHOJCILP_.getInt(index);
      }
      /**
       * <code>repeated uint32 MNNPHOJCILP = 13;</code>
       * @param index The index to set the value at.
       * @param value The mNNPHOJCILP to set.
       * @return This builder for chaining.
       */
      public Builder setMNNPHOJCILP(
          int index, int value) {
        ensureMNNPHOJCILPIsMutable();
        mNNPHOJCILP_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MNNPHOJCILP = 13;</code>
       * @param value The mNNPHOJCILP to add.
       * @return This builder for chaining.
       */
      public Builder addMNNPHOJCILP(int value) {
        ensureMNNPHOJCILPIsMutable();
        mNNPHOJCILP_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MNNPHOJCILP = 13;</code>
       * @param values The mNNPHOJCILP to add.
       * @return This builder for chaining.
       */
      public Builder addAllMNNPHOJCILP(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMNNPHOJCILPIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mNNPHOJCILP_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MNNPHOJCILP = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMNNPHOJCILP() {
        mNNPHOJCILP_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:PHPPIKHLMBK)
    }

    // @@protoc_insertion_point(class_scope:PHPPIKHLMBK)
    private static final emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK();
    }

    public static emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PHPPIKHLMBK>
        PARSER = new com.google.protobuf.AbstractParser<PHPPIKHLMBK>() {
      @java.lang.Override
      public PHPPIKHLMBK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PHPPIKHLMBK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PHPPIKHLMBK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PHPPIKHLMBK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PHPPIKHLMBKOuterClass.PHPPIKHLMBK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PHPPIKHLMBK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PHPPIKHLMBK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PHPPIKHLMBK.proto\"7\n\013PHPPIKHLMBK\022\023\n\013JN" +
      "NABCBJFIF\030\002 \003(\r\022\023\n\013MNNPHOJCILP\030\r \003(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PHPPIKHLMBK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PHPPIKHLMBK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PHPPIKHLMBK_descriptor,
        new java.lang.String[] { "JNNABCBJFIF", "MNNPHOJCILP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
