package cc.goida.features.modules.impl.movement;

import cc.goida.events.impl.EventUpdate;
import cc.goida.features.modules.Category;
import cc.goida.features.modules.Module;
import cc.goida.features.modules.ModuleInfo;
import com.google.common.eventbus.Subscribe;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "Speed",
        desc = "Ускоряет игрока",
        key = GLFW.GLFW_KEY_V,
        category = Category.Movement
)

public class Speed extends Module {
    public float increase = 1.84f;
    final Vec3d prevMotion;

    {
        assert mc.player != null;
        prevMotion = mc.player.getVelocity();
    }

    @Subscribe
    public void onUpdate(EventUpdate event) {
        if (mc.player == null || mc.world == null) return;
        Vec3d newMotion = new Vec3d(prevMotion.x * increase, prevMotion.y, prevMotion.z * increase);

        mc.player.setVelocity(newMotion);
    }
}
