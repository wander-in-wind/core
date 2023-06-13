// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryBulletInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryBulletInfoOuterClass {
  private SceneGalleryBulletInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryBulletInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryBulletInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 end_time = 1;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */
    int getHitCountMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */
    boolean containsHitCountMap(
        int key);
    /**
     * Use {@link #getHitCountMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getHitCountMap();
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getHitCountMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */

    int getHitCountMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */

    int getHitCountMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code SceneGalleryBulletInfo}
   */
  public static final class SceneGalleryBulletInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryBulletInfo)
      SceneGalleryBulletInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryBulletInfo.newBuilder() to construct.
    private SceneGalleryBulletInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryBulletInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryBulletInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryBulletInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              endTime_ = input.readUInt32();
              break;
            }
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                hitCountMap_ = com.google.protobuf.MapField.newMapField(
                    HitCountMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              hitCountMap__ = input.readMessage(
                  HitCountMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              hitCountMap_.getMutableMap().put(
                  hitCountMap__.getKey(), hitCountMap__.getValue());
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
      return emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.internal_static_SceneGalleryBulletInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 10:
          return internalGetHitCountMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.internal_static_SceneGalleryBulletInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo.class, emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo.Builder.class);
    }

    public static final int END_TIME_FIELD_NUMBER = 1;
    private int endTime_;
    /**
     * <code>uint32 end_time = 1;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int HIT_COUNT_MAP_FIELD_NUMBER = 10;
    private static final class HitCountMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.internal_static_SceneGalleryBulletInfo_HitCountMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> hitCountMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetHitCountMap() {
      if (hitCountMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HitCountMapDefaultEntryHolder.defaultEntry);
      }
      return hitCountMap_;
    }

    public int getHitCountMapCount() {
      return internalGetHitCountMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */

    @java.lang.Override
    public boolean containsHitCountMap(
        int key) {
      
      return internalGetHitCountMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHitCountMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getHitCountMap() {
      return getHitCountMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getHitCountMapMap() {
      return internalGetHitCountMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */
    @java.lang.Override

    public int getHitCountMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetHitCountMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
     */
    @java.lang.Override

    public int getHitCountMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetHitCountMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (endTime_ != 0) {
        output.writeUInt32(1, endTime_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetHitCountMap(),
          HitCountMapDefaultEntryHolder.defaultEntry,
          10);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, endTime_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetHitCountMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        hitCountMap__ = HitCountMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(10, hitCountMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo other = (emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo) obj;

      if (getEndTime()
          != other.getEndTime()) return false;
      if (!internalGetHitCountMap().equals(
          other.internalGetHitCountMap())) return false;
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
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      if (!internalGetHitCountMap().getMap().isEmpty()) {
        hash = (37 * hash) + HIT_COUNT_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetHitCountMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo prototype) {
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
     * Protobuf type {@code SceneGalleryBulletInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryBulletInfo)
        emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.internal_static_SceneGalleryBulletInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetHitCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetMutableHitCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.internal_static_SceneGalleryBulletInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo.class, emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo.newBuilder()
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
        endTime_ = 0;

        internalGetMutableHitCountMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.internal_static_SceneGalleryBulletInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo build() {
        emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo result = new emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo(this);
        int from_bitField0_ = bitField0_;
        result.endTime_ = endTime_;
        result.hitCountMap_ = internalGetHitCountMap();
        result.hitCountMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo.getDefaultInstance()) return this;
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        internalGetMutableHitCountMap().mergeFrom(
            other.internalGetHitCountMap());
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
        emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 1;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 1;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> hitCountMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetHitCountMap() {
        if (hitCountMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              HitCountMapDefaultEntryHolder.defaultEntry);
        }
        return hitCountMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableHitCountMap() {
        onChanged();;
        if (hitCountMap_ == null) {
          hitCountMap_ = com.google.protobuf.MapField.newMapField(
              HitCountMapDefaultEntryHolder.defaultEntry);
        }
        if (!hitCountMap_.isMutable()) {
          hitCountMap_ = hitCountMap_.copy();
        }
        return hitCountMap_;
      }

      public int getHitCountMapCount() {
        return internalGetHitCountMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
       */

      @java.lang.Override
      public boolean containsHitCountMap(
          int key) {
        
        return internalGetHitCountMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getHitCountMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getHitCountMap() {
        return getHitCountMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getHitCountMapMap() {
        return internalGetHitCountMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
       */
      @java.lang.Override

      public int getHitCountMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetHitCountMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
       */
      @java.lang.Override

      public int getHitCountMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetHitCountMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearHitCountMap() {
        internalGetMutableHitCountMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
       */

      public Builder removeHitCountMap(
          int key) {
        
        internalGetMutableHitCountMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableHitCountMap() {
        return internalGetMutableHitCountMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
       */
      public Builder putHitCountMap(
          int key,
          int value) {
        
        
        internalGetMutableHitCountMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; hit_count_map = 10;</code>
       */

      public Builder putAllHitCountMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableHitCountMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryBulletInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryBulletInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryBulletInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryBulletInfo>() {
      @java.lang.Override
      public SceneGalleryBulletInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryBulletInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryBulletInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryBulletInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryBulletInfoOuterClass.SceneGalleryBulletInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBulletInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBulletInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBulletInfo_HitCountMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBulletInfo_HitCountMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneGalleryBulletInfo.proto\"\237\001\n\026Scene" +
      "GalleryBulletInfo\022\020\n\010end_time\030\001 \001(\r\022?\n\rh" +
      "it_count_map\030\n \003(\0132(.SceneGalleryBulletI" +
      "nfo.HitCountMapEntry\0322\n\020HitCountMapEntry" +
      "\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryBulletInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryBulletInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBulletInfo_descriptor,
        new java.lang.String[] { "EndTime", "HitCountMap", });
    internal_static_SceneGalleryBulletInfo_HitCountMapEntry_descriptor =
      internal_static_SceneGalleryBulletInfo_descriptor.getNestedTypes().get(0);
    internal_static_SceneGalleryBulletInfo_HitCountMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBulletInfo_HitCountMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
