// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryEnterNextRogueDiaryDungeonReq.proto

package emu.grasscutter.net.proto;

public final class TryEnterNextRogueDiaryDungeonReqOuterClass {
  private TryEnterNextRogueDiaryDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TryEnterNextRogueDiaryDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TryEnterNextRogueDiaryDungeonReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Name: GNGOIJDLMKK
   * CmdId: 8832
   * </pre>
   *
   * Protobuf type {@code TryEnterNextRogueDiaryDungeonReq}
   */
  public static final class TryEnterNextRogueDiaryDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TryEnterNextRogueDiaryDungeonReq)
      TryEnterNextRogueDiaryDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TryEnterNextRogueDiaryDungeonReq.newBuilder() to construct.
    private TryEnterNextRogueDiaryDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TryEnterNextRogueDiaryDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TryEnterNextRogueDiaryDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TryEnterNextRogueDiaryDungeonReq(
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
      return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.internal_static_TryEnterNextRogueDiaryDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.internal_static_TryEnterNextRogueDiaryDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq.class, emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq other = (emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq prototype) {
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
     * Name: GNGOIJDLMKK
     * CmdId: 8832
     * </pre>
     *
     * Protobuf type {@code TryEnterNextRogueDiaryDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TryEnterNextRogueDiaryDungeonReq)
        emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.internal_static_TryEnterNextRogueDiaryDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.internal_static_TryEnterNextRogueDiaryDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq.class, emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.internal_static_TryEnterNextRogueDiaryDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq build() {
        emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq buildPartial() {
        emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq result = new emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq(this);
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
        if (other instanceof emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq other) {
        if (other == emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq.getDefaultInstance()) return this;
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
        emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:TryEnterNextRogueDiaryDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:TryEnterNextRogueDiaryDungeonReq)
    private static final emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq();
    }

    public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TryEnterNextRogueDiaryDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<TryEnterNextRogueDiaryDungeonReq>() {
      @java.lang.Override
      public TryEnterNextRogueDiaryDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TryEnterNextRogueDiaryDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TryEnterNextRogueDiaryDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TryEnterNextRogueDiaryDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonReqOuterClass.TryEnterNextRogueDiaryDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TryEnterNextRogueDiaryDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TryEnterNextRogueDiaryDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&TryEnterNextRogueDiaryDungeonReq.proto" +
      "\"\"\n TryEnterNextRogueDiaryDungeonReqB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TryEnterNextRogueDiaryDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TryEnterNextRogueDiaryDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TryEnterNextRogueDiaryDungeonReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
