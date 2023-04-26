// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryStartSource.proto

package emu.grasscutter.net.proto;

public final class GalleryStartSourceOuterClass {
  private GalleryStartSourceOuterClass() {}
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
   * Name: BPJKMCDHCOJ
   * </pre>
   *
   * Protobuf enum {@code GalleryStartSource}
   */
  public enum GalleryStartSource
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GALLERY_START_BY_NONE = 0;</code>
     */
    GALLERY_START_BY_NONE(0),
    /**
     * <code>GALLERY_START_BY_MATCH = 1;</code>
     */
    GALLERY_START_BY_MATCH(1),
    /**
     * <code>GALLERY_START_BY_DRAFT = 2;</code>
     */
    GALLERY_START_BY_DRAFT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GALLERY_START_BY_NONE = 0;</code>
     */
    public static final int GALLERY_START_BY_NONE_VALUE = 0;
    /**
     * <code>GALLERY_START_BY_MATCH = 1;</code>
     */
    public static final int GALLERY_START_BY_MATCH_VALUE = 1;
    /**
     * <code>GALLERY_START_BY_DRAFT = 2;</code>
     */
    public static final int GALLERY_START_BY_DRAFT_VALUE = 2;


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
    public static GalleryStartSource valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GalleryStartSource forNumber(int value) {
      switch (value) {
        case 0: return GALLERY_START_BY_NONE;
        case 1: return GALLERY_START_BY_MATCH;
        case 2: return GALLERY_START_BY_DRAFT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GalleryStartSource>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GalleryStartSource> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GalleryStartSource>() {
            public GalleryStartSource findValueByNumber(int number) {
              return GalleryStartSource.forNumber(number);
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
      return emu.grasscutter.net.proto.GalleryStartSourceOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GalleryStartSource[] VALUES = values();

    public static GalleryStartSource valueOf(
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

    private GalleryStartSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GalleryStartSource)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GalleryStartSource.proto*g\n\022GallerySta" +
      "rtSource\022\031\n\025GALLERY_START_BY_NONE\020\000\022\032\n\026G" +
      "ALLERY_START_BY_MATCH\020\001\022\032\n\026GALLERY_START" +
      "_BY_DRAFT\020\002B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
