// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BHHECJHBCKK.proto

package emu.grasscutter.net.proto;

public final class BHHECJHBCKKOuterClass {
  private BHHECJHBCKKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BHHECJHBCKKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BHHECJHBCKK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
     * @return Whether the jBBBNFLJCIH field is set.
     */
    boolean hasJBBBNFLJCIH();
    /**
     * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
     * @return The jBBBNFLJCIH.
     */
    emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ getJBBBNFLJCIH();
    /**
     * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
     */
    emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJOrBuilder getJBBBNFLJCIHOrBuilder();
  }
  /**
   * <pre>
   * Name: BHHECJHBCKK
   * CmdId: 7226
   * </pre>
   *
   * Protobuf type {@code BHHECJHBCKK}
   */
  public static final class BHHECJHBCKK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BHHECJHBCKK)
      BHHECJHBCKKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BHHECJHBCKK.newBuilder() to construct.
    private BHHECJHBCKK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BHHECJHBCKK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BHHECJHBCKK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BHHECJHBCKK(
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
            case 34: {
              emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.Builder subBuilder = null;
              if (jBBBNFLJCIH_ != null) {
                subBuilder = jBBBNFLJCIH_.toBuilder();
              }
              jBBBNFLJCIH_ = input.readMessage(emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jBBBNFLJCIH_);
                jBBBNFLJCIH_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.internal_static_BHHECJHBCKK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.internal_static_BHHECJHBCKK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK.class, emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK.Builder.class);
    }

    public static final int JBBBNFLJCIH_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ jBBBNFLJCIH_;
    /**
     * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
     * @return Whether the jBBBNFLJCIH field is set.
     */
    @java.lang.Override
    public boolean hasJBBBNFLJCIH() {
      return jBBBNFLJCIH_ != null;
    }
    /**
     * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
     * @return The jBBBNFLJCIH.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ getJBBBNFLJCIH() {
      return jBBBNFLJCIH_ == null ? emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.getDefaultInstance() : jBBBNFLJCIH_;
    }
    /**
     * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJOrBuilder getJBBBNFLJCIHOrBuilder() {
      return getJBBBNFLJCIH();
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
      if (jBBBNFLJCIH_ != null) {
        output.writeMessage(4, getJBBBNFLJCIH());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jBBBNFLJCIH_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getJBBBNFLJCIH());
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
      if (!(obj instanceof emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK other = (emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK) obj;

      if (hasJBBBNFLJCIH() != other.hasJBBBNFLJCIH()) return false;
      if (hasJBBBNFLJCIH()) {
        if (!getJBBBNFLJCIH()
            .equals(other.getJBBBNFLJCIH())) return false;
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
      if (hasJBBBNFLJCIH()) {
        hash = (37 * hash) + JBBBNFLJCIH_FIELD_NUMBER;
        hash = (53 * hash) + getJBBBNFLJCIH().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK prototype) {
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
     * Name: BHHECJHBCKK
     * CmdId: 7226
     * </pre>
     *
     * Protobuf type {@code BHHECJHBCKK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BHHECJHBCKK)
        emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.internal_static_BHHECJHBCKK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.internal_static_BHHECJHBCKK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK.class, emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK.newBuilder()
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
        if (jBBBNFLJCIHBuilder_ == null) {
          jBBBNFLJCIH_ = null;
        } else {
          jBBBNFLJCIH_ = null;
          jBBBNFLJCIHBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.internal_static_BHHECJHBCKK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK build() {
        emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK buildPartial() {
        emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK result = new emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK(this);
        if (jBBBNFLJCIHBuilder_ == null) {
          result.jBBBNFLJCIH_ = jBBBNFLJCIH_;
        } else {
          result.jBBBNFLJCIH_ = jBBBNFLJCIHBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK) {
          return mergeFrom((emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK other) {
        if (other == emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK.getDefaultInstance()) return this;
        if (other.hasJBBBNFLJCIH()) {
          mergeJBBBNFLJCIH(other.getJBBBNFLJCIH());
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
        emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ jBBBNFLJCIH_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ, emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.Builder, emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJOrBuilder> jBBBNFLJCIHBuilder_;
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       * @return Whether the jBBBNFLJCIH field is set.
       */
      public boolean hasJBBBNFLJCIH() {
        return jBBBNFLJCIHBuilder_ != null || jBBBNFLJCIH_ != null;
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       * @return The jBBBNFLJCIH.
       */
      public emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ getJBBBNFLJCIH() {
        if (jBBBNFLJCIHBuilder_ == null) {
          return jBBBNFLJCIH_ == null ? emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.getDefaultInstance() : jBBBNFLJCIH_;
        } else {
          return jBBBNFLJCIHBuilder_.getMessage();
        }
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       */
      public Builder setJBBBNFLJCIH(emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ value) {
        if (jBBBNFLJCIHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jBBBNFLJCIH_ = value;
          onChanged();
        } else {
          jBBBNFLJCIHBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       */
      public Builder setJBBBNFLJCIH(
          emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.Builder builderForValue) {
        if (jBBBNFLJCIHBuilder_ == null) {
          jBBBNFLJCIH_ = builderForValue.build();
          onChanged();
        } else {
          jBBBNFLJCIHBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       */
      public Builder mergeJBBBNFLJCIH(emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ value) {
        if (jBBBNFLJCIHBuilder_ == null) {
          if (jBBBNFLJCIH_ != null) {
            jBBBNFLJCIH_ =
              emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.newBuilder(jBBBNFLJCIH_).mergeFrom(value).buildPartial();
          } else {
            jBBBNFLJCIH_ = value;
          }
          onChanged();
        } else {
          jBBBNFLJCIHBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       */
      public Builder clearJBBBNFLJCIH() {
        if (jBBBNFLJCIHBuilder_ == null) {
          jBBBNFLJCIH_ = null;
          onChanged();
        } else {
          jBBBNFLJCIH_ = null;
          jBBBNFLJCIHBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       */
      public emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.Builder getJBBBNFLJCIHBuilder() {
        
        onChanged();
        return getJBBBNFLJCIHFieldBuilder().getBuilder();
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       */
      public emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJOrBuilder getJBBBNFLJCIHOrBuilder() {
        if (jBBBNFLJCIHBuilder_ != null) {
          return jBBBNFLJCIHBuilder_.getMessageOrBuilder();
        } else {
          return jBBBNFLJCIH_ == null ?
              emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.getDefaultInstance() : jBBBNFLJCIH_;
        }
      }
      /**
       * <code>.CGJDJJLIADJ JBBBNFLJCIH = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ, emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.Builder, emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJOrBuilder> 
          getJBBBNFLJCIHFieldBuilder() {
        if (jBBBNFLJCIHBuilder_ == null) {
          jBBBNFLJCIHBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ, emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJ.Builder, emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.CGJDJJLIADJOrBuilder>(
                  getJBBBNFLJCIH(),
                  getParentForChildren(),
                  isClean());
          jBBBNFLJCIH_ = null;
        }
        return jBBBNFLJCIHBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BHHECJHBCKK)
    }

    // @@protoc_insertion_point(class_scope:BHHECJHBCKK)
    private static final emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK();
    }

    public static emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BHHECJHBCKK>
        PARSER = new com.google.protobuf.AbstractParser<BHHECJHBCKK>() {
      @java.lang.Override
      public BHHECJHBCKK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BHHECJHBCKK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BHHECJHBCKK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BHHECJHBCKK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BHHECJHBCKKOuterClass.BHHECJHBCKK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BHHECJHBCKK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BHHECJHBCKK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BHHECJHBCKK.proto\032\021CGJDJJLIADJ.proto\"0" +
      "\n\013BHHECJHBCKK\022!\n\013JBBBNFLJCIH\030\004 \001(\0132\014.CGJ" +
      "DJJLIADJB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.getDescriptor(),
        });
    internal_static_BHHECJHBCKK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BHHECJHBCKK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BHHECJHBCKK_descriptor,
        new java.lang.String[] { "JBBBNFLJCIH", });
    emu.grasscutter.net.proto.CGJDJJLIADJOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
