// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtBeingHealedNotify.proto

package emu.grasscutter.net.proto;

public final class EvtBeingHealedNotifyOuterClass {
  private EvtBeingHealedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtBeingHealedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtBeingHealedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_id = 1;</code>
     * @return The targetId.
     */
    int getTargetId();

    /**
     * <code>float real_heal_amount = 5;</code>
     * @return The realHealAmount.
     */
    float getRealHealAmount();

    /**
     * <code>uint32 source_id = 13;</code>
     * @return The sourceId.
     */
    int getSourceId();

    /**
     * <code>float heal_amount = 4;</code>
     * @return The healAmount.
     */
    float getHealAmount();
  }
  /**
   * <pre>
   * CmdId: 333
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code EvtBeingHealedNotify}
   */
  public static final class EvtBeingHealedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtBeingHealedNotify)
      EvtBeingHealedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtBeingHealedNotify.newBuilder() to construct.
    private EvtBeingHealedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtBeingHealedNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtBeingHealedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtBeingHealedNotify(
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
            case 8: {

              targetId_ = input.readUInt32();
              break;
            }
            case 37: {

              healAmount_ = input.readFloat();
              break;
            }
            case 45: {

              realHealAmount_ = input.readFloat();
              break;
            }
            case 104: {

              sourceId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.class, emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.Builder.class);
    }

    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int targetId_;
    /**
     * <code>uint32 target_id = 1;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
    }

    public static final int REAL_HEAL_AMOUNT_FIELD_NUMBER = 5;
    private float realHealAmount_;
    /**
     * <code>float real_heal_amount = 5;</code>
     * @return The realHealAmount.
     */
    @java.lang.Override
    public float getRealHealAmount() {
      return realHealAmount_;
    }

    public static final int SOURCE_ID_FIELD_NUMBER = 13;
    private int sourceId_;
    /**
     * <code>uint32 source_id = 13;</code>
     * @return The sourceId.
     */
    @java.lang.Override
    public int getSourceId() {
      return sourceId_;
    }

    public static final int HEAL_AMOUNT_FIELD_NUMBER = 4;
    private float healAmount_;
    /**
     * <code>float heal_amount = 4;</code>
     * @return The healAmount.
     */
    @java.lang.Override
    public float getHealAmount() {
      return healAmount_;
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
      if (targetId_ != 0) {
        output.writeUInt32(1, targetId_);
      }
      if (healAmount_ != 0F) {
        output.writeFloat(4, healAmount_);
      }
      if (realHealAmount_ != 0F) {
        output.writeFloat(5, realHealAmount_);
      }
      if (sourceId_ != 0) {
        output.writeUInt32(13, sourceId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, targetId_);
      }
      if (healAmount_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, healAmount_);
      }
      if (realHealAmount_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, realHealAmount_);
      }
      if (sourceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, sourceId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify other = (emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) obj;

      if (getTargetId()
          != other.getTargetId()) return false;
      if (java.lang.Float.floatToIntBits(getRealHealAmount())
          != java.lang.Float.floatToIntBits(
              other.getRealHealAmount())) return false;
      if (getSourceId()
          != other.getSourceId()) return false;
      if (java.lang.Float.floatToIntBits(getHealAmount())
          != java.lang.Float.floatToIntBits(
              other.getHealAmount())) return false;
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
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (37 * hash) + REAL_HEAL_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRealHealAmount());
      hash = (37 * hash) + SOURCE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceId();
      hash = (37 * hash) + HEAL_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHealAmount());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify prototype) {
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
     * CmdId: 333
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code EvtBeingHealedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtBeingHealedNotify)
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.class, emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.newBuilder()
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
        targetId_ = 0;

        realHealAmount_ = 0F;

        sourceId_ = 0;

        healAmount_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify build() {
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify buildPartial() {
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify result = new emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify(this);
        result.targetId_ = targetId_;
        result.realHealAmount_ = realHealAmount_;
        result.sourceId_ = sourceId_;
        result.healAmount_ = healAmount_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify other) {
        if (other == emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.getDefaultInstance()) return this;
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
        }
        if (other.getRealHealAmount() != 0F) {
          setRealHealAmount(other.getRealHealAmount());
        }
        if (other.getSourceId() != 0) {
          setSourceId(other.getSourceId());
        }
        if (other.getHealAmount() != 0F) {
          setHealAmount(other.getHealAmount());
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
        emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetId_ ;
      /**
       * <code>uint32 target_id = 1;</code>
       * @return The targetId.
       */
      @java.lang.Override
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>uint32 target_id = 1;</code>
       * @param value The targetId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetId(int value) {
        
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetId() {
        
        targetId_ = 0;
        onChanged();
        return this;
      }

      private float realHealAmount_ ;
      /**
       * <code>float real_heal_amount = 5;</code>
       * @return The realHealAmount.
       */
      @java.lang.Override
      public float getRealHealAmount() {
        return realHealAmount_;
      }
      /**
       * <code>float real_heal_amount = 5;</code>
       * @param value The realHealAmount to set.
       * @return This builder for chaining.
       */
      public Builder setRealHealAmount(float value) {
        
        realHealAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float real_heal_amount = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRealHealAmount() {
        
        realHealAmount_ = 0F;
        onChanged();
        return this;
      }

      private int sourceId_ ;
      /**
       * <code>uint32 source_id = 13;</code>
       * @return The sourceId.
       */
      @java.lang.Override
      public int getSourceId() {
        return sourceId_;
      }
      /**
       * <code>uint32 source_id = 13;</code>
       * @param value The sourceId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceId(int value) {
        
        sourceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceId() {
        
        sourceId_ = 0;
        onChanged();
        return this;
      }

      private float healAmount_ ;
      /**
       * <code>float heal_amount = 4;</code>
       * @return The healAmount.
       */
      @java.lang.Override
      public float getHealAmount() {
        return healAmount_;
      }
      /**
       * <code>float heal_amount = 4;</code>
       * @param value The healAmount to set.
       * @return This builder for chaining.
       */
      public Builder setHealAmount(float value) {
        
        healAmount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float heal_amount = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearHealAmount() {
        
        healAmount_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:EvtBeingHealedNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtBeingHealedNotify)
    private static final emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify();
    }

    public static emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtBeingHealedNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtBeingHealedNotify>() {
      @java.lang.Override
      public EvtBeingHealedNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtBeingHealedNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtBeingHealedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtBeingHealedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtBeingHealedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtBeingHealedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EvtBeingHealedNotify.proto\"k\n\024EvtBeing" +
      "HealedNotify\022\021\n\ttarget_id\030\001 \001(\r\022\030\n\020real_" +
      "heal_amount\030\005 \001(\002\022\021\n\tsource_id\030\r \001(\r\022\023\n\013" +
      "heal_amount\030\004 \001(\002B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EvtBeingHealedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtBeingHealedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtBeingHealedNotify_descriptor,
        new java.lang.String[] { "TargetId", "RealHealAmount", "SourceId", "HealAmount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
