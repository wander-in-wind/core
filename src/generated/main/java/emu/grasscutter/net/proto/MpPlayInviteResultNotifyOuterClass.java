// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayInviteResultNotify.proto

package emu.grasscutter.net.proto;

public final class MpPlayInviteResultNotifyOuterClass {
  private MpPlayInviteResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayInviteResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayInviteResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mp_play_id = 11;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>bool all_agree = 10;</code>
     * @return The allAgree.
     */
    boolean getAllAgree();
  }
  /**
   * <pre>
   * CmdId: 1815
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code MpPlayInviteResultNotify}
   */
  public static final class MpPlayInviteResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayInviteResultNotify)
      MpPlayInviteResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayInviteResultNotify.newBuilder() to construct.
    private MpPlayInviteResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayInviteResultNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayInviteResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MpPlayInviteResultNotify(
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
            case 80: {

              allAgree_ = input.readBool();
              break;
            }
            case 88: {

              mpPlayId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.internal_static_MpPlayInviteResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.internal_static_MpPlayInviteResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify.class, emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify.Builder.class);
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 11;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 11;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int ALL_AGREE_FIELD_NUMBER = 10;
    private boolean allAgree_;
    /**
     * <code>bool all_agree = 10;</code>
     * @return The allAgree.
     */
    @java.lang.Override
    public boolean getAllAgree() {
      return allAgree_;
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
      if (allAgree_ != false) {
        output.writeBool(10, allAgree_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(11, mpPlayId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (allAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, allAgree_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, mpPlayId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify other = (emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify) obj;

      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getAllAgree()
          != other.getAllAgree()) return false;
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
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + ALL_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAllAgree());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify prototype) {
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
     * CmdId: 1815
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code MpPlayInviteResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayInviteResultNotify)
        emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.internal_static_MpPlayInviteResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.internal_static_MpPlayInviteResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify.class, emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify.newBuilder()
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
        mpPlayId_ = 0;

        allAgree_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.internal_static_MpPlayInviteResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify build() {
        emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify buildPartial() {
        emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify result = new emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify(this);
        result.mpPlayId_ = mpPlayId_;
        result.allAgree_ = allAgree_;
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
        if (other instanceof emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify other) {
        if (other == emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify.getDefaultInstance()) return this;
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getAllAgree() != false) {
          setAllAgree(other.getAllAgree());
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
        emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private boolean allAgree_ ;
      /**
       * <code>bool all_agree = 10;</code>
       * @return The allAgree.
       */
      @java.lang.Override
      public boolean getAllAgree() {
        return allAgree_;
      }
      /**
       * <code>bool all_agree = 10;</code>
       * @param value The allAgree to set.
       * @return This builder for chaining.
       */
      public Builder setAllAgree(boolean value) {
        
        allAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool all_agree = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAllAgree() {
        
        allAgree_ = false;
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


      // @@protoc_insertion_point(builder_scope:MpPlayInviteResultNotify)
    }

    // @@protoc_insertion_point(class_scope:MpPlayInviteResultNotify)
    private static final emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify();
    }

    public static emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayInviteResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayInviteResultNotify>() {
      @java.lang.Override
      public MpPlayInviteResultNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MpPlayInviteResultNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MpPlayInviteResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayInviteResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MpPlayInviteResultNotifyOuterClass.MpPlayInviteResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayInviteResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayInviteResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036MpPlayInviteResultNotify.proto\"A\n\030MpPl" +
      "ayInviteResultNotify\022\022\n\nmp_play_id\030\013 \001(\r" +
      "\022\021\n\tall_agree\030\n \001(\010B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayInviteResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayInviteResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayInviteResultNotify_descriptor,
        new java.lang.String[] { "MpPlayId", "AllAgree", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
