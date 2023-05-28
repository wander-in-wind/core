// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetUgcType.proto

package emu.grasscutter.net.proto;

public final class GetUgcTypeOuterClass {
  private GetUgcTypeOuterClass() {}
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
   * Obf: JMLGMJCMHIG
   * </pre>
   *
   * Protobuf enum {@code GetUgcType}
   */
  public enum GetUgcType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GET_UGC_NONE = 0;</code>
     */
    GET_UGC_NONE(0),
    /**
     * <code>GET_UGC_TYPE_MINE = 1;</code>
     */
    GET_UGC_TYPE_MINE(1),
    /**
     * <code>GET_UGC_TYPE_PUBLISH = 2;</code>
     */
    GET_UGC_TYPE_PUBLISH(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GET_UGC_NONE = 0;</code>
     */
    public static final int GET_UGC_NONE_VALUE = 0;
    /**
     * <code>GET_UGC_TYPE_MINE = 1;</code>
     */
    public static final int GET_UGC_TYPE_MINE_VALUE = 1;
    /**
     * <code>GET_UGC_TYPE_PUBLISH = 2;</code>
     */
    public static final int GET_UGC_TYPE_PUBLISH_VALUE = 2;


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
    public static GetUgcType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GetUgcType forNumber(int value) {
      switch (value) {
        case 0: return GET_UGC_NONE;
        case 1: return GET_UGC_TYPE_MINE;
        case 2: return GET_UGC_TYPE_PUBLISH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GetUgcType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GetUgcType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GetUgcType>() {
            public GetUgcType findValueByNumber(int number) {
              return GetUgcType.forNumber(number);
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
      return emu.grasscutter.net.proto.GetUgcTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GetUgcType[] VALUES = values();

    public static GetUgcType valueOf(
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

    private GetUgcType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GetUgcType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020GetUgcType.proto*O\n\nGetUgcType\022\020\n\014GET_" +
      "UGC_NONE\020\000\022\025\n\021GET_UGC_TYPE_MINE\020\001\022\030\n\024GET" +
      "_UGC_TYPE_PUBLISH\020\002B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
