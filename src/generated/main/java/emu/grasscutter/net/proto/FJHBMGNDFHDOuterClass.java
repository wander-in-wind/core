// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FJHBMGNDFHD.proto

package emu.grasscutter.net.proto;

public final class FJHBMGNDFHDOuterClass {
  private FJHBMGNDFHDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FJHBMGNDFHDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FJHBMGNDFHD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float MBBOKPAIFHM = 9;</code>
     * @return The mBBOKPAIFHM.
     */
    float getMBBOKPAIFHM();
  }
  /**
   * <pre>
   * Name: FJHBMGNDFHD
   * </pre>
   *
   * Protobuf type {@code FJHBMGNDFHD}
   */
  public static final class FJHBMGNDFHD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FJHBMGNDFHD)
      FJHBMGNDFHDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FJHBMGNDFHD.newBuilder() to construct.
    private FJHBMGNDFHD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FJHBMGNDFHD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FJHBMGNDFHD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FJHBMGNDFHD(
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
            case 77: {

              mBBOKPAIFHM_ = input.readFloat();
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
      return emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.internal_static_FJHBMGNDFHD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.internal_static_FJHBMGNDFHD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD.class, emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD.Builder.class);
    }

    public static final int MBBOKPAIFHM_FIELD_NUMBER = 9;
    private float mBBOKPAIFHM_;
    /**
     * <code>float MBBOKPAIFHM = 9;</code>
     * @return The mBBOKPAIFHM.
     */
    @java.lang.Override
    public float getMBBOKPAIFHM() {
      return mBBOKPAIFHM_;
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
      if (mBBOKPAIFHM_ != 0F) {
        output.writeFloat(9, mBBOKPAIFHM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mBBOKPAIFHM_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, mBBOKPAIFHM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD other = (emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD) obj;

      if (java.lang.Float.floatToIntBits(getMBBOKPAIFHM())
          != java.lang.Float.floatToIntBits(
              other.getMBBOKPAIFHM())) return false;
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
      hash = (37 * hash) + MBBOKPAIFHM_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMBBOKPAIFHM());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD prototype) {
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
     * Name: FJHBMGNDFHD
     * </pre>
     *
     * Protobuf type {@code FJHBMGNDFHD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FJHBMGNDFHD)
        emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.internal_static_FJHBMGNDFHD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.internal_static_FJHBMGNDFHD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD.class, emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD.newBuilder()
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
        mBBOKPAIFHM_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.internal_static_FJHBMGNDFHD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD build() {
        emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD buildPartial() {
        emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD result = new emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD(this);
        result.mBBOKPAIFHM_ = mBBOKPAIFHM_;
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
        if (other instanceof emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD) {
          return mergeFrom((emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD other) {
        if (other == emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD.getDefaultInstance()) return this;
        if (other.getMBBOKPAIFHM() != 0F) {
          setMBBOKPAIFHM(other.getMBBOKPAIFHM());
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
        emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float mBBOKPAIFHM_ ;
      /**
       * <code>float MBBOKPAIFHM = 9;</code>
       * @return The mBBOKPAIFHM.
       */
      @java.lang.Override
      public float getMBBOKPAIFHM() {
        return mBBOKPAIFHM_;
      }
      /**
       * <code>float MBBOKPAIFHM = 9;</code>
       * @param value The mBBOKPAIFHM to set.
       * @return This builder for chaining.
       */
      public Builder setMBBOKPAIFHM(float value) {
        
        mBBOKPAIFHM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float MBBOKPAIFHM = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMBBOKPAIFHM() {
        
        mBBOKPAIFHM_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:FJHBMGNDFHD)
    }

    // @@protoc_insertion_point(class_scope:FJHBMGNDFHD)
    private static final emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD();
    }

    public static emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FJHBMGNDFHD>
        PARSER = new com.google.protobuf.AbstractParser<FJHBMGNDFHD>() {
      @java.lang.Override
      public FJHBMGNDFHD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FJHBMGNDFHD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FJHBMGNDFHD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FJHBMGNDFHD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FJHBMGNDFHDOuterClass.FJHBMGNDFHD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FJHBMGNDFHD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FJHBMGNDFHD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FJHBMGNDFHD.proto\"\"\n\013FJHBMGNDFHD\022\023\n\013MB" +
      "BOKPAIFHM\030\t \001(\002B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FJHBMGNDFHD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FJHBMGNDFHD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FJHBMGNDFHD_descriptor,
        new java.lang.String[] { "MBBOKPAIFHM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
