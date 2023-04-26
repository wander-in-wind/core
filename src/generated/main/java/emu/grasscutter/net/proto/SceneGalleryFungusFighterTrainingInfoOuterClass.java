// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryFungusFighterTrainingInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryFungusFighterTrainingInfoOuterClass {
  private SceneGalleryFungusFighterTrainingInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryFungusFighterTrainingInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryFungusFighterTrainingInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 buff_id = 3;</code>
     * @return The buffId.
     */
    int getBuffId();

    /**
     * <code>uint32 MBCGPKHEHPP = 4;</code>
     * @return The mBCGPKHEHPP.
     */
    int getMBCGPKHEHPP();

    /**
     * <code>uint32 CNODBENOPKK = 11;</code>
     * @return The cNODBENOPKK.
     */
    int getCNODBENOPKK();

    /**
     * <code>uint32 CNOCKIIKIKI = 8;</code>
     * @return The cNOCKIIKIKI.
     */
    int getCNOCKIIKIKI();

    /**
     * <code>uint32 NOIAIMOONIB = 1;</code>
     * @return The nOIAIMOONIB.
     */
    int getNOIAIMOONIB();

    /**
     * <code>uint32 GLCGHJKHFEI = 10;</code>
     * @return The gLCGHJKHFEI.
     */
    int getGLCGHJKHFEI();

    /**
     * <code>uint32 OMILDIGCPAJ = 14;</code>
     * @return The oMILDIGCPAJ.
     */
    int getOMILDIGCPAJ();
  }
  /**
   * <pre>
   * Name: MIDFIDJFMOO
   * </pre>
   *
   * Protobuf type {@code SceneGalleryFungusFighterTrainingInfo}
   */
  public static final class SceneGalleryFungusFighterTrainingInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryFungusFighterTrainingInfo)
      SceneGalleryFungusFighterTrainingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryFungusFighterTrainingInfo.newBuilder() to construct.
    private SceneGalleryFungusFighterTrainingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryFungusFighterTrainingInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryFungusFighterTrainingInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryFungusFighterTrainingInfo(
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
            case 8: {

              nOIAIMOONIB_ = input.readUInt32();
              break;
            }
            case 24: {

              buffId_ = input.readUInt32();
              break;
            }
            case 32: {

              mBCGPKHEHPP_ = input.readUInt32();
              break;
            }
            case 64: {

              cNOCKIIKIKI_ = input.readUInt32();
              break;
            }
            case 80: {

              gLCGHJKHFEI_ = input.readUInt32();
              break;
            }
            case 88: {

              cNODBENOPKK_ = input.readUInt32();
              break;
            }
            case 112: {

              oMILDIGCPAJ_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.class, emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.Builder.class);
    }

    public static final int BUFF_ID_FIELD_NUMBER = 3;
    private int buffId_;
    /**
     * <code>uint32 buff_id = 3;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
    }

    public static final int MBCGPKHEHPP_FIELD_NUMBER = 4;
    private int mBCGPKHEHPP_;
    /**
     * <code>uint32 MBCGPKHEHPP = 4;</code>
     * @return The mBCGPKHEHPP.
     */
    @java.lang.Override
    public int getMBCGPKHEHPP() {
      return mBCGPKHEHPP_;
    }

    public static final int CNODBENOPKK_FIELD_NUMBER = 11;
    private int cNODBENOPKK_;
    /**
     * <code>uint32 CNODBENOPKK = 11;</code>
     * @return The cNODBENOPKK.
     */
    @java.lang.Override
    public int getCNODBENOPKK() {
      return cNODBENOPKK_;
    }

    public static final int CNOCKIIKIKI_FIELD_NUMBER = 8;
    private int cNOCKIIKIKI_;
    /**
     * <code>uint32 CNOCKIIKIKI = 8;</code>
     * @return The cNOCKIIKIKI.
     */
    @java.lang.Override
    public int getCNOCKIIKIKI() {
      return cNOCKIIKIKI_;
    }

    public static final int NOIAIMOONIB_FIELD_NUMBER = 1;
    private int nOIAIMOONIB_;
    /**
     * <code>uint32 NOIAIMOONIB = 1;</code>
     * @return The nOIAIMOONIB.
     */
    @java.lang.Override
    public int getNOIAIMOONIB() {
      return nOIAIMOONIB_;
    }

    public static final int GLCGHJKHFEI_FIELD_NUMBER = 10;
    private int gLCGHJKHFEI_;
    /**
     * <code>uint32 GLCGHJKHFEI = 10;</code>
     * @return The gLCGHJKHFEI.
     */
    @java.lang.Override
    public int getGLCGHJKHFEI() {
      return gLCGHJKHFEI_;
    }

    public static final int OMILDIGCPAJ_FIELD_NUMBER = 14;
    private int oMILDIGCPAJ_;
    /**
     * <code>uint32 OMILDIGCPAJ = 14;</code>
     * @return The oMILDIGCPAJ.
     */
    @java.lang.Override
    public int getOMILDIGCPAJ() {
      return oMILDIGCPAJ_;
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
      if (nOIAIMOONIB_ != 0) {
        output.writeUInt32(1, nOIAIMOONIB_);
      }
      if (buffId_ != 0) {
        output.writeUInt32(3, buffId_);
      }
      if (mBCGPKHEHPP_ != 0) {
        output.writeUInt32(4, mBCGPKHEHPP_);
      }
      if (cNOCKIIKIKI_ != 0) {
        output.writeUInt32(8, cNOCKIIKIKI_);
      }
      if (gLCGHJKHFEI_ != 0) {
        output.writeUInt32(10, gLCGHJKHFEI_);
      }
      if (cNODBENOPKK_ != 0) {
        output.writeUInt32(11, cNODBENOPKK_);
      }
      if (oMILDIGCPAJ_ != 0) {
        output.writeUInt32(14, oMILDIGCPAJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nOIAIMOONIB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, nOIAIMOONIB_);
      }
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, buffId_);
      }
      if (mBCGPKHEHPP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mBCGPKHEHPP_);
      }
      if (cNOCKIIKIKI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cNOCKIIKIKI_);
      }
      if (gLCGHJKHFEI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gLCGHJKHFEI_);
      }
      if (cNODBENOPKK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, cNODBENOPKK_);
      }
      if (oMILDIGCPAJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, oMILDIGCPAJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo other = (emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) obj;

      if (getBuffId()
          != other.getBuffId()) return false;
      if (getMBCGPKHEHPP()
          != other.getMBCGPKHEHPP()) return false;
      if (getCNODBENOPKK()
          != other.getCNODBENOPKK()) return false;
      if (getCNOCKIIKIKI()
          != other.getCNOCKIIKIKI()) return false;
      if (getNOIAIMOONIB()
          != other.getNOIAIMOONIB()) return false;
      if (getGLCGHJKHFEI()
          != other.getGLCGHJKHFEI()) return false;
      if (getOMILDIGCPAJ()
          != other.getOMILDIGCPAJ()) return false;
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
      hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (37 * hash) + MBCGPKHEHPP_FIELD_NUMBER;
      hash = (53 * hash) + getMBCGPKHEHPP();
      hash = (37 * hash) + CNODBENOPKK_FIELD_NUMBER;
      hash = (53 * hash) + getCNODBENOPKK();
      hash = (37 * hash) + CNOCKIIKIKI_FIELD_NUMBER;
      hash = (53 * hash) + getCNOCKIIKIKI();
      hash = (37 * hash) + NOIAIMOONIB_FIELD_NUMBER;
      hash = (53 * hash) + getNOIAIMOONIB();
      hash = (37 * hash) + GLCGHJKHFEI_FIELD_NUMBER;
      hash = (53 * hash) + getGLCGHJKHFEI();
      hash = (37 * hash) + OMILDIGCPAJ_FIELD_NUMBER;
      hash = (53 * hash) + getOMILDIGCPAJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo prototype) {
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
     * Name: MIDFIDJFMOO
     * </pre>
     *
     * Protobuf type {@code SceneGalleryFungusFighterTrainingInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryFungusFighterTrainingInfo)
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.class, emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.newBuilder()
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
        buffId_ = 0;

        mBCGPKHEHPP_ = 0;

        cNODBENOPKK_ = 0;

        cNOCKIIKIKI_ = 0;

        nOIAIMOONIB_ = 0;

        gLCGHJKHFEI_ = 0;

        oMILDIGCPAJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo build() {
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo result = new emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo(this);
        result.buffId_ = buffId_;
        result.mBCGPKHEHPP_ = mBCGPKHEHPP_;
        result.cNODBENOPKK_ = cNODBENOPKK_;
        result.cNOCKIIKIKI_ = cNOCKIIKIKI_;
        result.nOIAIMOONIB_ = nOIAIMOONIB_;
        result.gLCGHJKHFEI_ = gLCGHJKHFEI_;
        result.oMILDIGCPAJ_ = oMILDIGCPAJ_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.getDefaultInstance()) return this;
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
        }
        if (other.getMBCGPKHEHPP() != 0) {
          setMBCGPKHEHPP(other.getMBCGPKHEHPP());
        }
        if (other.getCNODBENOPKK() != 0) {
          setCNODBENOPKK(other.getCNODBENOPKK());
        }
        if (other.getCNOCKIIKIKI() != 0) {
          setCNOCKIIKIKI(other.getCNOCKIIKIKI());
        }
        if (other.getNOIAIMOONIB() != 0) {
          setNOIAIMOONIB(other.getNOIAIMOONIB());
        }
        if (other.getGLCGHJKHFEI() != 0) {
          setGLCGHJKHFEI(other.getGLCGHJKHFEI());
        }
        if (other.getOMILDIGCPAJ() != 0) {
          setOMILDIGCPAJ(other.getOMILDIGCPAJ());
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
        emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buff_id = 3;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buff_id = 3;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
        onChanged();
        return this;
      }

      private int mBCGPKHEHPP_ ;
      /**
       * <code>uint32 MBCGPKHEHPP = 4;</code>
       * @return The mBCGPKHEHPP.
       */
      @java.lang.Override
      public int getMBCGPKHEHPP() {
        return mBCGPKHEHPP_;
      }
      /**
       * <code>uint32 MBCGPKHEHPP = 4;</code>
       * @param value The mBCGPKHEHPP to set.
       * @return This builder for chaining.
       */
      public Builder setMBCGPKHEHPP(int value) {
        
        mBCGPKHEHPP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MBCGPKHEHPP = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMBCGPKHEHPP() {
        
        mBCGPKHEHPP_ = 0;
        onChanged();
        return this;
      }

      private int cNODBENOPKK_ ;
      /**
       * <code>uint32 CNODBENOPKK = 11;</code>
       * @return The cNODBENOPKK.
       */
      @java.lang.Override
      public int getCNODBENOPKK() {
        return cNODBENOPKK_;
      }
      /**
       * <code>uint32 CNODBENOPKK = 11;</code>
       * @param value The cNODBENOPKK to set.
       * @return This builder for chaining.
       */
      public Builder setCNODBENOPKK(int value) {
        
        cNODBENOPKK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CNODBENOPKK = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCNODBENOPKK() {
        
        cNODBENOPKK_ = 0;
        onChanged();
        return this;
      }

      private int cNOCKIIKIKI_ ;
      /**
       * <code>uint32 CNOCKIIKIKI = 8;</code>
       * @return The cNOCKIIKIKI.
       */
      @java.lang.Override
      public int getCNOCKIIKIKI() {
        return cNOCKIIKIKI_;
      }
      /**
       * <code>uint32 CNOCKIIKIKI = 8;</code>
       * @param value The cNOCKIIKIKI to set.
       * @return This builder for chaining.
       */
      public Builder setCNOCKIIKIKI(int value) {
        
        cNOCKIIKIKI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CNOCKIIKIKI = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCNOCKIIKIKI() {
        
        cNOCKIIKIKI_ = 0;
        onChanged();
        return this;
      }

      private int nOIAIMOONIB_ ;
      /**
       * <code>uint32 NOIAIMOONIB = 1;</code>
       * @return The nOIAIMOONIB.
       */
      @java.lang.Override
      public int getNOIAIMOONIB() {
        return nOIAIMOONIB_;
      }
      /**
       * <code>uint32 NOIAIMOONIB = 1;</code>
       * @param value The nOIAIMOONIB to set.
       * @return This builder for chaining.
       */
      public Builder setNOIAIMOONIB(int value) {
        
        nOIAIMOONIB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NOIAIMOONIB = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNOIAIMOONIB() {
        
        nOIAIMOONIB_ = 0;
        onChanged();
        return this;
      }

      private int gLCGHJKHFEI_ ;
      /**
       * <code>uint32 GLCGHJKHFEI = 10;</code>
       * @return The gLCGHJKHFEI.
       */
      @java.lang.Override
      public int getGLCGHJKHFEI() {
        return gLCGHJKHFEI_;
      }
      /**
       * <code>uint32 GLCGHJKHFEI = 10;</code>
       * @param value The gLCGHJKHFEI to set.
       * @return This builder for chaining.
       */
      public Builder setGLCGHJKHFEI(int value) {
        
        gLCGHJKHFEI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GLCGHJKHFEI = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGLCGHJKHFEI() {
        
        gLCGHJKHFEI_ = 0;
        onChanged();
        return this;
      }

      private int oMILDIGCPAJ_ ;
      /**
       * <code>uint32 OMILDIGCPAJ = 14;</code>
       * @return The oMILDIGCPAJ.
       */
      @java.lang.Override
      public int getOMILDIGCPAJ() {
        return oMILDIGCPAJ_;
      }
      /**
       * <code>uint32 OMILDIGCPAJ = 14;</code>
       * @param value The oMILDIGCPAJ to set.
       * @return This builder for chaining.
       */
      public Builder setOMILDIGCPAJ(int value) {
        
        oMILDIGCPAJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OMILDIGCPAJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOMILDIGCPAJ() {
        
        oMILDIGCPAJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryFungusFighterTrainingInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryFungusFighterTrainingInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryFungusFighterTrainingInfo>() {
      @java.lang.Override
      public SceneGalleryFungusFighterTrainingInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryFungusFighterTrainingInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+SceneGalleryFungusFighterTrainingInfo." +
      "proto\"\266\001\n%SceneGalleryFungusFighterTrain" +
      "ingInfo\022\017\n\007buff_id\030\003 \001(\r\022\023\n\013MBCGPKHEHPP\030" +
      "\004 \001(\r\022\023\n\013CNODBENOPKK\030\013 \001(\r\022\023\n\013CNOCKIIKIK" +
      "I\030\010 \001(\r\022\023\n\013NOIAIMOONIB\030\001 \001(\r\022\023\n\013GLCGHJKH" +
      "FEI\030\n \001(\r\022\023\n\013OMILDIGCPAJ\030\016 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor,
        new java.lang.String[] { "BuffId", "MBCGPKHEHPP", "CNODBENOPKK", "CNOCKIIKIKI", "NOIAIMOONIB", "GLCGHJKHFEI", "OMILDIGCPAJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
