// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetActiveChangeNotify.proto

package emu.grasscutter.net.proto;

public final class WidgetActiveChangeNotifyOuterClass {
  private WidgetActiveChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetActiveChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetActiveChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> 
        getWidgetDataListList();
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getWidgetDataList(int index);
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    int getWidgetDataListCount();
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getWidgetDataListOrBuilderList();
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getWidgetDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: FMGIFBHJHEP
   * CmdId: 4264
   * </pre>
   *
   * Protobuf type {@code WidgetActiveChangeNotify}
   */
  public static final class WidgetActiveChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetActiveChangeNotify)
      WidgetActiveChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetActiveChangeNotify.newBuilder() to construct.
    private WidgetActiveChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetActiveChangeNotify() {
      widgetDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetActiveChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetActiveChangeNotify(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                widgetDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData>();
                mutable_bitField0_ |= 0x00000001;
              }
              widgetDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.parser(), extensionRegistry));
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
          widgetDataList_ = java.util.Collections.unmodifiableList(widgetDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.class, emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.Builder.class);
    }

    public static final int WIDGET_DATA_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> widgetDataList_;
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> getWidgetDataListList() {
      return widgetDataList_;
    }
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getWidgetDataListOrBuilderList() {
      return widgetDataList_;
    }
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    @java.lang.Override
    public int getWidgetDataListCount() {
      return widgetDataList_.size();
    }
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getWidgetDataList(int index) {
      return widgetDataList_.get(index);
    }
    /**
     * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getWidgetDataListOrBuilder(
        int index) {
      return widgetDataList_.get(index);
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
      for (int i = 0; i < widgetDataList_.size(); i++) {
        output.writeMessage(1, widgetDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < widgetDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, widgetDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify other = (emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify) obj;

      if (!getWidgetDataListList()
          .equals(other.getWidgetDataListList())) return false;
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
      if (getWidgetDataListCount() > 0) {
        hash = (37 * hash) + WIDGET_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWidgetDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify prototype) {
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
     * Name: FMGIFBHJHEP
     * CmdId: 4264
     * </pre>
     *
     * Protobuf type {@code WidgetActiveChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetActiveChangeNotify)
        emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.class, emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.newBuilder()
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
          getWidgetDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (widgetDataListBuilder_ == null) {
          widgetDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          widgetDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.internal_static_WidgetActiveChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify build() {
        emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify buildPartial() {
        emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify result = new emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify(this);
        int from_bitField0_ = bitField0_;
        if (widgetDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            widgetDataList_ = java.util.Collections.unmodifiableList(widgetDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.widgetDataList_ = widgetDataList_;
        } else {
          result.widgetDataList_ = widgetDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify other) {
        if (other == emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify.getDefaultInstance()) return this;
        if (widgetDataListBuilder_ == null) {
          if (!other.widgetDataList_.isEmpty()) {
            if (widgetDataList_.isEmpty()) {
              widgetDataList_ = other.widgetDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWidgetDataListIsMutable();
              widgetDataList_.addAll(other.widgetDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.widgetDataList_.isEmpty()) {
            if (widgetDataListBuilder_.isEmpty()) {
              widgetDataListBuilder_.dispose();
              widgetDataListBuilder_ = null;
              widgetDataList_ = other.widgetDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              widgetDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWidgetDataListFieldBuilder() : null;
            } else {
              widgetDataListBuilder_.addAllMessages(other.widgetDataList_);
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
        emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> widgetDataList_ =
        java.util.Collections.emptyList();
      private void ensureWidgetDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          widgetDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData>(widgetDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> widgetDataListBuilder_;

      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> getWidgetDataListList() {
        if (widgetDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(widgetDataList_);
        } else {
          return widgetDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public int getWidgetDataListCount() {
        if (widgetDataListBuilder_ == null) {
          return widgetDataList_.size();
        } else {
          return widgetDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getWidgetDataList(int index) {
        if (widgetDataListBuilder_ == null) {
          return widgetDataList_.get(index);
        } else {
          return widgetDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder setWidgetDataList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (widgetDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWidgetDataListIsMutable();
          widgetDataList_.set(index, value);
          onChanged();
        } else {
          widgetDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder setWidgetDataList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (widgetDataListBuilder_ == null) {
          ensureWidgetDataListIsMutable();
          widgetDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          widgetDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder addWidgetDataList(emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (widgetDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWidgetDataListIsMutable();
          widgetDataList_.add(value);
          onChanged();
        } else {
          widgetDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder addWidgetDataList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (widgetDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWidgetDataListIsMutable();
          widgetDataList_.add(index, value);
          onChanged();
        } else {
          widgetDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder addWidgetDataList(
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (widgetDataListBuilder_ == null) {
          ensureWidgetDataListIsMutable();
          widgetDataList_.add(builderForValue.build());
          onChanged();
        } else {
          widgetDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder addWidgetDataList(
          int index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (widgetDataListBuilder_ == null) {
          ensureWidgetDataListIsMutable();
          widgetDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          widgetDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder addAllWidgetDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData> values) {
        if (widgetDataListBuilder_ == null) {
          ensureWidgetDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, widgetDataList_);
          onChanged();
        } else {
          widgetDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder clearWidgetDataList() {
        if (widgetDataListBuilder_ == null) {
          widgetDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          widgetDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public Builder removeWidgetDataList(int index) {
        if (widgetDataListBuilder_ == null) {
          ensureWidgetDataListIsMutable();
          widgetDataList_.remove(index);
          onChanged();
        } else {
          widgetDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder getWidgetDataListBuilder(
          int index) {
        return getWidgetDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getWidgetDataListOrBuilder(
          int index) {
        if (widgetDataListBuilder_ == null) {
          return widgetDataList_.get(index);  } else {
          return widgetDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
           getWidgetDataListOrBuilderList() {
        if (widgetDataListBuilder_ != null) {
          return widgetDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(widgetDataList_);
        }
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder addWidgetDataListBuilder() {
        return getWidgetDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder addWidgetDataListBuilder(
          int index) {
        return getWidgetDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData widget_data_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder> 
           getWidgetDataListBuilderList() {
        return getWidgetDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
          getWidgetDataListFieldBuilder() {
        if (widgetDataListBuilder_ == null) {
          widgetDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(
                  widgetDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          widgetDataList_ = null;
        }
        return widgetDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WidgetActiveChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WidgetActiveChangeNotify)
    private static final emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify();
    }

    public static emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetActiveChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WidgetActiveChangeNotify>() {
      @java.lang.Override
      public WidgetActiveChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetActiveChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetActiveChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetActiveChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetActiveChangeNotifyOuterClass.WidgetActiveChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetActiveChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetActiveChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036WidgetActiveChangeNotify.proto\032\024Widget" +
      "SlotData.proto\"E\n\030WidgetActiveChangeNoti" +
      "fy\022)\n\020widget_data_list\030\001 \003(\0132\017.WidgetSlo" +
      "tDataB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WidgetSlotDataOuterClass.getDescriptor(),
        });
    internal_static_WidgetActiveChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetActiveChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetActiveChangeNotify_descriptor,
        new java.lang.String[] { "WidgetDataList", });
    emu.grasscutter.net.proto.WidgetSlotDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
