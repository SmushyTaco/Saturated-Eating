package com.smushytaco.saturated_eating.mixin;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.smushytaco.saturated_eating.SaturatedEating;
import net.minecraft.world.food.FoodData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
@Mixin(FoodData.class)
public abstract class HungerTweaks {
    @Shadow
    private float saturationLevel;
    @ModifyReturnValue(method = "needsFood", at = @At("RETURN"))
    private boolean hookIsNotFull(boolean original) { return SaturatedEating.INSTANCE.getConfig().getEnableSaturatedEating() ? original || saturationLevel < 20.0F : original; }
}