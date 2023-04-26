// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryBalloonScoreNotify.proto

package emu.grasscutter.net.proto;

public final class GalleryBalloonScoreNotifyOuterClass {
  private GalleryBalloonScoreNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryBalloonScoreNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryBalloonScoreNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */
    int getUidScoreMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */
    boolean containsUidScoreMap(
        int key);
    /**
     * Use {@link #getUidScoreMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUidScoreMap();
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUidScoreMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */

    int getUidScoreMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */

    int getUidScoreMapOrThrow(
        int key);

    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 5589
   * Name: OOMEGDEJPJC
   * </pre>
   *
   * Protobuf type {@code GalleryBalloonScoreNotify}
   */
  public static final class GalleryBalloonScoreNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryBalloonScoreNotify)
      GalleryBalloonScoreNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryBalloonScoreNotify.newBuilder() to construct.
    private GalleryBalloonScoreNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryBalloonScoreNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryBalloonScoreNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GalleryBalloonScoreNotify(
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

              galleryId_ = input.readUInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                uidScoreMap_ = com.google.protobuf.MapField.newMapField(
                    UidScoreMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              uidScoreMap__ = input.readMessage(
                  UidScoreMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              uidScoreMap_.getMutableMap().put(
                  uidScoreMap__.getKey(), uidScoreMap__.getValue());
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
      return emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.internal_static_GalleryBalloonScoreNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetUidScoreMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.internal_static_GalleryBalloonScoreNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify.class, emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify.Builder.class);
    }

    public static final int UID_SCORE_MAP_FIELD_NUMBER = 2;
    private static final class UidScoreMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.internal_static_GalleryBalloonScoreNotify_UidScoreMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> uidScoreMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetUidScoreMap() {
      if (uidScoreMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UidScoreMapDefaultEntryHolder.defaultEntry);
      }
      return uidScoreMap_;
    }

    public int getUidScoreMapCount() {
      return internalGetUidScoreMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */

    @java.lang.Override
    public boolean containsUidScoreMap(
        int key) {
      
      return internalGetUidScoreMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUidScoreMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getUidScoreMap() {
      return getUidScoreMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getUidScoreMapMap() {
      return internalGetUidScoreMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */
    @java.lang.Override

    public int getUidScoreMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUidScoreMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
     */
    @java.lang.Override

    public int getUidScoreMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUidScoreMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 1;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 1;</code>
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
      if (galleryId_ != 0) {
        output.writeUInt32(1, galleryId_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetUidScoreMap(),
          UidScoreMapDefaultEntryHolder.defaultEntry,
          2);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, galleryId_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetUidScoreMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        uidScoreMap__ = UidScoreMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, uidScoreMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify other = (emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify) obj;

      if (!internalGetUidScoreMap().equals(
          other.internalGetUidScoreMap())) return false;
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
      if (!internalGetUidScoreMap().getMap().isEmpty()) {
        hash = (37 * hash) + UID_SCORE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetUidScoreMap().hashCode();
      }
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify prototype) {
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
     * CmdId: 5589
     * Name: OOMEGDEJPJC
     * </pre>
     *
     * Protobuf type {@code GalleryBalloonScoreNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryBalloonScoreNotify)
        emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.internal_static_GalleryBalloonScoreNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetUidScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableUidScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.internal_static_GalleryBalloonScoreNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify.class, emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify.newBuilder()
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
        internalGetMutableUidScoreMap().clear();
        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.internal_static_GalleryBalloonScoreNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify build() {
        emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify buildPartial() {
        emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify result = new emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify(this);
        int from_bitField0_ = bitField0_;
        result.uidScoreMap_ = internalGetUidScoreMap();
        result.uidScoreMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify other) {
        if (other == emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify.getDefaultInstance()) return this;
        internalGetMutableUidScoreMap().mergeFrom(
            other.internalGetUidScoreMap());
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
        emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> uidScoreMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetUidScoreMap() {
        if (uidScoreMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              UidScoreMapDefaultEntryHolder.defaultEntry);
        }
        return uidScoreMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableUidScoreMap() {
        onChanged();;
        if (uidScoreMap_ == null) {
          uidScoreMap_ = com.google.protobuf.MapField.newMapField(
              UidScoreMapDefaultEntryHolder.defaultEntry);
        }
        if (!uidScoreMap_.isMutable()) {
          uidScoreMap_ = uidScoreMap_.copy();
        }
        return uidScoreMap_;
      }

      public int getUidScoreMapCount() {
        return internalGetUidScoreMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
       */

      @java.lang.Override
      public boolean containsUidScoreMap(
          int key) {
        
        return internalGetUidScoreMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getUidScoreMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getUidScoreMap() {
        return getUidScoreMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getUidScoreMapMap() {
        return internalGetUidScoreMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
       */
      @java.lang.Override

      public int getUidScoreMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUidScoreMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
       */
      @java.lang.Override

      public int getUidScoreMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUidScoreMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearUidScoreMap() {
        internalGetMutableUidScoreMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
       */

      public Builder removeUidScoreMap(
          int key) {
        
        internalGetMutableUidScoreMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableUidScoreMap() {
        return internalGetMutableUidScoreMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
       */
      public Builder putUidScoreMap(
          int key,
          int value) {
        
        
        internalGetMutableUidScoreMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; uid_score_map = 2;</code>
       */

      public Builder putAllUidScoreMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableUidScoreMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:GalleryBalloonScoreNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryBalloonScoreNotify)
    private static final emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify();
    }

    public static emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryBalloonScoreNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryBalloonScoreNotify>() {
      @java.lang.Override
      public GalleryBalloonScoreNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GalleryBalloonScoreNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GalleryBalloonScoreNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryBalloonScoreNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GalleryBalloonScoreNotifyOuterClass.GalleryBalloonScoreNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryBalloonScoreNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryBalloonScoreNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryBalloonScoreNotify_UidScoreMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryBalloonScoreNotify_UidScoreMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GalleryBalloonScoreNotify.proto\"\247\001\n\031Ga" +
      "lleryBalloonScoreNotify\022B\n\ruid_score_map" +
      "\030\002 \003(\0132+.GalleryBalloonScoreNotify.UidSc" +
      "oreMapEntry\022\022\n\ngallery_id\030\001 \001(\r\0322\n\020UidSc" +
      "oreMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:" +
      "\0028\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryBalloonScoreNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryBalloonScoreNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryBalloonScoreNotify_descriptor,
        new java.lang.String[] { "UidScoreMap", "GalleryId", });
    internal_static_GalleryBalloonScoreNotify_UidScoreMapEntry_descriptor =
      internal_static_GalleryBalloonScoreNotify_descriptor.getNestedTypes().get(0);
    internal_static_GalleryBalloonScoreNotify_UidScoreMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryBalloonScoreNotify_UidScoreMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
