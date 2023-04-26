// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryStageType.proto

package emu.grasscutter.net.proto;

public final class GalleryStageTypeOuterClass {
  private GalleryStageTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: FPOMFCNJPIE
   * </pre>
   *
   * Protobuf enum {@code GalleryStageType}
   */
  public enum GalleryStageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GALLERY_NONE = 0;</code>
     */
    GALLERY_NONE(0),
    /**
     * <code>GALLERY_PRESTART = 1;</code>
     */
    GALLERY_PRESTART(1),
    /**
     * <code>GALLERY_START = 2;</code>
     */
    GALLERY_START(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GALLERY_NONE = 0;</code>
     */
    public static final int GALLERY_NONE_VALUE = 0;
    /**
     * <code>GALLERY_PRESTART = 1;</code>
     */
    public static final int GALLERY_PRESTART_VALUE = 1;
    /**
     * <code>GALLERY_START = 2;</code>
     */
    public static final int GALLERY_START_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GalleryStageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GalleryStageType forNumber(int value) {
      switch (value) {
        case 0: return GALLERY_NONE;
        case 1: return GALLERY_PRESTART;
        case 2: return GALLERY_START;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GalleryStageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GalleryStageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GalleryStageType>() {
            public GalleryStageType findValueByNumber(int number) {
              return GalleryStageType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GalleryStageTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GalleryStageType[] VALUES = values();

    public static GalleryStageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GalleryStageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GalleryStageType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GalleryStageType.proto*M\n\020GalleryStage" +
      "Type\022\020\n\014GALLERY_NONE\020\000\022\024\n\020GALLERY_PRESTA" +
      "RT\020\001\022\021\n\rGALLERY_START\020\002B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
