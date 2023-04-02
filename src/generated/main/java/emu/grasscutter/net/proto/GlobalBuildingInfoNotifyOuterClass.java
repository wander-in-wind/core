// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GlobalBuildingInfoNotify.proto

package emu.grasscutter.net.proto;

public final class GlobalBuildingInfoNotifyOuterClass {
  private GlobalBuildingInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GlobalBuildingInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GlobalBuildingInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 LJDMMCIKHLC = 12;</code>
     * @return The lJDMMCIKHLC.
     */
    int getLJDMMCIKHLC();

    /**
     * <code>uint32 IHNHBADFLKJ = 4;</code>
     * @return The iHNHBADFLKJ.
     */
    int getIHNHBADFLKJ();

    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo> 
        getBuildingListList();
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo getBuildingList(int index);
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    int getBuildingListCount();
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
        getBuildingListOrBuilderList();
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder getBuildingListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: JHCOBPEEBLO
   * CmdId: 5373
   * </pre>
   *
   * Protobuf type {@code GlobalBuildingInfoNotify}
   */
  public static final class GlobalBuildingInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GlobalBuildingInfoNotify)
      GlobalBuildingInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GlobalBuildingInfoNotify.newBuilder() to construct.
    private GlobalBuildingInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GlobalBuildingInfoNotify() {
      buildingList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GlobalBuildingInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GlobalBuildingInfoNotify(
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
            case 32: {

              iHNHBADFLKJ_ = input.readUInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                buildingList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              buildingList_.add(
                  input.readMessage(emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.parser(), extensionRegistry));
              break;
            }
            case 96: {

              lJDMMCIKHLC_ = input.readUInt32();
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
          buildingList_ = java.util.Collections.unmodifiableList(buildingList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.class, emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.Builder.class);
    }

    public static final int LJDMMCIKHLC_FIELD_NUMBER = 12;
    private int lJDMMCIKHLC_;
    /**
     * <code>uint32 LJDMMCIKHLC = 12;</code>
     * @return The lJDMMCIKHLC.
     */
    @java.lang.Override
    public int getLJDMMCIKHLC() {
      return lJDMMCIKHLC_;
    }

    public static final int IHNHBADFLKJ_FIELD_NUMBER = 4;
    private int iHNHBADFLKJ_;
    /**
     * <code>uint32 IHNHBADFLKJ = 4;</code>
     * @return The iHNHBADFLKJ.
     */
    @java.lang.Override
    public int getIHNHBADFLKJ() {
      return iHNHBADFLKJ_;
    }

    public static final int BUILDING_LIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo> buildingList_;
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo> getBuildingListList() {
      return buildingList_;
    }
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
        getBuildingListOrBuilderList() {
      return buildingList_;
    }
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    @java.lang.Override
    public int getBuildingListCount() {
      return buildingList_.size();
    }
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo getBuildingList(int index) {
      return buildingList_.get(index);
    }
    /**
     * <code>repeated .BuildingInfo building_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder getBuildingListOrBuilder(
        int index) {
      return buildingList_.get(index);
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
      if (iHNHBADFLKJ_ != 0) {
        output.writeUInt32(4, iHNHBADFLKJ_);
      }
      for (int i = 0; i < buildingList_.size(); i++) {
        output.writeMessage(5, buildingList_.get(i));
      }
      if (lJDMMCIKHLC_ != 0) {
        output.writeUInt32(12, lJDMMCIKHLC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iHNHBADFLKJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, iHNHBADFLKJ_);
      }
      for (int i = 0; i < buildingList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, buildingList_.get(i));
      }
      if (lJDMMCIKHLC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, lJDMMCIKHLC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify other = (emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify) obj;

      if (getLJDMMCIKHLC()
          != other.getLJDMMCIKHLC()) return false;
      if (getIHNHBADFLKJ()
          != other.getIHNHBADFLKJ()) return false;
      if (!getBuildingListList()
          .equals(other.getBuildingListList())) return false;
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
      hash = (37 * hash) + LJDMMCIKHLC_FIELD_NUMBER;
      hash = (53 * hash) + getLJDMMCIKHLC();
      hash = (37 * hash) + IHNHBADFLKJ_FIELD_NUMBER;
      hash = (53 * hash) + getIHNHBADFLKJ();
      if (getBuildingListCount() > 0) {
        hash = (37 * hash) + BUILDING_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBuildingListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify prototype) {
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
     * Name: JHCOBPEEBLO
     * CmdId: 5373
     * </pre>
     *
     * Protobuf type {@code GlobalBuildingInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GlobalBuildingInfoNotify)
        emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.class, emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.newBuilder()
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
          getBuildingListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lJDMMCIKHLC_ = 0;

        iHNHBADFLKJ_ = 0;

        if (buildingListBuilder_ == null) {
          buildingList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          buildingListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify build() {
        emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify buildPartial() {
        emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify result = new emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify(this);
        int from_bitField0_ = bitField0_;
        result.lJDMMCIKHLC_ = lJDMMCIKHLC_;
        result.iHNHBADFLKJ_ = iHNHBADFLKJ_;
        if (buildingListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            buildingList_ = java.util.Collections.unmodifiableList(buildingList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.buildingList_ = buildingList_;
        } else {
          result.buildingList_ = buildingListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify other) {
        if (other == emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.getDefaultInstance()) return this;
        if (other.getLJDMMCIKHLC() != 0) {
          setLJDMMCIKHLC(other.getLJDMMCIKHLC());
        }
        if (other.getIHNHBADFLKJ() != 0) {
          setIHNHBADFLKJ(other.getIHNHBADFLKJ());
        }
        if (buildingListBuilder_ == null) {
          if (!other.buildingList_.isEmpty()) {
            if (buildingList_.isEmpty()) {
              buildingList_ = other.buildingList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBuildingListIsMutable();
              buildingList_.addAll(other.buildingList_);
            }
            onChanged();
          }
        } else {
          if (!other.buildingList_.isEmpty()) {
            if (buildingListBuilder_.isEmpty()) {
              buildingListBuilder_.dispose();
              buildingListBuilder_ = null;
              buildingList_ = other.buildingList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              buildingListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBuildingListFieldBuilder() : null;
            } else {
              buildingListBuilder_.addAllMessages(other.buildingList_);
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
        emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int lJDMMCIKHLC_ ;
      /**
       * <code>uint32 LJDMMCIKHLC = 12;</code>
       * @return The lJDMMCIKHLC.
       */
      @java.lang.Override
      public int getLJDMMCIKHLC() {
        return lJDMMCIKHLC_;
      }
      /**
       * <code>uint32 LJDMMCIKHLC = 12;</code>
       * @param value The lJDMMCIKHLC to set.
       * @return This builder for chaining.
       */
      public Builder setLJDMMCIKHLC(int value) {
        
        lJDMMCIKHLC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LJDMMCIKHLC = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLJDMMCIKHLC() {
        
        lJDMMCIKHLC_ = 0;
        onChanged();
        return this;
      }

      private int iHNHBADFLKJ_ ;
      /**
       * <code>uint32 IHNHBADFLKJ = 4;</code>
       * @return The iHNHBADFLKJ.
       */
      @java.lang.Override
      public int getIHNHBADFLKJ() {
        return iHNHBADFLKJ_;
      }
      /**
       * <code>uint32 IHNHBADFLKJ = 4;</code>
       * @param value The iHNHBADFLKJ to set.
       * @return This builder for chaining.
       */
      public Builder setIHNHBADFLKJ(int value) {
        
        iHNHBADFLKJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IHNHBADFLKJ = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIHNHBADFLKJ() {
        
        iHNHBADFLKJ_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo> buildingList_ =
        java.util.Collections.emptyList();
      private void ensureBuildingListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          buildingList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo>(buildingList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder> buildingListBuilder_;

      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo> getBuildingListList() {
        if (buildingListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(buildingList_);
        } else {
          return buildingListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public int getBuildingListCount() {
        if (buildingListBuilder_ == null) {
          return buildingList_.size();
        } else {
          return buildingListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo getBuildingList(int index) {
        if (buildingListBuilder_ == null) {
          return buildingList_.get(index);
        } else {
          return buildingListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder setBuildingList(
          int index, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo value) {
        if (buildingListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuildingListIsMutable();
          buildingList_.set(index, value);
          onChanged();
        } else {
          buildingListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder setBuildingList(
          int index, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder builderForValue) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.set(index, builderForValue.build());
          onChanged();
        } else {
          buildingListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder addBuildingList(emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo value) {
        if (buildingListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuildingListIsMutable();
          buildingList_.add(value);
          onChanged();
        } else {
          buildingListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder addBuildingList(
          int index, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo value) {
        if (buildingListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuildingListIsMutable();
          buildingList_.add(index, value);
          onChanged();
        } else {
          buildingListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder addBuildingList(
          emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder builderForValue) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.add(builderForValue.build());
          onChanged();
        } else {
          buildingListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder addBuildingList(
          int index, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder builderForValue) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.add(index, builderForValue.build());
          onChanged();
        } else {
          buildingListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder addAllBuildingList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo> values) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, buildingList_);
          onChanged();
        } else {
          buildingListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder clearBuildingList() {
        if (buildingListBuilder_ == null) {
          buildingList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          buildingListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public Builder removeBuildingList(int index) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.remove(index);
          onChanged();
        } else {
          buildingListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder getBuildingListBuilder(
          int index) {
        return getBuildingListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder getBuildingListOrBuilder(
          int index) {
        if (buildingListBuilder_ == null) {
          return buildingList_.get(index);  } else {
          return buildingListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
           getBuildingListOrBuilderList() {
        if (buildingListBuilder_ != null) {
          return buildingListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(buildingList_);
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder addBuildingListBuilder() {
        return getBuildingListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder addBuildingListBuilder(
          int index) {
        return getBuildingListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BuildingInfo building_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder> 
           getBuildingListBuilderList() {
        return getBuildingListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
          getBuildingListFieldBuilder() {
        if (buildingListBuilder_ == null) {
          buildingListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfo.Builder, emu.grasscutter.net.proto.BuildingInfoOuterClass.BuildingInfoOrBuilder>(
                  buildingList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          buildingList_ = null;
        }
        return buildingListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GlobalBuildingInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GlobalBuildingInfoNotify)
    private static final emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify();
    }

    public static emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GlobalBuildingInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GlobalBuildingInfoNotify>() {
      @java.lang.Override
      public GlobalBuildingInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GlobalBuildingInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GlobalBuildingInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GlobalBuildingInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GlobalBuildingInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GlobalBuildingInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GlobalBuildingInfoNotify.proto\032\022Buildi" +
      "ngInfo.proto\"j\n\030GlobalBuildingInfoNotify" +
      "\022\023\n\013LJDMMCIKHLC\030\014 \001(\r\022\023\n\013IHNHBADFLKJ\030\004 \001" +
      "(\r\022$\n\rbuilding_list\030\005 \003(\0132\r.BuildingInfo" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BuildingInfoOuterClass.getDescriptor(),
        });
    internal_static_GlobalBuildingInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GlobalBuildingInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GlobalBuildingInfoNotify_descriptor,
        new java.lang.String[] { "LJDMMCIKHLC", "IHNHBADFLKJ", "BuildingList", });
    emu.grasscutter.net.proto.BuildingInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
