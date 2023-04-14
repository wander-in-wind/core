// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusCultivateReq.proto

package emu.grasscutter.net.proto;

public final class FungusCultivateReqOuterClass {
  private FungusCultivateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusCultivateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusCultivateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cultivate_id = 15;</code>
     * @return The cultivateId.
     */
    int getCultivateId();

    /**
     * <code>uint32 PEMEEBICACO = 13;</code>
     * @return The pEMEEBICACO.
     */
    int getPEMEEBICACO();

    /**
     * <code>uint32 DALIOFECCHH = 8;</code>
     * @return The dALIOFECCHH.
     */
    int getDALIOFECCHH();

    /**
     * <code>uint32 MDEFDDPPPFJ = 10;</code>
     * @return The mDEFDDPPPFJ.
     */
    int getMDEFDDPPPFJ();

    /**
     * <code>uint32 ONNAFGONBKP = 5;</code>
     * @return The oNNAFGONBKP.
     */
    int getONNAFGONBKP();

    /**
     * <code>uint32 time = 14;</code>
     * @return The time.
     */
    int getTime();

    /**
     * <code>uint32 GOEOLKBNFFE = 12;</code>
     * @return The gOEOLKBNFFE.
     */
    int getGOEOLKBNFFE();

    /**
     * <code>uint32 LIMHENMOOKA = 1;</code>
     * @return The lIMHENMOOKA.
     */
    int getLIMHENMOOKA();
  }
  /**
   * <pre>
   * Name: BGKFONJDBCL
   * CmdId: 20945
   * </pre>
   *
   * Protobuf type {@code FungusCultivateReq}
   */
  public static final class FungusCultivateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusCultivateReq)
      FungusCultivateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusCultivateReq.newBuilder() to construct.
    private FungusCultivateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusCultivateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusCultivateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusCultivateReq(
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

              lIMHENMOOKA_ = input.readUInt32();
              break;
            }
            case 40: {

              oNNAFGONBKP_ = input.readUInt32();
              break;
            }
            case 64: {

              dALIOFECCHH_ = input.readUInt32();
              break;
            }
            case 80: {

              mDEFDDPPPFJ_ = input.readUInt32();
              break;
            }
            case 96: {

              gOEOLKBNFFE_ = input.readUInt32();
              break;
            }
            case 104: {

              pEMEEBICACO_ = input.readUInt32();
              break;
            }
            case 112: {

              time_ = input.readUInt32();
              break;
            }
            case 120: {

              cultivateId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq.class, emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq.Builder.class);
    }

    public static final int CULTIVATE_ID_FIELD_NUMBER = 15;
    private int cultivateId_;
    /**
     * <code>uint32 cultivate_id = 15;</code>
     * @return The cultivateId.
     */
    @java.lang.Override
    public int getCultivateId() {
      return cultivateId_;
    }

    public static final int PEMEEBICACO_FIELD_NUMBER = 13;
    private int pEMEEBICACO_;
    /**
     * <code>uint32 PEMEEBICACO = 13;</code>
     * @return The pEMEEBICACO.
     */
    @java.lang.Override
    public int getPEMEEBICACO() {
      return pEMEEBICACO_;
    }

    public static final int DALIOFECCHH_FIELD_NUMBER = 8;
    private int dALIOFECCHH_;
    /**
     * <code>uint32 DALIOFECCHH = 8;</code>
     * @return The dALIOFECCHH.
     */
    @java.lang.Override
    public int getDALIOFECCHH() {
      return dALIOFECCHH_;
    }

    public static final int MDEFDDPPPFJ_FIELD_NUMBER = 10;
    private int mDEFDDPPPFJ_;
    /**
     * <code>uint32 MDEFDDPPPFJ = 10;</code>
     * @return The mDEFDDPPPFJ.
     */
    @java.lang.Override
    public int getMDEFDDPPPFJ() {
      return mDEFDDPPPFJ_;
    }

    public static final int ONNAFGONBKP_FIELD_NUMBER = 5;
    private int oNNAFGONBKP_;
    /**
     * <code>uint32 ONNAFGONBKP = 5;</code>
     * @return The oNNAFGONBKP.
     */
    @java.lang.Override
    public int getONNAFGONBKP() {
      return oNNAFGONBKP_;
    }

    public static final int TIME_FIELD_NUMBER = 14;
    private int time_;
    /**
     * <code>uint32 time = 14;</code>
     * @return The time.
     */
    @java.lang.Override
    public int getTime() {
      return time_;
    }

    public static final int GOEOLKBNFFE_FIELD_NUMBER = 12;
    private int gOEOLKBNFFE_;
    /**
     * <code>uint32 GOEOLKBNFFE = 12;</code>
     * @return The gOEOLKBNFFE.
     */
    @java.lang.Override
    public int getGOEOLKBNFFE() {
      return gOEOLKBNFFE_;
    }

    public static final int LIMHENMOOKA_FIELD_NUMBER = 1;
    private int lIMHENMOOKA_;
    /**
     * <code>uint32 LIMHENMOOKA = 1;</code>
     * @return The lIMHENMOOKA.
     */
    @java.lang.Override
    public int getLIMHENMOOKA() {
      return lIMHENMOOKA_;
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
      if (lIMHENMOOKA_ != 0) {
        output.writeUInt32(1, lIMHENMOOKA_);
      }
      if (oNNAFGONBKP_ != 0) {
        output.writeUInt32(5, oNNAFGONBKP_);
      }
      if (dALIOFECCHH_ != 0) {
        output.writeUInt32(8, dALIOFECCHH_);
      }
      if (mDEFDDPPPFJ_ != 0) {
        output.writeUInt32(10, mDEFDDPPPFJ_);
      }
      if (gOEOLKBNFFE_ != 0) {
        output.writeUInt32(12, gOEOLKBNFFE_);
      }
      if (pEMEEBICACO_ != 0) {
        output.writeUInt32(13, pEMEEBICACO_);
      }
      if (time_ != 0) {
        output.writeUInt32(14, time_);
      }
      if (cultivateId_ != 0) {
        output.writeUInt32(15, cultivateId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lIMHENMOOKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, lIMHENMOOKA_);
      }
      if (oNNAFGONBKP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, oNNAFGONBKP_);
      }
      if (dALIOFECCHH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, dALIOFECCHH_);
      }
      if (mDEFDDPPPFJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, mDEFDDPPPFJ_);
      }
      if (gOEOLKBNFFE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, gOEOLKBNFFE_);
      }
      if (pEMEEBICACO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, pEMEEBICACO_);
      }
      if (time_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, time_);
      }
      if (cultivateId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cultivateId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq other = (emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq) obj;

      if (getCultivateId()
          != other.getCultivateId()) return false;
      if (getPEMEEBICACO()
          != other.getPEMEEBICACO()) return false;
      if (getDALIOFECCHH()
          != other.getDALIOFECCHH()) return false;
      if (getMDEFDDPPPFJ()
          != other.getMDEFDDPPPFJ()) return false;
      if (getONNAFGONBKP()
          != other.getONNAFGONBKP()) return false;
      if (getTime()
          != other.getTime()) return false;
      if (getGOEOLKBNFFE()
          != other.getGOEOLKBNFFE()) return false;
      if (getLIMHENMOOKA()
          != other.getLIMHENMOOKA()) return false;
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
      hash = (37 * hash) + CULTIVATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCultivateId();
      hash = (37 * hash) + PEMEEBICACO_FIELD_NUMBER;
      hash = (53 * hash) + getPEMEEBICACO();
      hash = (37 * hash) + DALIOFECCHH_FIELD_NUMBER;
      hash = (53 * hash) + getDALIOFECCHH();
      hash = (37 * hash) + MDEFDDPPPFJ_FIELD_NUMBER;
      hash = (53 * hash) + getMDEFDDPPPFJ();
      hash = (37 * hash) + ONNAFGONBKP_FIELD_NUMBER;
      hash = (53 * hash) + getONNAFGONBKP();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime();
      hash = (37 * hash) + GOEOLKBNFFE_FIELD_NUMBER;
      hash = (53 * hash) + getGOEOLKBNFFE();
      hash = (37 * hash) + LIMHENMOOKA_FIELD_NUMBER;
      hash = (53 * hash) + getLIMHENMOOKA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq prototype) {
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
     * Name: BGKFONJDBCL
     * CmdId: 20945
     * </pre>
     *
     * Protobuf type {@code FungusCultivateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusCultivateReq)
        emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq.class, emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq.newBuilder()
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
        cultivateId_ = 0;

        pEMEEBICACO_ = 0;

        dALIOFECCHH_ = 0;

        mDEFDDPPPFJ_ = 0;

        oNNAFGONBKP_ = 0;

        time_ = 0;

        gOEOLKBNFFE_ = 0;

        lIMHENMOOKA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq build() {
        emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq buildPartial() {
        emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq result = new emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq(this);
        result.cultivateId_ = cultivateId_;
        result.pEMEEBICACO_ = pEMEEBICACO_;
        result.dALIOFECCHH_ = dALIOFECCHH_;
        result.mDEFDDPPPFJ_ = mDEFDDPPPFJ_;
        result.oNNAFGONBKP_ = oNNAFGONBKP_;
        result.time_ = time_;
        result.gOEOLKBNFFE_ = gOEOLKBNFFE_;
        result.lIMHENMOOKA_ = lIMHENMOOKA_;
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
        if (other instanceof emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq) {
          return mergeFrom((emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq other) {
        if (other == emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq.getDefaultInstance()) return this;
        if (other.getCultivateId() != 0) {
          setCultivateId(other.getCultivateId());
        }
        if (other.getPEMEEBICACO() != 0) {
          setPEMEEBICACO(other.getPEMEEBICACO());
        }
        if (other.getDALIOFECCHH() != 0) {
          setDALIOFECCHH(other.getDALIOFECCHH());
        }
        if (other.getMDEFDDPPPFJ() != 0) {
          setMDEFDDPPPFJ(other.getMDEFDDPPPFJ());
        }
        if (other.getONNAFGONBKP() != 0) {
          setONNAFGONBKP(other.getONNAFGONBKP());
        }
        if (other.getTime() != 0) {
          setTime(other.getTime());
        }
        if (other.getGOEOLKBNFFE() != 0) {
          setGOEOLKBNFFE(other.getGOEOLKBNFFE());
        }
        if (other.getLIMHENMOOKA() != 0) {
          setLIMHENMOOKA(other.getLIMHENMOOKA());
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
        emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cultivateId_ ;
      /**
       * <code>uint32 cultivate_id = 15;</code>
       * @return The cultivateId.
       */
      @java.lang.Override
      public int getCultivateId() {
        return cultivateId_;
      }
      /**
       * <code>uint32 cultivate_id = 15;</code>
       * @param value The cultivateId to set.
       * @return This builder for chaining.
       */
      public Builder setCultivateId(int value) {
        
        cultivateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cultivate_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCultivateId() {
        
        cultivateId_ = 0;
        onChanged();
        return this;
      }

      private int pEMEEBICACO_ ;
      /**
       * <code>uint32 PEMEEBICACO = 13;</code>
       * @return The pEMEEBICACO.
       */
      @java.lang.Override
      public int getPEMEEBICACO() {
        return pEMEEBICACO_;
      }
      /**
       * <code>uint32 PEMEEBICACO = 13;</code>
       * @param value The pEMEEBICACO to set.
       * @return This builder for chaining.
       */
      public Builder setPEMEEBICACO(int value) {
        
        pEMEEBICACO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PEMEEBICACO = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPEMEEBICACO() {
        
        pEMEEBICACO_ = 0;
        onChanged();
        return this;
      }

      private int dALIOFECCHH_ ;
      /**
       * <code>uint32 DALIOFECCHH = 8;</code>
       * @return The dALIOFECCHH.
       */
      @java.lang.Override
      public int getDALIOFECCHH() {
        return dALIOFECCHH_;
      }
      /**
       * <code>uint32 DALIOFECCHH = 8;</code>
       * @param value The dALIOFECCHH to set.
       * @return This builder for chaining.
       */
      public Builder setDALIOFECCHH(int value) {
        
        dALIOFECCHH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DALIOFECCHH = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDALIOFECCHH() {
        
        dALIOFECCHH_ = 0;
        onChanged();
        return this;
      }

      private int mDEFDDPPPFJ_ ;
      /**
       * <code>uint32 MDEFDDPPPFJ = 10;</code>
       * @return The mDEFDDPPPFJ.
       */
      @java.lang.Override
      public int getMDEFDDPPPFJ() {
        return mDEFDDPPPFJ_;
      }
      /**
       * <code>uint32 MDEFDDPPPFJ = 10;</code>
       * @param value The mDEFDDPPPFJ to set.
       * @return This builder for chaining.
       */
      public Builder setMDEFDDPPPFJ(int value) {
        
        mDEFDDPPPFJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MDEFDDPPPFJ = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMDEFDDPPPFJ() {
        
        mDEFDDPPPFJ_ = 0;
        onChanged();
        return this;
      }

      private int oNNAFGONBKP_ ;
      /**
       * <code>uint32 ONNAFGONBKP = 5;</code>
       * @return The oNNAFGONBKP.
       */
      @java.lang.Override
      public int getONNAFGONBKP() {
        return oNNAFGONBKP_;
      }
      /**
       * <code>uint32 ONNAFGONBKP = 5;</code>
       * @param value The oNNAFGONBKP to set.
       * @return This builder for chaining.
       */
      public Builder setONNAFGONBKP(int value) {
        
        oNNAFGONBKP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ONNAFGONBKP = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearONNAFGONBKP() {
        
        oNNAFGONBKP_ = 0;
        onChanged();
        return this;
      }

      private int time_ ;
      /**
       * <code>uint32 time = 14;</code>
       * @return The time.
       */
      @java.lang.Override
      public int getTime() {
        return time_;
      }
      /**
       * <code>uint32 time = 14;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(int value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 time = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        
        time_ = 0;
        onChanged();
        return this;
      }

      private int gOEOLKBNFFE_ ;
      /**
       * <code>uint32 GOEOLKBNFFE = 12;</code>
       * @return The gOEOLKBNFFE.
       */
      @java.lang.Override
      public int getGOEOLKBNFFE() {
        return gOEOLKBNFFE_;
      }
      /**
       * <code>uint32 GOEOLKBNFFE = 12;</code>
       * @param value The gOEOLKBNFFE to set.
       * @return This builder for chaining.
       */
      public Builder setGOEOLKBNFFE(int value) {
        
        gOEOLKBNFFE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GOEOLKBNFFE = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGOEOLKBNFFE() {
        
        gOEOLKBNFFE_ = 0;
        onChanged();
        return this;
      }

      private int lIMHENMOOKA_ ;
      /**
       * <code>uint32 LIMHENMOOKA = 1;</code>
       * @return The lIMHENMOOKA.
       */
      @java.lang.Override
      public int getLIMHENMOOKA() {
        return lIMHENMOOKA_;
      }
      /**
       * <code>uint32 LIMHENMOOKA = 1;</code>
       * @param value The lIMHENMOOKA to set.
       * @return This builder for chaining.
       */
      public Builder setLIMHENMOOKA(int value) {
        
        lIMHENMOOKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LIMHENMOOKA = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLIMHENMOOKA() {
        
        lIMHENMOOKA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusCultivateReq)
    }

    // @@protoc_insertion_point(class_scope:FungusCultivateReq)
    private static final emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq();
    }

    public static emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusCultivateReq>
        PARSER = new com.google.protobuf.AbstractParser<FungusCultivateReq>() {
      @java.lang.Override
      public FungusCultivateReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusCultivateReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusCultivateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusCultivateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusCultivateReqOuterClass.FungusCultivateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusCultivateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusCultivateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030FungusCultivateReq.proto\"\266\001\n\022FungusCul" +
      "tivateReq\022\024\n\014cultivate_id\030\017 \001(\r\022\023\n\013PEMEE" +
      "BICACO\030\r \001(\r\022\023\n\013DALIOFECCHH\030\010 \001(\r\022\023\n\013MDE" +
      "FDDPPPFJ\030\n \001(\r\022\023\n\013ONNAFGONBKP\030\005 \001(\r\022\014\n\004t" +
      "ime\030\016 \001(\r\022\023\n\013GOEOLKBNFFE\030\014 \001(\r\022\023\n\013LIMHEN" +
      "MOOKA\030\001 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusCultivateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusCultivateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusCultivateReq_descriptor,
        new java.lang.String[] { "CultivateId", "PEMEEBICACO", "DALIOFECCHH", "MDEFDDPPPFJ", "ONNAFGONBKP", "Time", "GOEOLKBNFFE", "LIMHENMOOKA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}