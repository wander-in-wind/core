// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishBattleEndReq.proto

package emu.grasscutter.net.proto;

public final class FishBattleEndReqOuterClass {
  private FishBattleEndReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishBattleEndReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishBattleEndReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_bonus_time = 15;</code>
     * @return The maxBonusTime.
     */
    int getMaxBonusTime();

    /**
     * <code>bool is_always_bonus = 2;</code>
     * @return The isAlwaysBonus.
     */
    boolean getIsAlwaysBonus();

    /**
     * <code>.FishBattleResult battle_result = 12;</code>
     * @return The enum numeric value on the wire for battleResult.
     */
    int getBattleResultValue();
    /**
     * <code>.FishBattleResult battle_result = 12;</code>
     * @return The battleResult.
     */
    emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult getBattleResult();
  }
  /**
   * <pre>
   * CmdId: 5831
   * Name: EGHHKBCHAML
   * </pre>
   *
   * Protobuf type {@code FishBattleEndReq}
   */
  public static final class FishBattleEndReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishBattleEndReq)
      FishBattleEndReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishBattleEndReq.newBuilder() to construct.
    private FishBattleEndReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishBattleEndReq() {
      battleResult_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishBattleEndReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FishBattleEndReq(
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

              isAlwaysBonus_ = input.readBool();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              battleResult_ = rawValue;
              break;
            }
            case 120: {

              maxBonusTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.class, emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.Builder.class);
    }

    public static final int MAX_BONUS_TIME_FIELD_NUMBER = 15;
    private int maxBonusTime_;
    /**
     * <code>uint32 max_bonus_time = 15;</code>
     * @return The maxBonusTime.
     */
    @java.lang.Override
    public int getMaxBonusTime() {
      return maxBonusTime_;
    }

    public static final int IS_ALWAYS_BONUS_FIELD_NUMBER = 2;
    private boolean isAlwaysBonus_;
    /**
     * <code>bool is_always_bonus = 2;</code>
     * @return The isAlwaysBonus.
     */
    @java.lang.Override
    public boolean getIsAlwaysBonus() {
      return isAlwaysBonus_;
    }

    public static final int BATTLE_RESULT_FIELD_NUMBER = 12;
    private int battleResult_;
    /**
     * <code>.FishBattleResult battle_result = 12;</code>
     * @return The enum numeric value on the wire for battleResult.
     */
    @java.lang.Override public int getBattleResultValue() {
      return battleResult_;
    }
    /**
     * <code>.FishBattleResult battle_result = 12;</code>
     * @return The battleResult.
     */
    @java.lang.Override public emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult getBattleResult() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult result = emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.valueOf(battleResult_);
      return result == null ? emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.UNRECOGNIZED : result;
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
      if (isAlwaysBonus_ != false) {
        output.writeBool(2, isAlwaysBonus_);
      }
      if (battleResult_ != emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.FISH_BATTLE_RESULT_NONE.getNumber()) {
        output.writeEnum(12, battleResult_);
      }
      if (maxBonusTime_ != 0) {
        output.writeUInt32(15, maxBonusTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAlwaysBonus_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isAlwaysBonus_);
      }
      if (battleResult_ != emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.FISH_BATTLE_RESULT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, battleResult_);
      }
      if (maxBonusTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, maxBonusTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq other = (emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq) obj;

      if (getMaxBonusTime()
          != other.getMaxBonusTime()) return false;
      if (getIsAlwaysBonus()
          != other.getIsAlwaysBonus()) return false;
      if (battleResult_ != other.battleResult_) return false;
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
      hash = (37 * hash) + MAX_BONUS_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMaxBonusTime();
      hash = (37 * hash) + IS_ALWAYS_BONUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAlwaysBonus());
      hash = (37 * hash) + BATTLE_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + battleResult_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq prototype) {
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
     * CmdId: 5831
     * Name: EGHHKBCHAML
     * </pre>
     *
     * Protobuf type {@code FishBattleEndReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishBattleEndReq)
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.class, emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.newBuilder()
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
        maxBonusTime_ = 0;

        isAlwaysBonus_ = false;

        battleResult_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq build() {
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq buildPartial() {
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq result = new emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq(this);
        result.maxBonusTime_ = maxBonusTime_;
        result.isAlwaysBonus_ = isAlwaysBonus_;
        result.battleResult_ = battleResult_;
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
        if (other instanceof emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq) {
          return mergeFrom((emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq other) {
        if (other == emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.getDefaultInstance()) return this;
        if (other.getMaxBonusTime() != 0) {
          setMaxBonusTime(other.getMaxBonusTime());
        }
        if (other.getIsAlwaysBonus() != false) {
          setIsAlwaysBonus(other.getIsAlwaysBonus());
        }
        if (other.battleResult_ != 0) {
          setBattleResultValue(other.getBattleResultValue());
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
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int maxBonusTime_ ;
      /**
       * <code>uint32 max_bonus_time = 15;</code>
       * @return The maxBonusTime.
       */
      @java.lang.Override
      public int getMaxBonusTime() {
        return maxBonusTime_;
      }
      /**
       * <code>uint32 max_bonus_time = 15;</code>
       * @param value The maxBonusTime to set.
       * @return This builder for chaining.
       */
      public Builder setMaxBonusTime(int value) {
        
        maxBonusTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_bonus_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxBonusTime() {
        
        maxBonusTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isAlwaysBonus_ ;
      /**
       * <code>bool is_always_bonus = 2;</code>
       * @return The isAlwaysBonus.
       */
      @java.lang.Override
      public boolean getIsAlwaysBonus() {
        return isAlwaysBonus_;
      }
      /**
       * <code>bool is_always_bonus = 2;</code>
       * @param value The isAlwaysBonus to set.
       * @return This builder for chaining.
       */
      public Builder setIsAlwaysBonus(boolean value) {
        
        isAlwaysBonus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_always_bonus = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAlwaysBonus() {
        
        isAlwaysBonus_ = false;
        onChanged();
        return this;
      }

      private int battleResult_ = 0;
      /**
       * <code>.FishBattleResult battle_result = 12;</code>
       * @return The enum numeric value on the wire for battleResult.
       */
      @java.lang.Override public int getBattleResultValue() {
        return battleResult_;
      }
      /**
       * <code>.FishBattleResult battle_result = 12;</code>
       * @param value The enum numeric value on the wire for battleResult to set.
       * @return This builder for chaining.
       */
      public Builder setBattleResultValue(int value) {
        
        battleResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.FishBattleResult battle_result = 12;</code>
       * @return The battleResult.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult getBattleResult() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult result = emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.valueOf(battleResult_);
        return result == null ? emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.UNRECOGNIZED : result;
      }
      /**
       * <code>.FishBattleResult battle_result = 12;</code>
       * @param value The battleResult to set.
       * @return This builder for chaining.
       */
      public Builder setBattleResult(emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        battleResult_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FishBattleResult battle_result = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBattleResult() {
        
        battleResult_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FishBattleEndReq)
    }

    // @@protoc_insertion_point(class_scope:FishBattleEndReq)
    private static final emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq();
    }

    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishBattleEndReq>
        PARSER = new com.google.protobuf.AbstractParser<FishBattleEndReq>() {
      @java.lang.Override
      public FishBattleEndReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FishBattleEndReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FishBattleEndReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishBattleEndReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishBattleEndReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishBattleEndReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FishBattleEndReq.proto\032\026FishBattleResu" +
      "lt.proto\"m\n\020FishBattleEndReq\022\026\n\016max_bonu" +
      "s_time\030\017 \001(\r\022\027\n\017is_always_bonus\030\002 \001(\010\022(\n" +
      "\rbattle_result\030\014 \001(\0162\021.FishBattleResultB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FishBattleResultOuterClass.getDescriptor(),
        });
    internal_static_FishBattleEndReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishBattleEndReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishBattleEndReq_descriptor,
        new java.lang.String[] { "MaxBonusTime", "IsAlwaysBonus", "BattleResult", });
    emu.grasscutter.net.proto.FishBattleResultOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
