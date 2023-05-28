// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GHMKKFEIGMK.proto

package emu.grasscutter.net.proto;

public final class GHMKKFEIGMKOuterClass {
  private GHMKKFEIGMKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GHMKKFEIGMKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GHMKKFEIGMK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GMIOAJDAFAB enter_type = 8;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    int getEnterTypeValue();
    /**
     * <code>.GMIOAJDAFAB enter_type = 8;</code>
     * @return The enterType.
     */
    emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB getEnterType();

    /**
     * <code>uint64 dungeon_guid = 2;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();

    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * CmdId: 9267
   * </pre>
   *
   * Protobuf type {@code GHMKKFEIGMK}
   */
  public static final class GHMKKFEIGMK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GHMKKFEIGMK)
      GHMKKFEIGMKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GHMKKFEIGMK.newBuilder() to construct.
    private GHMKKFEIGMK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GHMKKFEIGMK() {
      enterType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GHMKKFEIGMK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GHMKKFEIGMK(
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

              dungeonGuid_ = input.readUInt64();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              enterType_ = rawValue;
              break;
            }
            case 80: {

              dungeonId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.internal_static_GHMKKFEIGMK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.internal_static_GHMKKFEIGMK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK.class, emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK.Builder.class);
    }

    public static final int ENTER_TYPE_FIELD_NUMBER = 8;
    private int enterType_;
    /**
     * <code>.GMIOAJDAFAB enter_type = 8;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    @java.lang.Override public int getEnterTypeValue() {
      return enterType_;
    }
    /**
     * <code>.GMIOAJDAFAB enter_type = 8;</code>
     * @return The enterType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB getEnterType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB result = emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB.valueOf(enterType_);
      return result == null ? emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB.UNRECOGNIZED : result;
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 2;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 2;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 10;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(2, dungeonGuid_);
      }
      if (enterType_ != emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB.GMIOAJDAFAB_EnterUgcDungeonNone.getNumber()) {
        output.writeEnum(8, enterType_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(10, dungeonId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, dungeonGuid_);
      }
      if (enterType_ != emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB.GMIOAJDAFAB_EnterUgcDungeonNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, enterType_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, dungeonId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK other = (emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK) obj;

      if (enterType_ != other.enterType_) return false;
      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      hash = (37 * hash) + ENTER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + enterType_;
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK prototype) {
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
     * CmdId: 9267
     * </pre>
     *
     * Protobuf type {@code GHMKKFEIGMK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GHMKKFEIGMK)
        emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.internal_static_GHMKKFEIGMK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.internal_static_GHMKKFEIGMK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK.class, emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK.newBuilder()
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
        enterType_ = 0;

        dungeonGuid_ = 0L;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.internal_static_GHMKKFEIGMK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK build() {
        emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK buildPartial() {
        emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK result = new emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK(this);
        result.enterType_ = enterType_;
        result.dungeonGuid_ = dungeonGuid_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK) {
          return mergeFrom((emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK other) {
        if (other == emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK.getDefaultInstance()) return this;
        if (other.enterType_ != 0) {
          setEnterTypeValue(other.getEnterTypeValue());
        }
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
        emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int enterType_ = 0;
      /**
       * <code>.GMIOAJDAFAB enter_type = 8;</code>
       * @return The enum numeric value on the wire for enterType.
       */
      @java.lang.Override public int getEnterTypeValue() {
        return enterType_;
      }
      /**
       * <code>.GMIOAJDAFAB enter_type = 8;</code>
       * @param value The enum numeric value on the wire for enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterTypeValue(int value) {
        
        enterType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GMIOAJDAFAB enter_type = 8;</code>
       * @return The enterType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB getEnterType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB result = emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB.valueOf(enterType_);
        return result == null ? emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB.UNRECOGNIZED : result;
      }
      /**
       * <code>.GMIOAJDAFAB enter_type = 8;</code>
       * @param value The enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterType(emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.GMIOAJDAFAB value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        enterType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GMIOAJDAFAB enter_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterType() {
        
        enterType_ = 0;
        onChanged();
        return this;
      }

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 2;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 2;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GHMKKFEIGMK)
    }

    // @@protoc_insertion_point(class_scope:GHMKKFEIGMK)
    private static final emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK();
    }

    public static emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GHMKKFEIGMK>
        PARSER = new com.google.protobuf.AbstractParser<GHMKKFEIGMK>() {
      @java.lang.Override
      public GHMKKFEIGMK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GHMKKFEIGMK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GHMKKFEIGMK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GHMKKFEIGMK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GHMKKFEIGMKOuterClass.GHMKKFEIGMK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GHMKKFEIGMK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GHMKKFEIGMK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GHMKKFEIGMK.proto\032\021GMIOAJDAFAB.proto\"Y" +
      "\n\013GHMKKFEIGMK\022 \n\nenter_type\030\010 \001(\0162\014.GMIO" +
      "AJDAFAB\022\024\n\014dungeon_guid\030\002 \001(\004\022\022\n\ndungeon" +
      "_id\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.getDescriptor(),
        });
    internal_static_GHMKKFEIGMK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GHMKKFEIGMK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GHMKKFEIGMK_descriptor,
        new java.lang.String[] { "EnterType", "DungeonGuid", "DungeonId", });
    emu.grasscutter.net.proto.GMIOAJDAFABOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
