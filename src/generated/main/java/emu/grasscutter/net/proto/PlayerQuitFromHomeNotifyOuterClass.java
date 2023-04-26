// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerQuitFromHomeNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerQuitFromHomeNotifyOuterClass {
  private PlayerQuitFromHomeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerQuitFromHomeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerQuitFromHomeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason getReason();
  }
  /**
   * <pre>
   * CmdId: 4745
   * Name: FFPLCCEFMAP
   * </pre>
   *
   * Protobuf type {@code PlayerQuitFromHomeNotify}
   */
  public static final class PlayerQuitFromHomeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerQuitFromHomeNotify)
      PlayerQuitFromHomeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerQuitFromHomeNotify.newBuilder() to construct.
    private PlayerQuitFromHomeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerQuitFromHomeNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerQuitFromHomeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerQuitFromHomeNotify(
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
              int rawValue = input.readEnum();

              reason_ = rawValue;
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
      return emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.class, emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.Builder.class);
    }

    /**
     * <pre>
     * Name: LMPPPABCCLK
     * </pre>
     *
     * Protobuf enum {@code PlayerQuitFromHomeNotify.QuitReason}
     */
    public enum QuitReason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>INVALID = 0;</code>
       */
      INVALID(0),
      /**
       * <code>KICK_BY_HOST = 1;</code>
       */
      KICK_BY_HOST(1),
      /**
       * <code>BACK_TO_MY_WORLD = 2;</code>
       */
      BACK_TO_MY_WORLD(2),
      /**
       * <code>HOME_BLOCKED = 3;</code>
       */
      HOME_BLOCKED(3),
      /**
       * <code>HOME_IN_EDIT_MODE = 4;</code>
       */
      HOME_IN_EDIT_MODE(4),
      /**
       * <code>BY_MUIP = 5;</code>
       */
      BY_MUIP(5),
      /**
       * <code>CUR_MODULE_CLOSED = 6;</code>
       */
      CUR_MODULE_CLOSED(6),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>INVALID = 0;</code>
       */
      public static final int INVALID_VALUE = 0;
      /**
       * <code>KICK_BY_HOST = 1;</code>
       */
      public static final int KICK_BY_HOST_VALUE = 1;
      /**
       * <code>BACK_TO_MY_WORLD = 2;</code>
       */
      public static final int BACK_TO_MY_WORLD_VALUE = 2;
      /**
       * <code>HOME_BLOCKED = 3;</code>
       */
      public static final int HOME_BLOCKED_VALUE = 3;
      /**
       * <code>HOME_IN_EDIT_MODE = 4;</code>
       */
      public static final int HOME_IN_EDIT_MODE_VALUE = 4;
      /**
       * <code>BY_MUIP = 5;</code>
       */
      public static final int BY_MUIP_VALUE = 5;
      /**
       * <code>CUR_MODULE_CLOSED = 6;</code>
       */
      public static final int CUR_MODULE_CLOSED_VALUE = 6;


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
      public static QuitReason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static QuitReason forNumber(int value) {
        switch (value) {
          case 0: return INVALID;
          case 1: return KICK_BY_HOST;
          case 2: return BACK_TO_MY_WORLD;
          case 3: return HOME_BLOCKED;
          case 4: return HOME_IN_EDIT_MODE;
          case 5: return BY_MUIP;
          case 6: return CUR_MODULE_CLOSED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<QuitReason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          QuitReason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<QuitReason>() {
              public QuitReason findValueByNumber(int number) {
                return QuitReason.forNumber(number);
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
        return emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final QuitReason[] VALUES = values();

      public static QuitReason valueOf(
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

      private QuitReason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerQuitFromHomeNotify.QuitReason)
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private int reason_;
    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason result = emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.UNRECOGNIZED : result;
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
      if (reason_ != emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.INVALID.getNumber()) {
        output.writeEnum(2, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify other = (emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify) obj;

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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify prototype) {
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
     * CmdId: 4745
     * Name: FFPLCCEFMAP
     * </pre>
     *
     * Protobuf type {@code PlayerQuitFromHomeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerQuitFromHomeNotify)
        emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.class, emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.newBuilder()
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
        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify build() {
        emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify result = new emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify(this);
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
        if (other instanceof emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.getDefaultInstance()) return this;
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
        emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason result = emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:PlayerQuitFromHomeNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerQuitFromHomeNotify)
    private static final emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify();
    }

    public static emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerQuitFromHomeNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerQuitFromHomeNotify>() {
      @java.lang.Override
      public PlayerQuitFromHomeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerQuitFromHomeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerQuitFromHomeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerQuitFromHomeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerQuitFromHomeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerQuitFromHomeNotify.proto\"\341\001\n\030Pla" +
      "yerQuitFromHomeNotify\0224\n\006reason\030\002 \001(\0162$." +
      "PlayerQuitFromHomeNotify.QuitReason\"\216\001\n\n" +
      "QuitReason\022\013\n\007INVALID\020\000\022\020\n\014KICK_BY_HOST\020" +
      "\001\022\024\n\020BACK_TO_MY_WORLD\020\002\022\020\n\014HOME_BLOCKED\020" +
      "\003\022\025\n\021HOME_IN_EDIT_MODE\020\004\022\013\n\007BY_MUIP\020\005\022\025\n" +
      "\021CUR_MODULE_CLOSED\020\006B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerQuitFromHomeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerQuitFromHomeNotify_descriptor,
        new java.lang.String[] { "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
