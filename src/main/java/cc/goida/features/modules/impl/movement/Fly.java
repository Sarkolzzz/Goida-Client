package cc.goida.features.modules.impl.movement;

import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
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
        mc.player.abilities.allowFlying = true;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        mc.player.abilities.allowFlying = false;
        super.onDisable();
    }
}