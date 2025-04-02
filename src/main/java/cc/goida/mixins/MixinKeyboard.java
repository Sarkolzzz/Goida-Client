package cc.goida.mixins;

import cc.goida.events.impl.EventKey;
import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Keyboard.class)
public class MixinKeyboard {
    @Inject(at = @At("HEAD"), method = "onKey")
    private void onKey(long window, int key, int scancode, int i, int modifiers, CallbackInfo ci) {
        new EventKey(key, i).call();
    }
}
