// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FNGGFHGAKMD.proto

package emu.grasscutter.net.proto;

public final class FNGGFHGAKMDOuterClass {
  private FNGGFHGAKMDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FNGGFHGAKMDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FNGGFHGAKMD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_succ = 14;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();
  }
  /**
   * <pre>
   * CmdId: 9240
   * </pre>
   *
   * Protobuf type {@code FNGGFHGAKMD}
   */
  public static final class FNGGFHGAKMD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FNGGFHGAKMD)
      FNGGFHGAKMDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FNGGFHGAKMD.newBuilder() to construct.
    private FNGGFHGAKMD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FNGGFHGAKMD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FNGGFHGAKMD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FNGGFHGAKMD(
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
            case 112: {

              isSucc_ = input.readBool();
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
      return emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.internal_static_FNGGFHGAKMD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.internal_static_FNGGFHGAKMD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD.class, emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD.Builder.class);
    }

    public static final int IS_SUCC_FIELD_NUMBER = 14;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 14;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
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
      if (isSucc_ != false) {
        output.writeBool(14, isSucc_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isSucc_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD other = (emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD) obj;

      if (getIsSucc()
          != other.getIsSucc()) return false;
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
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD prototype) {
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
     * CmdId: 9240
     * </pre>
     *
     * Protobuf type {@code FNGGFHGAKMD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FNGGFHGAKMD)
        emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.internal_static_FNGGFHGAKMD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.internal_static_FNGGFHGAKMD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD.class, emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD.newBuilder()
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
        isSucc_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.internal_static_FNGGFHGAKMD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD build() {
        emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD buildPartial() {
        emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD result = new emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD(this);
        result.isSucc_ = isSucc_;
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
        if (other instanceof emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD) {
          return mergeFrom((emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD other) {
        if (other == emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD.getDefaultInstance()) return this;
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
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
        emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 14;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 14;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
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


      // @@protoc_insertion_point(builder_scope:FNGGFHGAKMD)
    }

    // @@protoc_insertion_point(class_scope:FNGGFHGAKMD)
    private static final emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD();
    }

    public static emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FNGGFHGAKMD>
        PARSER = new com.google.protobuf.AbstractParser<FNGGFHGAKMD>() {
      @java.lang.Override
      public FNGGFHGAKMD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FNGGFHGAKMD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FNGGFHGAKMD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FNGGFHGAKMD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FNGGFHGAKMDOuterClass.FNGGFHGAKMD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FNGGFHGAKMD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FNGGFHGAKMD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FNGGFHGAKMD.proto\"\036\n\013FNGGFHGAKMD\022\017\n\007is" +
      "_succ\030\016 \001(\010B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FNGGFHGAKMD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FNGGFHGAKMD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FNGGFHGAKMD_descriptor,
        new java.lang.String[] { "IsSucc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
