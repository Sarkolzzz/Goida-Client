package cc.goida.features.modules.impl.movement;

import cc.goida.events.impl.EventUpdate;
import cc.goida.features.modules.api.Category;
import cc.goida.features.modules.api.Module;
import cc.goida.features.modules.api.ModuleInfo;
import cc.goida.features.modules.settings.ModeSetting;
import com.google.common.eventbus.Subscribe;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.SnowBlock;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
        name = "Speed",
        desc = "Ускоряет игрока",
        key = GLFW.GLFW_KEY_V,
        category = Category.Movement
)

public class Speed extends Module {
    public float increase = 1.5f;
    private final ModeSetting mode = new ModeSetting("Обход", "Vanilla", "Vanilla", "FunTime snow");

    @Subscribe
    public void onUpdate(EventUpdate event) {
        if (mc.player != null && mc.world != null) {
//            switch (mode.getIndex()){
//                case 0 -> vanillaMode();
//                case 1 -> funTimeMode();
//                case 2 -> collisionMode();
//            }

            funTimeMode();
        }
    }

    public void vanillaMode(){
        if (mc.player.isOnGround()){
            mc.player.setVelocity(mc.player.getVelocity().x * increase, mc.player.getVelocity().y, mc.player.getVelocity().z * increase);
        }
    }

    public void funTimeMode(){
        if (mc.world.getBlockState(mc.player.getBlockPos()).getBlock() instanceof SnowBlock
                || mc.world.getBlockState(mc.player.getBlockPos()).getBlock() instanceof CarpetBlock){
            mc.player.setVelocity(mc.player.getVelocity().x * 1.4, mc.player.getVelocity().y, mc.player.getVelocity().z * 1.4);
        }
    }

    public void collisionMode(){
        for (Entity entity : mc.world.getEntities()){
            if (entity == mc.player) return;
            if (mc.player.collidesWith(entity)){
                mc.player.setVelocity(mc.player.getVelocity().x * increase, mc.player.getVelocity().y, mc.player.getVelocity().z * increase);
            }
        }
    }
}