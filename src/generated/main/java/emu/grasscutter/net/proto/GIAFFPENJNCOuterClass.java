// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GIAFFPENJNC.proto

package emu.grasscutter.net.proto;

public final class GIAFFPENJNCOuterClass {
  private GIAFFPENJNCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GIAFFPENJNCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GIAFFPENJNC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 AHAIAIPGFDN = 6;</code>
     * @return The aHAIAIPGFDN.
     */
    int getAHAIAIPGFDN();

    /**
     * <code>bool BBNOFLCPEBA = 2;</code>
     * @return The bBNOFLCPEBA.
     */
    boolean getBBNOFLCPEBA();
  }
  /**
   * <pre>
   * Name: GIAFFPENJNC
   * CmdId: 7387
   * </pre>
   *
   * Protobuf type {@code GIAFFPENJNC}
   */
  public static final class GIAFFPENJNC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GIAFFPENJNC)
      GIAFFPENJNCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GIAFFPENJNC.newBuilder() to construct.
    private GIAFFPENJNC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GIAFFPENJNC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GIAFFPENJNC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GIAFFPENJNC(
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
            case 16: {

              bBNOFLCPEBA_ = input.readBool();
              break;
            }
            case 48: {

              aHAIAIPGFDN_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.internal_static_GIAFFPENJNC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.internal_static_GIAFFPENJNC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC.class, emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC.Builder.class);
    }

    public static final int AHAIAIPGFDN_FIELD_NUMBER = 6;
    private int aHAIAIPGFDN_;
    /**
     * <code>uint32 AHAIAIPGFDN = 6;</code>
     * @return The aHAIAIPGFDN.
     */
    @java.lang.Override
    public int getAHAIAIPGFDN() {
      return aHAIAIPGFDN_;
    }

    public static final int BBNOFLCPEBA_FIELD_NUMBER = 2;
    private boolean bBNOFLCPEBA_;
    /**
     * <code>bool BBNOFLCPEBA = 2;</code>
     * @return The bBNOFLCPEBA.
     */
    @java.lang.Override
    public boolean getBBNOFLCPEBA() {
      return bBNOFLCPEBA_;
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
      if (bBNOFLCPEBA_ != false) {
        output.writeBool(2, bBNOFLCPEBA_);
      }
      if (aHAIAIPGFDN_ != 0) {
        output.writeUInt32(6, aHAIAIPGFDN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bBNOFLCPEBA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, bBNOFLCPEBA_);
      }
      if (aHAIAIPGFDN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, aHAIAIPGFDN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC other = (emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC) obj;

      if (getAHAIAIPGFDN()
          != other.getAHAIAIPGFDN()) return false;
      if (getBBNOFLCPEBA()
          != other.getBBNOFLCPEBA()) return false;
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
      hash = (37 * hash) + AHAIAIPGFDN_FIELD_NUMBER;
      hash = (53 * hash) + getAHAIAIPGFDN();
      hash = (37 * hash) + BBNOFLCPEBA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBBNOFLCPEBA());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC prototype) {
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
     * Name: GIAFFPENJNC
     * CmdId: 7387
     * </pre>
     *
     * Protobuf type {@code GIAFFPENJNC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GIAFFPENJNC)
        emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.internal_static_GIAFFPENJNC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.internal_static_GIAFFPENJNC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC.class, emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC.newBuilder()
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
        aHAIAIPGFDN_ = 0;

        bBNOFLCPEBA_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.internal_static_GIAFFPENJNC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC build() {
        emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC buildPartial() {
        emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC result = new emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC(this);
        result.aHAIAIPGFDN_ = aHAIAIPGFDN_;
        result.bBNOFLCPEBA_ = bBNOFLCPEBA_;
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
        if (other instanceof emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC) {
          return mergeFrom((emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC other) {
        if (other == emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC.getDefaultInstance()) return this;
        if (other.getAHAIAIPGFDN() != 0) {
          setAHAIAIPGFDN(other.getAHAIAIPGFDN());
        }
        if (other.getBBNOFLCPEBA() != false) {
          setBBNOFLCPEBA(other.getBBNOFLCPEBA());
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
        emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int aHAIAIPGFDN_ ;
      /**
       * <code>uint32 AHAIAIPGFDN = 6;</code>
       * @return The aHAIAIPGFDN.
       */
      @java.lang.Override
      public int getAHAIAIPGFDN() {
        return aHAIAIPGFDN_;
      }
      /**
       * <code>uint32 AHAIAIPGFDN = 6;</code>
       * @param value The aHAIAIPGFDN to set.
       * @return This builder for chaining.
       */
      public Builder setAHAIAIPGFDN(int value) {
        
        aHAIAIPGFDN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AHAIAIPGFDN = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAHAIAIPGFDN() {
        
        aHAIAIPGFDN_ = 0;
        onChanged();
        return this;
      }

      private boolean bBNOFLCPEBA_ ;
      /**
       * <code>bool BBNOFLCPEBA = 2;</code>
       * @return The bBNOFLCPEBA.
       */
      @java.lang.Override
      public boolean getBBNOFLCPEBA() {
        return bBNOFLCPEBA_;
      }
      /**
       * <code>bool BBNOFLCPEBA = 2;</code>
       * @param value The bBNOFLCPEBA to set.
       * @return This builder for chaining.
       */
      public Builder setBBNOFLCPEBA(boolean value) {
        
        bBNOFLCPEBA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool BBNOFLCPEBA = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBBNOFLCPEBA() {
        
        bBNOFLCPEBA_ = false;
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


      // @@protoc_insertion_point(builder_scope:GIAFFPENJNC)
    }

    // @@protoc_insertion_point(class_scope:GIAFFPENJNC)
    private static final emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC();
    }

    public static emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GIAFFPENJNC>
        PARSER = new com.google.protobuf.AbstractParser<GIAFFPENJNC>() {
      @java.lang.Override
      public GIAFFPENJNC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GIAFFPENJNC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GIAFFPENJNC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GIAFFPENJNC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GIAFFPENJNCOuterClass.GIAFFPENJNC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GIAFFPENJNC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GIAFFPENJNC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GIAFFPENJNC.proto\"7\n\013GIAFFPENJNC\022\023\n\013AH" +
      "AIAIPGFDN\030\006 \001(\r\022\023\n\013BBNOFLCPEBA\030\002 \001(\010B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GIAFFPENJNC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GIAFFPENJNC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GIAFFPENJNC_descriptor,
        new java.lang.String[] { "AHAIAIPGFDN", "BBNOFLCPEBA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
