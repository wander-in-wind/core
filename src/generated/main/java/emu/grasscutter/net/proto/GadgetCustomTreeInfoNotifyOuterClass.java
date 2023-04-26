// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetCustomTreeInfoNotify.proto

package emu.grasscutter.net.proto;

public final class GadgetCustomTreeInfoNotifyOuterClass {
  private GadgetCustomTreeInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetCustomTreeInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetCustomTreeInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 6;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
     * @return Whether the customGadgetTreeInfo field is set.
     */
    boolean hasCustomGadgetTreeInfo();
    /**
     * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
     * @return The customGadgetTreeInfo.
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCustomGadgetTreeInfo();
    /**
     * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCustomGadgetTreeInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 833
   * Name: FCKNLPLIOAM
   * </pre>
   *
   * Protobuf type {@code GadgetCustomTreeInfoNotify}
   */
  public static final class GadgetCustomTreeInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetCustomTreeInfoNotify)
      GadgetCustomTreeInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetCustomTreeInfoNotify.newBuilder() to construct.
    private GadgetCustomTreeInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetCustomTreeInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetCustomTreeInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetCustomTreeInfoNotify(
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
            case 26: {
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder subBuilder = null;
              if (customGadgetTreeInfo_ != null) {
                subBuilder = customGadgetTreeInfo_.toBuilder();
              }
              customGadgetTreeInfo_ = input.readMessage(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(customGadgetTreeInfo_);
                customGadgetTreeInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 48: {

              gadgetEntityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.internal_static_GadgetCustomTreeInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.internal_static_GadgetCustomTreeInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify.class, emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify.Builder.class);
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 6;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 6;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int CUSTOM_GADGET_TREE_INFO_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo customGadgetTreeInfo_;
    /**
     * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
     * @return Whether the customGadgetTreeInfo field is set.
     */
    @java.lang.Override
    public boolean hasCustomGadgetTreeInfo() {
      return customGadgetTreeInfo_ != null;
    }
    /**
     * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
     * @return The customGadgetTreeInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCustomGadgetTreeInfo() {
      return customGadgetTreeInfo_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : customGadgetTreeInfo_;
    }
    /**
     * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCustomGadgetTreeInfoOrBuilder() {
      return getCustomGadgetTreeInfo();
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
      if (customGadgetTreeInfo_ != null) {
        output.writeMessage(3, getCustomGadgetTreeInfo());
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(6, gadgetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (customGadgetTreeInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getCustomGadgetTreeInfo());
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gadgetEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify other = (emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (hasCustomGadgetTreeInfo() != other.hasCustomGadgetTreeInfo()) return false;
      if (hasCustomGadgetTreeInfo()) {
        if (!getCustomGadgetTreeInfo()
            .equals(other.getCustomGadgetTreeInfo())) return false;
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      if (hasCustomGadgetTreeInfo()) {
        hash = (37 * hash) + CUSTOM_GADGET_TREE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCustomGadgetTreeInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify prototype) {
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
     * CmdId: 833
     * Name: FCKNLPLIOAM
     * </pre>
     *
     * Protobuf type {@code GadgetCustomTreeInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetCustomTreeInfoNotify)
        emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.internal_static_GadgetCustomTreeInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.internal_static_GadgetCustomTreeInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify.class, emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify.newBuilder()
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
        gadgetEntityId_ = 0;

        if (customGadgetTreeInfoBuilder_ == null) {
          customGadgetTreeInfo_ = null;
        } else {
          customGadgetTreeInfo_ = null;
          customGadgetTreeInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.internal_static_GadgetCustomTreeInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify build() {
        emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify buildPartial() {
        emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify result = new emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify(this);
        result.gadgetEntityId_ = gadgetEntityId_;
        if (customGadgetTreeInfoBuilder_ == null) {
          result.customGadgetTreeInfo_ = customGadgetTreeInfo_;
        } else {
          result.customGadgetTreeInfo_ = customGadgetTreeInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify other) {
        if (other == emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.hasCustomGadgetTreeInfo()) {
          mergeCustomGadgetTreeInfo(other.getCustomGadgetTreeInfo());
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
        emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 6;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 6;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo customGadgetTreeInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> customGadgetTreeInfoBuilder_;
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       * @return Whether the customGadgetTreeInfo field is set.
       */
      public boolean hasCustomGadgetTreeInfo() {
        return customGadgetTreeInfoBuilder_ != null || customGadgetTreeInfo_ != null;
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       * @return The customGadgetTreeInfo.
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCustomGadgetTreeInfo() {
        if (customGadgetTreeInfoBuilder_ == null) {
          return customGadgetTreeInfo_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : customGadgetTreeInfo_;
        } else {
          return customGadgetTreeInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       */
      public Builder setCustomGadgetTreeInfo(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (customGadgetTreeInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          customGadgetTreeInfo_ = value;
          onChanged();
        } else {
          customGadgetTreeInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       */
      public Builder setCustomGadgetTreeInfo(
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder builderForValue) {
        if (customGadgetTreeInfoBuilder_ == null) {
          customGadgetTreeInfo_ = builderForValue.build();
          onChanged();
        } else {
          customGadgetTreeInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       */
      public Builder mergeCustomGadgetTreeInfo(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (customGadgetTreeInfoBuilder_ == null) {
          if (customGadgetTreeInfo_ != null) {
            customGadgetTreeInfo_ =
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder(customGadgetTreeInfo_).mergeFrom(value).buildPartial();
          } else {
            customGadgetTreeInfo_ = value;
          }
          onChanged();
        } else {
          customGadgetTreeInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       */
      public Builder clearCustomGadgetTreeInfo() {
        if (customGadgetTreeInfoBuilder_ == null) {
          customGadgetTreeInfo_ = null;
          onChanged();
        } else {
          customGadgetTreeInfo_ = null;
          customGadgetTreeInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder getCustomGadgetTreeInfoBuilder() {
        
        onChanged();
        return getCustomGadgetTreeInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCustomGadgetTreeInfoOrBuilder() {
        if (customGadgetTreeInfoBuilder_ != null) {
          return customGadgetTreeInfoBuilder_.getMessageOrBuilder();
        } else {
          return customGadgetTreeInfo_ == null ?
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : customGadgetTreeInfo_;
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo custom_gadget_tree_info = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> 
          getCustomGadgetTreeInfoFieldBuilder() {
        if (customGadgetTreeInfoBuilder_ == null) {
          customGadgetTreeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder>(
                  getCustomGadgetTreeInfo(),
                  getParentForChildren(),
                  isClean());
          customGadgetTreeInfo_ = null;
        }
        return customGadgetTreeInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GadgetCustomTreeInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GadgetCustomTreeInfoNotify)
    private static final emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify();
    }

    public static emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetCustomTreeInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GadgetCustomTreeInfoNotify>() {
      @java.lang.Override
      public GadgetCustomTreeInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetCustomTreeInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetCustomTreeInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetCustomTreeInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetCustomTreeInfoNotifyOuterClass.GadgetCustomTreeInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetCustomTreeInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetCustomTreeInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GadgetCustomTreeInfoNotify.proto\032\032Cust" +
      "omGadgetTreeInfo.proto\"n\n\032GadgetCustomTr" +
      "eeInfoNotify\022\030\n\020gadget_entity_id\030\006 \001(\r\0226" +
      "\n\027custom_gadget_tree_info\030\003 \001(\0132\025.Custom" +
      "GadgetTreeInfoB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor(),
        });
    internal_static_GadgetCustomTreeInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetCustomTreeInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetCustomTreeInfoNotify_descriptor,
        new java.lang.String[] { "GadgetEntityId", "CustomGadgetTreeInfo", });
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
