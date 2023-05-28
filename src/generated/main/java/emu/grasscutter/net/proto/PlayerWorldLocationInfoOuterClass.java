// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerWorldLocationInfo.proto

package emu.grasscutter.net.proto;

public final class PlayerWorldLocationInfoOuterClass {
  private PlayerWorldLocationInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerWorldLocationInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerWorldLocationInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerLocationInfo player_loc = 2;</code>
     * @return Whether the playerLoc field is set.
     */
    boolean hasPlayerLoc();
    /**
     * <code>.PlayerLocationInfo player_loc = 2;</code>
     * @return The playerLoc.
     */
    emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc();
    /**
     * <code>.PlayerLocationInfo player_loc = 2;</code>
     */
    emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder();

    /**
     * <code>uint32 scene_id = 7;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * Obf: GLMHEOCDHBH
   * </pre>
   *
   * Protobuf type {@code PlayerWorldLocationInfo}
   */
  public static final class PlayerWorldLocationInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerWorldLocationInfo)
      PlayerWorldLocationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerWorldLocationInfo.newBuilder() to construct.
    private PlayerWorldLocationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerWorldLocationInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerWorldLocationInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerWorldLocationInfo(
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
            case 18: {
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder subBuilder = null;
              if (playerLoc_ != null) {
                subBuilder = playerLoc_.toBuilder();
              }
              playerLoc_ = input.readMessage(emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(playerLoc_);
                playerLoc_ = subBuilder.buildPartial();
              }

              break;
            }
            case 56: {

              sceneId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.class, emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder.class);
    }

    public static final int PLAYER_LOC_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo playerLoc_;
    /**
     * <code>.PlayerLocationInfo player_loc = 2;</code>
     * @return Whether the playerLoc field is set.
     */
    @java.lang.Override
    public boolean hasPlayerLoc() {
      return playerLoc_ != null;
    }
    /**
     * <code>.PlayerLocationInfo player_loc = 2;</code>
     * @return The playerLoc.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc() {
      return playerLoc_ == null ? emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : playerLoc_;
    }
    /**
     * <code>.PlayerLocationInfo player_loc = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder() {
      return getPlayerLoc();
    }

    public static final int SCENE_ID_FIELD_NUMBER = 7;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 7;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (playerLoc_ != null) {
        output.writeMessage(2, getPlayerLoc());
      }
      if (sceneId_ != 0) {
        output.writeUInt32(7, sceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerLoc_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPlayerLoc());
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo other = (emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo) obj;

      if (hasPlayerLoc() != other.hasPlayerLoc()) return false;
      if (hasPlayerLoc()) {
        if (!getPlayerLoc()
            .equals(other.getPlayerLoc())) return false;
      }
      if (getSceneId()
          != other.getSceneId()) return false;
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
      if (hasPlayerLoc()) {
        hash = (37 * hash) + PLAYER_LOC_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerLoc().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo prototype) {
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
     * Obf: GLMHEOCDHBH
     * </pre>
     *
     * Protobuf type {@code PlayerWorldLocationInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerWorldLocationInfo)
        emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.class, emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.newBuilder()
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
        if (playerLocBuilder_ == null) {
          playerLoc_ = null;
        } else {
          playerLoc_ = null;
          playerLocBuilder_ = null;
        }
        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.internal_static_PlayerWorldLocationInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo build() {
        emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo buildPartial() {
        emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo result = new emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo(this);
        if (playerLocBuilder_ == null) {
          result.playerLoc_ = playerLoc_;
        } else {
          result.playerLoc_ = playerLocBuilder_.build();
        }
        result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo other) {
        if (other == emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo.getDefaultInstance()) return this;
        if (other.hasPlayerLoc()) {
          mergePlayerLoc(other.getPlayerLoc());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo playerLoc_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> playerLocBuilder_;
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       * @return Whether the playerLoc field is set.
       */
      public boolean hasPlayerLoc() {
        return playerLocBuilder_ != null || playerLoc_ != null;
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       * @return The playerLoc.
       */
      public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo getPlayerLoc() {
        if (playerLocBuilder_ == null) {
          return playerLoc_ == null ? emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : playerLoc_;
        } else {
          return playerLocBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       */
      public Builder setPlayerLoc(emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
        if (playerLocBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerLoc_ = value;
          onChanged();
        } else {
          playerLocBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       */
      public Builder setPlayerLoc(
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder builderForValue) {
        if (playerLocBuilder_ == null) {
          playerLoc_ = builderForValue.build();
          onChanged();
        } else {
          playerLocBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       */
      public Builder mergePlayerLoc(emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo value) {
        if (playerLocBuilder_ == null) {
          if (playerLoc_ != null) {
            playerLoc_ =
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.newBuilder(playerLoc_).mergeFrom(value).buildPartial();
          } else {
            playerLoc_ = value;
          }
          onChanged();
        } else {
          playerLocBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       */
      public Builder clearPlayerLoc() {
        if (playerLocBuilder_ == null) {
          playerLoc_ = null;
          onChanged();
        } else {
          playerLoc_ = null;
          playerLocBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       */
      public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder getPlayerLocBuilder() {
        
        onChanged();
        return getPlayerLocFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       */
      public emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder getPlayerLocOrBuilder() {
        if (playerLocBuilder_ != null) {
          return playerLocBuilder_.getMessageOrBuilder();
        } else {
          return playerLoc_ == null ?
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.getDefaultInstance() : playerLoc_;
        }
      }
      /**
       * <code>.PlayerLocationInfo player_loc = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder> 
          getPlayerLocFieldBuilder() {
        if (playerLocBuilder_ == null) {
          playerLocBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfo.Builder, emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.PlayerLocationInfoOrBuilder>(
                  getPlayerLoc(),
                  getParentForChildren(),
                  isClean());
          playerLoc_ = null;
        }
        return playerLocBuilder_;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 7;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 7;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerWorldLocationInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayerWorldLocationInfo)
    private static final emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo();
    }

    public static emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerWorldLocationInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerWorldLocationInfo>() {
      @java.lang.Override
      public PlayerWorldLocationInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerWorldLocationInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerWorldLocationInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerWorldLocationInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerWorldLocationInfoOuterClass.PlayerWorldLocationInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerWorldLocationInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerWorldLocationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PlayerWorldLocationInfo.proto\032\030PlayerL" +
      "ocationInfo.proto\"T\n\027PlayerWorldLocation" +
      "Info\022\'\n\nplayer_loc\030\002 \001(\0132\023.PlayerLocatio" +
      "nInfo\022\020\n\010scene_id\030\007 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerWorldLocationInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerWorldLocationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerWorldLocationInfo_descriptor,
        new java.lang.String[] { "PlayerLoc", "SceneId", });
    emu.grasscutter.net.proto.PlayerLocationInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
