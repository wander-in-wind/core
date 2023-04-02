// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FriendInfoChangeNotify.proto

package emu.grasscutter.net.proto;

public final class FriendInfoChangeNotifyOuterClass {
  private FriendInfoChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FriendInfoChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FriendInfoChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string online_id = 9;</code>
     * @return The onlineId.
     */
    java.lang.String getOnlineId();
    /**
     * <code>string online_id = 9;</code>
     * @return The bytes for onlineId.
     */
    com.google.protobuf.ByteString
        getOnlineIdBytes();
  }
  /**
   * <pre>
   * Name: KBLAEHCOJBB
   * CmdId: 4092
   * </pre>
   *
   * Protobuf type {@code FriendInfoChangeNotify}
   */
  public static final class FriendInfoChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FriendInfoChangeNotify)
      FriendInfoChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FriendInfoChangeNotify.newBuilder() to construct.
    private FriendInfoChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FriendInfoChangeNotify() {
      onlineId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FriendInfoChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FriendInfoChangeNotify(
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

              uid_ = input.readUInt32();
              break;
            }
            case 74: {
              java.lang.String s = input.readStringRequireUtf8();

              onlineId_ = s;
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
      return emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.internal_static_FriendInfoChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.internal_static_FriendInfoChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify.class, emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 6;
    private int uid_;
    /**
     * <code>uint32 uid = 6;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int ONLINE_ID_FIELD_NUMBER = 9;
    private volatile java.lang.Object onlineId_;
    /**
     * <code>string online_id = 9;</code>
     * @return The onlineId.
     */
    @java.lang.Override
    public java.lang.String getOnlineId() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        onlineId_ = s;
        return s;
      }
    }
    /**
     * <code>string online_id = 9;</code>
     * @return The bytes for onlineId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOnlineIdBytes() {
      java.lang.Object ref = onlineId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        onlineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (uid_ != 0) {
        output.writeUInt32(6, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, onlineId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(onlineId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, onlineId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify other = (emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getOnlineId()
          .equals(other.getOnlineId())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + ONLINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOnlineId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify prototype) {
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
     * Name: KBLAEHCOJBB
     * CmdId: 4092
     * </pre>
     *
     * Protobuf type {@code FriendInfoChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FriendInfoChangeNotify)
        emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.internal_static_FriendInfoChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.internal_static_FriendInfoChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify.class, emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify.newBuilder()
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
        uid_ = 0;

        onlineId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.internal_static_FriendInfoChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify build() {
        emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify buildPartial() {
        emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify result = new emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify(this);
        result.uid_ = uid_;
        result.onlineId_ = onlineId_;
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
        if (other instanceof emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify other) {
        if (other == emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getOnlineId().isEmpty()) {
          onlineId_ = other.onlineId_;
          onChanged();
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
        emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 6;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object onlineId_ = "";
      /**
       * <code>string online_id = 9;</code>
       * @return The onlineId.
       */
      public java.lang.String getOnlineId() {
        java.lang.Object ref = onlineId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          onlineId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string online_id = 9;</code>
       * @return The bytes for onlineId.
       */
      public com.google.protobuf.ByteString
          getOnlineIdBytes() {
        java.lang.Object ref = onlineId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          onlineId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string online_id = 9;</code>
       * @param value The onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        onlineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnlineId() {
        
        onlineId_ = getDefaultInstance().getOnlineId();
        onChanged();
        return this;
      }
      /**
       * <code>string online_id = 9;</code>
       * @param value The bytes for onlineId to set.
       * @return This builder for chaining.
       */
      public Builder setOnlineIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        onlineId_ = value;
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


      // @@protoc_insertion_point(builder_scope:FriendInfoChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:FriendInfoChangeNotify)
    private static final emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify();
    }

    public static emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FriendInfoChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<FriendInfoChangeNotify>() {
      @java.lang.Override
      public FriendInfoChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FriendInfoChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FriendInfoChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FriendInfoChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FriendInfoChangeNotifyOuterClass.FriendInfoChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FriendInfoChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FriendInfoChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034FriendInfoChangeNotify.proto\"8\n\026Friend" +
      "InfoChangeNotify\022\013\n\003uid\030\006 \001(\r\022\021\n\tonline_" +
      "id\030\t \001(\tB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FriendInfoChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FriendInfoChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FriendInfoChangeNotify_descriptor,
        new java.lang.String[] { "Uid", "OnlineId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
