// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DLIGBJOALKN.proto

package emu.grasscutter.net.proto;

public final class DLIGBJOALKNOuterClass {
  private DLIGBJOALKNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DLIGBJOALKNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DLIGBJOALKN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 14;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 event_id = 11;</code>
     * @return The eventId.
     */
    int getEventId();

    /**
     * <code>uint32 CFKBGIGOEEJ = 8;</code>
     * @return The cFKBGIGOEEJ.
     */
    int getCFKBGIGOEEJ();

    /**
     * <code>uint32 suite_id = 4;</code>
     * @return The suiteId.
     */
    int getSuiteId();

    /**
     * <code>uint32 guid = 9;</code>
     * @return The guid.
     */
    int getGuid();
  }
  /**
   * <pre>
   * Name: DLIGBJOALKN
   * </pre>
   *
   * Protobuf type {@code DLIGBJOALKN}
   */
  public static final class DLIGBJOALKN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DLIGBJOALKN)
      DLIGBJOALKNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DLIGBJOALKN.newBuilder() to construct.
    private DLIGBJOALKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DLIGBJOALKN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DLIGBJOALKN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DLIGBJOALKN(
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
            case 32: {

              suiteId_ = input.readUInt32();
              break;
            }
            case 64: {

              cFKBGIGOEEJ_ = input.readUInt32();
              break;
            }
            case 72: {

              guid_ = input.readUInt32();
              break;
            }
            case 88: {

              eventId_ = input.readUInt32();
              break;
            }
            case 112: {

              avatarId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.internal_static_DLIGBJOALKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.internal_static_DLIGBJOALKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN.class, emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 14;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 14;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int EVENT_ID_FIELD_NUMBER = 11;
    private int eventId_;
    /**
     * <code>uint32 event_id = 11;</code>
     * @return The eventId.
     */
    @java.lang.Override
    public int getEventId() {
      return eventId_;
    }

    public static final int CFKBGIGOEEJ_FIELD_NUMBER = 8;
    private int cFKBGIGOEEJ_;
    /**
     * <code>uint32 CFKBGIGOEEJ = 8;</code>
     * @return The cFKBGIGOEEJ.
     */
    @java.lang.Override
    public int getCFKBGIGOEEJ() {
      return cFKBGIGOEEJ_;
    }

    public static final int SUITE_ID_FIELD_NUMBER = 4;
    private int suiteId_;
    /**
     * <code>uint32 suite_id = 4;</code>
     * @return The suiteId.
     */
    @java.lang.Override
    public int getSuiteId() {
      return suiteId_;
    }

    public static final int GUID_FIELD_NUMBER = 9;
    private int guid_;
    /**
     * <code>uint32 guid = 9;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
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
      if (suiteId_ != 0) {
        output.writeUInt32(4, suiteId_);
      }
      if (cFKBGIGOEEJ_ != 0) {
        output.writeUInt32(8, cFKBGIGOEEJ_);
      }
      if (guid_ != 0) {
        output.writeUInt32(9, guid_);
      }
      if (eventId_ != 0) {
        output.writeUInt32(11, eventId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(14, avatarId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (suiteId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, suiteId_);
      }
      if (cFKBGIGOEEJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cFKBGIGOEEJ_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, guid_);
      }
      if (eventId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, eventId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, avatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN other = (emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getEventId()
          != other.getEventId()) return false;
      if (getCFKBGIGOEEJ()
          != other.getCFKBGIGOEEJ()) return false;
      if (getSuiteId()
          != other.getSuiteId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEventId();
      hash = (37 * hash) + CFKBGIGOEEJ_FIELD_NUMBER;
      hash = (53 * hash) + getCFKBGIGOEEJ();
      hash = (37 * hash) + SUITE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSuiteId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN prototype) {
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
     * Name: DLIGBJOALKN
     * </pre>
     *
     * Protobuf type {@code DLIGBJOALKN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DLIGBJOALKN)
        emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.internal_static_DLIGBJOALKN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.internal_static_DLIGBJOALKN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN.class, emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN.newBuilder()
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
        avatarId_ = 0;

        eventId_ = 0;

        cFKBGIGOEEJ_ = 0;

        suiteId_ = 0;

        guid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.internal_static_DLIGBJOALKN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN build() {
        emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN buildPartial() {
        emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN result = new emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN(this);
        result.avatarId_ = avatarId_;
        result.eventId_ = eventId_;
        result.cFKBGIGOEEJ_ = cFKBGIGOEEJ_;
        result.suiteId_ = suiteId_;
        result.guid_ = guid_;
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
        if (other instanceof emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN) {
          return mergeFrom((emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN other) {
        if (other == emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getEventId() != 0) {
          setEventId(other.getEventId());
        }
        if (other.getCFKBGIGOEEJ() != 0) {
          setCFKBGIGOEEJ(other.getCFKBGIGOEEJ());
        }
        if (other.getSuiteId() != 0) {
          setSuiteId(other.getSuiteId());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
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
        emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int eventId_ ;
      /**
       * <code>uint32 event_id = 11;</code>
       * @return The eventId.
       */
      @java.lang.Override
      public int getEventId() {
        return eventId_;
      }
      /**
       * <code>uint32 event_id = 11;</code>
       * @param value The eventId to set.
       * @return This builder for chaining.
       */
      public Builder setEventId(int value) {
        
        eventId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 event_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventId() {
        
        eventId_ = 0;
        onChanged();
        return this;
      }

      private int cFKBGIGOEEJ_ ;
      /**
       * <code>uint32 CFKBGIGOEEJ = 8;</code>
       * @return The cFKBGIGOEEJ.
       */
      @java.lang.Override
      public int getCFKBGIGOEEJ() {
        return cFKBGIGOEEJ_;
      }
      /**
       * <code>uint32 CFKBGIGOEEJ = 8;</code>
       * @param value The cFKBGIGOEEJ to set.
       * @return This builder for chaining.
       */
      public Builder setCFKBGIGOEEJ(int value) {
        
        cFKBGIGOEEJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CFKBGIGOEEJ = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCFKBGIGOEEJ() {
        
        cFKBGIGOEEJ_ = 0;
        onChanged();
        return this;
      }

      private int suiteId_ ;
      /**
       * <code>uint32 suite_id = 4;</code>
       * @return The suiteId.
       */
      @java.lang.Override
      public int getSuiteId() {
        return suiteId_;
      }
      /**
       * <code>uint32 suite_id = 4;</code>
       * @param value The suiteId to set.
       * @return This builder for chaining.
       */
      public Builder setSuiteId(int value) {
        
        suiteId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 suite_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuiteId() {
        
        suiteId_ = 0;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 9;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 9;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DLIGBJOALKN)
    }

    // @@protoc_insertion_point(class_scope:DLIGBJOALKN)
    private static final emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN();
    }

    public static emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DLIGBJOALKN>
        PARSER = new com.google.protobuf.AbstractParser<DLIGBJOALKN>() {
      @java.lang.Override
      public DLIGBJOALKN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DLIGBJOALKN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DLIGBJOALKN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DLIGBJOALKN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DLIGBJOALKNOuterClass.DLIGBJOALKN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DLIGBJOALKN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DLIGBJOALKN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DLIGBJOALKN.proto\"g\n\013DLIGBJOALKN\022\021\n\tav" +
      "atar_id\030\016 \001(\r\022\020\n\010event_id\030\013 \001(\r\022\023\n\013CFKBG" +
      "IGOEEJ\030\010 \001(\r\022\020\n\010suite_id\030\004 \001(\r\022\014\n\004guid\030\t" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DLIGBJOALKN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DLIGBJOALKN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DLIGBJOALKN_descriptor,
        new java.lang.String[] { "AvatarId", "EventId", "CFKBGIGOEEJ", "SuiteId", "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
