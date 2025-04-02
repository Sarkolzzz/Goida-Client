package cc.goida.mixins;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
    @Inject(at = @At("HEAD"), method = "areRealmsNotificationsEnabled", cancellable = true)
    private void areRealmsNotificationsEnabled(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
