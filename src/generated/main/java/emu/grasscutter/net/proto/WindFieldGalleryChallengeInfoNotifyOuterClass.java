// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldGalleryChallengeInfoNotify.proto

package emu.grasscutter.net.proto;

public final class WindFieldGalleryChallengeInfoNotifyOuterClass {
  private WindFieldGalleryChallengeInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldGalleryChallengeInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldGalleryChallengeInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 3;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 FKLLFAPMCOB = 12;</code>
     * @return The fKLLFAPMCOB.
     */
    int getFKLLFAPMCOB();

    /**
     * <code>uint32 HBEFCMIOHCN = 13;</code>
     * @return The hBEFCMIOHCN.
     */
    int getHBEFCMIOHCN();

    /**
     * <code>bool is_start = 9;</code>
     * @return The isStart.
     */
    boolean getIsStart();

    /**
     * <code>uint32 FJDAJPLIFIG = 15;</code>
     * @return The fJDAJPLIFIG.
     */
    int getFJDAJPLIFIG();

    /**
     * <code>uint32 DIFGKMHHIMF = 11;</code>
     * @return The dIFGKMHHIMF.
     */
    int getDIFGKMHHIMF();

    /**
     * <code>uint32 BKIIHPOAPNA = 10;</code>
     * @return The bKIIHPOAPNA.
     */
    int getBKIIHPOAPNA();
  }
  /**
   * <pre>
   * CmdId: 5597
   * Name: BONOCJHIGAL
   * </pre>
   *
   * Protobuf type {@code WindFieldGalleryChallengeInfoNotify}
   */
  public static final class WindFieldGalleryChallengeInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldGalleryChallengeInfoNotify)
      WindFieldGalleryChallengeInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldGalleryChallengeInfoNotify.newBuilder() to construct.
    private WindFieldGalleryChallengeInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldGalleryChallengeInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldGalleryChallengeInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WindFieldGalleryChallengeInfoNotify(
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

              isSuccess_ = input.readBool();
              break;
            }
            case 72: {

              isStart_ = input.readBool();
              break;
            }
            case 80: {

              bKIIHPOAPNA_ = input.readUInt32();
              break;
            }
            case 88: {

              dIFGKMHHIMF_ = input.readUInt32();
              break;
            }
            case 96: {

              fKLLFAPMCOB_ = input.readUInt32();
              break;
            }
            case 104: {

              hBEFCMIOHCN_ = input.readUInt32();
              break;
            }
            case 120: {

              fJDAJPLIFIG_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 3;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 3;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int FKLLFAPMCOB_FIELD_NUMBER = 12;
    private int fKLLFAPMCOB_;
    /**
     * <code>uint32 FKLLFAPMCOB = 12;</code>
     * @return The fKLLFAPMCOB.
     */
    @java.lang.Override
    public int getFKLLFAPMCOB() {
      return fKLLFAPMCOB_;
    }

    public static final int HBEFCMIOHCN_FIELD_NUMBER = 13;
    private int hBEFCMIOHCN_;
    /**
     * <code>uint32 HBEFCMIOHCN = 13;</code>
     * @return The hBEFCMIOHCN.
     */
    @java.lang.Override
    public int getHBEFCMIOHCN() {
      return hBEFCMIOHCN_;
    }

    public static final int IS_START_FIELD_NUMBER = 9;
    private boolean isStart_;
    /**
     * <code>bool is_start = 9;</code>
     * @return The isStart.
     */
    @java.lang.Override
    public boolean getIsStart() {
      return isStart_;
    }

    public static final int FJDAJPLIFIG_FIELD_NUMBER = 15;
    private int fJDAJPLIFIG_;
    /**
     * <code>uint32 FJDAJPLIFIG = 15;</code>
     * @return The fJDAJPLIFIG.
     */
    @java.lang.Override
    public int getFJDAJPLIFIG() {
      return fJDAJPLIFIG_;
    }

    public static final int DIFGKMHHIMF_FIELD_NUMBER = 11;
    private int dIFGKMHHIMF_;
    /**
     * <code>uint32 DIFGKMHHIMF = 11;</code>
     * @return The dIFGKMHHIMF.
     */
    @java.lang.Override
    public int getDIFGKMHHIMF() {
      return dIFGKMHHIMF_;
    }

    public static final int BKIIHPOAPNA_FIELD_NUMBER = 10;
    private int bKIIHPOAPNA_;
    /**
     * <code>uint32 BKIIHPOAPNA = 10;</code>
     * @return The bKIIHPOAPNA.
     */
    @java.lang.Override
    public int getBKIIHPOAPNA() {
      return bKIIHPOAPNA_;
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
      if (isSuccess_ != false) {
        output.writeBool(3, isSuccess_);
      }
      if (isStart_ != false) {
        output.writeBool(9, isStart_);
      }
      if (bKIIHPOAPNA_ != 0) {
        output.writeUInt32(10, bKIIHPOAPNA_);
      }
      if (dIFGKMHHIMF_ != 0) {
        output.writeUInt32(11, dIFGKMHHIMF_);
      }
      if (fKLLFAPMCOB_ != 0) {
        output.writeUInt32(12, fKLLFAPMCOB_);
      }
      if (hBEFCMIOHCN_ != 0) {
        output.writeUInt32(13, hBEFCMIOHCN_);
      }
      if (fJDAJPLIFIG_ != 0) {
        output.writeUInt32(15, fJDAJPLIFIG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isSuccess_);
      }
      if (isStart_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isStart_);
      }
      if (bKIIHPOAPNA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, bKIIHPOAPNA_);
      }
      if (dIFGKMHHIMF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, dIFGKMHHIMF_);
      }
      if (fKLLFAPMCOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, fKLLFAPMCOB_);
      }
      if (hBEFCMIOHCN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, hBEFCMIOHCN_);
      }
      if (fJDAJPLIFIG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, fJDAJPLIFIG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify other = (emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getFKLLFAPMCOB()
          != other.getFKLLFAPMCOB()) return false;
      if (getHBEFCMIOHCN()
          != other.getHBEFCMIOHCN()) return false;
      if (getIsStart()
          != other.getIsStart()) return false;
      if (getFJDAJPLIFIG()
          != other.getFJDAJPLIFIG()) return false;
      if (getDIFGKMHHIMF()
          != other.getDIFGKMHHIMF()) return false;
      if (getBKIIHPOAPNA()
          != other.getBKIIHPOAPNA()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + FKLLFAPMCOB_FIELD_NUMBER;
      hash = (53 * hash) + getFKLLFAPMCOB();
      hash = (37 * hash) + HBEFCMIOHCN_FIELD_NUMBER;
      hash = (53 * hash) + getHBEFCMIOHCN();
      hash = (37 * hash) + IS_START_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStart());
      hash = (37 * hash) + FJDAJPLIFIG_FIELD_NUMBER;
      hash = (53 * hash) + getFJDAJPLIFIG();
      hash = (37 * hash) + DIFGKMHHIMF_FIELD_NUMBER;
      hash = (53 * hash) + getDIFGKMHHIMF();
      hash = (37 * hash) + BKIIHPOAPNA_FIELD_NUMBER;
      hash = (53 * hash) + getBKIIHPOAPNA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify prototype) {
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
     * CmdId: 5597
     * Name: BONOCJHIGAL
     * </pre>
     *
     * Protobuf type {@code WindFieldGalleryChallengeInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldGalleryChallengeInfoNotify)
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.newBuilder()
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
        isSuccess_ = false;

        fKLLFAPMCOB_ = 0;

        hBEFCMIOHCN_ = 0;

        isStart_ = false;

        fJDAJPLIFIG_ = 0;

        dIFGKMHHIMF_ = 0;

        bKIIHPOAPNA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify build() {
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify buildPartial() {
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify result = new emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify(this);
        result.isSuccess_ = isSuccess_;
        result.fKLLFAPMCOB_ = fKLLFAPMCOB_;
        result.hBEFCMIOHCN_ = hBEFCMIOHCN_;
        result.isStart_ = isStart_;
        result.fJDAJPLIFIG_ = fJDAJPLIFIG_;
        result.dIFGKMHHIMF_ = dIFGKMHHIMF_;
        result.bKIIHPOAPNA_ = bKIIHPOAPNA_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify other) {
        if (other == emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getFKLLFAPMCOB() != 0) {
          setFKLLFAPMCOB(other.getFKLLFAPMCOB());
        }
        if (other.getHBEFCMIOHCN() != 0) {
          setHBEFCMIOHCN(other.getHBEFCMIOHCN());
        }
        if (other.getIsStart() != false) {
          setIsStart(other.getIsStart());
        }
        if (other.getFJDAJPLIFIG() != 0) {
          setFJDAJPLIFIG(other.getFJDAJPLIFIG());
        }
        if (other.getDIFGKMHHIMF() != 0) {
          setDIFGKMHHIMF(other.getDIFGKMHHIMF());
        }
        if (other.getBKIIHPOAPNA() != 0) {
          setBKIIHPOAPNA(other.getBKIIHPOAPNA());
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
        emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 3;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 3;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int fKLLFAPMCOB_ ;
      /**
       * <code>uint32 FKLLFAPMCOB = 12;</code>
       * @return The fKLLFAPMCOB.
       */
      @java.lang.Override
      public int getFKLLFAPMCOB() {
        return fKLLFAPMCOB_;
      }
      /**
       * <code>uint32 FKLLFAPMCOB = 12;</code>
       * @param value The fKLLFAPMCOB to set.
       * @return This builder for chaining.
       */
      public Builder setFKLLFAPMCOB(int value) {
        
        fKLLFAPMCOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FKLLFAPMCOB = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFKLLFAPMCOB() {
        
        fKLLFAPMCOB_ = 0;
        onChanged();
        return this;
      }

      private int hBEFCMIOHCN_ ;
      /**
       * <code>uint32 HBEFCMIOHCN = 13;</code>
       * @return The hBEFCMIOHCN.
       */
      @java.lang.Override
      public int getHBEFCMIOHCN() {
        return hBEFCMIOHCN_;
      }
      /**
       * <code>uint32 HBEFCMIOHCN = 13;</code>
       * @param value The hBEFCMIOHCN to set.
       * @return This builder for chaining.
       */
      public Builder setHBEFCMIOHCN(int value) {
        
        hBEFCMIOHCN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HBEFCMIOHCN = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearHBEFCMIOHCN() {
        
        hBEFCMIOHCN_ = 0;
        onChanged();
        return this;
      }

      private boolean isStart_ ;
      /**
       * <code>bool is_start = 9;</code>
       * @return The isStart.
       */
      @java.lang.Override
      public boolean getIsStart() {
        return isStart_;
      }
      /**
       * <code>bool is_start = 9;</code>
       * @param value The isStart to set.
       * @return This builder for chaining.
       */
      public Builder setIsStart(boolean value) {
        
        isStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_start = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStart() {
        
        isStart_ = false;
        onChanged();
        return this;
      }

      private int fJDAJPLIFIG_ ;
      /**
       * <code>uint32 FJDAJPLIFIG = 15;</code>
       * @return The fJDAJPLIFIG.
       */
      @java.lang.Override
      public int getFJDAJPLIFIG() {
        return fJDAJPLIFIG_;
      }
      /**
       * <code>uint32 FJDAJPLIFIG = 15;</code>
       * @param value The fJDAJPLIFIG to set.
       * @return This builder for chaining.
       */
      public Builder setFJDAJPLIFIG(int value) {
        
        fJDAJPLIFIG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FJDAJPLIFIG = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFJDAJPLIFIG() {
        
        fJDAJPLIFIG_ = 0;
        onChanged();
        return this;
      }

      private int dIFGKMHHIMF_ ;
      /**
       * <code>uint32 DIFGKMHHIMF = 11;</code>
       * @return The dIFGKMHHIMF.
       */
      @java.lang.Override
      public int getDIFGKMHHIMF() {
        return dIFGKMHHIMF_;
      }
      /**
       * <code>uint32 DIFGKMHHIMF = 11;</code>
       * @param value The dIFGKMHHIMF to set.
       * @return This builder for chaining.
       */
      public Builder setDIFGKMHHIMF(int value) {
        
        dIFGKMHHIMF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DIFGKMHHIMF = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDIFGKMHHIMF() {
        
        dIFGKMHHIMF_ = 0;
        onChanged();
        return this;
      }

      private int bKIIHPOAPNA_ ;
      /**
       * <code>uint32 BKIIHPOAPNA = 10;</code>
       * @return The bKIIHPOAPNA.
       */
      @java.lang.Override
      public int getBKIIHPOAPNA() {
        return bKIIHPOAPNA_;
      }
      /**
       * <code>uint32 BKIIHPOAPNA = 10;</code>
       * @param value The bKIIHPOAPNA to set.
       * @return This builder for chaining.
       */
      public Builder setBKIIHPOAPNA(int value) {
        
        bKIIHPOAPNA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BKIIHPOAPNA = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBKIIHPOAPNA() {
        
        bKIIHPOAPNA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindFieldGalleryChallengeInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:WindFieldGalleryChallengeInfoNotify)
    private static final emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify();
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldGalleryChallengeInfoNotify>() {
      @java.lang.Override
      public WindFieldGalleryChallengeInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WindFieldGalleryChallengeInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldGalleryChallengeInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldGalleryChallengeInfoNotifyOuterClass.WindFieldGalleryChallengeInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldGalleryChallengeInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)WindFieldGalleryChallengeInfoNotify.pr" +
      "oto\"\264\001\n#WindFieldGalleryChallengeInfoNot" +
      "ify\022\022\n\nis_success\030\003 \001(\010\022\023\n\013FKLLFAPMCOB\030\014" +
      " \001(\r\022\023\n\013HBEFCMIOHCN\030\r \001(\r\022\020\n\010is_start\030\t " +
      "\001(\010\022\023\n\013FJDAJPLIFIG\030\017 \001(\r\022\023\n\013DIFGKMHHIMF\030" +
      "\013 \001(\r\022\023\n\013BKIIHPOAPNA\030\n \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WindFieldGalleryChallengeInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldGalleryChallengeInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldGalleryChallengeInfoNotify_descriptor,
        new java.lang.String[] { "IsSuccess", "FKLLFAPMCOB", "HBEFCMIOHCN", "IsStart", "FJDAJPLIFIG", "DIFGKMHHIMF", "BKIIHPOAPNA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
