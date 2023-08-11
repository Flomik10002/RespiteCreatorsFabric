package flomik.respitecreators;

import flomik.respitecreators.init.ModFluidsRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class RespiteCreatorsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("respitecreators:fluid/rose_hip_jam_still"));
            registry.register(new Identifier("respitecreators:fluid/rose_hip_jam_flow"));
            registry.register(new Identifier("respitecreators:fluid/blazing_chili_still"));
            registry.register(new Identifier("respitecreators:fluid/blazing_chili_flow"));
            registry.register(new Identifier("respitecreators:fluid/tea_curry_still"));
            registry.register(new Identifier("respitecreators:fluid/tea_curry_flow"));
        });

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_PURULENT_TEA, ModFluidsRegister.FLOWING_PURULENT_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xa62530
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_DANDELION_TEA, ModFluidsRegister.FLOWING_DANDELION_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xe6cd6c
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_ROSE_HIP_TEA, ModFluidsRegister.FLOWING_ROSE_HIP_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x86200e
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_BLACK_TEA, ModFluidsRegister.FLOWING_BLACK_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x783e27
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_YELLOW_TEA, ModFluidsRegister.FLOWING_YELLOW_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xab8542
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_GREEN_TEA, ModFluidsRegister.FLOWING_GREEN_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xa1a83c
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_COFFEE, ModFluidsRegister.FLOWING_COFFEE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x321f13
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_LONG_DANDELION_TEA, ModFluidsRegister.FLOWING_LONG_DANDELION_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xe6cd6c
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_LONG_BLACK_TEA, ModFluidsRegister.FLOWING_LONG_BLACK_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x783e27
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_LONG_YELLOW_TEA, ModFluidsRegister.FLOWING_LONG_YELLOW_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xab8542
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_LONG_GREEN_TEA, ModFluidsRegister.FLOWING_LONG_GREEN_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xa1a83c
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_LONG_COFFEE, ModFluidsRegister.FLOWING_LONG_COFFEE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x321f13
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_STRONG_PURULENT_TEA, ModFluidsRegister.FLOWING_STRONG_PURULENT_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xa62530
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_STRONG_ROSE_HIP_TEA, ModFluidsRegister.FLOWING_STRONG_ROSE_HIP_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x86200e
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_STRONG_BLACK_TEA, ModFluidsRegister.FLOWING_STRONG_BLACK_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x783e27
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_STRONG_YELLOW_TEA, ModFluidsRegister.FLOWING_STRONG_YELLOW_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xab8542
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_STRONG_GREEN_TEA, ModFluidsRegister.FLOWING_STRONG_GREEN_TEA, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xa1a83c
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_STRONG_COFFEE, ModFluidsRegister.FLOWING_STRONG_COFFEE, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x321f13
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_ROSE_HIP_JAM, ModFluidsRegister.FLOWING_ROSE_HIP_JAM, new SimpleFluidRenderHandler(
                new Identifier("respitecreators:fluid/rose_hip_jam_still"),
                new Identifier("respitecreators:fluid/rose_hip_jam_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_TEA_CURRY, ModFluidsRegister.FLOWING_TEA_CURRY, new SimpleFluidRenderHandler(
                new Identifier("respitecreators:fluid/tea_curry_still"),
                new Identifier("respitecreators:fluid/tea_curry_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_BLAZING_CHILI, ModFluidsRegister.FLOWING_BLAZING_CHILI, new SimpleFluidRenderHandler(
                new Identifier("respitecreators:fluid/blazing_chili_still"),
                new Identifier("respitecreators:fluid/blazing_chili_flow")
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_PURULENT_TEA, ModFluidsRegister.FLOWING_PURULENT_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_DANDELION_TEA, ModFluidsRegister.FLOWING_DANDELION_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_ROSE_HIP_TEA, ModFluidsRegister.FLOWING_ROSE_HIP_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_BLACK_TEA, ModFluidsRegister.FLOWING_BLACK_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_YELLOW_TEA, ModFluidsRegister.FLOWING_YELLOW_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_GREEN_TEA, ModFluidsRegister.FLOWING_GREEN_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_COFFEE, ModFluidsRegister.FLOWING_COFFEE);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_LONG_DANDELION_TEA, ModFluidsRegister.FLOWING_LONG_DANDELION_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_LONG_BLACK_TEA, ModFluidsRegister.FLOWING_LONG_BLACK_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_LONG_YELLOW_TEA, ModFluidsRegister.FLOWING_LONG_YELLOW_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_LONG_GREEN_TEA, ModFluidsRegister.FLOWING_LONG_GREEN_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_LONG_COFFEE, ModFluidsRegister.FLOWING_LONG_COFFEE);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_STRONG_PURULENT_TEA, ModFluidsRegister.FLOWING_STRONG_PURULENT_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_STRONG_ROSE_HIP_TEA, ModFluidsRegister.FLOWING_STRONG_ROSE_HIP_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_STRONG_BLACK_TEA, ModFluidsRegister.FLOWING_STRONG_BLACK_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_STRONG_YELLOW_TEA, ModFluidsRegister.FLOWING_STRONG_YELLOW_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_STRONG_GREEN_TEA, ModFluidsRegister.FLOWING_STRONG_GREEN_TEA);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_STRONG_COFFEE, ModFluidsRegister.FLOWING_STRONG_COFFEE);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_ROSE_HIP_JAM, ModFluidsRegister.FLOWING_ROSE_HIP_JAM);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.FLOWING_BLAZING_CHILI, ModFluidsRegister.FLOWING_BLAZING_CHILI);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_TEA_CURRY, ModFluidsRegister.FLOWING_TEA_CURRY);
    }
}