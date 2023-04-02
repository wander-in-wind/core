// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetNextResourceInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetNextResourceInfoRspOuterClass {
  private GetNextResourceInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetNextResourceInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetNextResourceInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ResVersionConfig res_version_config = 11;</code>
     * @return Whether the resVersionConfig field is set.
     */
    boolean hasResVersionConfig();
    /**
     * <code>.ResVersionConfig res_version_config = 11;</code>
     * @return The resVersionConfig.
     */
    emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig getResVersionConfig();
    /**
     * <code>.ResVersionConfig res_version_config = 11;</code>
     */
    emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfigOrBuilder getResVersionConfigOrBuilder();

    /**
     * <code>string next_resource_url = 7;</code>
     * @return The nextResourceUrl.
     */
    java.lang.String getNextResourceUrl();
    /**
     * <code>string next_resource_url = 7;</code>
     * @return The bytes for nextResourceUrl.
     */
    com.google.protobuf.ByteString
        getNextResourceUrlBytes();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: BEHGJMLEGNC
   * CmdId: 173
   * </pre>
   *
   * Protobuf type {@code GetNextResourceInfoRsp}
   */
  public static final class GetNextResourceInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetNextResourceInfoRsp)
      GetNextResourceInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetNextResourceInfoRsp.newBuilder() to construct.
    private GetNextResourceInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetNextResourceInfoRsp() {
      nextResourceUrl_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetNextResourceInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetNextResourceInfoRsp(
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
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              nextResourceUrl_ = s;
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder subBuilder = null;
              if (resVersionConfig_ != null) {
                subBuilder = resVersionConfig_.toBuilder();
              }
              resVersionConfig_ = input.readMessage(emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(resVersionConfig_);
                resVersionConfig_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.internal_static_GetNextResourceInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.internal_static_GetNextResourceInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp.class, emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp.Builder.class);
    }

    public static final int RES_VERSION_CONFIG_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig resVersionConfig_;
    /**
     * <code>.ResVersionConfig res_version_config = 11;</code>
     * @return Whether the resVersionConfig field is set.
     */
    @java.lang.Override
    public boolean hasResVersionConfig() {
      return resVersionConfig_ != null;
    }
    /**
     * <code>.ResVersionConfig res_version_config = 11;</code>
     * @return The resVersionConfig.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig getResVersionConfig() {
      return resVersionConfig_ == null ? emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : resVersionConfig_;
    }
    /**
     * <code>.ResVersionConfig res_version_config = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfigOrBuilder getResVersionConfigOrBuilder() {
      return getResVersionConfig();
    }

    public static final int NEXT_RESOURCE_URL_FIELD_NUMBER = 7;
    private volatile java.lang.Object nextResourceUrl_;
    /**
     * <code>string next_resource_url = 7;</code>
     * @return The nextResourceUrl.
     */
    @java.lang.Override
    public java.lang.String getNextResourceUrl() {
      java.lang.Object ref = nextResourceUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextResourceUrl_ = s;
        return s;
      }
    }
    /**
     * <code>string next_resource_url = 7;</code>
     * @return The bytes for nextResourceUrl.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNextResourceUrlBytes() {
      java.lang.Object ref = nextResourceUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextResourceUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextResourceUrl_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, nextResourceUrl_);
      }
      if (resVersionConfig_ != null) {
        output.writeMessage(11, getResVersionConfig());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextResourceUrl_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, nextResourceUrl_);
      }
      if (resVersionConfig_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getResVersionConfig());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp other = (emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp) obj;

      if (hasResVersionConfig() != other.hasResVersionConfig()) return false;
      if (hasResVersionConfig()) {
        if (!getResVersionConfig()
            .equals(other.getResVersionConfig())) return false;
      }
      if (!getNextResourceUrl()
          .equals(other.getNextResourceUrl())) return false;
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
      if (hasResVersionConfig()) {
        hash = (37 * hash) + RES_VERSION_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getResVersionConfig().hashCode();
      }
      hash = (37 * hash) + NEXT_RESOURCE_URL_FIELD_NUMBER;
      hash = (53 * hash) + getNextResourceUrl().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp prototype) {
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
     * Name: BEHGJMLEGNC
     * CmdId: 173
     * </pre>
     *
     * Protobuf type {@code GetNextResourceInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetNextResourceInfoRsp)
        emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.internal_static_GetNextResourceInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.internal_static_GetNextResourceInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp.class, emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp.newBuilder()
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
        if (resVersionConfigBuilder_ == null) {
          resVersionConfig_ = null;
        } else {
          resVersionConfig_ = null;
          resVersionConfigBuilder_ = null;
        }
        nextResourceUrl_ = "";

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.internal_static_GetNextResourceInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp build() {
        emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp result = new emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp(this);
        if (resVersionConfigBuilder_ == null) {
          result.resVersionConfig_ = resVersionConfig_;
        } else {
          result.resVersionConfig_ = resVersionConfigBuilder_.build();
        }
        result.nextResourceUrl_ = nextResourceUrl_;
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
        if (other instanceof emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp.getDefaultInstance()) return this;
        if (other.hasResVersionConfig()) {
          mergeResVersionConfig(other.getResVersionConfig());
        }
        if (!other.getNextResourceUrl().isEmpty()) {
          nextResourceUrl_ = other.nextResourceUrl_;
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
        emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig resVersionConfig_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfigOrBuilder> resVersionConfigBuilder_;
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       * @return Whether the resVersionConfig field is set.
       */
      public boolean hasResVersionConfig() {
        return resVersionConfigBuilder_ != null || resVersionConfig_ != null;
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       * @return The resVersionConfig.
       */
      public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig getResVersionConfig() {
        if (resVersionConfigBuilder_ == null) {
          return resVersionConfig_ == null ? emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : resVersionConfig_;
        } else {
          return resVersionConfigBuilder_.getMessage();
        }
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       */
      public Builder setResVersionConfig(emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig value) {
        if (resVersionConfigBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resVersionConfig_ = value;
          onChanged();
        } else {
          resVersionConfigBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       */
      public Builder setResVersionConfig(
          emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder builderForValue) {
        if (resVersionConfigBuilder_ == null) {
          resVersionConfig_ = builderForValue.build();
          onChanged();
        } else {
          resVersionConfigBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       */
      public Builder mergeResVersionConfig(emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig value) {
        if (resVersionConfigBuilder_ == null) {
          if (resVersionConfig_ != null) {
            resVersionConfig_ =
              emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.newBuilder(resVersionConfig_).mergeFrom(value).buildPartial();
          } else {
            resVersionConfig_ = value;
          }
          onChanged();
        } else {
          resVersionConfigBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       */
      public Builder clearResVersionConfig() {
        if (resVersionConfigBuilder_ == null) {
          resVersionConfig_ = null;
          onChanged();
        } else {
          resVersionConfig_ = null;
          resVersionConfigBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       */
      public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder getResVersionConfigBuilder() {
        
        onChanged();
        return getResVersionConfigFieldBuilder().getBuilder();
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       */
      public emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfigOrBuilder getResVersionConfigOrBuilder() {
        if (resVersionConfigBuilder_ != null) {
          return resVersionConfigBuilder_.getMessageOrBuilder();
        } else {
          return resVersionConfig_ == null ?
              emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.getDefaultInstance() : resVersionConfig_;
        }
      }
      /**
       * <code>.ResVersionConfig res_version_config = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfigOrBuilder> 
          getResVersionConfigFieldBuilder() {
        if (resVersionConfigBuilder_ == null) {
          resVersionConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfig.Builder, emu.grasscutter.net.proto.ResVersionConfigOuterClass.ResVersionConfigOrBuilder>(
                  getResVersionConfig(),
                  getParentForChildren(),
                  isClean());
          resVersionConfig_ = null;
        }
        return resVersionConfigBuilder_;
      }

      private java.lang.Object nextResourceUrl_ = "";
      /**
       * <code>string next_resource_url = 7;</code>
       * @return The nextResourceUrl.
       */
      public java.lang.String getNextResourceUrl() {
        java.lang.Object ref = nextResourceUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nextResourceUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string next_resource_url = 7;</code>
       * @return The bytes for nextResourceUrl.
       */
      public com.google.protobuf.ByteString
          getNextResourceUrlBytes() {
        java.lang.Object ref = nextResourceUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nextResourceUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string next_resource_url = 7;</code>
       * @param value The nextResourceUrl to set.
       * @return This builder for chaining.
       */
      public Builder setNextResourceUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nextResourceUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string next_resource_url = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextResourceUrl() {
        
        nextResourceUrl_ = getDefaultInstance().getNextResourceUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string next_resource_url = 7;</code>
       * @param value The bytes for nextResourceUrl to set.
       * @return This builder for chaining.
       */
      public Builder setNextResourceUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nextResourceUrl_ = value;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
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


      // @@protoc_insertion_point(builder_scope:GetNextResourceInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetNextResourceInfoRsp)
    private static final emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetNextResourceInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetNextResourceInfoRsp>() {
      @java.lang.Override
      public GetNextResourceInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetNextResourceInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetNextResourceInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetNextResourceInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetNextResourceInfoRspOuterClass.GetNextResourceInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetNextResourceInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetNextResourceInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetNextResourceInfoRsp.proto\032\026ResVersi" +
      "onConfig.proto\"s\n\026GetNextResourceInfoRsp" +
      "\022-\n\022res_version_config\030\013 \001(\0132\021.ResVersio" +
      "nConfig\022\031\n\021next_resource_url\030\007 \001(\t\022\017\n\007re" +
      "tcode\030\003 \001(\005B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ResVersionConfigOuterClass.getDescriptor(),
        });
    internal_static_GetNextResourceInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetNextResourceInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetNextResourceInfoRsp_descriptor,
        new java.lang.String[] { "ResVersionConfig", "NextResourceUrl", "Retcode", });
    emu.grasscutter.net.proto.ResVersionConfigOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
