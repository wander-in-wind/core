// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSettleOptionRsp.proto

package emu.grasscutter.net.proto;

public final class GCGSettleOptionRspOuterClass {
  private GCGSettleOptionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSettleOptionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSettleOptionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.GCGSettleOption option = 15;</code>
     * @return The enum numeric value on the wire for option.
     */
    int getOptionValue();
    /**
     * <code>.GCGSettleOption option = 15;</code>
     * @return The option.
     */
    emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption getOption();
  }
  /**
   * <pre>
   * CmdId: 7356
   * Name: IMOLJDDINMH
   * </pre>
   *
   * Protobuf type {@code GCGSettleOptionRsp}
   */
  public static final class GCGSettleOptionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSettleOptionRsp)
      GCGSettleOptionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSettleOptionRsp.newBuilder() to construct.
    private GCGSettleOptionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSettleOptionRsp() {
      option_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSettleOptionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGSettleOptionRsp(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {
              int rawValue = input.readEnum();

              option_ = rawValue;
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
      return emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.class, emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int OPTION_FIELD_NUMBER = 15;
    private int option_;
    /**
     * <code>.GCGSettleOption option = 15;</code>
     * @return The enum numeric value on the wire for option.
     */
    @java.lang.Override public int getOptionValue() {
      return option_;
    }
    /**
     * <code>.GCGSettleOption option = 15;</code>
     * @return The option.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption getOption() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption result = emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.valueOf(option_);
      return result == null ? emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.UNRECOGNIZED : result;
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
        output.writeInt32(8, retcode_);
      }
      if (option_ != emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.GCG_SETTLE_OPT_NONE.getNumber()) {
        output.writeEnum(15, option_);
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
          .computeInt32Size(8, retcode_);
      }
      if (option_ != emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.GCG_SETTLE_OPT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, option_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp other = (emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (option_ != other.option_) return false;
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
      hash = (37 * hash) + OPTION_FIELD_NUMBER;
      hash = (53 * hash) + option_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp prototype) {
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
     * CmdId: 7356
     * Name: IMOLJDDINMH
     * </pre>
     *
     * Protobuf type {@code GCGSettleOptionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSettleOptionRsp)
        emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.class, emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.newBuilder()
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

        option_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp build() {
        emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp buildPartial() {
        emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp result = new emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp(this);
        result.retcode_ = retcode_;
        result.option_ = option_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp other) {
        if (other == emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.option_ != 0) {
          setOptionValue(other.getOptionValue());
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
        emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int option_ = 0;
      /**
       * <code>.GCGSettleOption option = 15;</code>
       * @return The enum numeric value on the wire for option.
       */
      @java.lang.Override public int getOptionValue() {
        return option_;
      }
      /**
       * <code>.GCGSettleOption option = 15;</code>
       * @param value The enum numeric value on the wire for option to set.
       * @return This builder for chaining.
       */
      public Builder setOptionValue(int value) {
        
        option_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGSettleOption option = 15;</code>
       * @return The option.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption getOption() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption result = emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.valueOf(option_);
        return result == null ? emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGSettleOption option = 15;</code>
       * @param value The option to set.
       * @return This builder for chaining.
       */
      public Builder setOption(emu.grasscutter.net.proto.GCGSettleOptionOuterClass.GCGSettleOption value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        option_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGSettleOption option = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearOption() {
        
        option_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGSettleOptionRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGSettleOptionRsp)
    private static final emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp();
    }

    public static emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSettleOptionRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGSettleOptionRsp>() {
      @java.lang.Override
      public GCGSettleOptionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGSettleOptionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGSettleOptionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSettleOptionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSettleOptionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSettleOptionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGSettleOptionRsp.proto\032\025GCGSettleOpt" +
      "ion.proto\"G\n\022GCGSettleOptionRsp\022\017\n\007retco" +
      "de\030\010 \001(\005\022 \n\006option\030\017 \001(\0162\020.GCGSettleOpti" +
      "onB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGSettleOptionOuterClass.getDescriptor(),
        });
    internal_static_GCGSettleOptionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSettleOptionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSettleOptionRsp_descriptor,
        new java.lang.String[] { "Retcode", "Option", });
    emu.grasscutter.net.proto.GCGSettleOptionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
