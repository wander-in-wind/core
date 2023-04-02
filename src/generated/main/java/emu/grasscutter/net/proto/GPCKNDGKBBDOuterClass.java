// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GPCKNDGKBBD.proto

package emu.grasscutter.net.proto;

public final class GPCKNDGKBBDOuterClass {
  private GPCKNDGKBBDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GPCKNDGKBBDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GPCKNDGKBBD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 begin_time = 8;</code>
     * @return The beginTime.
     */
    long getBeginTime();

    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>uint64 time_stamp = 9;</code>
     * @return The timeStamp.
     */
    long getTimeStamp();
  }
  /**
   * <pre>
   * Name: GPCKNDGKBBD
   * </pre>
   *
   * Protobuf type {@code GPCKNDGKBBD}
   */
  public static final class GPCKNDGKBBD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GPCKNDGKBBD)
      GPCKNDGKBBDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GPCKNDGKBBD.newBuilder() to construct.
    private GPCKNDGKBBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GPCKNDGKBBD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GPCKNDGKBBD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GPCKNDGKBBD(
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
            case 64: {

              beginTime_ = input.readUInt64();
              break;
            }
            case 72: {

              timeStamp_ = input.readUInt64();
              break;
            }
            case 112: {

              controllerId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.internal_static_GPCKNDGKBBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.internal_static_GPCKNDGKBBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD.class, emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD.Builder.class);
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 8;
    private long beginTime_;
    /**
     * <code>uint64 begin_time = 8;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public long getBeginTime() {
      return beginTime_;
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 14;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int TIME_STAMP_FIELD_NUMBER = 9;
    private long timeStamp_;
    /**
     * <code>uint64 time_stamp = 9;</code>
     * @return The timeStamp.
     */
    @java.lang.Override
    public long getTimeStamp() {
      return timeStamp_;
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
      if (beginTime_ != 0L) {
        output.writeUInt64(8, beginTime_);
      }
      if (timeStamp_ != 0L) {
        output.writeUInt64(9, timeStamp_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(14, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (beginTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, beginTime_);
      }
      if (timeStamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, timeStamp_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, controllerId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD other = (emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD) obj;

      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (getTimeStamp()
          != other.getTimeStamp()) return false;
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
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBeginTime());
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + TIME_STAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeStamp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD prototype) {
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
     * Name: GPCKNDGKBBD
     * </pre>
     *
     * Protobuf type {@code GPCKNDGKBBD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GPCKNDGKBBD)
        emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.internal_static_GPCKNDGKBBD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.internal_static_GPCKNDGKBBD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD.class, emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD.newBuilder()
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
        beginTime_ = 0L;

        controllerId_ = 0;

        timeStamp_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.internal_static_GPCKNDGKBBD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD build() {
        emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD buildPartial() {
        emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD result = new emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD(this);
        result.beginTime_ = beginTime_;
        result.controllerId_ = controllerId_;
        result.timeStamp_ = timeStamp_;
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
        if (other instanceof emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD) {
          return mergeFrom((emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD other) {
        if (other == emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD.getDefaultInstance()) return this;
        if (other.getBeginTime() != 0L) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getTimeStamp() != 0L) {
          setTimeStamp(other.getTimeStamp());
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
        emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long beginTime_ ;
      /**
       * <code>uint64 begin_time = 8;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public long getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint64 begin_time = 8;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(long value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 begin_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0L;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private long timeStamp_ ;
      /**
       * <code>uint64 time_stamp = 9;</code>
       * @return The timeStamp.
       */
      @java.lang.Override
      public long getTimeStamp() {
        return timeStamp_;
      }
      /**
       * <code>uint64 time_stamp = 9;</code>
       * @param value The timeStamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimeStamp(long value) {
        
        timeStamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 time_stamp = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeStamp() {
        
        timeStamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:GPCKNDGKBBD)
    }

    // @@protoc_insertion_point(class_scope:GPCKNDGKBBD)
    private static final emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD();
    }

    public static emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GPCKNDGKBBD>
        PARSER = new com.google.protobuf.AbstractParser<GPCKNDGKBBD>() {
      @java.lang.Override
      public GPCKNDGKBBD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GPCKNDGKBBD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GPCKNDGKBBD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GPCKNDGKBBD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GPCKNDGKBBDOuterClass.GPCKNDGKBBD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GPCKNDGKBBD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GPCKNDGKBBD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GPCKNDGKBBD.proto\"L\n\013GPCKNDGKBBD\022\022\n\nbe" +
      "gin_time\030\010 \001(\004\022\025\n\rcontroller_id\030\016 \001(\r\022\022\n" +
      "\ntime_stamp\030\t \001(\004B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GPCKNDGKBBD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GPCKNDGKBBD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GPCKNDGKBBD_descriptor,
        new java.lang.String[] { "BeginTime", "ControllerId", "TimeStamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
