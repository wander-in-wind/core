// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CMGBHAALJIJ.proto

package emu.grasscutter.net.proto;

public final class CMGBHAALJIJOuterClass {
  private CMGBHAALJIJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CMGBHAALJIJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CMGBHAALJIJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 JNLFELKMPPM = 12;</code>
     * @return A list containing the jNLFELKMPPM.
     */
    java.util.List<java.lang.Integer> getJNLFELKMPPMList();
    /**
     * <code>repeated uint32 JNLFELKMPPM = 12;</code>
     * @return The count of jNLFELKMPPM.
     */
    int getJNLFELKMPPMCount();
    /**
     * <code>repeated uint32 JNLFELKMPPM = 12;</code>
     * @param index The index of the element to return.
     * @return The jNLFELKMPPM at the given index.
     */
    int getJNLFELKMPPM(int index);

    /**
     * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
     * @return A list containing the nFJHJMKEAEH.
     */
    java.util.List<java.lang.Integer> getNFJHJMKEAEHList();
    /**
     * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
     * @return The count of nFJHJMKEAEH.
     */
    int getNFJHJMKEAEHCount();
    /**
     * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
     * @param index The index of the element to return.
     * @return The nFJHJMKEAEH at the given index.
     */
    int getNFJHJMKEAEH(int index);

