// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MBLNIKHFGKN.proto

package emu.grasscutter.net.proto;

public final class MBLNIKHFGKNOuterClass {
  private MBLNIKHFGKNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MBLNIKHFGKNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MBLNIKHFGKN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 INLGCJEOHJI = 1;</code>
     * @return A list containing the iNLGCJEOHJI.
     */
    java.util.List<java.lang.Integer> getINLGCJEOHJIList();
    /**
     * <code>repeated uint32 INLGCJEOHJI = 1;</code>
     * @return The count of iNLGCJEOHJI.
     */
    int getINLGCJEOHJICount();
    /**
     * <code>repeated uint32 INLGCJEOHJI = 1;</code>
     * @param index The index of the element to return.
     * @return The iNLGCJEOHJI at the given index.
     */
    int getINLGCJEOHJI(int index);
  }
  /**
   * <pre>
   * Name: MBLNIKHFGKN
   * </pre>
   *
   * Protobuf type {@code MBLNIKHFGKN}
   */
  public static final class MBLNIKHFGKN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MBLNIKHFGKN)
      MBLNIKHFGKNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MBLNIKHFGKN.newBuilder() to construct.
    private MBLNIKHFGKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MBLNIKHFGKN() {
      iNLGCJEOHJI_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MBLNIKHFGKN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MBLNIKHFGKN(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                iNLGCJEOHJI_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              iNLGCJEOHJI_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                iNLGCJEOHJI_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                iNLGCJEOHJI_.addInt(input.readUInt32());
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
          iNLGCJEOHJI_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.internal_static_MBLNIKHFGKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.internal_static_MBLNIKHFGKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN.class, emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN.Builder.class);
    }

    public static final int INLGCJEOHJI_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList iNLGCJEOHJI_;
    /**
     * <code>repeated uint32 INLGCJEOHJI = 1;</code>
     * @return A list containing the iNLGCJEOHJI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getINLGCJEOHJIList() {
      return iNLGCJEOHJI_;
    }
    /**
     * <code>repeated uint32 INLGCJEOHJI = 1;</code>
     * @return The count of iNLGCJEOHJI.
     */
    public int getINLGCJEOHJICount() {
      return iNLGCJEOHJI_.size();
    }
    /**
     * <code>repeated uint32 INLGCJEOHJI = 1;</code>
     * @param index The index of the element to return.
     * @return The iNLGCJEOHJI at the given index.
     */
    public int getINLGCJEOHJI(int index) {
      return iNLGCJEOHJI_.getInt(index);
    }
    private int iNLGCJEOHJIMemoizedSerializedSize = -1;

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
      if (getINLGCJEOHJIList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(iNLGCJEOHJIMemoizedSerializedSize);
      }
      for (int i = 0; i < iNLGCJEOHJI_.size(); i++) {
        output.writeUInt32NoTag(iNLGCJEOHJI_.getInt(i));
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
        for (int i = 0; i < iNLGCJEOHJI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(iNLGCJEOHJI_.getInt(i));
        }
        size += dataSize;
        if (!getINLGCJEOHJIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        iNLGCJEOHJIMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN other = (emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN) obj;

      if (!getINLGCJEOHJIList()
          .equals(other.getINLGCJEOHJIList())) return false;
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
      if (getINLGCJEOHJICount() > 0) {
        hash = (37 * hash) + INLGCJEOHJI_FIELD_NUMBER;
        hash = (53 * hash) + getINLGCJEOHJIList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN prototype) {
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
     * Name: MBLNIKHFGKN
     * </pre>
     *
     * Protobuf type {@code MBLNIKHFGKN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MBLNIKHFGKN)
        emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.internal_static_MBLNIKHFGKN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.internal_static_MBLNIKHFGKN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN.class, emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN.newBuilder()
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
        iNLGCJEOHJI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.internal_static_MBLNIKHFGKN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN build() {
        emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN buildPartial() {
        emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN result = new emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          iNLGCJEOHJI_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.iNLGCJEOHJI_ = iNLGCJEOHJI_;
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
        if (other instanceof emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN) {
          return mergeFrom((emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN other) {
        if (other == emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN.getDefaultInstance()) return this;
        if (!other.iNLGCJEOHJI_.isEmpty()) {
          if (iNLGCJEOHJI_.isEmpty()) {
            iNLGCJEOHJI_ = other.iNLGCJEOHJI_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureINLGCJEOHJIIsMutable();
            iNLGCJEOHJI_.addAll(other.iNLGCJEOHJI_);
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
        emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList iNLGCJEOHJI_ = emptyIntList();
      private void ensureINLGCJEOHJIIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          iNLGCJEOHJI_ = mutableCopy(iNLGCJEOHJI_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 INLGCJEOHJI = 1;</code>
       * @return A list containing the iNLGCJEOHJI.
       */
      public java.util.List<java.lang.Integer>
          getINLGCJEOHJIList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(iNLGCJEOHJI_) : iNLGCJEOHJI_;
      }
      /**
       * <code>repeated uint32 INLGCJEOHJI = 1;</code>
       * @return The count of iNLGCJEOHJI.
       */
      public int getINLGCJEOHJICount() {
        return iNLGCJEOHJI_.size();
      }
      /**
       * <code>repeated uint32 INLGCJEOHJI = 1;</code>
       * @param index The index of the element to return.
       * @return The iNLGCJEOHJI at the given index.
       */
      public int getINLGCJEOHJI(int index) {
        return iNLGCJEOHJI_.getInt(index);
      }
      /**
       * <code>repeated uint32 INLGCJEOHJI = 1;</code>
       * @param index The index to set the value at.
       * @param value The iNLGCJEOHJI to set.
       * @return This builder for chaining.
       */
      public Builder setINLGCJEOHJI(
          int index, int value) {
        ensureINLGCJEOHJIIsMutable();
        iNLGCJEOHJI_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 INLGCJEOHJI = 1;</code>
       * @param value The iNLGCJEOHJI to add.
       * @return This builder for chaining.
       */
      public Builder addINLGCJEOHJI(int value) {
        ensureINLGCJEOHJIIsMutable();
        iNLGCJEOHJI_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 INLGCJEOHJI = 1;</code>
       * @param values The iNLGCJEOHJI to add.
       * @return This builder for chaining.
       */
      public Builder addAllINLGCJEOHJI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureINLGCJEOHJIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, iNLGCJEOHJI_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 INLGCJEOHJI = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearINLGCJEOHJI() {
        iNLGCJEOHJI_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:MBLNIKHFGKN)
    }

    // @@protoc_insertion_point(class_scope:MBLNIKHFGKN)
    private static final emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN();
    }

    public static emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MBLNIKHFGKN>
        PARSER = new com.google.protobuf.AbstractParser<MBLNIKHFGKN>() {
      @java.lang.Override
      public MBLNIKHFGKN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MBLNIKHFGKN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MBLNIKHFGKN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MBLNIKHFGKN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MBLNIKHFGKNOuterClass.MBLNIKHFGKN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MBLNIKHFGKN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MBLNIKHFGKN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MBLNIKHFGKN.proto\"\"\n\013MBLNIKHFGKN\022\023\n\013IN" +
      "LGCJEOHJI\030\001 \003(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MBLNIKHFGKN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MBLNIKHFGKN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MBLNIKHFGKN_descriptor,
        new java.lang.String[] { "INLGCJEOHJI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
