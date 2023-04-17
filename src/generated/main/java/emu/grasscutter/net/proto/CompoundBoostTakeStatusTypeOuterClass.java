// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompoundBoostTakeStatusType.proto

package emu.grasscutter.net.proto;

public final class CompoundBoostTakeStatusTypeOuterClass {
  private CompoundBoostTakeStatusTypeOuterClass() {}
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
   * Name: BCHLHMNBPCI
   * </pre>
   *
   * Protobuf enum {@code CompoundBoostTakeStatusType}
   */
  public enum CompoundBoostTakeStatusType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_NONE = 0;</code>
     */
    COMPOUND_BOOST_TAKE_STATUS_NONE(0),
    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_BOOST_ONLY = 1;</code>
     */
    COMPOUND_BOOST_TAKE_STATUS_BOOST_ONLY(1),
    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_BOOST_AND_TAKE = 2;</code>
     */
    COMPOUND_BOOST_TAKE_STATUS_BOOST_AND_TAKE(2),
    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_BAG_FULL = 3;</code>
     */
    COMPOUND_BOOST_TAKE_STATUS_BAG_FULL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_NONE = 0;</code>
     */
    public static final int COMPOUND_BOOST_TAKE_STATUS_NONE_VALUE = 0;
    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_BOOST_ONLY = 1;</code>
     */
    public static final int COMPOUND_BOOST_TAKE_STATUS_BOOST_ONLY_VALUE = 1;
    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_BOOST_AND_TAKE = 2;</code>
     */
    public static final int COMPOUND_BOOST_TAKE_STATUS_BOOST_AND_TAKE_VALUE = 2;
    /**
     * <code>COMPOUND_BOOST_TAKE_STATUS_BAG_FULL = 3;</code>
     */
    public static final int COMPOUND_BOOST_TAKE_STATUS_BAG_FULL_VALUE = 3;


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
    public static CompoundBoostTakeStatusType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CompoundBoostTakeStatusType forNumber(int value) {
      switch (value) {
        case 0: return COMPOUND_BOOST_TAKE_STATUS_NONE;
        case 1: return COMPOUND_BOOST_TAKE_STATUS_BOOST_ONLY;
        case 2: return COMPOUND_BOOST_TAKE_STATUS_BOOST_AND_TAKE;
        case 3: return COMPOUND_BOOST_TAKE_STATUS_BAG_FULL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CompoundBoostTakeStatusType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CompoundBoostTakeStatusType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CompoundBoostTakeStatusType>() {
            public CompoundBoostTakeStatusType findValueByNumber(int number) {
              return CompoundBoostTakeStatusType.forNumber(number);
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
      return emu.grasscutter.net.proto.CompoundBoostTakeStatusTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CompoundBoostTakeStatusType[] VALUES = values();

    public static CompoundBoostTakeStatusType valueOf(
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

    private CompoundBoostTakeStatusType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CompoundBoostTakeStatusType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!CompoundBoostTakeStatusType.proto*\305\001\n\033" +
      "CompoundBoostTakeStatusType\022#\n\037COMPOUND_" +
      "BOOST_TAKE_STATUS_NONE\020\000\022)\n%COMPOUND_BOO" +
      "ST_TAKE_STATUS_BOOST_ONLY\020\001\022-\n)COMPOUND_" +
      "BOOST_TAKE_STATUS_BOOST_AND_TAKE\020\002\022\'\n#CO" +
      "MPOUND_BOOST_TAKE_STATUS_BAG_FULL\020\003B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
