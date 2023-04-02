// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonAddObstacleReq.proto

package emu.grasscutter.net.proto;

public final class ToTheMoonAddObstacleReqOuterClass {
  private ToTheMoonAddObstacleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonAddObstacleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonAddObstacleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 4;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 query_id = 8;</code>
     * @return The queryId.
     */
    int getQueryId();

    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
     * @return Whether the obstacle field is set.
     */
    boolean hasObstacle();
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
     * @return The obstacle.
     */
    emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle();
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
     */
    emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder();

    /**
     * <code>bool use_edge = 15;</code>
     * @return The useEdge.
     */
    boolean getUseEdge();
  }
  /**
   * <pre>
   * Name: LPJBABKFPFO
   * CmdId: 6134
   * </pre>
   *
   * Protobuf type {@code ToTheMoonAddObstacleReq}
   */
  public static final class ToTheMoonAddObstacleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonAddObstacleReq)
      ToTheMoonAddObstacleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonAddObstacleReq.newBuilder() to construct.
    private ToTheMoonAddObstacleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonAddObstacleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonAddObstacleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ToTheMoonAddObstacleReq(
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
            case 32: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 64: {

              queryId_ = input.readInt32();
              break;
            }
            case 114: {
              emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder subBuilder = null;
              if (obstacle_ != null) {
                subBuilder = obstacle_.toBuilder();
              }
              obstacle_ = input.readMessage(emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(obstacle_);
                obstacle_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              useEdge_ = input.readBool();
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
      return emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.class, emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 4;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 4;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int QUERY_ID_FIELD_NUMBER = 8;
    private int queryId_;
    /**
     * <code>int32 query_id = 8;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
    }

    public static final int OBSTACLE_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo obstacle_;
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
     * @return Whether the obstacle field is set.
     */
    @java.lang.Override
    public boolean hasObstacle() {
      return obstacle_ != null;
    }
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
     * @return The obstacle.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle() {
      return obstacle_ == null ? emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
    }
    /**
     * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder() {
      return getObstacle();
    }

    public static final int USE_EDGE_FIELD_NUMBER = 15;
    private boolean useEdge_;
    /**
     * <code>bool use_edge = 15;</code>
     * @return The useEdge.
     */
    @java.lang.Override
    public boolean getUseEdge() {
      return useEdge_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(4, sceneId_);
      }
      if (queryId_ != 0) {
        output.writeInt32(8, queryId_);
      }
      if (obstacle_ != null) {
        output.writeMessage(14, getObstacle());
      }
      if (useEdge_ != false) {
        output.writeBool(15, useEdge_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, sceneId_);
      }
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, queryId_);
      }
      if (obstacle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getObstacle());
      }
      if (useEdge_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, useEdge_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq other = (emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getQueryId()
          != other.getQueryId()) return false;
      if (hasObstacle() != other.hasObstacle()) return false;
      if (hasObstacle()) {
        if (!getObstacle()
            .equals(other.getObstacle())) return false;
      }
      if (getUseEdge()
          != other.getUseEdge()) return false;
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
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      if (hasObstacle()) {
        hash = (37 * hash) + OBSTACLE_FIELD_NUMBER;
        hash = (53 * hash) + getObstacle().hashCode();
      }
      hash = (37 * hash) + USE_EDGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUseEdge());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq prototype) {
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
     * Name: LPJBABKFPFO
     * CmdId: 6134
     * </pre>
     *
     * Protobuf type {@code ToTheMoonAddObstacleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonAddObstacleReq)
        emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.class, emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.newBuilder()
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

        queryId_ = 0;

        if (obstacleBuilder_ == null) {
          obstacle_ = null;
        } else {
          obstacle_ = null;
          obstacleBuilder_ = null;
        }
        useEdge_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.internal_static_ToTheMoonAddObstacleReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq build() {
        emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq buildPartial() {
        emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq result = new emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq(this);
        result.sceneId_ = sceneId_;
        result.queryId_ = queryId_;
        if (obstacleBuilder_ == null) {
          result.obstacle_ = obstacle_;
        } else {
          result.obstacle_ = obstacleBuilder_.build();
        }
        result.useEdge_ = useEdge_;
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
        if (other instanceof emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) {
          return mergeFrom((emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq other) {
        if (other == emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
        }
        if (other.hasObstacle()) {
          mergeObstacle(other.getObstacle());
        }
        if (other.getUseEdge() != false) {
          setUseEdge(other.getUseEdge());
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
        emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq) e.getUnfinishedMessage();
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
       * <code>uint32 scene_id = 4;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 4;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int queryId_ ;
      /**
       * <code>int32 query_id = 8;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 8;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo obstacle_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder> obstacleBuilder_;
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       * @return Whether the obstacle field is set.
       */
      public boolean hasObstacle() {
        return obstacleBuilder_ != null || obstacle_ != null;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       * @return The obstacle.
       */
      public emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo getObstacle() {
        if (obstacleBuilder_ == null) {
          return obstacle_ == null ? emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
        } else {
          return obstacleBuilder_.getMessage();
        }
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       */
      public Builder setObstacle(emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo value) {
        if (obstacleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          obstacle_ = value;
          onChanged();
        } else {
          obstacleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       */
      public Builder setObstacle(
          emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder builderForValue) {
        if (obstacleBuilder_ == null) {
          obstacle_ = builderForValue.build();
          onChanged();
        } else {
          obstacleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       */
      public Builder mergeObstacle(emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo value) {
        if (obstacleBuilder_ == null) {
          if (obstacle_ != null) {
            obstacle_ =
              emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.newBuilder(obstacle_).mergeFrom(value).buildPartial();
          } else {
            obstacle_ = value;
          }
          onChanged();
        } else {
          obstacleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       */
      public Builder clearObstacle() {
        if (obstacleBuilder_ == null) {
          obstacle_ = null;
          onChanged();
        } else {
          obstacle_ = null;
          obstacleBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       */
      public emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder getObstacleBuilder() {
        
        onChanged();
        return getObstacleFieldBuilder().getBuilder();
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       */
      public emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder getObstacleOrBuilder() {
        if (obstacleBuilder_ != null) {
          return obstacleBuilder_.getMessageOrBuilder();
        } else {
          return obstacle_ == null ?
              emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.getDefaultInstance() : obstacle_;
        }
      }
      /**
       * <code>.ToTheMoonObstacleInfo obstacle = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder> 
          getObstacleFieldBuilder() {
        if (obstacleBuilder_ == null) {
          obstacleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo, emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfo.Builder, emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.ToTheMoonObstacleInfoOrBuilder>(
                  getObstacle(),
                  getParentForChildren(),
                  isClean());
          obstacle_ = null;
        }
        return obstacleBuilder_;
      }

      private boolean useEdge_ ;
      /**
       * <code>bool use_edge = 15;</code>
       * @return The useEdge.
       */
      @java.lang.Override
      public boolean getUseEdge() {
        return useEdge_;
      }
      /**
       * <code>bool use_edge = 15;</code>
       * @param value The useEdge to set.
       * @return This builder for chaining.
       */
      public Builder setUseEdge(boolean value) {
        
        useEdge_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool use_edge = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseEdge() {
        
        useEdge_ = false;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonAddObstacleReq)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonAddObstacleReq)
    private static final emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq();
    }

    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonAddObstacleReq>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonAddObstacleReq>() {
      @java.lang.Override
      public ToTheMoonAddObstacleReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ToTheMoonAddObstacleReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ToTheMoonAddObstacleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonAddObstacleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ToTheMoonAddObstacleReqOuterClass.ToTheMoonAddObstacleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonAddObstacleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ToTheMoonAddObstacleReq.proto\032\033ToTheMo" +
      "onObstacleInfo.proto\"y\n\027ToTheMoonAddObst" +
      "acleReq\022\020\n\010scene_id\030\004 \001(\r\022\020\n\010query_id\030\010 " +
      "\001(\005\022(\n\010obstacle\030\016 \001(\0132\026.ToTheMoonObstacl" +
      "eInfo\022\020\n\010use_edge\030\017 \001(\010B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.getDescriptor(),
        });
    internal_static_ToTheMoonAddObstacleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonAddObstacleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonAddObstacleReq_descriptor,
        new java.lang.String[] { "SceneId", "QueryId", "Obstacle", "UseEdge", });
    emu.grasscutter.net.proto.ToTheMoonObstacleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
