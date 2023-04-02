// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InstableSprayDetailInfo.proto

package emu.grasscutter.net.proto;

public final class InstableSprayDetailInfoOuterClass {
  private InstableSprayDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstableSprayDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InstableSprayDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo> 
        getStageInfoListList();
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo getStageInfoList(int index);
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    int getStageInfoListCount();
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder> 
        getStageInfoListOrBuilderList();
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder getStageInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: IDIGJCADDCJ
   * </pre>
   *
   * Protobuf type {@code InstableSprayDetailInfo}
   */
  public static final class InstableSprayDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InstableSprayDetailInfo)
      InstableSprayDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InstableSprayDetailInfo.newBuilder() to construct.
    private InstableSprayDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InstableSprayDetailInfo() {
      stageInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InstableSprayDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InstableSprayDetailInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                stageInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              stageInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.internal_static_InstableSprayDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.internal_static_InstableSprayDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo.class, emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo.Builder.class);
    }

    public static final int STAGE_INFO_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo> stageInfoList_;
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo> getStageInfoListList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder> 
        getStageInfoListOrBuilderList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public int getStageInfoListCount() {
      return stageInfoList_.size();
    }
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo getStageInfoList(int index) {
      return stageInfoList_.get(index);
    }
    /**
     * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder getStageInfoListOrBuilder(
        int index) {
      return stageInfoList_.get(index);
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
      for (int i = 0; i < stageInfoList_.size(); i++) {
        output.writeMessage(14, stageInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, stageInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo other = (emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo) obj;

      if (!getStageInfoListList()
          .equals(other.getStageInfoListList())) return false;
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
      if (getStageInfoListCount() > 0) {
        hash = (37 * hash) + STAGE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo prototype) {
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
     * Name: IDIGJCADDCJ
     * </pre>
     *
     * Protobuf type {@code InstableSprayDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InstableSprayDetailInfo)
        emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.internal_static_InstableSprayDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.internal_static_InstableSprayDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo.class, emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo.newBuilder()
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
          getStageInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          stageInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.internal_static_InstableSprayDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo build() {
        emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo buildPartial() {
        emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo result = new emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (stageInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageInfoList_ = stageInfoList_;
        } else {
          result.stageInfoList_ = stageInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo other) {
        if (other == emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo.getDefaultInstance()) return this;
        if (stageInfoListBuilder_ == null) {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoList_.isEmpty()) {
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageInfoListIsMutable();
              stageInfoList_.addAll(other.stageInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoListBuilder_.isEmpty()) {
              stageInfoListBuilder_.dispose();
              stageInfoListBuilder_ = null;
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageInfoListFieldBuilder() : null;
            } else {
              stageInfoListBuilder_.addAllMessages(other.stageInfoList_);
            }
          }
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
        emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo> stageInfoList_ =
        java.util.Collections.emptyList();
      private void ensureStageInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo>(stageInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder> stageInfoListBuilder_;

      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo> getStageInfoListList() {
        if (stageInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        } else {
          return stageInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public int getStageInfoListCount() {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.size();
        } else {
          return stageInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo getStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);
        } else {
          return stageInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder setStageInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder setStageInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(
          emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(
          int index, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder addAllStageInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo> values) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageInfoList_);
          onChanged();
        } else {
          stageInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder clearStageInfoList() {
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public Builder removeStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.remove(index);
          onChanged();
        } else {
          stageInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder getStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder getStageInfoListOrBuilder(
          int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);  } else {
          return stageInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder> 
           getStageInfoListOrBuilderList() {
        if (stageInfoListBuilder_ != null) {
          return stageInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        }
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder addStageInfoListBuilder() {
        return getStageInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder addStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayStageInfo stage_info_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder> 
           getStageInfoListBuilderList() {
        return getStageInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder> 
          getStageInfoListFieldBuilder() {
        if (stageInfoListBuilder_ == null) {
          stageInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfo.Builder, emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.InstableSprayStageInfoOrBuilder>(
                  stageInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageInfoList_ = null;
        }
        return stageInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:InstableSprayDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:InstableSprayDetailInfo)
    private static final emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo();
    }

    public static emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InstableSprayDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<InstableSprayDetailInfo>() {
      @java.lang.Override
      public InstableSprayDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InstableSprayDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InstableSprayDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstableSprayDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayDetailInfoOuterClass.InstableSprayDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstableSprayDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstableSprayDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035InstableSprayDetailInfo.proto\032\034Instabl" +
      "eSprayStageInfo.proto\"K\n\027InstableSprayDe" +
      "tailInfo\0220\n\017stage_info_list\030\016 \003(\0132\027.Inst" +
      "ableSprayStageInfoB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.getDescriptor(),
        });
    internal_static_InstableSprayDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InstableSprayDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstableSprayDetailInfo_descriptor,
        new java.lang.String[] { "StageInfoList", });
    emu.grasscutter.net.proto.InstableSprayStageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
