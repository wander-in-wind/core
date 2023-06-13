// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocencePhotoReminderNotify.proto

package emu.grasscutter.net.proto;

public final class GravenInnocencePhotoReminderNotifyOuterClass {
  private GravenInnocencePhotoReminderNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocencePhotoReminderNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocencePhotoReminderNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_bundle_id = 14;</code>
     * @return The groupBundleId.
     */
    int getGroupBundleId();

    /**
     * <code>uint32 reminder_id = 6;</code>
     * @return The reminderId.
     */
    int getReminderId();
  }
  /**
   * <pre>
   * CmdId: 23864
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GravenInnocencePhotoReminderNotify}
   */
  public static final class GravenInnocencePhotoReminderNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocencePhotoReminderNotify)
      GravenInnocencePhotoReminderNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocencePhotoReminderNotify.newBuilder() to construct.
    private GravenInnocencePhotoReminderNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocencePhotoReminderNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocencePhotoReminderNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GravenInnocencePhotoReminderNotify(
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
            case 48: {

              reminderId_ = input.readUInt32();
              break;
            }
            case 112: {

              groupBundleId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.internal_static_GravenInnocencePhotoReminderNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.internal_static_GravenInnocencePhotoReminderNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify.class, emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify.Builder.class);
    }

    public static final int GROUP_BUNDLE_ID_FIELD_NUMBER = 14;
    private int groupBundleId_;
    /**
     * <code>uint32 group_bundle_id = 14;</code>
     * @return The groupBundleId.
     */
    @java.lang.Override
    public int getGroupBundleId() {
      return groupBundleId_;
    }

    public static final int REMINDER_ID_FIELD_NUMBER = 6;
    private int reminderId_;
    /**
     * <code>uint32 reminder_id = 6;</code>
     * @return The reminderId.
     */
    @java.lang.Override
    public int getReminderId() {
      return reminderId_;
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
      if (reminderId_ != 0) {
        output.writeUInt32(6, reminderId_);
      }
      if (groupBundleId_ != 0) {
        output.writeUInt32(14, groupBundleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reminderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, reminderId_);
      }
      if (groupBundleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, groupBundleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify other = (emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify) obj;

      if (getGroupBundleId()
          != other.getGroupBundleId()) return false;
      if (getReminderId()
          != other.getReminderId()) return false;
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
      hash = (37 * hash) + GROUP_BUNDLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupBundleId();
      hash = (37 * hash) + REMINDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getReminderId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify prototype) {
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
     * CmdId: 23864
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GravenInnocencePhotoReminderNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocencePhotoReminderNotify)
        emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.internal_static_GravenInnocencePhotoReminderNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.internal_static_GravenInnocencePhotoReminderNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify.class, emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify.newBuilder()
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
        groupBundleId_ = 0;

        reminderId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.internal_static_GravenInnocencePhotoReminderNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify build() {
        emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify buildPartial() {
        emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify result = new emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify(this);
        result.groupBundleId_ = groupBundleId_;
        result.reminderId_ = reminderId_;
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
        if (other instanceof emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify other) {
        if (other == emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify.getDefaultInstance()) return this;
        if (other.getGroupBundleId() != 0) {
          setGroupBundleId(other.getGroupBundleId());
        }
        if (other.getReminderId() != 0) {
          setReminderId(other.getReminderId());
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
        emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupBundleId_ ;
      /**
       * <code>uint32 group_bundle_id = 14;</code>
       * @return The groupBundleId.
       */
      @java.lang.Override
      public int getGroupBundleId() {
        return groupBundleId_;
      }
      /**
       * <code>uint32 group_bundle_id = 14;</code>
       * @param value The groupBundleId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupBundleId(int value) {
        
        groupBundleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_bundle_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupBundleId() {
        
        groupBundleId_ = 0;
        onChanged();
        return this;
      }

      private int reminderId_ ;
      /**
       * <code>uint32 reminder_id = 6;</code>
       * @return The reminderId.
       */
      @java.lang.Override
      public int getReminderId() {
        return reminderId_;
      }
      /**
       * <code>uint32 reminder_id = 6;</code>
       * @param value The reminderId to set.
       * @return This builder for chaining.
       */
      public Builder setReminderId(int value) {
        
        reminderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reminder_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearReminderId() {
        
        reminderId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GravenInnocencePhotoReminderNotify)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocencePhotoReminderNotify)
    private static final emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify();
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocencePhotoReminderNotify>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocencePhotoReminderNotify>() {
      @java.lang.Override
      public GravenInnocencePhotoReminderNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GravenInnocencePhotoReminderNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GravenInnocencePhotoReminderNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocencePhotoReminderNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GravenInnocencePhotoReminderNotifyOuterClass.GravenInnocencePhotoReminderNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocencePhotoReminderNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocencePhotoReminderNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(GravenInnocencePhotoReminderNotify.pro" +
      "to\"R\n\"GravenInnocencePhotoReminderNotify" +
      "\022\027\n\017group_bundle_id\030\016 \001(\r\022\023\n\013reminder_id" +
      "\030\006 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GravenInnocencePhotoReminderNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocencePhotoReminderNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocencePhotoReminderNotify_descriptor,
        new java.lang.String[] { "GroupBundleId", "ReminderId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
