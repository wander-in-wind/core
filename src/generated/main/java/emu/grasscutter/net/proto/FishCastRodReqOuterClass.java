// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishCastRodReq.proto

package emu.grasscutter.net.proto;

public final class FishCastRodReqOuterClass {
  private FishCastRodReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishCastRodReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishCastRodReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rod_entity_id = 13;</code>
     * @return The rodEntityId.
     */
    int getRodEntityId();

    /**
     * <code>uint32 BJFPOFFAPOE = 3;</code>
     * @return The bJFPOFFAPOE.
     */
    int getBJFPOFFAPOE();

    /**
     * <code>.Vector pos = 14;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 14;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 14;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>uint32 LPEBKNNANPL = 9;</code>
     * @return The lPEBKNNANPL.
     */
    int getLPEBKNNANPL();
  }
  /**
   * <pre>
   * Name: CJEFHCKHINC
   * CmdId: 5836
   * </pre>
   *
   * Protobuf type {@code FishCastRodReq}
   */
  public static final class FishCastRodReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishCastRodReq)
      FishCastRodReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishCastRodReq.newBuilder() to construct.
    private FishCastRodReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishCastRodReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishCastRodReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FishCastRodReq(
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
            case 24: {

              bJFPOFFAPOE_ = input.readUInt32();
              break;
            }
            case 72: {

              lPEBKNNANPL_ = input.readUInt32();
              break;
            }
            case 104: {

              rodEntityId_ = input.readUInt32();
              break;
            }
            case 114: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq.class, emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq.Builder.class);
    }

    public static final int ROD_ENTITY_ID_FIELD_NUMBER = 13;
    private int rodEntityId_;
    /**
     * <code>uint32 rod_entity_id = 13;</code>
     * @return The rodEntityId.
     */
    @java.lang.Override
    public int getRodEntityId() {
      return rodEntityId_;
    }

    public static final int BJFPOFFAPOE_FIELD_NUMBER = 3;
    private int bJFPOFFAPOE_;
    /**
     * <code>uint32 BJFPOFFAPOE = 3;</code>
     * @return The bJFPOFFAPOE.
     */
    @java.lang.Override
    public int getBJFPOFFAPOE() {
      return bJFPOFFAPOE_;
    }

    public static final int POS_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 14;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 14;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int LPEBKNNANPL_FIELD_NUMBER = 9;
    private int lPEBKNNANPL_;
    /**
     * <code>uint32 LPEBKNNANPL = 9;</code>
     * @return The lPEBKNNANPL.
     */
    @java.lang.Override
    public int getLPEBKNNANPL() {
      return lPEBKNNANPL_;
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
      if (bJFPOFFAPOE_ != 0) {
        output.writeUInt32(3, bJFPOFFAPOE_);
      }
      if (lPEBKNNANPL_ != 0) {
        output.writeUInt32(9, lPEBKNNANPL_);
      }
      if (rodEntityId_ != 0) {
        output.writeUInt32(13, rodEntityId_);
      }
      if (pos_ != null) {
        output.writeMessage(14, getPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bJFPOFFAPOE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, bJFPOFFAPOE_);
      }
      if (lPEBKNNANPL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, lPEBKNNANPL_);
      }
      if (rodEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, rodEntityId_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq other = (emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq) obj;

      if (getRodEntityId()
          != other.getRodEntityId()) return false;
      if (getBJFPOFFAPOE()
          != other.getBJFPOFFAPOE()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getLPEBKNNANPL()
          != other.getLPEBKNNANPL()) return false;
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
      hash = (37 * hash) + ROD_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRodEntityId();
      hash = (37 * hash) + BJFPOFFAPOE_FIELD_NUMBER;
      hash = (53 * hash) + getBJFPOFFAPOE();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + LPEBKNNANPL_FIELD_NUMBER;
      hash = (53 * hash) + getLPEBKNNANPL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq prototype) {
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
     * Name: CJEFHCKHINC
     * CmdId: 5836
     * </pre>
     *
     * Protobuf type {@code FishCastRodReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishCastRodReq)
        emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq.class, emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq.newBuilder()
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
        rodEntityId_ = 0;

        bJFPOFFAPOE_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        lPEBKNNANPL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq build() {
        emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq buildPartial() {
        emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq result = new emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq(this);
        result.rodEntityId_ = rodEntityId_;
        result.bJFPOFFAPOE_ = bJFPOFFAPOE_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        result.lPEBKNNANPL_ = lPEBKNNANPL_;
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
        if (other instanceof emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq) {
          return mergeFrom((emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq other) {
        if (other == emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq.getDefaultInstance()) return this;
        if (other.getRodEntityId() != 0) {
          setRodEntityId(other.getRodEntityId());
        }
        if (other.getBJFPOFFAPOE() != 0) {
          setBJFPOFFAPOE(other.getBJFPOFFAPOE());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getLPEBKNNANPL() != 0) {
          setLPEBKNNANPL(other.getLPEBKNNANPL());
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
        emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rodEntityId_ ;
      /**
       * <code>uint32 rod_entity_id = 13;</code>
       * @return The rodEntityId.
       */
      @java.lang.Override
      public int getRodEntityId() {
        return rodEntityId_;
      }
      /**
       * <code>uint32 rod_entity_id = 13;</code>
       * @param value The rodEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setRodEntityId(int value) {
        
        rodEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rod_entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRodEntityId() {
        
        rodEntityId_ = 0;
        onChanged();
        return this;
      }

      private int bJFPOFFAPOE_ ;
      /**
       * <code>uint32 BJFPOFFAPOE = 3;</code>
       * @return The bJFPOFFAPOE.
       */
      @java.lang.Override
      public int getBJFPOFFAPOE() {
        return bJFPOFFAPOE_;
      }
      /**
       * <code>uint32 BJFPOFFAPOE = 3;</code>
       * @param value The bJFPOFFAPOE to set.
       * @return This builder for chaining.
       */
      public Builder setBJFPOFFAPOE(int value) {
        
        bJFPOFFAPOE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BJFPOFFAPOE = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBJFPOFFAPOE() {
        
        bJFPOFFAPOE_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 14;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 14;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 14;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 14;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 14;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 14;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private int lPEBKNNANPL_ ;
      /**
       * <code>uint32 LPEBKNNANPL = 9;</code>
       * @return The lPEBKNNANPL.
       */
      @java.lang.Override
      public int getLPEBKNNANPL() {
        return lPEBKNNANPL_;
      }
      /**
       * <code>uint32 LPEBKNNANPL = 9;</code>
       * @param value The lPEBKNNANPL to set.
       * @return This builder for chaining.
       */
      public Builder setLPEBKNNANPL(int value) {
        
        lPEBKNNANPL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LPEBKNNANPL = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLPEBKNNANPL() {
        
        lPEBKNNANPL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FishCastRodReq)
    }

    // @@protoc_insertion_point(class_scope:FishCastRodReq)
    private static final emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq();
    }

    public static emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishCastRodReq>
        PARSER = new com.google.protobuf.AbstractParser<FishCastRodReq>() {
      @java.lang.Override
      public FishCastRodReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FishCastRodReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FishCastRodReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishCastRodReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FishCastRodReqOuterClass.FishCastRodReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishCastRodReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishCastRodReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024FishCastRodReq.proto\032\014Vector.proto\"g\n\016" +
      "FishCastRodReq\022\025\n\rrod_entity_id\030\r \001(\r\022\023\n" +
      "\013BJFPOFFAPOE\030\003 \001(\r\022\024\n\003pos\030\016 \001(\0132\007.Vector" +
      "\022\023\n\013LPEBKNNANPL\030\t \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_FishCastRodReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishCastRodReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishCastRodReq_descriptor,
        new java.lang.String[] { "RodEntityId", "BJFPOFFAPOE", "Pos", "LPEBKNNANPL", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}