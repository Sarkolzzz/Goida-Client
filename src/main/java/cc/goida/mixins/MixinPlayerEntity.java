package cc.goida.mixins;

import cc.goida.events.impl.EventEat;
import cc.goida.events.impl.EventJump;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.CancellationException;

@Mixin(PlayerEntity.class)
public class MixinPlayerEntity {
    @Inject(at = @At("HEAD"), method = "jump")
    public void jump(CallbackInfo ci) {
        new EventJump(true).call();
    }

    @Inject(at = @At("HEAD"), method = "eatFood")
    public void eatFood(World world, ItemStack stack, CallbackInfoReturnable<ItemStack> cir) throws CancellationException {
        EventEat eventEat = new EventEat();

        if (eventEat.isCancelled()){
            cir.cancel();
        }

        else {
            eventEat.call();
        }
    }
}