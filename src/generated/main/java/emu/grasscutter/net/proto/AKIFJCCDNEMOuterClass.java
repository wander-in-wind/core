// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AKIFJCCDNEM.proto

package emu.grasscutter.net.proto;

public final class AKIFJCCDNEMOuterClass {
  private AKIFJCCDNEMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AKIFJCCDNEMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AKIFJCCDNEM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cost = 2;</code>
     * @return The cost.
     */
    int getCost();

    /**
     * <code>bool is_new_record = 1;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 NCGGLBKNEJD = 13;</code>
     * @return The nCGGLBKNEJD.
     */
    int getNCGGLBKNEJD();

    /**
     * <code>uint32 BFCNINBLMEJ = 14;</code>
     * @return The bFCNINBLMEJ.
     */
    int getBFCNINBLMEJ();
  }
  /**
   * <pre>
   * CmdId: 22017
   * Name: AKIFJCCDNEM
   * </pre>
   *
   * Protobuf type {@code AKIFJCCDNEM}
   */
  public static final class AKIFJCCDNEM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AKIFJCCDNEM)
      AKIFJCCDNEMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AKIFJCCDNEM.newBuilder() to construct.
    private AKIFJCCDNEM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AKIFJCCDNEM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AKIFJCCDNEM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AKIFJCCDNEM(
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

              isNewRecord_ = input.readBool();
              break;
            }
            case 16: {

              cost_ = input.readUInt32();
              break;
            }
            case 48: {

              levelId_ = input.readUInt32();
              break;
            }
            case 104: {

              nCGGLBKNEJD_ = input.readUInt32();
              break;
            }
            case 112: {

              bFCNINBLMEJ_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.internal_static_AKIFJCCDNEM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.internal_static_AKIFJCCDNEM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM.class, emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM.Builder.class);
    }

    public static final int COST_FIELD_NUMBER = 2;
    private int cost_;
    /**
     * <code>uint32 cost = 2;</code>
     * @return The cost.
     */
    @java.lang.Override
    public int getCost() {
      return cost_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 1;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 1;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 6;
    private int levelId_;
    /**
     * <code>uint32 level_id = 6;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int NCGGLBKNEJD_FIELD_NUMBER = 13;
    private int nCGGLBKNEJD_;
    /**
     * <code>uint32 NCGGLBKNEJD = 13;</code>
     * @return The nCGGLBKNEJD.
     */
    @java.lang.Override
    public int getNCGGLBKNEJD() {
      return nCGGLBKNEJD_;
    }

    public static final int BFCNINBLMEJ_FIELD_NUMBER = 14;
    private int bFCNINBLMEJ_;
    /**
     * <code>uint32 BFCNINBLMEJ = 14;</code>
     * @return The bFCNINBLMEJ.
     */
    @java.lang.Override
    public int getBFCNINBLMEJ() {
      return bFCNINBLMEJ_;
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
        output.writeBool(1, isNewRecord_);
      }
      if (cost_ != 0) {
        output.writeUInt32(2, cost_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(6, levelId_);
      }
      if (nCGGLBKNEJD_ != 0) {
        output.writeUInt32(13, nCGGLBKNEJD_);
      }
      if (bFCNINBLMEJ_ != 0) {
        output.writeUInt32(14, bFCNINBLMEJ_);
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
          .computeBoolSize(1, isNewRecord_);
      }
      if (cost_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cost_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, levelId_);
      }
      if (nCGGLBKNEJD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, nCGGLBKNEJD_);
      }
      if (bFCNINBLMEJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, bFCNINBLMEJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM other = (emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM) obj;

      if (getCost()
          != other.getCost()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getNCGGLBKNEJD()
          != other.getNCGGLBKNEJD()) return false;
      if (getBFCNINBLMEJ()
          != other.getBFCNINBLMEJ()) return false;
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
      hash = (37 * hash) + COST_FIELD_NUMBER;
      hash = (53 * hash) + getCost();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + NCGGLBKNEJD_FIELD_NUMBER;
      hash = (53 * hash) + getNCGGLBKNEJD();
      hash = (37 * hash) + BFCNINBLMEJ_FIELD_NUMBER;
      hash = (53 * hash) + getBFCNINBLMEJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM prototype) {
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
     * CmdId: 22017
     * Name: AKIFJCCDNEM
     * </pre>
     *
     * Protobuf type {@code AKIFJCCDNEM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AKIFJCCDNEM)
        emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.internal_static_AKIFJCCDNEM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.internal_static_AKIFJCCDNEM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM.class, emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM.newBuilder()
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
        cost_ = 0;

        isNewRecord_ = false;

        levelId_ = 0;

        nCGGLBKNEJD_ = 0;

        bFCNINBLMEJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.internal_static_AKIFJCCDNEM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM build() {
        emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM buildPartial() {
        emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM result = new emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM(this);
        result.cost_ = cost_;
        result.isNewRecord_ = isNewRecord_;
        result.levelId_ = levelId_;
        result.nCGGLBKNEJD_ = nCGGLBKNEJD_;
        result.bFCNINBLMEJ_ = bFCNINBLMEJ_;
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
        if (other instanceof emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM) {
          return mergeFrom((emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM other) {
        if (other == emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM.getDefaultInstance()) return this;
        if (other.getCost() != 0) {
          setCost(other.getCost());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getNCGGLBKNEJD() != 0) {
          setNCGGLBKNEJD(other.getNCGGLBKNEJD());
        }
        if (other.getBFCNINBLMEJ() != 0) {
          setBFCNINBLMEJ(other.getBFCNINBLMEJ());
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
        emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cost_ ;
      /**
       * <code>uint32 cost = 2;</code>
       * @return The cost.
       */
      @java.lang.Override
      public int getCost() {
        return cost_;
      }
      /**
       * <code>uint32 cost = 2;</code>
       * @param value The cost to set.
       * @return This builder for chaining.
       */
      public Builder setCost(int value) {
        
        cost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCost() {
        
        cost_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 1;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 1;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 6;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int nCGGLBKNEJD_ ;
      /**
       * <code>uint32 NCGGLBKNEJD = 13;</code>
       * @return The nCGGLBKNEJD.
       */
      @java.lang.Override
      public int getNCGGLBKNEJD() {
        return nCGGLBKNEJD_;
      }
      /**
       * <code>uint32 NCGGLBKNEJD = 13;</code>
       * @param value The nCGGLBKNEJD to set.
       * @return This builder for chaining.
       */
      public Builder setNCGGLBKNEJD(int value) {
        
        nCGGLBKNEJD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NCGGLBKNEJD = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearNCGGLBKNEJD() {
        
        nCGGLBKNEJD_ = 0;
        onChanged();
        return this;
      }

      private int bFCNINBLMEJ_ ;
      /**
       * <code>uint32 BFCNINBLMEJ = 14;</code>
       * @return The bFCNINBLMEJ.
       */
      @java.lang.Override
      public int getBFCNINBLMEJ() {
        return bFCNINBLMEJ_;
      }
      /**
       * <code>uint32 BFCNINBLMEJ = 14;</code>
       * @param value The bFCNINBLMEJ to set.
       * @return This builder for chaining.
       */
      public Builder setBFCNINBLMEJ(int value) {
        
        bFCNINBLMEJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BFCNINBLMEJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBFCNINBLMEJ() {
        
        bFCNINBLMEJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AKIFJCCDNEM)
    }

    // @@protoc_insertion_point(class_scope:AKIFJCCDNEM)
    private static final emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM();
    }

    public static emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AKIFJCCDNEM>
        PARSER = new com.google.protobuf.AbstractParser<AKIFJCCDNEM>() {
      @java.lang.Override
      public AKIFJCCDNEM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AKIFJCCDNEM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AKIFJCCDNEM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AKIFJCCDNEM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AKIFJCCDNEMOuterClass.AKIFJCCDNEM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AKIFJCCDNEM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AKIFJCCDNEM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AKIFJCCDNEM.proto\"n\n\013AKIFJCCDNEM\022\014\n\004co" +
      "st\030\002 \001(\r\022\025\n\ris_new_record\030\001 \001(\010\022\020\n\010level" +
      "_id\030\006 \001(\r\022\023\n\013NCGGLBKNEJD\030\r \001(\r\022\023\n\013BFCNIN" +
      "BLMEJ\030\016 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AKIFJCCDNEM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AKIFJCCDNEM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AKIFJCCDNEM_descriptor,
        new java.lang.String[] { "Cost", "IsNewRecord", "LevelId", "NCGGLBKNEJD", "BFCNINBLMEJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
