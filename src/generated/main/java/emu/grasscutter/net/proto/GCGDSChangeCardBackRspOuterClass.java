// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSChangeCardBackRsp.proto

package emu.grasscutter.net.proto;

public final class GCGDSChangeCardBackRspOuterClass {
  private GCGDSChangeCardBackRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSChangeCardBackRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSChangeCardBackRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 deck_id = 11;</code>
     * @return The deckId.
     */
    int getDeckId();

    /**
     * <code>uint32 card_back_id = 2;</code>
     * @return The cardBackId.
     */
    int getCardBackId();
  }
  /**
   * <pre>
   * CmdId: 7367
   * Name: OMDLPLDHBHC
   * </pre>
   *
   * Protobuf type {@code GCGDSChangeCardBackRsp}
   */
  public static final class GCGDSChangeCardBackRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSChangeCardBackRsp)
      GCGDSChangeCardBackRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSChangeCardBackRsp.newBuilder() to construct.
    private GCGDSChangeCardBackRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSChangeCardBackRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSChangeCardBackRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSChangeCardBackRsp(
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

              cardBackId_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

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
      return emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.internal_static_GCGDSChangeCardBackRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.internal_static_GCGDSChangeCardBackRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp.class, emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int DECK_ID_FIELD_NUMBER = 11;
    private int deckId_;
    /**
     * <code>uint32 deck_id = 11;</code>
     * @return The deckId.
     */
    @java.lang.Override
    public int getDeckId() {
      return deckId_;
    }

    public static final int CARD_BACK_ID_FIELD_NUMBER = 2;
    private int cardBackId_;
    /**
     * <code>uint32 card_back_id = 2;</code>
     * @return The cardBackId.
     */
    @java.lang.Override
    public int getCardBackId() {
      return cardBackId_;
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
      if (cardBackId_ != 0) {
        output.writeUInt32(2, cardBackId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (deckId_ != 0) {
        output.writeUInt32(11, deckId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardBackId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cardBackId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (deckId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, deckId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp other = (emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getDeckId()
          != other.getDeckId()) return false;
      if (getCardBackId()
          != other.getCardBackId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + DECK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeckId();
      hash = (37 * hash) + CARD_BACK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardBackId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp prototype) {
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
     * CmdId: 7367
     * Name: OMDLPLDHBHC
     * </pre>
     *
     * Protobuf type {@code GCGDSChangeCardBackRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSChangeCardBackRsp)
        emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.internal_static_GCGDSChangeCardBackRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.internal_static_GCGDSChangeCardBackRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp.class, emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp.newBuilder()
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
        retcode_ = 0;

        deckId_ = 0;

        cardBackId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.internal_static_GCGDSChangeCardBackRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp build() {
        emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp buildPartial() {
        emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp result = new emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp(this);
        result.retcode_ = retcode_;
        result.deckId_ = deckId_;
        result.cardBackId_ = cardBackId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp other) {
        if (other == emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getDeckId() != 0) {
          setDeckId(other.getDeckId());
        }
        if (other.getCardBackId() != 0) {
          setCardBackId(other.getCardBackId());
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
        emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int deckId_ ;
      /**
       * <code>uint32 deck_id = 11;</code>
       * @return The deckId.
       */
      @java.lang.Override
      public int getDeckId() {
        return deckId_;
      }
      /**
       * <code>uint32 deck_id = 11;</code>
       * @param value The deckId to set.
       * @return This builder for chaining.
       */
      public Builder setDeckId(int value) {
        
        deckId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 deck_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeckId() {
        
        deckId_ = 0;
        onChanged();
        return this;
      }

      private int cardBackId_ ;
      /**
       * <code>uint32 card_back_id = 2;</code>
       * @return The cardBackId.
       */
      @java.lang.Override
      public int getCardBackId() {
        return cardBackId_;
      }
      /**
       * <code>uint32 card_back_id = 2;</code>
       * @param value The cardBackId to set.
       * @return This builder for chaining.
       */
      public Builder setCardBackId(int value) {
        
        cardBackId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_back_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardBackId() {
        
        cardBackId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSChangeCardBackRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGDSChangeCardBackRsp)
    private static final emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp();
    }

    public static emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSChangeCardBackRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSChangeCardBackRsp>() {
      @java.lang.Override
      public GCGDSChangeCardBackRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSChangeCardBackRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSChangeCardBackRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSChangeCardBackRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSChangeCardBackRspOuterClass.GCGDSChangeCardBackRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSChangeCardBackRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSChangeCardBackRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGDSChangeCardBackRsp.proto\"P\n\026GCGDSC" +
      "hangeCardBackRsp\022\017\n\007retcode\030\t \001(\005\022\017\n\007dec" +
      "k_id\030\013 \001(\r\022\024\n\014card_back_id\030\002 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSChangeCardBackRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSChangeCardBackRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSChangeCardBackRsp_descriptor,
        new java.lang.String[] { "Retcode", "DeckId", "CardBackId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
