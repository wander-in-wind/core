// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAllActivatedBargainDataRsp.proto

package emu.grasscutter.net.proto;

public final class GetAllActivatedBargainDataRspOuterClass {
  private GetAllActivatedBargainDataRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAllActivatedBargainDataRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAllActivatedBargainDataRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot> 
        getSnapshotListList();
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshotList(int index);
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    int getSnapshotListCount();
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> 
        getSnapshotListOrBuilderList();
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: AKAJOGPHLCH
   * CmdId: 457
   * </pre>
   *
   * Protobuf type {@code GetAllActivatedBargainDataRsp}
   */
  public static final class GetAllActivatedBargainDataRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAllActivatedBargainDataRsp)
      GetAllActivatedBargainDataRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAllActivatedBargainDataRsp.newBuilder() to construct.
    private GetAllActivatedBargainDataRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAllActivatedBargainDataRsp() {
      snapshotList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAllActivatedBargainDataRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAllActivatedBargainDataRsp(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                snapshotList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot>();
                mutable_bitField0_ |= 0x00000001;
              }
              snapshotList_.add(
                  input.readMessage(emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.parser(), extensionRegistry));
              break;
            }
            case 80: {

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
          snapshotList_ = java.util.Collections.unmodifiableList(snapshotList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.internal_static_GetAllActivatedBargainDataRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.internal_static_GetAllActivatedBargainDataRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp.class, emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp.Builder.class);
    }

    public static final int SNAPSHOT_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot> snapshotList_;
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot> getSnapshotListList() {
      return snapshotList_;
    }
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> 
        getSnapshotListOrBuilderList() {
      return snapshotList_;
    }
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    @java.lang.Override
    public int getSnapshotListCount() {
      return snapshotList_.size();
    }
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshotList(int index) {
      return snapshotList_.get(index);
    }
    /**
     * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotListOrBuilder(
        int index) {
      return snapshotList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
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
      for (int i = 0; i < snapshotList_.size(); i++) {
        output.writeMessage(3, snapshotList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < snapshotList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, snapshotList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp other = (emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp) obj;

      if (!getSnapshotListList()
          .equals(other.getSnapshotListList())) return false;
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
      if (getSnapshotListCount() > 0) {
        hash = (37 * hash) + SNAPSHOT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSnapshotListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp prototype) {
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
     * Name: AKAJOGPHLCH
     * CmdId: 457
     * </pre>
     *
     * Protobuf type {@code GetAllActivatedBargainDataRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAllActivatedBargainDataRsp)
        emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.internal_static_GetAllActivatedBargainDataRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.internal_static_GetAllActivatedBargainDataRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp.class, emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp.newBuilder()
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
          getSnapshotListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (snapshotListBuilder_ == null) {
          snapshotList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          snapshotListBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.internal_static_GetAllActivatedBargainDataRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp build() {
        emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp buildPartial() {
        emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp result = new emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp(this);
        int from_bitField0_ = bitField0_;
        if (snapshotListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            snapshotList_ = java.util.Collections.unmodifiableList(snapshotList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.snapshotList_ = snapshotList_;
        } else {
          result.snapshotList_ = snapshotListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp other) {
        if (other == emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp.getDefaultInstance()) return this;
        if (snapshotListBuilder_ == null) {
          if (!other.snapshotList_.isEmpty()) {
            if (snapshotList_.isEmpty()) {
              snapshotList_ = other.snapshotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSnapshotListIsMutable();
              snapshotList_.addAll(other.snapshotList_);
            }
            onChanged();
          }
        } else {
          if (!other.snapshotList_.isEmpty()) {
            if (snapshotListBuilder_.isEmpty()) {
              snapshotListBuilder_.dispose();
              snapshotListBuilder_ = null;
              snapshotList_ = other.snapshotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              snapshotListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSnapshotListFieldBuilder() : null;
            } else {
              snapshotListBuilder_.addAllMessages(other.snapshotList_);
            }
          }
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
        emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot> snapshotList_ =
        java.util.Collections.emptyList();
      private void ensureSnapshotListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          snapshotList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot>(snapshotList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> snapshotListBuilder_;

      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot> getSnapshotListList() {
        if (snapshotListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(snapshotList_);
        } else {
          return snapshotListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public int getSnapshotListCount() {
        if (snapshotListBuilder_ == null) {
          return snapshotList_.size();
        } else {
          return snapshotListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshotList(int index) {
        if (snapshotListBuilder_ == null) {
          return snapshotList_.get(index);
        } else {
          return snapshotListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder setSnapshotList(
          int index, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSnapshotListIsMutable();
          snapshotList_.set(index, value);
          onChanged();
        } else {
          snapshotListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder setSnapshotList(
          int index, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder builderForValue) {
        if (snapshotListBuilder_ == null) {
          ensureSnapshotListIsMutable();
          snapshotList_.set(index, builderForValue.build());
          onChanged();
        } else {
          snapshotListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder addSnapshotList(emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSnapshotListIsMutable();
          snapshotList_.add(value);
          onChanged();
        } else {
          snapshotListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder addSnapshotList(
          int index, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSnapshotListIsMutable();
          snapshotList_.add(index, value);
          onChanged();
        } else {
          snapshotListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder addSnapshotList(
          emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder builderForValue) {
        if (snapshotListBuilder_ == null) {
          ensureSnapshotListIsMutable();
          snapshotList_.add(builderForValue.build());
          onChanged();
        } else {
          snapshotListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder addSnapshotList(
          int index, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder builderForValue) {
        if (snapshotListBuilder_ == null) {
          ensureSnapshotListIsMutable();
          snapshotList_.add(index, builderForValue.build());
          onChanged();
        } else {
          snapshotListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder addAllSnapshotList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot> values) {
        if (snapshotListBuilder_ == null) {
          ensureSnapshotListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, snapshotList_);
          onChanged();
        } else {
          snapshotListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder clearSnapshotList() {
        if (snapshotListBuilder_ == null) {
          snapshotList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          snapshotListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public Builder removeSnapshotList(int index) {
        if (snapshotListBuilder_ == null) {
          ensureSnapshotListIsMutable();
          snapshotList_.remove(index);
          onChanged();
        } else {
          snapshotListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder getSnapshotListBuilder(
          int index) {
        return getSnapshotListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotListOrBuilder(
          int index) {
        if (snapshotListBuilder_ == null) {
          return snapshotList_.get(index);  } else {
          return snapshotListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> 
           getSnapshotListOrBuilderList() {
        if (snapshotListBuilder_ != null) {
          return snapshotListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(snapshotList_);
        }
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder addSnapshotListBuilder() {
        return getSnapshotListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance());
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder addSnapshotListBuilder(
          int index) {
        return getSnapshotListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance());
      }
      /**
       * <code>repeated .BargainSnapshot snapshot_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder> 
           getSnapshotListBuilderList() {
        return getSnapshotListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> 
          getSnapshotListFieldBuilder() {
        if (snapshotListBuilder_ == null) {
          snapshotListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, emu.grasscutter.net.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder>(
                  snapshotList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          snapshotList_ = null;
        }
        return snapshotListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
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


      // @@protoc_insertion_point(builder_scope:GetAllActivatedBargainDataRsp)
    }

    // @@protoc_insertion_point(class_scope:GetAllActivatedBargainDataRsp)
    private static final emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp();
    }

    public static emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAllActivatedBargainDataRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetAllActivatedBargainDataRsp>() {
      @java.lang.Override
      public GetAllActivatedBargainDataRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAllActivatedBargainDataRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetAllActivatedBargainDataRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAllActivatedBargainDataRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetAllActivatedBargainDataRspOuterClass.GetAllActivatedBargainDataRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllActivatedBargainDataRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllActivatedBargainDataRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GetAllActivatedBargainDataRsp.proto\032\025B" +
      "argainSnapshot.proto\"Y\n\035GetAllActivatedB" +
      "argainDataRsp\022\'\n\rsnapshot_list\030\003 \003(\0132\020.B" +
      "argainSnapshot\022\017\n\007retcode\030\n \001(\005B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BargainSnapshotOuterClass.getDescriptor(),
        });
    internal_static_GetAllActivatedBargainDataRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAllActivatedBargainDataRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllActivatedBargainDataRsp_descriptor,
        new java.lang.String[] { "SnapshotList", "Retcode", });
    emu.grasscutter.net.proto.BargainSnapshotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
