package cc.goida.features.modules.impl.movement;

import cc.goida.events.impl.EventJump;
import cc.goida.features.modules.Category;
import cc.goida.features.modules.Module;
import cc.goida.features.modules.ModuleInfo;
import com.google.common.eventbus.Subscribe;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "HighJump",
        desc = "Увеличивает высоту прыжка",
        key = GLFW.GLFW_KEY_H,
        category = Category.Movement
)

public class HighJump extends Module {

    public float increase = 1.81f;

    @Subscribe
    public void onJump(EventJump event) {
        if (mc.player == null || mc.world == null) return;

        if (event.isJumped()){
            Vec3d prevMotion = mc.player.getVelocity();
            Vec3d newMotion = new Vec3d(prevMotion.getX(), prevMotion.getY() * increase, prevMotion.getZ());

            mc.player.setVelocity(newMotion);
        }
    }
}