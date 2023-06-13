// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMessagePackNotify.proto

package emu.grasscutter.net.proto;

public final class GCGMessagePackNotifyOuterClass {
  private GCGMessagePackNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMessagePackNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMessagePackNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 server_seq = 5;</code>
     * @return The serverSeq.
     */
    int getServerSeq();

    /**
     * <code>.GCGMessagePack message_pack = 8;</code>
     * @return Whether the messagePack field is set.
     */
    boolean hasMessagePack();
    /**
     * <code>.GCGMessagePack message_pack = 8;</code>
     * @return The messagePack.
     */
    emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack getMessagePack();
    /**
     * <code>.GCGMessagePack message_pack = 8;</code>
     */
    emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePackOrBuilder getMessagePackOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 7516
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GCGMessagePackNotify}
   */
  public static final class GCGMessagePackNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMessagePackNotify)
      GCGMessagePackNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMessagePackNotify.newBuilder() to construct.
    private GCGMessagePackNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMessagePackNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMessagePackNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMessagePackNotify(
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
            case 40: {

              serverSeq_ = input.readUInt32();
              break;
            }
            case 66: {
              emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.Builder subBuilder = null;
              if (messagePack_ != null) {
                subBuilder = messagePack_.toBuilder();
              }
              messagePack_ = input.readMessage(emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(messagePack_);
                messagePack_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.internal_static_GCGMessagePackNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.internal_static_GCGMessagePackNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify.class, emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify.Builder.class);
    }

    public static final int SERVER_SEQ_FIELD_NUMBER = 5;
    private int serverSeq_;
    /**
     * <code>uint32 server_seq = 5;</code>
     * @return The serverSeq.
     */
    @java.lang.Override
    public int getServerSeq() {
      return serverSeq_;
    }

    public static final int MESSAGE_PACK_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack messagePack_;
    /**
     * <code>.GCGMessagePack message_pack = 8;</code>
     * @return Whether the messagePack field is set.
     */
    @java.lang.Override
    public boolean hasMessagePack() {
      return messagePack_ != null;
    }
    /**
     * <code>.GCGMessagePack message_pack = 8;</code>
     * @return The messagePack.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack getMessagePack() {
      return messagePack_ == null ? emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.getDefaultInstance() : messagePack_;
    }
    /**
     * <code>.GCGMessagePack message_pack = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePackOrBuilder getMessagePackOrBuilder() {
      return getMessagePack();
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
      if (serverSeq_ != 0) {
        output.writeUInt32(5, serverSeq_);
      }
      if (messagePack_ != null) {
        output.writeMessage(8, getMessagePack());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, serverSeq_);
      }
      if (messagePack_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getMessagePack());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify other = (emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify) obj;

      if (getServerSeq()
          != other.getServerSeq()) return false;
      if (hasMessagePack() != other.hasMessagePack()) return false;
      if (hasMessagePack()) {
        if (!getMessagePack()
            .equals(other.getMessagePack())) return false;
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
      hash = (37 * hash) + SERVER_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getServerSeq();
      if (hasMessagePack()) {
        hash = (37 * hash) + MESSAGE_PACK_FIELD_NUMBER;
        hash = (53 * hash) + getMessagePack().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify prototype) {
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
     * CmdId: 7516
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GCGMessagePackNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMessagePackNotify)
        emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.internal_static_GCGMessagePackNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.internal_static_GCGMessagePackNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify.class, emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify.newBuilder()
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
        serverSeq_ = 0;

        if (messagePackBuilder_ == null) {
          messagePack_ = null;
        } else {
          messagePack_ = null;
          messagePackBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.internal_static_GCGMessagePackNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify build() {
        emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify buildPartial() {
        emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify result = new emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify(this);
        result.serverSeq_ = serverSeq_;
        if (messagePackBuilder_ == null) {
          result.messagePack_ = messagePack_;
        } else {
          result.messagePack_ = messagePackBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify other) {
        if (other == emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify.getDefaultInstance()) return this;
        if (other.getServerSeq() != 0) {
          setServerSeq(other.getServerSeq());
        }
        if (other.hasMessagePack()) {
          mergeMessagePack(other.getMessagePack());
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
        emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int serverSeq_ ;
      /**
       * <code>uint32 server_seq = 5;</code>
       * @return The serverSeq.
       */
      @java.lang.Override
      public int getServerSeq() {
        return serverSeq_;
      }
      /**
       * <code>uint32 server_seq = 5;</code>
       * @param value The serverSeq to set.
       * @return This builder for chaining.
       */
      public Builder setServerSeq(int value) {
        
        serverSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 server_seq = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerSeq() {
        
        serverSeq_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack messagePack_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack, emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.Builder, emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePackOrBuilder> messagePackBuilder_;
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       * @return Whether the messagePack field is set.
       */
      public boolean hasMessagePack() {
        return messagePackBuilder_ != null || messagePack_ != null;
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       * @return The messagePack.
       */
      public emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack getMessagePack() {
        if (messagePackBuilder_ == null) {
          return messagePack_ == null ? emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.getDefaultInstance() : messagePack_;
        } else {
          return messagePackBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       */
      public Builder setMessagePack(emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack value) {
        if (messagePackBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          messagePack_ = value;
          onChanged();
        } else {
          messagePackBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       */
      public Builder setMessagePack(
          emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.Builder builderForValue) {
        if (messagePackBuilder_ == null) {
          messagePack_ = builderForValue.build();
          onChanged();
        } else {
          messagePackBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       */
      public Builder mergeMessagePack(emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack value) {
        if (messagePackBuilder_ == null) {
          if (messagePack_ != null) {
            messagePack_ =
              emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.newBuilder(messagePack_).mergeFrom(value).buildPartial();
          } else {
            messagePack_ = value;
          }
          onChanged();
        } else {
          messagePackBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       */
      public Builder clearMessagePack() {
        if (messagePackBuilder_ == null) {
          messagePack_ = null;
          onChanged();
        } else {
          messagePack_ = null;
          messagePackBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       */
      public emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.Builder getMessagePackBuilder() {
        
        onChanged();
        return getMessagePackFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       */
      public emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePackOrBuilder getMessagePackOrBuilder() {
        if (messagePackBuilder_ != null) {
          return messagePackBuilder_.getMessageOrBuilder();
        } else {
          return messagePack_ == null ?
              emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.getDefaultInstance() : messagePack_;
        }
      }
      /**
       * <code>.GCGMessagePack message_pack = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack, emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.Builder, emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePackOrBuilder> 
          getMessagePackFieldBuilder() {
        if (messagePackBuilder_ == null) {
          messagePackBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack, emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePack.Builder, emu.grasscutter.net.proto.GCGMessagePackOuterClass.GCGMessagePackOrBuilder>(
                  getMessagePack(),
                  getParentForChildren(),
                  isClean());
          messagePack_ = null;
        }
        return messagePackBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGMessagePackNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGMessagePackNotify)
    private static final emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify();
    }

    public static emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMessagePackNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGMessagePackNotify>() {
      @java.lang.Override
      public GCGMessagePackNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMessagePackNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMessagePackNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMessagePackNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMessagePackNotifyOuterClass.GCGMessagePackNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMessagePackNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMessagePackNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGMessagePackNotify.proto\032\024GCGMessage" +
      "Pack.proto\"Q\n\024GCGMessagePackNotify\022\022\n\nse" +
      "rver_seq\030\005 \001(\r\022%\n\014message_pack\030\010 \001(\0132\017.G" +
      "CGMessagePackB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGMessagePackOuterClass.getDescriptor(),
        });
    internal_static_GCGMessagePackNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMessagePackNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMessagePackNotify_descriptor,
        new java.lang.String[] { "ServerSeq", "MessagePack", });
    emu.grasscutter.net.proto.GCGMessagePackOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
