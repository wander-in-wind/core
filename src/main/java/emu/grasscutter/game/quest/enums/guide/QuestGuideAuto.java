package emu.grasscutter.game.quest.enums.guide;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestGuideAuto {
    QUEST_GUIDE_AUTO_NONE(0),
    QUEST_GUIDE_AUTO_ENABLE(1),
    QUEST_GUIDE_AUTO_DISABLE(2);


    private final int value;

}
