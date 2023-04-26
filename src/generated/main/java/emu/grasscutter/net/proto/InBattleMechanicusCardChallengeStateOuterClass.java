// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusCardChallengeState.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusCardChallengeStateOuterClass {
  private InBattleMechanicusCardChallengeStateOuterClass() {}
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
   * Name: DOHJEAKEOKE
   * </pre>
   *
   * Protobuf enum {@code InBattleMechanicusCardChallengeState}
   */
  public enum InBattleMechanicusCardChallengeState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_NONE = 0;</code>
     */
    IN_BATTLE_MECHANICUS_CARD_CHALLENGE_NONE(0),
    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_ON_GOING = 1;</code>
     */
    IN_BATTLE_MECHANICUS_CARD_CHALLENGE_ON_GOING(1),
    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_FAIL = 2;</code>
     */
    IN_BATTLE_MECHANICUS_CARD_CHALLENGE_FAIL(2),
    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_SUCCESS = 3;</code>
     */
    IN_BATTLE_MECHANICUS_CARD_CHALLENGE_SUCCESS(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_NONE = 0;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_CARD_CHALLENGE_NONE_VALUE = 0;
    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_ON_GOING = 1;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_CARD_CHALLENGE_ON_GOING_VALUE = 1;
    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_FAIL = 2;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_CARD_CHALLENGE_FAIL_VALUE = 2;
    /**
     * <code>IN_BATTLE_MECHANICUS_CARD_CHALLENGE_SUCCESS = 3;</code>
     */
    public static final int IN_BATTLE_MECHANICUS_CARD_CHALLENGE_SUCCESS_VALUE = 3;


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
    public static InBattleMechanicusCardChallengeState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InBattleMechanicusCardChallengeState forNumber(int value) {
      switch (value) {
        case 0: return IN_BATTLE_MECHANICUS_CARD_CHALLENGE_NONE;
        case 1: return IN_BATTLE_MECHANICUS_CARD_CHALLENGE_ON_GOING;
        case 2: return IN_BATTLE_MECHANICUS_CARD_CHALLENGE_FAIL;
        case 3: return IN_BATTLE_MECHANICUS_CARD_CHALLENGE_SUCCESS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InBattleMechanicusCardChallengeState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InBattleMechanicusCardChallengeState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InBattleMechanicusCardChallengeState>() {
            public InBattleMechanicusCardChallengeState findValueByNumber(int number) {
              return InBattleMechanicusCardChallengeState.forNumber(number);
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
      return emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final InBattleMechanicusCardChallengeState[] VALUES = values();

    public static InBattleMechanicusCardChallengeState valueOf(
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

    private InBattleMechanicusCardChallengeState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:InBattleMechanicusCardChallengeState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*InBattleMechanicusCardChallengeState.p" +
      "roto*\345\001\n$InBattleMechanicusCardChallenge" +
      "State\022,\n(IN_BATTLE_MECHANICUS_CARD_CHALL" +
      "ENGE_NONE\020\000\0220\n,IN_BATTLE_MECHANICUS_CARD" +
      "_CHALLENGE_ON_GOING\020\001\022,\n(IN_BATTLE_MECHA" +
      "NICUS_CARD_CHALLENGE_FAIL\020\002\022/\n+IN_BATTLE" +
      "_MECHANICUS_CARD_CHALLENGE_SUCCESS\020\003B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
