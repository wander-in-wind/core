// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SaveCoopDialogRsp.proto

package emu.grasscutter.net.proto;

public final class SaveCoopDialogRspOuterClass {
  private SaveCoopDialogRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SaveCoopDialogRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SaveCoopDialogRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OHGJGOFMHNP = 12;</code>
     * @return The oHGJGOFMHNP.
     */
    int getOHGJGOFMHNP();

    /**
     * <code>uint32 IMOEGKJCNNL = 2;</code>
     * @return The iMOEGKJCNNL.
     */
    int getIMOEGKJCNNL();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 1999
   * Obf: EOMMFCFDBDN
   * </pre>
   *
   * Protobuf type {@code SaveCoopDialogRsp}
   */
  public static final class SaveCoopDialogRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SaveCoopDialogRsp)
      SaveCoopDialogRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SaveCoopDialogRsp.newBuilder() to construct.
    private SaveCoopDialogRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SaveCoopDialogRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SaveCoopDialogRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SaveCoopDialogRsp(
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

              iMOEGKJCNNL_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              oHGJGOFMHNP_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.internal_static_SaveCoopDialogRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.internal_static_SaveCoopDialogRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp.class, emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp.Builder.class);
    }

    public static final int OHGJGOFMHNP_FIELD_NUMBER = 12;
    private int oHGJGOFMHNP_;
    /**
     * <code>uint32 OHGJGOFMHNP = 12;</code>
     * @return The oHGJGOFMHNP.
     */
    @java.lang.Override
    public int getOHGJGOFMHNP() {
      return oHGJGOFMHNP_;
    }

    public static final int IMOEGKJCNNL_FIELD_NUMBER = 2;
    private int iMOEGKJCNNL_;
    /**
     * <code>uint32 IMOEGKJCNNL = 2;</code>
     * @return The iMOEGKJCNNL.
     */
    @java.lang.Override
    public int getIMOEGKJCNNL() {
      return iMOEGKJCNNL_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
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
      if (iMOEGKJCNNL_ != 0) {
        output.writeUInt32(2, iMOEGKJCNNL_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (oHGJGOFMHNP_ != 0) {
        output.writeUInt32(12, oHGJGOFMHNP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iMOEGKJCNNL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, iMOEGKJCNNL_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (oHGJGOFMHNP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, oHGJGOFMHNP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp other = (emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp) obj;

      if (getOHGJGOFMHNP()
          != other.getOHGJGOFMHNP()) return false;
      if (getIMOEGKJCNNL()
          != other.getIMOEGKJCNNL()) return false;
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
      hash = (37 * hash) + OHGJGOFMHNP_FIELD_NUMBER;
      hash = (53 * hash) + getOHGJGOFMHNP();
      hash = (37 * hash) + IMOEGKJCNNL_FIELD_NUMBER;
      hash = (53 * hash) + getIMOEGKJCNNL();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp prototype) {
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
     * CmdId: 1999
     * Obf: EOMMFCFDBDN
     * </pre>
     *
     * Protobuf type {@code SaveCoopDialogRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SaveCoopDialogRsp)
        emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.internal_static_SaveCoopDialogRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.internal_static_SaveCoopDialogRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp.class, emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp.newBuilder()
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
        oHGJGOFMHNP_ = 0;

        iMOEGKJCNNL_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.internal_static_SaveCoopDialogRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp build() {
        emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp buildPartial() {
        emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp result = new emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp(this);
        result.oHGJGOFMHNP_ = oHGJGOFMHNP_;
        result.iMOEGKJCNNL_ = iMOEGKJCNNL_;
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
        if (other instanceof emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp other) {
        if (other == emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp.getDefaultInstance()) return this;
        if (other.getOHGJGOFMHNP() != 0) {
          setOHGJGOFMHNP(other.getOHGJGOFMHNP());
        }
        if (other.getIMOEGKJCNNL() != 0) {
          setIMOEGKJCNNL(other.getIMOEGKJCNNL());
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
        emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oHGJGOFMHNP_ ;
      /**
       * <code>uint32 OHGJGOFMHNP = 12;</code>
       * @return The oHGJGOFMHNP.
       */
      @java.lang.Override
      public int getOHGJGOFMHNP() {
        return oHGJGOFMHNP_;
      }
      /**
       * <code>uint32 OHGJGOFMHNP = 12;</code>
       * @param value The oHGJGOFMHNP to set.
       * @return This builder for chaining.
       */
      public Builder setOHGJGOFMHNP(int value) {
        
        oHGJGOFMHNP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OHGJGOFMHNP = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOHGJGOFMHNP() {
        
        oHGJGOFMHNP_ = 0;
        onChanged();
        return this;
      }

      private int iMOEGKJCNNL_ ;
      /**
       * <code>uint32 IMOEGKJCNNL = 2;</code>
       * @return The iMOEGKJCNNL.
       */
      @java.lang.Override
      public int getIMOEGKJCNNL() {
        return iMOEGKJCNNL_;
      }
      /**
       * <code>uint32 IMOEGKJCNNL = 2;</code>
       * @param value The iMOEGKJCNNL to set.
       * @return This builder for chaining.
       */
      public Builder setIMOEGKJCNNL(int value) {
        
        iMOEGKJCNNL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IMOEGKJCNNL = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIMOEGKJCNNL() {
        
        iMOEGKJCNNL_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
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


      // @@protoc_insertion_point(builder_scope:SaveCoopDialogRsp)
    }

    // @@protoc_insertion_point(class_scope:SaveCoopDialogRsp)
    private static final emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp();
    }

    public static emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SaveCoopDialogRsp>
        PARSER = new com.google.protobuf.AbstractParser<SaveCoopDialogRsp>() {
      @java.lang.Override
      public SaveCoopDialogRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SaveCoopDialogRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SaveCoopDialogRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SaveCoopDialogRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SaveCoopDialogRspOuterClass.SaveCoopDialogRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCoopDialogRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCoopDialogRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027SaveCoopDialogRsp.proto\"N\n\021SaveCoopDia" +
      "logRsp\022\023\n\013OHGJGOFMHNP\030\014 \001(\r\022\023\n\013IMOEGKJCN" +
      "NL\030\002 \001(\r\022\017\n\007retcode\030\007 \001(\005B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SaveCoopDialogRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SaveCoopDialogRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCoopDialogRsp_descriptor,
        new java.lang.String[] { "OHGJGOFMHNP", "IMOEGKJCNNL", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
