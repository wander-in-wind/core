// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanV3ShadowFinishLevelReq.proto

package emu.grasscutter.net.proto;

public final class LanV3ShadowFinishLevelReqOuterClass {
  private LanV3ShadowFinishLevelReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanV3ShadowFinishLevelReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanV3ShadowFinishLevelReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 finish_time = 12;</code>
     * @return The finishTime.
     */
    int getFinishTime();
  }
  /**
   * <pre>
   * CmdId: 23886
   * Name: OMFGFEMGCPM
   * </pre>
   *
   * Protobuf type {@code LanV3ShadowFinishLevelReq}
   */
  public static final class LanV3ShadowFinishLevelReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanV3ShadowFinishLevelReq)
      LanV3ShadowFinishLevelReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanV3ShadowFinishLevelReq.newBuilder() to construct.
    private LanV3ShadowFinishLevelReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanV3ShadowFinishLevelReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanV3ShadowFinishLevelReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LanV3ShadowFinishLevelReq(
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
            case 96: {

              finishTime_ = input.readUInt32();
              break;
            }
            case 120: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.internal_static_LanV3ShadowFinishLevelReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.internal_static_LanV3ShadowFinishLevelReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq.class, emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 12;
    private int finishTime_;
    /**
     * <code>uint32 finish_time = 12;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
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
      if (finishTime_ != 0) {
        output.writeUInt32(12, finishTime_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, finishTime_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq other = (emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getFinishTime()
          != other.getFinishTime()) return false;
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
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq prototype) {
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
     * CmdId: 23886
     * Name: OMFGFEMGCPM
     * </pre>
     *
     * Protobuf type {@code LanV3ShadowFinishLevelReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanV3ShadowFinishLevelReq)
        emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.internal_static_LanV3ShadowFinishLevelReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.internal_static_LanV3ShadowFinishLevelReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq.class, emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq.newBuilder()
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

        finishTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.internal_static_LanV3ShadowFinishLevelReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq build() {
        emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq buildPartial() {
        emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq result = new emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq(this);
        result.levelId_ = levelId_;
        result.finishTime_ = finishTime_;
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
        if (other instanceof emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq) {
          return mergeFrom((emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq other) {
        if (other == emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
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
        emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq) e.getUnfinishedMessage();
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
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 12;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 12;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {
        
        finishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        
        finishTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanV3ShadowFinishLevelReq)
    }

    // @@protoc_insertion_point(class_scope:LanV3ShadowFinishLevelReq)
    private static final emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq();
    }

    public static emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanV3ShadowFinishLevelReq>
        PARSER = new com.google.protobuf.AbstractParser<LanV3ShadowFinishLevelReq>() {
      @java.lang.Override
      public LanV3ShadowFinishLevelReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanV3ShadowFinishLevelReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanV3ShadowFinishLevelReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanV3ShadowFinishLevelReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LanV3ShadowFinishLevelReqOuterClass.LanV3ShadowFinishLevelReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanV3ShadowFinishLevelReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanV3ShadowFinishLevelReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037LanV3ShadowFinishLevelReq.proto\"B\n\031Lan" +
      "V3ShadowFinishLevelReq\022\020\n\010level_id\030\017 \001(\r" +
      "\022\023\n\013finish_time\030\014 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanV3ShadowFinishLevelReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanV3ShadowFinishLevelReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanV3ShadowFinishLevelReq_descriptor,
        new java.lang.String[] { "LevelId", "FinishTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
