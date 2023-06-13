// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGNewCardInfoNotify.proto

package emu.grasscutter.net.proto;

public final class GCGNewCardInfoNotifyOuterClass {
  private GCGNewCardInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGNewCardInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGNewCardInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGCard card = 1;</code>
     * @return Whether the card field is set.
     */
    boolean hasCard();
    /**
     * <code>.GCGCard card = 1;</code>
     * @return The card.
     */
    emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard getCard();
    /**
     * <code>.GCGCard card = 1;</code>
     */
    emu.grasscutter.net.proto.GCGCardOuterClass.GCGCardOrBuilder getCardOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 7203
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GCGNewCardInfoNotify}
   */
  public static final class GCGNewCardInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGNewCardInfoNotify)
      GCGNewCardInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGNewCardInfoNotify.newBuilder() to construct.
    private GCGNewCardInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGNewCardInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGNewCardInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGNewCardInfoNotify(
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
            case 10: {
              emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.Builder subBuilder = null;
              if (card_ != null) {
                subBuilder = card_.toBuilder();
              }
              card_ = input.readMessage(emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(card_);
                card_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.internal_static_GCGNewCardInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.internal_static_GCGNewCardInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify.class, emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify.Builder.class);
    }

    public static final int CARD_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard card_;
    /**
     * <code>.GCGCard card = 1;</code>
     * @return Whether the card field is set.
     */
    @java.lang.Override
    public boolean hasCard() {
      return card_ != null;
    }
    /**
     * <code>.GCGCard card = 1;</code>
     * @return The card.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard getCard() {
      return card_ == null ? emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.getDefaultInstance() : card_;
    }
    /**
     * <code>.GCGCard card = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGCardOuterClass.GCGCardOrBuilder getCardOrBuilder() {
      return getCard();
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
      if (card_ != null) {
        output.writeMessage(1, getCard());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (card_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCard());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify other = (emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify) obj;

      if (hasCard() != other.hasCard()) return false;
      if (hasCard()) {
        if (!getCard()
            .equals(other.getCard())) return false;
      }
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
      if (hasCard()) {
        hash = (37 * hash) + CARD_FIELD_NUMBER;
        hash = (53 * hash) + getCard().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify prototype) {
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
     * CmdId: 7203
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GCGNewCardInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGNewCardInfoNotify)
        emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.internal_static_GCGNewCardInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.internal_static_GCGNewCardInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify.class, emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify.newBuilder()
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
        if (cardBuilder_ == null) {
          card_ = null;
        } else {
          card_ = null;
          cardBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.internal_static_GCGNewCardInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify build() {
        emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify buildPartial() {
        emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify result = new emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify(this);
        if (cardBuilder_ == null) {
          result.card_ = card_;
        } else {
          result.card_ = cardBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify other) {
        if (other == emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify.getDefaultInstance()) return this;
        if (other.hasCard()) {
          mergeCard(other.getCard());
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
        emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard card_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard, emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.Builder, emu.grasscutter.net.proto.GCGCardOuterClass.GCGCardOrBuilder> cardBuilder_;
      /**
       * <code>.GCGCard card = 1;</code>
       * @return Whether the card field is set.
       */
      public boolean hasCard() {
        return cardBuilder_ != null || card_ != null;
      }
      /**
       * <code>.GCGCard card = 1;</code>
       * @return The card.
       */
      public emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard getCard() {
        if (cardBuilder_ == null) {
          return card_ == null ? emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.getDefaultInstance() : card_;
        } else {
          return cardBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGCard card = 1;</code>
       */
      public Builder setCard(emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard value) {
        if (cardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          card_ = value;
          onChanged();
        } else {
          cardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 1;</code>
       */
      public Builder setCard(
          emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.Builder builderForValue) {
        if (cardBuilder_ == null) {
          card_ = builderForValue.build();
          onChanged();
        } else {
          cardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 1;</code>
       */
      public Builder mergeCard(emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard value) {
        if (cardBuilder_ == null) {
          if (card_ != null) {
            card_ =
              emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.newBuilder(card_).mergeFrom(value).buildPartial();
          } else {
            card_ = value;
          }
          onChanged();
        } else {
          cardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 1;</code>
       */
      public Builder clearCard() {
        if (cardBuilder_ == null) {
          card_ = null;
          onChanged();
        } else {
          card_ = null;
          cardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 1;</code>
       */
      public emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.Builder getCardBuilder() {
        
        onChanged();
        return getCardFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGCard card = 1;</code>
       */
      public emu.grasscutter.net.proto.GCGCardOuterClass.GCGCardOrBuilder getCardOrBuilder() {
        if (cardBuilder_ != null) {
          return cardBuilder_.getMessageOrBuilder();
        } else {
          return card_ == null ?
              emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.getDefaultInstance() : card_;
        }
      }
      /**
       * <code>.GCGCard card = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard, emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.Builder, emu.grasscutter.net.proto.GCGCardOuterClass.GCGCardOrBuilder> 
          getCardFieldBuilder() {
        if (cardBuilder_ == null) {
          cardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard, emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.Builder, emu.grasscutter.net.proto.GCGCardOuterClass.GCGCardOrBuilder>(
                  getCard(),
                  getParentForChildren(),
                  isClean());
          card_ = null;
        }
        return cardBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGNewCardInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGNewCardInfoNotify)
    private static final emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify();
    }

    public static emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGNewCardInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGNewCardInfoNotify>() {
      @java.lang.Override
      public GCGNewCardInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGNewCardInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGNewCardInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGNewCardInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGNewCardInfoNotifyOuterClass.GCGNewCardInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGNewCardInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGNewCardInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGNewCardInfoNotify.proto\032\rGCGCard.pr" +
      "oto\".\n\024GCGNewCardInfoNotify\022\026\n\004card\030\001 \001(" +
      "\0132\010.GCGCardB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGCardOuterClass.getDescriptor(),
        });
    internal_static_GCGNewCardInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGNewCardInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGNewCardInfoNotify_descriptor,
        new java.lang.String[] { "Card", });
    emu.grasscutter.net.proto.GCGCardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
