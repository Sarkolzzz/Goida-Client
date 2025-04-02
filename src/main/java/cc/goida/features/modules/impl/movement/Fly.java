package cc.goida.features.modules.impl.movement;

import cc.goida.features.modules.Category;
import cc.goida.features.modules.Module;
import cc.goida.features.modules.ModuleInfo;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "Fly",
        desc = "Позволяет игроку летать",
        key = GLFW.GLFW_KEY_R,
        category = Category.Movement
)

public class Fly extends Module {

    @Override
    public void onEnable() {
        super.onEnable();
        mc.player.abilities.allowFlying = true;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        mc.player.abilities.allowFlying = false;
    }
}