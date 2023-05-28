// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupLinkBundle.proto

package emu.grasscutter.net.proto;

public final class GroupLinkBundleOuterClass {
  private GroupLinkBundleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupLinkBundleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GroupLinkBundle)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 radius = 8;</code>
     * @return The radius.
     */
    int getRadius();

    /**
     * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
     * @return The enum numeric value on the wire for lLFLMBEKAOF.
     */
    int getLLFLMBEKAOFValue();
    /**
     * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
     * @return The lLFLMBEKAOF.
     */
    emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG getLLFLMBEKAOF();

    /**
     * <code>.Vector center = 13;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>.Vector center = 13;</code>
     * @return The center.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter();
    /**
     * <code>.Vector center = 13;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder();

    /**
     * <code>bool LDMGLAGNIHP = 9;</code>
     * @return The lDMGLAGNIHP.
     */
    boolean getLDMGLAGNIHP();

    /**
     * <code>uint32 bundle_id = 7;</code>
     * @return The bundleId.
     */
    int getBundleId();

    /**
     * <code>uint32 scene_id = 2;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>bool is_activated = 4;</code>
     * @return The isActivated.
     */
    boolean getIsActivated();
  }
  /**
   * <pre>
   * Obf: NJAGHNCNFMN
   * </pre>
   *
   * Protobuf type {@code GroupLinkBundle}
   */
  public static final class GroupLinkBundle extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GroupLinkBundle)
      GroupLinkBundleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GroupLinkBundle.newBuilder() to construct.
    private GroupLinkBundle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GroupLinkBundle() {
      lLFLMBEKAOF_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GroupLinkBundle();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GroupLinkBundle(
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

              sceneId_ = input.readUInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              lLFLMBEKAOF_ = rawValue;
              break;
            }
            case 32: {

              isActivated_ = input.readBool();
              break;
            }
            case 56: {

              bundleId_ = input.readUInt32();
              break;
            }
            case 64: {

              radius_ = input.readUInt32();
              break;
            }
            case 72: {

              lDMGLAGNIHP_ = input.readBool();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (center_ != null) {
                subBuilder = center_.toBuilder();
              }
              center_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(center_);
                center_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.class, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder.class);
    }

    public static final int RADIUS_FIELD_NUMBER = 8;
    private int radius_;
    /**
     * <code>uint32 radius = 8;</code>
     * @return The radius.
     */
    @java.lang.Override
    public int getRadius() {
      return radius_;
    }

    public static final int LLFLMBEKAOF_FIELD_NUMBER = 3;
    private int lLFLMBEKAOF_;
    /**
     * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
     * @return The enum numeric value on the wire for lLFLMBEKAOF.
     */
    @java.lang.Override public int getLLFLMBEKAOFValue() {
      return lLFLMBEKAOF_;
    }
    /**
     * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
     * @return The lLFLMBEKAOF.
     */
    @java.lang.Override public emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG getLLFLMBEKAOF() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG result = emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG.valueOf(lLFLMBEKAOF_);
      return result == null ? emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG.UNRECOGNIZED : result;
    }

    public static final int CENTER_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
    /**
     * <code>.Vector center = 13;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return center_ != null;
    }
    /**
     * <code>.Vector center = 13;</code>
     * @return The center.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
      return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
    }
    /**
     * <code>.Vector center = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
      return getCenter();
    }

    public static final int LDMGLAGNIHP_FIELD_NUMBER = 9;
    private boolean lDMGLAGNIHP_;
    /**
     * <code>bool LDMGLAGNIHP = 9;</code>
     * @return The lDMGLAGNIHP.
     */
    @java.lang.Override
    public boolean getLDMGLAGNIHP() {
      return lDMGLAGNIHP_;
    }

    public static final int BUNDLE_ID_FIELD_NUMBER = 7;
    private int bundleId_;
    /**
     * <code>uint32 bundle_id = 7;</code>
     * @return The bundleId.
     */
    @java.lang.Override
    public int getBundleId() {
      return bundleId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 2;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 2;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int IS_ACTIVATED_FIELD_NUMBER = 4;
    private boolean isActivated_;
    /**
     * <code>bool is_activated = 4;</code>
     * @return The isActivated.
     */
    @java.lang.Override
    public boolean getIsActivated() {
      return isActivated_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(2, sceneId_);
      }
      if (lLFLMBEKAOF_ != emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG.IADPAEJBNNG_None.getNumber()) {
        output.writeEnum(3, lLFLMBEKAOF_);
      }
      if (isActivated_ != false) {
        output.writeBool(4, isActivated_);
      }
      if (bundleId_ != 0) {
        output.writeUInt32(7, bundleId_);
      }
      if (radius_ != 0) {
        output.writeUInt32(8, radius_);
      }
      if (lDMGLAGNIHP_ != false) {
        output.writeBool(9, lDMGLAGNIHP_);
      }
      if (center_ != null) {
        output.writeMessage(13, getCenter());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, sceneId_);
      }
      if (lLFLMBEKAOF_ != emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG.IADPAEJBNNG_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, lLFLMBEKAOF_);
      }
      if (isActivated_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isActivated_);
      }
      if (bundleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, bundleId_);
      }
      if (radius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, radius_);
      }
      if (lDMGLAGNIHP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, lDMGLAGNIHP_);
      }
      if (center_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getCenter());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle other = (emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle) obj;

      if (getRadius()
          != other.getRadius()) return false;
      if (lLFLMBEKAOF_ != other.lLFLMBEKAOF_) return false;
      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
      }
      if (getLDMGLAGNIHP()
          != other.getLDMGLAGNIHP()) return false;
      if (getBundleId()
          != other.getBundleId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getIsActivated()
          != other.getIsActivated()) return false;
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
      hash = (37 * hash) + RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getRadius();
      hash = (37 * hash) + LLFLMBEKAOF_FIELD_NUMBER;
      hash = (53 * hash) + lLFLMBEKAOF_;
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      hash = (37 * hash) + LDMGLAGNIHP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getLDMGLAGNIHP());
      hash = (37 * hash) + BUNDLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBundleId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + IS_ACTIVATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActivated());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle prototype) {
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
     * Obf: NJAGHNCNFMN
     * </pre>
     *
     * Protobuf type {@code GroupLinkBundle}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GroupLinkBundle)
        emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.class, emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.newBuilder()
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
        radius_ = 0;

        lLFLMBEKAOF_ = 0;

        if (centerBuilder_ == null) {
          center_ = null;
        } else {
          center_ = null;
          centerBuilder_ = null;
        }
        lDMGLAGNIHP_ = false;

        bundleId_ = 0;

        sceneId_ = 0;

        isActivated_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GroupLinkBundleOuterClass.internal_static_GroupLinkBundle_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle build() {
        emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle buildPartial() {
        emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle result = new emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle(this);
        result.radius_ = radius_;
        result.lLFLMBEKAOF_ = lLFLMBEKAOF_;
        if (centerBuilder_ == null) {
          result.center_ = center_;
        } else {
          result.center_ = centerBuilder_.build();
        }
        result.lDMGLAGNIHP_ = lDMGLAGNIHP_;
        result.bundleId_ = bundleId_;
        result.sceneId_ = sceneId_;
        result.isActivated_ = isActivated_;
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
        if (other instanceof emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle) {
          return mergeFrom((emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle other) {
        if (other == emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance()) return this;
        if (other.getRadius() != 0) {
          setRadius(other.getRadius());
        }
        if (other.lLFLMBEKAOF_ != 0) {
          setLLFLMBEKAOFValue(other.getLLFLMBEKAOFValue());
        }
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
        }
        if (other.getLDMGLAGNIHP() != false) {
          setLDMGLAGNIHP(other.getLDMGLAGNIHP());
        }
        if (other.getBundleId() != 0) {
          setBundleId(other.getBundleId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getIsActivated() != false) {
          setIsActivated(other.getIsActivated());
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
        emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int radius_ ;
      /**
       * <code>uint32 radius = 8;</code>
       * @return The radius.
       */
      @java.lang.Override
      public int getRadius() {
        return radius_;
      }
      /**
       * <code>uint32 radius = 8;</code>
       * @param value The radius to set.
       * @return This builder for chaining.
       */
      public Builder setRadius(int value) {
        
        radius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 radius = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRadius() {
        
        radius_ = 0;
        onChanged();
        return this;
      }

      private int lLFLMBEKAOF_ = 0;
      /**
       * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
       * @return The enum numeric value on the wire for lLFLMBEKAOF.
       */
      @java.lang.Override public int getLLFLMBEKAOFValue() {
        return lLFLMBEKAOF_;
      }
      /**
       * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
       * @param value The enum numeric value on the wire for lLFLMBEKAOF to set.
       * @return This builder for chaining.
       */
      public Builder setLLFLMBEKAOFValue(int value) {
        
        lLFLMBEKAOF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
       * @return The lLFLMBEKAOF.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG getLLFLMBEKAOF() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG result = emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG.valueOf(lLFLMBEKAOF_);
        return result == null ? emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG.UNRECOGNIZED : result;
      }
      /**
       * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
       * @param value The lLFLMBEKAOF to set.
       * @return This builder for chaining.
       */
      public Builder setLLFLMBEKAOF(emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.IADPAEJBNNG value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        lLFLMBEKAOF_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.IADPAEJBNNG LLFLMBEKAOF = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLLFLMBEKAOF() {
        
        lLFLMBEKAOF_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> centerBuilder_;
      /**
       * <code>.Vector center = 13;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return centerBuilder_ != null || center_ != null;
      }
      /**
       * <code>.Vector center = 13;</code>
       * @return The center.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector center = 13;</code>
       */
      public Builder setCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
          onChanged();
        } else {
          centerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 13;</code>
       */
      public Builder setCenter(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
          onChanged();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector center = 13;</code>
       */
      public Builder mergeCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (center_ != null) {
            center_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(center_).mergeFrom(value).buildPartial();
          } else {
            center_ = value;
          }
          onChanged();
        } else {
          centerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 13;</code>
       */
      public Builder clearCenter() {
        if (centerBuilder_ == null) {
          center_ = null;
          onChanged();
        } else {
          center_ = null;
          centerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector center = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCenterBuilder() {
        
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector center = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>.Vector center = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
      }

      private boolean lDMGLAGNIHP_ ;
      /**
       * <code>bool LDMGLAGNIHP = 9;</code>
       * @return The lDMGLAGNIHP.
       */
      @java.lang.Override
      public boolean getLDMGLAGNIHP() {
        return lDMGLAGNIHP_;
      }
      /**
       * <code>bool LDMGLAGNIHP = 9;</code>
       * @param value The lDMGLAGNIHP to set.
       * @return This builder for chaining.
       */
      public Builder setLDMGLAGNIHP(boolean value) {
        
        lDMGLAGNIHP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool LDMGLAGNIHP = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLDMGLAGNIHP() {
        
        lDMGLAGNIHP_ = false;
        onChanged();
        return this;
      }

      private int bundleId_ ;
      /**
       * <code>uint32 bundle_id = 7;</code>
       * @return The bundleId.
       */
      @java.lang.Override
      public int getBundleId() {
        return bundleId_;
      }
      /**
       * <code>uint32 bundle_id = 7;</code>
       * @param value The bundleId to set.
       * @return This builder for chaining.
       */
      public Builder setBundleId(int value) {
        
        bundleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bundle_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBundleId() {
        
        bundleId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 2;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 2;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private boolean isActivated_ ;
      /**
       * <code>bool is_activated = 4;</code>
       * @return The isActivated.
       */
      @java.lang.Override
      public boolean getIsActivated() {
        return isActivated_;
      }
      /**
       * <code>bool is_activated = 4;</code>
       * @param value The isActivated to set.
       * @return This builder for chaining.
       */
      public Builder setIsActivated(boolean value) {
        
        isActivated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_activated = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActivated() {
        
        isActivated_ = false;
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


      // @@protoc_insertion_point(builder_scope:GroupLinkBundle)
    }

    // @@protoc_insertion_point(class_scope:GroupLinkBundle)
    private static final emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle();
    }

    public static emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GroupLinkBundle>
        PARSER = new com.google.protobuf.AbstractParser<GroupLinkBundle>() {
      @java.lang.Override
      public GroupLinkBundle parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GroupLinkBundle(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GroupLinkBundle> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GroupLinkBundle> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GroupLinkBundleOuterClass.GroupLinkBundle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GroupLinkBundle_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GroupLinkBundle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GroupLinkBundle.proto\032\021IADPAEJBNNG.pro" +
      "to\032\014Vector.proto\"\255\001\n\017GroupLinkBundle\022\016\n\006" +
      "radius\030\010 \001(\r\022!\n\013LLFLMBEKAOF\030\003 \001(\0162\014.IADP" +
      "AEJBNNG\022\027\n\006center\030\r \001(\0132\007.Vector\022\023\n\013LDMG" +
      "LAGNIHP\030\t \001(\010\022\021\n\tbundle_id\030\007 \001(\r\022\020\n\010scen" +
      "e_id\030\002 \001(\r\022\024\n\014is_activated\030\004 \001(\010B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_GroupLinkBundle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GroupLinkBundle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GroupLinkBundle_descriptor,
        new java.lang.String[] { "Radius", "LLFLMBEKAOF", "Center", "LDMGLAGNIHP", "BundleId", "SceneId", "IsActivated", });
    emu.grasscutter.net.proto.IADPAEJBNNGOuterClass.getDescriptor();
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
