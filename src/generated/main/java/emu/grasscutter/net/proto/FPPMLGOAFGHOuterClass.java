// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FPPMLGOAFGH.proto

package emu.grasscutter.net.proto;

public final class FPPMLGOAFGHOuterClass {
  private FPPMLGOAFGHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FPPMLGOAFGHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FPPMLGOAFGH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HIDNILLDCAD type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.HIDNILLDCAD type = 1;</code>
     * @return The type.
     */
    emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD getType();

    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    int getY();
  }
  /**
   * <pre>
   * Name: FPPMLGOAFGH
   * </pre>
   *
   * Protobuf type {@code FPPMLGOAFGH}
   */
  public static final class FPPMLGOAFGH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FPPMLGOAFGH)
      FPPMLGOAFGHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FPPMLGOAFGH.newBuilder() to construct.
    private FPPMLGOAFGH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FPPMLGOAFGH() {
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FPPMLGOAFGH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FPPMLGOAFGH(
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
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 16: {

              y_ = input.readInt32();
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
      return emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.internal_static_FPPMLGOAFGH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.internal_static_FPPMLGOAFGH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH.class, emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.HIDNILLDCAD type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.HIDNILLDCAD type = 1;</code>
     * @return The type.
     */
    @java.lang.Override public emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD getType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD result = emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD.valueOf(type_);
      return result == null ? emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD.UNRECOGNIZED : result;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private int y_;
    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public int getY() {
      return y_;
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
      if (type_ != emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD.HIDNILLDCAD_MLBFMJIBJEP.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (y_ != 0) {
        output.writeInt32(2, y_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD.HIDNILLDCAD_MLBFMJIBJEP.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (y_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH other = (emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH) obj;

      if (type_ != other.type_) return false;
      if (getY()
          != other.getY()) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + getY();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH prototype) {
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
     * Name: FPPMLGOAFGH
     * </pre>
     *
     * Protobuf type {@code FPPMLGOAFGH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FPPMLGOAFGH)
        emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.internal_static_FPPMLGOAFGH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.internal_static_FPPMLGOAFGH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH.class, emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH.newBuilder()
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
        type_ = 0;

        y_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.internal_static_FPPMLGOAFGH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH build() {
        emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH buildPartial() {
        emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH result = new emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH(this);
        result.type_ = type_;
        result.y_ = y_;
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
        if (other instanceof emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH) {
          return mergeFrom((emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH other) {
        if (other == emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getY() != 0) {
          setY(other.getY());
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
        emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.HIDNILLDCAD type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.HIDNILLDCAD type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.HIDNILLDCAD type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD getType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD result = emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD.valueOf(type_);
        return result == null ? emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD.UNRECOGNIZED : result;
      }
      /**
       * <code>.HIDNILLDCAD type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(emu.grasscutter.net.proto.HIDNILLDCADOuterClass.HIDNILLDCAD value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.HIDNILLDCAD type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>int32 y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public int getY() {
        return y_;
      }
      /**
       * <code>int32 y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(int value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FPPMLGOAFGH)
    }

    // @@protoc_insertion_point(class_scope:FPPMLGOAFGH)
    private static final emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH();
    }

    public static emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FPPMLGOAFGH>
        PARSER = new com.google.protobuf.AbstractParser<FPPMLGOAFGH>() {
      @java.lang.Override
      public FPPMLGOAFGH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FPPMLGOAFGH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FPPMLGOAFGH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FPPMLGOAFGH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FPPMLGOAFGHOuterClass.FPPMLGOAFGH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FPPMLGOAFGH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FPPMLGOAFGH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FPPMLGOAFGH.proto\032\021HIDNILLDCAD.proto\"4" +
      "\n\013FPPMLGOAFGH\022\032\n\004type\030\001 \001(\0162\014.HIDNILLDCA" +
      "D\022\t\n\001y\030\002 \001(\005B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HIDNILLDCADOuterClass.getDescriptor(),
        });
    internal_static_FPPMLGOAFGH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FPPMLGOAFGH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FPPMLGOAFGH_descriptor,
        new java.lang.String[] { "Type", "Y", });
    emu.grasscutter.net.proto.HIDNILLDCADOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
