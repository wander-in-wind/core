// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IFJPGGKMMNA.proto

package emu.grasscutter.net.proto;

public final class IFJPGGKMMNAOuterClass {
  private IFJPGGKMMNAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IFJPGGKMMNAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IFJPGGKMMNA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 NHINGEDOELM = 3;</code>
     * @return The nHINGEDOELM.
     */
    int getNHINGEDOELM();

    /**
     * <code>uint32 target_id = 6;</code>
     * @return The targetId.
     */
    int getTargetId();

    /**
     * <code>float FEHAJMPNDAB = 8;</code>
     * @return The fEHAJMPNDAB.
     */
    float getFEHAJMPNDAB();
  }
  /**
   * <pre>
   * Name: IFJPGGKMMNA
   * </pre>
   *
   * Protobuf type {@code IFJPGGKMMNA}
   */
  public static final class IFJPGGKMMNA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IFJPGGKMMNA)
      IFJPGGKMMNAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IFJPGGKMMNA.newBuilder() to construct.
    private IFJPGGKMMNA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IFJPGGKMMNA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IFJPGGKMMNA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IFJPGGKMMNA(
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
            case 24: {

              nHINGEDOELM_ = input.readUInt32();
              break;
            }
            case 48: {

              targetId_ = input.readUInt32();
              break;
            }
            case 69: {

              fEHAJMPNDAB_ = input.readFloat();
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
      return emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.internal_static_IFJPGGKMMNA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.internal_static_IFJPGGKMMNA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA.class, emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA.Builder.class);
    }

    public static final int NHINGEDOELM_FIELD_NUMBER = 3;
    private int nHINGEDOELM_;
    /**
     * <code>uint32 NHINGEDOELM = 3;</code>
     * @return The nHINGEDOELM.
     */
    @java.lang.Override
    public int getNHINGEDOELM() {
      return nHINGEDOELM_;
    }

    public static final int TARGET_ID_FIELD_NUMBER = 6;
    private int targetId_;
    /**
     * <code>uint32 target_id = 6;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
    }

    public static final int FEHAJMPNDAB_FIELD_NUMBER = 8;
    private float fEHAJMPNDAB_;
    /**
     * <code>float FEHAJMPNDAB = 8;</code>
     * @return The fEHAJMPNDAB.
     */
    @java.lang.Override
    public float getFEHAJMPNDAB() {
      return fEHAJMPNDAB_;
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
      if (nHINGEDOELM_ != 0) {
        output.writeUInt32(3, nHINGEDOELM_);
      }
      if (targetId_ != 0) {
        output.writeUInt32(6, targetId_);
      }
      if (fEHAJMPNDAB_ != 0F) {
        output.writeFloat(8, fEHAJMPNDAB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nHINGEDOELM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, nHINGEDOELM_);
      }
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, targetId_);
      }
      if (fEHAJMPNDAB_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(8, fEHAJMPNDAB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA other = (emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA) obj;

      if (getNHINGEDOELM()
          != other.getNHINGEDOELM()) return false;
      if (getTargetId()
          != other.getTargetId()) return false;
      if (java.lang.Float.floatToIntBits(getFEHAJMPNDAB())
          != java.lang.Float.floatToIntBits(
              other.getFEHAJMPNDAB())) return false;
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
      hash = (37 * hash) + NHINGEDOELM_FIELD_NUMBER;
      hash = (53 * hash) + getNHINGEDOELM();
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (37 * hash) + FEHAJMPNDAB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFEHAJMPNDAB());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA prototype) {
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
     * Name: IFJPGGKMMNA
     * </pre>
     *
     * Protobuf type {@code IFJPGGKMMNA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IFJPGGKMMNA)
        emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.internal_static_IFJPGGKMMNA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.internal_static_IFJPGGKMMNA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA.class, emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA.newBuilder()
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
        nHINGEDOELM_ = 0;

        targetId_ = 0;

        fEHAJMPNDAB_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.internal_static_IFJPGGKMMNA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA build() {
        emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA buildPartial() {
        emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA result = new emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA(this);
        result.nHINGEDOELM_ = nHINGEDOELM_;
        result.targetId_ = targetId_;
        result.fEHAJMPNDAB_ = fEHAJMPNDAB_;
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
        if (other instanceof emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA) {
          return mergeFrom((emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA other) {
        if (other == emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA.getDefaultInstance()) return this;
        if (other.getNHINGEDOELM() != 0) {
          setNHINGEDOELM(other.getNHINGEDOELM());
        }
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
        }
        if (other.getFEHAJMPNDAB() != 0F) {
          setFEHAJMPNDAB(other.getFEHAJMPNDAB());
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
        emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int nHINGEDOELM_ ;
      /**
       * <code>uint32 NHINGEDOELM = 3;</code>
       * @return The nHINGEDOELM.
       */
      @java.lang.Override
      public int getNHINGEDOELM() {
        return nHINGEDOELM_;
      }
      /**
       * <code>uint32 NHINGEDOELM = 3;</code>
       * @param value The nHINGEDOELM to set.
       * @return This builder for chaining.
       */
      public Builder setNHINGEDOELM(int value) {
        
        nHINGEDOELM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NHINGEDOELM = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNHINGEDOELM() {
        
        nHINGEDOELM_ = 0;
        onChanged();
        return this;
      }

      private int targetId_ ;
      /**
       * <code>uint32 target_id = 6;</code>
       * @return The targetId.
       */
      @java.lang.Override
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>uint32 target_id = 6;</code>
       * @param value The targetId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetId(int value) {
        
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetId() {
        
        targetId_ = 0;
        onChanged();
        return this;
      }

      private float fEHAJMPNDAB_ ;
      /**
       * <code>float FEHAJMPNDAB = 8;</code>
       * @return The fEHAJMPNDAB.
       */
      @java.lang.Override
      public float getFEHAJMPNDAB() {
        return fEHAJMPNDAB_;
      }
      /**
       * <code>float FEHAJMPNDAB = 8;</code>
       * @param value The fEHAJMPNDAB to set.
       * @return This builder for chaining.
       */
      public Builder setFEHAJMPNDAB(float value) {
        
        fEHAJMPNDAB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float FEHAJMPNDAB = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFEHAJMPNDAB() {
        
        fEHAJMPNDAB_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:IFJPGGKMMNA)
    }

    // @@protoc_insertion_point(class_scope:IFJPGGKMMNA)
    private static final emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA();
    }

    public static emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IFJPGGKMMNA>
        PARSER = new com.google.protobuf.AbstractParser<IFJPGGKMMNA>() {
      @java.lang.Override
      public IFJPGGKMMNA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IFJPGGKMMNA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IFJPGGKMMNA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IFJPGGKMMNA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IFJPGGKMMNAOuterClass.IFJPGGKMMNA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IFJPGGKMMNA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IFJPGGKMMNA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IFJPGGKMMNA.proto\"J\n\013IFJPGGKMMNA\022\023\n\013NH" +
      "INGEDOELM\030\003 \001(\r\022\021\n\ttarget_id\030\006 \001(\r\022\023\n\013FE" +
      "HAJMPNDAB\030\010 \001(\002B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IFJPGGKMMNA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IFJPGGKMMNA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IFJPGGKMMNA_descriptor,
        new java.lang.String[] { "NHINGEDOELM", "TargetId", "FEHAJMPNDAB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
