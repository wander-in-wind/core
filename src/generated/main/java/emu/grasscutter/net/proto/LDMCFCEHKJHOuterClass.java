// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LDMCFCEHKJH.proto

package emu.grasscutter.net.proto;

public final class LDMCFCEHKJHOuterClass {
  private LDMCFCEHKJHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LDMCFCEHKJHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LDMCFCEHKJH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool KOKIFJMPGLI = 3;</code>
     * @return The kOKIFJMPGLI.
     */
    boolean getKOKIFJMPGLI();

    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */
    int getGadgetChainLevelMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */
    boolean containsGadgetChainLevelMap(
        int key);
    /**
     * Use {@link #getGadgetChainLevelMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGadgetChainLevelMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGadgetChainLevelMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */

    int getGadgetChainLevelMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */

    int getGadgetChainLevelMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 829
   * Name: LDMCFCEHKJH
   * </pre>
   *
   * Protobuf type {@code LDMCFCEHKJH}
   */
  public static final class LDMCFCEHKJH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LDMCFCEHKJH)
      LDMCFCEHKJHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LDMCFCEHKJH.newBuilder() to construct.
    private LDMCFCEHKJH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LDMCFCEHKJH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LDMCFCEHKJH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LDMCFCEHKJH(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gadgetChainLevelMap_ = com.google.protobuf.MapField.newMapField(
                    GadgetChainLevelMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              gadgetChainLevelMap__ = input.readMessage(
                  GadgetChainLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              gadgetChainLevelMap_.getMutableMap().put(
                  gadgetChainLevelMap__.getKey(), gadgetChainLevelMap__.getValue());
              break;
            }
            case 24: {

              kOKIFJMPGLI_ = input.readBool();
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
      return emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.internal_static_LDMCFCEHKJH_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetGadgetChainLevelMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.internal_static_LDMCFCEHKJH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH.class, emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH.Builder.class);
    }

    public static final int KOKIFJMPGLI_FIELD_NUMBER = 3;
    private boolean kOKIFJMPGLI_;
    /**
     * <code>bool KOKIFJMPGLI = 3;</code>
     * @return The kOKIFJMPGLI.
     */
    @java.lang.Override
    public boolean getKOKIFJMPGLI() {
      return kOKIFJMPGLI_;
    }

    public static final int GADGET_CHAIN_LEVEL_MAP_FIELD_NUMBER = 1;
    private static final class GadgetChainLevelMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.internal_static_LDMCFCEHKJH_GadgetChainLevelMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> gadgetChainLevelMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetGadgetChainLevelMap() {
      if (gadgetChainLevelMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GadgetChainLevelMapDefaultEntryHolder.defaultEntry);
      }
      return gadgetChainLevelMap_;
    }

    public int getGadgetChainLevelMapCount() {
      return internalGetGadgetChainLevelMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */

    @java.lang.Override
    public boolean containsGadgetChainLevelMap(
        int key) {
      
      return internalGetGadgetChainLevelMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGadgetChainLevelMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getGadgetChainLevelMap() {
      return getGadgetChainLevelMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getGadgetChainLevelMapMap() {
      return internalGetGadgetChainLevelMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */
    @java.lang.Override

    public int getGadgetChainLevelMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGadgetChainLevelMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
     */
    @java.lang.Override

    public int getGadgetChainLevelMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGadgetChainLevelMap().getMap();
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetGadgetChainLevelMap(),
          GadgetChainLevelMapDefaultEntryHolder.defaultEntry,
          1);
      if (kOKIFJMPGLI_ != false) {
        output.writeBool(3, kOKIFJMPGLI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetGadgetChainLevelMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        gadgetChainLevelMap__ = GadgetChainLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, gadgetChainLevelMap__);
      }
      if (kOKIFJMPGLI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, kOKIFJMPGLI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH other = (emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH) obj;

      if (getKOKIFJMPGLI()
          != other.getKOKIFJMPGLI()) return false;
      if (!internalGetGadgetChainLevelMap().equals(
          other.internalGetGadgetChainLevelMap())) return false;
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
      hash = (37 * hash) + KOKIFJMPGLI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKOKIFJMPGLI());
      if (!internalGetGadgetChainLevelMap().getMap().isEmpty()) {
        hash = (37 * hash) + GADGET_CHAIN_LEVEL_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetGadgetChainLevelMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH prototype) {
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
     * CmdId: 829
     * Name: LDMCFCEHKJH
     * </pre>
     *
     * Protobuf type {@code LDMCFCEHKJH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LDMCFCEHKJH)
        emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.internal_static_LDMCFCEHKJH_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetGadgetChainLevelMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableGadgetChainLevelMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.internal_static_LDMCFCEHKJH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH.class, emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH.newBuilder()
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
        kOKIFJMPGLI_ = false;

        internalGetMutableGadgetChainLevelMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.internal_static_LDMCFCEHKJH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH build() {
        emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH buildPartial() {
        emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH result = new emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH(this);
        int from_bitField0_ = bitField0_;
        result.kOKIFJMPGLI_ = kOKIFJMPGLI_;
        result.gadgetChainLevelMap_ = internalGetGadgetChainLevelMap();
        result.gadgetChainLevelMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH) {
          return mergeFrom((emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH other) {
        if (other == emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH.getDefaultInstance()) return this;
        if (other.getKOKIFJMPGLI() != false) {
          setKOKIFJMPGLI(other.getKOKIFJMPGLI());
        }
        internalGetMutableGadgetChainLevelMap().mergeFrom(
            other.internalGetGadgetChainLevelMap());
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
        emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean kOKIFJMPGLI_ ;
      /**
       * <code>bool KOKIFJMPGLI = 3;</code>
       * @return The kOKIFJMPGLI.
       */
      @java.lang.Override
      public boolean getKOKIFJMPGLI() {
        return kOKIFJMPGLI_;
      }
      /**
       * <code>bool KOKIFJMPGLI = 3;</code>
       * @param value The kOKIFJMPGLI to set.
       * @return This builder for chaining.
       */
      public Builder setKOKIFJMPGLI(boolean value) {
        
        kOKIFJMPGLI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool KOKIFJMPGLI = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKOKIFJMPGLI() {
        
        kOKIFJMPGLI_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> gadgetChainLevelMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetGadgetChainLevelMap() {
        if (gadgetChainLevelMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              GadgetChainLevelMapDefaultEntryHolder.defaultEntry);
        }
        return gadgetChainLevelMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableGadgetChainLevelMap() {
        onChanged();;
        if (gadgetChainLevelMap_ == null) {
          gadgetChainLevelMap_ = com.google.protobuf.MapField.newMapField(
              GadgetChainLevelMapDefaultEntryHolder.defaultEntry);
        }
        if (!gadgetChainLevelMap_.isMutable()) {
          gadgetChainLevelMap_ = gadgetChainLevelMap_.copy();
        }
        return gadgetChainLevelMap_;
      }

      public int getGadgetChainLevelMapCount() {
        return internalGetGadgetChainLevelMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
       */

      @java.lang.Override
      public boolean containsGadgetChainLevelMap(
          int key) {
        
        return internalGetGadgetChainLevelMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getGadgetChainLevelMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getGadgetChainLevelMap() {
        return getGadgetChainLevelMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getGadgetChainLevelMapMap() {
        return internalGetGadgetChainLevelMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
       */
      @java.lang.Override

      public int getGadgetChainLevelMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGadgetChainLevelMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
       */
      @java.lang.Override

      public int getGadgetChainLevelMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGadgetChainLevelMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearGadgetChainLevelMap() {
        internalGetMutableGadgetChainLevelMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
       */

      public Builder removeGadgetChainLevelMap(
          int key) {
        
        internalGetMutableGadgetChainLevelMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableGadgetChainLevelMap() {
        return internalGetMutableGadgetChainLevelMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
       */
      public Builder putGadgetChainLevelMap(
          int key,
          int value) {
        
        
        internalGetMutableGadgetChainLevelMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gadget_chain_level_map = 1;</code>
       */

      public Builder putAllGadgetChainLevelMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableGadgetChainLevelMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:LDMCFCEHKJH)
    }

    // @@protoc_insertion_point(class_scope:LDMCFCEHKJH)
    private static final emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH();
    }

    public static emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LDMCFCEHKJH>
        PARSER = new com.google.protobuf.AbstractParser<LDMCFCEHKJH>() {
      @java.lang.Override
      public LDMCFCEHKJH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LDMCFCEHKJH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LDMCFCEHKJH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LDMCFCEHKJH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LDMCFCEHKJHOuterClass.LDMCFCEHKJH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LDMCFCEHKJH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LDMCFCEHKJH_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LDMCFCEHKJH_GadgetChainLevelMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LDMCFCEHKJH_GadgetChainLevelMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LDMCFCEHKJH.proto\"\245\001\n\013LDMCFCEHKJH\022\023\n\013K" +
      "OKIFJMPGLI\030\003 \001(\010\022E\n\026gadget_chain_level_m" +
      "ap\030\001 \003(\0132%.LDMCFCEHKJH.GadgetChainLevelM" +
      "apEntry\032:\n\030GadgetChainLevelMapEntry\022\013\n\003k" +
      "ey\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LDMCFCEHKJH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LDMCFCEHKJH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LDMCFCEHKJH_descriptor,
        new java.lang.String[] { "KOKIFJMPGLI", "GadgetChainLevelMap", });
    internal_static_LDMCFCEHKJH_GadgetChainLevelMapEntry_descriptor =
      internal_static_LDMCFCEHKJH_descriptor.getNestedTypes().get(0);
    internal_static_LDMCFCEHKJH_GadgetChainLevelMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LDMCFCEHKJH_GadgetChainLevelMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
