// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RechargeRsp.proto

package emu.grasscutter.net.proto;

public final class RechargeRspOuterClass {
  private RechargeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RechargeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RechargeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_show_minors_hint = 6;</code>
     * @return The isShowMinorsHint.
     */
    boolean getIsShowMinorsHint();

    /**
     * <code>string product_id = 2;</code>
     * @return The productId.
     */
    java.lang.String getProductId();
    /**
     * <code>string product_id = 2;</code>
     * @return The bytes for productId.
     */
    com.google.protobuf.ByteString
        getProductIdBytes();
  }
  /**
   * <pre>
   * CmdId: 4118
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RechargeRsp}
   */
  public static final class RechargeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RechargeRsp)
      RechargeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RechargeRsp.newBuilder() to construct.
    private RechargeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RechargeRsp() {
      productId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RechargeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RechargeRsp(
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              productId_ = s;
              break;
            }
            case 48: {

              isShowMinorsHint_ = input.readBool();
              break;
            }
            case 96: {

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RechargeRspOuterClass.internal_static_RechargeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RechargeRspOuterClass.internal_static_RechargeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp.class, emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_SHOW_MINORS_HINT_FIELD_NUMBER = 6;
    private boolean isShowMinorsHint_;
    /**
     * <code>bool is_show_minors_hint = 6;</code>
     * @return The isShowMinorsHint.
     */
    @java.lang.Override
    public boolean getIsShowMinorsHint() {
      return isShowMinorsHint_;
    }

    public static final int PRODUCT_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object productId_;
    /**
     * <code>string product_id = 2;</code>
     * @return The productId.
     */
    @java.lang.Override
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      }
    }
    /**
     * <code>string product_id = 2;</code>
     * @return The bytes for productId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, productId_);
      }
      if (isShowMinorsHint_ != false) {
        output.writeBool(6, isShowMinorsHint_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, productId_);
      }
      if (isShowMinorsHint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isShowMinorsHint_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp other = (emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsShowMinorsHint()
          != other.getIsShowMinorsHint()) return false;
      if (!getProductId()
          .equals(other.getProductId())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_SHOW_MINORS_HINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShowMinorsHint());
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp prototype) {
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
     * CmdId: 4118
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RechargeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RechargeRsp)
        emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RechargeRspOuterClass.internal_static_RechargeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RechargeRspOuterClass.internal_static_RechargeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp.class, emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp.newBuilder()
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
        retcode_ = 0;

        isShowMinorsHint_ = false;

        productId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RechargeRspOuterClass.internal_static_RechargeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp build() {
        emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp buildPartial() {
        emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp result = new emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp(this);
        result.retcode_ = retcode_;
        result.isShowMinorsHint_ = isShowMinorsHint_;
        result.productId_ = productId_;
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
        if (other instanceof emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp) {
          return mergeFrom((emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp other) {
        if (other == emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsShowMinorsHint() != false) {
          setIsShowMinorsHint(other.getIsShowMinorsHint());
        }
        if (!other.getProductId().isEmpty()) {
          productId_ = other.productId_;
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
        emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isShowMinorsHint_ ;
      /**
       * <code>bool is_show_minors_hint = 6;</code>
       * @return The isShowMinorsHint.
       */
      @java.lang.Override
      public boolean getIsShowMinorsHint() {
        return isShowMinorsHint_;
      }
      /**
       * <code>bool is_show_minors_hint = 6;</code>
       * @param value The isShowMinorsHint to set.
       * @return This builder for chaining.
       */
      public Builder setIsShowMinorsHint(boolean value) {
        
        isShowMinorsHint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_show_minors_hint = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShowMinorsHint() {
        
        isShowMinorsHint_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object productId_ = "";
      /**
       * <code>string product_id = 2;</code>
       * @return The productId.
       */
      public java.lang.String getProductId() {
        java.lang.Object ref = productId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          productId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string product_id = 2;</code>
       * @return The bytes for productId.
       */
      public com.google.protobuf.ByteString
          getProductIdBytes() {
        java.lang.Object ref = productId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          productId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string product_id = 2;</code>
       * @param value The productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        productId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductId() {
        
        productId_ = getDefaultInstance().getProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 2;</code>
       * @param value The bytes for productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        productId_ = value;
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


      // @@protoc_insertion_point(builder_scope:RechargeRsp)
    }

    // @@protoc_insertion_point(class_scope:RechargeRsp)
    private static final emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp();
    }

    public static emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RechargeRsp>
        PARSER = new com.google.protobuf.AbstractParser<RechargeRsp>() {
      @java.lang.Override
      public RechargeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RechargeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RechargeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RechargeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RechargeRspOuterClass.RechargeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RechargeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RechargeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021RechargeRsp.proto\"O\n\013RechargeRsp\022\017\n\007re" +
      "tcode\030\014 \001(\005\022\033\n\023is_show_minors_hint\030\006 \001(\010" +
      "\022\022\n\nproduct_id\030\002 \001(\tB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RechargeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RechargeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RechargeRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsShowMinorsHint", "ProductId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
