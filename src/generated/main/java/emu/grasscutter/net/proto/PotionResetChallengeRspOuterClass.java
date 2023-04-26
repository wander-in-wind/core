// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionResetChallengeRsp.proto

package emu.grasscutter.net.proto;

public final class PotionResetChallengeRspOuterClass {
  private PotionResetChallengeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionResetChallengeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionResetChallengeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PotionStageData stage_data = 13;</code>
     * @return Whether the stageData field is set.
     */
    boolean hasStageData();
    /**
     * <code>.PotionStageData stage_data = 13;</code>
     * @return The stageData.
     */
    emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData getStageData();
    /**
     * <code>.PotionStageData stage_data = 13;</code>
     */
    emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageDataOrBuilder();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8327
   * Name: NMKALJIDENA
   * </pre>
   *
   * Protobuf type {@code PotionResetChallengeRsp}
   */
  public static final class PotionResetChallengeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionResetChallengeRsp)
      PotionResetChallengeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionResetChallengeRsp.newBuilder() to construct.
    private PotionResetChallengeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionResetChallengeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionResetChallengeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PotionResetChallengeRsp(
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
            case 106: {
              emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder subBuilder = null;
              if (stageData_ != null) {
                subBuilder = stageData_.toBuilder();
              }
              stageData_ = input.readMessage(emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(stageData_);
                stageData_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.internal_static_PotionResetChallengeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.internal_static_PotionResetChallengeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp.class, emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp.Builder.class);
    }

    public static final int STAGE_DATA_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData stageData_;
    /**
     * <code>.PotionStageData stage_data = 13;</code>
     * @return Whether the stageData field is set.
     */
    @java.lang.Override
    public boolean hasStageData() {
      return stageData_ != null;
    }
    /**
     * <code>.PotionStageData stage_data = 13;</code>
     * @return The stageData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData getStageData() {
      return stageData_ == null ? emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.getDefaultInstance() : stageData_;
    }
    /**
     * <code>.PotionStageData stage_data = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageDataOrBuilder() {
      return getStageData();
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
      if (stageData_ != null) {
        output.writeMessage(13, getStageData());
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
      if (stageData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getStageData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp other = (emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp) obj;

      if (hasStageData() != other.hasStageData()) return false;
      if (hasStageData()) {
        if (!getStageData()
            .equals(other.getStageData())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasStageData()) {
        hash = (37 * hash) + STAGE_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getStageData().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp prototype) {
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
     * CmdId: 8327
     * Name: NMKALJIDENA
     * </pre>
     *
     * Protobuf type {@code PotionResetChallengeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionResetChallengeRsp)
        emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.internal_static_PotionResetChallengeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.internal_static_PotionResetChallengeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp.class, emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp.newBuilder()
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
        if (stageDataBuilder_ == null) {
          stageData_ = null;
        } else {
          stageData_ = null;
          stageDataBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.internal_static_PotionResetChallengeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp build() {
        emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp buildPartial() {
        emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp result = new emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp(this);
        if (stageDataBuilder_ == null) {
          result.stageData_ = stageData_;
        } else {
          result.stageData_ = stageDataBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp other) {
        if (other == emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp.getDefaultInstance()) return this;
        if (other.hasStageData()) {
          mergeStageData(other.getStageData());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData stageData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder> stageDataBuilder_;
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       * @return Whether the stageData field is set.
       */
      public boolean hasStageData() {
        return stageDataBuilder_ != null || stageData_ != null;
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       * @return The stageData.
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData getStageData() {
        if (stageDataBuilder_ == null) {
          return stageData_ == null ? emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.getDefaultInstance() : stageData_;
        } else {
          return stageDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       */
      public Builder setStageData(emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          stageData_ = value;
          onChanged();
        } else {
          stageDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       */
      public Builder setStageData(
          emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder builderForValue) {
        if (stageDataBuilder_ == null) {
          stageData_ = builderForValue.build();
          onChanged();
        } else {
          stageDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       */
      public Builder mergeStageData(emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageDataBuilder_ == null) {
          if (stageData_ != null) {
            stageData_ =
              emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.newBuilder(stageData_).mergeFrom(value).buildPartial();
          } else {
            stageData_ = value;
          }
          onChanged();
        } else {
          stageDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       */
      public Builder clearStageData() {
        if (stageDataBuilder_ == null) {
          stageData_ = null;
          onChanged();
        } else {
          stageData_ = null;
          stageDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder getStageDataBuilder() {
        
        onChanged();
        return getStageDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       */
      public emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageDataOrBuilder() {
        if (stageDataBuilder_ != null) {
          return stageDataBuilder_.getMessageOrBuilder();
        } else {
          return stageData_ == null ?
              emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.getDefaultInstance() : stageData_;
        }
      }
      /**
       * <code>.PotionStageData stage_data = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
          getStageDataFieldBuilder() {
        if (stageDataBuilder_ == null) {
          stageDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.proto.PotionStageDataOuterClass.PotionStageDataOrBuilder>(
                  getStageData(),
                  getParentForChildren(),
                  isClean());
          stageData_ = null;
        }
        return stageDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PotionResetChallengeRsp)
    }

    // @@protoc_insertion_point(class_scope:PotionResetChallengeRsp)
    private static final emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp();
    }

    public static emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionResetChallengeRsp>
        PARSER = new com.google.protobuf.AbstractParser<PotionResetChallengeRsp>() {
      @java.lang.Override
      public PotionResetChallengeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PotionResetChallengeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PotionResetChallengeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionResetChallengeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PotionResetChallengeRspOuterClass.PotionResetChallengeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionResetChallengeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionResetChallengeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PotionResetChallengeRsp.proto\032\025PotionS" +
      "tageData.proto\"P\n\027PotionResetChallengeRs" +
      "p\022$\n\nstage_data\030\r \001(\0132\020.PotionStageData\022" +
      "\017\n\007retcode\030\005 \001(\005B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PotionStageDataOuterClass.getDescriptor(),
        });
    internal_static_PotionResetChallengeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionResetChallengeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionResetChallengeRsp_descriptor,
        new java.lang.String[] { "StageData", "Retcode", });
    emu.grasscutter.net.proto.PotionStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
