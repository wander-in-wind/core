// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessLeftMonsterNotify.proto

package emu.grasscutter.net.proto;

public final class IrodoriChessLeftMonsterNotifyOuterClass {
  private IrodoriChessLeftMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessLeftMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessLeftMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 left_monsters = 13;</code>
     * @return The leftMonsters.
     */
    int getLeftMonsters();
  }
  /**
   * <pre>
   * Name: DCHPCOOEKLO
   * CmdId: 5331
   * </pre>
   *
   * Protobuf type {@code IrodoriChessLeftMonsterNotify}
   */
  public static final class IrodoriChessLeftMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessLeftMonsterNotify)
      IrodoriChessLeftMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessLeftMonsterNotify.newBuilder() to construct.
    private IrodoriChessLeftMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessLeftMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessLeftMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessLeftMonsterNotify(
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
            case 104: {

              leftMonsters_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.class, emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.Builder.class);
    }

    public static final int LEFT_MONSTERS_FIELD_NUMBER = 13;
    private int leftMonsters_;
    /**
     * <code>uint32 left_monsters = 13;</code>
     * @return The leftMonsters.
     */
    @java.lang.Override
    public int getLeftMonsters() {
      return leftMonsters_;
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
      if (leftMonsters_ != 0) {
        output.writeUInt32(13, leftMonsters_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (leftMonsters_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, leftMonsters_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify other = (emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify) obj;

      if (getLeftMonsters()
          != other.getLeftMonsters()) return false;
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
      hash = (37 * hash) + LEFT_MONSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getLeftMonsters();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify prototype) {
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
     * Name: DCHPCOOEKLO
     * CmdId: 5331
     * </pre>
     *
     * Protobuf type {@code IrodoriChessLeftMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessLeftMonsterNotify)
        emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.class, emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.newBuilder()
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
        leftMonsters_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.internal_static_IrodoriChessLeftMonsterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify build() {
        emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify result = new emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify(this);
        result.leftMonsters_ = leftMonsters_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify.getDefaultInstance()) return this;
        if (other.getLeftMonsters() != 0) {
          setLeftMonsters(other.getLeftMonsters());
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
        emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int leftMonsters_ ;
      /**
       * <code>uint32 left_monsters = 13;</code>
       * @return The leftMonsters.
       */
      @java.lang.Override
      public int getLeftMonsters() {
        return leftMonsters_;
      }
      /**
       * <code>uint32 left_monsters = 13;</code>
       * @param value The leftMonsters to set.
       * @return This builder for chaining.
       */
      public Builder setLeftMonsters(int value) {
        
        leftMonsters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_monsters = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftMonsters() {
        
        leftMonsters_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessLeftMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessLeftMonsterNotify)
    private static final emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify();
    }

    public static emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessLeftMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessLeftMonsterNotify>() {
      @java.lang.Override
      public IrodoriChessLeftMonsterNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessLeftMonsterNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessLeftMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessLeftMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessLeftMonsterNotifyOuterClass.IrodoriChessLeftMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessLeftMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#IrodoriChessLeftMonsterNotify.proto\"6\n" +
      "\035IrodoriChessLeftMonsterNotify\022\025\n\rleft_m" +
      "onsters\030\r \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriChessLeftMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessLeftMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessLeftMonsterNotify_descriptor,
        new java.lang.String[] { "LeftMonsters", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
