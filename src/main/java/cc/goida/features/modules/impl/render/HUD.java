package cc.goida.features.modules.impl.render;

import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "HUD",
        desc = "",
        category = Category.Render,
        key = GLFW.GLFW_KEY_8
)

public class HUD extends Module {
}
