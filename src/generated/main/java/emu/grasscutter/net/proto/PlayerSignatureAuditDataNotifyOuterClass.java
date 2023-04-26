// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerSignatureAuditDataNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerSignatureAuditDataNotifyOuterClass {
  private PlayerSignatureAuditDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerSignatureAuditDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerSignatureAuditDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ContentAuditInfo info = 6;</code>
     * @return Whether the info field is set.
     */
    boolean hasInfo();
    /**
     * <code>.ContentAuditInfo info = 6;</code>
     * @return The info.
     */
    emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo getInfo();
    /**
     * <code>.ContentAuditInfo info = 6;</code>
     */
    emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder getInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4007
   * Name: MNPEELCICCC
   * </pre>
   *
   * Protobuf type {@code PlayerSignatureAuditDataNotify}
   */
  public static final class PlayerSignatureAuditDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerSignatureAuditDataNotify)
      PlayerSignatureAuditDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerSignatureAuditDataNotify.newBuilder() to construct.
    private PlayerSignatureAuditDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerSignatureAuditDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerSignatureAuditDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerSignatureAuditDataNotify(
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
            case 50: {
              emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder subBuilder = null;
              if (info_ != null) {
                subBuilder = info_.toBuilder();
              }
              info_ = input.readMessage(emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(info_);
                info_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.internal_static_PlayerSignatureAuditDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.internal_static_PlayerSignatureAuditDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify.class, emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify.Builder.class);
    }

    public static final int INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo info_;
    /**
     * <code>.ContentAuditInfo info = 6;</code>
     * @return Whether the info field is set.
     */
    @java.lang.Override
    public boolean hasInfo() {
      return info_ != null;
    }
    /**
     * <code>.ContentAuditInfo info = 6;</code>
     * @return The info.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo getInfo() {
      return info_ == null ? emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance() : info_;
    }
    /**
     * <code>.ContentAuditInfo info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder getInfoOrBuilder() {
      return getInfo();
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
      if (info_ != null) {
        output.writeMessage(6, getInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (info_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify other = (emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify) obj;

      if (hasInfo() != other.hasInfo()) return false;
      if (hasInfo()) {
        if (!getInfo()
            .equals(other.getInfo())) return false;
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
      if (hasInfo()) {
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify prototype) {
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
     * CmdId: 4007
     * Name: MNPEELCICCC
     * </pre>
     *
     * Protobuf type {@code PlayerSignatureAuditDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerSignatureAuditDataNotify)
        emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.internal_static_PlayerSignatureAuditDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.internal_static_PlayerSignatureAuditDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify.class, emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify.newBuilder()
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
        if (infoBuilder_ == null) {
          info_ = null;
        } else {
          info_ = null;
          infoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.internal_static_PlayerSignatureAuditDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify build() {
        emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify result = new emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify(this);
        if (infoBuilder_ == null) {
          result.info_ = info_;
        } else {
          result.info_ = infoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify.getDefaultInstance()) return this;
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
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
        emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo info_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder> infoBuilder_;
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       * @return Whether the info field is set.
       */
      public boolean hasInfo() {
        return infoBuilder_ != null || info_ != null;
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       * @return The info.
       */
      public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo getInfo() {
        if (infoBuilder_ == null) {
          return info_ == null ? emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance() : info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       */
      public Builder setInfo(emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       */
      public Builder setInfo(
          emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       */
      public Builder mergeInfo(emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo value) {
        if (infoBuilder_ == null) {
          if (info_ != null) {
            info_ =
              emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       */
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = null;
          onChanged();
        } else {
          info_ = null;
          infoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       */
      public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder getInfoBuilder() {
        
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       */
      public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_ == null ?
              emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance() : info_;
        }
      }
      /**
       * <code>.ContentAuditInfo info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder>(
                  getInfo(),
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerSignatureAuditDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerSignatureAuditDataNotify)
    private static final emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify();
    }

    public static emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerSignatureAuditDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerSignatureAuditDataNotify>() {
      @java.lang.Override
      public PlayerSignatureAuditDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerSignatureAuditDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerSignatureAuditDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerSignatureAuditDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerSignatureAuditDataNotifyOuterClass.PlayerSignatureAuditDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerSignatureAuditDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerSignatureAuditDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$PlayerSignatureAuditDataNotify.proto\032\026" +
      "ContentAuditInfo.proto\"A\n\036PlayerSignatur" +
      "eAuditDataNotify\022\037\n\004info\030\006 \001(\0132\021.Content" +
      "AuditInfoB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ContentAuditInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerSignatureAuditDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerSignatureAuditDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerSignatureAuditDataNotify_descriptor,
        new java.lang.String[] { "Info", });
    emu.grasscutter.net.proto.ContentAuditInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
