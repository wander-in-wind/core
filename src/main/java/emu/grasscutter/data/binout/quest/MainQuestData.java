package emu.grasscutter.data.binout.quest;

import dev.morphia.annotations.Entity;
import emu.grasscutter.game.props.ActivityType;
import emu.grasscutter.game.quest.enums.QuestType;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Getter
public class MainQuestData {
    private int id;
    private int collectionId;
    private int series;
    private QuestType type;
    private boolean enabled;
    private String luaPath;
    private int recommendLevel;
    private boolean repeatable;
    private int[] rewardIdList;
    private int chapterId;
    private QuestData[] subQuests;
    private int eventId;
    private int associateActivity;
    private ActivityType activityType;
    private long videoKey;

    //From client-side dumps
    private long titleTextMapHash;
    private int[] suggestTrackMainQuestList;
    private List<TalkData> talks;
    private long[] preloadLuaList;


    public void onLoad() {
        this.talks = talks.stream().filter(Objects::nonNull).toList();
    }

    @Data @Entity
    public static class TalkData {
        private int id;
        private String heroTalk;

        public TalkData() {}
        public TalkData(int id, String heroTalk) {
            this.id = id;
            this.heroTalk = heroTalk;
        }
    }
}
