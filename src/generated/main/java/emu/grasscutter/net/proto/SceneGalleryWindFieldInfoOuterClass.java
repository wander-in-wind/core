// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryWindFieldInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryWindFieldInfoOuterClass {
  private SceneGalleryWindFieldInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryWindFieldInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryWindFieldInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BPFKPEOHJHO = 4;</code>
     * @return The bPFKPEOHJHO.
     */
    int getBPFKPEOHJHO();

    /**
     * <code>uint32 LMICEFBKOID = 2;</code>
     * @return The lMICEFBKOID.
     */
    int getLMICEFBKOID();

    /**
     * <code>uint32 PBABFGGNMDF = 6;</code>
     * @return The pBABFGGNMDF.
     */
    int getPBABFGGNMDF();

    /**
     * <code>uint32 DPLICOODJLA = 8;</code>
     * @return The dPLICOODJLA.
     */
    int getDPLICOODJLA();

    /**
     * <code>uint32 LFGKBLLGBBO = 11;</code>
     * @return The lFGKBLLGBBO.
     */
    int getLFGKBLLGBBO();

    /**
     * <code>uint32 IFCFDJKPPEJ = 9;</code>
     * @return The iFCFDJKPPEJ.
     */
    int getIFCFDJKPPEJ();

    /**
     * <code>uint32 NACBICBMNFJ = 3;</code>
     * @return The nACBICBMNFJ.
     */
    int getNACBICBMNFJ();

    /**
     * <code>uint32 JPIIACAHIFE = 15;</code>
     * @return The jPIIACAHIFE.
     */
    int getJPIIACAHIFE();
  }
  /**
   * <pre>
   * Name: GPANMIKMGKN
   * </pre>
   *
   * Protobuf type {@code SceneGalleryWindFieldInfo}
   */
  public static final class SceneGalleryWindFieldInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryWindFieldInfo)
      SceneGalleryWindFieldInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryWindFieldInfo.newBuilder() to construct.
    private SceneGalleryWindFieldInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryWindFieldInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryWindFieldInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryWindFieldInfo(
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
            case 16: {

              lMICEFBKOID_ = input.readUInt32();
              break;
            }
            case 24: {

              nACBICBMNFJ_ = input.readUInt32();
              break;
            }
            case 32: {

              bPFKPEOHJHO_ = input.readUInt32();
              break;
            }
            case 48: {

              pBABFGGNMDF_ = input.readUInt32();
              break;
            }
            case 64: {

              dPLICOODJLA_ = input.readUInt32();
              break;
            }
            case 72: {

              iFCFDJKPPEJ_ = input.readUInt32();
              break;
            }
            case 88: {

              lFGKBLLGBBO_ = input.readUInt32();
              break;
            }
            case 120: {

              jPIIACAHIFE_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.internal_static_SceneGalleryWindFieldInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.internal_static_SceneGalleryWindFieldInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo.class, emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo.Builder.class);
    }

    public static final int BPFKPEOHJHO_FIELD_NUMBER = 4;
    private int bPFKPEOHJHO_;
    /**
     * <code>uint32 BPFKPEOHJHO = 4;</code>
     * @return The bPFKPEOHJHO.
     */
    @java.lang.Override
    public int getBPFKPEOHJHO() {
      return bPFKPEOHJHO_;
    }

    public static final int LMICEFBKOID_FIELD_NUMBER = 2;
    private int lMICEFBKOID_;
    /**
     * <code>uint32 LMICEFBKOID = 2;</code>
     * @return The lMICEFBKOID.
     */
    @java.lang.Override
    public int getLMICEFBKOID() {
      return lMICEFBKOID_;
    }

    public static final int PBABFGGNMDF_FIELD_NUMBER = 6;
    private int pBABFGGNMDF_;
    /**
     * <code>uint32 PBABFGGNMDF = 6;</code>
     * @return The pBABFGGNMDF.
     */
    @java.lang.Override
    public int getPBABFGGNMDF() {
      return pBABFGGNMDF_;
    }

    public static final int DPLICOODJLA_FIELD_NUMBER = 8;
    private int dPLICOODJLA_;
    /**
     * <code>uint32 DPLICOODJLA = 8;</code>
     * @return The dPLICOODJLA.
     */
    @java.lang.Override
    public int getDPLICOODJLA() {
      return dPLICOODJLA_;
    }

    public static final int LFGKBLLGBBO_FIELD_NUMBER = 11;
    private int lFGKBLLGBBO_;
    /**
     * <code>uint32 LFGKBLLGBBO = 11;</code>
     * @return The lFGKBLLGBBO.
     */
    @java.lang.Override
    public int getLFGKBLLGBBO() {
      return lFGKBLLGBBO_;
    }

    public static final int IFCFDJKPPEJ_FIELD_NUMBER = 9;
    private int iFCFDJKPPEJ_;
    /**
     * <code>uint32 IFCFDJKPPEJ = 9;</code>
     * @return The iFCFDJKPPEJ.
     */
    @java.lang.Override
    public int getIFCFDJKPPEJ() {
      return iFCFDJKPPEJ_;
    }

    public static final int NACBICBMNFJ_FIELD_NUMBER = 3;
    private int nACBICBMNFJ_;
    /**
     * <code>uint32 NACBICBMNFJ = 3;</code>
     * @return The nACBICBMNFJ.
     */
    @java.lang.Override
    public int getNACBICBMNFJ() {
      return nACBICBMNFJ_;
    }

    public static final int JPIIACAHIFE_FIELD_NUMBER = 15;
    private int jPIIACAHIFE_;
    /**
     * <code>uint32 JPIIACAHIFE = 15;</code>
     * @return The jPIIACAHIFE.
     */
    @java.lang.Override
    public int getJPIIACAHIFE() {
      return jPIIACAHIFE_;
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
      if (lMICEFBKOID_ != 0) {
        output.writeUInt32(2, lMICEFBKOID_);
      }
      if (nACBICBMNFJ_ != 0) {
        output.writeUInt32(3, nACBICBMNFJ_);
      }
      if (bPFKPEOHJHO_ != 0) {
        output.writeUInt32(4, bPFKPEOHJHO_);
      }
      if (pBABFGGNMDF_ != 0) {
        output.writeUInt32(6, pBABFGGNMDF_);
      }
      if (dPLICOODJLA_ != 0) {
        output.writeUInt32(8, dPLICOODJLA_);
      }
      if (iFCFDJKPPEJ_ != 0) {
        output.writeUInt32(9, iFCFDJKPPEJ_);
      }
      if (lFGKBLLGBBO_ != 0) {
        output.writeUInt32(11, lFGKBLLGBBO_);
      }
      if (jPIIACAHIFE_ != 0) {
        output.writeUInt32(15, jPIIACAHIFE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lMICEFBKOID_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, lMICEFBKOID_);
      }
      if (nACBICBMNFJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, nACBICBMNFJ_);
      }
      if (bPFKPEOHJHO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, bPFKPEOHJHO_);
      }
      if (pBABFGGNMDF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, pBABFGGNMDF_);
      }
      if (dPLICOODJLA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, dPLICOODJLA_);
      }
      if (iFCFDJKPPEJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, iFCFDJKPPEJ_);
      }
      if (lFGKBLLGBBO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, lFGKBLLGBBO_);
      }
      if (jPIIACAHIFE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, jPIIACAHIFE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo other = (emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo) obj;

      if (getBPFKPEOHJHO()
          != other.getBPFKPEOHJHO()) return false;
      if (getLMICEFBKOID()
          != other.getLMICEFBKOID()) return false;
      if (getPBABFGGNMDF()
          != other.getPBABFGGNMDF()) return false;
      if (getDPLICOODJLA()
          != other.getDPLICOODJLA()) return false;
      if (getLFGKBLLGBBO()
          != other.getLFGKBLLGBBO()) return false;
      if (getIFCFDJKPPEJ()
          != other.getIFCFDJKPPEJ()) return false;
      if (getNACBICBMNFJ()
          != other.getNACBICBMNFJ()) return false;
      if (getJPIIACAHIFE()
          != other.getJPIIACAHIFE()) return false;
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
      hash = (37 * hash) + BPFKPEOHJHO_FIELD_NUMBER;
      hash = (53 * hash) + getBPFKPEOHJHO();
      hash = (37 * hash) + LMICEFBKOID_FIELD_NUMBER;
      hash = (53 * hash) + getLMICEFBKOID();
      hash = (37 * hash) + PBABFGGNMDF_FIELD_NUMBER;
      hash = (53 * hash) + getPBABFGGNMDF();
      hash = (37 * hash) + DPLICOODJLA_FIELD_NUMBER;
      hash = (53 * hash) + getDPLICOODJLA();
      hash = (37 * hash) + LFGKBLLGBBO_FIELD_NUMBER;
      hash = (53 * hash) + getLFGKBLLGBBO();
      hash = (37 * hash) + IFCFDJKPPEJ_FIELD_NUMBER;
      hash = (53 * hash) + getIFCFDJKPPEJ();
      hash = (37 * hash) + NACBICBMNFJ_FIELD_NUMBER;
      hash = (53 * hash) + getNACBICBMNFJ();
      hash = (37 * hash) + JPIIACAHIFE_FIELD_NUMBER;
      hash = (53 * hash) + getJPIIACAHIFE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo prototype) {
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
     * Name: GPANMIKMGKN
     * </pre>
     *
     * Protobuf type {@code SceneGalleryWindFieldInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryWindFieldInfo)
        emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.internal_static_SceneGalleryWindFieldInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.internal_static_SceneGalleryWindFieldInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo.class, emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo.newBuilder()
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
        bPFKPEOHJHO_ = 0;

        lMICEFBKOID_ = 0;

        pBABFGGNMDF_ = 0;

        dPLICOODJLA_ = 0;

        lFGKBLLGBBO_ = 0;

        iFCFDJKPPEJ_ = 0;

        nACBICBMNFJ_ = 0;

        jPIIACAHIFE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.internal_static_SceneGalleryWindFieldInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo build() {
        emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo result = new emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo(this);
        result.bPFKPEOHJHO_ = bPFKPEOHJHO_;
        result.lMICEFBKOID_ = lMICEFBKOID_;
        result.pBABFGGNMDF_ = pBABFGGNMDF_;
        result.dPLICOODJLA_ = dPLICOODJLA_;
        result.lFGKBLLGBBO_ = lFGKBLLGBBO_;
        result.iFCFDJKPPEJ_ = iFCFDJKPPEJ_;
        result.nACBICBMNFJ_ = nACBICBMNFJ_;
        result.jPIIACAHIFE_ = jPIIACAHIFE_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo.getDefaultInstance()) return this;
        if (other.getBPFKPEOHJHO() != 0) {
          setBPFKPEOHJHO(other.getBPFKPEOHJHO());
        }
        if (other.getLMICEFBKOID() != 0) {
          setLMICEFBKOID(other.getLMICEFBKOID());
        }
        if (other.getPBABFGGNMDF() != 0) {
          setPBABFGGNMDF(other.getPBABFGGNMDF());
        }
        if (other.getDPLICOODJLA() != 0) {
          setDPLICOODJLA(other.getDPLICOODJLA());
        }
        if (other.getLFGKBLLGBBO() != 0) {
          setLFGKBLLGBBO(other.getLFGKBLLGBBO());
        }
        if (other.getIFCFDJKPPEJ() != 0) {
          setIFCFDJKPPEJ(other.getIFCFDJKPPEJ());
        }
        if (other.getNACBICBMNFJ() != 0) {
          setNACBICBMNFJ(other.getNACBICBMNFJ());
        }
        if (other.getJPIIACAHIFE() != 0) {
          setJPIIACAHIFE(other.getJPIIACAHIFE());
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
        emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bPFKPEOHJHO_ ;
      /**
       * <code>uint32 BPFKPEOHJHO = 4;</code>
       * @return The bPFKPEOHJHO.
       */
      @java.lang.Override
      public int getBPFKPEOHJHO() {
        return bPFKPEOHJHO_;
      }
      /**
       * <code>uint32 BPFKPEOHJHO = 4;</code>
       * @param value The bPFKPEOHJHO to set.
       * @return This builder for chaining.
       */
      public Builder setBPFKPEOHJHO(int value) {
        
        bPFKPEOHJHO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BPFKPEOHJHO = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBPFKPEOHJHO() {
        
        bPFKPEOHJHO_ = 0;
        onChanged();
        return this;
      }

      private int lMICEFBKOID_ ;
      /**
       * <code>uint32 LMICEFBKOID = 2;</code>
       * @return The lMICEFBKOID.
       */
      @java.lang.Override
      public int getLMICEFBKOID() {
        return lMICEFBKOID_;
      }
      /**
       * <code>uint32 LMICEFBKOID = 2;</code>
       * @param value The lMICEFBKOID to set.
       * @return This builder for chaining.
       */
      public Builder setLMICEFBKOID(int value) {
        
        lMICEFBKOID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LMICEFBKOID = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLMICEFBKOID() {
        
        lMICEFBKOID_ = 0;
        onChanged();
        return this;
      }

      private int pBABFGGNMDF_ ;
      /**
       * <code>uint32 PBABFGGNMDF = 6;</code>
       * @return The pBABFGGNMDF.
       */
      @java.lang.Override
      public int getPBABFGGNMDF() {
        return pBABFGGNMDF_;
      }
      /**
       * <code>uint32 PBABFGGNMDF = 6;</code>
       * @param value The pBABFGGNMDF to set.
       * @return This builder for chaining.
       */
      public Builder setPBABFGGNMDF(int value) {
        
        pBABFGGNMDF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PBABFGGNMDF = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPBABFGGNMDF() {
        
        pBABFGGNMDF_ = 0;
        onChanged();
        return this;
      }

      private int dPLICOODJLA_ ;
      /**
       * <code>uint32 DPLICOODJLA = 8;</code>
       * @return The dPLICOODJLA.
       */
      @java.lang.Override
      public int getDPLICOODJLA() {
        return dPLICOODJLA_;
      }
      /**
       * <code>uint32 DPLICOODJLA = 8;</code>
       * @param value The dPLICOODJLA to set.
       * @return This builder for chaining.
       */
      public Builder setDPLICOODJLA(int value) {
        
        dPLICOODJLA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DPLICOODJLA = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDPLICOODJLA() {
        
        dPLICOODJLA_ = 0;
        onChanged();
        return this;
      }

      private int lFGKBLLGBBO_ ;
      /**
       * <code>uint32 LFGKBLLGBBO = 11;</code>
       * @return The lFGKBLLGBBO.
       */
      @java.lang.Override
      public int getLFGKBLLGBBO() {
        return lFGKBLLGBBO_;
      }
      /**
       * <code>uint32 LFGKBLLGBBO = 11;</code>
       * @param value The lFGKBLLGBBO to set.
       * @return This builder for chaining.
       */
      public Builder setLFGKBLLGBBO(int value) {
        
        lFGKBLLGBBO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LFGKBLLGBBO = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLFGKBLLGBBO() {
        
        lFGKBLLGBBO_ = 0;
        onChanged();
        return this;
      }

      private int iFCFDJKPPEJ_ ;
      /**
       * <code>uint32 IFCFDJKPPEJ = 9;</code>
       * @return The iFCFDJKPPEJ.
       */
      @java.lang.Override
      public int getIFCFDJKPPEJ() {
        return iFCFDJKPPEJ_;
      }
      /**
       * <code>uint32 IFCFDJKPPEJ = 9;</code>
       * @param value The iFCFDJKPPEJ to set.
       * @return This builder for chaining.
       */
      public Builder setIFCFDJKPPEJ(int value) {
        
        iFCFDJKPPEJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IFCFDJKPPEJ = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIFCFDJKPPEJ() {
        
        iFCFDJKPPEJ_ = 0;
        onChanged();
        return this;
      }

      private int nACBICBMNFJ_ ;
      /**
       * <code>uint32 NACBICBMNFJ = 3;</code>
       * @return The nACBICBMNFJ.
       */
      @java.lang.Override
      public int getNACBICBMNFJ() {
        return nACBICBMNFJ_;
      }
      /**
       * <code>uint32 NACBICBMNFJ = 3;</code>
       * @param value The nACBICBMNFJ to set.
       * @return This builder for chaining.
       */
      public Builder setNACBICBMNFJ(int value) {
        
        nACBICBMNFJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NACBICBMNFJ = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNACBICBMNFJ() {
        
        nACBICBMNFJ_ = 0;
        onChanged();
        return this;
      }

      private int jPIIACAHIFE_ ;
      /**
       * <code>uint32 JPIIACAHIFE = 15;</code>
       * @return The jPIIACAHIFE.
       */
      @java.lang.Override
      public int getJPIIACAHIFE() {
        return jPIIACAHIFE_;
      }
      /**
       * <code>uint32 JPIIACAHIFE = 15;</code>
       * @param value The jPIIACAHIFE to set.
       * @return This builder for chaining.
       */
      public Builder setJPIIACAHIFE(int value) {
        
        jPIIACAHIFE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JPIIACAHIFE = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearJPIIACAHIFE() {
        
        jPIIACAHIFE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryWindFieldInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryWindFieldInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryWindFieldInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryWindFieldInfo>() {
      @java.lang.Override
      public SceneGalleryWindFieldInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryWindFieldInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryWindFieldInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryWindFieldInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryWindFieldInfoOuterClass.SceneGalleryWindFieldInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryWindFieldInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryWindFieldInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SceneGalleryWindFieldInfo.proto\"\303\001\n\031Sc" +
      "eneGalleryWindFieldInfo\022\023\n\013BPFKPEOHJHO\030\004" +
      " \001(\r\022\023\n\013LMICEFBKOID\030\002 \001(\r\022\023\n\013PBABFGGNMDF" +
      "\030\006 \001(\r\022\023\n\013DPLICOODJLA\030\010 \001(\r\022\023\n\013LFGKBLLGB" +
      "BO\030\013 \001(\r\022\023\n\013IFCFDJKPPEJ\030\t \001(\r\022\023\n\013NACBICB" +
      "MNFJ\030\003 \001(\r\022\023\n\013JPIIACAHIFE\030\017 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryWindFieldInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryWindFieldInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryWindFieldInfo_descriptor,
        new java.lang.String[] { "BPFKPEOHJHO", "LMICEFBKOID", "PBABFGGNMDF", "DPLICOODJLA", "LFGKBLLGBBO", "IFCFDJKPPEJ", "NACBICBMNFJ", "JPIIACAHIFE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}