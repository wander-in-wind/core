// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FOLNGHHMFKC.proto

package emu.grasscutter.net.proto;

public final class FOLNGHHMFKCOuterClass {
  private FOLNGHHMFKCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FOLNGHHMFKCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FOLNGHHMFKC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
     * @return Whether the bHBNFMDDKOF field is set.
     */
    boolean hasBHBNFMDDKOF();
    /**
     * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
     * @return The bHBNFMDDKOF.
     */
    emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA getBHBNFMDDKOF();
    /**
     * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
     */
    emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFAOrBuilder getBHBNFMDDKOFOrBuilder();
  }
  /**
   * <pre>
   * Name: FOLNGHHMFKC
   * CmdId: 7577
   * </pre>
   *
   * Protobuf type {@code FOLNGHHMFKC}
   */
  public static final class FOLNGHHMFKC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FOLNGHHMFKC)
      FOLNGHHMFKCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FOLNGHHMFKC.newBuilder() to construct.
    private FOLNGHHMFKC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FOLNGHHMFKC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FOLNGHHMFKC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FOLNGHHMFKC(
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
            case 74: {
              emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.Builder subBuilder = null;
              if (bHBNFMDDKOF_ != null) {
                subBuilder = bHBNFMDDKOF_.toBuilder();
              }
              bHBNFMDDKOF_ = input.readMessage(emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bHBNFMDDKOF_);
                bHBNFMDDKOF_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.internal_static_FOLNGHHMFKC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.internal_static_FOLNGHHMFKC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC.class, emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC.Builder.class);
    }

    public static final int BHBNFMDDKOF_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA bHBNFMDDKOF_;
    /**
     * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
     * @return Whether the bHBNFMDDKOF field is set.
     */
    @java.lang.Override
    public boolean hasBHBNFMDDKOF() {
      return bHBNFMDDKOF_ != null;
    }
    /**
     * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
     * @return The bHBNFMDDKOF.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA getBHBNFMDDKOF() {
      return bHBNFMDDKOF_ == null ? emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.getDefaultInstance() : bHBNFMDDKOF_;
    }
    /**
     * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFAOrBuilder getBHBNFMDDKOFOrBuilder() {
      return getBHBNFMDDKOF();
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
      if (bHBNFMDDKOF_ != null) {
        output.writeMessage(9, getBHBNFMDDKOF());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bHBNFMDDKOF_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getBHBNFMDDKOF());
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
      if (!(obj instanceof emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC other = (emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC) obj;

      if (hasBHBNFMDDKOF() != other.hasBHBNFMDDKOF()) return false;
      if (hasBHBNFMDDKOF()) {
        if (!getBHBNFMDDKOF()
            .equals(other.getBHBNFMDDKOF())) return false;
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
      if (hasBHBNFMDDKOF()) {
        hash = (37 * hash) + BHBNFMDDKOF_FIELD_NUMBER;
        hash = (53 * hash) + getBHBNFMDDKOF().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC prototype) {
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
     * Name: FOLNGHHMFKC
     * CmdId: 7577
     * </pre>
     *
     * Protobuf type {@code FOLNGHHMFKC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FOLNGHHMFKC)
        emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.internal_static_FOLNGHHMFKC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.internal_static_FOLNGHHMFKC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC.class, emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC.newBuilder()
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
        if (bHBNFMDDKOFBuilder_ == null) {
          bHBNFMDDKOF_ = null;
        } else {
          bHBNFMDDKOF_ = null;
          bHBNFMDDKOFBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.internal_static_FOLNGHHMFKC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC build() {
        emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC buildPartial() {
        emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC result = new emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC(this);
        if (bHBNFMDDKOFBuilder_ == null) {
          result.bHBNFMDDKOF_ = bHBNFMDDKOF_;
        } else {
          result.bHBNFMDDKOF_ = bHBNFMDDKOFBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC) {
          return mergeFrom((emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC other) {
        if (other == emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC.getDefaultInstance()) return this;
        if (other.hasBHBNFMDDKOF()) {
          mergeBHBNFMDDKOF(other.getBHBNFMDDKOF());
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
        emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA bHBNFMDDKOF_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA, emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.Builder, emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFAOrBuilder> bHBNFMDDKOFBuilder_;
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       * @return Whether the bHBNFMDDKOF field is set.
       */
      public boolean hasBHBNFMDDKOF() {
        return bHBNFMDDKOFBuilder_ != null || bHBNFMDDKOF_ != null;
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       * @return The bHBNFMDDKOF.
       */
      public emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA getBHBNFMDDKOF() {
        if (bHBNFMDDKOFBuilder_ == null) {
          return bHBNFMDDKOF_ == null ? emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.getDefaultInstance() : bHBNFMDDKOF_;
        } else {
          return bHBNFMDDKOFBuilder_.getMessage();
        }
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       */
      public Builder setBHBNFMDDKOF(emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA value) {
        if (bHBNFMDDKOFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bHBNFMDDKOF_ = value;
          onChanged();
        } else {
          bHBNFMDDKOFBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       */
      public Builder setBHBNFMDDKOF(
          emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.Builder builderForValue) {
        if (bHBNFMDDKOFBuilder_ == null) {
          bHBNFMDDKOF_ = builderForValue.build();
          onChanged();
        } else {
          bHBNFMDDKOFBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       */
      public Builder mergeBHBNFMDDKOF(emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA value) {
        if (bHBNFMDDKOFBuilder_ == null) {
          if (bHBNFMDDKOF_ != null) {
            bHBNFMDDKOF_ =
              emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.newBuilder(bHBNFMDDKOF_).mergeFrom(value).buildPartial();
          } else {
            bHBNFMDDKOF_ = value;
          }
          onChanged();
        } else {
          bHBNFMDDKOFBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       */
      public Builder clearBHBNFMDDKOF() {
        if (bHBNFMDDKOFBuilder_ == null) {
          bHBNFMDDKOF_ = null;
          onChanged();
        } else {
          bHBNFMDDKOF_ = null;
          bHBNFMDDKOFBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       */
      public emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.Builder getBHBNFMDDKOFBuilder() {
        
        onChanged();
        return getBHBNFMDDKOFFieldBuilder().getBuilder();
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       */
      public emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFAOrBuilder getBHBNFMDDKOFOrBuilder() {
        if (bHBNFMDDKOFBuilder_ != null) {
          return bHBNFMDDKOFBuilder_.getMessageOrBuilder();
        } else {
          return bHBNFMDDKOF_ == null ?
              emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.getDefaultInstance() : bHBNFMDDKOF_;
        }
      }
      /**
       * <code>.OJNKFDIOAFA BHBNFMDDKOF = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA, emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.Builder, emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFAOrBuilder> 
          getBHBNFMDDKOFFieldBuilder() {
        if (bHBNFMDDKOFBuilder_ == null) {
          bHBNFMDDKOFBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA, emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFA.Builder, emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.OJNKFDIOAFAOrBuilder>(
                  getBHBNFMDDKOF(),
                  getParentForChildren(),
                  isClean());
          bHBNFMDDKOF_ = null;
        }
        return bHBNFMDDKOFBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FOLNGHHMFKC)
    }

    // @@protoc_insertion_point(class_scope:FOLNGHHMFKC)
    private static final emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC();
    }

    public static emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FOLNGHHMFKC>
        PARSER = new com.google.protobuf.AbstractParser<FOLNGHHMFKC>() {
      @java.lang.Override
      public FOLNGHHMFKC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FOLNGHHMFKC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FOLNGHHMFKC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FOLNGHHMFKC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FOLNGHHMFKCOuterClass.FOLNGHHMFKC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FOLNGHHMFKC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FOLNGHHMFKC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FOLNGHHMFKC.proto\032\021OJNKFDIOAFA.proto\"0" +
      "\n\013FOLNGHHMFKC\022!\n\013BHBNFMDDKOF\030\t \001(\0132\014.OJN" +
      "KFDIOAFAB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.getDescriptor(),
        });
    internal_static_FOLNGHHMFKC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FOLNGHHMFKC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FOLNGHHMFKC_descriptor,
        new java.lang.String[] { "BHBNFMDDKOF", });
    emu.grasscutter.net.proto.OJNKFDIOAFAOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