    /**
     * <code>uint32 level_id = 9;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 22877
   * Name: CMGBHAALJIJ
   * </pre>
   *
   * Protobuf type {@code CMGBHAALJIJ}
   */
  public static final class CMGBHAALJIJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CMGBHAALJIJ)
      CMGBHAALJIJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CMGBHAALJIJ.newBuilder() to construct.
    private CMGBHAALJIJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CMGBHAALJIJ() {
      jNLFELKMPPM_ = emptyIntList();
      nFJHJMKEAEH_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CMGBHAALJIJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CMGBHAALJIJ(
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
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                nFJHJMKEAEH_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              nFJHJMKEAEH_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                nFJHJMKEAEH_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                nFJHJMKEAEH_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              levelId_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                jNLFELKMPPM_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              jNLFELKMPPM_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                jNLFELKMPPM_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                jNLFELKMPPM_.addInt(input.readUInt32());
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
          nFJHJMKEAEH_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          jNLFELKMPPM_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.internal_static_CMGBHAALJIJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.internal_static_CMGBHAALJIJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ.class, emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ.Builder.class);
    }

    public static final int JNLFELKMPPM_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList jNLFELKMPPM_;
    /**
     * <code>repeated uint32 JNLFELKMPPM = 12;</code>
     * @return A list containing the jNLFELKMPPM.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getJNLFELKMPPMList() {
      return jNLFELKMPPM_;
    }
    /**
     * <code>repeated uint32 JNLFELKMPPM = 12;</code>
     * @return The count of jNLFELKMPPM.
     */
    public int getJNLFELKMPPMCount() {
      return jNLFELKMPPM_.size();
    }
    /**
     * <code>repeated uint32 JNLFELKMPPM = 12;</code>
     * @param index The index of the element to return.
     * @return The jNLFELKMPPM at the given index.
     */
    public int getJNLFELKMPPM(int index) {
      return jNLFELKMPPM_.getInt(index);
    }
    private int jNLFELKMPPMMemoizedSerializedSize = -1;

    public static final int NFJHJMKEAEH_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList nFJHJMKEAEH_;
    /**
     * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
     * @return A list containing the nFJHJMKEAEH.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getNFJHJMKEAEHList() {
      return nFJHJMKEAEH_;
    }
    /**
     * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
     * @return The count of nFJHJMKEAEH.
     */
    public int getNFJHJMKEAEHCount() {
      return nFJHJMKEAEH_.size();
    }
    /**
     * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
     * @param index The index of the element to return.
     * @return The nFJHJMKEAEH at the given index.
     */
    public int getNFJHJMKEAEH(int index) {
      return nFJHJMKEAEH_.getInt(index);
    }
    private int nFJHJMKEAEHMemoizedSerializedSize = -1;

    public static final int LEVEL_ID_FIELD_NUMBER = 9;
    private int levelId_;
    /**
     * <code>uint32 level_id = 9;</code>
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
      if (getNFJHJMKEAEHList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(nFJHJMKEAEHMemoizedSerializedSize);
      }
      for (int i = 0; i < nFJHJMKEAEH_.size(); i++) {
        output.writeUInt32NoTag(nFJHJMKEAEH_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(9, levelId_);
      }
      if (getJNLFELKMPPMList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(jNLFELKMPPMMemoizedSerializedSize);
      }
      for (int i = 0; i < jNLFELKMPPM_.size(); i++) {
        output.writeUInt32NoTag(jNLFELKMPPM_.getInt(i));
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
        for (int i = 0; i < nFJHJMKEAEH_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(nFJHJMKEAEH_.getInt(i));
        }
        size += dataSize;
        if (!getNFJHJMKEAEHList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        nFJHJMKEAEHMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < jNLFELKMPPM_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(jNLFELKMPPM_.getInt(i));
        }
        size += dataSize;
        if (!getJNLFELKMPPMList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        jNLFELKMPPMMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ other = (emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ) obj;

      if (!getJNLFELKMPPMList()
          .equals(other.getJNLFELKMPPMList())) return false;
      if (!getNFJHJMKEAEHList()
          .equals(other.getNFJHJMKEAEHList())) return false;
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
      if (getJNLFELKMPPMCount() > 0) {
        hash = (37 * hash) + JNLFELKMPPM_FIELD_NUMBER;
        hash = (53 * hash) + getJNLFELKMPPMList().hashCode();
      }
      if (getNFJHJMKEAEHCount() > 0) {
        hash = (37 * hash) + NFJHJMKEAEH_FIELD_NUMBER;
        hash = (53 * hash) + getNFJHJMKEAEHList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ prototype) {
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
     * CmdId: 22877
     * Name: CMGBHAALJIJ
     * </pre>
     *
     * Protobuf type {@code CMGBHAALJIJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CMGBHAALJIJ)
        emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.internal_static_CMGBHAALJIJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.internal_static_CMGBHAALJIJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ.class, emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ.newBuilder()
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
        jNLFELKMPPM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        nFJHJMKEAEH_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.internal_static_CMGBHAALJIJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ build() {
        emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ buildPartial() {
        emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ result = new emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          jNLFELKMPPM_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jNLFELKMPPM_ = jNLFELKMPPM_;
        if (((bitField0_ & 0x00000002) != 0)) {
          nFJHJMKEAEH_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.nFJHJMKEAEH_ = nFJHJMKEAEH_;
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
        if (other instanceof emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ) {
          return mergeFrom((emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ other) {
        if (other == emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ.getDefaultInstance()) return this;
        if (!other.jNLFELKMPPM_.isEmpty()) {
          if (jNLFELKMPPM_.isEmpty()) {
            jNLFELKMPPM_ = other.jNLFELKMPPM_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJNLFELKMPPMIsMutable();
            jNLFELKMPPM_.addAll(other.jNLFELKMPPM_);
          }
          onChanged();
        }
        if (!other.nFJHJMKEAEH_.isEmpty()) {
          if (nFJHJMKEAEH_.isEmpty()) {
            nFJHJMKEAEH_ = other.nFJHJMKEAEH_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNFJHJMKEAEHIsMutable();
            nFJHJMKEAEH_.addAll(other.nFJHJMKEAEH_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList jNLFELKMPPM_ = emptyIntList();
      private void ensureJNLFELKMPPMIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          jNLFELKMPPM_ = mutableCopy(jNLFELKMPPM_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 JNLFELKMPPM = 12;</code>
       * @return A list containing the jNLFELKMPPM.
       */
      public java.util.List<java.lang.Integer>
          getJNLFELKMPPMList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(jNLFELKMPPM_) : jNLFELKMPPM_;
      }
      /**
       * <code>repeated uint32 JNLFELKMPPM = 12;</code>
       * @return The count of jNLFELKMPPM.
       */
      public int getJNLFELKMPPMCount() {
        return jNLFELKMPPM_.size();
      }
      /**
       * <code>repeated uint32 JNLFELKMPPM = 12;</code>
       * @param index The index of the element to return.
       * @return The jNLFELKMPPM at the given index.
       */
      public int getJNLFELKMPPM(int index) {
        return jNLFELKMPPM_.getInt(index);
      }
      /**
       * <code>repeated uint32 JNLFELKMPPM = 12;</code>
       * @param index The index to set the value at.
       * @param value The jNLFELKMPPM to set.
       * @return This builder for chaining.
       */
      public Builder setJNLFELKMPPM(
          int index, int value) {
        ensureJNLFELKMPPMIsMutable();
        jNLFELKMPPM_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JNLFELKMPPM = 12;</code>
       * @param value The jNLFELKMPPM to add.
       * @return This builder for chaining.
       */
      public Builder addJNLFELKMPPM(int value) {
        ensureJNLFELKMPPMIsMutable();
        jNLFELKMPPM_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JNLFELKMPPM = 12;</code>
       * @param values The jNLFELKMPPM to add.
       * @return This builder for chaining.
       */
      public Builder addAllJNLFELKMPPM(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureJNLFELKMPPMIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jNLFELKMPPM_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JNLFELKMPPM = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearJNLFELKMPPM() {
        jNLFELKMPPM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList nFJHJMKEAEH_ = emptyIntList();
      private void ensureNFJHJMKEAEHIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          nFJHJMKEAEH_ = mutableCopy(nFJHJMKEAEH_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
       * @return A list containing the nFJHJMKEAEH.
       */
      public java.util.List<java.lang.Integer>
          getNFJHJMKEAEHList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(nFJHJMKEAEH_) : nFJHJMKEAEH_;
      }
      /**
       * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
       * @return The count of nFJHJMKEAEH.
       */
      public int getNFJHJMKEAEHCount() {
        return nFJHJMKEAEH_.size();
      }
      /**
       * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
       * @param index The index of the element to return.
       * @return The nFJHJMKEAEH at the given index.
       */
      public int getNFJHJMKEAEH(int index) {
        return nFJHJMKEAEH_.getInt(index);
      }
      /**
       * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
       * @param index The index to set the value at.
       * @param value The nFJHJMKEAEH to set.
       * @return This builder for chaining.
       */
      public Builder setNFJHJMKEAEH(
          int index, int value) {
        ensureNFJHJMKEAEHIsMutable();
        nFJHJMKEAEH_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
       * @param value The nFJHJMKEAEH to add.
       * @return This builder for chaining.
       */
      public Builder addNFJHJMKEAEH(int value) {
        ensureNFJHJMKEAEHIsMutable();
        nFJHJMKEAEH_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
       * @param values The nFJHJMKEAEH to add.
       * @return This builder for chaining.
       */
      public Builder addAllNFJHJMKEAEH(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureNFJHJMKEAEHIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nFJHJMKEAEH_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 NFJHJMKEAEH = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNFJHJMKEAEH() {
        nFJHJMKEAEH_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 9;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 9;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 9;</code>
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


      // @@protoc_insertion_point(builder_scope:CMGBHAALJIJ)
    }

    // @@protoc_insertion_point(class_scope:CMGBHAALJIJ)
    private static final emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ();
    }

    public static emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CMGBHAALJIJ>
        PARSER = new com.google.protobuf.AbstractParser<CMGBHAALJIJ>() {
      @java.lang.Override
      public CMGBHAALJIJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CMGBHAALJIJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CMGBHAALJIJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CMGBHAALJIJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CMGBHAALJIJOuterClass.CMGBHAALJIJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CMGBHAALJIJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CMGBHAALJIJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CMGBHAALJIJ.proto\"I\n\013CMGBHAALJIJ\022\023\n\013JN" +
      "LFELKMPPM\030\014 \003(\r\022\023\n\013NFJHJMKEAEH\030\006 \003(\r\022\020\n\010" +
      "level_id\030\t \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CMGBHAALJIJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CMGBHAALJIJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CMGBHAALJIJ_descriptor,
        new java.lang.String[] { "JNLFELKMPPM", "NFJHJMKEAEH", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
