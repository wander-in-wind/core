// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSDeckSaveRsp.proto

package emu.grasscutter.net.proto;

public final class GCGDSDeckSaveRspOuterClass {
  private GCGDSDeckSaveRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSDeckSaveRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSDeckSaveRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 create_time = 14;</code>
     * @return The createTime.
     */
    int getCreateTime();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <pre>
     *AHAIAIPGFDN snooswap
     * </pre>
     *
     * <code>uint32 deck_id = 15;</code>
     * @return The deckId.
     */
    int getDeckId();

    /**
     * <pre>
     *BBNOFLCPEBA snooswap
     * </pre>
     *
     * <code>bool is_valid = 4;</code>
     * @return The isValid.
     */
    boolean getIsValid();
  }
  /**
   * <pre>
   * Name: BEICDJDPJML
   * CmdId: 7382
   * </pre>
   *
   * Protobuf type {@code GCGDSDeckSaveRsp}
   */
  public static final class GCGDSDeckSaveRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSDeckSaveRsp)
      GCGDSDeckSaveRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSDeckSaveRsp.newBuilder() to construct.
    private GCGDSDeckSaveRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSDeckSaveRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSDeckSaveRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSDeckSaveRsp(
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

              isValid_ = input.readBool();
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              createTime_ = input.readUInt32();
              break;
            }
            case 120: {

              deckId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.internal_static_GCGDSDeckSaveRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.internal_static_GCGDSDeckSaveRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp.class, emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp.Builder.class);
    }

    public static final int CREATE_TIME_FIELD_NUMBER = 14;
    private int createTime_;
    /**
     * <code>uint32 create_time = 14;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public int getCreateTime() {
      return createTime_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int DECK_ID_FIELD_NUMBER = 15;
    private int deckId_;
    /**
     * <pre>
     *AHAIAIPGFDN snooswap
     * </pre>
     *
     * <code>uint32 deck_id = 15;</code>
     * @return The deckId.
     */
    @java.lang.Override
    public int getDeckId() {
      return deckId_;
    }

    public static final int IS_VALID_FIELD_NUMBER = 4;
    private boolean isValid_;
    /**
     * <pre>
     *BBNOFLCPEBA snooswap
     * </pre>
     *
     * <code>bool is_valid = 4;</code>
     * @return The isValid.
     */
    @java.lang.Override
    public boolean getIsValid() {
      return isValid_;
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
      if (isValid_ != false) {
        output.writeBool(4, isValid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (createTime_ != 0) {
        output.writeUInt32(14, createTime_);
      }
      if (deckId_ != 0) {
        output.writeUInt32(15, deckId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isValid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (createTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, createTime_);
      }
      if (deckId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, deckId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp other = (emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp) obj;

      if (getCreateTime()
          != other.getCreateTime()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getDeckId()
          != other.getDeckId()) return false;
      if (getIsValid()
          != other.getIsValid()) return false;
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
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + DECK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeckId();
      hash = (37 * hash) + IS_VALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsValid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp prototype) {
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
     * Name: BEICDJDPJML
     * CmdId: 7382
     * </pre>
     *
     * Protobuf type {@code GCGDSDeckSaveRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSDeckSaveRsp)
        emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.internal_static_GCGDSDeckSaveRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.internal_static_GCGDSDeckSaveRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp.class, emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp.newBuilder()
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
        createTime_ = 0;

        retcode_ = 0;

        deckId_ = 0;

        isValid_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.internal_static_GCGDSDeckSaveRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp build() {
        emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp buildPartial() {
        emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp result = new emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp(this);
        result.createTime_ = createTime_;
        result.retcode_ = retcode_;
        result.deckId_ = deckId_;
        result.isValid_ = isValid_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp other) {
        if (other == emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp.getDefaultInstance()) return this;
        if (other.getCreateTime() != 0) {
          setCreateTime(other.getCreateTime());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getDeckId() != 0) {
          setDeckId(other.getDeckId());
        }
        if (other.getIsValid() != false) {
          setIsValid(other.getIsValid());
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
        emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int createTime_ ;
      /**
       * <code>uint32 create_time = 14;</code>
       * @return The createTime.
       */
      @java.lang.Override
      public int getCreateTime() {
        return createTime_;
      }
      /**
       * <code>uint32 create_time = 14;</code>
       * @param value The createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTime(int value) {
        
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 create_time = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreateTime() {
        
        createTime_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int deckId_ ;
      /**
       * <pre>
       *AHAIAIPGFDN snooswap
       * </pre>
       *
       * <code>uint32 deck_id = 15;</code>
       * @return The deckId.
       */
      @java.lang.Override
      public int getDeckId() {
        return deckId_;
      }
      /**
       * <pre>
       *AHAIAIPGFDN snooswap
       * </pre>
       *
       * <code>uint32 deck_id = 15;</code>
       * @param value The deckId to set.
       * @return This builder for chaining.
       */
      public Builder setDeckId(int value) {
        
        deckId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *AHAIAIPGFDN snooswap
       * </pre>
       *
       * <code>uint32 deck_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeckId() {
        
        deckId_ = 0;
        onChanged();
        return this;
      }

      private boolean isValid_ ;
      /**
       * <pre>
       *BBNOFLCPEBA snooswap
       * </pre>
       *
       * <code>bool is_valid = 4;</code>
       * @return The isValid.
       */
      @java.lang.Override
      public boolean getIsValid() {
        return isValid_;
      }
      /**
       * <pre>
       *BBNOFLCPEBA snooswap
       * </pre>
       *
       * <code>bool is_valid = 4;</code>
       * @param value The isValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsValid(boolean value) {
        
        isValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *BBNOFLCPEBA snooswap
       * </pre>
       *
       * <code>bool is_valid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsValid() {
        
        isValid_ = false;
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


      // @@protoc_insertion_point(builder_scope:GCGDSDeckSaveRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGDSDeckSaveRsp)
    private static final emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp();
    }

    public static emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSDeckSaveRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSDeckSaveRsp>() {
      @java.lang.Override
      public GCGDSDeckSaveRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSDeckSaveRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSDeckSaveRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSDeckSaveRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSDeckSaveRspOuterClass.GCGDSDeckSaveRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSDeckSaveRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSDeckSaveRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGDSDeckSaveRsp.proto\"[\n\020GCGDSDeckSav" +
      "eRsp\022\023\n\013create_time\030\016 \001(\r\022\017\n\007retcode\030\006 \001" +
      "(\005\022\017\n\007deck_id\030\017 \001(\r\022\020\n\010is_valid\030\004 \001(\010B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSDeckSaveRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSDeckSaveRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSDeckSaveRsp_descriptor,
        new java.lang.String[] { "CreateTime", "Retcode", "DeckId", "IsValid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
