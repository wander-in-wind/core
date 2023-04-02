// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeBlueprintSlotInfo.proto

package emu.grasscutter.net.proto;

public final class HomeBlueprintSlotInfoOuterClass {
  private HomeBlueprintSlotInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeBlueprintSlotInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeBlueprintSlotInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 10;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 create_time = 13;</code>
     * @return The createTime.
     */
    int getCreateTime();

    /**
     * <code>uint32 slot_id = 12;</code>
     * @return The slotId.
     */
    int getSlotId();

    /**
     * <code>uint32 module_id = 4;</code>
     * @return The moduleId.
     */
    int getModuleId();

    /**
     * <code>uint32 block_id = 11;</code>
     * @return The blockId.
     */
    int getBlockId();

    /**
     * <code>bool is_allow_copy = 5;</code>
     * @return The isAllowCopy.
     */
    boolean getIsAllowCopy();

    /**
     * <code>string share_code = 7;</code>
     * @return The shareCode.
     */
    java.lang.String getShareCode();
    /**
     * <code>string share_code = 7;</code>
     * @return The bytes for shareCode.
     */
    com.google.protobuf.ByteString
        getShareCodeBytes();
  }
  /**
   * <pre>
   * Name: EHFBOLNJEAC
   * </pre>
   *
   * Protobuf type {@code HomeBlueprintSlotInfo}
   */
  public static final class HomeBlueprintSlotInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeBlueprintSlotInfo)
      HomeBlueprintSlotInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeBlueprintSlotInfo.newBuilder() to construct.
    private HomeBlueprintSlotInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeBlueprintSlotInfo() {
      shareCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeBlueprintSlotInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeBlueprintSlotInfo(
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

              moduleId_ = input.readUInt32();
              break;
            }
            case 40: {

              isAllowCopy_ = input.readBool();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              shareCode_ = s;
              break;
            }
            case 80: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 88: {

              blockId_ = input.readUInt32();
              break;
            }
            case 96: {

              slotId_ = input.readUInt32();
              break;
            }
            case 104: {

              createTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.internal_static_HomeBlueprintSlotInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.internal_static_HomeBlueprintSlotInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.class, emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 10;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 10;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int CREATE_TIME_FIELD_NUMBER = 13;
    private int createTime_;
    /**
     * <code>uint32 create_time = 13;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public int getCreateTime() {
      return createTime_;
    }

    public static final int SLOT_ID_FIELD_NUMBER = 12;
    private int slotId_;
    /**
     * <code>uint32 slot_id = 12;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
    }

    public static final int MODULE_ID_FIELD_NUMBER = 4;
    private int moduleId_;
    /**
     * <code>uint32 module_id = 4;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
    }

    public static final int BLOCK_ID_FIELD_NUMBER = 11;
    private int blockId_;
    /**
     * <code>uint32 block_id = 11;</code>
     * @return The blockId.
     */
    @java.lang.Override
    public int getBlockId() {
      return blockId_;
    }

    public static final int IS_ALLOW_COPY_FIELD_NUMBER = 5;
    private boolean isAllowCopy_;
    /**
     * <code>bool is_allow_copy = 5;</code>
     * @return The isAllowCopy.
     */
    @java.lang.Override
    public boolean getIsAllowCopy() {
      return isAllowCopy_;
    }

    public static final int SHARE_CODE_FIELD_NUMBER = 7;
    private volatile java.lang.Object shareCode_;
    /**
     * <code>string share_code = 7;</code>
     * @return The shareCode.
     */
    @java.lang.Override
    public java.lang.String getShareCode() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareCode_ = s;
        return s;
      }
    }
    /**
     * <code>string share_code = 7;</code>
     * @return The bytes for shareCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getShareCodeBytes() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (moduleId_ != 0) {
        output.writeUInt32(4, moduleId_);
      }
      if (isAllowCopy_ != false) {
        output.writeBool(5, isAllowCopy_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, shareCode_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(10, sceneId_);
      }
      if (blockId_ != 0) {
        output.writeUInt32(11, blockId_);
      }
      if (slotId_ != 0) {
        output.writeUInt32(12, slotId_);
      }
      if (createTime_ != 0) {
        output.writeUInt32(13, createTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, moduleId_);
      }
      if (isAllowCopy_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isAllowCopy_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, shareCode_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, sceneId_);
      }
      if (blockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, blockId_);
      }
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, slotId_);
      }
      if (createTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, createTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo other = (emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getCreateTime()
          != other.getCreateTime()) return false;
      if (getSlotId()
          != other.getSlotId()) return false;
      if (getModuleId()
          != other.getModuleId()) return false;
      if (getBlockId()
          != other.getBlockId()) return false;
      if (getIsAllowCopy()
          != other.getIsAllowCopy()) return false;
      if (!getShareCode()
          .equals(other.getShareCode())) return false;
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
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime();
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId();
      hash = (37 * hash) + IS_ALLOW_COPY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllowCopy());
      hash = (37 * hash) + SHARE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getShareCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo prototype) {
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
     * Name: EHFBOLNJEAC
     * </pre>
     *
     * Protobuf type {@code HomeBlueprintSlotInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeBlueprintSlotInfo)
        emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.internal_static_HomeBlueprintSlotInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.internal_static_HomeBlueprintSlotInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.class, emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.newBuilder()
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

        createTime_ = 0;

        slotId_ = 0;

        moduleId_ = 0;

        blockId_ = 0;

        isAllowCopy_ = false;

        shareCode_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.internal_static_HomeBlueprintSlotInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo build() {
        emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo buildPartial() {
        emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo result = new emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo(this);
        result.sceneId_ = sceneId_;
        result.createTime_ = createTime_;
        result.slotId_ = slotId_;
        result.moduleId_ = moduleId_;
        result.blockId_ = blockId_;
        result.isAllowCopy_ = isAllowCopy_;
        result.shareCode_ = shareCode_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo other) {
        if (other == emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getCreateTime() != 0) {
          setCreateTime(other.getCreateTime());
        }
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
        }
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
        }
        if (other.getBlockId() != 0) {
          setBlockId(other.getBlockId());
        }
        if (other.getIsAllowCopy() != false) {
          setIsAllowCopy(other.getIsAllowCopy());
        }
        if (!other.getShareCode().isEmpty()) {
          shareCode_ = other.shareCode_;
          onChanged();
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
        emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo) e.getUnfinishedMessage();
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
       * <code>uint32 scene_id = 10;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 10;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int createTime_ ;
      /**
       * <code>uint32 create_time = 13;</code>
       * @return The createTime.
       */
      @java.lang.Override
      public int getCreateTime() {
        return createTime_;
      }
      /**
       * <code>uint32 create_time = 13;</code>
       * @param value The createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTime(int value) {
        
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 create_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreateTime() {
        
        createTime_ = 0;
        onChanged();
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 12;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 12;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
        onChanged();
        return this;
      }

      private int moduleId_ ;
      /**
       * <code>uint32 module_id = 4;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 module_id = 4;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {
        
        moduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {
        
        moduleId_ = 0;
        onChanged();
        return this;
      }

      private int blockId_ ;
      /**
       * <code>uint32 block_id = 11;</code>
       * @return The blockId.
       */
      @java.lang.Override
      public int getBlockId() {
        return blockId_;
      }
      /**
       * <code>uint32 block_id = 11;</code>
       * @param value The blockId to set.
       * @return This builder for chaining.
       */
      public Builder setBlockId(int value) {
        
        blockId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 block_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockId() {
        
        blockId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAllowCopy_ ;
      /**
       * <code>bool is_allow_copy = 5;</code>
       * @return The isAllowCopy.
       */
      @java.lang.Override
      public boolean getIsAllowCopy() {
        return isAllowCopy_;
      }
      /**
       * <code>bool is_allow_copy = 5;</code>
       * @param value The isAllowCopy to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowCopy(boolean value) {
        
        isAllowCopy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_copy = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowCopy() {
        
        isAllowCopy_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object shareCode_ = "";
      /**
       * <code>string share_code = 7;</code>
       * @return The shareCode.
       */
      public java.lang.String getShareCode() {
        java.lang.Object ref = shareCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          shareCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string share_code = 7;</code>
       * @return The bytes for shareCode.
       */
      public com.google.protobuf.ByteString
          getShareCodeBytes() {
        java.lang.Object ref = shareCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          shareCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string share_code = 7;</code>
       * @param value The shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        shareCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearShareCode() {
        
        shareCode_ = getDefaultInstance().getShareCode();
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 7;</code>
       * @param value The bytes for shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        shareCode_ = value;
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


      // @@protoc_insertion_point(builder_scope:HomeBlueprintSlotInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeBlueprintSlotInfo)
    private static final emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo();
    }

    public static emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeBlueprintSlotInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeBlueprintSlotInfo>() {
      @java.lang.Override
      public HomeBlueprintSlotInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeBlueprintSlotInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeBlueprintSlotInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeBlueprintSlotInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeBlueprintSlotInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeBlueprintSlotInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomeBlueprintSlotInfo.proto\"\237\001\n\025HomeBl" +
      "ueprintSlotInfo\022\020\n\010scene_id\030\n \001(\r\022\023\n\013cre" +
      "ate_time\030\r \001(\r\022\017\n\007slot_id\030\014 \001(\r\022\021\n\tmodul" +
      "e_id\030\004 \001(\r\022\020\n\010block_id\030\013 \001(\r\022\025\n\ris_allow" +
      "_copy\030\005 \001(\010\022\022\n\nshare_code\030\007 \001(\tB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeBlueprintSlotInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeBlueprintSlotInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeBlueprintSlotInfo_descriptor,
        new java.lang.String[] { "SceneId", "CreateTime", "SlotId", "ModuleId", "BlockId", "IsAllowCopy", "ShareCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
