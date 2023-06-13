package emu.grasscutter.game.quest.enums.guide;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum QuestGuideType {
    QUEST_GUIDE_NONE(0),
    QUEST_GUIDE_LOCATION(1),
    QUEST_GUIDE_NPC(2),
    QUEST_GUIDE_GADGET(3),
    QUEST_GUIDE_SHOW_OR_HIDE_NPC(4),
    QUEST_GUIDE_DUNGEON_ENTRY(5);

    private final int value;

}
