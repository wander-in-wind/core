// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CANJOFHONKD.proto

package emu.grasscutter.net.proto;

public final class CANJOFHONKDOuterClass {
  private CANJOFHONKDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CANJOFHONKDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CANJOFHONKD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OKEIPKBLLMC = 2;</code>
     * @return The oKEIPKBLLMC.
     */
    int getOKEIPKBLLMC();

    /**
     * <code>uint32 npc_id = 10;</code>
     * @return The npcId.
     */
    int getNpcId();

    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();
  }
  /**
   * <pre>
   * Name: CANJOFHONKD
   * </pre>
   *
   * Protobuf type {@code CANJOFHONKD}
   */
  public static final class CANJOFHONKD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CANJOFHONKD)
      CANJOFHONKDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CANJOFHONKD.newBuilder() to construct.
    private CANJOFHONKD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CANJOFHONKD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CANJOFHONKD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CANJOFHONKD(
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

              oKEIPKBLLMC_ = input.readUInt32();
              break;
            }
            case 56: {

              isFinished_ = input.readBool();
              break;
            }
            case 80: {

              npcId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CANJOFHONKDOuterClass.internal_static_CANJOFHONKD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CANJOFHONKDOuterClass.internal_static_CANJOFHONKD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD.class, emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD.Builder.class);
    }

    public static final int OKEIPKBLLMC_FIELD_NUMBER = 2;
    private int oKEIPKBLLMC_;
    /**
     * <code>uint32 OKEIPKBLLMC = 2;</code>
     * @return The oKEIPKBLLMC.
     */
    @java.lang.Override
    public int getOKEIPKBLLMC() {
      return oKEIPKBLLMC_;
    }

    public static final int NPC_ID_FIELD_NUMBER = 10;
    private int npcId_;
    /**
     * <code>uint32 npc_id = 10;</code>
     * @return The npcId.
     */
    @java.lang.Override
    public int getNpcId() {
      return npcId_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 7;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
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
      if (oKEIPKBLLMC_ != 0) {
        output.writeUInt32(2, oKEIPKBLLMC_);
      }
      if (isFinished_ != false) {
        output.writeBool(7, isFinished_);
      }
      if (npcId_ != 0) {
        output.writeUInt32(10, npcId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oKEIPKBLLMC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, oKEIPKBLLMC_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isFinished_);
      }
      if (npcId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, npcId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD other = (emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD) obj;

      if (getOKEIPKBLLMC()
          != other.getOKEIPKBLLMC()) return false;
      if (getNpcId()
          != other.getNpcId()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
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
      hash = (37 * hash) + OKEIPKBLLMC_FIELD_NUMBER;
      hash = (53 * hash) + getOKEIPKBLLMC();
      hash = (37 * hash) + NPC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcId();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD prototype) {
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
     * Name: CANJOFHONKD
     * </pre>
     *
     * Protobuf type {@code CANJOFHONKD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CANJOFHONKD)
        emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CANJOFHONKDOuterClass.internal_static_CANJOFHONKD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CANJOFHONKDOuterClass.internal_static_CANJOFHONKD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD.class, emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD.newBuilder()
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
        oKEIPKBLLMC_ = 0;

        npcId_ = 0;

        isFinished_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CANJOFHONKDOuterClass.internal_static_CANJOFHONKD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD build() {
        emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD buildPartial() {
        emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD result = new emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD(this);
        result.oKEIPKBLLMC_ = oKEIPKBLLMC_;
        result.npcId_ = npcId_;
        result.isFinished_ = isFinished_;
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
        if (other instanceof emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD) {
          return mergeFrom((emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD other) {
        if (other == emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD.getDefaultInstance()) return this;
        if (other.getOKEIPKBLLMC() != 0) {
          setOKEIPKBLLMC(other.getOKEIPKBLLMC());
        }
        if (other.getNpcId() != 0) {
          setNpcId(other.getNpcId());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
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
        emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oKEIPKBLLMC_ ;
      /**
       * <code>uint32 OKEIPKBLLMC = 2;</code>
       * @return The oKEIPKBLLMC.
       */
      @java.lang.Override
      public int getOKEIPKBLLMC() {
        return oKEIPKBLLMC_;
      }
      /**
       * <code>uint32 OKEIPKBLLMC = 2;</code>
       * @param value The oKEIPKBLLMC to set.
       * @return This builder for chaining.
       */
      public Builder setOKEIPKBLLMC(int value) {
        
        oKEIPKBLLMC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OKEIPKBLLMC = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOKEIPKBLLMC() {
        
        oKEIPKBLLMC_ = 0;
        onChanged();
        return this;
      }

      private int npcId_ ;
      /**
       * <code>uint32 npc_id = 10;</code>
       * @return The npcId.
       */
      @java.lang.Override
      public int getNpcId() {
        return npcId_;
      }
      /**
       * <code>uint32 npc_id = 10;</code>
       * @param value The npcId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcId(int value) {
        
        npcId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcId() {
        
        npcId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 7;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
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


      // @@protoc_insertion_point(builder_scope:CANJOFHONKD)
    }

    // @@protoc_insertion_point(class_scope:CANJOFHONKD)
    private static final emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD();
    }

    public static emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CANJOFHONKD>
        PARSER = new com.google.protobuf.AbstractParser<CANJOFHONKD>() {
      @java.lang.Override
      public CANJOFHONKD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CANJOFHONKD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CANJOFHONKD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CANJOFHONKD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CANJOFHONKDOuterClass.CANJOFHONKD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CANJOFHONKD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CANJOFHONKD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CANJOFHONKD.proto\"G\n\013CANJOFHONKD\022\023\n\013OK" +
      "EIPKBLLMC\030\002 \001(\r\022\016\n\006npc_id\030\n \001(\r\022\023\n\013is_fi" +
      "nished\030\007 \001(\010B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CANJOFHONKD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CANJOFHONKD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CANJOFHONKD_descriptor,
        new java.lang.String[] { "OKEIPKBLLMC", "NpcId", "IsFinished", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
