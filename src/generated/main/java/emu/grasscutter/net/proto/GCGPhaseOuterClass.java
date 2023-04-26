// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGPhase.proto

package emu.grasscutter.net.proto;

public final class GCGPhaseOuterClass {
  private GCGPhaseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGPhaseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGPhase)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */
    int getAllowControllerMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */
    boolean containsAllowControllerMap(
        int key);
    /**
     * Use {@link #getAllowControllerMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAllowControllerMap();
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAllowControllerMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */

    int getAllowControllerMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */

    int getAllowControllerMapOrThrow(
        int key);

    /**
     * <code>.GCGPhaseType phase_type = 10;</code>
     * @return The enum numeric value on the wire for phaseType.
     */
    int getPhaseTypeValue();
    /**
     * <code>.GCGPhaseType phase_type = 10;</code>
     * @return The phaseType.
     */
    emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType getPhaseType();
  }
  /**
   * <pre>
   * Name: MMACGCFHLKE
   * </pre>
   *
   * Protobuf type {@code GCGPhase}
   */
  public static final class GCGPhase extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGPhase)
      GCGPhaseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGPhase.newBuilder() to construct.
    private GCGPhase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGPhase() {
      phaseType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGPhase();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGPhase(
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
            case 80: {
              int rawValue = input.readEnum();

              phaseType_ = rawValue;
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                allowControllerMap_ = com.google.protobuf.MapField.newMapField(
                    AllowControllerMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              allowControllerMap__ = input.readMessage(
                  AllowControllerMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              allowControllerMap_.getMutableMap().put(
                  allowControllerMap__.getKey(), allowControllerMap__.getValue());
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
      return emu.grasscutter.net.proto.GCGPhaseOuterClass.internal_static_GCGPhase_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 14:
          return internalGetAllowControllerMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGPhaseOuterClass.internal_static_GCGPhase_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase.class, emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase.Builder.class);
    }

    public static final int ALLOW_CONTROLLER_MAP_FIELD_NUMBER = 14;
    private static final class AllowControllerMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.GCGPhaseOuterClass.internal_static_GCGPhase_AllowControllerMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> allowControllerMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetAllowControllerMap() {
      if (allowControllerMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AllowControllerMapDefaultEntryHolder.defaultEntry);
      }
      return allowControllerMap_;
    }

    public int getAllowControllerMapCount() {
      return internalGetAllowControllerMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */

    @java.lang.Override
    public boolean containsAllowControllerMap(
        int key) {
      
      return internalGetAllowControllerMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAllowControllerMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAllowControllerMap() {
      return getAllowControllerMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getAllowControllerMapMap() {
      return internalGetAllowControllerMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */
    @java.lang.Override

    public int getAllowControllerMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAllowControllerMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
     */
    @java.lang.Override

    public int getAllowControllerMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAllowControllerMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int PHASE_TYPE_FIELD_NUMBER = 10;
    private int phaseType_;
    /**
     * <code>.GCGPhaseType phase_type = 10;</code>
     * @return The enum numeric value on the wire for phaseType.
     */
    @java.lang.Override public int getPhaseTypeValue() {
      return phaseType_;
    }
    /**
     * <code>.GCGPhaseType phase_type = 10;</code>
     * @return The phaseType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType getPhaseType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType result = emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.valueOf(phaseType_);
      return result == null ? emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.UNRECOGNIZED : result;
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
      if (phaseType_ != emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.GCG_PHASE_INVALID.getNumber()) {
        output.writeEnum(10, phaseType_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAllowControllerMap(),
          AllowControllerMapDefaultEntryHolder.defaultEntry,
          14);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (phaseType_ != emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.GCG_PHASE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, phaseType_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetAllowControllerMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        allowControllerMap__ = AllowControllerMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(14, allowControllerMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase other = (emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase) obj;

      if (!internalGetAllowControllerMap().equals(
          other.internalGetAllowControllerMap())) return false;
      if (phaseType_ != other.phaseType_) return false;
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
      if (!internalGetAllowControllerMap().getMap().isEmpty()) {
        hash = (37 * hash) + ALLOW_CONTROLLER_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAllowControllerMap().hashCode();
      }
      hash = (37 * hash) + PHASE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + phaseType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase prototype) {
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
     * Name: MMACGCFHLKE
     * </pre>
     *
     * Protobuf type {@code GCGPhase}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGPhase)
        emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhaseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGPhaseOuterClass.internal_static_GCGPhase_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 14:
            return internalGetAllowControllerMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 14:
            return internalGetMutableAllowControllerMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGPhaseOuterClass.internal_static_GCGPhase_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase.class, emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase.newBuilder()
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
        internalGetMutableAllowControllerMap().clear();
        phaseType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGPhaseOuterClass.internal_static_GCGPhase_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase build() {
        emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase buildPartial() {
        emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase result = new emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase(this);
        int from_bitField0_ = bitField0_;
        result.allowControllerMap_ = internalGetAllowControllerMap();
        result.allowControllerMap_.makeImmutable();
        result.phaseType_ = phaseType_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase) {
          return mergeFrom((emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase other) {
        if (other == emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase.getDefaultInstance()) return this;
        internalGetMutableAllowControllerMap().mergeFrom(
            other.internalGetAllowControllerMap());
        if (other.phaseType_ != 0) {
          setPhaseTypeValue(other.getPhaseTypeValue());
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
        emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> allowControllerMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetAllowControllerMap() {
        if (allowControllerMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AllowControllerMapDefaultEntryHolder.defaultEntry);
        }
        return allowControllerMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableAllowControllerMap() {
        onChanged();;
        if (allowControllerMap_ == null) {
          allowControllerMap_ = com.google.protobuf.MapField.newMapField(
              AllowControllerMapDefaultEntryHolder.defaultEntry);
        }
        if (!allowControllerMap_.isMutable()) {
          allowControllerMap_ = allowControllerMap_.copy();
        }
        return allowControllerMap_;
      }

      public int getAllowControllerMapCount() {
        return internalGetAllowControllerMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
       */

      @java.lang.Override
      public boolean containsAllowControllerMap(
          int key) {
        
        return internalGetAllowControllerMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAllowControllerMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getAllowControllerMap() {
        return getAllowControllerMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getAllowControllerMapMap() {
        return internalGetAllowControllerMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
       */
      @java.lang.Override

      public int getAllowControllerMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAllowControllerMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
       */
      @java.lang.Override

      public int getAllowControllerMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAllowControllerMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAllowControllerMap() {
        internalGetMutableAllowControllerMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
       */

      public Builder removeAllowControllerMap(
          int key) {
        
        internalGetMutableAllowControllerMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableAllowControllerMap() {
        return internalGetMutableAllowControllerMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
       */
      public Builder putAllowControllerMap(
          int key,
          int value) {
        
        
        internalGetMutableAllowControllerMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; allow_controller_map = 14;</code>
       */

      public Builder putAllAllowControllerMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableAllowControllerMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int phaseType_ = 0;
      /**
       * <code>.GCGPhaseType phase_type = 10;</code>
       * @return The enum numeric value on the wire for phaseType.
       */
      @java.lang.Override public int getPhaseTypeValue() {
        return phaseType_;
      }
      /**
       * <code>.GCGPhaseType phase_type = 10;</code>
       * @param value The enum numeric value on the wire for phaseType to set.
       * @return This builder for chaining.
       */
      public Builder setPhaseTypeValue(int value) {
        
        phaseType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGPhaseType phase_type = 10;</code>
       * @return The phaseType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType getPhaseType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType result = emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.valueOf(phaseType_);
        return result == null ? emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGPhaseType phase_type = 10;</code>
       * @param value The phaseType to set.
       * @return This builder for chaining.
       */
      public Builder setPhaseType(emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.GCGPhaseType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        phaseType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGPhaseType phase_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhaseType() {
        
        phaseType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGPhase)
    }

    // @@protoc_insertion_point(class_scope:GCGPhase)
    private static final emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase();
    }

    public static emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGPhase>
        PARSER = new com.google.protobuf.AbstractParser<GCGPhase>() {
      @java.lang.Override
      public GCGPhase parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGPhase(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGPhase> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGPhase> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGPhaseOuterClass.GCGPhase getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGPhase_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGPhase_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGPhase_AllowControllerMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGPhase_AllowControllerMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016GCGPhase.proto\032\022GCGPhaseType.proto\"\251\001\n" +
      "\010GCGPhase\022?\n\024allow_controller_map\030\016 \003(\0132" +
      "!.GCGPhase.AllowControllerMapEntry\022!\n\nph" +
      "ase_type\030\n \001(\0162\r.GCGPhaseType\0329\n\027AllowCo" +
      "ntrollerMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002" +
      " \001(\r:\0028\001B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGPhase_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGPhase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGPhase_descriptor,
        new java.lang.String[] { "AllowControllerMap", "PhaseType", });
    internal_static_GCGPhase_AllowControllerMapEntry_descriptor =
      internal_static_GCGPhase_descriptor.getNestedTypes().get(0);
    internal_static_GCGPhase_AllowControllerMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGPhase_AllowControllerMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.GCGPhaseTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
