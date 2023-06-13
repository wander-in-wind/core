// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GeneralMatchInfo.proto

package emu.grasscutter.net.proto;

public final class GeneralMatchInfoOuterClass {
  private GeneralMatchInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GeneralMatchInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GeneralMatchInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 match_param = 1;</code>
     * @return The matchParam.
     */
    int getMatchParam();

    /**
     * <code>uint32 match_id = 9;</code>
     * @return The matchId.
     */
    int getMatchId();

    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> 
        getPlayerListList();
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getPlayerList(int index);
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    int getPlayerListCount();
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
        getPlayerListOrBuilderList();
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder getPlayerListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GeneralMatchInfo}
   */
  public static final class GeneralMatchInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GeneralMatchInfo)
      GeneralMatchInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GeneralMatchInfo.newBuilder() to construct.
    private GeneralMatchInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GeneralMatchInfo() {
      playerList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GeneralMatchInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GeneralMatchInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {

              matchParam_ = input.readUInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerList_.add(
                  input.readMessage(emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.parser(), extensionRegistry));
              break;
            }
            case 72: {

              matchId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          playerList_ = java.util.Collections.unmodifiableList(playerList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.internal_static_GeneralMatchInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.internal_static_GeneralMatchInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo.class, emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo.Builder.class);
    }

    public static final int MATCH_PARAM_FIELD_NUMBER = 1;
    private int matchParam_;
    /**
     * <code>uint32 match_param = 1;</code>
     * @return The matchParam.
     */
    @java.lang.Override
    public int getMatchParam() {
      return matchParam_;
    }

    public static final int MATCH_ID_FIELD_NUMBER = 9;
    private int matchId_;
    /**
     * <code>uint32 match_id = 9;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
    }

    public static final int PLAYER_LIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> playerList_;
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> getPlayerListList() {
      return playerList_;
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
        getPlayerListOrBuilderList() {
      return playerList_;
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    @java.lang.Override
    public int getPlayerListCount() {
      return playerList_.size();
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getPlayerList(int index) {
      return playerList_.get(index);
    }
    /**
     * <code>repeated .MatchPlayerInfo player_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder getPlayerListOrBuilder(
        int index) {
      return playerList_.get(index);
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
      if (matchParam_ != 0) {
        output.writeUInt32(1, matchParam_);
      }
      for (int i = 0; i < playerList_.size(); i++) {
        output.writeMessage(5, playerList_.get(i));
      }
      if (matchId_ != 0) {
        output.writeUInt32(9, matchId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchParam_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, matchParam_);
      }
      for (int i = 0; i < playerList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, playerList_.get(i));
      }
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, matchId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo other = (emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo) obj;

      if (getMatchParam()
          != other.getMatchParam()) return false;
      if (getMatchId()
          != other.getMatchId()) return false;
      if (!getPlayerListList()
          .equals(other.getPlayerListList())) return false;
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
      hash = (37 * hash) + MATCH_PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getMatchParam();
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      if (getPlayerListCount() > 0) {
        hash = (37 * hash) + PLAYER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo prototype) {
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
     * Protobuf type {@code GeneralMatchInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GeneralMatchInfo)
        emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.internal_static_GeneralMatchInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.internal_static_GeneralMatchInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo.class, emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo.newBuilder()
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
          getPlayerListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        matchParam_ = 0;

        matchId_ = 0;

        if (playerListBuilder_ == null) {
          playerList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.internal_static_GeneralMatchInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo build() {
        emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo buildPartial() {
        emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo result = new emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo(this);
        int from_bitField0_ = bitField0_;
        result.matchParam_ = matchParam_;
        result.matchId_ = matchId_;
        if (playerListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerList_ = java.util.Collections.unmodifiableList(playerList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerList_ = playerList_;
        } else {
          result.playerList_ = playerListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo other) {
        if (other == emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo.getDefaultInstance()) return this;
        if (other.getMatchParam() != 0) {
          setMatchParam(other.getMatchParam());
        }
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
        }
        if (playerListBuilder_ == null) {
          if (!other.playerList_.isEmpty()) {
            if (playerList_.isEmpty()) {
              playerList_ = other.playerList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerListIsMutable();
              playerList_.addAll(other.playerList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerList_.isEmpty()) {
            if (playerListBuilder_.isEmpty()) {
              playerListBuilder_.dispose();
              playerListBuilder_ = null;
              playerList_ = other.playerList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerListFieldBuilder() : null;
            } else {
              playerListBuilder_.addAllMessages(other.playerList_);
            }
          }
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
        emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int matchParam_ ;
      /**
       * <code>uint32 match_param = 1;</code>
       * @return The matchParam.
       */
      @java.lang.Override
      public int getMatchParam() {
        return matchParam_;
      }
      /**
       * <code>uint32 match_param = 1;</code>
       * @param value The matchParam to set.
       * @return This builder for chaining.
       */
      public Builder setMatchParam(int value) {
        
        matchParam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_param = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchParam() {
        
        matchParam_ = 0;
        onChanged();
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 9;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 9;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> playerList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo>(playerList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> playerListBuilder_;

      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> getPlayerListList() {
        if (playerListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerList_);
        } else {
          return playerListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public int getPlayerListCount() {
        if (playerListBuilder_ == null) {
          return playerList_.size();
        } else {
          return playerListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getPlayerList(int index) {
        if (playerListBuilder_ == null) {
          return playerList_.get(index);
        } else {
          return playerListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder setPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo value) {
        if (playerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerListIsMutable();
          playerList_.set(index, value);
          onChanged();
        } else {
          playerListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder setPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder builderForValue) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder addPlayerList(emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo value) {
        if (playerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerListIsMutable();
          playerList_.add(value);
          onChanged();
        } else {
          playerListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder addPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo value) {
        if (playerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerListIsMutable();
          playerList_.add(index, value);
          onChanged();
        } else {
          playerListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder addPlayerList(
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder builderForValue) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.add(builderForValue.build());
          onChanged();
        } else {
          playerListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder addPlayerList(
          int index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder builderForValue) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder addAllPlayerList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo> values) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerList_);
          onChanged();
        } else {
          playerListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder clearPlayerList() {
        if (playerListBuilder_ == null) {
          playerList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public Builder removePlayerList(int index) {
        if (playerListBuilder_ == null) {
          ensurePlayerListIsMutable();
          playerList_.remove(index);
          onChanged();
        } else {
          playerListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder getPlayerListBuilder(
          int index) {
        return getPlayerListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder getPlayerListOrBuilder(
          int index) {
        if (playerListBuilder_ == null) {
          return playerList_.get(index);  } else {
          return playerListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
           getPlayerListOrBuilderList() {
        if (playerListBuilder_ != null) {
          return playerListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerList_);
        }
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder addPlayerListBuilder() {
        return getPlayerListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder addPlayerListBuilder(
          int index) {
        return getPlayerListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MatchPlayerInfo player_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder> 
           getPlayerListBuilderList() {
        return getPlayerListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder> 
          getPlayerListFieldBuilder() {
        if (playerListBuilder_ == null) {
          playerListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder>(
                  playerList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerList_ = null;
        }
        return playerListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GeneralMatchInfo)
    }

    // @@protoc_insertion_point(class_scope:GeneralMatchInfo)
    private static final emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo();
    }

    public static emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GeneralMatchInfo>
        PARSER = new com.google.protobuf.AbstractParser<GeneralMatchInfo>() {
      @java.lang.Override
      public GeneralMatchInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GeneralMatchInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GeneralMatchInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GeneralMatchInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GeneralMatchInfoOuterClass.GeneralMatchInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GeneralMatchInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GeneralMatchInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GeneralMatchInfo.proto\032\025MatchPlayerInf" +
      "o.proto\"`\n\020GeneralMatchInfo\022\023\n\013match_par" +
      "am\030\001 \001(\r\022\020\n\010match_id\030\t \001(\r\022%\n\013player_lis" +
      "t\030\005 \003(\0132\020.MatchPlayerInfoB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_GeneralMatchInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GeneralMatchInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GeneralMatchInfo_descriptor,
        new java.lang.String[] { "MatchParam", "MatchId", "PlayerList", });
    emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
