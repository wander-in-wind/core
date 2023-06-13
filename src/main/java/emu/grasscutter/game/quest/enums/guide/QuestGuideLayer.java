package emu.grasscutter.game.quest.enums.guide;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestGuideLayer {
    QUEST_GUIDE_LAYER_NONE(0),
    QUEST_GUIDE_LAYER_UI(1),
    QUEST_GUIDE_LAYER_SCENE(2);

    private final int value;
}
