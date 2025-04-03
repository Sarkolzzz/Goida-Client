package cc.goida.features.modules.impl.movement;

import cc.goida.events.impl.EventEat;
import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
import com.google.common.eventbus.Subscribe;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "NoSlow",
        desc = "Убирает замедление игрока при поедании еды.",
        key = GLFW.GLFW_KEY_X,
        category = Category.Movement
)

public class NoSlow extends Module {

    @Subscribe
    public void onEat(EventEat e){
        e.cancel();
    }
}