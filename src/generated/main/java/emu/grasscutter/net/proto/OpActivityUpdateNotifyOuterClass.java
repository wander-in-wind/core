// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpActivityUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class OpActivityUpdateNotifyOuterClass {
  private OpActivityUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpActivityUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpActivityUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.OpActivityInfo op_activity_info = 6;</code>
     * @return Whether the opActivityInfo field is set.
     */
    boolean hasOpActivityInfo();
    /**
     * <code>.OpActivityInfo op_activity_info = 6;</code>
     * @return The opActivityInfo.
     */
    emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfo();
    /**
     * <code>.OpActivityInfo op_activity_info = 6;</code>
     */
    emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5135
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code OpActivityUpdateNotify}
   */
  public static final class OpActivityUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpActivityUpdateNotify)
      OpActivityUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpActivityUpdateNotify.newBuilder() to construct.
    private OpActivityUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpActivityUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpActivityUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpActivityUpdateNotify(
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
            case 50: {
              emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder subBuilder = null;
              if (opActivityInfo_ != null) {
                subBuilder = opActivityInfo_.toBuilder();
              }
              opActivityInfo_ = input.readMessage(emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(opActivityInfo_);
                opActivityInfo_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.internal_static_OpActivityUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.internal_static_OpActivityUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify.class, emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify.Builder.class);
    }

    public static final int OP_ACTIVITY_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo opActivityInfo_;
    /**
     * <code>.OpActivityInfo op_activity_info = 6;</code>
     * @return Whether the opActivityInfo field is set.
     */
    @java.lang.Override
    public boolean hasOpActivityInfo() {
      return opActivityInfo_ != null;
    }
    /**
     * <code>.OpActivityInfo op_activity_info = 6;</code>
     * @return The opActivityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfo() {
      return opActivityInfo_ == null ? emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance() : opActivityInfo_;
    }
    /**
     * <code>.OpActivityInfo op_activity_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoOrBuilder() {
      return getOpActivityInfo();
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
      if (opActivityInfo_ != null) {
        output.writeMessage(6, getOpActivityInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (opActivityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getOpActivityInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify other = (emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify) obj;

      if (hasOpActivityInfo() != other.hasOpActivityInfo()) return false;
      if (hasOpActivityInfo()) {
        if (!getOpActivityInfo()
            .equals(other.getOpActivityInfo())) return false;
      }
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
      if (hasOpActivityInfo()) {
        hash = (37 * hash) + OP_ACTIVITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getOpActivityInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify prototype) {
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
     * CmdId: 5135
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code OpActivityUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpActivityUpdateNotify)
        emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.internal_static_OpActivityUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.internal_static_OpActivityUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify.class, emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify.newBuilder()
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
        if (opActivityInfoBuilder_ == null) {
          opActivityInfo_ = null;
        } else {
          opActivityInfo_ = null;
          opActivityInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.internal_static_OpActivityUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify build() {
        emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify result = new emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify(this);
        if (opActivityInfoBuilder_ == null) {
          result.opActivityInfo_ = opActivityInfo_;
        } else {
          result.opActivityInfo_ = opActivityInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify.getDefaultInstance()) return this;
        if (other.hasOpActivityInfo()) {
          mergeOpActivityInfo(other.getOpActivityInfo());
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
        emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo opActivityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> opActivityInfoBuilder_;
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       * @return Whether the opActivityInfo field is set.
       */
      public boolean hasOpActivityInfo() {
        return opActivityInfoBuilder_ != null || opActivityInfo_ != null;
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       * @return The opActivityInfo.
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfo() {
        if (opActivityInfoBuilder_ == null) {
          return opActivityInfo_ == null ? emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance() : opActivityInfo_;
        } else {
          return opActivityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       */
      public Builder setOpActivityInfo(emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          opActivityInfo_ = value;
          onChanged();
        } else {
          opActivityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       */
      public Builder setOpActivityInfo(
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder builderForValue) {
        if (opActivityInfoBuilder_ == null) {
          opActivityInfo_ = builderForValue.build();
          onChanged();
        } else {
          opActivityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       */
      public Builder mergeOpActivityInfo(emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoBuilder_ == null) {
          if (opActivityInfo_ != null) {
            opActivityInfo_ =
              emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.newBuilder(opActivityInfo_).mergeFrom(value).buildPartial();
          } else {
            opActivityInfo_ = value;
          }
          onChanged();
        } else {
          opActivityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       */
      public Builder clearOpActivityInfo() {
        if (opActivityInfoBuilder_ == null) {
          opActivityInfo_ = null;
          onChanged();
        } else {
          opActivityInfo_ = null;
          opActivityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder getOpActivityInfoBuilder() {
        
        onChanged();
        return getOpActivityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       */
      public emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoOrBuilder() {
        if (opActivityInfoBuilder_ != null) {
          return opActivityInfoBuilder_.getMessageOrBuilder();
        } else {
          return opActivityInfo_ == null ?
              emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance() : opActivityInfo_;
        }
      }
      /**
       * <code>.OpActivityInfo op_activity_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
          getOpActivityInfoFieldBuilder() {
        if (opActivityInfoBuilder_ == null) {
          opActivityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.proto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder>(
                  getOpActivityInfo(),
                  getParentForChildren(),
                  isClean());
          opActivityInfo_ = null;
        }
        return opActivityInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:OpActivityUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:OpActivityUpdateNotify)
    private static final emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify();
    }

    public static emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpActivityUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<OpActivityUpdateNotify>() {
      @java.lang.Override
      public OpActivityUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpActivityUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OpActivityUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpActivityUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OpActivityUpdateNotifyOuterClass.OpActivityUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpActivityUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpActivityUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034OpActivityUpdateNotify.proto\032\024OpActivi" +
      "tyInfo.proto\"C\n\026OpActivityUpdateNotify\022)" +
      "\n\020op_activity_info\030\006 \001(\0132\017.OpActivityInf" +
      "oB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OpActivityInfoOuterClass.getDescriptor(),
        });
    internal_static_OpActivityUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpActivityUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpActivityUpdateNotify_descriptor,
        new java.lang.String[] { "OpActivityInfo", });
    emu.grasscutter.net.proto.OpActivityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
