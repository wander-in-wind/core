// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAuthkeyRsp.proto

package emu.grasscutter.net.proto;

public final class GetAuthkeyRspOuterClass {
  private GetAuthkeyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAuthkeyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAuthkeyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string auth_appid = 4;</code>
     * @return The authAppid.
     */
    java.lang.String getAuthAppid();
    /**
     * <code>string auth_appid = 4;</code>
     * @return The bytes for authAppid.
     */
    com.google.protobuf.ByteString
        getAuthAppidBytes();

    /**
     * <code>uint32 sign_type = 15;</code>
     * @return The signType.
     */
    int getSignType();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 authkey_ver = 9;</code>
     * @return The authkeyVer.
     */
    int getAuthkeyVer();

    /**
     * <code>string game_biz = 11;</code>
     * @return The gameBiz.
     */
    java.lang.String getGameBiz();
    /**
     * <code>string game_biz = 11;</code>
     * @return The bytes for gameBiz.
     */
    com.google.protobuf.ByteString
        getGameBizBytes();

    /**
     * <code>string authkey = 3;</code>
     * @return The authkey.
     */
    java.lang.String getAuthkey();
    /**
     * <code>string authkey = 3;</code>
     * @return The bytes for authkey.
     */
    com.google.protobuf.ByteString
        getAuthkeyBytes();
  }
  /**
   * <pre>
   * CmdId: 1473
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GetAuthkeyRsp}
   */
  public static final class GetAuthkeyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAuthkeyRsp)
      GetAuthkeyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAuthkeyRsp.newBuilder() to construct.
    private GetAuthkeyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAuthkeyRsp() {
      authAppid_ = "";
      gameBiz_ = "";
      authkey_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAuthkeyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAuthkeyRsp(
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
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              authkey_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              authAppid_ = s;
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 72: {

              authkeyVer_ = input.readUInt32();
              break;
            }
            case 90: {
              java.lang.String s = input.readStringRequireUtf8();

              gameBiz_ = s;
              break;
            }
            case 120: {

              signType_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp.class, emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp.Builder.class);
    }

    public static final int AUTH_APPID_FIELD_NUMBER = 4;
    private volatile java.lang.Object authAppid_;
    /**
     * <code>string auth_appid = 4;</code>
     * @return The authAppid.
     */
    @java.lang.Override
    public java.lang.String getAuthAppid() {
      java.lang.Object ref = authAppid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authAppid_ = s;
        return s;
      }
    }
    /**
     * <code>string auth_appid = 4;</code>
     * @return The bytes for authAppid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthAppidBytes() {
      java.lang.Object ref = authAppid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authAppid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SIGN_TYPE_FIELD_NUMBER = 15;
    private int signType_;
    /**
     * <code>uint32 sign_type = 15;</code>
     * @return The signType.
     */
    @java.lang.Override
    public int getSignType() {
      return signType_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AUTHKEY_VER_FIELD_NUMBER = 9;
    private int authkeyVer_;
    /**
     * <code>uint32 authkey_ver = 9;</code>
     * @return The authkeyVer.
     */
    @java.lang.Override
    public int getAuthkeyVer() {
      return authkeyVer_;
    }

    public static final int GAME_BIZ_FIELD_NUMBER = 11;
    private volatile java.lang.Object gameBiz_;
    /**
     * <code>string game_biz = 11;</code>
     * @return The gameBiz.
     */
    @java.lang.Override
    public java.lang.String getGameBiz() {
      java.lang.Object ref = gameBiz_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameBiz_ = s;
        return s;
      }
    }
    /**
     * <code>string game_biz = 11;</code>
     * @return The bytes for gameBiz.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGameBizBytes() {
      java.lang.Object ref = gameBiz_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameBiz_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUTHKEY_FIELD_NUMBER = 3;
    private volatile java.lang.Object authkey_;
    /**
     * <code>string authkey = 3;</code>
     * @return The authkey.
     */
    @java.lang.Override
    public java.lang.String getAuthkey() {
      java.lang.Object ref = authkey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authkey_ = s;
        return s;
      }
    }
    /**
     * <code>string authkey = 3;</code>
     * @return The bytes for authkey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthkeyBytes() {
      java.lang.Object ref = authkey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authkey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authkey_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, authkey_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authAppid_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, authAppid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (authkeyVer_ != 0) {
        output.writeUInt32(9, authkeyVer_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameBiz_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, gameBiz_);
      }
      if (signType_ != 0) {
        output.writeUInt32(15, signType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authkey_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, authkey_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authAppid_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, authAppid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (authkeyVer_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, authkeyVer_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameBiz_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, gameBiz_);
      }
      if (signType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, signType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp other = (emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp) obj;

      if (!getAuthAppid()
          .equals(other.getAuthAppid())) return false;
      if (getSignType()
          != other.getSignType()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAuthkeyVer()
          != other.getAuthkeyVer()) return false;
      if (!getGameBiz()
          .equals(other.getGameBiz())) return false;
      if (!getAuthkey()
          .equals(other.getAuthkey())) return false;
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
      hash = (37 * hash) + AUTH_APPID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthAppid().hashCode();
      hash = (37 * hash) + SIGN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getSignType();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + AUTHKEY_VER_FIELD_NUMBER;
      hash = (53 * hash) + getAuthkeyVer();
      hash = (37 * hash) + GAME_BIZ_FIELD_NUMBER;
      hash = (53 * hash) + getGameBiz().hashCode();
      hash = (37 * hash) + AUTHKEY_FIELD_NUMBER;
      hash = (53 * hash) + getAuthkey().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp prototype) {
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
     * CmdId: 1473
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GetAuthkeyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAuthkeyRsp)
        emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp.class, emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp.newBuilder()
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
        authAppid_ = "";

        signType_ = 0;

        retcode_ = 0;

        authkeyVer_ = 0;

        gameBiz_ = "";

        authkey_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.internal_static_GetAuthkeyRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp build() {
        emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp buildPartial() {
        emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp result = new emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp(this);
        result.authAppid_ = authAppid_;
        result.signType_ = signType_;
        result.retcode_ = retcode_;
        result.authkeyVer_ = authkeyVer_;
        result.gameBiz_ = gameBiz_;
        result.authkey_ = authkey_;
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
        if (other instanceof emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp other) {
        if (other == emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp.getDefaultInstance()) return this;
        if (!other.getAuthAppid().isEmpty()) {
          authAppid_ = other.authAppid_;
          onChanged();
        }
        if (other.getSignType() != 0) {
          setSignType(other.getSignType());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAuthkeyVer() != 0) {
          setAuthkeyVer(other.getAuthkeyVer());
        }
        if (!other.getGameBiz().isEmpty()) {
          gameBiz_ = other.gameBiz_;
          onChanged();
        }
        if (!other.getAuthkey().isEmpty()) {
          authkey_ = other.authkey_;
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
        emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object authAppid_ = "";
      /**
       * <code>string auth_appid = 4;</code>
       * @return The authAppid.
       */
      public java.lang.String getAuthAppid() {
        java.lang.Object ref = authAppid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authAppid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string auth_appid = 4;</code>
       * @return The bytes for authAppid.
       */
      public com.google.protobuf.ByteString
          getAuthAppidBytes() {
        java.lang.Object ref = authAppid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authAppid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string auth_appid = 4;</code>
       * @param value The authAppid to set.
       * @return This builder for chaining.
       */
      public Builder setAuthAppid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        authAppid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string auth_appid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthAppid() {
        
        authAppid_ = getDefaultInstance().getAuthAppid();
        onChanged();
        return this;
      }
      /**
       * <code>string auth_appid = 4;</code>
       * @param value The bytes for authAppid to set.
       * @return This builder for chaining.
       */
      public Builder setAuthAppidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        authAppid_ = value;
        onChanged();
        return this;
      }

      private int signType_ ;
      /**
       * <code>uint32 sign_type = 15;</code>
       * @return The signType.
       */
      @java.lang.Override
      public int getSignType() {
        return signType_;
      }
      /**
       * <code>uint32 sign_type = 15;</code>
       * @param value The signType to set.
       * @return This builder for chaining.
       */
      public Builder setSignType(int value) {
        
        signType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sign_type = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSignType() {
        
        signType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int authkeyVer_ ;
      /**
       * <code>uint32 authkey_ver = 9;</code>
       * @return The authkeyVer.
       */
      @java.lang.Override
      public int getAuthkeyVer() {
        return authkeyVer_;
      }
      /**
       * <code>uint32 authkey_ver = 9;</code>
       * @param value The authkeyVer to set.
       * @return This builder for chaining.
       */
      public Builder setAuthkeyVer(int value) {
        
        authkeyVer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 authkey_ver = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthkeyVer() {
        
        authkeyVer_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object gameBiz_ = "";
      /**
       * <code>string game_biz = 11;</code>
       * @return The gameBiz.
       */
      public java.lang.String getGameBiz() {
        java.lang.Object ref = gameBiz_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          gameBiz_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string game_biz = 11;</code>
       * @return The bytes for gameBiz.
       */
      public com.google.protobuf.ByteString
          getGameBizBytes() {
        java.lang.Object ref = gameBiz_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gameBiz_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string game_biz = 11;</code>
       * @param value The gameBiz to set.
       * @return This builder for chaining.
       */
      public Builder setGameBiz(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        gameBiz_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string game_biz = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameBiz() {
        
        gameBiz_ = getDefaultInstance().getGameBiz();
        onChanged();
        return this;
      }
      /**
       * <code>string game_biz = 11;</code>
       * @param value The bytes for gameBiz to set.
       * @return This builder for chaining.
       */
      public Builder setGameBizBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        gameBiz_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object authkey_ = "";
      /**
       * <code>string authkey = 3;</code>
       * @return The authkey.
       */
      public java.lang.String getAuthkey() {
        java.lang.Object ref = authkey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authkey_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string authkey = 3;</code>
       * @return The bytes for authkey.
       */
      public com.google.protobuf.ByteString
          getAuthkeyBytes() {
        java.lang.Object ref = authkey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authkey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string authkey = 3;</code>
       * @param value The authkey to set.
       * @return This builder for chaining.
       */
      public Builder setAuthkey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        authkey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string authkey = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthkey() {
        
        authkey_ = getDefaultInstance().getAuthkey();
        onChanged();
        return this;
      }
      /**
       * <code>string authkey = 3;</code>
       * @param value The bytes for authkey to set.
       * @return This builder for chaining.
       */
      public Builder setAuthkeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        authkey_ = value;
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


      // @@protoc_insertion_point(builder_scope:GetAuthkeyRsp)
    }

    // @@protoc_insertion_point(class_scope:GetAuthkeyRsp)
    private static final emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp();
    }

    public static emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAuthkeyRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetAuthkeyRsp>() {
      @java.lang.Override
      public GetAuthkeyRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAuthkeyRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetAuthkeyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAuthkeyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAuthkeyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAuthkeyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GetAuthkeyRsp.proto\"\177\n\rGetAuthkeyRsp\022\022" +
      "\n\nauth_appid\030\004 \001(\t\022\021\n\tsign_type\030\017 \001(\r\022\017\n" +
      "\007retcode\030\006 \001(\005\022\023\n\013authkey_ver\030\t \001(\r\022\020\n\010g" +
      "ame_biz\030\013 \001(\t\022\017\n\007authkey\030\003 \001(\tB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAuthkeyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAuthkeyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAuthkeyRsp_descriptor,
        new java.lang.String[] { "AuthAppid", "SignType", "Retcode", "AuthkeyVer", "GameBiz", "Authkey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
