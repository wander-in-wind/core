// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CFAGNNLICOC.proto

package emu.grasscutter.net.proto;

public final class CFAGNNLICOCOuterClass {
  private CFAGNNLICOCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CFAGNNLICOCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CFAGNNLICOC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH> 
        getIDJDIDMDCACList();
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH getIDJDIDMDCAC(int index);
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    int getIDJDIDMDCACCount();
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder> 
        getIDJDIDMDCACOrBuilderList();
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder getIDJDIDMDCACOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: CFAGNNLICOC
   * </pre>
   *
   * Protobuf type {@code CFAGNNLICOC}
   */
  public static final class CFAGNNLICOC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CFAGNNLICOC)
      CFAGNNLICOCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CFAGNNLICOC.newBuilder() to construct.
    private CFAGNNLICOC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CFAGNNLICOC() {
      iDJDIDMDCAC_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CFAGNNLICOC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CFAGNNLICOC(
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
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                iDJDIDMDCAC_ = new java.util.ArrayList<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH>();
                mutable_bitField0_ |= 0x00000001;
              }
              iDJDIDMDCAC_.add(
                  input.readMessage(emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.parser(), extensionRegistry));
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
          iDJDIDMDCAC_ = java.util.Collections.unmodifiableList(iDJDIDMDCAC_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.internal_static_CFAGNNLICOC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.internal_static_CFAGNNLICOC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC.class, emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC.Builder.class);
    }

    public static final int IDJDIDMDCAC_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH> iDJDIDMDCAC_;
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH> getIDJDIDMDCACList() {
      return iDJDIDMDCAC_;
    }
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder> 
        getIDJDIDMDCACOrBuilderList() {
      return iDJDIDMDCAC_;
    }
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    @java.lang.Override
    public int getIDJDIDMDCACCount() {
      return iDJDIDMDCAC_.size();
    }
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH getIDJDIDMDCAC(int index) {
      return iDJDIDMDCAC_.get(index);
    }
    /**
     * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder getIDJDIDMDCACOrBuilder(
        int index) {
      return iDJDIDMDCAC_.get(index);
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
      for (int i = 0; i < iDJDIDMDCAC_.size(); i++) {
        output.writeMessage(9, iDJDIDMDCAC_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < iDJDIDMDCAC_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, iDJDIDMDCAC_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC other = (emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC) obj;

      if (!getIDJDIDMDCACList()
          .equals(other.getIDJDIDMDCACList())) return false;
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
      if (getIDJDIDMDCACCount() > 0) {
        hash = (37 * hash) + IDJDIDMDCAC_FIELD_NUMBER;
        hash = (53 * hash) + getIDJDIDMDCACList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC prototype) {
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
     * Name: CFAGNNLICOC
     * </pre>
     *
     * Protobuf type {@code CFAGNNLICOC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CFAGNNLICOC)
        emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.internal_static_CFAGNNLICOC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.internal_static_CFAGNNLICOC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC.class, emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC.newBuilder()
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
          getIDJDIDMDCACFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (iDJDIDMDCACBuilder_ == null) {
          iDJDIDMDCAC_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          iDJDIDMDCACBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.internal_static_CFAGNNLICOC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC build() {
        emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC buildPartial() {
        emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC result = new emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC(this);
        int from_bitField0_ = bitField0_;
        if (iDJDIDMDCACBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            iDJDIDMDCAC_ = java.util.Collections.unmodifiableList(iDJDIDMDCAC_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.iDJDIDMDCAC_ = iDJDIDMDCAC_;
        } else {
          result.iDJDIDMDCAC_ = iDJDIDMDCACBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC) {
          return mergeFrom((emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC other) {
        if (other == emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC.getDefaultInstance()) return this;
        if (iDJDIDMDCACBuilder_ == null) {
          if (!other.iDJDIDMDCAC_.isEmpty()) {
            if (iDJDIDMDCAC_.isEmpty()) {
              iDJDIDMDCAC_ = other.iDJDIDMDCAC_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureIDJDIDMDCACIsMutable();
              iDJDIDMDCAC_.addAll(other.iDJDIDMDCAC_);
            }
            onChanged();
          }
        } else {
          if (!other.iDJDIDMDCAC_.isEmpty()) {
            if (iDJDIDMDCACBuilder_.isEmpty()) {
              iDJDIDMDCACBuilder_.dispose();
              iDJDIDMDCACBuilder_ = null;
              iDJDIDMDCAC_ = other.iDJDIDMDCAC_;
              bitField0_ = (bitField0_ & ~0x00000001);
              iDJDIDMDCACBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getIDJDIDMDCACFieldBuilder() : null;
            } else {
              iDJDIDMDCACBuilder_.addAllMessages(other.iDJDIDMDCAC_);
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
        emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH> iDJDIDMDCAC_ =
        java.util.Collections.emptyList();
      private void ensureIDJDIDMDCACIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          iDJDIDMDCAC_ = new java.util.ArrayList<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH>(iDJDIDMDCAC_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder> iDJDIDMDCACBuilder_;

      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH> getIDJDIDMDCACList() {
        if (iDJDIDMDCACBuilder_ == null) {
          return java.util.Collections.unmodifiableList(iDJDIDMDCAC_);
        } else {
          return iDJDIDMDCACBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public int getIDJDIDMDCACCount() {
        if (iDJDIDMDCACBuilder_ == null) {
          return iDJDIDMDCAC_.size();
        } else {
          return iDJDIDMDCACBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH getIDJDIDMDCAC(int index) {
        if (iDJDIDMDCACBuilder_ == null) {
          return iDJDIDMDCAC_.get(index);
        } else {
          return iDJDIDMDCACBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder setIDJDIDMDCAC(
          int index, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH value) {
        if (iDJDIDMDCACBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIDJDIDMDCACIsMutable();
          iDJDIDMDCAC_.set(index, value);
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder setIDJDIDMDCAC(
          int index, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder builderForValue) {
        if (iDJDIDMDCACBuilder_ == null) {
          ensureIDJDIDMDCACIsMutable();
          iDJDIDMDCAC_.set(index, builderForValue.build());
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder addIDJDIDMDCAC(emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH value) {
        if (iDJDIDMDCACBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIDJDIDMDCACIsMutable();
          iDJDIDMDCAC_.add(value);
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder addIDJDIDMDCAC(
          int index, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH value) {
        if (iDJDIDMDCACBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIDJDIDMDCACIsMutable();
          iDJDIDMDCAC_.add(index, value);
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder addIDJDIDMDCAC(
          emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder builderForValue) {
        if (iDJDIDMDCACBuilder_ == null) {
          ensureIDJDIDMDCACIsMutable();
          iDJDIDMDCAC_.add(builderForValue.build());
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder addIDJDIDMDCAC(
          int index, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder builderForValue) {
        if (iDJDIDMDCACBuilder_ == null) {
          ensureIDJDIDMDCACIsMutable();
          iDJDIDMDCAC_.add(index, builderForValue.build());
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder addAllIDJDIDMDCAC(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH> values) {
        if (iDJDIDMDCACBuilder_ == null) {
          ensureIDJDIDMDCACIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, iDJDIDMDCAC_);
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder clearIDJDIDMDCAC() {
        if (iDJDIDMDCACBuilder_ == null) {
          iDJDIDMDCAC_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public Builder removeIDJDIDMDCAC(int index) {
        if (iDJDIDMDCACBuilder_ == null) {
          ensureIDJDIDMDCACIsMutable();
          iDJDIDMDCAC_.remove(index);
          onChanged();
        } else {
          iDJDIDMDCACBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder getIDJDIDMDCACBuilder(
          int index) {
        return getIDJDIDMDCACFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder getIDJDIDMDCACOrBuilder(
          int index) {
        if (iDJDIDMDCACBuilder_ == null) {
          return iDJDIDMDCAC_.get(index);  } else {
          return iDJDIDMDCACBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder> 
           getIDJDIDMDCACOrBuilderList() {
        if (iDJDIDMDCACBuilder_ != null) {
          return iDJDIDMDCACBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(iDJDIDMDCAC_);
        }
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder addIDJDIDMDCACBuilder() {
        return getIDJDIDMDCACFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.getDefaultInstance());
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder addIDJDIDMDCACBuilder(
          int index) {
        return getIDJDIDMDCACFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.getDefaultInstance());
      }
      /**
       * <code>repeated .JFGOFCIOKNH IDJDIDMDCAC = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder> 
           getIDJDIDMDCACBuilderList() {
        return getIDJDIDMDCACFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder> 
          getIDJDIDMDCACFieldBuilder() {
        if (iDJDIDMDCACBuilder_ == null) {
          iDJDIDMDCACBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNH.Builder, emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.JFGOFCIOKNHOrBuilder>(
                  iDJDIDMDCAC_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          iDJDIDMDCAC_ = null;
        }
        return iDJDIDMDCACBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CFAGNNLICOC)
    }

    // @@protoc_insertion_point(class_scope:CFAGNNLICOC)
    private static final emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC();
    }

    public static emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CFAGNNLICOC>
        PARSER = new com.google.protobuf.AbstractParser<CFAGNNLICOC>() {
      @java.lang.Override
      public CFAGNNLICOC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CFAGNNLICOC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CFAGNNLICOC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CFAGNNLICOC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CFAGNNLICOCOuterClass.CFAGNNLICOC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CFAGNNLICOC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CFAGNNLICOC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CFAGNNLICOC.proto\032\021JFGOFCIOKNH.proto\"0" +
      "\n\013CFAGNNLICOC\022!\n\013IDJDIDMDCAC\030\t \003(\0132\014.JFG" +
      "OFCIOKNHB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.getDescriptor(),
        });
    internal_static_CFAGNNLICOC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CFAGNNLICOC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CFAGNNLICOC_descriptor,
        new java.lang.String[] { "IDJDIDMDCAC", });
    emu.grasscutter.net.proto.JFGOFCIOKNHOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}