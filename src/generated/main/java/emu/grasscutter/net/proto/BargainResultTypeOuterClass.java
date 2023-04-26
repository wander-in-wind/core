// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainResultType.proto

package emu.grasscutter.net.proto;

public final class BargainResultTypeOuterClass {
  private BargainResultTypeOuterClass() {}
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
   * Name: PLIOPEDCBDE
   * </pre>
   *
   * Protobuf enum {@code BargainResultType}
   */
  public enum BargainResultType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BARGAIN_COMPLETE_SUCC = 0;</code>
     */
    BARGAIN_COMPLETE_SUCC(0),
    /**
     * <code>BARGAIN_SINGLE_FAIL = 1;</code>
     */
    BARGAIN_SINGLE_FAIL(1),
    /**
     * <code>BARGAIN_COMPLETE_FAIL = 2;</code>
     */
    BARGAIN_COMPLETE_FAIL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BARGAIN_COMPLETE_SUCC = 0;</code>
     */
    public static final int BARGAIN_COMPLETE_SUCC_VALUE = 0;
    /**
     * <code>BARGAIN_SINGLE_FAIL = 1;</code>
     */
    public static final int BARGAIN_SINGLE_FAIL_VALUE = 1;
    /**
     * <code>BARGAIN_COMPLETE_FAIL = 2;</code>
     */
    public static final int BARGAIN_COMPLETE_FAIL_VALUE = 2;


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
    public static BargainResultType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BargainResultType forNumber(int value) {
      switch (value) {
        case 0: return BARGAIN_COMPLETE_SUCC;
        case 1: return BARGAIN_SINGLE_FAIL;
        case 2: return BARGAIN_COMPLETE_FAIL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BargainResultType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BargainResultType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BargainResultType>() {
            public BargainResultType findValueByNumber(int number) {
              return BargainResultType.forNumber(number);
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
      return emu.grasscutter.net.proto.BargainResultTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final BargainResultType[] VALUES = values();

    public static BargainResultType valueOf(
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

    private BargainResultType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:BargainResultType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BargainResultType.proto*b\n\021BargainResu" +
      "ltType\022\031\n\025BARGAIN_COMPLETE_SUCC\020\000\022\027\n\023BAR" +
      "GAIN_SINGLE_FAIL\020\001\022\031\n\025BARGAIN_COMPLETE_F" +
      "AIL\020\002B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
