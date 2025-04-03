package cc.goida.features.modules.impl.player;

import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "AutoLeave",
        desc = "Автоматически ливает от игроков в зоне видимости",
        category = Category.Player,
        key = GLFW.GLFW_KEY_Z
)

public class AutoLeave extends Module {

}
