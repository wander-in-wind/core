// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IPCHFMGPLPP.proto

package emu.grasscutter.net.proto;

public final class IPCHFMGPLPPOuterClass {
  private IPCHFMGPLPPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IPCHFMGPLPPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IPCHFMGPLPP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 check_root_id = 7;</code>
     * @return The checkRootId.
     */
    int getCheckRootId();

    /**
     * <code>bool is_succ = 11;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();

    /**
     * <code>uint32 pos_id = 9;</code>
     * @return The posId.
     */
    int getPosId();
  }
  /**
   * <pre>
   * CmdId: 21714
   * </pre>
   *
   * Protobuf type {@code IPCHFMGPLPP}
   */
  public static final class IPCHFMGPLPP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IPCHFMGPLPP)
      IPCHFMGPLPPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IPCHFMGPLPP.newBuilder() to construct.
    private IPCHFMGPLPP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IPCHFMGPLPP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IPCHFMGPLPP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IPCHFMGPLPP(
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
            case 56: {

              checkRootId_ = input.readUInt32();
              break;
            }
            case 72: {

              posId_ = input.readUInt32();
              break;
            }
            case 88: {

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
      return emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.internal_static_IPCHFMGPLPP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.internal_static_IPCHFMGPLPP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP.class, emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP.Builder.class);
    }

    public static final int CHECK_ROOT_ID_FIELD_NUMBER = 7;
    private int checkRootId_;
    /**
     * <code>uint32 check_root_id = 7;</code>
     * @return The checkRootId.
     */
    @java.lang.Override
    public int getCheckRootId() {
      return checkRootId_;
    }

    public static final int IS_SUCC_FIELD_NUMBER = 11;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 11;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
    }

    public static final int POS_ID_FIELD_NUMBER = 9;
    private int posId_;
    /**
     * <code>uint32 pos_id = 9;</code>
     * @return The posId.
     */
    @java.lang.Override
    public int getPosId() {
      return posId_;
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
      if (checkRootId_ != 0) {
        output.writeUInt32(7, checkRootId_);
      }
      if (posId_ != 0) {
        output.writeUInt32(9, posId_);
      }
      if (isSucc_ != false) {
        output.writeBool(11, isSucc_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (checkRootId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, checkRootId_);
      }
      if (posId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, posId_);
      }
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isSucc_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP other = (emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP) obj;

      if (getCheckRootId()
          != other.getCheckRootId()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
      if (getPosId()
          != other.getPosId()) return false;
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
      hash = (37 * hash) + CHECK_ROOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCheckRootId();
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (37 * hash) + POS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPosId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP prototype) {
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
     * CmdId: 21714
     * </pre>
     *
     * Protobuf type {@code IPCHFMGPLPP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IPCHFMGPLPP)
        emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.internal_static_IPCHFMGPLPP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.internal_static_IPCHFMGPLPP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP.class, emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP.newBuilder()
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
        checkRootId_ = 0;

        isSucc_ = false;

        posId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.internal_static_IPCHFMGPLPP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP build() {
        emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP buildPartial() {
        emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP result = new emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP(this);
        result.checkRootId_ = checkRootId_;
        result.isSucc_ = isSucc_;
        result.posId_ = posId_;
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
        if (other instanceof emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP) {
          return mergeFrom((emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP other) {
        if (other == emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP.getDefaultInstance()) return this;
        if (other.getCheckRootId() != 0) {
          setCheckRootId(other.getCheckRootId());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
        }
        if (other.getPosId() != 0) {
          setPosId(other.getPosId());
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
        emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int checkRootId_ ;
      /**
       * <code>uint32 check_root_id = 7;</code>
       * @return The checkRootId.
       */
      @java.lang.Override
      public int getCheckRootId() {
        return checkRootId_;
      }
      /**
       * <code>uint32 check_root_id = 7;</code>
       * @param value The checkRootId to set.
       * @return This builder for chaining.
       */
      public Builder setCheckRootId(int value) {
        
        checkRootId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 check_root_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheckRootId() {
        
        checkRootId_ = 0;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 11;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 11;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
        onChanged();
        return this;
      }

      private int posId_ ;
      /**
       * <code>uint32 pos_id = 9;</code>
       * @return The posId.
       */
      @java.lang.Override
      public int getPosId() {
        return posId_;
      }
      /**
       * <code>uint32 pos_id = 9;</code>
       * @param value The posId to set.
       * @return This builder for chaining.
       */
      public Builder setPosId(int value) {
        
        posId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pos_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPosId() {
        
        posId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IPCHFMGPLPP)
    }

    // @@protoc_insertion_point(class_scope:IPCHFMGPLPP)
    private static final emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP();
    }

    public static emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IPCHFMGPLPP>
        PARSER = new com.google.protobuf.AbstractParser<IPCHFMGPLPP>() {
      @java.lang.Override
      public IPCHFMGPLPP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IPCHFMGPLPP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IPCHFMGPLPP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IPCHFMGPLPP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IPCHFMGPLPPOuterClass.IPCHFMGPLPP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IPCHFMGPLPP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IPCHFMGPLPP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IPCHFMGPLPP.proto\"E\n\013IPCHFMGPLPP\022\025\n\rch" +
      "eck_root_id\030\007 \001(\r\022\017\n\007is_succ\030\013 \001(\010\022\016\n\006po" +
      "s_id\030\t \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IPCHFMGPLPP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IPCHFMGPLPP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IPCHFMGPLPP_descriptor,
        new java.lang.String[] { "CheckRootId", "IsSucc", "PosId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
