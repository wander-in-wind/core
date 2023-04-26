// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessPlayerInfoNotify.proto

package emu.grasscutter.net.proto;

public final class ChessPlayerInfoNotifyOuterClass {
  private ChessPlayerInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessPlayerInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessPlayerInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ChessPlayerInfo player_info = 1;</code>
     * @return Whether the playerInfo field is set.
     */
    boolean hasPlayerInfo();
    /**
     * <code>.ChessPlayerInfo player_info = 1;</code>
     * @return The playerInfo.
     */
    emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo getPlayerInfo();
    /**
     * <code>.ChessPlayerInfo player_info = 1;</code>
     */
    emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfoOrBuilder getPlayerInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5322
   * Name: MIGBJBJFKHN
   * </pre>
   *
   * Protobuf type {@code ChessPlayerInfoNotify}
   */
  public static final class ChessPlayerInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessPlayerInfoNotify)
      ChessPlayerInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessPlayerInfoNotify.newBuilder() to construct.
    private ChessPlayerInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessPlayerInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessPlayerInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChessPlayerInfoNotify(
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
              emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.Builder subBuilder = null;
              if (playerInfo_ != null) {
                subBuilder = playerInfo_.toBuilder();
              }
              playerInfo_ = input.readMessage(emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(playerInfo_);
                playerInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.internal_static_ChessPlayerInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.internal_static_ChessPlayerInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify.class, emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify.Builder.class);
    }

    public static final int PLAYER_INFO_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo playerInfo_;
    /**
     * <code>.ChessPlayerInfo player_info = 1;</code>
     * @return Whether the playerInfo field is set.
     */
    @java.lang.Override
    public boolean hasPlayerInfo() {
      return playerInfo_ != null;
    }
    /**
     * <code>.ChessPlayerInfo player_info = 1;</code>
     * @return The playerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo getPlayerInfo() {
      return playerInfo_ == null ? emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.getDefaultInstance() : playerInfo_;
    }
    /**
     * <code>.ChessPlayerInfo player_info = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
      return getPlayerInfo();
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
      if (playerInfo_ != null) {
        output.writeMessage(1, getPlayerInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPlayerInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify other = (emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify) obj;

      if (hasPlayerInfo() != other.hasPlayerInfo()) return false;
      if (hasPlayerInfo()) {
        if (!getPlayerInfo()
            .equals(other.getPlayerInfo())) return false;
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
      if (hasPlayerInfo()) {
        hash = (37 * hash) + PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify prototype) {
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
     * CmdId: 5322
     * Name: MIGBJBJFKHN
     * </pre>
     *
     * Protobuf type {@code ChessPlayerInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessPlayerInfoNotify)
        emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.internal_static_ChessPlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.internal_static_ChessPlayerInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify.class, emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify.newBuilder()
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
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.internal_static_ChessPlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify build() {
        emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify buildPartial() {
        emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify result = new emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify(this);
        if (playerInfoBuilder_ == null) {
          result.playerInfo_ = playerInfo_;
        } else {
          result.playerInfo_ = playerInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify other) {
        if (other == emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify.getDefaultInstance()) return this;
        if (other.hasPlayerInfo()) {
          mergePlayerInfo(other.getPlayerInfo());
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
        emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo playerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo, emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.Builder, emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfoOrBuilder> playerInfoBuilder_;
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       * @return Whether the playerInfo field is set.
       */
      public boolean hasPlayerInfo() {
        return playerInfoBuilder_ != null || playerInfo_ != null;
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       * @return The playerInfo.
       */
      public emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo getPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          return playerInfo_ == null ? emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.getDefaultInstance() : playerInfo_;
        } else {
          return playerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       */
      public Builder setPlayerInfo(emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerInfo_ = value;
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       */
      public Builder setPlayerInfo(
          emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.Builder builderForValue) {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = builderForValue.build();
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       */
      public Builder mergePlayerInfo(emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (playerInfo_ != null) {
            playerInfo_ =
              emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.newBuilder(playerInfo_).mergeFrom(value).buildPartial();
          } else {
            playerInfo_ = value;
          }
          onChanged();
        } else {
          playerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       */
      public Builder clearPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
          onChanged();
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       */
      public emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.Builder getPlayerInfoBuilder() {
        
        onChanged();
        return getPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       */
      public emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
        if (playerInfoBuilder_ != null) {
          return playerInfoBuilder_.getMessageOrBuilder();
        } else {
          return playerInfo_ == null ?
              emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.getDefaultInstance() : playerInfo_;
        }
      }
      /**
       * <code>.ChessPlayerInfo player_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo, emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.Builder, emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfoOrBuilder> 
          getPlayerInfoFieldBuilder() {
        if (playerInfoBuilder_ == null) {
          playerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo, emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfo.Builder, emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.ChessPlayerInfoOrBuilder>(
                  getPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          playerInfo_ = null;
        }
        return playerInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ChessPlayerInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ChessPlayerInfoNotify)
    private static final emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify();
    }

    public static emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessPlayerInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChessPlayerInfoNotify>() {
      @java.lang.Override
      public ChessPlayerInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChessPlayerInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChessPlayerInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessPlayerInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChessPlayerInfoNotifyOuterClass.ChessPlayerInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessPlayerInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessPlayerInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ChessPlayerInfoNotify.proto\032\025ChessPlay" +
      "erInfo.proto\">\n\025ChessPlayerInfoNotify\022%\n" +
      "\013player_info\030\001 \001(\0132\020.ChessPlayerInfoB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_ChessPlayerInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessPlayerInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessPlayerInfoNotify_descriptor,
        new java.lang.String[] { "PlayerInfo", });
    emu.grasscutter.net.proto.ChessPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
