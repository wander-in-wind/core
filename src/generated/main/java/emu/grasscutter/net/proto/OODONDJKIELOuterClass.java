// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OODONDJKIEL.proto

package emu.grasscutter.net.proto;

public final class OODONDJKIELOuterClass {
  private OODONDJKIELOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OODONDJKIELOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OODONDJKIEL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 AHAIAIPGFDN = 2;</code>
     * @return The aHAIAIPGFDN.
     */
    int getAHAIAIPGFDN();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 LKFDEJMGHMP = 7;</code>
     * @return The lKFDEJMGHMP.
     */
    int getLKFDEJMGHMP();
  }
  /**
   * <pre>
   * Name: OODONDJKIEL
   * CmdId: 7245
   * </pre>
   *
   * Protobuf type {@code OODONDJKIEL}
   */
  public static final class OODONDJKIEL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OODONDJKIEL)
      OODONDJKIELOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OODONDJKIEL.newBuilder() to construct.
    private OODONDJKIEL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OODONDJKIEL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OODONDJKIEL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OODONDJKIEL(
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

              aHAIAIPGFDN_ = input.readUInt32();
              break;
            }
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 56: {

              lKFDEJMGHMP_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.OODONDJKIELOuterClass.internal_static_OODONDJKIEL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OODONDJKIELOuterClass.internal_static_OODONDJKIEL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL.class, emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL.Builder.class);
    }

    public static final int AHAIAIPGFDN_FIELD_NUMBER = 2;
    private int aHAIAIPGFDN_;
    /**
     * <code>uint32 AHAIAIPGFDN = 2;</code>
     * @return The aHAIAIPGFDN.
     */
    @java.lang.Override
    public int getAHAIAIPGFDN() {
      return aHAIAIPGFDN_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int LKFDEJMGHMP_FIELD_NUMBER = 7;
    private int lKFDEJMGHMP_;
    /**
     * <code>uint32 LKFDEJMGHMP = 7;</code>
     * @return The lKFDEJMGHMP.
     */
    @java.lang.Override
    public int getLKFDEJMGHMP() {
      return lKFDEJMGHMP_;
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
      if (aHAIAIPGFDN_ != 0) {
        output.writeUInt32(2, aHAIAIPGFDN_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (lKFDEJMGHMP_ != 0) {
        output.writeUInt32(7, lKFDEJMGHMP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aHAIAIPGFDN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, aHAIAIPGFDN_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (lKFDEJMGHMP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, lKFDEJMGHMP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL other = (emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL) obj;

      if (getAHAIAIPGFDN()
          != other.getAHAIAIPGFDN()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getLKFDEJMGHMP()
          != other.getLKFDEJMGHMP()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + LKFDEJMGHMP_FIELD_NUMBER;
      hash = (53 * hash) + getLKFDEJMGHMP();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL prototype) {
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
     * Name: OODONDJKIEL
     * CmdId: 7245
     * </pre>
     *
     * Protobuf type {@code OODONDJKIEL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OODONDJKIEL)
        emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIELOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OODONDJKIELOuterClass.internal_static_OODONDJKIEL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OODONDJKIELOuterClass.internal_static_OODONDJKIEL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL.class, emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL.newBuilder()
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

        retcode_ = 0;

        lKFDEJMGHMP_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OODONDJKIELOuterClass.internal_static_OODONDJKIEL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL build() {
        emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL buildPartial() {
        emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL result = new emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL(this);
        result.aHAIAIPGFDN_ = aHAIAIPGFDN_;
        result.retcode_ = retcode_;
        result.lKFDEJMGHMP_ = lKFDEJMGHMP_;
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
        if (other instanceof emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL) {
          return mergeFrom((emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL other) {
        if (other == emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL.getDefaultInstance()) return this;
        if (other.getAHAIAIPGFDN() != 0) {
          setAHAIAIPGFDN(other.getAHAIAIPGFDN());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getLKFDEJMGHMP() != 0) {
          setLKFDEJMGHMP(other.getLKFDEJMGHMP());
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
        emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL) e.getUnfinishedMessage();
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
       * <code>uint32 AHAIAIPGFDN = 2;</code>
       * @return The aHAIAIPGFDN.
       */
      @java.lang.Override
      public int getAHAIAIPGFDN() {
        return aHAIAIPGFDN_;
      }
      /**
       * <code>uint32 AHAIAIPGFDN = 2;</code>
       * @param value The aHAIAIPGFDN to set.
       * @return This builder for chaining.
       */
      public Builder setAHAIAIPGFDN(int value) {
        
        aHAIAIPGFDN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AHAIAIPGFDN = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAHAIAIPGFDN() {
        
        aHAIAIPGFDN_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int lKFDEJMGHMP_ ;
      /**
       * <code>uint32 LKFDEJMGHMP = 7;</code>
       * @return The lKFDEJMGHMP.
       */
      @java.lang.Override
      public int getLKFDEJMGHMP() {
        return lKFDEJMGHMP_;
      }
      /**
       * <code>uint32 LKFDEJMGHMP = 7;</code>
       * @param value The lKFDEJMGHMP to set.
       * @return This builder for chaining.
       */
      public Builder setLKFDEJMGHMP(int value) {
        
        lKFDEJMGHMP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LKFDEJMGHMP = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLKFDEJMGHMP() {
        
        lKFDEJMGHMP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OODONDJKIEL)
    }

    // @@protoc_insertion_point(class_scope:OODONDJKIEL)
    private static final emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL();
    }

    public static emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OODONDJKIEL>
        PARSER = new com.google.protobuf.AbstractParser<OODONDJKIEL>() {
      @java.lang.Override
      public OODONDJKIEL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OODONDJKIEL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OODONDJKIEL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OODONDJKIEL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OODONDJKIELOuterClass.OODONDJKIEL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OODONDJKIEL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OODONDJKIEL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OODONDJKIEL.proto\"H\n\013OODONDJKIEL\022\023\n\013AH" +
      "AIAIPGFDN\030\002 \001(\r\022\017\n\007retcode\030\003 \001(\005\022\023\n\013LKFD" +
      "EJMGHMP\030\007 \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OODONDJKIEL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OODONDJKIEL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OODONDJKIEL_descriptor,
        new java.lang.String[] { "AHAIAIPGFDN", "Retcode", "LKFDEJMGHMP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
