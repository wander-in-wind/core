// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeV2BoatGallerySettleInfo.proto

package emu.grasscutter.net.proto;

public final class SummerTimeV2BoatGallerySettleInfoOuterClass {
  private SummerTimeV2BoatGallerySettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeV2BoatGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeV2BoatGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 used_time = 3;</code>
     * @return The usedTime.
     */
    int getUsedTime();

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.HDDANIDHCMI reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.HDDANIDHCMI reason = 5;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI getReason();

    /**
     * <code>uint32 param2 = 9;</code>
     * @return The param2.
     */
    int getParam2();

    /**
     * <code>uint32 param3 = 10;</code>
     * @return The param3.
     */
    int getParam3();

    /**
     * <code>uint32 param1 = 2;</code>
     * @return The param1.
     */
    int getParam1();
  }
  /**
   * <pre>
   * Obf: JFOAKAHBIHD
   * </pre>
   *
   * Protobuf type {@code SummerTimeV2BoatGallerySettleInfo}
   */
  public static final class SummerTimeV2BoatGallerySettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeV2BoatGallerySettleInfo)
      SummerTimeV2BoatGallerySettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeV2BoatGallerySettleInfo.newBuilder() to construct.
    private SummerTimeV2BoatGallerySettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeV2BoatGallerySettleInfo() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeV2BoatGallerySettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeV2BoatGallerySettleInfo(
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

              param1_ = input.readUInt32();
              break;
            }
            case 24: {

              usedTime_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 72: {

              param2_ = input.readUInt32();
              break;
            }
            case 80: {

              param3_ = input.readUInt32();
              break;
            }
            case 88: {

              galleryId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.internal_static_SummerTimeV2BoatGallerySettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.internal_static_SummerTimeV2BoatGallerySettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.class, emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder.class);
    }

    public static final int USED_TIME_FIELD_NUMBER = 3;
    private int usedTime_;
    /**
     * <code>uint32 used_time = 3;</code>
     * @return The usedTime.
     */
    @java.lang.Override
    public int getUsedTime() {
      return usedTime_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 11;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>.HDDANIDHCMI reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.HDDANIDHCMI reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI result = emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI.UNRECOGNIZED : result;
    }

    public static final int PARAM2_FIELD_NUMBER = 9;
    private int param2_;
    /**
     * <code>uint32 param2 = 9;</code>
     * @return The param2.
     */
    @java.lang.Override
    public int getParam2() {
      return param2_;
    }

    public static final int PARAM3_FIELD_NUMBER = 10;
    private int param3_;
    /**
     * <code>uint32 param3 = 10;</code>
     * @return The param3.
     */
    @java.lang.Override
    public int getParam3() {
      return param3_;
    }

    public static final int PARAM1_FIELD_NUMBER = 2;
    private int param1_;
    /**
     * <code>uint32 param1 = 2;</code>
     * @return The param1.
     */
    @java.lang.Override
    public int getParam1() {
      return param1_;
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
      if (param1_ != 0) {
        output.writeUInt32(2, param1_);
      }
      if (usedTime_ != 0) {
        output.writeUInt32(3, usedTime_);
      }
      if (reason_ != emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI.HDDANIDHCMI_GalleryStopNone.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (param2_ != 0) {
        output.writeUInt32(9, param2_);
      }
      if (param3_ != 0) {
        output.writeUInt32(10, param3_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param1_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, param1_);
      }
      if (usedTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, usedTime_);
      }
      if (reason_ != emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI.HDDANIDHCMI_GalleryStopNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (param2_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, param2_);
      }
      if (param3_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, param3_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo other = (emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo) obj;

      if (getUsedTime()
          != other.getUsedTime()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (reason_ != other.reason_) return false;
      if (getParam2()
          != other.getParam2()) return false;
      if (getParam3()
          != other.getParam3()) return false;
      if (getParam1()
          != other.getParam1()) return false;
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
      hash = (37 * hash) + USED_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUsedTime();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + PARAM2_FIELD_NUMBER;
      hash = (53 * hash) + getParam2();
      hash = (37 * hash) + PARAM3_FIELD_NUMBER;
      hash = (53 * hash) + getParam3();
      hash = (37 * hash) + PARAM1_FIELD_NUMBER;
      hash = (53 * hash) + getParam1();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo prototype) {
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
     * Obf: JFOAKAHBIHD
     * </pre>
     *
     * Protobuf type {@code SummerTimeV2BoatGallerySettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeV2BoatGallerySettleInfo)
        emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.internal_static_SummerTimeV2BoatGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.internal_static_SummerTimeV2BoatGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.class, emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.newBuilder()
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
        usedTime_ = 0;

        galleryId_ = 0;

        reason_ = 0;

        param2_ = 0;

        param3_ = 0;

        param1_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.internal_static_SummerTimeV2BoatGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo build() {
        emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo buildPartial() {
        emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo result = new emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo(this);
        result.usedTime_ = usedTime_;
        result.galleryId_ = galleryId_;
        result.reason_ = reason_;
        result.param2_ = param2_;
        result.param3_ = param3_;
        result.param1_ = param1_;
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
        if (other instanceof emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo other) {
        if (other == emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo.getDefaultInstance()) return this;
        if (other.getUsedTime() != 0) {
          setUsedTime(other.getUsedTime());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getParam2() != 0) {
          setParam2(other.getParam2());
        }
        if (other.getParam3() != 0) {
          setParam3(other.getParam3());
        }
        if (other.getParam1() != 0) {
          setParam1(other.getParam1());
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
        emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int usedTime_ ;
      /**
       * <code>uint32 used_time = 3;</code>
       * @return The usedTime.
       */
      @java.lang.Override
      public int getUsedTime() {
        return usedTime_;
      }
      /**
       * <code>uint32 used_time = 3;</code>
       * @param value The usedTime to set.
       * @return This builder for chaining.
       */
      public Builder setUsedTime(int value) {
        
        usedTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 used_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsedTime() {
        
        usedTime_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.HDDANIDHCMI reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.HDDANIDHCMI reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.HDDANIDHCMI reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI result = emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI.UNRECOGNIZED : result;
      }
      /**
       * <code>.HDDANIDHCMI reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.HDDANIDHCMI value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.HDDANIDHCMI reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int param2_ ;
      /**
       * <code>uint32 param2 = 9;</code>
       * @return The param2.
       */
      @java.lang.Override
      public int getParam2() {
        return param2_;
      }
      /**
       * <code>uint32 param2 = 9;</code>
       * @param value The param2 to set.
       * @return This builder for chaining.
       */
      public Builder setParam2(int value) {
        
        param2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param2 = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam2() {
        
        param2_ = 0;
        onChanged();
        return this;
      }

      private int param3_ ;
      /**
       * <code>uint32 param3 = 10;</code>
       * @return The param3.
       */
      @java.lang.Override
      public int getParam3() {
        return param3_;
      }
      /**
       * <code>uint32 param3 = 10;</code>
       * @param value The param3 to set.
       * @return This builder for chaining.
       */
      public Builder setParam3(int value) {
        
        param3_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param3 = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam3() {
        
        param3_ = 0;
        onChanged();
        return this;
      }

      private int param1_ ;
      /**
       * <code>uint32 param1 = 2;</code>
       * @return The param1.
       */
      @java.lang.Override
      public int getParam1() {
        return param1_;
      }
      /**
       * <code>uint32 param1 = 2;</code>
       * @param value The param1 to set.
       * @return This builder for chaining.
       */
      public Builder setParam1(int value) {
        
        param1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param1 = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam1() {
        
        param1_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeV2BoatGallerySettleInfo)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeV2BoatGallerySettleInfo)
    private static final emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo();
    }

    public static emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeV2BoatGallerySettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeV2BoatGallerySettleInfo>() {
      @java.lang.Override
      public SummerTimeV2BoatGallerySettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeV2BoatGallerySettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeV2BoatGallerySettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeV2BoatGallerySettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SummerTimeV2BoatGallerySettleInfoOuterClass.SummerTimeV2BoatGallerySettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeV2BoatGallerySettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeV2BoatGallerySettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SummerTimeV2BoatGallerySettleInfo.prot" +
      "o\032\021HDDANIDHCMI.proto\"\230\001\n!SummerTimeV2Boa" +
      "tGallerySettleInfo\022\021\n\tused_time\030\003 \001(\r\022\022\n" +
      "\ngallery_id\030\013 \001(\r\022\034\n\006reason\030\005 \001(\0162\014.HDDA" +
      "NIDHCMI\022\016\n\006param2\030\t \001(\r\022\016\n\006param3\030\n \001(\r\022" +
      "\016\n\006param1\030\002 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.getDescriptor(),
        });
    internal_static_SummerTimeV2BoatGallerySettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeV2BoatGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeV2BoatGallerySettleInfo_descriptor,
        new java.lang.String[] { "UsedTime", "GalleryId", "Reason", "Param2", "Param3", "Param1", });
    emu.grasscutter.net.proto.HDDANIDHCMIOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
