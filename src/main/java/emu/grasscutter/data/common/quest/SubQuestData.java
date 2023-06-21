package emu.grasscutter.data.common.quest;

import emu.grasscutter.game.quest.enums.*;
import emu.grasscutter.game.quest.enums.guide.Guide;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.val;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

@Data
public class SubQuestData {
    private int subId;
    private int mainId;
    private int order;


    private boolean isMpBlock;
    private boolean finishParent;
    private boolean isRewind;

    private QuestShowType showType;
    private String luaPath;
    private String versionBegin;
    private String versionEnd;

    private LogicType acceptCondComb;
    private LogicType finishCondComb;
    private LogicType failCondComb;

    private List<QuestAcceptCondition> acceptCond = Collections.emptyList();
    private List<QuestContentCondition> finishCond = Collections.emptyList();
    private List<QuestContentCondition> failCond = Collections.emptyList();

    private List<QuestExecParam> beginExec = Collections.emptyList();
    private List<QuestExecParam> finishExec = Collections.emptyList();
    private List<QuestExecParam> failExec = Collections.emptyList();
    private Guide guide;
    private ShowQuestGuideType showGuide;
    private List<Integer> trialAvatarList = Collections.emptyList();
    private List<Integer> exclusiveNpcList = Collections.emptyList();
    private int exclusiveNpcPriority;
    private List<Integer> sharedNpcList = Collections.emptyList();
    private List<Integer> exclusivePlaceList = Collections.emptyList();
    private String loadAbilityGroup;
    private String loadTeamAbilityGroup;
    private int[] coopPointIdList;
    private boolean refreshNonCoopOnly;

    private List<GainItem> gainItems = Collections.emptyList();

    private long descTextMapHash;
    private long stepDescTextMapHash;

    public static String questConditionKey(@Nonnull Enum<?> type, int firstParam, @Nullable String paramsStr) {
        return type.name() + firstParam + (paramsStr != null ? paramsStr : "");
    }

    @Data
    public static class GainItem {
        private int id;
        private int count;
    }

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class QuestExecParam {
        QuestExec type;
        String[] param;
        String count;
    }

    public static class QuestAcceptCondition extends QuestCondition<QuestCond> { }

    public static class QuestContentCondition extends QuestCondition<QuestContent> { }

    @Data
    public static class QuestCondition<TYPE extends Enum<?> & QuestTrigger> {
        private TYPE type;
        private int[] param;
        @Nullable
        private String paramString;
        private int count;

        public String asKey() {
            val param = getParam();
            return questConditionKey(getType(), param != null && param.length > 0 ? getParam()[0] : 0, getParamString());
        }

        public int getParam(int index) {
            //handle null exceptions
            if (param == null || index >= param.length) return 0;
            return param[index];
        }
    }

}
