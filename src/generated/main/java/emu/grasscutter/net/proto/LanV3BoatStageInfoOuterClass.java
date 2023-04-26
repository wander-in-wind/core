// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanV3BoatStageInfo.proto

package emu.grasscutter.net.proto;

public final class LanV3BoatStageInfoOuterClass {
  private LanV3BoatStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanV3BoatStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanV3BoatStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 map_id = 14;</code>
     * @return The mapId.
     */
    int getMapId();

    /**
     * <code>uint32 match_id = 3;</code>
     * @return The matchId.
     */
    int getMatchId();

    /**
     * <code>repeated uint32 player_uid_list = 9;</code>
     * @return A list containing the playerUidList.
     */
    java.util.List<java.lang.Integer> getPlayerUidListList();
    /**
     * <code>repeated uint32 player_uid_list = 9;</code>
     * @return The count of playerUidList.
     */
    int getPlayerUidListCount();
    /**
     * <code>repeated uint32 player_uid_list = 9;</code>
     * @param index The index of the element to return.
     * @return The playerUidList at the given index.
     */
    int getPlayerUidList(int index);

    /**
     * <code>bool is_single = 13;</code>
     * @return The isSingle.
     */
    boolean getIsSingle();
  }
  /**
   * <pre>
   * Name: ODMKEMKFBMB
   * </pre>
   *
   * Protobuf type {@code LanV3BoatStageInfo}
   */
  public static final class LanV3BoatStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanV3BoatStageInfo)
      LanV3BoatStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanV3BoatStageInfo.newBuilder() to construct.
    private LanV3BoatStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanV3BoatStageInfo() {
      playerUidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanV3BoatStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LanV3BoatStageInfo(
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
            case 24: {

              matchId_ = input.readUInt32();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              playerUidList_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                playerUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                playerUidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {

              isSingle_ = input.readBool();
              break;
            }
            case 112: {

              mapId_ = input.readUInt32();
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
          playerUidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.internal_static_LanV3BoatStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.internal_static_LanV3BoatStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo.class, emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo.Builder.class);
    }

    public static final int MAP_ID_FIELD_NUMBER = 14;
    private int mapId_;
    /**
     * <code>uint32 map_id = 14;</code>
     * @return The mapId.
     */
    @java.lang.Override
    public int getMapId() {
      return mapId_;
    }

    public static final int MATCH_ID_FIELD_NUMBER = 3;
    private int matchId_;
    /**
     * <code>uint32 match_id = 3;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
    }

    public static final int PLAYER_UID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList playerUidList_;
    /**
     * <code>repeated uint32 player_uid_list = 9;</code>
     * @return A list containing the playerUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getPlayerUidListList() {
      return playerUidList_;
    }
    /**
     * <code>repeated uint32 player_uid_list = 9;</code>
     * @return The count of playerUidList.
     */
    public int getPlayerUidListCount() {
      return playerUidList_.size();
    }
    /**
     * <code>repeated uint32 player_uid_list = 9;</code>
     * @param index The index of the element to return.
     * @return The playerUidList at the given index.
     */
    public int getPlayerUidList(int index) {
      return playerUidList_.getInt(index);
    }
    private int playerUidListMemoizedSerializedSize = -1;

    public static final int IS_SINGLE_FIELD_NUMBER = 13;
    private boolean isSingle_;
    /**
     * <code>bool is_single = 13;</code>
     * @return The isSingle.
     */
    @java.lang.Override
    public boolean getIsSingle() {
      return isSingle_;
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
      getSerializedSize();
      if (matchId_ != 0) {
        output.writeUInt32(3, matchId_);
      }
      if (getPlayerUidListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(playerUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < playerUidList_.size(); i++) {
        output.writeUInt32NoTag(playerUidList_.getInt(i));
      }
      if (isSingle_ != false) {
        output.writeBool(13, isSingle_);
      }
      if (mapId_ != 0) {
        output.writeUInt32(14, mapId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, matchId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < playerUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(playerUidList_.getInt(i));
        }
        size += dataSize;
        if (!getPlayerUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        playerUidListMemoizedSerializedSize = dataSize;
      }
      if (isSingle_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isSingle_);
      }
      if (mapId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, mapId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo other = (emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo) obj;

      if (getMapId()
          != other.getMapId()) return false;
      if (getMatchId()
          != other.getMatchId()) return false;
      if (!getPlayerUidListList()
          .equals(other.getPlayerUidListList())) return false;
      if (getIsSingle()
          != other.getIsSingle()) return false;
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
      hash = (37 * hash) + MAP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMapId();
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      if (getPlayerUidListCount() > 0) {
        hash = (37 * hash) + PLAYER_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerUidListList().hashCode();
      }
      hash = (37 * hash) + IS_SINGLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSingle());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo prototype) {
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
     * Name: ODMKEMKFBMB
     * </pre>
     *
     * Protobuf type {@code LanV3BoatStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanV3BoatStageInfo)
        emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.internal_static_LanV3BoatStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.internal_static_LanV3BoatStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo.class, emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo.newBuilder()
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
        mapId_ = 0;

        matchId_ = 0;

        playerUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isSingle_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.internal_static_LanV3BoatStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo build() {
        emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo buildPartial() {
        emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo result = new emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo(this);
        int from_bitField0_ = bitField0_;
        result.mapId_ = mapId_;
        result.matchId_ = matchId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          playerUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.playerUidList_ = playerUidList_;
        result.isSingle_ = isSingle_;
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
        if (other instanceof emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo other) {
        if (other == emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo.getDefaultInstance()) return this;
        if (other.getMapId() != 0) {
          setMapId(other.getMapId());
        }
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
        }
        if (!other.playerUidList_.isEmpty()) {
          if (playerUidList_.isEmpty()) {
            playerUidList_ = other.playerUidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlayerUidListIsMutable();
            playerUidList_.addAll(other.playerUidList_);
          }
          onChanged();
        }
        if (other.getIsSingle() != false) {
          setIsSingle(other.getIsSingle());
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
        emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int mapId_ ;
      /**
       * <code>uint32 map_id = 14;</code>
       * @return The mapId.
       */
      @java.lang.Override
      public int getMapId() {
        return mapId_;
      }
      /**
       * <code>uint32 map_id = 14;</code>
       * @param value The mapId to set.
       * @return This builder for chaining.
       */
      public Builder setMapId(int value) {
        
        mapId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 map_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMapId() {
        
        mapId_ = 0;
        onChanged();
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 3;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 3;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList playerUidList_ = emptyIntList();
      private void ensurePlayerUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerUidList_ = mutableCopy(playerUidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 player_uid_list = 9;</code>
       * @return A list containing the playerUidList.
       */
      public java.util.List<java.lang.Integer>
          getPlayerUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(playerUidList_) : playerUidList_;
      }
      /**
       * <code>repeated uint32 player_uid_list = 9;</code>
       * @return The count of playerUidList.
       */
      public int getPlayerUidListCount() {
        return playerUidList_.size();
      }
      /**
       * <code>repeated uint32 player_uid_list = 9;</code>
       * @param index The index of the element to return.
       * @return The playerUidList at the given index.
       */
      public int getPlayerUidList(int index) {
        return playerUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 player_uid_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The playerUidList to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUidList(
          int index, int value) {
        ensurePlayerUidListIsMutable();
        playerUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 player_uid_list = 9;</code>
       * @param value The playerUidList to add.
       * @return This builder for chaining.
       */
      public Builder addPlayerUidList(int value) {
        ensurePlayerUidListIsMutable();
        playerUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 player_uid_list = 9;</code>
       * @param values The playerUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllPlayerUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePlayerUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, playerUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 player_uid_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUidList() {
        playerUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isSingle_ ;
      /**
       * <code>bool is_single = 13;</code>
       * @return The isSingle.
       */
      @java.lang.Override
      public boolean getIsSingle() {
        return isSingle_;
      }
      /**
       * <code>bool is_single = 13;</code>
       * @param value The isSingle to set.
       * @return This builder for chaining.
       */
      public Builder setIsSingle(boolean value) {
        
        isSingle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_single = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSingle() {
        
        isSingle_ = false;
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


      // @@protoc_insertion_point(builder_scope:LanV3BoatStageInfo)
    }

    // @@protoc_insertion_point(class_scope:LanV3BoatStageInfo)
    private static final emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo();
    }

    public static emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanV3BoatStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<LanV3BoatStageInfo>() {
      @java.lang.Override
      public LanV3BoatStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanV3BoatStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanV3BoatStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanV3BoatStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LanV3BoatStageInfoOuterClass.LanV3BoatStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanV3BoatStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanV3BoatStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030LanV3BoatStageInfo.proto\"b\n\022LanV3BoatS" +
      "tageInfo\022\016\n\006map_id\030\016 \001(\r\022\020\n\010match_id\030\003 \001" +
      "(\r\022\027\n\017player_uid_list\030\t \003(\r\022\021\n\tis_single" +
      "\030\r \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanV3BoatStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanV3BoatStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanV3BoatStageInfo_descriptor,
        new java.lang.String[] { "MapId", "MatchId", "PlayerUidList", "IsSingle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
