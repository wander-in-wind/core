// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlantFlowerAcceptGiveFlowerRsp.proto

package emu.grasscutter.net.proto;

public final class PlantFlowerAcceptGiveFlowerRspOuterClass {
  private PlantFlowerAcceptGiveFlowerRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlantFlowerAcceptGiveFlowerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlantFlowerAcceptGiveFlowerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 schedule_id = 6;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
     * @return Whether the acceptFlowerResultInfo field is set.
     */
    boolean hasAcceptFlowerResultInfo();
    /**
     * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
     * @return The acceptFlowerResultInfo.
     */
    emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo getAcceptFlowerResultInfo();
    /**
     * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
     */
    emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfoOrBuilder getAcceptFlowerResultInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8614
   * Name: KJHIAFBFDDO
   * </pre>
   *
   * Protobuf type {@code PlantFlowerAcceptGiveFlowerRsp}
   */
  public static final class PlantFlowerAcceptGiveFlowerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlantFlowerAcceptGiveFlowerRsp)
      PlantFlowerAcceptGiveFlowerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlantFlowerAcceptGiveFlowerRsp.newBuilder() to construct.
    private PlantFlowerAcceptGiveFlowerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlantFlowerAcceptGiveFlowerRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlantFlowerAcceptGiveFlowerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlantFlowerAcceptGiveFlowerRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 66: {
              emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.Builder subBuilder = null;
              if (acceptFlowerResultInfo_ != null) {
                subBuilder = acceptFlowerResultInfo_.toBuilder();
              }
              acceptFlowerResultInfo_ = input.readMessage(emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(acceptFlowerResultInfo_);
                acceptFlowerResultInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.internal_static_PlantFlowerAcceptGiveFlowerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.internal_static_PlantFlowerAcceptGiveFlowerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp.class, emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 6;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 6;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int ACCEPT_FLOWER_RESULT_INFO_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo acceptFlowerResultInfo_;
    /**
     * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
     * @return Whether the acceptFlowerResultInfo field is set.
     */
    @java.lang.Override
    public boolean hasAcceptFlowerResultInfo() {
      return acceptFlowerResultInfo_ != null;
    }
    /**
     * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
     * @return The acceptFlowerResultInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo getAcceptFlowerResultInfo() {
      return acceptFlowerResultInfo_ == null ? emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.getDefaultInstance() : acceptFlowerResultInfo_;
    }
    /**
     * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfoOrBuilder getAcceptFlowerResultInfoOrBuilder() {
      return getAcceptFlowerResultInfo();
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(6, scheduleId_);
      }
      if (acceptFlowerResultInfo_ != null) {
        output.writeMessage(8, getAcceptFlowerResultInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, scheduleId_);
      }
      if (acceptFlowerResultInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getAcceptFlowerResultInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp other = (emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (hasAcceptFlowerResultInfo() != other.hasAcceptFlowerResultInfo()) return false;
      if (hasAcceptFlowerResultInfo()) {
        if (!getAcceptFlowerResultInfo()
            .equals(other.getAcceptFlowerResultInfo())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      if (hasAcceptFlowerResultInfo()) {
        hash = (37 * hash) + ACCEPT_FLOWER_RESULT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAcceptFlowerResultInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp prototype) {
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
     * CmdId: 8614
     * Name: KJHIAFBFDDO
     * </pre>
     *
     * Protobuf type {@code PlantFlowerAcceptGiveFlowerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlantFlowerAcceptGiveFlowerRsp)
        emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.internal_static_PlantFlowerAcceptGiveFlowerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.internal_static_PlantFlowerAcceptGiveFlowerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp.class, emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp.newBuilder()
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
        retcode_ = 0;

        scheduleId_ = 0;

        if (acceptFlowerResultInfoBuilder_ == null) {
          acceptFlowerResultInfo_ = null;
        } else {
          acceptFlowerResultInfo_ = null;
          acceptFlowerResultInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.internal_static_PlantFlowerAcceptGiveFlowerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp build() {
        emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp buildPartial() {
        emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp result = new emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp(this);
        result.retcode_ = retcode_;
        result.scheduleId_ = scheduleId_;
        if (acceptFlowerResultInfoBuilder_ == null) {
          result.acceptFlowerResultInfo_ = acceptFlowerResultInfo_;
        } else {
          result.acceptFlowerResultInfo_ = acceptFlowerResultInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp other) {
        if (other == emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.hasAcceptFlowerResultInfo()) {
          mergeAcceptFlowerResultInfo(other.getAcceptFlowerResultInfo());
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
        emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 6;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 6;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo acceptFlowerResultInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo, emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.Builder, emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfoOrBuilder> acceptFlowerResultInfoBuilder_;
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       * @return Whether the acceptFlowerResultInfo field is set.
       */
      public boolean hasAcceptFlowerResultInfo() {
        return acceptFlowerResultInfoBuilder_ != null || acceptFlowerResultInfo_ != null;
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       * @return The acceptFlowerResultInfo.
       */
      public emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo getAcceptFlowerResultInfo() {
        if (acceptFlowerResultInfoBuilder_ == null) {
          return acceptFlowerResultInfo_ == null ? emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.getDefaultInstance() : acceptFlowerResultInfo_;
        } else {
          return acceptFlowerResultInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       */
      public Builder setAcceptFlowerResultInfo(emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo value) {
        if (acceptFlowerResultInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          acceptFlowerResultInfo_ = value;
          onChanged();
        } else {
          acceptFlowerResultInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       */
      public Builder setAcceptFlowerResultInfo(
          emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.Builder builderForValue) {
        if (acceptFlowerResultInfoBuilder_ == null) {
          acceptFlowerResultInfo_ = builderForValue.build();
          onChanged();
        } else {
          acceptFlowerResultInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       */
      public Builder mergeAcceptFlowerResultInfo(emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo value) {
        if (acceptFlowerResultInfoBuilder_ == null) {
          if (acceptFlowerResultInfo_ != null) {
            acceptFlowerResultInfo_ =
              emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.newBuilder(acceptFlowerResultInfo_).mergeFrom(value).buildPartial();
          } else {
            acceptFlowerResultInfo_ = value;
          }
          onChanged();
        } else {
          acceptFlowerResultInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       */
      public Builder clearAcceptFlowerResultInfo() {
        if (acceptFlowerResultInfoBuilder_ == null) {
          acceptFlowerResultInfo_ = null;
          onChanged();
        } else {
          acceptFlowerResultInfo_ = null;
          acceptFlowerResultInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       */
      public emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.Builder getAcceptFlowerResultInfoBuilder() {
        
        onChanged();
        return getAcceptFlowerResultInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       */
      public emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfoOrBuilder getAcceptFlowerResultInfoOrBuilder() {
        if (acceptFlowerResultInfoBuilder_ != null) {
          return acceptFlowerResultInfoBuilder_.getMessageOrBuilder();
        } else {
          return acceptFlowerResultInfo_ == null ?
              emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.getDefaultInstance() : acceptFlowerResultInfo_;
        }
      }
      /**
       * <code>.PlantFlowerAcceptFlowerResultInfo accept_flower_result_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo, emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.Builder, emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfoOrBuilder> 
          getAcceptFlowerResultInfoFieldBuilder() {
        if (acceptFlowerResultInfoBuilder_ == null) {
          acceptFlowerResultInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo, emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfo.Builder, emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.PlantFlowerAcceptFlowerResultInfoOrBuilder>(
                  getAcceptFlowerResultInfo(),
                  getParentForChildren(),
                  isClean());
          acceptFlowerResultInfo_ = null;
        }
        return acceptFlowerResultInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlantFlowerAcceptGiveFlowerRsp)
    }

    // @@protoc_insertion_point(class_scope:PlantFlowerAcceptGiveFlowerRsp)
    private static final emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp();
    }

    public static emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlantFlowerAcceptGiveFlowerRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlantFlowerAcceptGiveFlowerRsp>() {
      @java.lang.Override
      public PlantFlowerAcceptGiveFlowerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlantFlowerAcceptGiveFlowerRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlantFlowerAcceptGiveFlowerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlantFlowerAcceptGiveFlowerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlantFlowerAcceptGiveFlowerRspOuterClass.PlantFlowerAcceptGiveFlowerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlantFlowerAcceptGiveFlowerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlantFlowerAcceptGiveFlowerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$PlantFlowerAcceptGiveFlowerRsp.proto\032\'" +
      "PlantFlowerAcceptFlowerResultInfo.proto\"" +
      "\215\001\n\036PlantFlowerAcceptGiveFlowerRsp\022\017\n\007re" +
      "tcode\030\005 \001(\005\022\023\n\013schedule_id\030\006 \001(\r\022E\n\031acce" +
      "pt_flower_result_info\030\010 \001(\0132\".PlantFlowe" +
      "rAcceptFlowerResultInfoB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.getDescriptor(),
        });
    internal_static_PlantFlowerAcceptGiveFlowerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlantFlowerAcceptGiveFlowerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlantFlowerAcceptGiveFlowerRsp_descriptor,
        new java.lang.String[] { "Retcode", "ScheduleId", "AcceptFlowerResultInfo", });
    emu.grasscutter.net.proto.PlantFlowerAcceptFlowerResultInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
