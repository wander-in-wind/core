package emu.grasscutter.game.entity.gadget;

import emu.grasscutter.game.entity.EntityGadget;
import emu.grasscutter.game.entity.gadget.worktop.WorktopWorktopOptionHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.grasscutter.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;
import emu.grasscutter.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq;
import emu.grasscutter.net.proto.WorktopInfoOuterClass.WorktopInfo;
import lombok.Getter;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class GadgetWorktop extends GadgetContent {
    @Getter private final Set<Integer> worktopOptions = new CopyOnWriteArraySet<>();
    private WorktopWorktopOptionHandler handler;

    public GadgetWorktop(EntityGadget gadget) {
        super(gadget);
    }


    public void addWorktopOptions(int[] options) {
        Arrays.stream(options).forEach(worktopOptions::add);
    }

    public boolean removeWorktopOption(int option) {
        return worktopOptions.remove(option);
    }

    public boolean onInteract(Player player, GadgetInteractReq req) {
        return false;
    }

    public void onBuildProto(SceneGadgetInfo.Builder gadgetInfo) {
        WorktopInfo worktop = WorktopInfo.newBuilder()
            .addAllOptionList(worktopOptions)
            .build();

        gadgetInfo.setWorktop(worktop);
    }

    //Legacy handler, now only used by legacy Blossom system, not thread-safe
    public void setOnSelectWorktopOptionEvent(WorktopWorktopOptionHandler handler) {
        this.handler = handler;
    }

    //Legacy handler, now only used by legacy Blossom system, not thread-safe
    public boolean onSelectWorktopOption(SelectWorktopOptionReq req) {
        if (this.handler != null) {
            this.handler.onSelectWorktopOption(this, req.getOptionId());
        }
        return false;
    }

}
