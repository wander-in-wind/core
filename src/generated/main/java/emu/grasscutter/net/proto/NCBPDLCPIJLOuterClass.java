// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NCBPDLCPIJL.proto

package emu.grasscutter.net.proto;

public final class NCBPDLCPIJLOuterClass {
  private NCBPDLCPIJLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NCBPDLCPIJLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NCBPDLCPIJL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string LKPCDMIOBJE = 1;</code>
     * @return The lKPCDMIOBJE.
     */
    java.lang.String getLKPCDMIOBJE();
    /**
     * <code>string LKPCDMIOBJE = 1;</code>
     * @return The bytes for lKPCDMIOBJE.
     */
    com.google.protobuf.ByteString
        getLKPCDMIOBJEBytes();

    /**
     * <code>string game_biz = 2;</code>
     * @return The gameBiz.
     */
    java.lang.String getGameBiz();
    /**
     * <code>string game_biz = 2;</code>
     * @return The bytes for gameBiz.
     */
    com.google.protobuf.ByteString
        getGameBizBytes();

    /**
     * <code>string KEBHDHCCFPP = 3;</code>
     * @return The kEBHDHCCFPP.
     */
    java.lang.String getKEBHDHCCFPP();
    /**
     * <code>string KEBHDHCCFPP = 3;</code>
     * @return The bytes for kEBHDHCCFPP.
     */
    com.google.protobuf.ByteString
        getKEBHDHCCFPPBytes();
  }
  /**
   * <pre>
   * Name: NCBPDLCPIJL
   * </pre>
   *
   * Protobuf type {@code NCBPDLCPIJL}
   */
  public static final class NCBPDLCPIJL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NCBPDLCPIJL)
      NCBPDLCPIJLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NCBPDLCPIJL.newBuilder() to construct.
    private NCBPDLCPIJL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NCBPDLCPIJL() {
      lKPCDMIOBJE_ = "";
      gameBiz_ = "";
      kEBHDHCCFPP_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NCBPDLCPIJL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NCBPDLCPIJL(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              lKPCDMIOBJE_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              gameBiz_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              kEBHDHCCFPP_ = s;
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
      return emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.internal_static_NCBPDLCPIJL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.internal_static_NCBPDLCPIJL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL.class, emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL.Builder.class);
    }

    public static final int LKPCDMIOBJE_FIELD_NUMBER = 1;
    private volatile java.lang.Object lKPCDMIOBJE_;
    /**
     * <code>string LKPCDMIOBJE = 1;</code>
     * @return The lKPCDMIOBJE.
     */
    @java.lang.Override
    public java.lang.String getLKPCDMIOBJE() {
      java.lang.Object ref = lKPCDMIOBJE_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lKPCDMIOBJE_ = s;
        return s;
      }
    }
    /**
     * <code>string LKPCDMIOBJE = 1;</code>
     * @return The bytes for lKPCDMIOBJE.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLKPCDMIOBJEBytes() {
      java.lang.Object ref = lKPCDMIOBJE_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lKPCDMIOBJE_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GAME_BIZ_FIELD_NUMBER = 2;
    private volatile java.lang.Object gameBiz_;
    /**
     * <code>string game_biz = 2;</code>
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
     * <code>string game_biz = 2;</code>
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

    public static final int KEBHDHCCFPP_FIELD_NUMBER = 3;
    private volatile java.lang.Object kEBHDHCCFPP_;
    /**
     * <code>string KEBHDHCCFPP = 3;</code>
     * @return The kEBHDHCCFPP.
     */
    @java.lang.Override
    public java.lang.String getKEBHDHCCFPP() {
      java.lang.Object ref = kEBHDHCCFPP_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kEBHDHCCFPP_ = s;
        return s;
      }
    }
    /**
     * <code>string KEBHDHCCFPP = 3;</code>
     * @return The bytes for kEBHDHCCFPP.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKEBHDHCCFPPBytes() {
      java.lang.Object ref = kEBHDHCCFPP_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kEBHDHCCFPP_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lKPCDMIOBJE_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lKPCDMIOBJE_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameBiz_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gameBiz_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kEBHDHCCFPP_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, kEBHDHCCFPP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lKPCDMIOBJE_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lKPCDMIOBJE_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameBiz_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gameBiz_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kEBHDHCCFPP_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, kEBHDHCCFPP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL other = (emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL) obj;

      if (!getLKPCDMIOBJE()
          .equals(other.getLKPCDMIOBJE())) return false;
      if (!getGameBiz()
          .equals(other.getGameBiz())) return false;
      if (!getKEBHDHCCFPP()
          .equals(other.getKEBHDHCCFPP())) return false;
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
      hash = (37 * hash) + LKPCDMIOBJE_FIELD_NUMBER;
      hash = (53 * hash) + getLKPCDMIOBJE().hashCode();
      hash = (37 * hash) + GAME_BIZ_FIELD_NUMBER;
      hash = (53 * hash) + getGameBiz().hashCode();
      hash = (37 * hash) + KEBHDHCCFPP_FIELD_NUMBER;
      hash = (53 * hash) + getKEBHDHCCFPP().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL prototype) {
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
     * Name: NCBPDLCPIJL
     * </pre>
     *
     * Protobuf type {@code NCBPDLCPIJL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NCBPDLCPIJL)
        emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.internal_static_NCBPDLCPIJL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.internal_static_NCBPDLCPIJL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL.class, emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL.newBuilder()
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
        lKPCDMIOBJE_ = "";

        gameBiz_ = "";

        kEBHDHCCFPP_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.internal_static_NCBPDLCPIJL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL build() {
        emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL buildPartial() {
        emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL result = new emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL(this);
        result.lKPCDMIOBJE_ = lKPCDMIOBJE_;
        result.gameBiz_ = gameBiz_;
        result.kEBHDHCCFPP_ = kEBHDHCCFPP_;
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
        if (other instanceof emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL) {
          return mergeFrom((emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL other) {
        if (other == emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL.getDefaultInstance()) return this;
        if (!other.getLKPCDMIOBJE().isEmpty()) {
          lKPCDMIOBJE_ = other.lKPCDMIOBJE_;
          onChanged();
        }
        if (!other.getGameBiz().isEmpty()) {
          gameBiz_ = other.gameBiz_;
          onChanged();
        }
        if (!other.getKEBHDHCCFPP().isEmpty()) {
          kEBHDHCCFPP_ = other.kEBHDHCCFPP_;
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
        emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object lKPCDMIOBJE_ = "";
      /**
       * <code>string LKPCDMIOBJE = 1;</code>
       * @return The lKPCDMIOBJE.
       */
      public java.lang.String getLKPCDMIOBJE() {
        java.lang.Object ref = lKPCDMIOBJE_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lKPCDMIOBJE_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string LKPCDMIOBJE = 1;</code>
       * @return The bytes for lKPCDMIOBJE.
       */
      public com.google.protobuf.ByteString
          getLKPCDMIOBJEBytes() {
        java.lang.Object ref = lKPCDMIOBJE_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lKPCDMIOBJE_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string LKPCDMIOBJE = 1;</code>
       * @param value The lKPCDMIOBJE to set.
       * @return This builder for chaining.
       */
      public Builder setLKPCDMIOBJE(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lKPCDMIOBJE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string LKPCDMIOBJE = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLKPCDMIOBJE() {
        
        lKPCDMIOBJE_ = getDefaultInstance().getLKPCDMIOBJE();
        onChanged();
        return this;
      }
      /**
       * <code>string LKPCDMIOBJE = 1;</code>
       * @param value The bytes for lKPCDMIOBJE to set.
       * @return This builder for chaining.
       */
      public Builder setLKPCDMIOBJEBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lKPCDMIOBJE_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object gameBiz_ = "";
      /**
       * <code>string game_biz = 2;</code>
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
       * <code>string game_biz = 2;</code>
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
       * <code>string game_biz = 2;</code>
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
       * <code>string game_biz = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameBiz() {
        
        gameBiz_ = getDefaultInstance().getGameBiz();
        onChanged();
        return this;
      }
      /**
       * <code>string game_biz = 2;</code>
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

      private java.lang.Object kEBHDHCCFPP_ = "";
      /**
       * <code>string KEBHDHCCFPP = 3;</code>
       * @return The kEBHDHCCFPP.
       */
      public java.lang.String getKEBHDHCCFPP() {
        java.lang.Object ref = kEBHDHCCFPP_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          kEBHDHCCFPP_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string KEBHDHCCFPP = 3;</code>
       * @return The bytes for kEBHDHCCFPP.
       */
      public com.google.protobuf.ByteString
          getKEBHDHCCFPPBytes() {
        java.lang.Object ref = kEBHDHCCFPP_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          kEBHDHCCFPP_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string KEBHDHCCFPP = 3;</code>
       * @param value The kEBHDHCCFPP to set.
       * @return This builder for chaining.
       */
      public Builder setKEBHDHCCFPP(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        kEBHDHCCFPP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string KEBHDHCCFPP = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKEBHDHCCFPP() {
        
        kEBHDHCCFPP_ = getDefaultInstance().getKEBHDHCCFPP();
        onChanged();
        return this;
      }
      /**
       * <code>string KEBHDHCCFPP = 3;</code>
       * @param value The bytes for kEBHDHCCFPP to set.
       * @return This builder for chaining.
       */
      public Builder setKEBHDHCCFPPBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        kEBHDHCCFPP_ = value;
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


      // @@protoc_insertion_point(builder_scope:NCBPDLCPIJL)
    }

    // @@protoc_insertion_point(class_scope:NCBPDLCPIJL)
    private static final emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL();
    }

    public static emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NCBPDLCPIJL>
        PARSER = new com.google.protobuf.AbstractParser<NCBPDLCPIJL>() {
      @java.lang.Override
      public NCBPDLCPIJL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NCBPDLCPIJL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NCBPDLCPIJL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NCBPDLCPIJL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NCBPDLCPIJLOuterClass.NCBPDLCPIJL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NCBPDLCPIJL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NCBPDLCPIJL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NCBPDLCPIJL.proto\"I\n\013NCBPDLCPIJL\022\023\n\013LK" +
      "PCDMIOBJE\030\001 \001(\t\022\020\n\010game_biz\030\002 \001(\t\022\023\n\013KEB" +
      "HDHCCFPP\030\003 \001(\tB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NCBPDLCPIJL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NCBPDLCPIJL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NCBPDLCPIJL_descriptor,
        new java.lang.String[] { "LKPCDMIOBJE", "GameBiz", "KEBHDHCCFPP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
