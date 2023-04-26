// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryBalloonShootNotify.proto

package emu.grasscutter.net.proto;

public final class GalleryBalloonShootNotifyOuterClass {
  private GalleryBalloonShootNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryBalloonShootNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryBalloonShootNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 add_score = 13;</code>
     * @return The addScore.
     */
    int getAddScore();

    /**
     * <code>uint64 combo_disable_time = 2;</code>
     * @return The comboDisableTime.
     */
    long getComboDisableTime();

    /**
     * <code>uint32 combo = 7;</code>
     * @return The combo.
     */
    int getCombo();

    /**
     * <code>uint32 trigger_entity_id = 6;</code>
     * @return The triggerEntityId.
     */
    int getTriggerEntityId();

    /**
     * <code>uint32 cur_score = 11;</code>
     * @return The curScore.
     */
    int getCurScore();

    /**
     * <code>uint32 gallery_id = 5;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 5596
   * Name: KKPPMPIMCKI
   * </pre>
   *
   * Protobuf type {@code GalleryBalloonShootNotify}
   */
  public static final class GalleryBalloonShootNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryBalloonShootNotify)
      GalleryBalloonShootNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryBalloonShootNotify.newBuilder() to construct.
    private GalleryBalloonShootNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryBalloonShootNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryBalloonShootNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GalleryBalloonShootNotify(
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

              comboDisableTime_ = input.readUInt64();
              break;
            }
            case 40: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 48: {

              triggerEntityId_ = input.readUInt32();
              break;
            }
            case 56: {

              combo_ = input.readUInt32();
              break;
            }
            case 88: {

              curScore_ = input.readUInt32();
              break;
            }
            case 104: {

              addScore_ = input.readInt32();
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
      return emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.class, emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.Builder.class);
    }

    public static final int ADD_SCORE_FIELD_NUMBER = 13;
    private int addScore_;
    /**
     * <code>int32 add_score = 13;</code>
     * @return The addScore.
     */
    @java.lang.Override
    public int getAddScore() {
      return addScore_;
    }

    public static final int COMBO_DISABLE_TIME_FIELD_NUMBER = 2;
    private long comboDisableTime_;
    /**
     * <code>uint64 combo_disable_time = 2;</code>
     * @return The comboDisableTime.
     */
    @java.lang.Override
    public long getComboDisableTime() {
      return comboDisableTime_;
    }

    public static final int COMBO_FIELD_NUMBER = 7;
    private int combo_;
    /**
     * <code>uint32 combo = 7;</code>
     * @return The combo.
     */
    @java.lang.Override
    public int getCombo() {
      return combo_;
    }

    public static final int TRIGGER_ENTITY_ID_FIELD_NUMBER = 6;
    private int triggerEntityId_;
    /**
     * <code>uint32 trigger_entity_id = 6;</code>
     * @return The triggerEntityId.
     */
    @java.lang.Override
    public int getTriggerEntityId() {
      return triggerEntityId_;
    }

    public static final int CUR_SCORE_FIELD_NUMBER = 11;
    private int curScore_;
    /**
     * <code>uint32 cur_score = 11;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 5;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 5;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (comboDisableTime_ != 0L) {
        output.writeUInt64(2, comboDisableTime_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(5, galleryId_);
      }
      if (triggerEntityId_ != 0) {
        output.writeUInt32(6, triggerEntityId_);
      }
      if (combo_ != 0) {
        output.writeUInt32(7, combo_);
      }
      if (curScore_ != 0) {
        output.writeUInt32(11, curScore_);
      }
      if (addScore_ != 0) {
        output.writeInt32(13, addScore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (comboDisableTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, comboDisableTime_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, galleryId_);
      }
      if (triggerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, triggerEntityId_);
      }
      if (combo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, combo_);
      }
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, curScore_);
      }
      if (addScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, addScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify other = (emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify) obj;

      if (getAddScore()
          != other.getAddScore()) return false;
      if (getComboDisableTime()
          != other.getComboDisableTime()) return false;
      if (getCombo()
          != other.getCombo()) return false;
      if (getTriggerEntityId()
          != other.getTriggerEntityId()) return false;
      if (getCurScore()
          != other.getCurScore()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + ADD_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getAddScore();
      hash = (37 * hash) + COMBO_DISABLE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getComboDisableTime());
      hash = (37 * hash) + COMBO_FIELD_NUMBER;
      hash = (53 * hash) + getCombo();
      hash = (37 * hash) + TRIGGER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTriggerEntityId();
      hash = (37 * hash) + CUR_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify prototype) {
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
     * CmdId: 5596
     * Name: KKPPMPIMCKI
     * </pre>
     *
     * Protobuf type {@code GalleryBalloonShootNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryBalloonShootNotify)
        emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.class, emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.newBuilder()
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
        addScore_ = 0;

        comboDisableTime_ = 0L;

        combo_ = 0;

        triggerEntityId_ = 0;

        curScore_ = 0;

        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify build() {
        emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify buildPartial() {
        emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify result = new emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify(this);
        result.addScore_ = addScore_;
        result.comboDisableTime_ = comboDisableTime_;
        result.combo_ = combo_;
        result.triggerEntityId_ = triggerEntityId_;
        result.curScore_ = curScore_;
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify other) {
        if (other == emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.getDefaultInstance()) return this;
        if (other.getAddScore() != 0) {
          setAddScore(other.getAddScore());
        }
        if (other.getComboDisableTime() != 0L) {
          setComboDisableTime(other.getComboDisableTime());
        }
        if (other.getCombo() != 0) {
          setCombo(other.getCombo());
        }
        if (other.getTriggerEntityId() != 0) {
          setTriggerEntityId(other.getTriggerEntityId());
        }
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int addScore_ ;
      /**
       * <code>int32 add_score = 13;</code>
       * @return The addScore.
       */
      @java.lang.Override
      public int getAddScore() {
        return addScore_;
      }
      /**
       * <code>int32 add_score = 13;</code>
       * @param value The addScore to set.
       * @return This builder for chaining.
       */
      public Builder setAddScore(int value) {
        
        addScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 add_score = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddScore() {
        
        addScore_ = 0;
        onChanged();
        return this;
      }

      private long comboDisableTime_ ;
      /**
       * <code>uint64 combo_disable_time = 2;</code>
       * @return The comboDisableTime.
       */
      @java.lang.Override
      public long getComboDisableTime() {
        return comboDisableTime_;
      }
      /**
       * <code>uint64 combo_disable_time = 2;</code>
       * @param value The comboDisableTime to set.
       * @return This builder for chaining.
       */
      public Builder setComboDisableTime(long value) {
        
        comboDisableTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 combo_disable_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearComboDisableTime() {
        
        comboDisableTime_ = 0L;
        onChanged();
        return this;
      }

      private int combo_ ;
      /**
       * <code>uint32 combo = 7;</code>
       * @return The combo.
       */
      @java.lang.Override
      public int getCombo() {
        return combo_;
      }
      /**
       * <code>uint32 combo = 7;</code>
       * @param value The combo to set.
       * @return This builder for chaining.
       */
      public Builder setCombo(int value) {
        
        combo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combo = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombo() {
        
        combo_ = 0;
        onChanged();
        return this;
      }

      private int triggerEntityId_ ;
      /**
       * <code>uint32 trigger_entity_id = 6;</code>
       * @return The triggerEntityId.
       */
      @java.lang.Override
      public int getTriggerEntityId() {
        return triggerEntityId_;
      }
      /**
       * <code>uint32 trigger_entity_id = 6;</code>
       * @param value The triggerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTriggerEntityId(int value) {
        
        triggerEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trigger_entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTriggerEntityId() {
        
        triggerEntityId_ = 0;
        onChanged();
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 cur_score = 11;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 cur_score = 11;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        
        curScore_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 5;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 5;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryBalloonShootNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryBalloonShootNotify)
    private static final emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify();
    }

    public static emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryBalloonShootNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryBalloonShootNotify>() {
      @java.lang.Override
      public GalleryBalloonShootNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GalleryBalloonShootNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GalleryBalloonShootNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryBalloonShootNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryBalloonShootNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryBalloonShootNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GalleryBalloonShootNotify.proto\"\233\001\n\031Ga" +
      "lleryBalloonShootNotify\022\021\n\tadd_score\030\r \001" +
      "(\005\022\032\n\022combo_disable_time\030\002 \001(\004\022\r\n\005combo\030" +
      "\007 \001(\r\022\031\n\021trigger_entity_id\030\006 \001(\r\022\021\n\tcur_" +
      "score\030\013 \001(\r\022\022\n\ngallery_id\030\005 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryBalloonShootNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryBalloonShootNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryBalloonShootNotify_descriptor,
        new java.lang.String[] { "AddScore", "ComboDisableTime", "Combo", "TriggerEntityId", "CurScore", "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
