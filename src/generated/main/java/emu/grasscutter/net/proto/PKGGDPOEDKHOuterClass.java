// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PKGGDPOEDKH.proto

package emu.grasscutter.net.proto;

public final class PKGGDPOEDKHOuterClass {
  private PKGGDPOEDKHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PKGGDPOEDKHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PKGGDPOEDKH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 IMNKIGNBJFG = 13;</code>
     * @return The iMNKIGNBJFG.
     */
    int getIMNKIGNBJFG();

    /**
     * <code>int32 DGABGOHFAOB = 4;</code>
     * @return The dGABGOHFAOB.
     */
    int getDGABGOHFAOB();
  }
  /**
   * <pre>
   * Name: PKGGDPOEDKH
   * </pre>
   *
   * Protobuf type {@code PKGGDPOEDKH}
   */
  public static final class PKGGDPOEDKH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PKGGDPOEDKH)
      PKGGDPOEDKHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PKGGDPOEDKH.newBuilder() to construct.
    private PKGGDPOEDKH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PKGGDPOEDKH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PKGGDPOEDKH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PKGGDPOEDKH(
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
            case 32: {

              dGABGOHFAOB_ = input.readInt32();
              break;
            }
            case 104: {

              iMNKIGNBJFG_ = input.readInt32();
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
      return emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.internal_static_PKGGDPOEDKH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.internal_static_PKGGDPOEDKH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH.class, emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH.Builder.class);
    }

    public static final int IMNKIGNBJFG_FIELD_NUMBER = 13;
    private int iMNKIGNBJFG_;
    /**
     * <code>int32 IMNKIGNBJFG = 13;</code>
     * @return The iMNKIGNBJFG.
     */
    @java.lang.Override
    public int getIMNKIGNBJFG() {
      return iMNKIGNBJFG_;
    }

    public static final int DGABGOHFAOB_FIELD_NUMBER = 4;
    private int dGABGOHFAOB_;
    /**
     * <code>int32 DGABGOHFAOB = 4;</code>
     * @return The dGABGOHFAOB.
     */
    @java.lang.Override
    public int getDGABGOHFAOB() {
      return dGABGOHFAOB_;
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
      if (dGABGOHFAOB_ != 0) {
        output.writeInt32(4, dGABGOHFAOB_);
      }
      if (iMNKIGNBJFG_ != 0) {
        output.writeInt32(13, iMNKIGNBJFG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dGABGOHFAOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, dGABGOHFAOB_);
      }
      if (iMNKIGNBJFG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, iMNKIGNBJFG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH other = (emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH) obj;

      if (getIMNKIGNBJFG()
          != other.getIMNKIGNBJFG()) return false;
      if (getDGABGOHFAOB()
          != other.getDGABGOHFAOB()) return false;
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
      hash = (37 * hash) + IMNKIGNBJFG_FIELD_NUMBER;
      hash = (53 * hash) + getIMNKIGNBJFG();
      hash = (37 * hash) + DGABGOHFAOB_FIELD_NUMBER;
      hash = (53 * hash) + getDGABGOHFAOB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH prototype) {
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
     * Name: PKGGDPOEDKH
     * </pre>
     *
     * Protobuf type {@code PKGGDPOEDKH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PKGGDPOEDKH)
        emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.internal_static_PKGGDPOEDKH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.internal_static_PKGGDPOEDKH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH.class, emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH.newBuilder()
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
        iMNKIGNBJFG_ = 0;

        dGABGOHFAOB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.internal_static_PKGGDPOEDKH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH build() {
        emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH buildPartial() {
        emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH result = new emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH(this);
        result.iMNKIGNBJFG_ = iMNKIGNBJFG_;
        result.dGABGOHFAOB_ = dGABGOHFAOB_;
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
        if (other instanceof emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH) {
          return mergeFrom((emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH other) {
        if (other == emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH.getDefaultInstance()) return this;
        if (other.getIMNKIGNBJFG() != 0) {
          setIMNKIGNBJFG(other.getIMNKIGNBJFG());
        }
        if (other.getDGABGOHFAOB() != 0) {
          setDGABGOHFAOB(other.getDGABGOHFAOB());
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
        emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iMNKIGNBJFG_ ;
      /**
       * <code>int32 IMNKIGNBJFG = 13;</code>
       * @return The iMNKIGNBJFG.
       */
      @java.lang.Override
      public int getIMNKIGNBJFG() {
        return iMNKIGNBJFG_;
      }
      /**
       * <code>int32 IMNKIGNBJFG = 13;</code>
       * @param value The iMNKIGNBJFG to set.
       * @return This builder for chaining.
       */
      public Builder setIMNKIGNBJFG(int value) {
        
        iMNKIGNBJFG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 IMNKIGNBJFG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIMNKIGNBJFG() {
        
        iMNKIGNBJFG_ = 0;
        onChanged();
        return this;
      }

      private int dGABGOHFAOB_ ;
      /**
       * <code>int32 DGABGOHFAOB = 4;</code>
       * @return The dGABGOHFAOB.
       */
      @java.lang.Override
      public int getDGABGOHFAOB() {
        return dGABGOHFAOB_;
      }
      /**
       * <code>int32 DGABGOHFAOB = 4;</code>
       * @param value The dGABGOHFAOB to set.
       * @return This builder for chaining.
       */
      public Builder setDGABGOHFAOB(int value) {
        
        dGABGOHFAOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 DGABGOHFAOB = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDGABGOHFAOB() {
        
        dGABGOHFAOB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PKGGDPOEDKH)
    }

    // @@protoc_insertion_point(class_scope:PKGGDPOEDKH)
    private static final emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH();
    }

    public static emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PKGGDPOEDKH>
        PARSER = new com.google.protobuf.AbstractParser<PKGGDPOEDKH>() {
      @java.lang.Override
      public PKGGDPOEDKH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PKGGDPOEDKH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PKGGDPOEDKH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PKGGDPOEDKH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PKGGDPOEDKHOuterClass.PKGGDPOEDKH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PKGGDPOEDKH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PKGGDPOEDKH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PKGGDPOEDKH.proto\"7\n\013PKGGDPOEDKH\022\023\n\013IM" +
      "NKIGNBJFG\030\r \001(\005\022\023\n\013DGABGOHFAOB\030\004 \001(\005B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PKGGDPOEDKH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PKGGDPOEDKH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PKGGDPOEDKH_descriptor,
        new java.lang.String[] { "IMNKIGNBJFG", "DGABGOHFAOB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
