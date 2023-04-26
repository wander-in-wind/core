// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MechanicusUnlockGearRsp.proto

package emu.grasscutter.net.proto;

public final class MechanicusUnlockGearRspOuterClass {
  private MechanicusUnlockGearRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MechanicusUnlockGearRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MechanicusUnlockGearRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gear_id = 5;</code>
     * @return The gearId.
     */
    int getGearId();

    /**
     * <code>uint32 mechanicus_id = 8;</code>
     * @return The mechanicusId.
     */
    int getMechanicusId();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 3972
   * Name: CHIANHIJGEP
   * </pre>
   *
   * Protobuf type {@code MechanicusUnlockGearRsp}
   */
  public static final class MechanicusUnlockGearRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MechanicusUnlockGearRsp)
      MechanicusUnlockGearRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MechanicusUnlockGearRsp.newBuilder() to construct.
    private MechanicusUnlockGearRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MechanicusUnlockGearRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MechanicusUnlockGearRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MechanicusUnlockGearRsp(
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
            case 40: {

              gearId_ = input.readUInt32();
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 64: {

              mechanicusId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.internal_static_MechanicusUnlockGearRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.internal_static_MechanicusUnlockGearRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp.class, emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp.Builder.class);
    }

    public static final int GEAR_ID_FIELD_NUMBER = 5;
    private int gearId_;
    /**
     * <code>uint32 gear_id = 5;</code>
     * @return The gearId.
     */
    @java.lang.Override
    public int getGearId() {
      return gearId_;
    }

    public static final int MECHANICUS_ID_FIELD_NUMBER = 8;
    private int mechanicusId_;
    /**
     * <code>uint32 mechanicus_id = 8;</code>
     * @return The mechanicusId.
     */
    @java.lang.Override
    public int getMechanicusId() {
      return mechanicusId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (gearId_ != 0) {
        output.writeUInt32(5, gearId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (mechanicusId_ != 0) {
        output.writeUInt32(8, mechanicusId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gearId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gearId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (mechanicusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, mechanicusId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp other = (emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp) obj;

      if (getGearId()
          != other.getGearId()) return false;
      if (getMechanicusId()
          != other.getMechanicusId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + GEAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGearId();
      hash = (37 * hash) + MECHANICUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMechanicusId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp prototype) {
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
     * CmdId: 3972
     * Name: CHIANHIJGEP
     * </pre>
     *
     * Protobuf type {@code MechanicusUnlockGearRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MechanicusUnlockGearRsp)
        emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.internal_static_MechanicusUnlockGearRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.internal_static_MechanicusUnlockGearRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp.class, emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp.newBuilder()
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
        gearId_ = 0;

        mechanicusId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.internal_static_MechanicusUnlockGearRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp build() {
        emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp buildPartial() {
        emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp result = new emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp(this);
        result.gearId_ = gearId_;
        result.mechanicusId_ = mechanicusId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp) {
          return mergeFrom((emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp other) {
        if (other == emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp.getDefaultInstance()) return this;
        if (other.getGearId() != 0) {
          setGearId(other.getGearId());
        }
        if (other.getMechanicusId() != 0) {
          setMechanicusId(other.getMechanicusId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gearId_ ;
      /**
       * <code>uint32 gear_id = 5;</code>
       * @return The gearId.
       */
      @java.lang.Override
      public int getGearId() {
        return gearId_;
      }
      /**
       * <code>uint32 gear_id = 5;</code>
       * @param value The gearId to set.
       * @return This builder for chaining.
       */
      public Builder setGearId(int value) {
        
        gearId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gear_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGearId() {
        
        gearId_ = 0;
        onChanged();
        return this;
      }

      private int mechanicusId_ ;
      /**
       * <code>uint32 mechanicus_id = 8;</code>
       * @return The mechanicusId.
       */
      @java.lang.Override
      public int getMechanicusId() {
        return mechanicusId_;
      }
      /**
       * <code>uint32 mechanicus_id = 8;</code>
       * @param value The mechanicusId to set.
       * @return This builder for chaining.
       */
      public Builder setMechanicusId(int value) {
        
        mechanicusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mechanicus_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMechanicusId() {
        
        mechanicusId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MechanicusUnlockGearRsp)
    }

    // @@protoc_insertion_point(class_scope:MechanicusUnlockGearRsp)
    private static final emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp();
    }

    public static emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MechanicusUnlockGearRsp>
        PARSER = new com.google.protobuf.AbstractParser<MechanicusUnlockGearRsp>() {
      @java.lang.Override
      public MechanicusUnlockGearRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MechanicusUnlockGearRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MechanicusUnlockGearRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MechanicusUnlockGearRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MechanicusUnlockGearRspOuterClass.MechanicusUnlockGearRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MechanicusUnlockGearRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MechanicusUnlockGearRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035MechanicusUnlockGearRsp.proto\"R\n\027Mecha" +
      "nicusUnlockGearRsp\022\017\n\007gear_id\030\005 \001(\r\022\025\n\rm" +
      "echanicus_id\030\010 \001(\r\022\017\n\007retcode\030\006 \001(\005B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MechanicusUnlockGearRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MechanicusUnlockGearRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MechanicusUnlockGearRsp_descriptor,
        new java.lang.String[] { "GearId", "MechanicusId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
