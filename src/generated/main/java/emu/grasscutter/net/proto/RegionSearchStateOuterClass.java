// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegionSearchState.proto

package emu.grasscutter.net.proto;

public final class RegionSearchStateOuterClass {
  private RegionSearchStateOuterClass() {}
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
   * Name: IMOCPNKHOFP
   * </pre>
   *
   * Protobuf enum {@code RegionSearchState}
   */
  public enum RegionSearchState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>REGION_SEARCH_NONE = 0;</code>
     */
    REGION_SEARCH_NONE(0),
    /**
     * <code>REGION_SEARCH_UNSTARTED = 1;</code>
     */
    REGION_SEARCH_UNSTARTED(1),
    /**
     * <code>REGION_SEARCH_STARTED = 2;</code>
     */
    REGION_SEARCH_STARTED(2),
    /**
     * <code>REGION_SEARCH_WAIT_REWARD = 3;</code>
     */
    REGION_SEARCH_WAIT_REWARD(3),
    /**
     * <code>REGION_SEARCH_FINISHED = 4;</code>
     */
    REGION_SEARCH_FINISHED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>REGION_SEARCH_NONE = 0;</code>
     */
    public static final int REGION_SEARCH_NONE_VALUE = 0;
    /**
     * <code>REGION_SEARCH_UNSTARTED = 1;</code>
     */
    public static final int REGION_SEARCH_UNSTARTED_VALUE = 1;
    /**
     * <code>REGION_SEARCH_STARTED = 2;</code>
     */
    public static final int REGION_SEARCH_STARTED_VALUE = 2;
    /**
     * <code>REGION_SEARCH_WAIT_REWARD = 3;</code>
     */
    public static final int REGION_SEARCH_WAIT_REWARD_VALUE = 3;
    /**
     * <code>REGION_SEARCH_FINISHED = 4;</code>
     */
    public static final int REGION_SEARCH_FINISHED_VALUE = 4;


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
    public static RegionSearchState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RegionSearchState forNumber(int value) {
      switch (value) {
        case 0: return REGION_SEARCH_NONE;
        case 1: return REGION_SEARCH_UNSTARTED;
        case 2: return REGION_SEARCH_STARTED;
        case 3: return REGION_SEARCH_WAIT_REWARD;
        case 4: return REGION_SEARCH_FINISHED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RegionSearchState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RegionSearchState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RegionSearchState>() {
            public RegionSearchState findValueByNumber(int number) {
              return RegionSearchState.forNumber(number);
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
      return emu.grasscutter.net.proto.RegionSearchStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final RegionSearchState[] VALUES = values();

    public static RegionSearchState valueOf(
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

    private RegionSearchState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RegionSearchState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027RegionSearchState.proto*\236\001\n\021RegionSear" +
      "chState\022\026\n\022REGION_SEARCH_NONE\020\000\022\033\n\027REGIO" +
      "N_SEARCH_UNSTARTED\020\001\022\031\n\025REGION_SEARCH_ST" +
      "ARTED\020\002\022\035\n\031REGION_SEARCH_WAIT_REWARD\020\003\022\032" +
      "\n\026REGION_SEARCH_FINISHED\020\004B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
