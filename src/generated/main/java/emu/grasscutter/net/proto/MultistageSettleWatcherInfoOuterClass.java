// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MultistageSettleWatcherInfo.proto

package emu.grasscutter.net.proto;

public final class MultistageSettleWatcherInfoOuterClass {
  private MultistageSettleWatcherInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MultistageSettleWatcherInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MultistageSettleWatcherInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 total_progress = 13;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();

    /**
     * <code>uint32 cur_progress = 5;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>uint32 watcher_id = 7;</code>
     * @return The watcherId.
     */
    int getWatcherId();

    /**
     * <code>bool is_inverse = 12;</code>
     * @return The isInverse.
     */
    boolean getIsInverse();
  }
  /**
   * Protobuf type {@code MultistageSettleWatcherInfo}
   */
  public static final class MultistageSettleWatcherInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MultistageSettleWatcherInfo)
      MultistageSettleWatcherInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MultistageSettleWatcherInfo.newBuilder() to construct.
    private MultistageSettleWatcherInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MultistageSettleWatcherInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MultistageSettleWatcherInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MultistageSettleWatcherInfo(
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
            case 40: {

              curProgress_ = input.readUInt32();
              break;
            }
            case 56: {

              watcherId_ = input.readUInt32();
              break;
            }
            case 96: {

              isInverse_ = input.readBool();
              break;
            }
            case 104: {

              totalProgress_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.internal_static_MultistageSettleWatcherInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.internal_static_MultistageSettleWatcherInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo.class, emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo.Builder.class);
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 13;
    private int totalProgress_;
    /**
     * <code>uint32 total_progress = 13;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 5;
    private int curProgress_;
    /**
     * <code>uint32 cur_progress = 5;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 7;
    private int watcherId_;
    /**
     * <code>uint32 watcher_id = 7;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
    }

    public static final int IS_INVERSE_FIELD_NUMBER = 12;
    private boolean isInverse_;
    /**
     * <code>bool is_inverse = 12;</code>
     * @return The isInverse.
     */
    @java.lang.Override
    public boolean getIsInverse() {
      return isInverse_;
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
      if (curProgress_ != 0) {
        output.writeUInt32(5, curProgress_);
      }
      if (watcherId_ != 0) {
        output.writeUInt32(7, watcherId_);
      }
      if (isInverse_ != false) {
        output.writeBool(12, isInverse_);
      }
      if (totalProgress_ != 0) {
        output.writeUInt32(13, totalProgress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, curProgress_);
      }
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, watcherId_);
      }
      if (isInverse_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isInverse_);
      }
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, totalProgress_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo other = (emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo) obj;

      if (getTotalProgress()
          != other.getTotalProgress()) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
      if (getIsInverse()
          != other.getIsInverse()) return false;
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
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (37 * hash) + IS_INVERSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInverse());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo prototype) {
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
     * Protobuf type {@code MultistageSettleWatcherInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MultistageSettleWatcherInfo)
        emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.internal_static_MultistageSettleWatcherInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.internal_static_MultistageSettleWatcherInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo.class, emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo.newBuilder()
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
        totalProgress_ = 0;

        curProgress_ = 0;

        watcherId_ = 0;

        isInverse_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.internal_static_MultistageSettleWatcherInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo build() {
        emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo buildPartial() {
        emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo result = new emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo(this);
        result.totalProgress_ = totalProgress_;
        result.curProgress_ = curProgress_;
        result.watcherId_ = watcherId_;
        result.isInverse_ = isInverse_;
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
        if (other instanceof emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo other) {
        if (other == emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo.getDefaultInstance()) return this;
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
        }
        if (other.getIsInverse() != false) {
          setIsInverse(other.getIsInverse());
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
        emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 13;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 13;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 5;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 5;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {
        
        curProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        
        curProgress_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 7;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 7;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        
        watcherId_ = 0;
        onChanged();
        return this;
      }

      private boolean isInverse_ ;
      /**
       * <code>bool is_inverse = 12;</code>
       * @return The isInverse.
       */
      @java.lang.Override
      public boolean getIsInverse() {
        return isInverse_;
      }
      /**
       * <code>bool is_inverse = 12;</code>
       * @param value The isInverse to set.
       * @return This builder for chaining.
       */
      public Builder setIsInverse(boolean value) {
        
        isInverse_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_inverse = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInverse() {
        
        isInverse_ = false;
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


      // @@protoc_insertion_point(builder_scope:MultistageSettleWatcherInfo)
    }

    // @@protoc_insertion_point(class_scope:MultistageSettleWatcherInfo)
    private static final emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo();
    }

    public static emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MultistageSettleWatcherInfo>
        PARSER = new com.google.protobuf.AbstractParser<MultistageSettleWatcherInfo>() {
      @java.lang.Override
      public MultistageSettleWatcherInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MultistageSettleWatcherInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MultistageSettleWatcherInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MultistageSettleWatcherInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MultistageSettleWatcherInfoOuterClass.MultistageSettleWatcherInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MultistageSettleWatcherInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MultistageSettleWatcherInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MultistageSettleWatcherInfo.proto\"s\n\033M" +
      "ultistageSettleWatcherInfo\022\026\n\016total_prog" +
      "ress\030\r \001(\r\022\024\n\014cur_progress\030\005 \001(\r\022\022\n\nwatc" +
      "her_id\030\007 \001(\r\022\022\n\nis_inverse\030\014 \001(\010B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MultistageSettleWatcherInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MultistageSettleWatcherInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MultistageSettleWatcherInfo_descriptor,
        new java.lang.String[] { "TotalProgress", "CurProgress", "WatcherId", "IsInverse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
