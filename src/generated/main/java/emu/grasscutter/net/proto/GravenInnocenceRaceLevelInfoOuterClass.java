// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocenceRaceLevelInfo.proto

package emu.grasscutter.net.proto;

public final class GravenInnocenceRaceLevelInfoOuterClass {
  private GravenInnocenceRaceLevelInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocenceRaceLevelInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocenceRaceLevelInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 max_score = 14;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>bool is_open = 1;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code GravenInnocenceRaceLevelInfo}
   */
  public static final class GravenInnocenceRaceLevelInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocenceRaceLevelInfo)
      GravenInnocenceRaceLevelInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocenceRaceLevelInfo.newBuilder() to construct.
    private GravenInnocenceRaceLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocenceRaceLevelInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocenceRaceLevelInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GravenInnocenceRaceLevelInfo(
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

              isOpen_ = input.readBool();
              break;
            }
            case 104: {

              levelId_ = input.readUInt32();
              break;
            }
            case 112: {

              maxScore_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.internal_static_GravenInnocenceRaceLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.internal_static_GravenInnocenceRaceLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo.class, emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 13;
    private int levelId_;
    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 14;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 14;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 1;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 1;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (isOpen_ != false) {
        output.writeBool(1, isOpen_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
      }
      if (maxScore_ != 0) {
        output.writeUInt32(14, maxScore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isOpen_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
      }
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, maxScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo other = (emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo prototype) {
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
     * Protobuf type {@code GravenInnocenceRaceLevelInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocenceRaceLevelInfo)
        emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.internal_static_GravenInnocenceRaceLevelInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.internal_static_GravenInnocenceRaceLevelInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo.class, emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo.newBuilder()
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
        levelId_ = 0;

        maxScore_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.internal_static_GravenInnocenceRaceLevelInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo build() {
        emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo buildPartial() {
        emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo result = new emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo(this);
        result.levelId_ = levelId_;
        result.maxScore_ = maxScore_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo other) {
        if (other == emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 14;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 14;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 1;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 1;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:GravenInnocenceRaceLevelInfo)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocenceRaceLevelInfo)
    private static final emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo();
    }

    public static emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocenceRaceLevelInfo>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocenceRaceLevelInfo>() {
      @java.lang.Override
      public GravenInnocenceRaceLevelInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GravenInnocenceRaceLevelInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GravenInnocenceRaceLevelInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocenceRaceLevelInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GravenInnocenceRaceLevelInfoOuterClass.GravenInnocenceRaceLevelInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocenceRaceLevelInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocenceRaceLevelInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GravenInnocenceRaceLevelInfo.proto\"T\n\034" +
      "GravenInnocenceRaceLevelInfo\022\020\n\010level_id" +
      "\030\r \001(\r\022\021\n\tmax_score\030\016 \001(\r\022\017\n\007is_open\030\001 \001" +
      "(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GravenInnocenceRaceLevelInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocenceRaceLevelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocenceRaceLevelInfo_descriptor,
        new java.lang.String[] { "LevelId", "MaxScore", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
