// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NPMJFJMFAPP.proto

package emu.grasscutter.net.proto;

public final class NPMJFJMFAPPOuterClass {
  private NPMJFJMFAPPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NPMJFJMFAPPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NPMJFJMFAPP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>bool is_finished = 15;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>bool AFFBBBPHIHH = 3;</code>
     * @return The aFFBBBPHIHH.
     */
    boolean getAFFBBBPHIHH();

    /**
     * <code>bool FILJDJKJKPL = 1;</code>
     * @return The fILJDJKJKPL.
     */
    boolean getFILJDJKJKPL();
  }
  /**
   * <pre>
   * Name: NPMJFJMFAPP
   * </pre>
   *
   * Protobuf type {@code NPMJFJMFAPP}
   */
  public static final class NPMJFJMFAPP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NPMJFJMFAPP)
      NPMJFJMFAPPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NPMJFJMFAPP.newBuilder() to construct.
    private NPMJFJMFAPP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NPMJFJMFAPP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NPMJFJMFAPP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NPMJFJMFAPP(
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
            case 8: {

              fILJDJKJKPL_ = input.readBool();
              break;
            }
            case 24: {

              aFFBBBPHIHH_ = input.readBool();
              break;
            }
            case 48: {

              id_ = input.readUInt32();
              break;
            }
            case 104: {

              minFinishTime_ = input.readUInt32();
              break;
            }
            case 120: {

              isFinished_ = input.readBool();
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
      return emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.internal_static_NPMJFJMFAPP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.internal_static_NPMJFJMFAPP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP.class, emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP.Builder.class);
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 13;
    private int minFinishTime_;
    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 15;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 15;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int ID_FIELD_NUMBER = 6;
    private int id_;
    /**
     * <code>uint32 id = 6;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int AFFBBBPHIHH_FIELD_NUMBER = 3;
    private boolean aFFBBBPHIHH_;
    /**
     * <code>bool AFFBBBPHIHH = 3;</code>
     * @return The aFFBBBPHIHH.
     */
    @java.lang.Override
    public boolean getAFFBBBPHIHH() {
      return aFFBBBPHIHH_;
    }

    public static final int FILJDJKJKPL_FIELD_NUMBER = 1;
    private boolean fILJDJKJKPL_;
    /**
     * <code>bool FILJDJKJKPL = 1;</code>
     * @return The fILJDJKJKPL.
     */
    @java.lang.Override
    public boolean getFILJDJKJKPL() {
      return fILJDJKJKPL_;
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
      if (fILJDJKJKPL_ != false) {
        output.writeBool(1, fILJDJKJKPL_);
      }
      if (aFFBBBPHIHH_ != false) {
        output.writeBool(3, aFFBBBPHIHH_);
      }
      if (id_ != 0) {
        output.writeUInt32(6, id_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(13, minFinishTime_);
      }
      if (isFinished_ != false) {
        output.writeBool(15, isFinished_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fILJDJKJKPL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, fILJDJKJKPL_);
      }
      if (aFFBBBPHIHH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, aFFBBBPHIHH_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, id_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, minFinishTime_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isFinished_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP other = (emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP) obj;

      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getId()
          != other.getId()) return false;
      if (getAFFBBBPHIHH()
          != other.getAFFBBBPHIHH()) return false;
      if (getFILJDJKJKPL()
          != other.getFILJDJKJKPL()) return false;
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
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + AFFBBBPHIHH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAFFBBBPHIHH());
      hash = (37 * hash) + FILJDJKJKPL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFILJDJKJKPL());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP prototype) {
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
     * Name: NPMJFJMFAPP
     * </pre>
     *
     * Protobuf type {@code NPMJFJMFAPP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NPMJFJMFAPP)
        emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.internal_static_NPMJFJMFAPP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.internal_static_NPMJFJMFAPP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP.class, emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP.newBuilder()
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
        minFinishTime_ = 0;

        isFinished_ = false;

        id_ = 0;

        aFFBBBPHIHH_ = false;

        fILJDJKJKPL_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.internal_static_NPMJFJMFAPP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP build() {
        emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP buildPartial() {
        emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP result = new emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP(this);
        result.minFinishTime_ = minFinishTime_;
        result.isFinished_ = isFinished_;
        result.id_ = id_;
        result.aFFBBBPHIHH_ = aFFBBBPHIHH_;
        result.fILJDJKJKPL_ = fILJDJKJKPL_;
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
        if (other instanceof emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP) {
          return mergeFrom((emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP other) {
        if (other == emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP.getDefaultInstance()) return this;
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getAFFBBBPHIHH() != false) {
          setAFFBBBPHIHH(other.getAFFBBBPHIHH());
        }
        if (other.getFILJDJKJKPL() != false) {
          setFILJDJKJKPL(other.getFILJDJKJKPL());
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
        emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {
        
        minFinishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 15;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 15;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 6;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private boolean aFFBBBPHIHH_ ;
      /**
       * <code>bool AFFBBBPHIHH = 3;</code>
       * @return The aFFBBBPHIHH.
       */
      @java.lang.Override
      public boolean getAFFBBBPHIHH() {
        return aFFBBBPHIHH_;
      }
      /**
       * <code>bool AFFBBBPHIHH = 3;</code>
       * @param value The aFFBBBPHIHH to set.
       * @return This builder for chaining.
       */
      public Builder setAFFBBBPHIHH(boolean value) {
        
        aFFBBBPHIHH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool AFFBBBPHIHH = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAFFBBBPHIHH() {
        
        aFFBBBPHIHH_ = false;
        onChanged();
        return this;
      }

      private boolean fILJDJKJKPL_ ;
      /**
       * <code>bool FILJDJKJKPL = 1;</code>
       * @return The fILJDJKJKPL.
       */
      @java.lang.Override
      public boolean getFILJDJKJKPL() {
        return fILJDJKJKPL_;
      }
      /**
       * <code>bool FILJDJKJKPL = 1;</code>
       * @param value The fILJDJKJKPL to set.
       * @return This builder for chaining.
       */
      public Builder setFILJDJKJKPL(boolean value) {
        
        fILJDJKJKPL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool FILJDJKJKPL = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFILJDJKJKPL() {
        
        fILJDJKJKPL_ = false;
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


      // @@protoc_insertion_point(builder_scope:NPMJFJMFAPP)
    }

    // @@protoc_insertion_point(class_scope:NPMJFJMFAPP)
    private static final emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP();
    }

    public static emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NPMJFJMFAPP>
        PARSER = new com.google.protobuf.AbstractParser<NPMJFJMFAPP>() {
      @java.lang.Override
      public NPMJFJMFAPP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NPMJFJMFAPP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NPMJFJMFAPP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NPMJFJMFAPP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NPMJFJMFAPPOuterClass.NPMJFJMFAPP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NPMJFJMFAPP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NPMJFJMFAPP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NPMJFJMFAPP.proto\"q\n\013NPMJFJMFAPP\022\027\n\017mi" +
      "n_finish_time\030\r \001(\r\022\023\n\013is_finished\030\017 \001(\010" +
      "\022\n\n\002id\030\006 \001(\r\022\023\n\013AFFBBBPHIHH\030\003 \001(\010\022\023\n\013FIL" +
      "JDJKJKPL\030\001 \001(\010B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NPMJFJMFAPP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NPMJFJMFAPP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NPMJFJMFAPP_descriptor,
        new java.lang.String[] { "MinFinishTime", "IsFinished", "Id", "AFFBBBPHIHH", "FILJDJKJKPL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
