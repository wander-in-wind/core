// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampV3ShadowLevelInfo.proto

package emu.grasscutter.net.proto;

public final class SeaLampV3ShadowLevelInfoOuterClass {
  private SeaLampV3ShadowLevelInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampV3ShadowLevelInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampV3ShadowLevelInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 min_finish_time = 11;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>bool is_open = 3;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * Obf: PGFAIDKGFLI
   * </pre>
   *
   * Protobuf type {@code SeaLampV3ShadowLevelInfo}
   */
  public static final class SeaLampV3ShadowLevelInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampV3ShadowLevelInfo)
      SeaLampV3ShadowLevelInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampV3ShadowLevelInfo.newBuilder() to construct.
    private SeaLampV3ShadowLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampV3ShadowLevelInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampV3ShadowLevelInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SeaLampV3ShadowLevelInfo(
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
            case 8: {

              levelId_ = input.readUInt32();
              break;
            }
            case 24: {

              isOpen_ = input.readBool();
              break;
            }
            case 88: {

              minFinishTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.internal_static_SeaLampV3ShadowLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.internal_static_SeaLampV3ShadowLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo.class, emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo.Builder.class);
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 11;
    private int minFinishTime_;
    /**
     * <code>uint32 min_finish_time = 11;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 3;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 3;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 1;
    private int levelId_;
    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (levelId_ != 0) {
        output.writeUInt32(1, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(3, isOpen_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(11, minFinishTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isOpen_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, minFinishTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo other = (emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo) obj;

      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo prototype) {
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
     * Obf: PGFAIDKGFLI
     * </pre>
     *
     * Protobuf type {@code SeaLampV3ShadowLevelInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampV3ShadowLevelInfo)
        emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.internal_static_SeaLampV3ShadowLevelInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.internal_static_SeaLampV3ShadowLevelInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo.class, emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo.newBuilder()
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
        minFinishTime_ = 0;

        isOpen_ = false;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.internal_static_SeaLampV3ShadowLevelInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo build() {
        emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo buildPartial() {
        emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo result = new emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo(this);
        result.minFinishTime_ = minFinishTime_;
        result.isOpen_ = isOpen_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo other) {
        if (other == emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo.getDefaultInstance()) return this;
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 11;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 11;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {
        
        minFinishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 3;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 3;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 1;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SeaLampV3ShadowLevelInfo)
    }

    // @@protoc_insertion_point(class_scope:SeaLampV3ShadowLevelInfo)
    private static final emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo();
    }

    public static emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampV3ShadowLevelInfo>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampV3ShadowLevelInfo>() {
      @java.lang.Override
      public SeaLampV3ShadowLevelInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SeaLampV3ShadowLevelInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SeaLampV3ShadowLevelInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampV3ShadowLevelInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampV3ShadowLevelInfoOuterClass.SeaLampV3ShadowLevelInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampV3ShadowLevelInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampV3ShadowLevelInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SeaLampV3ShadowLevelInfo.proto\"V\n\030SeaL" +
      "ampV3ShadowLevelInfo\022\027\n\017min_finish_time\030" +
      "\013 \001(\r\022\017\n\007is_open\030\003 \001(\010\022\020\n\010level_id\030\001 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeaLampV3ShadowLevelInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampV3ShadowLevelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampV3ShadowLevelInfo_descriptor,
        new java.lang.String[] { "MinFinishTime", "IsOpen", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
