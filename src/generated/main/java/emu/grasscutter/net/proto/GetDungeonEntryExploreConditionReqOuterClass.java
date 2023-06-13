// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetDungeonEntryExploreConditionReq.proto

package emu.grasscutter.net.proto;

public final class GetDungeonEntryExploreConditionReqOuterClass {
  private GetDungeonEntryExploreConditionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetDungeonEntryExploreConditionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetDungeonEntryExploreConditionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 6;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 dungeon_entry_config_id = 2;</code>
     * @return The dungeonEntryConfigId.
     */
    int getDungeonEntryConfigId();

    /**
     * <code>uint32 dungeon_entry_scene_point_id = 4;</code>
     * @return The dungeonEntryScenePointId.
     */
    int getDungeonEntryScenePointId();
  }
  /**
   * <pre>
   * CmdId: 3165
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GetDungeonEntryExploreConditionReq}
   */
  public static final class GetDungeonEntryExploreConditionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetDungeonEntryExploreConditionReq)
      GetDungeonEntryExploreConditionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetDungeonEntryExploreConditionReq.newBuilder() to construct.
    private GetDungeonEntryExploreConditionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetDungeonEntryExploreConditionReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetDungeonEntryExploreConditionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetDungeonEntryExploreConditionReq(
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

              dungeonEntryConfigId_ = input.readUInt32();
              break;
            }
            case 32: {

              dungeonEntryScenePointId_ = input.readUInt32();
              break;
            }
            case 48: {

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
      return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.internal_static_GetDungeonEntryExploreConditionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.internal_static_GetDungeonEntryExploreConditionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq.class, emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 6;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 6;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int DUNGEON_ENTRY_CONFIG_ID_FIELD_NUMBER = 2;
    private int dungeonEntryConfigId_;
    /**
     * <code>uint32 dungeon_entry_config_id = 2;</code>
     * @return The dungeonEntryConfigId.
     */
    @java.lang.Override
    public int getDungeonEntryConfigId() {
      return dungeonEntryConfigId_;
    }

    public static final int DUNGEON_ENTRY_SCENE_POINT_ID_FIELD_NUMBER = 4;
    private int dungeonEntryScenePointId_;
    /**
     * <code>uint32 dungeon_entry_scene_point_id = 4;</code>
     * @return The dungeonEntryScenePointId.
     */
    @java.lang.Override
    public int getDungeonEntryScenePointId() {
      return dungeonEntryScenePointId_;
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
      if (dungeonEntryConfigId_ != 0) {
        output.writeUInt32(2, dungeonEntryConfigId_);
      }
      if (dungeonEntryScenePointId_ != 0) {
        output.writeUInt32(4, dungeonEntryScenePointId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(6, sceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonEntryConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dungeonEntryConfigId_);
      }
      if (dungeonEntryScenePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dungeonEntryScenePointId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq other = (emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getDungeonEntryConfigId()
          != other.getDungeonEntryConfigId()) return false;
      if (getDungeonEntryScenePointId()
          != other.getDungeonEntryScenePointId()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + DUNGEON_ENTRY_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonEntryConfigId();
      hash = (37 * hash) + DUNGEON_ENTRY_SCENE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonEntryScenePointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq prototype) {
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
     * CmdId: 3165
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GetDungeonEntryExploreConditionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetDungeonEntryExploreConditionReq)
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.internal_static_GetDungeonEntryExploreConditionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.internal_static_GetDungeonEntryExploreConditionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq.class, emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq.newBuilder()
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
        sceneId_ = 0;

        dungeonEntryConfigId_ = 0;

        dungeonEntryScenePointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.internal_static_GetDungeonEntryExploreConditionReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq build() {
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq buildPartial() {
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq result = new emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq(this);
        result.sceneId_ = sceneId_;
        result.dungeonEntryConfigId_ = dungeonEntryConfigId_;
        result.dungeonEntryScenePointId_ = dungeonEntryScenePointId_;
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
        if (other instanceof emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq other) {
        if (other == emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getDungeonEntryConfigId() != 0) {
          setDungeonEntryConfigId(other.getDungeonEntryConfigId());
        }
        if (other.getDungeonEntryScenePointId() != 0) {
          setDungeonEntryScenePointId(other.getDungeonEntryScenePointId());
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
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 6;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 6;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonEntryConfigId_ ;
      /**
       * <code>uint32 dungeon_entry_config_id = 2;</code>
       * @return The dungeonEntryConfigId.
       */
      @java.lang.Override
      public int getDungeonEntryConfigId() {
        return dungeonEntryConfigId_;
      }
      /**
       * <code>uint32 dungeon_entry_config_id = 2;</code>
       * @param value The dungeonEntryConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonEntryConfigId(int value) {
        
        dungeonEntryConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_entry_config_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonEntryConfigId() {
        
        dungeonEntryConfigId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonEntryScenePointId_ ;
      /**
       * <code>uint32 dungeon_entry_scene_point_id = 4;</code>
       * @return The dungeonEntryScenePointId.
       */
      @java.lang.Override
      public int getDungeonEntryScenePointId() {
        return dungeonEntryScenePointId_;
      }
      /**
       * <code>uint32 dungeon_entry_scene_point_id = 4;</code>
       * @param value The dungeonEntryScenePointId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonEntryScenePointId(int value) {
        
        dungeonEntryScenePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_entry_scene_point_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonEntryScenePointId() {
        
        dungeonEntryScenePointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetDungeonEntryExploreConditionReq)
    }

    // @@protoc_insertion_point(class_scope:GetDungeonEntryExploreConditionReq)
    private static final emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq();
    }

    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetDungeonEntryExploreConditionReq>
        PARSER = new com.google.protobuf.AbstractParser<GetDungeonEntryExploreConditionReq>() {
      @java.lang.Override
      public GetDungeonEntryExploreConditionReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetDungeonEntryExploreConditionReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetDungeonEntryExploreConditionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetDungeonEntryExploreConditionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionReqOuterClass.GetDungeonEntryExploreConditionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetDungeonEntryExploreConditionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetDungeonEntryExploreConditionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(GetDungeonEntryExploreConditionReq.pro" +
      "to\"}\n\"GetDungeonEntryExploreConditionReq" +
      "\022\020\n\010scene_id\030\006 \001(\r\022\037\n\027dungeon_entry_conf" +
      "ig_id\030\002 \001(\r\022$\n\034dungeon_entry_scene_point" +
      "_id\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetDungeonEntryExploreConditionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetDungeonEntryExploreConditionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetDungeonEntryExploreConditionReq_descriptor,
        new java.lang.String[] { "SceneId", "DungeonEntryConfigId", "DungeonEntryScenePointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
