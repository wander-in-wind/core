package emu.grasscutter.game.quest.handlers;

import emu.grasscutter.data.binout.quest.QuestData;
import emu.grasscutter.game.quest.GameQuest;

public abstract class QuestExecHandler {

	public abstract boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr);

}
