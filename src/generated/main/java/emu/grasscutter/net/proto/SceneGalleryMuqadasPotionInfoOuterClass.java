// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryMuqadasPotionInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryMuqadasPotionInfoOuterClass {
  private SceneGalleryMuqadasPotionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryMuqadasPotionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryMuqadasPotionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 capture_weakness_count = 10;</code>
     * @return The captureWeaknessCount.
     */
    int getCaptureWeaknessCount();

    /**
     * <code>uint32 FEBNFKEKJIF = 2;</code>
     * @return The fEBNFKEKJIF.
     */
    int getFEBNFKEKJIF();

    /**
     * <code>uint32 KNKAGODLFEH = 12;</code>
     * @return The kNKAGODLFEH.
     */
    int getKNKAGODLFEH();

    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * <pre>
   * Name: BKGNOBPMPHD
   * </pre>
   *
   * Protobuf type {@code SceneGalleryMuqadasPotionInfo}
   */
  public static final class SceneGalleryMuqadasPotionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryMuqadasPotionInfo)
      SceneGalleryMuqadasPotionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryMuqadasPotionInfo.newBuilder() to construct.
    private SceneGalleryMuqadasPotionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryMuqadasPotionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryMuqadasPotionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryMuqadasPotionInfo(
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

              fEBNFKEKJIF_ = input.readUInt32();
              break;
            }
            case 80: {

              captureWeaknessCount_ = input.readUInt32();
              break;
            }
            case 96: {

              kNKAGODLFEH_ = input.readUInt32();
              break;
            }
            case 120: {

              score_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.class, emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.Builder.class);
    }

    public static final int CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER = 10;
    private int captureWeaknessCount_;
    /**
     * <code>uint32 capture_weakness_count = 10;</code>
     * @return The captureWeaknessCount.
     */
    @java.lang.Override
    public int getCaptureWeaknessCount() {
      return captureWeaknessCount_;
    }

    public static final int FEBNFKEKJIF_FIELD_NUMBER = 2;
    private int fEBNFKEKJIF_;
    /**
     * <code>uint32 FEBNFKEKJIF = 2;</code>
     * @return The fEBNFKEKJIF.
     */
    @java.lang.Override
    public int getFEBNFKEKJIF() {
      return fEBNFKEKJIF_;
    }

    public static final int KNKAGODLFEH_FIELD_NUMBER = 12;
    private int kNKAGODLFEH_;
    /**
     * <code>uint32 KNKAGODLFEH = 12;</code>
     * @return The kNKAGODLFEH.
     */
    @java.lang.Override
    public int getKNKAGODLFEH() {
      return kNKAGODLFEH_;
    }

    public static final int SCORE_FIELD_NUMBER = 15;
    private int score_;
    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (fEBNFKEKJIF_ != 0) {
        output.writeUInt32(2, fEBNFKEKJIF_);
      }
      if (captureWeaknessCount_ != 0) {
        output.writeUInt32(10, captureWeaknessCount_);
      }
      if (kNKAGODLFEH_ != 0) {
        output.writeUInt32(12, kNKAGODLFEH_);
      }
      if (score_ != 0) {
        output.writeUInt32(15, score_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fEBNFKEKJIF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, fEBNFKEKJIF_);
      }
      if (captureWeaknessCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, captureWeaknessCount_);
      }
      if (kNKAGODLFEH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, kNKAGODLFEH_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, score_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo other = (emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo) obj;

      if (getCaptureWeaknessCount()
          != other.getCaptureWeaknessCount()) return false;
      if (getFEBNFKEKJIF()
          != other.getFEBNFKEKJIF()) return false;
      if (getKNKAGODLFEH()
          != other.getKNKAGODLFEH()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureWeaknessCount();
      hash = (37 * hash) + FEBNFKEKJIF_FIELD_NUMBER;
      hash = (53 * hash) + getFEBNFKEKJIF();
      hash = (37 * hash) + KNKAGODLFEH_FIELD_NUMBER;
      hash = (53 * hash) + getKNKAGODLFEH();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo prototype) {
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
     * Name: BKGNOBPMPHD
     * </pre>
     *
     * Protobuf type {@code SceneGalleryMuqadasPotionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryMuqadasPotionInfo)
        emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.class, emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.newBuilder()
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
        captureWeaknessCount_ = 0;

        fEBNFKEKJIF_ = 0;

        kNKAGODLFEH_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo build() {
        emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo result = new emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo(this);
        result.captureWeaknessCount_ = captureWeaknessCount_;
        result.fEBNFKEKJIF_ = fEBNFKEKJIF_;
        result.kNKAGODLFEH_ = kNKAGODLFEH_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.getDefaultInstance()) return this;
        if (other.getCaptureWeaknessCount() != 0) {
          setCaptureWeaknessCount(other.getCaptureWeaknessCount());
        }
        if (other.getFEBNFKEKJIF() != 0) {
          setFEBNFKEKJIF(other.getFEBNFKEKJIF());
        }
        if (other.getKNKAGODLFEH() != 0) {
          setKNKAGODLFEH(other.getKNKAGODLFEH());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
        emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int captureWeaknessCount_ ;
      /**
       * <code>uint32 capture_weakness_count = 10;</code>
       * @return The captureWeaknessCount.
       */
      @java.lang.Override
      public int getCaptureWeaknessCount() {
        return captureWeaknessCount_;
      }
      /**
       * <code>uint32 capture_weakness_count = 10;</code>
       * @param value The captureWeaknessCount to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureWeaknessCount(int value) {
        
        captureWeaknessCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 capture_weakness_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureWeaknessCount() {
        
        captureWeaknessCount_ = 0;
        onChanged();
        return this;
      }

      private int fEBNFKEKJIF_ ;
      /**
       * <code>uint32 FEBNFKEKJIF = 2;</code>
       * @return The fEBNFKEKJIF.
       */
      @java.lang.Override
      public int getFEBNFKEKJIF() {
        return fEBNFKEKJIF_;
      }
      /**
       * <code>uint32 FEBNFKEKJIF = 2;</code>
       * @param value The fEBNFKEKJIF to set.
       * @return This builder for chaining.
       */
      public Builder setFEBNFKEKJIF(int value) {
        
        fEBNFKEKJIF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FEBNFKEKJIF = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFEBNFKEKJIF() {
        
        fEBNFKEKJIF_ = 0;
        onChanged();
        return this;
      }

      private int kNKAGODLFEH_ ;
      /**
       * <code>uint32 KNKAGODLFEH = 12;</code>
       * @return The kNKAGODLFEH.
       */
      @java.lang.Override
      public int getKNKAGODLFEH() {
        return kNKAGODLFEH_;
      }
      /**
       * <code>uint32 KNKAGODLFEH = 12;</code>
       * @param value The kNKAGODLFEH to set.
       * @return This builder for chaining.
       */
      public Builder setKNKAGODLFEH(int value) {
        
        kNKAGODLFEH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KNKAGODLFEH = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearKNKAGODLFEH() {
        
        kNKAGODLFEH_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 15;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryMuqadasPotionInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryMuqadasPotionInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryMuqadasPotionInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryMuqadasPotionInfo>() {
      @java.lang.Override
      public SceneGalleryMuqadasPotionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryMuqadasPotionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryMuqadasPotionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryMuqadasPotionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryMuqadasPotionInfo.proto\"x\n" +
      "\035SceneGalleryMuqadasPotionInfo\022\036\n\026captur" +
      "e_weakness_count\030\n \001(\r\022\023\n\013FEBNFKEKJIF\030\002 " +
      "\001(\r\022\023\n\013KNKAGODLFEH\030\014 \001(\r\022\r\n\005score\030\017 \001(\rB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryMuqadasPotionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryMuqadasPotionInfo_descriptor,
        new java.lang.String[] { "CaptureWeaknessCount", "FEBNFKEKJIF", "KNKAGODLFEH", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
