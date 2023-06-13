// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BounceConjuringChapterInfo.proto

package emu.grasscutter.net.proto;

public final class BounceConjuringChapterInfoOuterClass {
  private BounceConjuringChapterInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BounceConjuringChapterInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BounceConjuringChapterInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 best_score = 12;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 chapter_id = 13;</code>
     * @return The chapterId.
     */
    int getChapterId();
  }
  /**
   * Protobuf type {@code BounceConjuringChapterInfo}
   */
  public static final class BounceConjuringChapterInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BounceConjuringChapterInfo)
      BounceConjuringChapterInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BounceConjuringChapterInfo.newBuilder() to construct.
    private BounceConjuringChapterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BounceConjuringChapterInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BounceConjuringChapterInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BounceConjuringChapterInfo(
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
            case 72: {

              openTime_ = input.readUInt32();
              break;
            }
            case 96: {

              bestScore_ = input.readUInt32();
              break;
            }
            case 104: {

              chapterId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.internal_static_BounceConjuringChapterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.internal_static_BounceConjuringChapterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo.class, emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo.Builder.class);
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 12;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 12;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 9;
    private int openTime_;
    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 13;
    private int chapterId_;
    /**
     * <code>uint32 chapter_id = 13;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapterId_;
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
      if (openTime_ != 0) {
        output.writeUInt32(9, openTime_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(12, bestScore_);
      }
      if (chapterId_ != 0) {
        output.writeUInt32(13, chapterId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, openTime_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, bestScore_);
      }
      if (chapterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, chapterId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo other = (emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo) obj;

      if (getBestScore()
          != other.getBestScore()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getChapterId()
          != other.getChapterId()) return false;
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
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChapterId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo prototype) {
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
     * Protobuf type {@code BounceConjuringChapterInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BounceConjuringChapterInfo)
        emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.internal_static_BounceConjuringChapterInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.internal_static_BounceConjuringChapterInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo.class, emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo.newBuilder()
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
        bestScore_ = 0;

        openTime_ = 0;

        chapterId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.internal_static_BounceConjuringChapterInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo build() {
        emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo buildPartial() {
        emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo result = new emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo(this);
        result.bestScore_ = bestScore_;
        result.openTime_ = openTime_;
        result.chapterId_ = chapterId_;
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
        if (other instanceof emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo other) {
        if (other == emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo.getDefaultInstance()) return this;
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getChapterId() != 0) {
          setChapterId(other.getChapterId());
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
        emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 12;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 12;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 9;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 9;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int chapterId_ ;
      /**
       * <code>uint32 chapter_id = 13;</code>
       * @return The chapterId.
       */
      @java.lang.Override
      public int getChapterId() {
        return chapterId_;
      }
      /**
       * <code>uint32 chapter_id = 13;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        chapterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        
        chapterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BounceConjuringChapterInfo)
    }

    // @@protoc_insertion_point(class_scope:BounceConjuringChapterInfo)
    private static final emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo();
    }

    public static emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BounceConjuringChapterInfo>
        PARSER = new com.google.protobuf.AbstractParser<BounceConjuringChapterInfo>() {
      @java.lang.Override
      public BounceConjuringChapterInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BounceConjuringChapterInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BounceConjuringChapterInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BounceConjuringChapterInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BounceConjuringChapterInfoOuterClass.BounceConjuringChapterInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BounceConjuringChapterInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BounceConjuringChapterInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n BounceConjuringChapterInfo.proto\"W\n\032Bo" +
      "unceConjuringChapterInfo\022\022\n\nbest_score\030\014" +
      " \001(\r\022\021\n\topen_time\030\t \001(\r\022\022\n\nchapter_id\030\r " +
      "\001(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BounceConjuringChapterInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BounceConjuringChapterInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BounceConjuringChapterInfo_descriptor,
        new java.lang.String[] { "BestScore", "OpenTime", "ChapterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
