// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HFHFFEBONII.proto

package emu.grasscutter.net.proto;

public final class HFHFFEBONIIOuterClass {
  private HFHFFEBONIIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HFHFFEBONIIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HFHFFEBONII)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float OIBFNDDDIMH = 12;</code>
     * @return The oIBFNDDDIMH.
     */
    float getOIBFNDDDIMH();

    /**
     * <code>.AbilityString ability_name = 15;</code>
     * @return Whether the abilityName field is set.
     */
    boolean hasAbilityName();
    /**
     * <code>.AbilityString ability_name = 15;</code>
     * @return The abilityName.
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityName();
    /**
     * <code>.AbilityString ability_name = 15;</code>
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder();

    /**
     * <code>.AbilityString ability_override = 10;</code>
     * @return Whether the abilityOverride field is set.
     */
    boolean hasAbilityOverride();
    /**
     * <code>.AbilityString ability_override = 10;</code>
     * @return The abilityOverride.
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityOverride();
    /**
     * <code>.AbilityString ability_override = 10;</code>
     */
    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder();
  }
  /**
   * <pre>
   * Name: HFHFFEBONII
   * </pre>
   *
   * Protobuf type {@code HFHFFEBONII}
   */
  public static final class HFHFFEBONII extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HFHFFEBONII)
      HFHFFEBONIIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HFHFFEBONII.newBuilder() to construct.
    private HFHFFEBONII(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HFHFFEBONII() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HFHFFEBONII();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HFHFFEBONII(
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
            case 82: {
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
              if (abilityOverride_ != null) {
                subBuilder = abilityOverride_.toBuilder();
              }
              abilityOverride_ = input.readMessage(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityOverride_);
                abilityOverride_ = subBuilder.buildPartial();
              }

              break;
            }
            case 101: {

              oIBFNDDDIMH_ = input.readFloat();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder subBuilder = null;
              if (abilityName_ != null) {
                subBuilder = abilityName_.toBuilder();
              }
              abilityName_ = input.readMessage(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(abilityName_);
                abilityName_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.internal_static_HFHFFEBONII_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.internal_static_HFHFFEBONII_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII.class, emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII.Builder.class);
    }

    public static final int OIBFNDDDIMH_FIELD_NUMBER = 12;
    private float oIBFNDDDIMH_;
    /**
     * <code>float OIBFNDDDIMH = 12;</code>
     * @return The oIBFNDDDIMH.
     */
    @java.lang.Override
    public float getOIBFNDDDIMH() {
      return oIBFNDDDIMH_;
    }

    public static final int ABILITY_NAME_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString abilityName_;
    /**
     * <code>.AbilityString ability_name = 15;</code>
     * @return Whether the abilityName field is set.
     */
    @java.lang.Override
    public boolean hasAbilityName() {
      return abilityName_ != null;
    }
    /**
     * <code>.AbilityString ability_name = 15;</code>
     * @return The abilityName.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityName() {
      return abilityName_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
    }
    /**
     * <code>.AbilityString ability_name = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
      return getAbilityName();
    }

    public static final int ABILITY_OVERRIDE_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString abilityOverride_;
    /**
     * <code>.AbilityString ability_override = 10;</code>
     * @return Whether the abilityOverride field is set.
     */
    @java.lang.Override
    public boolean hasAbilityOverride() {
      return abilityOverride_ != null;
    }
    /**
     * <code>.AbilityString ability_override = 10;</code>
     * @return The abilityOverride.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityOverride() {
      return abilityOverride_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityOverride_;
    }
    /**
     * <code>.AbilityString ability_override = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder() {
      return getAbilityOverride();
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
      if (abilityOverride_ != null) {
        output.writeMessage(10, getAbilityOverride());
      }
      if (oIBFNDDDIMH_ != 0F) {
        output.writeFloat(12, oIBFNDDDIMH_);
      }
      if (abilityName_ != null) {
        output.writeMessage(15, getAbilityName());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (abilityOverride_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getAbilityOverride());
      }
      if (oIBFNDDDIMH_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(12, oIBFNDDDIMH_);
      }
      if (abilityName_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getAbilityName());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII other = (emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII) obj;

      if (java.lang.Float.floatToIntBits(getOIBFNDDDIMH())
          != java.lang.Float.floatToIntBits(
              other.getOIBFNDDDIMH())) return false;
      if (hasAbilityName() != other.hasAbilityName()) return false;
      if (hasAbilityName()) {
        if (!getAbilityName()
            .equals(other.getAbilityName())) return false;
      }
      if (hasAbilityOverride() != other.hasAbilityOverride()) return false;
      if (hasAbilityOverride()) {
        if (!getAbilityOverride()
            .equals(other.getAbilityOverride())) return false;
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
      hash = (37 * hash) + OIBFNDDDIMH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOIBFNDDDIMH());
      if (hasAbilityName()) {
        hash = (37 * hash) + ABILITY_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityName().hashCode();
      }
      if (hasAbilityOverride()) {
        hash = (37 * hash) + ABILITY_OVERRIDE_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityOverride().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII prototype) {
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
     * Name: HFHFFEBONII
     * </pre>
     *
     * Protobuf type {@code HFHFFEBONII}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HFHFFEBONII)
        emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONIIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.internal_static_HFHFFEBONII_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.internal_static_HFHFFEBONII_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII.class, emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII.newBuilder()
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
        oIBFNDDDIMH_ = 0F;

        if (abilityNameBuilder_ == null) {
          abilityName_ = null;
        } else {
          abilityName_ = null;
          abilityNameBuilder_ = null;
        }
        if (abilityOverrideBuilder_ == null) {
          abilityOverride_ = null;
        } else {
          abilityOverride_ = null;
          abilityOverrideBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.internal_static_HFHFFEBONII_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII build() {
        emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII buildPartial() {
        emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII result = new emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII(this);
        result.oIBFNDDDIMH_ = oIBFNDDDIMH_;
        if (abilityNameBuilder_ == null) {
          result.abilityName_ = abilityName_;
        } else {
          result.abilityName_ = abilityNameBuilder_.build();
        }
        if (abilityOverrideBuilder_ == null) {
          result.abilityOverride_ = abilityOverride_;
        } else {
          result.abilityOverride_ = abilityOverrideBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII) {
          return mergeFrom((emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII other) {
        if (other == emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII.getDefaultInstance()) return this;
        if (other.getOIBFNDDDIMH() != 0F) {
          setOIBFNDDDIMH(other.getOIBFNDDDIMH());
        }
        if (other.hasAbilityName()) {
          mergeAbilityName(other.getAbilityName());
        }
        if (other.hasAbilityOverride()) {
          mergeAbilityOverride(other.getAbilityOverride());
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
        emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float oIBFNDDDIMH_ ;
      /**
       * <code>float OIBFNDDDIMH = 12;</code>
       * @return The oIBFNDDDIMH.
       */
      @java.lang.Override
      public float getOIBFNDDDIMH() {
        return oIBFNDDDIMH_;
      }
      /**
       * <code>float OIBFNDDDIMH = 12;</code>
       * @param value The oIBFNDDDIMH to set.
       * @return This builder for chaining.
       */
      public Builder setOIBFNDDDIMH(float value) {
        
        oIBFNDDDIMH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float OIBFNDDDIMH = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOIBFNDDDIMH() {
        
        oIBFNDDDIMH_ = 0F;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString abilityName_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> abilityNameBuilder_;
      /**
       * <code>.AbilityString ability_name = 15;</code>
       * @return Whether the abilityName field is set.
       */
      public boolean hasAbilityName() {
        return abilityNameBuilder_ != null || abilityName_ != null;
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       * @return The abilityName.
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityName() {
        if (abilityNameBuilder_ == null) {
          return abilityName_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
        } else {
          return abilityNameBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       */
      public Builder setAbilityName(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (abilityNameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityName_ = value;
          onChanged();
        } else {
          abilityNameBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       */
      public Builder setAbilityName(
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder builderForValue) {
        if (abilityNameBuilder_ == null) {
          abilityName_ = builderForValue.build();
          onChanged();
        } else {
          abilityNameBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       */
      public Builder mergeAbilityName(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (abilityNameBuilder_ == null) {
          if (abilityName_ != null) {
            abilityName_ =
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.newBuilder(abilityName_).mergeFrom(value).buildPartial();
          } else {
            abilityName_ = value;
          }
          onChanged();
        } else {
          abilityNameBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       */
      public Builder clearAbilityName() {
        if (abilityNameBuilder_ == null) {
          abilityName_ = null;
          onChanged();
        } else {
          abilityName_ = null;
          abilityNameBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder getAbilityNameBuilder() {
        
        onChanged();
        return getAbilityNameFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityNameOrBuilder() {
        if (abilityNameBuilder_ != null) {
          return abilityNameBuilder_.getMessageOrBuilder();
        } else {
          return abilityName_ == null ?
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityName_;
        }
      }
      /**
       * <code>.AbilityString ability_name = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> 
          getAbilityNameFieldBuilder() {
        if (abilityNameBuilder_ == null) {
          abilityNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder>(
                  getAbilityName(),
                  getParentForChildren(),
                  isClean());
          abilityName_ = null;
        }
        return abilityNameBuilder_;
      }

      private emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString abilityOverride_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> abilityOverrideBuilder_;
      /**
       * <code>.AbilityString ability_override = 10;</code>
       * @return Whether the abilityOverride field is set.
       */
      public boolean hasAbilityOverride() {
        return abilityOverrideBuilder_ != null || abilityOverride_ != null;
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       * @return The abilityOverride.
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString getAbilityOverride() {
        if (abilityOverrideBuilder_ == null) {
          return abilityOverride_ == null ? emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityOverride_;
        } else {
          return abilityOverrideBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       */
      public Builder setAbilityOverride(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (abilityOverrideBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityOverride_ = value;
          onChanged();
        } else {
          abilityOverrideBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       */
      public Builder setAbilityOverride(
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder builderForValue) {
        if (abilityOverrideBuilder_ == null) {
          abilityOverride_ = builderForValue.build();
          onChanged();
        } else {
          abilityOverrideBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       */
      public Builder mergeAbilityOverride(emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString value) {
        if (abilityOverrideBuilder_ == null) {
          if (abilityOverride_ != null) {
            abilityOverride_ =
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.newBuilder(abilityOverride_).mergeFrom(value).buildPartial();
          } else {
            abilityOverride_ = value;
          }
          onChanged();
        } else {
          abilityOverrideBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       */
      public Builder clearAbilityOverride() {
        if (abilityOverrideBuilder_ == null) {
          abilityOverride_ = null;
          onChanged();
        } else {
          abilityOverride_ = null;
          abilityOverrideBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder getAbilityOverrideBuilder() {
        
        onChanged();
        return getAbilityOverrideFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       */
      public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder getAbilityOverrideOrBuilder() {
        if (abilityOverrideBuilder_ != null) {
          return abilityOverrideBuilder_.getMessageOrBuilder();
        } else {
          return abilityOverride_ == null ?
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : abilityOverride_;
        }
      }
      /**
       * <code>.AbilityString ability_override = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder> 
          getAbilityOverrideFieldBuilder() {
        if (abilityOverrideBuilder_ == null) {
          abilityOverrideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder, emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder>(
                  getAbilityOverride(),
                  getParentForChildren(),
                  isClean());
          abilityOverride_ = null;
        }
        return abilityOverrideBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HFHFFEBONII)
    }

    // @@protoc_insertion_point(class_scope:HFHFFEBONII)
    private static final emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII();
    }

    public static emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HFHFFEBONII>
        PARSER = new com.google.protobuf.AbstractParser<HFHFFEBONII>() {
      @java.lang.Override
      public HFHFFEBONII parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HFHFFEBONII(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HFHFFEBONII> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HFHFFEBONII> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HFHFFEBONIIOuterClass.HFHFFEBONII getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HFHFFEBONII_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HFHFFEBONII_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HFHFFEBONII.proto\032\023AbilityString.proto" +
      "\"r\n\013HFHFFEBONII\022\023\n\013OIBFNDDDIMH\030\014 \001(\002\022$\n\014" +
      "ability_name\030\017 \001(\0132\016.AbilityString\022(\n\020ab" +
      "ility_override\030\n \001(\0132\016.AbilityStringB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilityStringOuterClass.getDescriptor(),
        });
    internal_static_HFHFFEBONII_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HFHFFEBONII_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HFHFFEBONII_descriptor,
        new java.lang.String[] { "OIBFNDDDIMH", "AbilityName", "AbilityOverride", });
    emu.grasscutter.net.proto.AbilityStringOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
