// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayGuestReplyInviteRsp.proto

package emu.grasscutter.net.proto;

public final class ScenePlayGuestReplyInviteRspOuterClass {
  private ScenePlayGuestReplyInviteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayGuestReplyInviteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayGuestReplyInviteRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 play_id = 4;</code>
     * @return The playId.
     */
    int getPlayId();

    /**
     * <code>bool is_agree = 9;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();
  }
  /**
   * <pre>
   * CmdId: 4422
   * Name: NGDHDKJNJAJ
   * </pre>
   *
   * Protobuf type {@code ScenePlayGuestReplyInviteRsp}
   */
  public static final class ScenePlayGuestReplyInviteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayGuestReplyInviteRsp)
      ScenePlayGuestReplyInviteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayGuestReplyInviteRsp.newBuilder() to construct.
    private ScenePlayGuestReplyInviteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayGuestReplyInviteRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayGuestReplyInviteRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayGuestReplyInviteRsp(
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
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 32: {

              playId_ = input.readUInt32();
              break;
            }
            case 72: {

              isAgree_ = input.readBool();
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
      return emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.internal_static_ScenePlayGuestReplyInviteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.internal_static_ScenePlayGuestReplyInviteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp.class, emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PLAY_ID_FIELD_NUMBER = 4;
    private int playId_;
    /**
     * <code>uint32 play_id = 4;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
    }

    public static final int IS_AGREE_FIELD_NUMBER = 9;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 9;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
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
        output.writeInt32(3, retcode_);
      }
      if (playId_ != 0) {
        output.writeUInt32(4, playId_);
      }
      if (isAgree_ != false) {
        output.writeBool(9, isAgree_);
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
          .computeInt32Size(3, retcode_);
      }
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, playId_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isAgree_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp other = (emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getPlayId()
          != other.getPlayId()) return false;
      if (getIsAgree()
          != other.getIsAgree()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp prototype) {
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
     * CmdId: 4422
     * Name: NGDHDKJNJAJ
     * </pre>
     *
     * Protobuf type {@code ScenePlayGuestReplyInviteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayGuestReplyInviteRsp)
        emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.internal_static_ScenePlayGuestReplyInviteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.internal_static_ScenePlayGuestReplyInviteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp.class, emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp.newBuilder()
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
        retcode_ = 0;

        playId_ = 0;

        isAgree_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.internal_static_ScenePlayGuestReplyInviteRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp build() {
        emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp buildPartial() {
        emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp result = new emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp(this);
        result.retcode_ = retcode_;
        result.playId_ = playId_;
        result.isAgree_ = isAgree_;
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp other) {
        if (other == emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
        }
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
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
        emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 play_id = 4;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 play_id = 4;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 9;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 9;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayGuestReplyInviteRsp)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayGuestReplyInviteRsp)
    private static final emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp();
    }

    public static emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayGuestReplyInviteRsp>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayGuestReplyInviteRsp>() {
      @java.lang.Override
      public ScenePlayGuestReplyInviteRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayGuestReplyInviteRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayGuestReplyInviteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayGuestReplyInviteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayGuestReplyInviteRspOuterClass.ScenePlayGuestReplyInviteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayGuestReplyInviteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayGuestReplyInviteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ScenePlayGuestReplyInviteRsp.proto\"R\n\034" +
      "ScenePlayGuestReplyInviteRsp\022\017\n\007retcode\030" +
      "\003 \001(\005\022\017\n\007play_id\030\004 \001(\r\022\020\n\010is_agree\030\t \001(\010" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayGuestReplyInviteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayGuestReplyInviteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayGuestReplyInviteRsp_descriptor,
        new java.lang.String[] { "Retcode", "PlayId", "IsAgree", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
