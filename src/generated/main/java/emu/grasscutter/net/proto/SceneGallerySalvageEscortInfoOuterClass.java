// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGallerySalvageEscortInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGallerySalvageEscortInfoOuterClass {
  private SceneGallerySalvageEscortInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGallerySalvageEscortInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGallerySalvageEscortInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_box_count = 14;</code>
     * @return The maxBoxCount.
     */
    int getMaxBoxCount();

    /**
     * <code>uint32 max_monster_count = 3;</code>
     * @return The maxMonsterCount.
     */
    int getMaxMonsterCount();

    /**
     * <code>uint32 box_count = 7;</code>
     * @return The boxCount.
     */
    int getBoxCount();

    /**
     * <code>uint32 monster_count = 11;</code>
     * @return The monsterCount.
     */
    int getMonsterCount();
  }
  /**
   * Protobuf type {@code SceneGallerySalvageEscortInfo}
   */
  public static final class SceneGallerySalvageEscortInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGallerySalvageEscortInfo)
      SceneGallerySalvageEscortInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGallerySalvageEscortInfo.newBuilder() to construct.
    private SceneGallerySalvageEscortInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGallerySalvageEscortInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGallerySalvageEscortInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGallerySalvageEscortInfo(
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
            case 24: {

              maxMonsterCount_ = input.readUInt32();
              break;
            }
            case 56: {

              boxCount_ = input.readUInt32();
              break;
            }
            case 88: {

              monsterCount_ = input.readUInt32();
              break;
            }
            case 112: {

              maxBoxCount_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.class, emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.Builder.class);
    }

    public static final int MAX_BOX_COUNT_FIELD_NUMBER = 14;
    private int maxBoxCount_;
    /**
     * <code>uint32 max_box_count = 14;</code>
     * @return The maxBoxCount.
     */
    @java.lang.Override
    public int getMaxBoxCount() {
      return maxBoxCount_;
    }

    public static final int MAX_MONSTER_COUNT_FIELD_NUMBER = 3;
    private int maxMonsterCount_;
    /**
     * <code>uint32 max_monster_count = 3;</code>
     * @return The maxMonsterCount.
     */
    @java.lang.Override
    public int getMaxMonsterCount() {
      return maxMonsterCount_;
    }

    public static final int BOX_COUNT_FIELD_NUMBER = 7;
    private int boxCount_;
    /**
     * <code>uint32 box_count = 7;</code>
     * @return The boxCount.
     */
    @java.lang.Override
    public int getBoxCount() {
      return boxCount_;
    }

    public static final int MONSTER_COUNT_FIELD_NUMBER = 11;
    private int monsterCount_;
    /**
     * <code>uint32 monster_count = 11;</code>
     * @return The monsterCount.
     */
    @java.lang.Override
    public int getMonsterCount() {
      return monsterCount_;
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
      if (maxMonsterCount_ != 0) {
        output.writeUInt32(3, maxMonsterCount_);
      }
      if (boxCount_ != 0) {
        output.writeUInt32(7, boxCount_);
      }
      if (monsterCount_ != 0) {
        output.writeUInt32(11, monsterCount_);
      }
      if (maxBoxCount_ != 0) {
        output.writeUInt32(14, maxBoxCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, maxMonsterCount_);
      }
      if (boxCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, boxCount_);
      }
      if (monsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, monsterCount_);
      }
      if (maxBoxCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, maxBoxCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo other = (emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo) obj;

      if (getMaxBoxCount()
          != other.getMaxBoxCount()) return false;
      if (getMaxMonsterCount()
          != other.getMaxMonsterCount()) return false;
      if (getBoxCount()
          != other.getBoxCount()) return false;
      if (getMonsterCount()
          != other.getMonsterCount()) return false;
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
      hash = (37 * hash) + MAX_BOX_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxBoxCount();
      hash = (37 * hash) + MAX_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxMonsterCount();
      hash = (37 * hash) + BOX_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getBoxCount();
      hash = (37 * hash) + MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo prototype) {
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
     * Protobuf type {@code SceneGallerySalvageEscortInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGallerySalvageEscortInfo)
        emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.class, emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.newBuilder()
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
        maxBoxCount_ = 0;

        maxMonsterCount_ = 0;

        boxCount_ = 0;

        monsterCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo build() {
        emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo result = new emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo(this);
        result.maxBoxCount_ = maxBoxCount_;
        result.maxMonsterCount_ = maxMonsterCount_;
        result.boxCount_ = boxCount_;
        result.monsterCount_ = monsterCount_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.getDefaultInstance()) return this;
        if (other.getMaxBoxCount() != 0) {
          setMaxBoxCount(other.getMaxBoxCount());
        }
        if (other.getMaxMonsterCount() != 0) {
          setMaxMonsterCount(other.getMaxMonsterCount());
        }
        if (other.getBoxCount() != 0) {
          setBoxCount(other.getBoxCount());
        }
        if (other.getMonsterCount() != 0) {
          setMonsterCount(other.getMonsterCount());
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
        emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int maxBoxCount_ ;
      /**
       * <code>uint32 max_box_count = 14;</code>
       * @return The maxBoxCount.
       */
      @java.lang.Override
      public int getMaxBoxCount() {
        return maxBoxCount_;
      }
      /**
       * <code>uint32 max_box_count = 14;</code>
       * @param value The maxBoxCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxBoxCount(int value) {
        
        maxBoxCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_box_count = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxBoxCount() {
        
        maxBoxCount_ = 0;
        onChanged();
        return this;
      }

      private int maxMonsterCount_ ;
      /**
       * <code>uint32 max_monster_count = 3;</code>
       * @return The maxMonsterCount.
       */
      @java.lang.Override
      public int getMaxMonsterCount() {
        return maxMonsterCount_;
      }
      /**
       * <code>uint32 max_monster_count = 3;</code>
       * @param value The maxMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxMonsterCount(int value) {
        
        maxMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_monster_count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxMonsterCount() {
        
        maxMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int boxCount_ ;
      /**
       * <code>uint32 box_count = 7;</code>
       * @return The boxCount.
       */
      @java.lang.Override
      public int getBoxCount() {
        return boxCount_;
      }
      /**
       * <code>uint32 box_count = 7;</code>
       * @param value The boxCount to set.
       * @return This builder for chaining.
       */
      public Builder setBoxCount(int value) {
        
        boxCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 box_count = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBoxCount() {
        
        boxCount_ = 0;
        onChanged();
        return this;
      }

      private int monsterCount_ ;
      /**
       * <code>uint32 monster_count = 11;</code>
       * @return The monsterCount.
       */
      @java.lang.Override
      public int getMonsterCount() {
        return monsterCount_;
      }
      /**
       * <code>uint32 monster_count = 11;</code>
       * @param value The monsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterCount(int value) {
        
        monsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_count = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterCount() {
        
        monsterCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGallerySalvageEscortInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGallerySalvageEscortInfo)
    private static final emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo();
    }

    public static emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGallerySalvageEscortInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGallerySalvageEscortInfo>() {
      @java.lang.Override
      public SceneGallerySalvageEscortInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGallerySalvageEscortInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGallerySalvageEscortInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGallerySalvageEscortInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGallerySalvageEscortInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGallerySalvageEscortInfo.proto\"{\n" +
      "\035SceneGallerySalvageEscortInfo\022\025\n\rmax_bo" +
      "x_count\030\016 \001(\r\022\031\n\021max_monster_count\030\003 \001(\r" +
      "\022\021\n\tbox_count\030\007 \001(\r\022\025\n\rmonster_count\030\013 \001" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGallerySalvageEscortInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGallerySalvageEscortInfo_descriptor,
        new java.lang.String[] { "MaxBoxCount", "MaxMonsterCount", "BoxCount", "MonsterCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
