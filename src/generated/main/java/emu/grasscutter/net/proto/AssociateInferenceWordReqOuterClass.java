// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AssociateInferenceWordReq.proto

package emu.grasscutter.net.proto;

public final class AssociateInferenceWordReqOuterClass {
  private AssociateInferenceWordReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AssociateInferenceWordReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AssociateInferenceWordReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BHNIGBDOGPG = 2;</code>
     * @return The bHNIGBDOGPG.
     */
    int getBHNIGBDOGPG();

    /**
     * <code>uint32 page_id = 13;</code>
     * @return The pageId.
     */
    int getPageId();

    /**
     * <code>uint32 FDBFNNDGPBB = 4;</code>
     * @return The fDBFNNDGPBB.
     */
    int getFDBFNNDGPBB();
  }
  /**
   * <pre>
   * CmdId: 464
   * Name: LPENNMHPHGO
   * </pre>
   *
   * Protobuf type {@code AssociateInferenceWordReq}
   */
  public static final class AssociateInferenceWordReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AssociateInferenceWordReq)
      AssociateInferenceWordReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AssociateInferenceWordReq.newBuilder() to construct.
    private AssociateInferenceWordReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AssociateInferenceWordReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AssociateInferenceWordReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AssociateInferenceWordReq(
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
            case 16: {

              bHNIGBDOGPG_ = input.readUInt32();
              break;
            }
            case 32: {

              fDBFNNDGPBB_ = input.readUInt32();
              break;
            }
            case 104: {

              pageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.class, emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.Builder.class);
    }

    public static final int BHNIGBDOGPG_FIELD_NUMBER = 2;
    private int bHNIGBDOGPG_;
    /**
     * <code>uint32 BHNIGBDOGPG = 2;</code>
     * @return The bHNIGBDOGPG.
     */
    @java.lang.Override
    public int getBHNIGBDOGPG() {
      return bHNIGBDOGPG_;
    }

    public static final int PAGE_ID_FIELD_NUMBER = 13;
    private int pageId_;
    /**
     * <code>uint32 page_id = 13;</code>
     * @return The pageId.
     */
    @java.lang.Override
    public int getPageId() {
      return pageId_;
    }

    public static final int FDBFNNDGPBB_FIELD_NUMBER = 4;
    private int fDBFNNDGPBB_;
    /**
     * <code>uint32 FDBFNNDGPBB = 4;</code>
     * @return The fDBFNNDGPBB.
     */
    @java.lang.Override
    public int getFDBFNNDGPBB() {
      return fDBFNNDGPBB_;
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
      if (bHNIGBDOGPG_ != 0) {
        output.writeUInt32(2, bHNIGBDOGPG_);
      }
      if (fDBFNNDGPBB_ != 0) {
        output.writeUInt32(4, fDBFNNDGPBB_);
      }
      if (pageId_ != 0) {
        output.writeUInt32(13, pageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bHNIGBDOGPG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, bHNIGBDOGPG_);
      }
      if (fDBFNNDGPBB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, fDBFNNDGPBB_);
      }
      if (pageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, pageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq other = (emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq) obj;

      if (getBHNIGBDOGPG()
          != other.getBHNIGBDOGPG()) return false;
      if (getPageId()
          != other.getPageId()) return false;
      if (getFDBFNNDGPBB()
          != other.getFDBFNNDGPBB()) return false;
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
      hash = (37 * hash) + BHNIGBDOGPG_FIELD_NUMBER;
      hash = (53 * hash) + getBHNIGBDOGPG();
      hash = (37 * hash) + PAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPageId();
      hash = (37 * hash) + FDBFNNDGPBB_FIELD_NUMBER;
      hash = (53 * hash) + getFDBFNNDGPBB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq prototype) {
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
     * CmdId: 464
     * Name: LPENNMHPHGO
     * </pre>
     *
     * Protobuf type {@code AssociateInferenceWordReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AssociateInferenceWordReq)
        emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.class, emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.newBuilder()
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
        bHNIGBDOGPG_ = 0;

        pageId_ = 0;

        fDBFNNDGPBB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq build() {
        emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq buildPartial() {
        emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq result = new emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq(this);
        result.bHNIGBDOGPG_ = bHNIGBDOGPG_;
        result.pageId_ = pageId_;
        result.fDBFNNDGPBB_ = fDBFNNDGPBB_;
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
        if (other instanceof emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq) {
          return mergeFrom((emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq other) {
        if (other == emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.getDefaultInstance()) return this;
        if (other.getBHNIGBDOGPG() != 0) {
          setBHNIGBDOGPG(other.getBHNIGBDOGPG());
        }
        if (other.getPageId() != 0) {
          setPageId(other.getPageId());
        }
        if (other.getFDBFNNDGPBB() != 0) {
          setFDBFNNDGPBB(other.getFDBFNNDGPBB());
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
        emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bHNIGBDOGPG_ ;
      /**
       * <code>uint32 BHNIGBDOGPG = 2;</code>
       * @return The bHNIGBDOGPG.
       */
      @java.lang.Override
      public int getBHNIGBDOGPG() {
        return bHNIGBDOGPG_;
      }
      /**
       * <code>uint32 BHNIGBDOGPG = 2;</code>
       * @param value The bHNIGBDOGPG to set.
       * @return This builder for chaining.
       */
      public Builder setBHNIGBDOGPG(int value) {
        
        bHNIGBDOGPG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BHNIGBDOGPG = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBHNIGBDOGPG() {
        
        bHNIGBDOGPG_ = 0;
        onChanged();
        return this;
      }

      private int pageId_ ;
      /**
       * <code>uint32 page_id = 13;</code>
       * @return The pageId.
       */
      @java.lang.Override
      public int getPageId() {
        return pageId_;
      }
      /**
       * <code>uint32 page_id = 13;</code>
       * @param value The pageId to set.
       * @return This builder for chaining.
       */
      public Builder setPageId(int value) {
        
        pageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 page_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPageId() {
        
        pageId_ = 0;
        onChanged();
        return this;
      }

      private int fDBFNNDGPBB_ ;
      /**
       * <code>uint32 FDBFNNDGPBB = 4;</code>
       * @return The fDBFNNDGPBB.
       */
      @java.lang.Override
      public int getFDBFNNDGPBB() {
        return fDBFNNDGPBB_;
      }
      /**
       * <code>uint32 FDBFNNDGPBB = 4;</code>
       * @param value The fDBFNNDGPBB to set.
       * @return This builder for chaining.
       */
      public Builder setFDBFNNDGPBB(int value) {
        
        fDBFNNDGPBB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FDBFNNDGPBB = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFDBFNNDGPBB() {
        
        fDBFNNDGPBB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AssociateInferenceWordReq)
    }

    // @@protoc_insertion_point(class_scope:AssociateInferenceWordReq)
    private static final emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq();
    }

    public static emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AssociateInferenceWordReq>
        PARSER = new com.google.protobuf.AbstractParser<AssociateInferenceWordReq>() {
      @java.lang.Override
      public AssociateInferenceWordReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssociateInferenceWordReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AssociateInferenceWordReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AssociateInferenceWordReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AssociateInferenceWordReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AssociateInferenceWordReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AssociateInferenceWordReq.proto\"V\n\031Ass" +
      "ociateInferenceWordReq\022\023\n\013BHNIGBDOGPG\030\002 " +
      "\001(\r\022\017\n\007page_id\030\r \001(\r\022\023\n\013FDBFNNDGPBB\030\004 \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AssociateInferenceWordReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AssociateInferenceWordReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AssociateInferenceWordReq_descriptor,
        new java.lang.String[] { "BHNIGBDOGPG", "PageId", "FDBFNNDGPBB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
