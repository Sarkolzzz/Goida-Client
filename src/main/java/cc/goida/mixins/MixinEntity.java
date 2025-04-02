package cc.goida.mixins;

import cc.goida.events.impl.EventRotation;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public class MixinEntity {
    @Shadow public float pitch;
    @Shadow public float yaw;

    @Inject(at = @At("HEAD"), method = "updatePositionAndAngles", cancellable = true)
    public void updatePositionAndAngles(CallbackInfo ci) {
        EventRotation e = new EventRotation(yaw, pitch);

        if (e.isCancelled()){
            ci.cancel();
        }

        else {
            e.call();
        }
    }
}