// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalvageEscortSettleInfo.proto

package emu.grasscutter.net.proto;

public final class SalvageEscortSettleInfoOuterClass {
  private SalvageEscortSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalvageEscortSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalvageEscortSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo getSettleInfo();
    /**
     * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
     */
    emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfoOrBuilder getSettleInfoOrBuilder();
  }
  /**
   * <pre>
   * Obf: CCFLBANIHHO
   * </pre>
   *
   * Protobuf type {@code SalvageEscortSettleInfo}
   */
  public static final class SalvageEscortSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalvageEscortSettleInfo)
      SalvageEscortSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalvageEscortSettleInfo.newBuilder() to construct.
    private SalvageEscortSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalvageEscortSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalvageEscortSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SalvageEscortSettleInfo(
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
            case 82: {
              emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.Builder subBuilder = null;
              if (settleInfo_ != null) {
                subBuilder = settleInfo_.toBuilder();
              }
              settleInfo_ = input.readMessage(emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(settleInfo_);
                settleInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              isNewRecord_ = input.readBool();
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
      return emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.internal_static_SalvageEscortSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.internal_static_SalvageEscortSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.class, emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.Builder.class);
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 15;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo settleInfo_;
    /**
     * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
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
      if (settleInfo_ != null) {
        output.writeMessage(10, getSettleInfo());
      }
      if (isNewRecord_ != false) {
        output.writeBool(15, isNewRecord_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getSettleInfo());
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isNewRecord_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo other = (emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
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
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo prototype) {
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
     * Obf: CCFLBANIHHO
     * </pre>
     *
     * Protobuf type {@code SalvageEscortSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalvageEscortSettleInfo)
        emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.internal_static_SalvageEscortSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.internal_static_SalvageEscortSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.class, emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.newBuilder()
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
        isNewRecord_ = false;

        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.internal_static_SalvageEscortSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo build() {
        emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo buildPartial() {
        emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo result = new emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo(this);
        result.isNewRecord_ = isNewRecord_;
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo other) {
        if (other == emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
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
        emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 15;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo, emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.Builder, emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       * @return The settleInfo.
       */
      public emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
          } else {
            settleInfo_ = value;
          }
          onChanged();
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
          onChanged();
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       */
      public emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       */
      public emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.SalvageEscortGallerySettleInfo settle_info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo, emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.Builder, emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo, emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfo.Builder, emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.SalvageEscortGallerySettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SalvageEscortSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:SalvageEscortSettleInfo)
    private static final emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo();
    }

    public static emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalvageEscortSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<SalvageEscortSettleInfo>() {
      @java.lang.Override
      public SalvageEscortSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SalvageEscortSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SalvageEscortSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalvageEscortSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalvageEscortSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalvageEscortSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SalvageEscortSettleInfo.proto\032$Salvage" +
      "EscortGallerySettleInfo.proto\"f\n\027Salvage" +
      "EscortSettleInfo\022\025\n\ris_new_record\030\017 \001(\010\022" +
      "4\n\013settle_info\030\n \001(\0132\037.SalvageEscortGall" +
      "erySettleInfoB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.getDescriptor(),
        });
    internal_static_SalvageEscortSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalvageEscortSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalvageEscortSettleInfo_descriptor,
        new java.lang.String[] { "IsNewRecord", "SettleInfo", });
    emu.grasscutter.net.proto.SalvageEscortGallerySettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
