// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WIDGET_EXTRA_CD_TYPE.proto

package emu.grasscutter.net.proto;

public final class WIDGETEXTRACDTYPE {
  private WIDGETEXTRACDTYPE() {}
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
   * Obf: NEIEMOHMLEA
   * </pre>
   *
   * Protobuf enum {@code WIDGET_EXTRA_CD_TYPE}
   */
  public enum WIDGET_EXTRA_CD_TYPE
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WIDGET_EXTRA_CD_TYPE_NONE = 0;</code>
     */
    WIDGET_EXTRA_CD_TYPE_NONE(0),
    /**
     * <code>WIDGET_EXTRA_CD_TYPE_E_SKILL_SHARED = 1;</code>
     */
    WIDGET_EXTRA_CD_TYPE_E_SKILL_SHARED(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>WIDGET_EXTRA_CD_TYPE_NONE = 0;</code>
     */
    public static final int WIDGET_EXTRA_CD_TYPE_NONE_VALUE = 0;
    /**
     * <code>WIDGET_EXTRA_CD_TYPE_E_SKILL_SHARED = 1;</code>
     */
    public static final int WIDGET_EXTRA_CD_TYPE_E_SKILL_SHARED_VALUE = 1;


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
    public static WIDGET_EXTRA_CD_TYPE valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WIDGET_EXTRA_CD_TYPE forNumber(int value) {
      switch (value) {
        case 0: return WIDGET_EXTRA_CD_TYPE_NONE;
        case 1: return WIDGET_EXTRA_CD_TYPE_E_SKILL_SHARED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WIDGET_EXTRA_CD_TYPE>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WIDGET_EXTRA_CD_TYPE> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WIDGET_EXTRA_CD_TYPE>() {
            public WIDGET_EXTRA_CD_TYPE findValueByNumber(int number) {
              return WIDGET_EXTRA_CD_TYPE.forNumber(number);
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
      return emu.grasscutter.net.proto.WIDGETEXTRACDTYPE.getDescriptor().getEnumTypes().get(0);
    }

    private static final WIDGET_EXTRA_CD_TYPE[] VALUES = values();

    public static WIDGET_EXTRA_CD_TYPE valueOf(
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

    private WIDGET_EXTRA_CD_TYPE(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:WIDGET_EXTRA_CD_TYPE)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032WIDGET_EXTRA_CD_TYPE.proto*^\n\024WIDGET_E" +
      "XTRA_CD_TYPE\022\035\n\031WIDGET_EXTRA_CD_TYPE_NON" +
      "E\020\000\022\'\n#WIDGET_EXTRA_CD_TYPE_E_SKILL_SHAR" +
      "ED\020\001B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
