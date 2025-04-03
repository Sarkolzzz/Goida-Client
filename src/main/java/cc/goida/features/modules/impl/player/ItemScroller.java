package cc.goida.features.modules.impl.player;

import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "ItemScroller",
        desc = "Увеличивает скорость перекладывания предметов",
        key = GLFW.GLFW_KEY_O,
        category = Category.Player
)

public class ItemScroller extends Module {

    @Override
    public void onEnable(){
        super.onEnable();
    }
}
