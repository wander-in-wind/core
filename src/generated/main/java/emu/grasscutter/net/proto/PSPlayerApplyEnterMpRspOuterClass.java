// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PSPlayerApplyEnterMpRsp.proto

package emu.grasscutter.net.proto;

public final class PSPlayerApplyEnterMpRspOuterClass {
  private PSPlayerApplyEnterMpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PSPlayerApplyEnterMpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PSPlayerApplyEnterMpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 param = 7;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>string target_psn_id = 10;</code>
     * @return The targetPsnId.
     */
    java.lang.String getTargetPsnId();
    /**
     * <code>string target_psn_id = 10;</code>
     * @return The bytes for targetPsnId.
     */
    com.google.protobuf.ByteString
        getTargetPsnIdBytes();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 1821
   * Name: IFCMJCBNEIP
   * </pre>
   *
   * Protobuf type {@code PSPlayerApplyEnterMpRsp}
   */
  public static final class PSPlayerApplyEnterMpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PSPlayerApplyEnterMpRsp)
      PSPlayerApplyEnterMpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PSPlayerApplyEnterMpRsp.newBuilder() to construct.
    private PSPlayerApplyEnterMpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PSPlayerApplyEnterMpRsp() {
      targetPsnId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PSPlayerApplyEnterMpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PSPlayerApplyEnterMpRsp(
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

              param_ = input.readUInt32();
              break;
            }
            case 82: {
              java.lang.String s = input.readStringRequireUtf8();

              targetPsnId_ = s;
              break;
            }
            case 96: {

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
      return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.class, emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.Builder.class);
    }

    public static final int PARAM_FIELD_NUMBER = 7;
    private int param_;
    /**
     * <code>uint32 param = 7;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int TARGET_PSN_ID_FIELD_NUMBER = 10;
    private volatile java.lang.Object targetPsnId_;
    /**
     * <code>string target_psn_id = 10;</code>
     * @return The targetPsnId.
     */
    @java.lang.Override
    public java.lang.String getTargetPsnId() {
      java.lang.Object ref = targetPsnId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetPsnId_ = s;
        return s;
      }
    }
    /**
     * <code>string target_psn_id = 10;</code>
     * @return The bytes for targetPsnId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetPsnIdBytes() {
      java.lang.Object ref = targetPsnId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetPsnId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
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
      if (param_ != 0) {
        output.writeUInt32(7, param_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPsnId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, targetPsnId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, param_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPsnId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, targetPsnId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp other = (emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp) obj;

      if (getParam()
          != other.getParam()) return false;
      if (!getTargetPsnId()
          .equals(other.getTargetPsnId())) return false;
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
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + TARGET_PSN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPsnId().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp prototype) {
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
     * CmdId: 1821
     * Name: IFCMJCBNEIP
     * </pre>
     *
     * Protobuf type {@code PSPlayerApplyEnterMpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PSPlayerApplyEnterMpRsp)
        emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.class, emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.newBuilder()
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
        param_ = 0;

        targetPsnId_ = "";

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.internal_static_PSPlayerApplyEnterMpRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp build() {
        emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp buildPartial() {
        emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp result = new emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp(this);
        result.param_ = param_;
        result.targetPsnId_ = targetPsnId_;
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
        if (other instanceof emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp other) {
        if (other == emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp.getDefaultInstance()) return this;
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (!other.getTargetPsnId().isEmpty()) {
          targetPsnId_ = other.targetPsnId_;
          onChanged();
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
        emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 7;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 7;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object targetPsnId_ = "";
      /**
       * <code>string target_psn_id = 10;</code>
       * @return The targetPsnId.
       */
      public java.lang.String getTargetPsnId() {
        java.lang.Object ref = targetPsnId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetPsnId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string target_psn_id = 10;</code>
       * @return The bytes for targetPsnId.
       */
      public com.google.protobuf.ByteString
          getTargetPsnIdBytes() {
        java.lang.Object ref = targetPsnId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetPsnId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string target_psn_id = 10;</code>
       * @param value The targetPsnId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPsnId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetPsnId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string target_psn_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetPsnId() {
        
        targetPsnId_ = getDefaultInstance().getTargetPsnId();
        onChanged();
        return this;
      }
      /**
       * <code>string target_psn_id = 10;</code>
       * @param value The bytes for targetPsnId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPsnIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetPsnId_ = value;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
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


      // @@protoc_insertion_point(builder_scope:PSPlayerApplyEnterMpRsp)
    }

    // @@protoc_insertion_point(class_scope:PSPlayerApplyEnterMpRsp)
    private static final emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp();
    }

    public static emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PSPlayerApplyEnterMpRsp>
        PARSER = new com.google.protobuf.AbstractParser<PSPlayerApplyEnterMpRsp>() {
      @java.lang.Override
      public PSPlayerApplyEnterMpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PSPlayerApplyEnterMpRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PSPlayerApplyEnterMpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PSPlayerApplyEnterMpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PSPlayerApplyEnterMpRspOuterClass.PSPlayerApplyEnterMpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PSPlayerApplyEnterMpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PSPlayerApplyEnterMpRsp.proto\"P\n\027PSPla" +
      "yerApplyEnterMpRsp\022\r\n\005param\030\007 \001(\r\022\025\n\rtar" +
      "get_psn_id\030\n \001(\t\022\017\n\007retcode\030\014 \001(\005B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PSPlayerApplyEnterMpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PSPlayerApplyEnterMpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PSPlayerApplyEnterMpRsp_descriptor,
        new java.lang.String[] { "Param", "TargetPsnId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
