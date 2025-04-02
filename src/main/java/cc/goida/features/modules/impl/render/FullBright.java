package cc.goida.features.modules.impl.render;

import cc.goida.features.modules.Category;
import cc.goida.features.modules.Module;
import cc.goida.features.modules.ModuleInfo;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "FullBright",
        desc = "Увеличивает яркость",
        key = GLFW.GLFW_KEY_J,
        category = Category.Render
)

public class FullBright extends Module {
    //not works
    //fix black in mixin entityrenderer
}