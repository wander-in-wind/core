package emu.grasscutter.data.common.quest;

import dev.morphia.annotations.Entity;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.game.quest.enums.PlayMode;
import emu.grasscutter.game.quest.enums.QuestShowType;
import emu.grasscutter.game.quest.enums.QuestType;
import lombok.Data;
import java.util.List;
import java.util.Objects;

@Data
public class MainQuestData {
    private int id;
    private int collectionId;
    private int series;
    private int chapterId;
    private QuestType taskType;
    private String luaPath;
    private int recommendedLevel;
    private QuestShowType showType;
    private boolean repeatable;
    private int activityId;
    private ActivityType activityType;
    private String mainQuestTag;
    private PlayMode activeMode;
    private boolean showRedPoint;
    private int eventId;
    private long videoKey;



    private boolean suggestTrackOutOfOrder;
    private int[] suggestTrackMainQuestList;
    private int[] rewardIdList;

    private SubQuestData[] subQuests;
    private List<TalkData> talks;
    private long[] preloadLuaList;

    private long titleTextMapHash;


    public void onLoad() {
        this.talks = talks.stream().filter(Objects::nonNull).toList();
    }


    @Data @Entity
    public static class TalkData {
        private int id;
        private String heroTalk;

        public TalkData(int id, String heroTalk) {
            this.id = id;
            this.heroTalk = heroTalk;
        }
    }
}
