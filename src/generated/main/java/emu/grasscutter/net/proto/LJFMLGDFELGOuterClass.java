// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LJFMLGDFELG.proto

package emu.grasscutter.net.proto;

public final class LJFMLGDFELGOuterClass {
  private LJFMLGDFELGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LJFMLGDFELGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LJFMLGDFELG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_guid = 8;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>bool OHEDGHHHLGJ = 2;</code>
     * @return The oHEDGHHHLGJ.
     */
    boolean getOHEDGHHHLGJ();

    /**
     * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
     * @return Whether the iNDKAEIGCMJ field is set.
     */
    boolean hasINDKAEIGCMJ();
    /**
     * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
     * @return The iNDKAEIGCMJ.
     */
    emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB getINDKAEIGCMJ();
    /**
     * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
     */
    emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMBOrBuilder getINDKAEIGCMJOrBuilder();
  }
  /**
   * <pre>
   * Name: LJFMLGDFELG
   * </pre>
   *
   * Protobuf type {@code LJFMLGDFELG}
   */
  public static final class LJFMLGDFELG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LJFMLGDFELG)
      LJFMLGDFELGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LJFMLGDFELG.newBuilder() to construct.
    private LJFMLGDFELG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LJFMLGDFELG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LJFMLGDFELG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LJFMLGDFELG(
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
              emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.Builder subBuilder = null;
              if (iNDKAEIGCMJ_ != null) {
                subBuilder = iNDKAEIGCMJ_.toBuilder();
              }
              iNDKAEIGCMJ_ = input.readMessage(emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(iNDKAEIGCMJ_);
                iNDKAEIGCMJ_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              oHEDGHHHLGJ_ = input.readBool();
              break;
            }
            case 64: {

              cardGuid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.internal_static_LJFMLGDFELG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.internal_static_LJFMLGDFELG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG.class, emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG.Builder.class);
    }

    public static final int CARD_GUID_FIELD_NUMBER = 8;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 8;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int OHEDGHHHLGJ_FIELD_NUMBER = 2;
    private boolean oHEDGHHHLGJ_;
    /**
     * <code>bool OHEDGHHHLGJ = 2;</code>
     * @return The oHEDGHHHLGJ.
     */
    @java.lang.Override
    public boolean getOHEDGHHHLGJ() {
      return oHEDGHHHLGJ_;
    }

    public static final int INDKAEIGCMJ_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB iNDKAEIGCMJ_;
    /**
     * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
     * @return Whether the iNDKAEIGCMJ field is set.
     */
    @java.lang.Override
    public boolean hasINDKAEIGCMJ() {
      return iNDKAEIGCMJ_ != null;
    }
    /**
     * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
     * @return The iNDKAEIGCMJ.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB getINDKAEIGCMJ() {
      return iNDKAEIGCMJ_ == null ? emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.getDefaultInstance() : iNDKAEIGCMJ_;
    }
    /**
     * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMBOrBuilder getINDKAEIGCMJOrBuilder() {
      return getINDKAEIGCMJ();
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
      if (iNDKAEIGCMJ_ != null) {
        output.writeMessage(1, getINDKAEIGCMJ());
      }
      if (oHEDGHHHLGJ_ != false) {
        output.writeBool(2, oHEDGHHHLGJ_);
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(8, cardGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iNDKAEIGCMJ_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getINDKAEIGCMJ());
      }
      if (oHEDGHHHLGJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, oHEDGHHHLGJ_);
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cardGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG other = (emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG) obj;

      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (getOHEDGHHHLGJ()
          != other.getOHEDGHHHLGJ()) return false;
      if (hasINDKAEIGCMJ() != other.hasINDKAEIGCMJ()) return false;
      if (hasINDKAEIGCMJ()) {
        if (!getINDKAEIGCMJ()
            .equals(other.getINDKAEIGCMJ())) return false;
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
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (37 * hash) + OHEDGHHHLGJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOHEDGHHHLGJ());
      if (hasINDKAEIGCMJ()) {
        hash = (37 * hash) + INDKAEIGCMJ_FIELD_NUMBER;
        hash = (53 * hash) + getINDKAEIGCMJ().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG prototype) {
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
     * Name: LJFMLGDFELG
     * </pre>
     *
     * Protobuf type {@code LJFMLGDFELG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LJFMLGDFELG)
        emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.internal_static_LJFMLGDFELG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.internal_static_LJFMLGDFELG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG.class, emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG.newBuilder()
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
        cardGuid_ = 0;

        oHEDGHHHLGJ_ = false;

        if (iNDKAEIGCMJBuilder_ == null) {
          iNDKAEIGCMJ_ = null;
        } else {
          iNDKAEIGCMJ_ = null;
          iNDKAEIGCMJBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.internal_static_LJFMLGDFELG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG build() {
        emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG buildPartial() {
        emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG result = new emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG(this);
        result.cardGuid_ = cardGuid_;
        result.oHEDGHHHLGJ_ = oHEDGHHHLGJ_;
        if (iNDKAEIGCMJBuilder_ == null) {
          result.iNDKAEIGCMJ_ = iNDKAEIGCMJ_;
        } else {
          result.iNDKAEIGCMJ_ = iNDKAEIGCMJBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG) {
          return mergeFrom((emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG other) {
        if (other == emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG.getDefaultInstance()) return this;
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.getOHEDGHHHLGJ() != false) {
          setOHEDGHHHLGJ(other.getOHEDGHHHLGJ());
        }
        if (other.hasINDKAEIGCMJ()) {
          mergeINDKAEIGCMJ(other.getINDKAEIGCMJ());
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
        emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 8;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 8;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private boolean oHEDGHHHLGJ_ ;
      /**
       * <code>bool OHEDGHHHLGJ = 2;</code>
       * @return The oHEDGHHHLGJ.
       */
      @java.lang.Override
      public boolean getOHEDGHHHLGJ() {
        return oHEDGHHHLGJ_;
      }
      /**
       * <code>bool OHEDGHHHLGJ = 2;</code>
       * @param value The oHEDGHHHLGJ to set.
       * @return This builder for chaining.
       */
      public Builder setOHEDGHHHLGJ(boolean value) {
        
        oHEDGHHHLGJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool OHEDGHHHLGJ = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOHEDGHHHLGJ() {
        
        oHEDGHHHLGJ_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB iNDKAEIGCMJ_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB, emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.Builder, emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMBOrBuilder> iNDKAEIGCMJBuilder_;
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       * @return Whether the iNDKAEIGCMJ field is set.
       */
      public boolean hasINDKAEIGCMJ() {
        return iNDKAEIGCMJBuilder_ != null || iNDKAEIGCMJ_ != null;
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       * @return The iNDKAEIGCMJ.
       */
      public emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB getINDKAEIGCMJ() {
        if (iNDKAEIGCMJBuilder_ == null) {
          return iNDKAEIGCMJ_ == null ? emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.getDefaultInstance() : iNDKAEIGCMJ_;
        } else {
          return iNDKAEIGCMJBuilder_.getMessage();
        }
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       */
      public Builder setINDKAEIGCMJ(emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB value) {
        if (iNDKAEIGCMJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          iNDKAEIGCMJ_ = value;
          onChanged();
        } else {
          iNDKAEIGCMJBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       */
      public Builder setINDKAEIGCMJ(
          emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.Builder builderForValue) {
        if (iNDKAEIGCMJBuilder_ == null) {
          iNDKAEIGCMJ_ = builderForValue.build();
          onChanged();
        } else {
          iNDKAEIGCMJBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       */
      public Builder mergeINDKAEIGCMJ(emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB value) {
        if (iNDKAEIGCMJBuilder_ == null) {
          if (iNDKAEIGCMJ_ != null) {
            iNDKAEIGCMJ_ =
              emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.newBuilder(iNDKAEIGCMJ_).mergeFrom(value).buildPartial();
          } else {
            iNDKAEIGCMJ_ = value;
          }
          onChanged();
        } else {
          iNDKAEIGCMJBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       */
      public Builder clearINDKAEIGCMJ() {
        if (iNDKAEIGCMJBuilder_ == null) {
          iNDKAEIGCMJ_ = null;
          onChanged();
        } else {
          iNDKAEIGCMJ_ = null;
          iNDKAEIGCMJBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       */
      public emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.Builder getINDKAEIGCMJBuilder() {
        
        onChanged();
        return getINDKAEIGCMJFieldBuilder().getBuilder();
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       */
      public emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMBOrBuilder getINDKAEIGCMJOrBuilder() {
        if (iNDKAEIGCMJBuilder_ != null) {
          return iNDKAEIGCMJBuilder_.getMessageOrBuilder();
        } else {
          return iNDKAEIGCMJ_ == null ?
              emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.getDefaultInstance() : iNDKAEIGCMJ_;
        }
      }
      /**
       * <code>.AJCFJJFJJMB INDKAEIGCMJ = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB, emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.Builder, emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMBOrBuilder> 
          getINDKAEIGCMJFieldBuilder() {
        if (iNDKAEIGCMJBuilder_ == null) {
          iNDKAEIGCMJBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB, emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMB.Builder, emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.AJCFJJFJJMBOrBuilder>(
                  getINDKAEIGCMJ(),
                  getParentForChildren(),
                  isClean());
          iNDKAEIGCMJ_ = null;
        }
        return iNDKAEIGCMJBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LJFMLGDFELG)
    }

    // @@protoc_insertion_point(class_scope:LJFMLGDFELG)
    private static final emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG();
    }

    public static emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LJFMLGDFELG>
        PARSER = new com.google.protobuf.AbstractParser<LJFMLGDFELG>() {
      @java.lang.Override
      public LJFMLGDFELG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LJFMLGDFELG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LJFMLGDFELG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LJFMLGDFELG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LJFMLGDFELGOuterClass.LJFMLGDFELG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LJFMLGDFELG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LJFMLGDFELG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LJFMLGDFELG.proto\032\021AJCFJJFJJMB.proto\"X" +
      "\n\013LJFMLGDFELG\022\021\n\tcard_guid\030\010 \001(\r\022\023\n\013OHED" +
      "GHHHLGJ\030\002 \001(\010\022!\n\013INDKAEIGCMJ\030\001 \001(\0132\014.AJC" +
      "FJJFJJMBB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.getDescriptor(),
        });
    internal_static_LJFMLGDFELG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LJFMLGDFELG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LJFMLGDFELG_descriptor,
        new java.lang.String[] { "CardGuid", "OHEDGHHHLGJ", "INDKAEIGCMJ", });
    emu.grasscutter.net.proto.AJCFJJFJJMBOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
