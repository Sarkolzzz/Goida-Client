package cc.goida.features.modules.impl.misc;

import cc.goida.events.impl.EventScreen;
import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
import com.google.common.eventbus.Subscribe;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "AutoRespawn",
        desc = "Автоматически возрождает вас после смерти.",
        category = Category.Misc,
        key = GLFW.GLFW_KEY_J
)

public class AutoRespawn extends Module {

    @Subscribe
    public void onScreen(EventScreen event) {
        if (event.getScreen() instanceof DeathScreen) {
            assert mc.player != null;
            mc.player.closeScreen();
            mc.player.networkHandler.sendPacket(new PlayerRespawnS2CPacket());
        }
    }
}
