// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LLOOADCMMPP.proto

package emu.grasscutter.net.proto;

public final class LLOOADCMMPPOuterClass {
  private LLOOADCMMPPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LLOOADCMMPPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LLOOADCMMPP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ> 
        getAIGMBCCNEEOList();
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ getAIGMBCCNEEO(int index);
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    int getAIGMBCCNEEOCount();
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder> 
        getAIGMBCCNEEOOrBuilderList();
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder getAIGMBCCNEEOOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code LLOOADCMMPP}
   */
  public static final class LLOOADCMMPP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LLOOADCMMPP)
      LLOOADCMMPPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LLOOADCMMPP.newBuilder() to construct.
    private LLOOADCMMPP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LLOOADCMMPP() {
      aIGMBCCNEEO_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LLOOADCMMPP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LLOOADCMMPP(
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
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aIGMBCCNEEO_ = new java.util.ArrayList<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ>();
                mutable_bitField0_ |= 0x00000001;
              }
              aIGMBCCNEEO_.add(
                  input.readMessage(emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          aIGMBCCNEEO_ = java.util.Collections.unmodifiableList(aIGMBCCNEEO_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.internal_static_LLOOADCMMPP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.internal_static_LLOOADCMMPP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.class, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder.class);
    }

    public static final int AIGMBCCNEEO_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ> aIGMBCCNEEO_;
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ> getAIGMBCCNEEOList() {
      return aIGMBCCNEEO_;
    }
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder> 
        getAIGMBCCNEEOOrBuilderList() {
      return aIGMBCCNEEO_;
    }
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    @java.lang.Override
    public int getAIGMBCCNEEOCount() {
      return aIGMBCCNEEO_.size();
    }
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ getAIGMBCCNEEO(int index) {
      return aIGMBCCNEEO_.get(index);
    }
    /**
     * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder getAIGMBCCNEEOOrBuilder(
        int index) {
      return aIGMBCCNEEO_.get(index);
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
      for (int i = 0; i < aIGMBCCNEEO_.size(); i++) {
        output.writeMessage(14, aIGMBCCNEEO_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < aIGMBCCNEEO_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, aIGMBCCNEEO_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP other = (emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP) obj;

      if (!getAIGMBCCNEEOList()
          .equals(other.getAIGMBCCNEEOList())) return false;
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
      if (getAIGMBCCNEEOCount() > 0) {
        hash = (37 * hash) + AIGMBCCNEEO_FIELD_NUMBER;
        hash = (53 * hash) + getAIGMBCCNEEOList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP prototype) {
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
     * Protobuf type {@code LLOOADCMMPP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LLOOADCMMPP)
        emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.internal_static_LLOOADCMMPP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.internal_static_LLOOADCMMPP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.class, emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.newBuilder()
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
          getAIGMBCCNEEOFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (aIGMBCCNEEOBuilder_ == null) {
          aIGMBCCNEEO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          aIGMBCCNEEOBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.internal_static_LLOOADCMMPP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP build() {
        emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP buildPartial() {
        emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP result = new emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP(this);
        int from_bitField0_ = bitField0_;
        if (aIGMBCCNEEOBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            aIGMBCCNEEO_ = java.util.Collections.unmodifiableList(aIGMBCCNEEO_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.aIGMBCCNEEO_ = aIGMBCCNEEO_;
        } else {
          result.aIGMBCCNEEO_ = aIGMBCCNEEOBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP) {
          return mergeFrom((emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP other) {
        if (other == emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP.getDefaultInstance()) return this;
        if (aIGMBCCNEEOBuilder_ == null) {
          if (!other.aIGMBCCNEEO_.isEmpty()) {
            if (aIGMBCCNEEO_.isEmpty()) {
              aIGMBCCNEEO_ = other.aIGMBCCNEEO_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAIGMBCCNEEOIsMutable();
              aIGMBCCNEEO_.addAll(other.aIGMBCCNEEO_);
            }
            onChanged();
          }
        } else {
          if (!other.aIGMBCCNEEO_.isEmpty()) {
            if (aIGMBCCNEEOBuilder_.isEmpty()) {
              aIGMBCCNEEOBuilder_.dispose();
              aIGMBCCNEEOBuilder_ = null;
              aIGMBCCNEEO_ = other.aIGMBCCNEEO_;
              bitField0_ = (bitField0_ & ~0x00000001);
              aIGMBCCNEEOBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAIGMBCCNEEOFieldBuilder() : null;
            } else {
              aIGMBCCNEEOBuilder_.addAllMessages(other.aIGMBCCNEEO_);
            }
          }
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
        emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ> aIGMBCCNEEO_ =
        java.util.Collections.emptyList();
      private void ensureAIGMBCCNEEOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          aIGMBCCNEEO_ = new java.util.ArrayList<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ>(aIGMBCCNEEO_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder> aIGMBCCNEEOBuilder_;

      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ> getAIGMBCCNEEOList() {
        if (aIGMBCCNEEOBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aIGMBCCNEEO_);
        } else {
          return aIGMBCCNEEOBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public int getAIGMBCCNEEOCount() {
        if (aIGMBCCNEEOBuilder_ == null) {
          return aIGMBCCNEEO_.size();
        } else {
          return aIGMBCCNEEOBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ getAIGMBCCNEEO(int index) {
        if (aIGMBCCNEEOBuilder_ == null) {
          return aIGMBCCNEEO_.get(index);
        } else {
          return aIGMBCCNEEOBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder setAIGMBCCNEEO(
          int index, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ value) {
        if (aIGMBCCNEEOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAIGMBCCNEEOIsMutable();
          aIGMBCCNEEO_.set(index, value);
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder setAIGMBCCNEEO(
          int index, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder builderForValue) {
        if (aIGMBCCNEEOBuilder_ == null) {
          ensureAIGMBCCNEEOIsMutable();
          aIGMBCCNEEO_.set(index, builderForValue.build());
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder addAIGMBCCNEEO(emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ value) {
        if (aIGMBCCNEEOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAIGMBCCNEEOIsMutable();
          aIGMBCCNEEO_.add(value);
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder addAIGMBCCNEEO(
          int index, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ value) {
        if (aIGMBCCNEEOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAIGMBCCNEEOIsMutable();
          aIGMBCCNEEO_.add(index, value);
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder addAIGMBCCNEEO(
          emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder builderForValue) {
        if (aIGMBCCNEEOBuilder_ == null) {
          ensureAIGMBCCNEEOIsMutable();
          aIGMBCCNEEO_.add(builderForValue.build());
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder addAIGMBCCNEEO(
          int index, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder builderForValue) {
        if (aIGMBCCNEEOBuilder_ == null) {
          ensureAIGMBCCNEEOIsMutable();
          aIGMBCCNEEO_.add(index, builderForValue.build());
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder addAllAIGMBCCNEEO(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ> values) {
        if (aIGMBCCNEEOBuilder_ == null) {
          ensureAIGMBCCNEEOIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, aIGMBCCNEEO_);
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder clearAIGMBCCNEEO() {
        if (aIGMBCCNEEOBuilder_ == null) {
          aIGMBCCNEEO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public Builder removeAIGMBCCNEEO(int index) {
        if (aIGMBCCNEEOBuilder_ == null) {
          ensureAIGMBCCNEEOIsMutable();
          aIGMBCCNEEO_.remove(index);
          onChanged();
        } else {
          aIGMBCCNEEOBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder getAIGMBCCNEEOBuilder(
          int index) {
        return getAIGMBCCNEEOFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder getAIGMBCCNEEOOrBuilder(
          int index) {
        if (aIGMBCCNEEOBuilder_ == null) {
          return aIGMBCCNEEO_.get(index);  } else {
          return aIGMBCCNEEOBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder> 
           getAIGMBCCNEEOOrBuilderList() {
        if (aIGMBCCNEEOBuilder_ != null) {
          return aIGMBCCNEEOBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aIGMBCCNEEO_);
        }
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder addAIGMBCCNEEOBuilder() {
        return getAIGMBCCNEEOFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.getDefaultInstance());
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder addAIGMBCCNEEOBuilder(
          int index) {
        return getAIGMBCCNEEOFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.getDefaultInstance());
      }
      /**
       * <code>repeated .ANAEEOOIDJJ AIGMBCCNEEO = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder> 
           getAIGMBCCNEEOBuilderList() {
        return getAIGMBCCNEEOFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder> 
          getAIGMBCCNEEOFieldBuilder() {
        if (aIGMBCCNEEOBuilder_ == null) {
          aIGMBCCNEEOBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJ.Builder, emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.ANAEEOOIDJJOrBuilder>(
                  aIGMBCCNEEO_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          aIGMBCCNEEO_ = null;
        }
        return aIGMBCCNEEOBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LLOOADCMMPP)
    }

    // @@protoc_insertion_point(class_scope:LLOOADCMMPP)
    private static final emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP();
    }

    public static emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LLOOADCMMPP>
        PARSER = new com.google.protobuf.AbstractParser<LLOOADCMMPP>() {
      @java.lang.Override
      public LLOOADCMMPP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LLOOADCMMPP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LLOOADCMMPP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LLOOADCMMPP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LLOOADCMMPPOuterClass.LLOOADCMMPP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LLOOADCMMPP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LLOOADCMMPP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LLOOADCMMPP.proto\032\021ANAEEOOIDJJ.proto\"0" +
      "\n\013LLOOADCMMPP\022!\n\013AIGMBCCNEEO\030\016 \003(\0132\014.ANA" +
      "EEOOIDJJB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.getDescriptor(),
        });
    internal_static_LLOOADCMMPP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LLOOADCMMPP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LLOOADCMMPP_descriptor,
        new java.lang.String[] { "AIGMBCCNEEO", });
    emu.grasscutter.net.proto.ANAEEOOIDJJOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
