// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FAPDLKNEPCH.proto

package emu.grasscutter.net.proto;

public final class FAPDLKNEPCHOuterClass {
  private FAPDLKNEPCHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FAPDLKNEPCHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FAPDLKNEPCH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>string transaction = 6;</code>
     * @return The transaction.
     */
    java.lang.String getTransaction();
    /**
     * <code>string transaction = 6;</code>
     * @return The bytes for transaction.
     */
    com.google.protobuf.ByteString
        getTransactionBytes();
  }
  /**
   * <pre>
   * CmdId: 20550
   * Name: FAPDLKNEPCH
   * </pre>
   *
   * Protobuf type {@code FAPDLKNEPCH}
   */
  public static final class FAPDLKNEPCH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FAPDLKNEPCH)
      FAPDLKNEPCHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FAPDLKNEPCH.newBuilder() to construct.
    private FAPDLKNEPCH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FAPDLKNEPCH() {
      transaction_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FAPDLKNEPCH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FAPDLKNEPCH(
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
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              transaction_ = s;
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.internal_static_FAPDLKNEPCH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.internal_static_FAPDLKNEPCH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH.class, emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TRANSACTION_FIELD_NUMBER = 6;
    private volatile java.lang.Object transaction_;
    /**
     * <code>string transaction = 6;</code>
     * @return The transaction.
     */
    @java.lang.Override
    public java.lang.String getTransaction() {
      java.lang.Object ref = transaction_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transaction_ = s;
        return s;
      }
    }
    /**
     * <code>string transaction = 6;</code>
     * @return The bytes for transaction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTransactionBytes() {
      java.lang.Object ref = transaction_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transaction_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, transaction_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, transaction_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH other = (emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getTransaction()
          .equals(other.getTransaction())) return false;
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
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH prototype) {
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
     * CmdId: 20550
     * Name: FAPDLKNEPCH
     * </pre>
     *
     * Protobuf type {@code FAPDLKNEPCH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FAPDLKNEPCH)
        emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.internal_static_FAPDLKNEPCH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.internal_static_FAPDLKNEPCH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH.class, emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH.newBuilder()
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

        transaction_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.internal_static_FAPDLKNEPCH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH build() {
        emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH buildPartial() {
        emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH result = new emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH(this);
        result.retcode_ = retcode_;
        result.transaction_ = transaction_;
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
        if (other instanceof emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH) {
          return mergeFrom((emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH other) {
        if (other == emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.getTransaction().isEmpty()) {
          transaction_ = other.transaction_;
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
        emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object transaction_ = "";
      /**
       * <code>string transaction = 6;</code>
       * @return The transaction.
       */
      public java.lang.String getTransaction() {
        java.lang.Object ref = transaction_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          transaction_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string transaction = 6;</code>
       * @return The bytes for transaction.
       */
      public com.google.protobuf.ByteString
          getTransactionBytes() {
        java.lang.Object ref = transaction_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          transaction_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string transaction = 6;</code>
       * @param value The transaction to set.
       * @return This builder for chaining.
       */
      public Builder setTransaction(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        transaction_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string transaction = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTransaction() {
        
        transaction_ = getDefaultInstance().getTransaction();
        onChanged();
        return this;
      }
      /**
       * <code>string transaction = 6;</code>
       * @param value The bytes for transaction to set.
       * @return This builder for chaining.
       */
      public Builder setTransactionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        transaction_ = value;
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


      // @@protoc_insertion_point(builder_scope:FAPDLKNEPCH)
    }

    // @@protoc_insertion_point(class_scope:FAPDLKNEPCH)
    private static final emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH();
    }

    public static emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FAPDLKNEPCH>
        PARSER = new com.google.protobuf.AbstractParser<FAPDLKNEPCH>() {
      @java.lang.Override
      public FAPDLKNEPCH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FAPDLKNEPCH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FAPDLKNEPCH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FAPDLKNEPCH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FAPDLKNEPCHOuterClass.FAPDLKNEPCH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FAPDLKNEPCH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FAPDLKNEPCH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FAPDLKNEPCH.proto\"3\n\013FAPDLKNEPCH\022\017\n\007re" +
      "tcode\030\016 \001(\005\022\023\n\013transaction\030\006 \001(\tB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FAPDLKNEPCH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FAPDLKNEPCH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FAPDLKNEPCH_descriptor,
        new java.lang.String[] { "Retcode", "Transaction", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
