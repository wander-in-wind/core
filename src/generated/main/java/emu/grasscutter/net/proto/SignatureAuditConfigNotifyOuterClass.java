// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SignatureAuditConfigNotify.proto

package emu.grasscutter.net.proto;

public final class SignatureAuditConfigNotifyOuterClass {
  private SignatureAuditConfigNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SignatureAuditConfigNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SignatureAuditConfigNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 submit_limit = 14;</code>
     * @return The submitLimit.
     */
    int getSubmitLimit();

    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * CmdId: 4047
   * Name: FONPLIJKICI
   * </pre>
   *
   * Protobuf type {@code SignatureAuditConfigNotify}
   */
  public static final class SignatureAuditConfigNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SignatureAuditConfigNotify)
      SignatureAuditConfigNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SignatureAuditConfigNotify.newBuilder() to construct.
    private SignatureAuditConfigNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SignatureAuditConfigNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SignatureAuditConfigNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SignatureAuditConfigNotify(
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
            case 96: {

              isOpen_ = input.readBool();
              break;
            }
            case 112: {

              submitLimit_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.internal_static_SignatureAuditConfigNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.internal_static_SignatureAuditConfigNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify.class, emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify.Builder.class);
    }

    public static final int SUBMIT_LIMIT_FIELD_NUMBER = 14;
    private int submitLimit_;
    /**
     * <code>uint32 submit_limit = 14;</code>
     * @return The submitLimit.
     */
    @java.lang.Override
    public int getSubmitLimit() {
      return submitLimit_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 12;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (isOpen_ != false) {
        output.writeBool(12, isOpen_);
      }
      if (submitLimit_ != 0) {
        output.writeUInt32(14, submitLimit_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isOpen_);
      }
      if (submitLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, submitLimit_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify other = (emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify) obj;

      if (getSubmitLimit()
          != other.getSubmitLimit()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + SUBMIT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitLimit();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify prototype) {
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
     * CmdId: 4047
     * Name: FONPLIJKICI
     * </pre>
     *
     * Protobuf type {@code SignatureAuditConfigNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SignatureAuditConfigNotify)
        emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.internal_static_SignatureAuditConfigNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.internal_static_SignatureAuditConfigNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify.class, emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify.newBuilder()
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
        submitLimit_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.internal_static_SignatureAuditConfigNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify build() {
        emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify buildPartial() {
        emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify result = new emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify(this);
        result.submitLimit_ = submitLimit_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify other) {
        if (other == emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify.getDefaultInstance()) return this;
        if (other.getSubmitLimit() != 0) {
          setSubmitLimit(other.getSubmitLimit());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int submitLimit_ ;
      /**
       * <code>uint32 submit_limit = 14;</code>
       * @return The submitLimit.
       */
      @java.lang.Override
      public int getSubmitLimit() {
        return submitLimit_;
      }
      /**
       * <code>uint32 submit_limit = 14;</code>
       * @param value The submitLimit to set.
       * @return This builder for chaining.
       */
      public Builder setSubmitLimit(int value) {
        
        submitLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 submit_limit = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubmitLimit() {
        
        submitLimit_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 12;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:SignatureAuditConfigNotify)
    }

    // @@protoc_insertion_point(class_scope:SignatureAuditConfigNotify)
    private static final emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify();
    }

    public static emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SignatureAuditConfigNotify>
        PARSER = new com.google.protobuf.AbstractParser<SignatureAuditConfigNotify>() {
      @java.lang.Override
      public SignatureAuditConfigNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SignatureAuditConfigNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SignatureAuditConfigNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SignatureAuditConfigNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SignatureAuditConfigNotifyOuterClass.SignatureAuditConfigNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignatureAuditConfigNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignatureAuditConfigNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SignatureAuditConfigNotify.proto\"C\n\032Si" +
      "gnatureAuditConfigNotify\022\024\n\014submit_limit" +
      "\030\016 \001(\r\022\017\n\007is_open\030\014 \001(\010B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SignatureAuditConfigNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SignatureAuditConfigNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignatureAuditConfigNotify_descriptor,
        new java.lang.String[] { "SubmitLimit", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
