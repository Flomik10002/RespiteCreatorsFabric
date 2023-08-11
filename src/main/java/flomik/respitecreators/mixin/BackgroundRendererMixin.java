package flomik.respitecreators.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import flomik.respitecreators.init.ModFluidsRegister;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;

@Environment(EnvType.CLIENT)
@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin {
    @Shadow
    private static float red;

    @Shadow
    private static float green;

    @Shadow
    private static float blue;

    @ModifyArgs(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V", remap = false))
    private static void respitecreators$modifyFogColors(Args args, Camera camera, float partialTicks, ClientWorld level, int renderDistanceChunks, float bossColorModifier) {
        FluidState state = level.getFluidState(camera.getBlockPos());
        if (ModFluidsRegister.isCoffee(state)) {
            red = (float) 78 / 255;
            green = (float) 46 / 255;
            blue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isPurulentTea(state)) {
            red = (float) 166 / 255;
            green = (float) 37 / 255;
            blue = (float) 48 / 255;
        }
        if (ModFluidsRegister.isDandelionTea(state)) {
            red = (float) 230 / 255;
            green = (float) 205 / 255;
            blue = (float) 108 / 255;
        }
        if (ModFluidsRegister.isRoseHipTea(state)) {
            red = (float) 134 / 255;
            green = (float) 32 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluidsRegister.isBlackTea(state)) {
            red = (float) 78 / 255;
            green = (float) 46 / 255;
            blue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isGreenTea(state)) {
            red = (float) 161 / 255;
            green = (float) 168 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluidsRegister.isYellowTea(state)) {
            red = (float) 171 / 255;
            green = (float) 133 / 255;
            blue = (float) 66 / 255;
        }if (ModFluidsRegister.isLongCoffee(state)) {
            red = (float) 78 / 255;
            green = (float) 46 / 255;
            blue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isLongDandelionTea(state)) {
            red = (float) 230 / 255;
            green = (float) 205 / 255;
            blue = (float) 108 / 255;
        }
        if (ModFluidsRegister.isLongBlackTea(state)) {
            red = (float) 78 / 255;
            green = (float) 46 / 255;
            blue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isLongGreenTea(state)) {
            red = (float) 161 / 255;
            green = (float) 168 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluidsRegister.isLongYellowTea(state)) {
            red = (float) 171 / 255;
            green = (float) 133 / 255;
            blue = (float) 66 / 255;
        }
        if (ModFluidsRegister.isStrongCoffee(state)) {
            red = (float) 78 / 255;
            green = (float) 46 / 255;
            blue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isStrongPurulentTea(state)) {
            red = (float) 166 / 255;
            green = (float) 37 / 255;
            blue = (float) 48 / 255;
        }
        if (ModFluidsRegister.isStrongRoseHipTea(state)) {
            red = (float) 134 / 255;
            green = (float) 32 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluidsRegister.isStrongBlackTea(state)) {
            red = (float) 78 / 255;
            green = (float) 46 / 255;
            blue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isStrongGreenTea(state)) {
            red = (float) 161 / 255;
            green = (float) 168 / 255;
            blue = (float) 60 / 255;
        }
        if (ModFluidsRegister.isStrongYellowTea(state)) {
            red = (float) 171 / 255;
            green = (float) 133 / 255;
            blue = (float) 66 / 255;
        }
        if (ModFluidsRegister.isRoseHipJam(state)) {
            red = (float) 134 / 255;
            green = (float) 32 / 255;
            blue = (float) 14 / 255;
        }
        if (ModFluidsRegister.isBlazingChili(state)) {
            red = (float) 135 / 255;
            green = (float) 36 / 255;
            blue = (float) 35 / 255;
        }
        if (ModFluidsRegister.isTeaCurry(state)) {
            red = (float) 126 / 255;
            green = (float) 84 / 255;
            blue = (float) 45 / 255;
        }
    }

    @Inject(method = "applyFog", at = @At("HEAD"), cancellable = true)
    private static void respitecreators$applyFog(Camera camera, FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        assert MinecraftClient.getInstance().world != null;
        FluidState state = MinecraftClient.getInstance().world.getFluidState(camera.getBlockPos());
        if (ModFluidsRegister.isTeaCurry(state)) {
            RenderSystem.setShaderFogStart(-8);
            RenderSystem.setShaderFogEnd(5);
            ci.cancel();
        }
        if (ModFluidsRegister.isBlazingChili(state)) {
            RenderSystem.setShaderFogStart(-8);
            RenderSystem.setShaderFogEnd(5);
            ci.cancel();
        }
    }
}