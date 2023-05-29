package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.quest.enums.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

@ResourceType(name = "QuestExcelConfigData.json")
@Getter
@ToString
public class QuestData extends GameResource {
    @Getter private int subId;
    @Getter private int mainId;
    @Getter private int order;
    @Getter private long descTextMapHash;

    @Getter private boolean finishParent;
    @Getter private boolean isRewind;

    @Getter private LogicType acceptCondComb;
    @Getter private LogicType finishCondComb;
    @Getter private LogicType failCondComb;

    @Getter private List<QuestAcceptCondition> acceptCond;
    @Getter private List<QuestContentCondition> finishCond;
    @Getter private List<QuestContentCondition> failCond;
    @Getter private List<QuestExecParam> beginExec;
    @Getter private List<QuestExecParam> finishExec;
    @Getter private List<QuestExecParam> failExec;
    @Getter private Guide guide;
    @Getter private List<Integer> trialAvatarList;

    public static String questConditionKey(@Nonnull Enum<?> type, int firstParam, @Nullable String paramsStr) {
        return type.name() + firstParam + (paramsStr != null ? paramsStr : "");
    }

    //ResourceLoader not happy if you remove getId() ~~
    public int getId() {
        return subId;
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
            return questConditionKey(getType(), param!=null && param.length>0 ? getParam()[0] : 0, getParamString());
        }
    }

    @Data
    public static class Guide {
        private String type;
        private List<String> param;
        private int guideScene;
    }
}
