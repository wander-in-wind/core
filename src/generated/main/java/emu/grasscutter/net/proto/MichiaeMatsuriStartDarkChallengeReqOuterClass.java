// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MichiaeMatsuriStartDarkChallengeReq.proto

package emu.grasscutter.net.proto;

public final class MichiaeMatsuriStartDarkChallengeReqOuterClass {
  private MichiaeMatsuriStartDarkChallengeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MichiaeMatsuriStartDarkChallengeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MichiaeMatsuriStartDarkChallengeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 worktop_entity_id = 7;</code>
     * @return The worktopEntityId.
     */
    int getWorktopEntityId();
  }
  /**
   * <pre>
   * CmdId: 8797
   * Name: PBDKPEIHGGA
   * </pre>
   *
   * Protobuf type {@code MichiaeMatsuriStartDarkChallengeReq}
   */
  public static final class MichiaeMatsuriStartDarkChallengeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MichiaeMatsuriStartDarkChallengeReq)
      MichiaeMatsuriStartDarkChallengeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MichiaeMatsuriStartDarkChallengeReq.newBuilder() to construct.
    private MichiaeMatsuriStartDarkChallengeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MichiaeMatsuriStartDarkChallengeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MichiaeMatsuriStartDarkChallengeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MichiaeMatsuriStartDarkChallengeReq(
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

              worktopEntityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq.class, emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq.Builder.class);
    }

    public static final int WORKTOP_ENTITY_ID_FIELD_NUMBER = 7;
    private int worktopEntityId_;
    /**
     * <code>uint32 worktop_entity_id = 7;</code>
     * @return The worktopEntityId.
     */
    @java.lang.Override
    public int getWorktopEntityId() {
      return worktopEntityId_;
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
      if (worktopEntityId_ != 0) {
        output.writeUInt32(7, worktopEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (worktopEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, worktopEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq other = (emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq) obj;

      if (getWorktopEntityId()
          != other.getWorktopEntityId()) return false;
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
      hash = (37 * hash) + WORKTOP_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWorktopEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq prototype) {
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
     * CmdId: 8797
     * Name: PBDKPEIHGGA
     * </pre>
     *
     * Protobuf type {@code MichiaeMatsuriStartDarkChallengeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MichiaeMatsuriStartDarkChallengeReq)
        emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq.class, emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq.newBuilder()
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
        worktopEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq build() {
        emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq buildPartial() {
        emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq result = new emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq(this);
        result.worktopEntityId_ = worktopEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq) {
          return mergeFrom((emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq other) {
        if (other == emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq.getDefaultInstance()) return this;
        if (other.getWorktopEntityId() != 0) {
          setWorktopEntityId(other.getWorktopEntityId());
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
        emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int worktopEntityId_ ;
      /**
       * <code>uint32 worktop_entity_id = 7;</code>
       * @return The worktopEntityId.
       */
      @java.lang.Override
      public int getWorktopEntityId() {
        return worktopEntityId_;
      }
      /**
       * <code>uint32 worktop_entity_id = 7;</code>
       * @param value The worktopEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setWorktopEntityId(int value) {
        
        worktopEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 worktop_entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearWorktopEntityId() {
        
        worktopEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MichiaeMatsuriStartDarkChallengeReq)
    }

    // @@protoc_insertion_point(class_scope:MichiaeMatsuriStartDarkChallengeReq)
    private static final emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq();
    }

    public static emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MichiaeMatsuriStartDarkChallengeReq>
        PARSER = new com.google.protobuf.AbstractParser<MichiaeMatsuriStartDarkChallengeReq>() {
      @java.lang.Override
      public MichiaeMatsuriStartDarkChallengeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MichiaeMatsuriStartDarkChallengeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MichiaeMatsuriStartDarkChallengeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MichiaeMatsuriStartDarkChallengeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MichiaeMatsuriStartDarkChallengeReqOuterClass.MichiaeMatsuriStartDarkChallengeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MichiaeMatsuriStartDarkChallengeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MichiaeMatsuriStartDarkChallengeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)MichiaeMatsuriStartDarkChallengeReq.pr" +
      "oto\"@\n#MichiaeMatsuriStartDarkChallengeR" +
      "eq\022\031\n\021worktop_entity_id\030\007 \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MichiaeMatsuriStartDarkChallengeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MichiaeMatsuriStartDarkChallengeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MichiaeMatsuriStartDarkChallengeReq_descriptor,
        new java.lang.String[] { "WorktopEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
