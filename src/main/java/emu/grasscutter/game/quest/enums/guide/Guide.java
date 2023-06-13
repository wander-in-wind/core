package emu.grasscutter.game.quest.enums.guide;

import lombok.Data;

import java.util.List;

@Data
public class Guide {
    private QuestGuideType type;
    private List<String> param;
    private int guideScene;
    private QuestGuideAuto autoGuide;
    private QuestGuideStyle guideStyle;
    private QuestGuideLayer guideLayer;
}
