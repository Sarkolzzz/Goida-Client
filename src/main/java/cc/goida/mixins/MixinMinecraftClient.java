package cc.goida.mixins;

import cc.goida.events.impl.EventScreen;
import cc.goida.events.impl.EventUpdate;
import cc.goida.utils.client.Imports;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient implements Imports {
    @Inject(at = @At("HEAD"), method = "isMultiplayerEnabled", cancellable = true)
    public void isMultiplayerEnabled(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOnlineChatEnabled", cancellable = true)
    public void isOnlineChatEnabled(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick")
    public void tick(CallbackInfo ci) {
        new EventUpdate().call();
    }

    @Inject(at = @At("HEAD"), method = "openScreen")
    public void openScreen(CallbackInfo ci) {
        Screen screen;

        if (mc.currentScreen != null) {
            screen = mc.currentScreen;
            new EventScreen(screen, screen.getTitle()).call();
        }
    }

    @Inject(at = @At("HEAD"), method = "isDemo", cancellable = true)
    public void isDemo(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
