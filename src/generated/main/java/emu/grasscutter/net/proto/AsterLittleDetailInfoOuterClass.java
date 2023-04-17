// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AsterLittleDetailInfo.proto

package emu.grasscutter.net.proto;

public final class AsterLittleDetailInfoOuterClass {
  private AsterLittleDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AsterLittleDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AsterLittleDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 stage_begin_time = 6;</code>
     * @return The stageBeginTime.
     */
    int getStageBeginTime();

    /**
     * <code>.AsterLittleStageState stage_state = 10;</code>
     * @return The enum numeric value on the wire for stageState.
     */
    int getStageStateValue();
    /**
     * <code>.AsterLittleStageState stage_state = 10;</code>
     * @return The stageState.
     */
    emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState getStageState();

    /**
     * <code>uint32 begin_time = 12;</code>
     * @return The beginTime.
     */
    int getBeginTime();
  }
  /**
   * <pre>
   * Name: FDFGOMALABC
   * </pre>
   *
   * Protobuf type {@code AsterLittleDetailInfo}
   */
  public static final class AsterLittleDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AsterLittleDetailInfo)
      AsterLittleDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AsterLittleDetailInfo.newBuilder() to construct.
    private AsterLittleDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AsterLittleDetailInfo() {
      stageState_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AsterLittleDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AsterLittleDetailInfo(
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

              isOpen_ = input.readBool();
              break;
            }
            case 48: {

              stageBeginTime_ = input.readUInt32();
              break;
            }
            case 80: {
              int rawValue = input.readEnum();

              stageState_ = rawValue;
              break;
            }
            case 96: {

              beginTime_ = input.readUInt32();
              break;
            }
            case 104: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.class, emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 2;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 13;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int STAGE_BEGIN_TIME_FIELD_NUMBER = 6;
    private int stageBeginTime_;
    /**
     * <code>uint32 stage_begin_time = 6;</code>
     * @return The stageBeginTime.
     */
    @java.lang.Override
    public int getStageBeginTime() {
      return stageBeginTime_;
    }

    public static final int STAGE_STATE_FIELD_NUMBER = 10;
    private int stageState_;
    /**
     * <code>.AsterLittleStageState stage_state = 10;</code>
     * @return The enum numeric value on the wire for stageState.
     */
    @java.lang.Override public int getStageStateValue() {
      return stageState_;
    }
    /**
     * <code>.AsterLittleStageState stage_state = 10;</code>
     * @return The stageState.
     */
    @java.lang.Override public emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState getStageState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState result = emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.valueOf(stageState_);
      return result == null ? emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.UNRECOGNIZED : result;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 12;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 12;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
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
      if (isOpen_ != false) {
        output.writeBool(2, isOpen_);
      }
      if (stageBeginTime_ != 0) {
        output.writeUInt32(6, stageBeginTime_);
      }
      if (stageState_ != emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.ASTER_LITTLE_STAGE_NONE.getNumber()) {
        output.writeEnum(10, stageState_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(12, beginTime_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isOpen_);
      }
      if (stageBeginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, stageBeginTime_);
      }
      if (stageState_ != emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.ASTER_LITTLE_STAGE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, stageState_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, beginTime_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo other = (emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getStageBeginTime()
          != other.getStageBeginTime()) return false;
      if (stageState_ != other.stageState_) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + STAGE_BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStageBeginTime();
      hash = (37 * hash) + STAGE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + stageState_;
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo prototype) {
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
     * Name: FDFGOMALABC
     * </pre>
     *
     * Protobuf type {@code AsterLittleDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AsterLittleDetailInfo)
        emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.class, emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.newBuilder()
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
        isOpen_ = false;

        stageId_ = 0;

        stageBeginTime_ = 0;

        stageState_ = 0;

        beginTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo build() {
        emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo buildPartial() {
        emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo result = new emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo(this);
        result.isOpen_ = isOpen_;
        result.stageId_ = stageId_;
        result.stageBeginTime_ = stageBeginTime_;
        result.stageState_ = stageState_;
        result.beginTime_ = beginTime_;
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
        if (other instanceof emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo other) {
        if (other == emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getStageBeginTime() != 0) {
          setStageBeginTime(other.getStageBeginTime());
        }
        if (other.stageState_ != 0) {
          setStageStateValue(other.getStageStateValue());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
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
        emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 2;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int stageBeginTime_ ;
      /**
       * <code>uint32 stage_begin_time = 6;</code>
       * @return The stageBeginTime.
       */
      @java.lang.Override
      public int getStageBeginTime() {
        return stageBeginTime_;
      }
      /**
       * <code>uint32 stage_begin_time = 6;</code>
       * @param value The stageBeginTime to set.
       * @return This builder for chaining.
       */
      public Builder setStageBeginTime(int value) {
        
        stageBeginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_begin_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageBeginTime() {
        
        stageBeginTime_ = 0;
        onChanged();
        return this;
      }

      private int stageState_ = 0;
      /**
       * <code>.AsterLittleStageState stage_state = 10;</code>
       * @return The enum numeric value on the wire for stageState.
       */
      @java.lang.Override public int getStageStateValue() {
        return stageState_;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 10;</code>
       * @param value The enum numeric value on the wire for stageState to set.
       * @return This builder for chaining.
       */
      public Builder setStageStateValue(int value) {
        
        stageState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 10;</code>
       * @return The stageState.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState getStageState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState result = emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.valueOf(stageState_);
        return result == null ? emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.UNRECOGNIZED : result;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 10;</code>
       * @param value The stageState to set.
       * @return This builder for chaining.
       */
      public Builder setStageState(emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        stageState_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageState() {
        
        stageState_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 12;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 12;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AsterLittleDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:AsterLittleDetailInfo)
    private static final emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo();
    }

    public static emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AsterLittleDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<AsterLittleDetailInfo>() {
      @java.lang.Override
      public AsterLittleDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AsterLittleDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AsterLittleDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AsterLittleDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AsterLittleDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AsterLittleDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AsterLittleDetailInfo.proto\032\033AsterLitt" +
      "leStageState.proto\"\225\001\n\025AsterLittleDetail" +
      "Info\022\017\n\007is_open\030\002 \001(\010\022\020\n\010stage_id\030\r \001(\r\022" +
      "\030\n\020stage_begin_time\030\006 \001(\r\022+\n\013stage_state" +
      "\030\n \001(\0162\026.AsterLittleStageState\022\022\n\nbegin_" +
      "time\030\014 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.getDescriptor(),
        });
    internal_static_AsterLittleDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AsterLittleDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AsterLittleDetailInfo_descriptor,
        new java.lang.String[] { "IsOpen", "StageId", "StageBeginTime", "StageState", "BeginTime", });
    emu.grasscutter.net.proto.AsterLittleStageStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
