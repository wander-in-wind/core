// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetEquipLockStateRsp.proto

package emu.grasscutter.net.proto;

public final class SetEquipLockStateRspOuterClass {
  private SetEquipLockStateRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetEquipLockStateRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetEquipLockStateRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_locked = 5;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint64 target_equip_guid = 10;</code>
     * @return The targetEquipGuid.
     */
    long getTargetEquipGuid();
  }
  /**
   * <pre>
   * Name: ENFCAMIABPH
   * CmdId: 621
   * </pre>
   *
   * Protobuf type {@code SetEquipLockStateRsp}
   */
  public static final class SetEquipLockStateRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetEquipLockStateRsp)
      SetEquipLockStateRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetEquipLockStateRsp.newBuilder() to construct.
    private SetEquipLockStateRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetEquipLockStateRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetEquipLockStateRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetEquipLockStateRsp(
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

              isLocked_ = input.readBool();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              targetEquipGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.internal_static_SetEquipLockStateRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.internal_static_SetEquipLockStateRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.class, emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.Builder.class);
    }

    public static final int IS_LOCKED_FIELD_NUMBER = 5;
    private boolean isLocked_;
    /**
     * <code>bool is_locked = 5;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TARGET_EQUIP_GUID_FIELD_NUMBER = 10;
    private long targetEquipGuid_;
    /**
     * <code>uint64 target_equip_guid = 10;</code>
     * @return The targetEquipGuid.
     */
    @java.lang.Override
    public long getTargetEquipGuid() {
      return targetEquipGuid_;
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
      if (isLocked_ != false) {
        output.writeBool(5, isLocked_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (targetEquipGuid_ != 0L) {
        output.writeUInt64(10, targetEquipGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isLocked_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (targetEquipGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, targetEquipGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp other = (emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp) obj;

      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getTargetEquipGuid()
          != other.getTargetEquipGuid()) return false;
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
      hash = (37 * hash) + IS_LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TARGET_EQUIP_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetEquipGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp prototype) {
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
     * Name: ENFCAMIABPH
     * CmdId: 621
     * </pre>
     *
     * Protobuf type {@code SetEquipLockStateRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetEquipLockStateRsp)
        emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.internal_static_SetEquipLockStateRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.internal_static_SetEquipLockStateRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.class, emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.newBuilder()
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
        isLocked_ = false;

        retcode_ = 0;

        targetEquipGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.internal_static_SetEquipLockStateRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp build() {
        emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp buildPartial() {
        emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp result = new emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp(this);
        result.isLocked_ = isLocked_;
        result.retcode_ = retcode_;
        result.targetEquipGuid_ = targetEquipGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp other) {
        if (other == emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp.getDefaultInstance()) return this;
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getTargetEquipGuid() != 0L) {
          setTargetEquipGuid(other.getTargetEquipGuid());
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
        emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool is_locked = 5;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool is_locked = 5;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {
        
        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_locked = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        
        isLocked_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private long targetEquipGuid_ ;
      /**
       * <code>uint64 target_equip_guid = 10;</code>
       * @return The targetEquipGuid.
       */
      @java.lang.Override
      public long getTargetEquipGuid() {
        return targetEquipGuid_;
      }
      /**
       * <code>uint64 target_equip_guid = 10;</code>
       * @param value The targetEquipGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEquipGuid(long value) {
        
        targetEquipGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_equip_guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEquipGuid() {
        
        targetEquipGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SetEquipLockStateRsp)
    }

    // @@protoc_insertion_point(class_scope:SetEquipLockStateRsp)
    private static final emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp();
    }

    public static emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetEquipLockStateRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetEquipLockStateRsp>() {
      @java.lang.Override
      public SetEquipLockStateRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetEquipLockStateRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetEquipLockStateRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetEquipLockStateRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetEquipLockStateRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetEquipLockStateRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SetEquipLockStateRsp.proto\"U\n\024SetEquip" +
      "LockStateRsp\022\021\n\tis_locked\030\005 \001(\010\022\017\n\007retco" +
      "de\030\t \001(\005\022\031\n\021target_equip_guid\030\n \001(\004B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetEquipLockStateRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetEquipLockStateRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetEquipLockStateRsp_descriptor,
        new java.lang.String[] { "IsLocked", "Retcode", "TargetEquipGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
