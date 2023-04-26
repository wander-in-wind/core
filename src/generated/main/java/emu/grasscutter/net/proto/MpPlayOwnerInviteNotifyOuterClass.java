// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayOwnerInviteNotify.proto

package emu.grasscutter.net.proto;

public final class MpPlayOwnerInviteNotifyOuterClass {
  private MpPlayOwnerInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayOwnerInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayOwnerInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mp_play_id = 12;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>uint32 cd = 7;</code>
     * @return The cd.
     */
    int getCd();

    /**
     * <code>bool is_remain_reward = 9;</code>
     * @return The isRemainReward.
     */
    boolean getIsRemainReward();
  }
  /**
   * <pre>
   * CmdId: 1837
   * Name: FMMKBGLPLCL
   * </pre>
   *
   * Protobuf type {@code MpPlayOwnerInviteNotify}
   */
  public static final class MpPlayOwnerInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayOwnerInviteNotify)
      MpPlayOwnerInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayOwnerInviteNotify.newBuilder() to construct.
    private MpPlayOwnerInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayOwnerInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayOwnerInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MpPlayOwnerInviteNotify(
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
            case 56: {

              cd_ = input.readUInt32();
              break;
            }
            case 72: {

              isRemainReward_ = input.readBool();
              break;
            }
            case 96: {

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
      return emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.class, emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.Builder.class);
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 12;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 12;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int CD_FIELD_NUMBER = 7;
    private int cd_;
    /**
     * <code>uint32 cd = 7;</code>
     * @return The cd.
     */
    @java.lang.Override
    public int getCd() {
      return cd_;
    }

    public static final int IS_REMAIN_REWARD_FIELD_NUMBER = 9;
    private boolean isRemainReward_;
    /**
     * <code>bool is_remain_reward = 9;</code>
     * @return The isRemainReward.
     */
    @java.lang.Override
    public boolean getIsRemainReward() {
      return isRemainReward_;
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
      if (cd_ != 0) {
        output.writeUInt32(7, cd_);
      }
      if (isRemainReward_ != false) {
        output.writeBool(9, isRemainReward_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(12, mpPlayId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cd_);
      }
      if (isRemainReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isRemainReward_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, mpPlayId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify other = (emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify) obj;

      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getCd()
          != other.getCd()) return false;
      if (getIsRemainReward()
          != other.getIsRemainReward()) return false;
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
      hash = (37 * hash) + CD_FIELD_NUMBER;
      hash = (53 * hash) + getCd();
      hash = (37 * hash) + IS_REMAIN_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRemainReward());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify prototype) {
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
     * CmdId: 1837
     * Name: FMMKBGLPLCL
     * </pre>
     *
     * Protobuf type {@code MpPlayOwnerInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayOwnerInviteNotify)
        emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.class, emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.newBuilder()
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

        cd_ = 0;

        isRemainReward_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify build() {
        emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify buildPartial() {
        emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify result = new emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify(this);
        result.mpPlayId_ = mpPlayId_;
        result.cd_ = cd_;
        result.isRemainReward_ = isRemainReward_;
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
        if (other instanceof emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify other) {
        if (other == emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.getDefaultInstance()) return this;
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getCd() != 0) {
          setCd(other.getCd());
        }
        if (other.getIsRemainReward() != false) {
          setIsRemainReward(other.getIsRemainReward());
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
        emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify) e.getUnfinishedMessage();
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
       * <code>uint32 mp_play_id = 12;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 12;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private int cd_ ;
      /**
       * <code>uint32 cd = 7;</code>
       * @return The cd.
       */
      @java.lang.Override
      public int getCd() {
        return cd_;
      }
      /**
       * <code>uint32 cd = 7;</code>
       * @param value The cd to set.
       * @return This builder for chaining.
       */
      public Builder setCd(int value) {
        
        cd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCd() {
        
        cd_ = 0;
        onChanged();
        return this;
      }

      private boolean isRemainReward_ ;
      /**
       * <code>bool is_remain_reward = 9;</code>
       * @return The isRemainReward.
       */
      @java.lang.Override
      public boolean getIsRemainReward() {
        return isRemainReward_;
      }
      /**
       * <code>bool is_remain_reward = 9;</code>
       * @param value The isRemainReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsRemainReward(boolean value) {
        
        isRemainReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_remain_reward = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRemainReward() {
        
        isRemainReward_ = false;
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


      // @@protoc_insertion_point(builder_scope:MpPlayOwnerInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:MpPlayOwnerInviteNotify)
    private static final emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify();
    }

    public static emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayOwnerInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayOwnerInviteNotify>() {
      @java.lang.Override
      public MpPlayOwnerInviteNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MpPlayOwnerInviteNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MpPlayOwnerInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayOwnerInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayOwnerInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035MpPlayOwnerInviteNotify.proto\"S\n\027MpPla" +
      "yOwnerInviteNotify\022\022\n\nmp_play_id\030\014 \001(\r\022\n" +
      "\n\002cd\030\007 \001(\r\022\030\n\020is_remain_reward\030\t \001(\010B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayOwnerInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayOwnerInviteNotify_descriptor,
        new java.lang.String[] { "MpPlayId", "Cd", "IsRemainReward", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
