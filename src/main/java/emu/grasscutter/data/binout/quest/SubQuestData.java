package emu.grasscutter.data.binout.quest;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.enums.LogicType;
import emu.grasscutter.game.quest.enums.QuestShowType;
import lombok.Data;

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

    private List<QuestData.QuestAcceptCondition> acceptCond;
    private List<QuestData.QuestContentCondition> finishCond;
    private List<QuestData.QuestContentCondition> failCond;

    private List<QuestData.QuestExecParam> beginExec;
    private List<QuestData.QuestExecParam> finishExec;
    private List<QuestData.QuestExecParam> failExec;
    private QuestData.Guide guide;
    private List<Integer> trialAvatarList;
    private List<Integer> exclusiveNpcList;
    private int exclusiveNpcPriority;
    private List<Integer> sharedNpcList;
    private List<Integer> exclusivePlaceList;

    private List<GainItem> gainItems;

    private long descTextMapHash;
    private long stepDescTextMapHash;

    @Data
    public static class GainItem {
        private int itemId;
        private int count;
    }
}
