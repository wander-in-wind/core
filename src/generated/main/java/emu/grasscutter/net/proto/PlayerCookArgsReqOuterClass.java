// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCookArgsReq.proto

package emu.grasscutter.net.proto;

public final class PlayerCookArgsReqOuterClass {
  private PlayerCookArgsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCookArgsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCookArgsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OMPOMKPPLEH = 14;</code>
     * @return The oMPOMKPPLEH.
     */
    int getOMPOMKPPLEH();

    /**
     * <code>uint32 DIIJPMJFNOL = 10;</code>
     * @return The dIIJPMJFNOL.
     */
    int getDIIJPMJFNOL();
  }
  /**
   * <pre>
   * Name: FIEHOAOBLHN
   * CmdId: 145
   * </pre>
   *
   * Protobuf type {@code PlayerCookArgsReq}
   */
  public static final class PlayerCookArgsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCookArgsReq)
      PlayerCookArgsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCookArgsReq.newBuilder() to construct.
    private PlayerCookArgsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCookArgsReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCookArgsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerCookArgsReq(
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
            case 80: {

              dIIJPMJFNOL_ = input.readUInt32();
              break;
            }
            case 112: {

              oMPOMKPPLEH_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.class, emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.Builder.class);
    }

    public static final int OMPOMKPPLEH_FIELD_NUMBER = 14;
    private int oMPOMKPPLEH_;
    /**
     * <code>uint32 OMPOMKPPLEH = 14;</code>
     * @return The oMPOMKPPLEH.
     */
    @java.lang.Override
    public int getOMPOMKPPLEH() {
      return oMPOMKPPLEH_;
    }

    public static final int DIIJPMJFNOL_FIELD_NUMBER = 10;
    private int dIIJPMJFNOL_;
    /**
     * <code>uint32 DIIJPMJFNOL = 10;</code>
     * @return The dIIJPMJFNOL.
     */
    @java.lang.Override
    public int getDIIJPMJFNOL() {
      return dIIJPMJFNOL_;
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
      if (dIIJPMJFNOL_ != 0) {
        output.writeUInt32(10, dIIJPMJFNOL_);
      }
      if (oMPOMKPPLEH_ != 0) {
        output.writeUInt32(14, oMPOMKPPLEH_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dIIJPMJFNOL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, dIIJPMJFNOL_);
      }
      if (oMPOMKPPLEH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, oMPOMKPPLEH_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq other = (emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq) obj;

      if (getOMPOMKPPLEH()
          != other.getOMPOMKPPLEH()) return false;
      if (getDIIJPMJFNOL()
          != other.getDIIJPMJFNOL()) return false;
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
      hash = (37 * hash) + OMPOMKPPLEH_FIELD_NUMBER;
      hash = (53 * hash) + getOMPOMKPPLEH();
      hash = (37 * hash) + DIIJPMJFNOL_FIELD_NUMBER;
      hash = (53 * hash) + getDIIJPMJFNOL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq prototype) {
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
     * Name: FIEHOAOBLHN
     * CmdId: 145
     * </pre>
     *
     * Protobuf type {@code PlayerCookArgsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCookArgsReq)
        emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.class, emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.newBuilder()
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
        oMPOMKPPLEH_ = 0;

        dIIJPMJFNOL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq build() {
        emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq buildPartial() {
        emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq result = new emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq(this);
        result.oMPOMKPPLEH_ = oMPOMKPPLEH_;
        result.dIIJPMJFNOL_ = dIIJPMJFNOL_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq other) {
        if (other == emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.getDefaultInstance()) return this;
        if (other.getOMPOMKPPLEH() != 0) {
          setOMPOMKPPLEH(other.getOMPOMKPPLEH());
        }
        if (other.getDIIJPMJFNOL() != 0) {
          setDIIJPMJFNOL(other.getDIIJPMJFNOL());
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
        emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oMPOMKPPLEH_ ;
      /**
       * <code>uint32 OMPOMKPPLEH = 14;</code>
       * @return The oMPOMKPPLEH.
       */
      @java.lang.Override
      public int getOMPOMKPPLEH() {
        return oMPOMKPPLEH_;
      }
      /**
       * <code>uint32 OMPOMKPPLEH = 14;</code>
       * @param value The oMPOMKPPLEH to set.
       * @return This builder for chaining.
       */
      public Builder setOMPOMKPPLEH(int value) {
        
        oMPOMKPPLEH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OMPOMKPPLEH = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOMPOMKPPLEH() {
        
        oMPOMKPPLEH_ = 0;
        onChanged();
        return this;
      }

      private int dIIJPMJFNOL_ ;
      /**
       * <code>uint32 DIIJPMJFNOL = 10;</code>
       * @return The dIIJPMJFNOL.
       */
      @java.lang.Override
      public int getDIIJPMJFNOL() {
        return dIIJPMJFNOL_;
      }
      /**
       * <code>uint32 DIIJPMJFNOL = 10;</code>
       * @param value The dIIJPMJFNOL to set.
       * @return This builder for chaining.
       */
      public Builder setDIIJPMJFNOL(int value) {
        
        dIIJPMJFNOL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DIIJPMJFNOL = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDIIJPMJFNOL() {
        
        dIIJPMJFNOL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCookArgsReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerCookArgsReq)
    private static final emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq();
    }

    public static emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCookArgsReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCookArgsReq>() {
      @java.lang.Override
      public PlayerCookArgsReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerCookArgsReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerCookArgsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCookArgsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCookArgsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCookArgsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerCookArgsReq.proto\"=\n\021PlayerCookA" +
      "rgsReq\022\023\n\013OMPOMKPPLEH\030\016 \001(\r\022\023\n\013DIIJPMJFN" +
      "OL\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerCookArgsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCookArgsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCookArgsReq_descriptor,
        new java.lang.String[] { "OMPOMKPPLEH", "DIIJPMJFNOL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
