// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientReportNotify.proto

package emu.grasscutter.net.proto;

public final class ClientReportNotifyOuterClass {
  private ClientReportNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientReportNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientReportNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string report_type = 1;</code>
     * @return The reportType.
     */
    java.lang.String getReportType();
    /**
     * <code>string report_type = 1;</code>
     * @return The bytes for reportType.
     */
    com.google.protobuf.ByteString
        getReportTypeBytes();

    /**
     * <code>string report_value = 4;</code>
     * @return The reportValue.
     */
    java.lang.String getReportValue();
    /**
     * <code>string report_value = 4;</code>
     * @return The bytes for reportValue.
     */
    com.google.protobuf.ByteString
        getReportValueBytes();
  }
  /**
   * <pre>
   * CmdId: 81
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ClientReportNotify}
   */
  public static final class ClientReportNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientReportNotify)
      ClientReportNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientReportNotify.newBuilder() to construct.
    private ClientReportNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientReportNotify() {
      reportType_ = "";
      reportValue_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientReportNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientReportNotify(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              reportType_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              reportValue_ = s;
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
      return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.class, emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.Builder.class);
    }

    public static final int REPORT_TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object reportType_;
    /**
     * <code>string report_type = 1;</code>
     * @return The reportType.
     */
    @java.lang.Override
    public java.lang.String getReportType() {
      java.lang.Object ref = reportType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reportType_ = s;
        return s;
      }
    }
    /**
     * <code>string report_type = 1;</code>
     * @return The bytes for reportType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReportTypeBytes() {
      java.lang.Object ref = reportType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reportType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REPORT_VALUE_FIELD_NUMBER = 4;
    private volatile java.lang.Object reportValue_;
    /**
     * <code>string report_value = 4;</code>
     * @return The reportValue.
     */
    @java.lang.Override
    public java.lang.String getReportValue() {
      java.lang.Object ref = reportValue_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reportValue_ = s;
        return s;
      }
    }
    /**
     * <code>string report_value = 4;</code>
     * @return The bytes for reportValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReportValueBytes() {
      java.lang.Object ref = reportValue_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reportValue_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportType_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reportType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportValue_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, reportValue_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportType_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reportType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportValue_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, reportValue_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify other = (emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify) obj;

      if (!getReportType()
          .equals(other.getReportType())) return false;
      if (!getReportValue()
          .equals(other.getReportValue())) return false;
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
      hash = (37 * hash) + REPORT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getReportType().hashCode();
      hash = (37 * hash) + REPORT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getReportValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify prototype) {
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
     * CmdId: 81
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ClientReportNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientReportNotify)
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.class, emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.newBuilder()
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
        reportType_ = "";

        reportValue_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify build() {
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify buildPartial() {
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify result = new emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify(this);
        result.reportType_ = reportType_;
        result.reportValue_ = reportValue_;
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
        if (other instanceof emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify other) {
        if (other == emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.getDefaultInstance()) return this;
        if (!other.getReportType().isEmpty()) {
          reportType_ = other.reportType_;
          onChanged();
        }
        if (!other.getReportValue().isEmpty()) {
          reportValue_ = other.reportValue_;
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
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object reportType_ = "";
      /**
       * <code>string report_type = 1;</code>
       * @return The reportType.
       */
      public java.lang.String getReportType() {
        java.lang.Object ref = reportType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reportType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string report_type = 1;</code>
       * @return The bytes for reportType.
       */
      public com.google.protobuf.ByteString
          getReportTypeBytes() {
        java.lang.Object ref = reportType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reportType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string report_type = 1;</code>
       * @param value The reportType to set.
       * @return This builder for chaining.
       */
      public Builder setReportType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reportType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string report_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReportType() {
        
        reportType_ = getDefaultInstance().getReportType();
        onChanged();
        return this;
      }
      /**
       * <code>string report_type = 1;</code>
       * @param value The bytes for reportType to set.
       * @return This builder for chaining.
       */
      public Builder setReportTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reportType_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object reportValue_ = "";
      /**
       * <code>string report_value = 4;</code>
       * @return The reportValue.
       */
      public java.lang.String getReportValue() {
        java.lang.Object ref = reportValue_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reportValue_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string report_value = 4;</code>
       * @return The bytes for reportValue.
       */
      public com.google.protobuf.ByteString
          getReportValueBytes() {
        java.lang.Object ref = reportValue_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reportValue_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string report_value = 4;</code>
       * @param value The reportValue to set.
       * @return This builder for chaining.
       */
      public Builder setReportValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reportValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string report_value = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearReportValue() {
        
        reportValue_ = getDefaultInstance().getReportValue();
        onChanged();
        return this;
      }
      /**
       * <code>string report_value = 4;</code>
       * @param value The bytes for reportValue to set.
       * @return This builder for chaining.
       */
      public Builder setReportValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reportValue_ = value;
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


      // @@protoc_insertion_point(builder_scope:ClientReportNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientReportNotify)
    private static final emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify();
    }

    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientReportNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientReportNotify>() {
      @java.lang.Override
      public ClientReportNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientReportNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientReportNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientReportNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientReportNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientReportNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ClientReportNotify.proto\"?\n\022ClientRepo" +
      "rtNotify\022\023\n\013report_type\030\001 \001(\t\022\024\n\014report_" +
      "value\030\004 \001(\tB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientReportNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientReportNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientReportNotify_descriptor,
        new java.lang.String[] { "ReportType", "ReportValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
