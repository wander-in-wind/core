// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeCustomFurnitureInfo.proto

package emu.grasscutter.net.proto;

public final class HomeCustomFurnitureInfoOuterClass {
  private HomeCustomFurnitureInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeCustomFurnitureInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeCustomFurnitureInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> 
        getSubFurnitureListList();
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getSubFurnitureList(int index);
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    int getSubFurnitureListCount();
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> 
        getSubFurnitureListOrBuilderList();
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getSubFurnitureListOrBuilder(
        int index);

    /**
     * <code>uint32 guid = 6;</code>
     * @return The guid.
     */
    int getGuid();
  }
  /**
   * Protobuf type {@code HomeCustomFurnitureInfo}
   */
  public static final class HomeCustomFurnitureInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeCustomFurnitureInfo)
      HomeCustomFurnitureInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeCustomFurnitureInfo.newBuilder() to construct.
    private HomeCustomFurnitureInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeCustomFurnitureInfo() {
      subFurnitureList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeCustomFurnitureInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeCustomFurnitureInfo(
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
            case 48: {

              guid_ = input.readUInt32();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                subFurnitureList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              subFurnitureList_.add(
                  input.readMessage(emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.parser(), extensionRegistry));
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
          subFurnitureList_ = java.util.Collections.unmodifiableList(subFurnitureList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.internal_static_HomeCustomFurnitureInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.internal_static_HomeCustomFurnitureInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.class, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder.class);
    }

    public static final int SUB_FURNITURE_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> subFurnitureList_;
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> getSubFurnitureListList() {
      return subFurnitureList_;
    }
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> 
        getSubFurnitureListOrBuilderList() {
      return subFurnitureList_;
    }
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    @java.lang.Override
    public int getSubFurnitureListCount() {
      return subFurnitureList_.size();
    }
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getSubFurnitureList(int index) {
      return subFurnitureList_.get(index);
    }
    /**
     * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getSubFurnitureListOrBuilder(
        int index) {
      return subFurnitureList_.get(index);
    }

    public static final int GUID_FIELD_NUMBER = 6;
    private int guid_;
    /**
     * <code>uint32 guid = 6;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
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
      if (guid_ != 0) {
        output.writeUInt32(6, guid_);
      }
      for (int i = 0; i < subFurnitureList_.size(); i++) {
        output.writeMessage(12, subFurnitureList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, guid_);
      }
      for (int i = 0; i < subFurnitureList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, subFurnitureList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo other = (emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo) obj;

      if (!getSubFurnitureListList()
          .equals(other.getSubFurnitureListList())) return false;
      if (getGuid()
          != other.getGuid()) return false;
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
      if (getSubFurnitureListCount() > 0) {
        hash = (37 * hash) + SUB_FURNITURE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSubFurnitureListList().hashCode();
      }
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo prototype) {
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
     * Protobuf type {@code HomeCustomFurnitureInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeCustomFurnitureInfo)
        emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.internal_static_HomeCustomFurnitureInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.internal_static_HomeCustomFurnitureInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.class, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.newBuilder()
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
          getSubFurnitureListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (subFurnitureListBuilder_ == null) {
          subFurnitureList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          subFurnitureListBuilder_.clear();
        }
        guid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.internal_static_HomeCustomFurnitureInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo build() {
        emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo buildPartial() {
        emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo result = new emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo(this);
        int from_bitField0_ = bitField0_;
        if (subFurnitureListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            subFurnitureList_ = java.util.Collections.unmodifiableList(subFurnitureList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.subFurnitureList_ = subFurnitureList_;
        } else {
          result.subFurnitureList_ = subFurnitureListBuilder_.build();
        }
        result.guid_ = guid_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo other) {
        if (other == emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance()) return this;
        if (subFurnitureListBuilder_ == null) {
          if (!other.subFurnitureList_.isEmpty()) {
            if (subFurnitureList_.isEmpty()) {
              subFurnitureList_ = other.subFurnitureList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSubFurnitureListIsMutable();
              subFurnitureList_.addAll(other.subFurnitureList_);
            }
            onChanged();
          }
        } else {
          if (!other.subFurnitureList_.isEmpty()) {
            if (subFurnitureListBuilder_.isEmpty()) {
              subFurnitureListBuilder_.dispose();
              subFurnitureListBuilder_ = null;
              subFurnitureList_ = other.subFurnitureList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              subFurnitureListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSubFurnitureListFieldBuilder() : null;
            } else {
              subFurnitureListBuilder_.addAllMessages(other.subFurnitureList_);
            }
          }
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
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
        emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> subFurnitureList_ =
        java.util.Collections.emptyList();
      private void ensureSubFurnitureListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          subFurnitureList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>(subFurnitureList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> subFurnitureListBuilder_;

      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> getSubFurnitureListList() {
        if (subFurnitureListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(subFurnitureList_);
        } else {
          return subFurnitureListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public int getSubFurnitureListCount() {
        if (subFurnitureListBuilder_ == null) {
          return subFurnitureList_.size();
        } else {
          return subFurnitureListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getSubFurnitureList(int index) {
        if (subFurnitureListBuilder_ == null) {
          return subFurnitureList_.get(index);
        } else {
          return subFurnitureListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder setSubFurnitureList(
          int index, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
        if (subFurnitureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubFurnitureListIsMutable();
          subFurnitureList_.set(index, value);
          onChanged();
        } else {
          subFurnitureListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder setSubFurnitureList(
          int index, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
        if (subFurnitureListBuilder_ == null) {
          ensureSubFurnitureListIsMutable();
          subFurnitureList_.set(index, builderForValue.build());
          onChanged();
        } else {
          subFurnitureListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder addSubFurnitureList(emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
        if (subFurnitureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubFurnitureListIsMutable();
          subFurnitureList_.add(value);
          onChanged();
        } else {
          subFurnitureListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder addSubFurnitureList(
          int index, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
        if (subFurnitureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubFurnitureListIsMutable();
          subFurnitureList_.add(index, value);
          onChanged();
        } else {
          subFurnitureListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder addSubFurnitureList(
          emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
        if (subFurnitureListBuilder_ == null) {
          ensureSubFurnitureListIsMutable();
          subFurnitureList_.add(builderForValue.build());
          onChanged();
        } else {
          subFurnitureListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder addSubFurnitureList(
          int index, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
        if (subFurnitureListBuilder_ == null) {
          ensureSubFurnitureListIsMutable();
          subFurnitureList_.add(index, builderForValue.build());
          onChanged();
        } else {
          subFurnitureListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder addAllSubFurnitureList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> values) {
        if (subFurnitureListBuilder_ == null) {
          ensureSubFurnitureListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, subFurnitureList_);
          onChanged();
        } else {
          subFurnitureListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder clearSubFurnitureList() {
        if (subFurnitureListBuilder_ == null) {
          subFurnitureList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          subFurnitureListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public Builder removeSubFurnitureList(int index) {
        if (subFurnitureListBuilder_ == null) {
          ensureSubFurnitureListIsMutable();
          subFurnitureList_.remove(index);
          onChanged();
        } else {
          subFurnitureListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder getSubFurnitureListBuilder(
          int index) {
        return getSubFurnitureListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getSubFurnitureListOrBuilder(
          int index) {
        if (subFurnitureListBuilder_ == null) {
          return subFurnitureList_.get(index);  } else {
          return subFurnitureListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> 
           getSubFurnitureListOrBuilderList() {
        if (subFurnitureListBuilder_ != null) {
          return subFurnitureListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(subFurnitureList_);
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder addSubFurnitureListBuilder() {
        return getSubFurnitureListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder addSubFurnitureListBuilder(
          int index) {
        return getSubFurnitureListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CustomCommonNodeInfo sub_furniture_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder> 
           getSubFurnitureListBuilderList() {
        return getSubFurnitureListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> 
          getSubFurnitureListFieldBuilder() {
        if (subFurnitureListBuilder_ == null) {
          subFurnitureListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>(
                  subFurnitureList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          subFurnitureList_ = null;
        }
        return subFurnitureListBuilder_;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 6;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 6;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeCustomFurnitureInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeCustomFurnitureInfo)
    private static final emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo();
    }

    public static emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeCustomFurnitureInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeCustomFurnitureInfo>() {
      @java.lang.Override
      public HomeCustomFurnitureInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeCustomFurnitureInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeCustomFurnitureInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeCustomFurnitureInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeCustomFurnitureInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeCustomFurnitureInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035HomeCustomFurnitureInfo.proto\032\032CustomC" +
      "ommonNodeInfo.proto\"Z\n\027HomeCustomFurnitu" +
      "reInfo\0221\n\022sub_furniture_list\030\014 \003(\0132\025.Cus" +
      "tomCommonNodeInfo\022\014\n\004guid\030\006 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeCustomFurnitureInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeCustomFurnitureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeCustomFurnitureInfo_descriptor,
        new java.lang.String[] { "SubFurnitureList", "Guid", });
    emu.grasscutter.net.proto.CustomCommonNodeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
