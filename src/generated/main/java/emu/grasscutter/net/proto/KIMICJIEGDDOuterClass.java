// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KIMICJIEGDD.proto

package emu.grasscutter.net.proto;

public final class KIMICJIEGDDOuterClass {
  private KIMICJIEGDDOuterClass() {}
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
   * Name: KIMICJIEGDD
   * </pre>
   *
   * Protobuf enum {@code KIMICJIEGDD}
   */
  public enum KIMICJIEGDD
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>KIMICJIEGDD_LMDBDNDIJJL = 0;</code>
     */
    KIMICJIEGDD_LMDBDNDIJJL(0),
    /**
     * <code>KIMICJIEGDD_MPCLKLBEAPK = 1;</code>
     */
    KIMICJIEGDD_MPCLKLBEAPK(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>KIMICJIEGDD_LMDBDNDIJJL = 0;</code>
     */
    public static final int KIMICJIEGDD_LMDBDNDIJJL_VALUE = 0;
    /**
     * <code>KIMICJIEGDD_MPCLKLBEAPK = 1;</code>
     */
    public static final int KIMICJIEGDD_MPCLKLBEAPK_VALUE = 1;


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
    public static KIMICJIEGDD valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KIMICJIEGDD forNumber(int value) {
      switch (value) {
        case 0: return KIMICJIEGDD_LMDBDNDIJJL;
        case 1: return KIMICJIEGDD_MPCLKLBEAPK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KIMICJIEGDD>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KIMICJIEGDD> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KIMICJIEGDD>() {
            public KIMICJIEGDD findValueByNumber(int number) {
              return KIMICJIEGDD.forNumber(number);
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
      return emu.grasscutter.net.proto.KIMICJIEGDDOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final KIMICJIEGDD[] VALUES = values();

    public static KIMICJIEGDD valueOf(
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

    private KIMICJIEGDD(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:KIMICJIEGDD)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KIMICJIEGDD.proto*G\n\013KIMICJIEGDD\022\033\n\027KI" +
      "MICJIEGDD_LMDBDNDIJJL\020\000\022\033\n\027KIMICJIEGDD_M" +
      "PCLKLBEAPK\020\001B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}