// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingGiveFriendPicRsp.proto

package emu.grasscutter.net.proto;

public final class BlessingGiveFriendPicRspOuterClass {
  private BlessingGiveFriendPicRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlessingGiveFriendPicRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlessingGiveFriendPicRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pic_id = 10;</code>
     * @return The picId.
     */
    int getPicId();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 uid = 13;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * CmdId: 2053
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BlessingGiveFriendPicRsp}
   */
  public static final class BlessingGiveFriendPicRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlessingGiveFriendPicRsp)
      BlessingGiveFriendPicRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlessingGiveFriendPicRsp.newBuilder() to construct.
    private BlessingGiveFriendPicRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlessingGiveFriendPicRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlessingGiveFriendPicRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlessingGiveFriendPicRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              picId_ = input.readUInt32();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              uid_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.internal_static_BlessingGiveFriendPicRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.internal_static_BlessingGiveFriendPicRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp.class, emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp.Builder.class);
    }

    public static final int PIC_ID_FIELD_NUMBER = 10;
    private int picId_;
    /**
     * <code>uint32 pic_id = 10;</code>
     * @return The picId.
     */
    @java.lang.Override
    public int getPicId() {
      return picId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UID_FIELD_NUMBER = 13;
    private int uid_;
    /**
     * <code>uint32 uid = 13;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (picId_ != 0) {
        output.writeUInt32(10, picId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (uid_ != 0) {
        output.writeUInt32(13, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (picId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, picId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp other = (emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp) obj;

      if (getPicId()
          != other.getPicId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + PIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPicId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp prototype) {
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
     * CmdId: 2053
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BlessingGiveFriendPicRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlessingGiveFriendPicRsp)
        emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.internal_static_BlessingGiveFriendPicRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.internal_static_BlessingGiveFriendPicRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp.class, emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp.newBuilder()
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
        picId_ = 0;

        retcode_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.internal_static_BlessingGiveFriendPicRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp build() {
        emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp buildPartial() {
        emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp result = new emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp(this);
        result.picId_ = picId_;
        result.retcode_ = retcode_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp) {
          return mergeFrom((emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp other) {
        if (other == emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp.getDefaultInstance()) return this;
        if (other.getPicId() != 0) {
          setPicId(other.getPicId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int picId_ ;
      /**
       * <code>uint32 pic_id = 10;</code>
       * @return The picId.
       */
      @java.lang.Override
      public int getPicId() {
        return picId_;
      }
      /**
       * <code>uint32 pic_id = 10;</code>
       * @param value The picId to set.
       * @return This builder for chaining.
       */
      public Builder setPicId(int value) {
        
        picId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pic_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPicId() {
        
        picId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 13;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 13;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlessingGiveFriendPicRsp)
    }

    // @@protoc_insertion_point(class_scope:BlessingGiveFriendPicRsp)
    private static final emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp();
    }

    public static emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlessingGiveFriendPicRsp>
        PARSER = new com.google.protobuf.AbstractParser<BlessingGiveFriendPicRsp>() {
      @java.lang.Override
      public BlessingGiveFriendPicRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlessingGiveFriendPicRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlessingGiveFriendPicRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlessingGiveFriendPicRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BlessingGiveFriendPicRspOuterClass.BlessingGiveFriendPicRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingGiveFriendPicRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingGiveFriendPicRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036BlessingGiveFriendPicRsp.proto\"H\n\030Bles" +
      "singGiveFriendPicRsp\022\016\n\006pic_id\030\n \001(\r\022\017\n\007" +
      "retcode\030\013 \001(\005\022\013\n\003uid\030\r \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlessingGiveFriendPicRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlessingGiveFriendPicRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingGiveFriendPicRsp_descriptor,
        new java.lang.String[] { "PicId", "Retcode", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
