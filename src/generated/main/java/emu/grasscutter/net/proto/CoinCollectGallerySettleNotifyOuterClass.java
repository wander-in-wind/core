// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectGallerySettleNotify.proto

package emu.grasscutter.net.proto;

public final class CoinCollectGallerySettleNotifyOuterClass {
  private CoinCollectGallerySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectGallerySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectGallerySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 multistage_play_index = 9;</code>
     * @return The multistagePlayIndex.
     */
    int getMultistagePlayIndex();

    /**
     * <code>uint32 AJOLCIGIMNA = 8;</code>
     * @return The aJOLCIGIMNA.
     */
    int getAJOLCIGIMNA();

    /**
     * <code>uint32 DKAPCHHJPCM = 6;</code>
     * @return The dKAPCHHJPCM.
     */
    int getDKAPCHHJPCM();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 EEBBADCOGNG = 5;</code>
     * @return The eEBBADCOGNG.
     */
    int getEEBBADCOGNG();

    /**
     * <code>bool is_new_record = 4;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * CmdId: 5533
   * Name: GDGGNKEMCOA
   * </pre>
   *
   * Protobuf type {@code CoinCollectGallerySettleNotify}
   */
  public static final class CoinCollectGallerySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectGallerySettleNotify)
      CoinCollectGallerySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectGallerySettleNotify.newBuilder() to construct.
    private CoinCollectGallerySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectGallerySettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectGallerySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoinCollectGallerySettleNotify(
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
            case 32: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 40: {

              eEBBADCOGNG_ = input.readUInt32();
              break;
            }
            case 48: {

              dKAPCHHJPCM_ = input.readUInt32();
              break;
            }
            case 64: {

              aJOLCIGIMNA_ = input.readUInt32();
              break;
            }
            case 72: {

              multistagePlayIndex_ = input.readUInt32();
              break;
            }
            case 80: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.class, emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.Builder.class);
    }

    public static final int MULTISTAGE_PLAY_INDEX_FIELD_NUMBER = 9;
    private int multistagePlayIndex_;
    /**
     * <code>uint32 multistage_play_index = 9;</code>
     * @return The multistagePlayIndex.
     */
    @java.lang.Override
    public int getMultistagePlayIndex() {
      return multistagePlayIndex_;
    }

    public static final int AJOLCIGIMNA_FIELD_NUMBER = 8;
    private int aJOLCIGIMNA_;
    /**
     * <code>uint32 AJOLCIGIMNA = 8;</code>
     * @return The aJOLCIGIMNA.
     */
    @java.lang.Override
    public int getAJOLCIGIMNA() {
      return aJOLCIGIMNA_;
    }

    public static final int DKAPCHHJPCM_FIELD_NUMBER = 6;
    private int dKAPCHHJPCM_;
    /**
     * <code>uint32 DKAPCHHJPCM = 6;</code>
     * @return The dKAPCHHJPCM.
     */
    @java.lang.Override
    public int getDKAPCHHJPCM() {
      return dKAPCHHJPCM_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int EEBBADCOGNG_FIELD_NUMBER = 5;
    private int eEBBADCOGNG_;
    /**
     * <code>uint32 EEBBADCOGNG = 5;</code>
     * @return The eEBBADCOGNG.
     */
    @java.lang.Override
    public int getEEBBADCOGNG() {
      return eEBBADCOGNG_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 4;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 4;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (isNewRecord_ != false) {
        output.writeBool(4, isNewRecord_);
      }
      if (eEBBADCOGNG_ != 0) {
        output.writeUInt32(5, eEBBADCOGNG_);
      }
      if (dKAPCHHJPCM_ != 0) {
        output.writeUInt32(6, dKAPCHHJPCM_);
      }
      if (aJOLCIGIMNA_ != 0) {
        output.writeUInt32(8, aJOLCIGIMNA_);
      }
      if (multistagePlayIndex_ != 0) {
        output.writeUInt32(9, multistagePlayIndex_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isNewRecord_);
      }
      if (eEBBADCOGNG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, eEBBADCOGNG_);
      }
      if (dKAPCHHJPCM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, dKAPCHHJPCM_);
      }
      if (aJOLCIGIMNA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, aJOLCIGIMNA_);
      }
      if (multistagePlayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, multistagePlayIndex_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify other = (emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) obj;

      if (getMultistagePlayIndex()
          != other.getMultistagePlayIndex()) return false;
      if (getAJOLCIGIMNA()
          != other.getAJOLCIGIMNA()) return false;
      if (getDKAPCHHJPCM()
          != other.getDKAPCHHJPCM()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getEEBBADCOGNG()
          != other.getEEBBADCOGNG()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + MULTISTAGE_PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getMultistagePlayIndex();
      hash = (37 * hash) + AJOLCIGIMNA_FIELD_NUMBER;
      hash = (53 * hash) + getAJOLCIGIMNA();
      hash = (37 * hash) + DKAPCHHJPCM_FIELD_NUMBER;
      hash = (53 * hash) + getDKAPCHHJPCM();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + EEBBADCOGNG_FIELD_NUMBER;
      hash = (53 * hash) + getEEBBADCOGNG();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify prototype) {
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
     * CmdId: 5533
     * Name: GDGGNKEMCOA
     * </pre>
     *
     * Protobuf type {@code CoinCollectGallerySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectGallerySettleNotify)
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.class, emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.newBuilder()
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
        multistagePlayIndex_ = 0;

        aJOLCIGIMNA_ = 0;

        dKAPCHHJPCM_ = 0;

        levelId_ = 0;

        eEBBADCOGNG_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify build() {
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify buildPartial() {
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify result = new emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify(this);
        result.multistagePlayIndex_ = multistagePlayIndex_;
        result.aJOLCIGIMNA_ = aJOLCIGIMNA_;
        result.dKAPCHHJPCM_ = dKAPCHHJPCM_;
        result.levelId_ = levelId_;
        result.eEBBADCOGNG_ = eEBBADCOGNG_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify other) {
        if (other == emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.getDefaultInstance()) return this;
        if (other.getMultistagePlayIndex() != 0) {
          setMultistagePlayIndex(other.getMultistagePlayIndex());
        }
        if (other.getAJOLCIGIMNA() != 0) {
          setAJOLCIGIMNA(other.getAJOLCIGIMNA());
        }
        if (other.getDKAPCHHJPCM() != 0) {
          setDKAPCHHJPCM(other.getDKAPCHHJPCM());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getEEBBADCOGNG() != 0) {
          setEEBBADCOGNG(other.getEEBBADCOGNG());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int multistagePlayIndex_ ;
      /**
       * <code>uint32 multistage_play_index = 9;</code>
       * @return The multistagePlayIndex.
       */
      @java.lang.Override
      public int getMultistagePlayIndex() {
        return multistagePlayIndex_;
      }
      /**
       * <code>uint32 multistage_play_index = 9;</code>
       * @param value The multistagePlayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setMultistagePlayIndex(int value) {
        
        multistagePlayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 multistage_play_index = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMultistagePlayIndex() {
        
        multistagePlayIndex_ = 0;
        onChanged();
        return this;
      }

      private int aJOLCIGIMNA_ ;
      /**
       * <code>uint32 AJOLCIGIMNA = 8;</code>
       * @return The aJOLCIGIMNA.
       */
      @java.lang.Override
      public int getAJOLCIGIMNA() {
        return aJOLCIGIMNA_;
      }
      /**
       * <code>uint32 AJOLCIGIMNA = 8;</code>
       * @param value The aJOLCIGIMNA to set.
       * @return This builder for chaining.
       */
      public Builder setAJOLCIGIMNA(int value) {
        
        aJOLCIGIMNA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AJOLCIGIMNA = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAJOLCIGIMNA() {
        
        aJOLCIGIMNA_ = 0;
        onChanged();
        return this;
      }

      private int dKAPCHHJPCM_ ;
      /**
       * <code>uint32 DKAPCHHJPCM = 6;</code>
       * @return The dKAPCHHJPCM.
       */
      @java.lang.Override
      public int getDKAPCHHJPCM() {
        return dKAPCHHJPCM_;
      }
      /**
       * <code>uint32 DKAPCHHJPCM = 6;</code>
       * @param value The dKAPCHHJPCM to set.
       * @return This builder for chaining.
       */
      public Builder setDKAPCHHJPCM(int value) {
        
        dKAPCHHJPCM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DKAPCHHJPCM = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDKAPCHHJPCM() {
        
        dKAPCHHJPCM_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int eEBBADCOGNG_ ;
      /**
       * <code>uint32 EEBBADCOGNG = 5;</code>
       * @return The eEBBADCOGNG.
       */
      @java.lang.Override
      public int getEEBBADCOGNG() {
        return eEBBADCOGNG_;
      }
      /**
       * <code>uint32 EEBBADCOGNG = 5;</code>
       * @param value The eEBBADCOGNG to set.
       * @return This builder for chaining.
       */
      public Builder setEEBBADCOGNG(int value) {
        
        eEBBADCOGNG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EEBBADCOGNG = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEEBBADCOGNG() {
        
        eEBBADCOGNG_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 4;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 4;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectGallerySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectGallerySettleNotify)
    private static final emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify();
    }

    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectGallerySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectGallerySettleNotify>() {
      @java.lang.Override
      public CoinCollectGallerySettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoinCollectGallerySettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoinCollectGallerySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectGallerySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectGallerySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$CoinCollectGallerySettleNotify.proto\"\247" +
      "\001\n\036CoinCollectGallerySettleNotify\022\035\n\025mul" +
      "tistage_play_index\030\t \001(\r\022\023\n\013AJOLCIGIMNA\030" +
      "\010 \001(\r\022\023\n\013DKAPCHHJPCM\030\006 \001(\r\022\020\n\010level_id\030\n" +
      " \001(\r\022\023\n\013EEBBADCOGNG\030\005 \001(\r\022\025\n\ris_new_reco" +
      "rd\030\004 \001(\010B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoinCollectGallerySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectGallerySettleNotify_descriptor,
        new java.lang.String[] { "MultistagePlayIndex", "AJOLCIGIMNA", "DKAPCHHJPCM", "LevelId", "EEBBADCOGNG", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
