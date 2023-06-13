// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerMatchAgreedResultNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerMatchAgreedResultNotifyOuterClass {
  private PlayerMatchAgreedResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerMatchAgreedResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerMatchAgreedResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType();

    /**
     * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason getReason();
  }
  /**
   * <pre>
   * CmdId: 4170
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerMatchAgreedResultNotify}
   */
  public static final class PlayerMatchAgreedResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerMatchAgreedResultNotify)
      PlayerMatchAgreedResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerMatchAgreedResultNotify.newBuilder() to construct.
    private PlayerMatchAgreedResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerMatchAgreedResultNotify() {
      matchType_ = 0;
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerMatchAgreedResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerMatchAgreedResultNotify(
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
              int rawValue = input.readEnum();

              matchType_ = rawValue;
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 112: {

              targetUid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.class, emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerMatchAgreedResultNotify.Reason}
     */
    public enum Reason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>REASON_SUCC = 0;</code>
       */
      REASON_SUCC(0),
      /**
       * <code>REASON_TARGET_SCENE_CANNOT_ENTER = 1;</code>
       */
      REASON_TARGET_SCENE_CANNOT_ENTER(1),
      /**
       * <code>REASON_SELF_MP_UNAVAILABLE = 2;</code>
       */
      REASON_SELF_MP_UNAVAILABLE(2),
      /**
       * <code>REASON_OTHER_DATA_VERSION_NOT_LATEST = 3;</code>
       */
      REASON_OTHER_DATA_VERSION_NOT_LATEST(3),
      /**
       * <code>REASON_DATA_VERSION_NOT_LATEST = 4;</code>
       */
      REASON_DATA_VERSION_NOT_LATEST(4),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>REASON_SUCC = 0;</code>
       */
      public static final int REASON_SUCC_VALUE = 0;
      /**
       * <code>REASON_TARGET_SCENE_CANNOT_ENTER = 1;</code>
       */
      public static final int REASON_TARGET_SCENE_CANNOT_ENTER_VALUE = 1;
      /**
       * <code>REASON_SELF_MP_UNAVAILABLE = 2;</code>
       */
      public static final int REASON_SELF_MP_UNAVAILABLE_VALUE = 2;
      /**
       * <code>REASON_OTHER_DATA_VERSION_NOT_LATEST = 3;</code>
       */
      public static final int REASON_OTHER_DATA_VERSION_NOT_LATEST_VALUE = 3;
      /**
       * <code>REASON_DATA_VERSION_NOT_LATEST = 4;</code>
       */
      public static final int REASON_DATA_VERSION_NOT_LATEST_VALUE = 4;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Reason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Reason forNumber(int value) {
        switch (value) {
          case 0: return REASON_SUCC;
          case 1: return REASON_TARGET_SCENE_CANNOT_ENTER;
          case 2: return REASON_SELF_MP_UNAVAILABLE;
          case 3: return REASON_OTHER_DATA_VERSION_NOT_LATEST;
          case 4: return REASON_DATA_VERSION_NOT_LATEST;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Reason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Reason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
              public Reason findValueByNumber(int number) {
                return Reason.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final Reason[] VALUES = values();

      public static Reason valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Reason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerMatchAgreedResultNotify.Reason)
    }

    public static final int TARGET_UID_FIELD_NUMBER = 14;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 3;
    private int matchType_;
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
      return result == null ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
    }

    public static final int REASON_FIELD_NUMBER = 8;
    private int reason_;
    /**
     * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason result = emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason.UNRECOGNIZED : result;
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
      if (matchType_ != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(3, matchType_);
      }
      if (reason_ != emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason.REASON_SUCC.getNumber()) {
        output.writeEnum(8, reason_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(14, targetUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchType_ != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, matchType_);
      }
      if (reason_ != emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason.REASON_SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, reason_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, targetUid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify other = (emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (matchType_ != other.matchType_) return false;
      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify prototype) {
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
     * CmdId: 4170
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerMatchAgreedResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerMatchAgreedResultNotify)
        emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.class, emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.newBuilder()
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
        targetUid_ = 0;

        matchType_ = 0;

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify build() {
        emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify result = new emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify(this);
        result.targetUid_ = targetUid_;
        result.matchType_ = matchType_;
        result.reason_ = reason_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
        emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        
        matchType_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason result = emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Reason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerMatchAgreedResultNotify.Reason reason = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerMatchAgreedResultNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerMatchAgreedResultNotify)
    private static final emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify();
    }

    public static emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerMatchAgreedResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerMatchAgreedResultNotify>() {
      @java.lang.Override
      public PlayerMatchAgreedResultNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerMatchAgreedResultNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerMatchAgreedResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerMatchAgreedResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerMatchAgreedResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#PlayerMatchAgreedResultNotify.proto\032\017M" +
      "atchType.proto\"\272\002\n\035PlayerMatchAgreedResu" +
      "ltNotify\022\022\n\ntarget_uid\030\016 \001(\r\022\036\n\nmatch_ty" +
      "pe\030\003 \001(\0162\n.MatchType\0225\n\006reason\030\010 \001(\0162%.P" +
      "layerMatchAgreedResultNotify.Reason\"\255\001\n\006" +
      "Reason\022\017\n\013REASON_SUCC\020\000\022$\n REASON_TARGET" +
      "_SCENE_CANNOT_ENTER\020\001\022\036\n\032REASON_SELF_MP_" +
      "UNAVAILABLE\020\002\022(\n$REASON_OTHER_DATA_VERSI" +
      "ON_NOT_LATEST\020\003\022\"\n\036REASON_DATA_VERSION_N" +
      "OT_LATEST\020\004B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerMatchAgreedResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerMatchAgreedResultNotify_descriptor,
        new java.lang.String[] { "TargetUid", "MatchType", "Reason", });
    emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
