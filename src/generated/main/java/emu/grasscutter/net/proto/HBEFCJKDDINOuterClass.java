// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HBEFCJKDDIN.proto

package emu.grasscutter.net.proto;

public final class HBEFCJKDDINOuterClass {
  private HBEFCJKDDINOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HBEFCJKDDINOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HBEFCJKDDIN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OIIAKJGOIMA = 9;</code>
     * @return The oIIAKJGOIMA.
     */
    int getOIIAKJGOIMA();

    /**
     * <code>uint32 ACEOMANEIKE = 8;</code>
     * @return The aCEOMANEIKE.
     */
    int getACEOMANEIKE();
  }
  /**
   * <pre>
   * Name: HBEFCJKDDIN
   * </pre>
   *
   * Protobuf type {@code HBEFCJKDDIN}
   */
  public static final class HBEFCJKDDIN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HBEFCJKDDIN)
      HBEFCJKDDINOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HBEFCJKDDIN.newBuilder() to construct.
    private HBEFCJKDDIN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HBEFCJKDDIN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HBEFCJKDDIN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HBEFCJKDDIN(
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

              aCEOMANEIKE_ = input.readUInt32();
              break;
            }
            case 72: {

              oIIAKJGOIMA_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.internal_static_HBEFCJKDDIN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.internal_static_HBEFCJKDDIN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN.class, emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN.Builder.class);
    }

    public static final int OIIAKJGOIMA_FIELD_NUMBER = 9;
    private int oIIAKJGOIMA_;
    /**
     * <code>uint32 OIIAKJGOIMA = 9;</code>
     * @return The oIIAKJGOIMA.
     */
    @java.lang.Override
    public int getOIIAKJGOIMA() {
      return oIIAKJGOIMA_;
    }

    public static final int ACEOMANEIKE_FIELD_NUMBER = 8;
    private int aCEOMANEIKE_;
    /**
     * <code>uint32 ACEOMANEIKE = 8;</code>
     * @return The aCEOMANEIKE.
     */
    @java.lang.Override
    public int getACEOMANEIKE() {
      return aCEOMANEIKE_;
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
      if (aCEOMANEIKE_ != 0) {
        output.writeUInt32(8, aCEOMANEIKE_);
      }
      if (oIIAKJGOIMA_ != 0) {
        output.writeUInt32(9, oIIAKJGOIMA_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aCEOMANEIKE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, aCEOMANEIKE_);
      }
      if (oIIAKJGOIMA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, oIIAKJGOIMA_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN other = (emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN) obj;

      if (getOIIAKJGOIMA()
          != other.getOIIAKJGOIMA()) return false;
      if (getACEOMANEIKE()
          != other.getACEOMANEIKE()) return false;
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
      hash = (37 * hash) + OIIAKJGOIMA_FIELD_NUMBER;
      hash = (53 * hash) + getOIIAKJGOIMA();
      hash = (37 * hash) + ACEOMANEIKE_FIELD_NUMBER;
      hash = (53 * hash) + getACEOMANEIKE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN prototype) {
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
     * Name: HBEFCJKDDIN
     * </pre>
     *
     * Protobuf type {@code HBEFCJKDDIN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HBEFCJKDDIN)
        emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDINOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.internal_static_HBEFCJKDDIN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.internal_static_HBEFCJKDDIN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN.class, emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN.newBuilder()
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
        oIIAKJGOIMA_ = 0;

        aCEOMANEIKE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.internal_static_HBEFCJKDDIN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN build() {
        emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN buildPartial() {
        emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN result = new emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN(this);
        result.oIIAKJGOIMA_ = oIIAKJGOIMA_;
        result.aCEOMANEIKE_ = aCEOMANEIKE_;
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
        if (other instanceof emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN) {
          return mergeFrom((emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN other) {
        if (other == emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN.getDefaultInstance()) return this;
        if (other.getOIIAKJGOIMA() != 0) {
          setOIIAKJGOIMA(other.getOIIAKJGOIMA());
        }
        if (other.getACEOMANEIKE() != 0) {
          setACEOMANEIKE(other.getACEOMANEIKE());
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
        emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oIIAKJGOIMA_ ;
      /**
       * <code>uint32 OIIAKJGOIMA = 9;</code>
       * @return The oIIAKJGOIMA.
       */
      @java.lang.Override
      public int getOIIAKJGOIMA() {
        return oIIAKJGOIMA_;
      }
      /**
       * <code>uint32 OIIAKJGOIMA = 9;</code>
       * @param value The oIIAKJGOIMA to set.
       * @return This builder for chaining.
       */
      public Builder setOIIAKJGOIMA(int value) {
        
        oIIAKJGOIMA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OIIAKJGOIMA = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOIIAKJGOIMA() {
        
        oIIAKJGOIMA_ = 0;
        onChanged();
        return this;
      }

      private int aCEOMANEIKE_ ;
      /**
       * <code>uint32 ACEOMANEIKE = 8;</code>
       * @return The aCEOMANEIKE.
       */
      @java.lang.Override
      public int getACEOMANEIKE() {
        return aCEOMANEIKE_;
      }
      /**
       * <code>uint32 ACEOMANEIKE = 8;</code>
       * @param value The aCEOMANEIKE to set.
       * @return This builder for chaining.
       */
      public Builder setACEOMANEIKE(int value) {
        
        aCEOMANEIKE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ACEOMANEIKE = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearACEOMANEIKE() {
        
        aCEOMANEIKE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HBEFCJKDDIN)
    }

    // @@protoc_insertion_point(class_scope:HBEFCJKDDIN)
    private static final emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN();
    }

    public static emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HBEFCJKDDIN>
        PARSER = new com.google.protobuf.AbstractParser<HBEFCJKDDIN>() {
      @java.lang.Override
      public HBEFCJKDDIN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HBEFCJKDDIN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HBEFCJKDDIN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HBEFCJKDDIN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HBEFCJKDDINOuterClass.HBEFCJKDDIN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HBEFCJKDDIN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HBEFCJKDDIN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HBEFCJKDDIN.proto\"7\n\013HBEFCJKDDIN\022\023\n\013OI" +
      "IAKJGOIMA\030\t \001(\r\022\023\n\013ACEOMANEIKE\030\010 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HBEFCJKDDIN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HBEFCJKDDIN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HBEFCJKDDIN_descriptor,
        new java.lang.String[] { "OIIAKJGOIMA", "ACEOMANEIKE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
