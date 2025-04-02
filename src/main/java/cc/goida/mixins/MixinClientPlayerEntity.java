package cc.goida.mixins;

import cc.goida.events.impl.EventChat;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public class MixinClientPlayerEntity {
    @Inject(at = @At("HEAD"), method = "sendChatMessage", cancellable = true)
    public void sendChatMessage(String message, CallbackInfo ci) {
        EventChat event = new EventChat(message);

        if (event.isCancelled()) {
            ci.cancel();
        }

        else {
            event.call();
        }
    }
}