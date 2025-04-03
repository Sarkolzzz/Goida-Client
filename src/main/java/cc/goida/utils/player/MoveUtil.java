package cc.goida.utils.player;

import cc.goida.utils.client.Imports;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MoveUtil implements Imports {
    public boolean isMoving(){
        if (mc.player == null || mc.world == null) return false;
        boolean isPressed = mc.options.keyLeft.isPressed()
                || mc.options.keyRight.isPressed()
                || mc.options.keyForward.isPressed()
                || mc.options.keyBack.isPressed();

        return isPressed;
    }
}
