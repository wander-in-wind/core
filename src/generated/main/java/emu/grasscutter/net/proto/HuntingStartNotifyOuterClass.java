// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HuntingStartNotify.proto

package emu.grasscutter.net.proto;

public final class HuntingStartNotifyOuterClass {
  private HuntingStartNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HuntingStartNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HuntingStartNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HuntingPair hunting_pair = 5;</code>
     * @return Whether the huntingPair field is set.
     */
    boolean hasHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 5;</code>
     * @return The huntingPair.
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 5;</code>
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder();

    /**
     * <code>.Vector clue_position = 14;</code>
     * @return Whether the cluePosition field is set.
     */
    boolean hasCluePosition();
    /**
     * <code>.Vector clue_position = 14;</code>
     * @return The cluePosition.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCluePosition();
    /**
     * <code>.Vector clue_position = 14;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCluePositionOrBuilder();

    /**
     * <code>bool is_final = 2;</code>
     * @return The isFinal.
     */
    boolean getIsFinal();

    /**
     * <code>uint32 fail_time = 4;</code>
     * @return The failTime.
     */
    int getFailTime();
  }
  /**
   * <pre>
   * CmdId: 4325
   * Obf: IMJOCNPLONH
   * </pre>
   *
   * Protobuf type {@code HuntingStartNotify}
   */
  public static final class HuntingStartNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HuntingStartNotify)
      HuntingStartNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HuntingStartNotify.newBuilder() to construct.
    private HuntingStartNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HuntingStartNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HuntingStartNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HuntingStartNotify(
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

              isFinal_ = input.readBool();
              break;
            }
            case 32: {

              failTime_ = input.readUInt32();
              break;
            }
            case 42: {
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder subBuilder = null;
              if (huntingPair_ != null) {
                subBuilder = huntingPair_.toBuilder();
              }
              huntingPair_ = input.readMessage(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(huntingPair_);
                huntingPair_ = subBuilder.buildPartial();
              }

              break;
            }
            case 114: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (cluePosition_ != null) {
                subBuilder = cluePosition_.toBuilder();
              }
              cluePosition_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cluePosition_);
                cluePosition_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.internal_static_HuntingStartNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.internal_static_HuntingStartNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify.class, emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify.Builder.class);
    }

    public static final int HUNTING_PAIR_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
    /**
     * <code>.HuntingPair hunting_pair = 5;</code>
     * @return Whether the huntingPair field is set.
     */
    @java.lang.Override
    public boolean hasHuntingPair() {
      return huntingPair_ != null;
    }
    /**
     * <code>.HuntingPair hunting_pair = 5;</code>
     * @return The huntingPair.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
      return huntingPair_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
    }
    /**
     * <code>.HuntingPair hunting_pair = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
      return getHuntingPair();
    }

    public static final int CLUE_POSITION_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector cluePosition_;
    /**
     * <code>.Vector clue_position = 14;</code>
     * @return Whether the cluePosition field is set.
     */
    @java.lang.Override
    public boolean hasCluePosition() {
      return cluePosition_ != null;
    }
    /**
     * <code>.Vector clue_position = 14;</code>
     * @return The cluePosition.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCluePosition() {
      return cluePosition_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : cluePosition_;
    }
    /**
     * <code>.Vector clue_position = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCluePositionOrBuilder() {
      return getCluePosition();
    }

    public static final int IS_FINAL_FIELD_NUMBER = 2;
    private boolean isFinal_;
    /**
     * <code>bool is_final = 2;</code>
     * @return The isFinal.
     */
    @java.lang.Override
    public boolean getIsFinal() {
      return isFinal_;
    }

    public static final int FAIL_TIME_FIELD_NUMBER = 4;
    private int failTime_;
    /**
     * <code>uint32 fail_time = 4;</code>
     * @return The failTime.
     */
    @java.lang.Override
    public int getFailTime() {
      return failTime_;
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
      if (isFinal_ != false) {
        output.writeBool(2, isFinal_);
      }
      if (failTime_ != 0) {
        output.writeUInt32(4, failTime_);
      }
      if (huntingPair_ != null) {
        output.writeMessage(5, getHuntingPair());
      }
      if (cluePosition_ != null) {
        output.writeMessage(14, getCluePosition());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinal_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isFinal_);
      }
      if (failTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, failTime_);
      }
      if (huntingPair_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getHuntingPair());
      }
      if (cluePosition_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getCluePosition());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify other = (emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify) obj;

      if (hasHuntingPair() != other.hasHuntingPair()) return false;
      if (hasHuntingPair()) {
        if (!getHuntingPair()
            .equals(other.getHuntingPair())) return false;
      }
      if (hasCluePosition() != other.hasCluePosition()) return false;
      if (hasCluePosition()) {
        if (!getCluePosition()
            .equals(other.getCluePosition())) return false;
      }
      if (getIsFinal()
          != other.getIsFinal()) return false;
      if (getFailTime()
          != other.getFailTime()) return false;
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
      if (hasHuntingPair()) {
        hash = (37 * hash) + HUNTING_PAIR_FIELD_NUMBER;
        hash = (53 * hash) + getHuntingPair().hashCode();
      }
      if (hasCluePosition()) {
        hash = (37 * hash) + CLUE_POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getCluePosition().hashCode();
      }
      hash = (37 * hash) + IS_FINAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinal());
      hash = (37 * hash) + FAIL_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFailTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify prototype) {
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
     * CmdId: 4325
     * Obf: IMJOCNPLONH
     * </pre>
     *
     * Protobuf type {@code HuntingStartNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HuntingStartNotify)
        emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.internal_static_HuntingStartNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.internal_static_HuntingStartNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify.class, emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify.newBuilder()
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
        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }
        if (cluePositionBuilder_ == null) {
          cluePosition_ = null;
        } else {
          cluePosition_ = null;
          cluePositionBuilder_ = null;
        }
        isFinal_ = false;

        failTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.internal_static_HuntingStartNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify build() {
        emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify buildPartial() {
        emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify result = new emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify(this);
        if (huntingPairBuilder_ == null) {
          result.huntingPair_ = huntingPair_;
        } else {
          result.huntingPair_ = huntingPairBuilder_.build();
        }
        if (cluePositionBuilder_ == null) {
          result.cluePosition_ = cluePosition_;
        } else {
          result.cluePosition_ = cluePositionBuilder_.build();
        }
        result.isFinal_ = isFinal_;
        result.failTime_ = failTime_;
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
        if (other instanceof emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify other) {
        if (other == emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify.getDefaultInstance()) return this;
        if (other.hasHuntingPair()) {
          mergeHuntingPair(other.getHuntingPair());
        }
        if (other.hasCluePosition()) {
          mergeCluePosition(other.getCluePosition());
        }
        if (other.getIsFinal() != false) {
          setIsFinal(other.getIsFinal());
        }
        if (other.getFailTime() != 0) {
          setFailTime(other.getFailTime());
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
        emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> huntingPairBuilder_;
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       * @return Whether the huntingPair field is set.
       */
      public boolean hasHuntingPair() {
        return huntingPairBuilder_ != null || huntingPair_ != null;
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       * @return The huntingPair.
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
        if (huntingPairBuilder_ == null) {
          return huntingPair_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        } else {
          return huntingPairBuilder_.getMessage();
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       */
      public Builder setHuntingPair(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          huntingPair_ = value;
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       */
      public Builder setHuntingPair(
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder builderForValue) {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = builderForValue.build();
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       */
      public Builder mergeHuntingPair(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (huntingPair_ != null) {
            huntingPair_ =
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.newBuilder(huntingPair_).mergeFrom(value).buildPartial();
          } else {
            huntingPair_ = value;
          }
          onChanged();
        } else {
          huntingPairBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       */
      public Builder clearHuntingPair() {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
          onChanged();
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder getHuntingPairBuilder() {
        
        onChanged();
        return getHuntingPairFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
        if (huntingPairBuilder_ != null) {
          return huntingPairBuilder_.getMessageOrBuilder();
        } else {
          return huntingPair_ == null ?
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> 
          getHuntingPairFieldBuilder() {
        if (huntingPairBuilder_ == null) {
          huntingPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder>(
                  getHuntingPair(),
                  getParentForChildren(),
                  isClean());
          huntingPair_ = null;
        }
        return huntingPairBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector cluePosition_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> cluePositionBuilder_;
      /**
       * <code>.Vector clue_position = 14;</code>
       * @return Whether the cluePosition field is set.
       */
      public boolean hasCluePosition() {
        return cluePositionBuilder_ != null || cluePosition_ != null;
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       * @return The cluePosition.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCluePosition() {
        if (cluePositionBuilder_ == null) {
          return cluePosition_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : cluePosition_;
        } else {
          return cluePositionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       */
      public Builder setCluePosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (cluePositionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cluePosition_ = value;
          onChanged();
        } else {
          cluePositionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       */
      public Builder setCluePosition(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (cluePositionBuilder_ == null) {
          cluePosition_ = builderForValue.build();
          onChanged();
        } else {
          cluePositionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       */
      public Builder mergeCluePosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (cluePositionBuilder_ == null) {
          if (cluePosition_ != null) {
            cluePosition_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(cluePosition_).mergeFrom(value).buildPartial();
          } else {
            cluePosition_ = value;
          }
          onChanged();
        } else {
          cluePositionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       */
      public Builder clearCluePosition() {
        if (cluePositionBuilder_ == null) {
          cluePosition_ = null;
          onChanged();
        } else {
          cluePosition_ = null;
          cluePositionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCluePositionBuilder() {
        
        onChanged();
        return getCluePositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCluePositionOrBuilder() {
        if (cluePositionBuilder_ != null) {
          return cluePositionBuilder_.getMessageOrBuilder();
        } else {
          return cluePosition_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : cluePosition_;
        }
      }
      /**
       * <code>.Vector clue_position = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCluePositionFieldBuilder() {
        if (cluePositionBuilder_ == null) {
          cluePositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCluePosition(),
                  getParentForChildren(),
                  isClean());
          cluePosition_ = null;
        }
        return cluePositionBuilder_;
      }

      private boolean isFinal_ ;
      /**
       * <code>bool is_final = 2;</code>
       * @return The isFinal.
       */
      @java.lang.Override
      public boolean getIsFinal() {
        return isFinal_;
      }
      /**
       * <code>bool is_final = 2;</code>
       * @param value The isFinal to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinal(boolean value) {
        
        isFinal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_final = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinal() {
        
        isFinal_ = false;
        onChanged();
        return this;
      }

      private int failTime_ ;
      /**
       * <code>uint32 fail_time = 4;</code>
       * @return The failTime.
       */
      @java.lang.Override
      public int getFailTime() {
        return failTime_;
      }
      /**
       * <code>uint32 fail_time = 4;</code>
       * @param value The failTime to set.
       * @return This builder for chaining.
       */
      public Builder setFailTime(int value) {
        
        failTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fail_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailTime() {
        
        failTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HuntingStartNotify)
    }

    // @@protoc_insertion_point(class_scope:HuntingStartNotify)
    private static final emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify();
    }

    public static emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HuntingStartNotify>
        PARSER = new com.google.protobuf.AbstractParser<HuntingStartNotify>() {
      @java.lang.Override
      public HuntingStartNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HuntingStartNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HuntingStartNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HuntingStartNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingStartNotifyOuterClass.HuntingStartNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HuntingStartNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HuntingStartNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030HuntingStartNotify.proto\032\021HuntingPair." +
      "proto\032\014Vector.proto\"}\n\022HuntingStartNotif" +
      "y\022\"\n\014hunting_pair\030\005 \001(\0132\014.HuntingPair\022\036\n" +
      "\rclue_position\030\016 \001(\0132\007.Vector\022\020\n\010is_fina" +
      "l\030\002 \001(\010\022\021\n\tfail_time\030\004 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HuntingStartNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HuntingStartNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HuntingStartNotify_descriptor,
        new java.lang.String[] { "HuntingPair", "CluePosition", "IsFinal", "FailTime", });
    emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor();
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
