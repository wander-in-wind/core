// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NJIKLIJCLDA.proto

package emu.grasscutter.net.proto;

public final class NJIKLIJCLDAOuterClass {
  private NJIKLIJCLDAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NJIKLIJCLDAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NJIKLIJCLDA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
     * @return Whether the hPHEBMLGPIH field is set.
     */
    boolean hasHPHEBMLGPIH();
    /**
     * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
     * @return The hPHEBMLGPIH.
     */
    emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB getHPHEBMLGPIH();
    /**
     * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
     */
    emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLBOrBuilder getHPHEBMLGPIHOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 6089
   * Name: NJIKLIJCLDA
   * </pre>
   *
   * Protobuf type {@code NJIKLIJCLDA}
   */
  public static final class NJIKLIJCLDA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NJIKLIJCLDA)
      NJIKLIJCLDAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NJIKLIJCLDA.newBuilder() to construct.
    private NJIKLIJCLDA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NJIKLIJCLDA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NJIKLIJCLDA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NJIKLIJCLDA(
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
            case 90: {
              emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.Builder subBuilder = null;
              if (hPHEBMLGPIH_ != null) {
                subBuilder = hPHEBMLGPIH_.toBuilder();
              }
              hPHEBMLGPIH_ = input.readMessage(emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(hPHEBMLGPIH_);
                hPHEBMLGPIH_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.internal_static_NJIKLIJCLDA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.internal_static_NJIKLIJCLDA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA.class, emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA.Builder.class);
    }

    public static final int HPHEBMLGPIH_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB hPHEBMLGPIH_;
    /**
     * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
     * @return Whether the hPHEBMLGPIH field is set.
     */
    @java.lang.Override
    public boolean hasHPHEBMLGPIH() {
      return hPHEBMLGPIH_ != null;
    }
    /**
     * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
     * @return The hPHEBMLGPIH.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB getHPHEBMLGPIH() {
      return hPHEBMLGPIH_ == null ? emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.getDefaultInstance() : hPHEBMLGPIH_;
    }
    /**
     * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLBOrBuilder getHPHEBMLGPIHOrBuilder() {
      return getHPHEBMLGPIH();
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
      if (hPHEBMLGPIH_ != null) {
        output.writeMessage(11, getHPHEBMLGPIH());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hPHEBMLGPIH_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getHPHEBMLGPIH());
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
      if (!(obj instanceof emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA other = (emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA) obj;

      if (hasHPHEBMLGPIH() != other.hasHPHEBMLGPIH()) return false;
      if (hasHPHEBMLGPIH()) {
        if (!getHPHEBMLGPIH()
            .equals(other.getHPHEBMLGPIH())) return false;
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
      if (hasHPHEBMLGPIH()) {
        hash = (37 * hash) + HPHEBMLGPIH_FIELD_NUMBER;
        hash = (53 * hash) + getHPHEBMLGPIH().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA prototype) {
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
     * CmdId: 6089
     * Name: NJIKLIJCLDA
     * </pre>
     *
     * Protobuf type {@code NJIKLIJCLDA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NJIKLIJCLDA)
        emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.internal_static_NJIKLIJCLDA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.internal_static_NJIKLIJCLDA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA.class, emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA.newBuilder()
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
        if (hPHEBMLGPIHBuilder_ == null) {
          hPHEBMLGPIH_ = null;
        } else {
          hPHEBMLGPIH_ = null;
          hPHEBMLGPIHBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.internal_static_NJIKLIJCLDA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA build() {
        emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA buildPartial() {
        emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA result = new emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA(this);
        if (hPHEBMLGPIHBuilder_ == null) {
          result.hPHEBMLGPIH_ = hPHEBMLGPIH_;
        } else {
          result.hPHEBMLGPIH_ = hPHEBMLGPIHBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA) {
          return mergeFrom((emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA other) {
        if (other == emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA.getDefaultInstance()) return this;
        if (other.hasHPHEBMLGPIH()) {
          mergeHPHEBMLGPIH(other.getHPHEBMLGPIH());
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
        emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB hPHEBMLGPIH_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB, emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.Builder, emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLBOrBuilder> hPHEBMLGPIHBuilder_;
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       * @return Whether the hPHEBMLGPIH field is set.
       */
      public boolean hasHPHEBMLGPIH() {
        return hPHEBMLGPIHBuilder_ != null || hPHEBMLGPIH_ != null;
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       * @return The hPHEBMLGPIH.
       */
      public emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB getHPHEBMLGPIH() {
        if (hPHEBMLGPIHBuilder_ == null) {
          return hPHEBMLGPIH_ == null ? emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.getDefaultInstance() : hPHEBMLGPIH_;
        } else {
          return hPHEBMLGPIHBuilder_.getMessage();
        }
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       */
      public Builder setHPHEBMLGPIH(emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB value) {
        if (hPHEBMLGPIHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hPHEBMLGPIH_ = value;
          onChanged();
        } else {
          hPHEBMLGPIHBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       */
      public Builder setHPHEBMLGPIH(
          emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.Builder builderForValue) {
        if (hPHEBMLGPIHBuilder_ == null) {
          hPHEBMLGPIH_ = builderForValue.build();
          onChanged();
        } else {
          hPHEBMLGPIHBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       */
      public Builder mergeHPHEBMLGPIH(emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB value) {
        if (hPHEBMLGPIHBuilder_ == null) {
          if (hPHEBMLGPIH_ != null) {
            hPHEBMLGPIH_ =
              emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.newBuilder(hPHEBMLGPIH_).mergeFrom(value).buildPartial();
          } else {
            hPHEBMLGPIH_ = value;
          }
          onChanged();
        } else {
          hPHEBMLGPIHBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       */
      public Builder clearHPHEBMLGPIH() {
        if (hPHEBMLGPIHBuilder_ == null) {
          hPHEBMLGPIH_ = null;
          onChanged();
        } else {
          hPHEBMLGPIH_ = null;
          hPHEBMLGPIHBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       */
      public emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.Builder getHPHEBMLGPIHBuilder() {
        
        onChanged();
        return getHPHEBMLGPIHFieldBuilder().getBuilder();
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       */
      public emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLBOrBuilder getHPHEBMLGPIHOrBuilder() {
        if (hPHEBMLGPIHBuilder_ != null) {
          return hPHEBMLGPIHBuilder_.getMessageOrBuilder();
        } else {
          return hPHEBMLGPIH_ == null ?
              emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.getDefaultInstance() : hPHEBMLGPIH_;
        }
      }
      /**
       * <code>.HOKJIFJPJLB HPHEBMLGPIH = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB, emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.Builder, emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLBOrBuilder> 
          getHPHEBMLGPIHFieldBuilder() {
        if (hPHEBMLGPIHBuilder_ == null) {
          hPHEBMLGPIHBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB, emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLB.Builder, emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.HOKJIFJPJLBOrBuilder>(
                  getHPHEBMLGPIH(),
                  getParentForChildren(),
                  isClean());
          hPHEBMLGPIH_ = null;
        }
        return hPHEBMLGPIHBuilder_;
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


      // @@protoc_insertion_point(builder_scope:NJIKLIJCLDA)
    }

    // @@protoc_insertion_point(class_scope:NJIKLIJCLDA)
    private static final emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA();
    }

    public static emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NJIKLIJCLDA>
        PARSER = new com.google.protobuf.AbstractParser<NJIKLIJCLDA>() {
      @java.lang.Override
      public NJIKLIJCLDA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NJIKLIJCLDA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NJIKLIJCLDA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NJIKLIJCLDA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NJIKLIJCLDAOuterClass.NJIKLIJCLDA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NJIKLIJCLDA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NJIKLIJCLDA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NJIKLIJCLDA.proto\032\021HOKJIFJPJLB.proto\"0" +
      "\n\013NJIKLIJCLDA\022!\n\013HPHEBMLGPIH\030\013 \001(\0132\014.HOK" +
      "JIFJPJLBB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.getDescriptor(),
        });
    internal_static_NJIKLIJCLDA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NJIKLIJCLDA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NJIKLIJCLDA_descriptor,
        new java.lang.String[] { "HPHEBMLGPIH", });
    emu.grasscutter.net.proto.HOKJIFJPJLBOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
