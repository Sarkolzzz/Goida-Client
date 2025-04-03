package cc.goida.features.modules.impl.movement;

import cc.goida.events.impl.EventJump;
import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
import com.google.common.eventbus.Subscribe;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "LongJump",
        desc = "Увеличивает дальность прыжка",
        key = GLFW.GLFW_KEY_P,
        category = Category.Movement
)

public class LongJump extends Module {
    public float increase = 1.21f;

    @Subscribe
    public void onJump(EventJump event) {
        if (event.isJumped() && mc.player != null){
            final Vec3d prevMotion = mc.player.getVelocity();
            Vec3d newMotion = new Vec3d(prevMotion.x * increase, prevMotion.y, prevMotion.z * increase);

            mc.player.setVelocity(newMotion);
        }
    }
}