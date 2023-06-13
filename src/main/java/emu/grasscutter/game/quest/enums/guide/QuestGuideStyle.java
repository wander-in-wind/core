package emu.grasscutter.game.quest.enums.guide;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestGuideStyle {
    QUEST_GUIDE_STYLE_NONE(0),
    QUEST_GUIDE_STYLE_START(1),
    QUEST_GUIDE_STYLE_TARGET(2),
    QUEST_GUIDE_STYLE_FINISH(3),
    QUEST_GUIDE_STYLE_POINT(4);

    private final int value;
}
