// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JMBJHKIMDFC.proto

package emu.grasscutter.net.proto;

public final class JMBJHKIMDFCOuterClass {
  private JMBJHKIMDFCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JMBJHKIMDFCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JMBJHKIMDFC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */
    int getMHKGBAKJPDPCount();
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */
    boolean containsMHKGBAKJPDP(
        int key);
    /**
     * Use {@link #getMHKGBAKJPDPMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
    getMHKGBAKJPDP();
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
    getMHKGBAKJPDPMap();
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */

    emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getMHKGBAKJPDPOrDefault(
        int key,
        emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO defaultValue);
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */

    emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getMHKGBAKJPDPOrThrow(
        int key);
  }
  /**
   * <pre>
   * Name: JMBJHKIMDFC
   * </pre>
   *
   * Protobuf type {@code JMBJHKIMDFC}
   */
  public static final class JMBJHKIMDFC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JMBJHKIMDFC)
      JMBJHKIMDFCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JMBJHKIMDFC.newBuilder() to construct.
    private JMBJHKIMDFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JMBJHKIMDFC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JMBJHKIMDFC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JMBJHKIMDFC(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mHKGBAKJPDP_ = com.google.protobuf.MapField.newMapField(
                    MHKGBAKJPDPDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
              mHKGBAKJPDP__ = input.readMessage(
                  MHKGBAKJPDPDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              mHKGBAKJPDP_.getMutableMap().put(
                  mHKGBAKJPDP__.getKey(), mHKGBAKJPDP__.getValue());
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
      return emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.internal_static_JMBJHKIMDFC_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMHKGBAKJPDP();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.internal_static_JMBJHKIMDFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC.class, emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC.Builder.class);
    }

    public static final int MHKGBAKJPDP_FIELD_NUMBER = 3;
    private static final class MHKGBAKJPDPDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>newDefaultInstance(
                  emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.internal_static_JMBJHKIMDFC_MHKGBAKJPDPEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> mHKGBAKJPDP_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
    internalGetMHKGBAKJPDP() {
      if (mHKGBAKJPDP_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MHKGBAKJPDPDefaultEntryHolder.defaultEntry);
      }
      return mHKGBAKJPDP_;
    }

    public int getMHKGBAKJPDPCount() {
      return internalGetMHKGBAKJPDP().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */

    @java.lang.Override
    public boolean containsMHKGBAKJPDP(
        int key) {
      
      return internalGetMHKGBAKJPDP().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMHKGBAKJPDPMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> getMHKGBAKJPDP() {
      return getMHKGBAKJPDPMap();
    }
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> getMHKGBAKJPDPMap() {
      return internalGetMHKGBAKJPDP().getMap();
    }
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getMHKGBAKJPDPOrDefault(
        int key,
        emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> map =
          internalGetMHKGBAKJPDP().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getMHKGBAKJPDPOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> map =
          internalGetMHKGBAKJPDP().getMap();
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
          internalGetMHKGBAKJPDP(),
          MHKGBAKJPDPDefaultEntryHolder.defaultEntry,
          3);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> entry
           : internalGetMHKGBAKJPDP().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
        mHKGBAKJPDP__ = MHKGBAKJPDPDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, mHKGBAKJPDP__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC other = (emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC) obj;

      if (!internalGetMHKGBAKJPDP().equals(
          other.internalGetMHKGBAKJPDP())) return false;
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
      if (!internalGetMHKGBAKJPDP().getMap().isEmpty()) {
        hash = (37 * hash) + MHKGBAKJPDP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetMHKGBAKJPDP().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC prototype) {
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
     * Name: JMBJHKIMDFC
     * </pre>
     *
     * Protobuf type {@code JMBJHKIMDFC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JMBJHKIMDFC)
        emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.internal_static_JMBJHKIMDFC_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMHKGBAKJPDP();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMutableMHKGBAKJPDP();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.internal_static_JMBJHKIMDFC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC.class, emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC.newBuilder()
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
        internalGetMutableMHKGBAKJPDP().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.internal_static_JMBJHKIMDFC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC build() {
        emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC buildPartial() {
        emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC result = new emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC(this);
        int from_bitField0_ = bitField0_;
        result.mHKGBAKJPDP_ = internalGetMHKGBAKJPDP();
        result.mHKGBAKJPDP_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC) {
          return mergeFrom((emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC other) {
        if (other == emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC.getDefaultInstance()) return this;
        internalGetMutableMHKGBAKJPDP().mergeFrom(
            other.internalGetMHKGBAKJPDP());
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
        emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC) e.getUnfinishedMessage();
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
          java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> mHKGBAKJPDP_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
      internalGetMHKGBAKJPDP() {
        if (mHKGBAKJPDP_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              MHKGBAKJPDPDefaultEntryHolder.defaultEntry);
        }
        return mHKGBAKJPDP_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
      internalGetMutableMHKGBAKJPDP() {
        onChanged();;
        if (mHKGBAKJPDP_ == null) {
          mHKGBAKJPDP_ = com.google.protobuf.MapField.newMapField(
              MHKGBAKJPDPDefaultEntryHolder.defaultEntry);
        }
        if (!mHKGBAKJPDP_.isMutable()) {
          mHKGBAKJPDP_ = mHKGBAKJPDP_.copy();
        }
        return mHKGBAKJPDP_;
      }

      public int getMHKGBAKJPDPCount() {
        return internalGetMHKGBAKJPDP().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
       */

      @java.lang.Override
      public boolean containsMHKGBAKJPDP(
          int key) {
        
        return internalGetMHKGBAKJPDP().getMap().containsKey(key);
      }
      /**
       * Use {@link #getMHKGBAKJPDPMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> getMHKGBAKJPDP() {
        return getMHKGBAKJPDPMap();
      }
      /**
       * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> getMHKGBAKJPDPMap() {
        return internalGetMHKGBAKJPDP().getMap();
      }
      /**
       * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getMHKGBAKJPDPOrDefault(
          int key,
          emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> map =
            internalGetMHKGBAKJPDP().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getMHKGBAKJPDPOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> map =
            internalGetMHKGBAKJPDP().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearMHKGBAKJPDP() {
        internalGetMutableMHKGBAKJPDP().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
       */

      public Builder removeMHKGBAKJPDP(
          int key) {
        
        internalGetMutableMHKGBAKJPDP().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO>
      getMutableMHKGBAKJPDP() {
        return internalGetMutableMHKGBAKJPDP().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
       */
      public Builder putMHKGBAKJPDP(
          int key,
          emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableMHKGBAKJPDP().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .OJEEKAIOFBO&gt; MHKGBAKJPDP = 3;</code>
       */

      public Builder putAllMHKGBAKJPDP(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO> values) {
        internalGetMutableMHKGBAKJPDP().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:JMBJHKIMDFC)
    }

    // @@protoc_insertion_point(class_scope:JMBJHKIMDFC)
    private static final emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC();
    }

    public static emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JMBJHKIMDFC>
        PARSER = new com.google.protobuf.AbstractParser<JMBJHKIMDFC>() {
      @java.lang.Override
      public JMBJHKIMDFC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JMBJHKIMDFC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JMBJHKIMDFC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JMBJHKIMDFC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JMBJHKIMDFCOuterClass.JMBJHKIMDFC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JMBJHKIMDFC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JMBJHKIMDFC_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JMBJHKIMDFC_MHKGBAKJPDPEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JMBJHKIMDFC_MHKGBAKJPDPEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JMBJHKIMDFC.proto\032\021OJEEKAIOFBO.proto\"\203" +
      "\001\n\013JMBJHKIMDFC\0222\n\013MHKGBAKJPDP\030\003 \003(\0132\035.JM" +
      "BJHKIMDFC.MHKGBAKJPDPEntry\032@\n\020MHKGBAKJPD" +
      "PEntry\022\013\n\003key\030\001 \001(\r\022\033\n\005value\030\002 \001(\0132\014.OJE" +
      "EKAIOFBO:\0028\001B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.getDescriptor(),
        });
    internal_static_JMBJHKIMDFC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JMBJHKIMDFC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JMBJHKIMDFC_descriptor,
        new java.lang.String[] { "MHKGBAKJPDP", });
    internal_static_JMBJHKIMDFC_MHKGBAKJPDPEntry_descriptor =
      internal_static_JMBJHKIMDFC_descriptor.getNestedTypes().get(0);
    internal_static_JMBJHKIMDFC_MHKGBAKJPDPEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JMBJHKIMDFC_MHKGBAKJPDPEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
