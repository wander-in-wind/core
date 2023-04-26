// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryFungusFighterCaptureInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryFungusFighterCaptureInfoOuterClass {
  private SceneGalleryFungusFighterCaptureInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryFungusFighterCaptureInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryFungusFighterCaptureInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_hide_progress = 2;</code>
     * @return The isHideProgress.
     */
    boolean getIsHideProgress();
  }
  /**
   * <pre>
   * Name: MDOHOGEIKFA
   * </pre>
   *
   * Protobuf type {@code SceneGalleryFungusFighterCaptureInfo}
   */
  public static final class SceneGalleryFungusFighterCaptureInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryFungusFighterCaptureInfo)
      SceneGalleryFungusFighterCaptureInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryFungusFighterCaptureInfo.newBuilder() to construct.
    private SceneGalleryFungusFighterCaptureInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryFungusFighterCaptureInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryFungusFighterCaptureInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryFungusFighterCaptureInfo(
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

              isHideProgress_ = input.readBool();
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
      return emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.internal_static_SceneGalleryFungusFighterCaptureInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.internal_static_SceneGalleryFungusFighterCaptureInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo.class, emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo.Builder.class);
    }

    public static final int IS_HIDE_PROGRESS_FIELD_NUMBER = 2;
    private boolean isHideProgress_;
    /**
     * <code>bool is_hide_progress = 2;</code>
     * @return The isHideProgress.
     */
    @java.lang.Override
    public boolean getIsHideProgress() {
      return isHideProgress_;
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
      if (isHideProgress_ != false) {
        output.writeBool(2, isHideProgress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHideProgress_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isHideProgress_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo other = (emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo) obj;

      if (getIsHideProgress()
          != other.getIsHideProgress()) return false;
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
      hash = (37 * hash) + IS_HIDE_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHideProgress());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo prototype) {
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
     * Name: MDOHOGEIKFA
     * </pre>
     *
     * Protobuf type {@code SceneGalleryFungusFighterCaptureInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryFungusFighterCaptureInfo)
        emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.internal_static_SceneGalleryFungusFighterCaptureInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.internal_static_SceneGalleryFungusFighterCaptureInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo.class, emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo.newBuilder()
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
        isHideProgress_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.internal_static_SceneGalleryFungusFighterCaptureInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo build() {
        emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo result = new emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo(this);
        result.isHideProgress_ = isHideProgress_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo.getDefaultInstance()) return this;
        if (other.getIsHideProgress() != false) {
          setIsHideProgress(other.getIsHideProgress());
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
        emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isHideProgress_ ;
      /**
       * <code>bool is_hide_progress = 2;</code>
       * @return The isHideProgress.
       */
      @java.lang.Override
      public boolean getIsHideProgress() {
        return isHideProgress_;
      }
      /**
       * <code>bool is_hide_progress = 2;</code>
       * @param value The isHideProgress to set.
       * @return This builder for chaining.
       */
      public Builder setIsHideProgress(boolean value) {
        
        isHideProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hide_progress = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHideProgress() {
        
        isHideProgress_ = false;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryFungusFighterCaptureInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryFungusFighterCaptureInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryFungusFighterCaptureInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryFungusFighterCaptureInfo>() {
      @java.lang.Override
      public SceneGalleryFungusFighterCaptureInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryFungusFighterCaptureInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryFungusFighterCaptureInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryFungusFighterCaptureInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryFungusFighterCaptureInfoOuterClass.SceneGalleryFungusFighterCaptureInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryFungusFighterCaptureInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryFungusFighterCaptureInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*SceneGalleryFungusFighterCaptureInfo.p" +
      "roto\"@\n$SceneGalleryFungusFighterCapture" +
      "Info\022\030\n\020is_hide_progress\030\002 \001(\010B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryFungusFighterCaptureInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryFungusFighterCaptureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryFungusFighterCaptureInfo_descriptor,
        new java.lang.String[] { "IsHideProgress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
