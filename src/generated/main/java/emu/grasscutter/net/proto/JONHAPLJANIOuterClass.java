// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JONHAPLJANI.proto

package emu.grasscutter.net.proto;

public final class JONHAPLJANIOuterClass {
  private JONHAPLJANIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JONHAPLJANIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JONHAPLJANI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 min_finish_time = 4;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>uint32 LEDKDCJIDNE = 5;</code>
     * @return The lEDKDCJIDNE.
     */
    int getLEDKDCJIDNE();

    /**
     * <code>bool is_have_try = 8;</code>
     * @return The isHaveTry.
     */
    boolean getIsHaveTry();
  }
  /**
   * <pre>
   * Name: JONHAPLJANI
   * </pre>
   *
   * Protobuf type {@code JONHAPLJANI}
   */
  public static final class JONHAPLJANI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JONHAPLJANI)
      JONHAPLJANIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JONHAPLJANI.newBuilder() to construct.
    private JONHAPLJANI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JONHAPLJANI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JONHAPLJANI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JONHAPLJANI(
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

              minFinishTime_ = input.readUInt32();
              break;
            }
            case 40: {

              lEDKDCJIDNE_ = input.readUInt32();
              break;
            }
            case 64: {

              isHaveTry_ = input.readBool();
              break;
            }
            case 96: {

              isFinish_ = input.readBool();
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
      return emu.grasscutter.net.proto.JONHAPLJANIOuterClass.internal_static_JONHAPLJANI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JONHAPLJANIOuterClass.internal_static_JONHAPLJANI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.class, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder.class);
    }

    public static final int IS_FINISH_FIELD_NUMBER = 12;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 4;
    private int minFinishTime_;
    /**
     * <code>uint32 min_finish_time = 4;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int LEDKDCJIDNE_FIELD_NUMBER = 5;
    private int lEDKDCJIDNE_;
    /**
     * <code>uint32 LEDKDCJIDNE = 5;</code>
     * @return The lEDKDCJIDNE.
     */
    @java.lang.Override
    public int getLEDKDCJIDNE() {
      return lEDKDCJIDNE_;
    }

    public static final int IS_HAVE_TRY_FIELD_NUMBER = 8;
    private boolean isHaveTry_;
    /**
     * <code>bool is_have_try = 8;</code>
     * @return The isHaveTry.
     */
    @java.lang.Override
    public boolean getIsHaveTry() {
      return isHaveTry_;
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
      if (minFinishTime_ != 0) {
        output.writeUInt32(4, minFinishTime_);
      }
      if (lEDKDCJIDNE_ != 0) {
        output.writeUInt32(5, lEDKDCJIDNE_);
      }
      if (isHaveTry_ != false) {
        output.writeBool(8, isHaveTry_);
      }
      if (isFinish_ != false) {
        output.writeBool(12, isFinish_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, minFinishTime_);
      }
      if (lEDKDCJIDNE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, lEDKDCJIDNE_);
      }
      if (isHaveTry_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isHaveTry_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isFinish_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI other = (emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI) obj;

      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getLEDKDCJIDNE()
          != other.getLEDKDCJIDNE()) return false;
      if (getIsHaveTry()
          != other.getIsHaveTry()) return false;
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
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + LEDKDCJIDNE_FIELD_NUMBER;
      hash = (53 * hash) + getLEDKDCJIDNE();
      hash = (37 * hash) + IS_HAVE_TRY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHaveTry());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI prototype) {
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
     * Name: JONHAPLJANI
     * </pre>
     *
     * Protobuf type {@code JONHAPLJANI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JONHAPLJANI)
        emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JONHAPLJANIOuterClass.internal_static_JONHAPLJANI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JONHAPLJANIOuterClass.internal_static_JONHAPLJANI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.class, emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.newBuilder()
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
        isFinish_ = false;

        minFinishTime_ = 0;

        lEDKDCJIDNE_ = 0;

        isHaveTry_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JONHAPLJANIOuterClass.internal_static_JONHAPLJANI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI build() {
        emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI buildPartial() {
        emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI result = new emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI(this);
        result.isFinish_ = isFinish_;
        result.minFinishTime_ = minFinishTime_;
        result.lEDKDCJIDNE_ = lEDKDCJIDNE_;
        result.isHaveTry_ = isHaveTry_;
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
        if (other instanceof emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI) {
          return mergeFrom((emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI other) {
        if (other == emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI.getDefaultInstance()) return this;
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getLEDKDCJIDNE() != 0) {
          setLEDKDCJIDNE(other.getLEDKDCJIDNE());
        }
        if (other.getIsHaveTry() != false) {
          setIsHaveTry(other.getIsHaveTry());
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
        emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 12;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 4;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 4;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {
        
        minFinishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private int lEDKDCJIDNE_ ;
      /**
       * <code>uint32 LEDKDCJIDNE = 5;</code>
       * @return The lEDKDCJIDNE.
       */
      @java.lang.Override
      public int getLEDKDCJIDNE() {
        return lEDKDCJIDNE_;
      }
      /**
       * <code>uint32 LEDKDCJIDNE = 5;</code>
       * @param value The lEDKDCJIDNE to set.
       * @return This builder for chaining.
       */
      public Builder setLEDKDCJIDNE(int value) {
        
        lEDKDCJIDNE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LEDKDCJIDNE = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLEDKDCJIDNE() {
        
        lEDKDCJIDNE_ = 0;
        onChanged();
        return this;
      }

      private boolean isHaveTry_ ;
      /**
       * <code>bool is_have_try = 8;</code>
       * @return The isHaveTry.
       */
      @java.lang.Override
      public boolean getIsHaveTry() {
        return isHaveTry_;
      }
      /**
       * <code>bool is_have_try = 8;</code>
       * @param value The isHaveTry to set.
       * @return This builder for chaining.
       */
      public Builder setIsHaveTry(boolean value) {
        
        isHaveTry_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_have_try = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHaveTry() {
        
        isHaveTry_ = false;
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


      // @@protoc_insertion_point(builder_scope:JONHAPLJANI)
    }

    // @@protoc_insertion_point(class_scope:JONHAPLJANI)
    private static final emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI();
    }

    public static emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JONHAPLJANI>
        PARSER = new com.google.protobuf.AbstractParser<JONHAPLJANI>() {
      @java.lang.Override
      public JONHAPLJANI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JONHAPLJANI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JONHAPLJANI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JONHAPLJANI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JONHAPLJANIOuterClass.JONHAPLJANI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JONHAPLJANI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JONHAPLJANI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JONHAPLJANI.proto\"c\n\013JONHAPLJANI\022\021\n\tis" +
      "_finish\030\014 \001(\010\022\027\n\017min_finish_time\030\004 \001(\r\022\023" +
      "\n\013LEDKDCJIDNE\030\005 \001(\r\022\023\n\013is_have_try\030\010 \001(\010" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JONHAPLJANI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JONHAPLJANI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JONHAPLJANI_descriptor,
        new java.lang.String[] { "IsFinish", "MinFinishTime", "LEDKDCJIDNE", "IsHaveTry", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
