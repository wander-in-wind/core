// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EMHMNKCBOFB.proto

package emu.grasscutter.net.proto;

public final class EMHMNKCBOFBOuterClass {
  private EMHMNKCBOFBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EMHMNKCBOFBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EMHMNKCBOFB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float damage = 10;</code>
     * @return The damage.
     */
    float getDamage();

    /**
     * <code>.Vector BEMBGHIMOBJ = 14;</code>
     * @return Whether the bEMBGHIMOBJ field is set.
     */
    boolean hasBEMBGHIMOBJ();
    /**
     * <code>.Vector BEMBGHIMOBJ = 14;</code>
     * @return The bEMBGHIMOBJ.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getBEMBGHIMOBJ();
    /**
     * <code>.Vector BEMBGHIMOBJ = 14;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getBEMBGHIMOBJOrBuilder();
  }
  /**
   * <pre>
   * Name: EMHMNKCBOFB
   * </pre>
   *
   * Protobuf type {@code EMHMNKCBOFB}
   */
  public static final class EMHMNKCBOFB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EMHMNKCBOFB)
      EMHMNKCBOFBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EMHMNKCBOFB.newBuilder() to construct.
    private EMHMNKCBOFB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EMHMNKCBOFB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EMHMNKCBOFB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EMHMNKCBOFB(
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
            case 85: {

              damage_ = input.readFloat();
              break;
            }
            case 114: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (bEMBGHIMOBJ_ != null) {
                subBuilder = bEMBGHIMOBJ_.toBuilder();
              }
              bEMBGHIMOBJ_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bEMBGHIMOBJ_);
                bEMBGHIMOBJ_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.internal_static_EMHMNKCBOFB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.internal_static_EMHMNKCBOFB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB.class, emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB.Builder.class);
    }

    public static final int DAMAGE_FIELD_NUMBER = 10;
    private float damage_;
    /**
     * <code>float damage = 10;</code>
     * @return The damage.
     */
    @java.lang.Override
    public float getDamage() {
      return damage_;
    }

    public static final int BEMBGHIMOBJ_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector bEMBGHIMOBJ_;
    /**
     * <code>.Vector BEMBGHIMOBJ = 14;</code>
     * @return Whether the bEMBGHIMOBJ field is set.
     */
    @java.lang.Override
    public boolean hasBEMBGHIMOBJ() {
      return bEMBGHIMOBJ_ != null;
    }
    /**
     * <code>.Vector BEMBGHIMOBJ = 14;</code>
     * @return The bEMBGHIMOBJ.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getBEMBGHIMOBJ() {
      return bEMBGHIMOBJ_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : bEMBGHIMOBJ_;
    }
    /**
     * <code>.Vector BEMBGHIMOBJ = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getBEMBGHIMOBJOrBuilder() {
      return getBEMBGHIMOBJ();
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
      if (damage_ != 0F) {
        output.writeFloat(10, damage_);
      }
      if (bEMBGHIMOBJ_ != null) {
        output.writeMessage(14, getBEMBGHIMOBJ());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (damage_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(10, damage_);
      }
      if (bEMBGHIMOBJ_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getBEMBGHIMOBJ());
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
      if (!(obj instanceof emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB other = (emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB) obj;

      if (java.lang.Float.floatToIntBits(getDamage())
          != java.lang.Float.floatToIntBits(
              other.getDamage())) return false;
      if (hasBEMBGHIMOBJ() != other.hasBEMBGHIMOBJ()) return false;
      if (hasBEMBGHIMOBJ()) {
        if (!getBEMBGHIMOBJ()
            .equals(other.getBEMBGHIMOBJ())) return false;
      }
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
      hash = (37 * hash) + DAMAGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDamage());
      if (hasBEMBGHIMOBJ()) {
        hash = (37 * hash) + BEMBGHIMOBJ_FIELD_NUMBER;
        hash = (53 * hash) + getBEMBGHIMOBJ().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB prototype) {
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
     * Name: EMHMNKCBOFB
     * </pre>
     *
     * Protobuf type {@code EMHMNKCBOFB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EMHMNKCBOFB)
        emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.internal_static_EMHMNKCBOFB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.internal_static_EMHMNKCBOFB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB.class, emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB.newBuilder()
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
        damage_ = 0F;

        if (bEMBGHIMOBJBuilder_ == null) {
          bEMBGHIMOBJ_ = null;
        } else {
          bEMBGHIMOBJ_ = null;
          bEMBGHIMOBJBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.internal_static_EMHMNKCBOFB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB build() {
        emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB buildPartial() {
        emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB result = new emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB(this);
        result.damage_ = damage_;
        if (bEMBGHIMOBJBuilder_ == null) {
          result.bEMBGHIMOBJ_ = bEMBGHIMOBJ_;
        } else {
          result.bEMBGHIMOBJ_ = bEMBGHIMOBJBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB) {
          return mergeFrom((emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB other) {
        if (other == emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB.getDefaultInstance()) return this;
        if (other.getDamage() != 0F) {
          setDamage(other.getDamage());
        }
        if (other.hasBEMBGHIMOBJ()) {
          mergeBEMBGHIMOBJ(other.getBEMBGHIMOBJ());
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
        emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float damage_ ;
      /**
       * <code>float damage = 10;</code>
       * @return The damage.
       */
      @java.lang.Override
      public float getDamage() {
        return damage_;
      }
      /**
       * <code>float damage = 10;</code>
       * @param value The damage to set.
       * @return This builder for chaining.
       */
      public Builder setDamage(float value) {
        
        damage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float damage = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDamage() {
        
        damage_ = 0F;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector bEMBGHIMOBJ_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> bEMBGHIMOBJBuilder_;
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       * @return Whether the bEMBGHIMOBJ field is set.
       */
      public boolean hasBEMBGHIMOBJ() {
        return bEMBGHIMOBJBuilder_ != null || bEMBGHIMOBJ_ != null;
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       * @return The bEMBGHIMOBJ.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getBEMBGHIMOBJ() {
        if (bEMBGHIMOBJBuilder_ == null) {
          return bEMBGHIMOBJ_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : bEMBGHIMOBJ_;
        } else {
          return bEMBGHIMOBJBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       */
      public Builder setBEMBGHIMOBJ(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (bEMBGHIMOBJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bEMBGHIMOBJ_ = value;
          onChanged();
        } else {
          bEMBGHIMOBJBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       */
      public Builder setBEMBGHIMOBJ(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (bEMBGHIMOBJBuilder_ == null) {
          bEMBGHIMOBJ_ = builderForValue.build();
          onChanged();
        } else {
          bEMBGHIMOBJBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       */
      public Builder mergeBEMBGHIMOBJ(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (bEMBGHIMOBJBuilder_ == null) {
          if (bEMBGHIMOBJ_ != null) {
            bEMBGHIMOBJ_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(bEMBGHIMOBJ_).mergeFrom(value).buildPartial();
          } else {
            bEMBGHIMOBJ_ = value;
          }
          onChanged();
        } else {
          bEMBGHIMOBJBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       */
      public Builder clearBEMBGHIMOBJ() {
        if (bEMBGHIMOBJBuilder_ == null) {
          bEMBGHIMOBJ_ = null;
          onChanged();
        } else {
          bEMBGHIMOBJ_ = null;
          bEMBGHIMOBJBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getBEMBGHIMOBJBuilder() {
        
        onChanged();
        return getBEMBGHIMOBJFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getBEMBGHIMOBJOrBuilder() {
        if (bEMBGHIMOBJBuilder_ != null) {
          return bEMBGHIMOBJBuilder_.getMessageOrBuilder();
        } else {
          return bEMBGHIMOBJ_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : bEMBGHIMOBJ_;
        }
      }
      /**
       * <code>.Vector BEMBGHIMOBJ = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getBEMBGHIMOBJFieldBuilder() {
        if (bEMBGHIMOBJBuilder_ == null) {
          bEMBGHIMOBJBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getBEMBGHIMOBJ(),
                  getParentForChildren(),
                  isClean());
          bEMBGHIMOBJ_ = null;
        }
        return bEMBGHIMOBJBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EMHMNKCBOFB)
    }

    // @@protoc_insertion_point(class_scope:EMHMNKCBOFB)
    private static final emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB();
    }

    public static emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EMHMNKCBOFB>
        PARSER = new com.google.protobuf.AbstractParser<EMHMNKCBOFB>() {
      @java.lang.Override
      public EMHMNKCBOFB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EMHMNKCBOFB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EMHMNKCBOFB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EMHMNKCBOFB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EMHMNKCBOFBOuterClass.EMHMNKCBOFB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EMHMNKCBOFB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EMHMNKCBOFB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EMHMNKCBOFB.proto\032\014Vector.proto\";\n\013EMH" +
      "MNKCBOFB\022\016\n\006damage\030\n \001(\002\022\034\n\013BEMBGHIMOBJ\030" +
      "\016 \001(\0132\007.VectorB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EMHMNKCBOFB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EMHMNKCBOFB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EMHMNKCBOFB_descriptor,
        new java.lang.String[] { "Damage", "BEMBGHIMOBJ", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
