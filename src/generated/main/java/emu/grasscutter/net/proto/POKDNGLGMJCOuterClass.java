// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POKDNGLGMJC.proto

package emu.grasscutter.net.proto;

public final class POKDNGLGMJCOuterClass {
  private POKDNGLGMJCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface POKDNGLGMJCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:POKDNGLGMJC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector HOHCJADGKFD = 15;</code>
     * @return Whether the hOHCJADGKFD field is set.
     */
    boolean hasHOHCJADGKFD();
    /**
     * <code>.Vector HOHCJADGKFD = 15;</code>
     * @return The hOHCJADGKFD.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getHOHCJADGKFD();
    /**
     * <code>.Vector HOHCJADGKFD = 15;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHOHCJADGKFDOrBuilder();

    /**
     * <code>.Vector JOHKHKDAOGA = 7;</code>
     * @return Whether the jOHKHKDAOGA field is set.
     */
    boolean hasJOHKHKDAOGA();
    /**
     * <code>.Vector JOHKHKDAOGA = 7;</code>
     * @return The jOHKHKDAOGA.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getJOHKHKDAOGA();
    /**
     * <code>.Vector JOHKHKDAOGA = 7;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getJOHKHKDAOGAOrBuilder();
  }
  /**
   * <pre>
   * Name: POKDNGLGMJC
   * </pre>
   *
   * Protobuf type {@code POKDNGLGMJC}
   */
  public static final class POKDNGLGMJC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:POKDNGLGMJC)
      POKDNGLGMJCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use POKDNGLGMJC.newBuilder() to construct.
    private POKDNGLGMJC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private POKDNGLGMJC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new POKDNGLGMJC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private POKDNGLGMJC(
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
            case 58: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (jOHKHKDAOGA_ != null) {
                subBuilder = jOHKHKDAOGA_.toBuilder();
              }
              jOHKHKDAOGA_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jOHKHKDAOGA_);
                jOHKHKDAOGA_ = subBuilder.buildPartial();
              }

              break;
            }
            case 122: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (hOHCJADGKFD_ != null) {
                subBuilder = hOHCJADGKFD_.toBuilder();
              }
              hOHCJADGKFD_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hOHCJADGKFD_);
                hOHCJADGKFD_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.internal_static_POKDNGLGMJC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.internal_static_POKDNGLGMJC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC.class, emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC.Builder.class);
    }

    public static final int HOHCJADGKFD_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector hOHCJADGKFD_;
    /**
     * <code>.Vector HOHCJADGKFD = 15;</code>
     * @return Whether the hOHCJADGKFD field is set.
     */
    @java.lang.Override
    public boolean hasHOHCJADGKFD() {
      return hOHCJADGKFD_ != null;
    }
    /**
     * <code>.Vector HOHCJADGKFD = 15;</code>
     * @return The hOHCJADGKFD.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getHOHCJADGKFD() {
      return hOHCJADGKFD_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hOHCJADGKFD_;
    }
    /**
     * <code>.Vector HOHCJADGKFD = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHOHCJADGKFDOrBuilder() {
      return getHOHCJADGKFD();
    }

    public static final int JOHKHKDAOGA_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector jOHKHKDAOGA_;
    /**
     * <code>.Vector JOHKHKDAOGA = 7;</code>
     * @return Whether the jOHKHKDAOGA field is set.
     */
    @java.lang.Override
    public boolean hasJOHKHKDAOGA() {
      return jOHKHKDAOGA_ != null;
    }
    /**
     * <code>.Vector JOHKHKDAOGA = 7;</code>
     * @return The jOHKHKDAOGA.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getJOHKHKDAOGA() {
      return jOHKHKDAOGA_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : jOHKHKDAOGA_;
    }
    /**
     * <code>.Vector JOHKHKDAOGA = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getJOHKHKDAOGAOrBuilder() {
      return getJOHKHKDAOGA();
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
      if (jOHKHKDAOGA_ != null) {
        output.writeMessage(7, getJOHKHKDAOGA());
      }
      if (hOHCJADGKFD_ != null) {
        output.writeMessage(15, getHOHCJADGKFD());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jOHKHKDAOGA_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getJOHKHKDAOGA());
      }
      if (hOHCJADGKFD_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getHOHCJADGKFD());
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
      if (!(obj instanceof emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC other = (emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC) obj;

      if (hasHOHCJADGKFD() != other.hasHOHCJADGKFD()) return false;
      if (hasHOHCJADGKFD()) {
        if (!getHOHCJADGKFD()
            .equals(other.getHOHCJADGKFD())) return false;
      }
      if (hasJOHKHKDAOGA() != other.hasJOHKHKDAOGA()) return false;
      if (hasJOHKHKDAOGA()) {
        if (!getJOHKHKDAOGA()
            .equals(other.getJOHKHKDAOGA())) return false;
      }
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
      if (hasHOHCJADGKFD()) {
        hash = (37 * hash) + HOHCJADGKFD_FIELD_NUMBER;
        hash = (53 * hash) + getHOHCJADGKFD().hashCode();
      }
      if (hasJOHKHKDAOGA()) {
        hash = (37 * hash) + JOHKHKDAOGA_FIELD_NUMBER;
        hash = (53 * hash) + getJOHKHKDAOGA().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC prototype) {
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
     * Name: POKDNGLGMJC
     * </pre>
     *
     * Protobuf type {@code POKDNGLGMJC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:POKDNGLGMJC)
        emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.internal_static_POKDNGLGMJC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.internal_static_POKDNGLGMJC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC.class, emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC.newBuilder()
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
        if (hOHCJADGKFDBuilder_ == null) {
          hOHCJADGKFD_ = null;
        } else {
          hOHCJADGKFD_ = null;
          hOHCJADGKFDBuilder_ = null;
        }
        if (jOHKHKDAOGABuilder_ == null) {
          jOHKHKDAOGA_ = null;
        } else {
          jOHKHKDAOGA_ = null;
          jOHKHKDAOGABuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.internal_static_POKDNGLGMJC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC build() {
        emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC buildPartial() {
        emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC result = new emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC(this);
        if (hOHCJADGKFDBuilder_ == null) {
          result.hOHCJADGKFD_ = hOHCJADGKFD_;
        } else {
          result.hOHCJADGKFD_ = hOHCJADGKFDBuilder_.build();
        }
        if (jOHKHKDAOGABuilder_ == null) {
          result.jOHKHKDAOGA_ = jOHKHKDAOGA_;
        } else {
          result.jOHKHKDAOGA_ = jOHKHKDAOGABuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC) {
          return mergeFrom((emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC other) {
        if (other == emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC.getDefaultInstance()) return this;
        if (other.hasHOHCJADGKFD()) {
          mergeHOHCJADGKFD(other.getHOHCJADGKFD());
        }
        if (other.hasJOHKHKDAOGA()) {
          mergeJOHKHKDAOGA(other.getJOHKHKDAOGA());
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
        emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector hOHCJADGKFD_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> hOHCJADGKFDBuilder_;
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       * @return Whether the hOHCJADGKFD field is set.
       */
      public boolean hasHOHCJADGKFD() {
        return hOHCJADGKFDBuilder_ != null || hOHCJADGKFD_ != null;
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       * @return The hOHCJADGKFD.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getHOHCJADGKFD() {
        if (hOHCJADGKFDBuilder_ == null) {
          return hOHCJADGKFD_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hOHCJADGKFD_;
        } else {
          return hOHCJADGKFDBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       */
      public Builder setHOHCJADGKFD(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hOHCJADGKFDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hOHCJADGKFD_ = value;
          onChanged();
        } else {
          hOHCJADGKFDBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       */
      public Builder setHOHCJADGKFD(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hOHCJADGKFDBuilder_ == null) {
          hOHCJADGKFD_ = builderForValue.build();
          onChanged();
        } else {
          hOHCJADGKFDBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       */
      public Builder mergeHOHCJADGKFD(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hOHCJADGKFDBuilder_ == null) {
          if (hOHCJADGKFD_ != null) {
            hOHCJADGKFD_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(hOHCJADGKFD_).mergeFrom(value).buildPartial();
          } else {
            hOHCJADGKFD_ = value;
          }
          onChanged();
        } else {
          hOHCJADGKFDBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       */
      public Builder clearHOHCJADGKFD() {
        if (hOHCJADGKFDBuilder_ == null) {
          hOHCJADGKFD_ = null;
          onChanged();
        } else {
          hOHCJADGKFD_ = null;
          hOHCJADGKFDBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getHOHCJADGKFDBuilder() {
        
        onChanged();
        return getHOHCJADGKFDFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHOHCJADGKFDOrBuilder() {
        if (hOHCJADGKFDBuilder_ != null) {
          return hOHCJADGKFDBuilder_.getMessageOrBuilder();
        } else {
          return hOHCJADGKFD_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hOHCJADGKFD_;
        }
      }
      /**
       * <code>.Vector HOHCJADGKFD = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getHOHCJADGKFDFieldBuilder() {
        if (hOHCJADGKFDBuilder_ == null) {
          hOHCJADGKFDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getHOHCJADGKFD(),
                  getParentForChildren(),
                  isClean());
          hOHCJADGKFD_ = null;
        }
        return hOHCJADGKFDBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector jOHKHKDAOGA_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> jOHKHKDAOGABuilder_;
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       * @return Whether the jOHKHKDAOGA field is set.
       */
      public boolean hasJOHKHKDAOGA() {
        return jOHKHKDAOGABuilder_ != null || jOHKHKDAOGA_ != null;
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       * @return The jOHKHKDAOGA.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getJOHKHKDAOGA() {
        if (jOHKHKDAOGABuilder_ == null) {
          return jOHKHKDAOGA_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : jOHKHKDAOGA_;
        } else {
          return jOHKHKDAOGABuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       */
      public Builder setJOHKHKDAOGA(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (jOHKHKDAOGABuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jOHKHKDAOGA_ = value;
          onChanged();
        } else {
          jOHKHKDAOGABuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       */
      public Builder setJOHKHKDAOGA(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (jOHKHKDAOGABuilder_ == null) {
          jOHKHKDAOGA_ = builderForValue.build();
          onChanged();
        } else {
          jOHKHKDAOGABuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       */
      public Builder mergeJOHKHKDAOGA(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (jOHKHKDAOGABuilder_ == null) {
          if (jOHKHKDAOGA_ != null) {
            jOHKHKDAOGA_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(jOHKHKDAOGA_).mergeFrom(value).buildPartial();
          } else {
            jOHKHKDAOGA_ = value;
          }
          onChanged();
        } else {
          jOHKHKDAOGABuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       */
      public Builder clearJOHKHKDAOGA() {
        if (jOHKHKDAOGABuilder_ == null) {
          jOHKHKDAOGA_ = null;
          onChanged();
        } else {
          jOHKHKDAOGA_ = null;
          jOHKHKDAOGABuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getJOHKHKDAOGABuilder() {
        
        onChanged();
        return getJOHKHKDAOGAFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getJOHKHKDAOGAOrBuilder() {
        if (jOHKHKDAOGABuilder_ != null) {
          return jOHKHKDAOGABuilder_.getMessageOrBuilder();
        } else {
          return jOHKHKDAOGA_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : jOHKHKDAOGA_;
        }
      }
      /**
       * <code>.Vector JOHKHKDAOGA = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getJOHKHKDAOGAFieldBuilder() {
        if (jOHKHKDAOGABuilder_ == null) {
          jOHKHKDAOGABuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getJOHKHKDAOGA(),
                  getParentForChildren(),
                  isClean());
          jOHKHKDAOGA_ = null;
        }
        return jOHKHKDAOGABuilder_;
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


      // @@protoc_insertion_point(builder_scope:POKDNGLGMJC)
    }

    // @@protoc_insertion_point(class_scope:POKDNGLGMJC)
    private static final emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC();
    }

    public static emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<POKDNGLGMJC>
        PARSER = new com.google.protobuf.AbstractParser<POKDNGLGMJC>() {
      @java.lang.Override
      public POKDNGLGMJC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new POKDNGLGMJC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<POKDNGLGMJC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<POKDNGLGMJC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.POKDNGLGMJCOuterClass.POKDNGLGMJC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POKDNGLGMJC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POKDNGLGMJC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021POKDNGLGMJC.proto\032\014Vector.proto\"I\n\013POK" +
      "DNGLGMJC\022\034\n\013HOHCJADGKFD\030\017 \001(\0132\007.Vector\022\034" +
      "\n\013JOHKHKDAOGA\030\007 \001(\0132\007.VectorB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_POKDNGLGMJC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POKDNGLGMJC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POKDNGLGMJC_descriptor,
        new java.lang.String[] { "HOHCJADGKFD", "JOHKHKDAOGA", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
