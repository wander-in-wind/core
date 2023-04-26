// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TreasureMapDetectorDataNotify.proto

package emu.grasscutter.net.proto;

public final class TreasureMapDetectorDataNotifyOuterClass {
  private TreasureMapDetectorDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TreasureMapDetectorDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TreasureMapDetectorDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.TreasureMapDetectorData data = 14;</code>
     * @return Whether the data field is set.
     */
    boolean hasData();
    /**
     * <code>.TreasureMapDetectorData data = 14;</code>
     * @return The data.
     */
    emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData getData();
    /**
     * <code>.TreasureMapDetectorData data = 14;</code>
     */
    emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorDataOrBuilder getDataOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4262
   * Name: KIJGGFINIBP
   * </pre>
   *
   * Protobuf type {@code TreasureMapDetectorDataNotify}
   */
  public static final class TreasureMapDetectorDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TreasureMapDetectorDataNotify)
      TreasureMapDetectorDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TreasureMapDetectorDataNotify.newBuilder() to construct.
    private TreasureMapDetectorDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TreasureMapDetectorDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TreasureMapDetectorDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TreasureMapDetectorDataNotify(
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
            case 114: {
              emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.Builder subBuilder = null;
              if (data_ != null) {
                subBuilder = data_.toBuilder();
              }
              data_ = input.readMessage(emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(data_);
                data_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.internal_static_TreasureMapDetectorDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.internal_static_TreasureMapDetectorDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify.class, emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify.Builder.class);
    }

    public static final int DATA_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData data_;
    /**
     * <code>.TreasureMapDetectorData data = 14;</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return data_ != null;
    }
    /**
     * <code>.TreasureMapDetectorData data = 14;</code>
     * @return The data.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData getData() {
      return data_ == null ? emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.getDefaultInstance() : data_;
    }
    /**
     * <code>.TreasureMapDetectorData data = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorDataOrBuilder getDataOrBuilder() {
      return getData();
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
      if (data_ != null) {
        output.writeMessage(14, getData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (data_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify other = (emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify) obj;

      if (hasData() != other.hasData()) return false;
      if (hasData()) {
        if (!getData()
            .equals(other.getData())) return false;
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
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify prototype) {
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
     * CmdId: 4262
     * Name: KIJGGFINIBP
     * </pre>
     *
     * Protobuf type {@code TreasureMapDetectorDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TreasureMapDetectorDataNotify)
        emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.internal_static_TreasureMapDetectorDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.internal_static_TreasureMapDetectorDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify.class, emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify.newBuilder()
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
        if (dataBuilder_ == null) {
          data_ = null;
        } else {
          data_ = null;
          dataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.internal_static_TreasureMapDetectorDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify build() {
        emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify buildPartial() {
        emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify result = new emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify(this);
        if (dataBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify other) {
        if (other == emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify.getDefaultInstance()) return this;
        if (other.hasData()) {
          mergeData(other.getData());
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
        emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData data_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData, emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.Builder, emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorDataOrBuilder> dataBuilder_;
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       * @return Whether the data field is set.
       */
      public boolean hasData() {
        return dataBuilder_ != null || data_ != null;
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       * @return The data.
       */
      public emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData getData() {
        if (dataBuilder_ == null) {
          return data_ == null ? emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.getDefaultInstance() : data_;
        } else {
          return dataBuilder_.getMessage();
        }
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       */
      public Builder setData(emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          data_ = value;
          onChanged();
        } else {
          dataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       */
      public Builder setData(
          emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.Builder builderForValue) {
        if (dataBuilder_ == null) {
          data_ = builderForValue.build();
          onChanged();
        } else {
          dataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       */
      public Builder mergeData(emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData value) {
        if (dataBuilder_ == null) {
          if (data_ != null) {
            data_ =
              emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.newBuilder(data_).mergeFrom(value).buildPartial();
          } else {
            data_ = value;
          }
          onChanged();
        } else {
          dataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = null;
          onChanged();
        } else {
          data_ = null;
          dataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       */
      public emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.Builder getDataBuilder() {
        
        onChanged();
        return getDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       */
      public emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorDataOrBuilder getDataOrBuilder() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilder();
        } else {
          return data_ == null ?
              emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.getDefaultInstance() : data_;
        }
      }
      /**
       * <code>.TreasureMapDetectorData data = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData, emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.Builder, emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorDataOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData, emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorData.Builder, emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.TreasureMapDetectorDataOrBuilder>(
                  getData(),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TreasureMapDetectorDataNotify)
    }

    // @@protoc_insertion_point(class_scope:TreasureMapDetectorDataNotify)
    private static final emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify();
    }

    public static emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TreasureMapDetectorDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<TreasureMapDetectorDataNotify>() {
      @java.lang.Override
      public TreasureMapDetectorDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TreasureMapDetectorDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TreasureMapDetectorDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TreasureMapDetectorDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TreasureMapDetectorDataNotifyOuterClass.TreasureMapDetectorDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TreasureMapDetectorDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TreasureMapDetectorDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#TreasureMapDetectorDataNotify.proto\032\035T" +
      "reasureMapDetectorData.proto\"G\n\035Treasure" +
      "MapDetectorDataNotify\022&\n\004data\030\016 \001(\0132\030.Tr" +
      "easureMapDetectorDataB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.getDescriptor(),
        });
    internal_static_TreasureMapDetectorDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TreasureMapDetectorDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TreasureMapDetectorDataNotify_descriptor,
        new java.lang.String[] { "Data", });
    emu.grasscutter.net.proto.TreasureMapDetectorDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
