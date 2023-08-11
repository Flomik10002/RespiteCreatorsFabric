package flomik.respitecreators.init;

import flomik.respitecreators.RespiteCreatorsMod;
import flomik.respitecreators.fluids.*;
import flomik.respitecreators.item.ModItemsGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluidsRegister {
    public static FlowableFluid STILL_PURULENT_TEA, STILL_DANDELION_TEA, STILL_ROSE_HIP_TEA, STILL_BLACK_TEA, STILL_YELLOW_TEA, STILL_GREEN_TEA, STILL_COFFEE, STILL_LONG_DANDELION_TEA, STILL_LONG_BLACK_TEA, STILL_LONG_YELLOW_TEA, STILL_LONG_GREEN_TEA, STILL_LONG_COFFEE, STILL_STRONG_PURULENT_TEA, STILL_STRONG_ROSE_HIP_TEA, STILL_STRONG_BLACK_TEA, STILL_STRONG_YELLOW_TEA, STILL_STRONG_GREEN_TEA, STILL_STRONG_COFFEE, STILL_ROSE_HIP_JAM, STILL_TEA_CURRY, STILL_BLAZING_CHILI;
    public static FlowableFluid FLOWING_PURULENT_TEA, FLOWING_DANDELION_TEA, FLOWING_ROSE_HIP_TEA, FLOWING_BLACK_TEA, FLOWING_YELLOW_TEA, FLOWING_GREEN_TEA, FLOWING_COFFEE, FLOWING_LONG_DANDELION_TEA, FLOWING_LONG_BLACK_TEA, FLOWING_LONG_YELLOW_TEA, FLOWING_LONG_GREEN_TEA, FLOWING_LONG_COFFEE, FLOWING_STRONG_PURULENT_TEA, FLOWING_STRONG_ROSE_HIP_TEA, FLOWING_STRONG_BLACK_TEA, FLOWING_STRONG_YELLOW_TEA, FLOWING_STRONG_GREEN_TEA, FLOWING_STRONG_COFFEE, FLOWING_ROSE_HIP_JAM, FLOWING_TEA_CURRY, FLOWING_BLAZING_CHILI;
    public static Block PURULENT_TEA_BLOCK, DANDELION_TEA_BLOCK, ROSE_HIP_TEA_BLOCK, BLACK_TEA_BLOCK, YELLOW_TEA_BLOCK, GREEN_TEA_BLOCK, COFFEE_BLOCK, LONG_DANDELION_TEA_BLOCK, LONG_BLACK_TEA_BLOCK, LONG_YELLOW_TEA_BLOCK, LONG_GREEN_TEA_BLOCK, LONG_COFFEE_BLOCK, STRONG_PURULENT_TEA_BLOCK, STRONG_ROSE_HIP_TEA_BLOCK, STRONG_BLACK_TEA_BLOCK, STRONG_YELLOW_TEA_BLOCK, STRONG_GREEN_TEA_BLOCK, STRONG_COFFEE_BLOCK, ROSE_HIP_JAM_BLOCK, TEA_CURRY_BLOCK, BLAZING_CHILI_BLOCK;
    public static Item PURULENT_TEA_BUCKET, DANDELION_TEA_BUCKET, ROSE_HIP_TEA_BUCKET, BLACK_TEA_BUCKET, YELLOW_TEA_BUCKET, GREEN_TEA_BUCKET, COFFEE_BUCKET, LONG_DANDELION_TEA_BUCKET, LONG_BLACK_TEA_BUCKET, LONG_YELLOW_TEA_BUCKET, LONG_GREEN_TEA_BUCKET, LONG_COFFEE_BUCKET, STRONG_PURULENT_TEA_BUCKET, STRONG_ROSE_HIP_TEA_BUCKET, STRONG_BLACK_TEA_BUCKET, STRONG_YELLOW_TEA_BUCKET, STRONG_GREEN_TEA_BUCKET, STRONG_COFFEE_BUCKET, ROSE_HIP_JAM_BUCKET, TEA_CURRY_BUCKET, BLAZING_CHILI_BUCKET;

    public static boolean isCoffee(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_COFFEE) || state.isOf(ModFluidsRegister.FLOWING_COFFEE);
    }

    public static boolean isPurulentTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_PURULENT_TEA) || state.isOf(ModFluidsRegister.FLOWING_PURULENT_TEA);
    }

    public static boolean isDandelionTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_DANDELION_TEA) || state.isOf(ModFluidsRegister.FLOWING_DANDELION_TEA);
    }

    public static boolean isRoseHipTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_ROSE_HIP_TEA) || state.isOf(ModFluidsRegister.FLOWING_ROSE_HIP_TEA);
    }

    public static boolean isBlackTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_BLACK_TEA) || state.isOf(ModFluidsRegister.FLOWING_BLACK_TEA);
    }

    public static boolean isYellowTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_YELLOW_TEA) || state.isOf(ModFluidsRegister.FLOWING_YELLOW_TEA);
    }

    public static boolean isGreenTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_GREEN_TEA) || state.isOf(ModFluidsRegister.FLOWING_GREEN_TEA);
    }
    public static boolean isLongCoffee(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_LONG_COFFEE) || state.isOf(ModFluidsRegister.FLOWING_LONG_COFFEE);
    }

    public static boolean isLongDandelionTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_LONG_DANDELION_TEA) || state.isOf(ModFluidsRegister.FLOWING_LONG_DANDELION_TEA);
    }

    public static boolean isLongBlackTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_LONG_BLACK_TEA) || state.isOf(ModFluidsRegister.FLOWING_LONG_BLACK_TEA);
    }

    public static boolean isLongYellowTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_LONG_YELLOW_TEA) || state.isOf(ModFluidsRegister.FLOWING_LONG_YELLOW_TEA);
    }

    public static boolean isLongGreenTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_LONG_GREEN_TEA) || state.isOf(ModFluidsRegister.FLOWING_LONG_GREEN_TEA);
    }

    public static boolean isStrongCoffee(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_STRONG_COFFEE) || state.isOf(ModFluidsRegister.FLOWING_STRONG_COFFEE);
    }

    public static boolean isStrongPurulentTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_STRONG_PURULENT_TEA) || state.isOf(ModFluidsRegister.FLOWING_STRONG_PURULENT_TEA);
    }

    public static boolean isStrongRoseHipTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_STRONG_ROSE_HIP_TEA) || state.isOf(ModFluidsRegister.FLOWING_STRONG_ROSE_HIP_TEA);
    }

    public static boolean isStrongBlackTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_STRONG_BLACK_TEA) || state.isOf(ModFluidsRegister.FLOWING_STRONG_BLACK_TEA);
    }

    public static boolean isStrongYellowTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_STRONG_YELLOW_TEA) || state.isOf(ModFluidsRegister.FLOWING_STRONG_YELLOW_TEA);
    }

    public static boolean isStrongGreenTea(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_STRONG_GREEN_TEA) || state.isOf(ModFluidsRegister.FLOWING_STRONG_GREEN_TEA);
    }

    public static boolean isRoseHipJam(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_ROSE_HIP_JAM) || state.isOf(ModFluidsRegister.FLOWING_ROSE_HIP_JAM);
    }

    public static boolean isTeaCurry(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_TEA_CURRY) || state.isOf(ModFluidsRegister.FLOWING_TEA_CURRY);
    }

    public static boolean isBlazingChili(FluidState state) {
        return state.isOf(ModFluidsRegister.STILL_BLAZING_CHILI) || state.isOf(ModFluidsRegister.FLOWING_BLAZING_CHILI);
    }


    public static void register() {
        STILL_PURULENT_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "purulent_tea"), new PurulentTeaFluid.Still());
        FLOWING_PURULENT_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_purulent_tea"), new PurulentTeaFluid.Flowing());
        PURULENT_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "purulent_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_PURULENT_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        PURULENT_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "purulent_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_PURULENT_TEA, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_DANDELION_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "dandelion_tea"), new DandelionTeaFluid.Still());
        FLOWING_DANDELION_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_dandelion_tea"), new DandelionTeaFluid.Flowing());
        DANDELION_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "dandelion_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_DANDELION_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        DANDELION_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "dandelion_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_DANDELION_TEA, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_ROSE_HIP_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "rose_hip_tea"), new RoseHipTeaFluid.Still());
        FLOWING_ROSE_HIP_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_rose_hip_tea"), new RoseHipTeaFluid.Flowing());
        ROSE_HIP_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "rose_hip_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_ROSE_HIP_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        ROSE_HIP_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "rose_hip_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_ROSE_HIP_TEA, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_BLACK_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "black_tea"), new BlackTeaFluid.Still());
        FLOWING_BLACK_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_black_tea"), new BlackTeaFluid.Flowing());
        BLACK_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "black_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_BLACK_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        BLACK_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "black_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_BLACK_TEA, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_YELLOW_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "yellow_tea"), new YellowTeaFluid.Still());
        FLOWING_YELLOW_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_yellow_tea"), new YellowTeaFluid.Flowing());
        YELLOW_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "yellow_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_YELLOW_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        YELLOW_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "yellow_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_YELLOW_TEA, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_GREEN_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "green_tea"), new GreenTeaFluid.Still());
        FLOWING_GREEN_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_green_tea"), new GreenTeaFluid.Flowing());
        GREEN_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "green_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_GREEN_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        GREEN_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "green_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_GREEN_TEA, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_COFFEE = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "coffee"), new CoffeeFluid.Still());
        FLOWING_COFFEE = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_coffee"), new CoffeeFluid.Flowing());
        COFFEE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "coffee_block"),
                new FluidBlock(ModFluidsRegister.STILL_COFFEE, FabricBlockSettings.copyOf(Blocks.WATER)));
        COFFEE_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "coffee_bucket"),
                new BucketItem(ModFluidsRegister.STILL_COFFEE, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_LONG_DANDELION_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "long_dandelion_tea"), new LongDandelionTeaFluid.Still());
        FLOWING_LONG_DANDELION_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_long_dandelion_tea"), new LongDandelionTeaFluid.Flowing());
        LONG_DANDELION_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "long_dandelion_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_DANDELION_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        LONG_DANDELION_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "long_dandelion_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_DANDELION_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_LONG_BLACK_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "long_black_tea"), new LongBlackTeaFluid.Still());
        FLOWING_LONG_BLACK_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_long_black_tea"), new LongBlackTeaFluid.Flowing());
        LONG_BLACK_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "long_black_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_LONG_BLACK_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        LONG_BLACK_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "long_black_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_LONG_BLACK_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_LONG_YELLOW_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "long_yellow_tea"), new LongYellowTeaFluid.Still());
        FLOWING_LONG_YELLOW_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_long_yellow_tea"), new LongYellowTeaFluid.Flowing());
        LONG_YELLOW_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "long_yellow_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_LONG_YELLOW_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        LONG_YELLOW_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "long_yellow_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_LONG_YELLOW_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_LONG_GREEN_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "long_green_tea"), new LongGreenTeaFluid.Still());
        FLOWING_LONG_GREEN_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_long_green_tea"), new LongGreenTeaFluid.Flowing());
        LONG_GREEN_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "long_green_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_LONG_GREEN_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        LONG_GREEN_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "long_green_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_LONG_GREEN_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_LONG_COFFEE = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "long_coffee"), new LongCoffeeFluid.Still());
        FLOWING_LONG_COFFEE = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_long_coffee"), new LongCoffeeFluid.Flowing());
        LONG_COFFEE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "long_coffee_block"),
                new FluidBlock(ModFluidsRegister.STILL_LONG_COFFEE, FabricBlockSettings.copyOf(Blocks.WATER)));
        LONG_COFFEE_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "long_coffee_bucket"),
                new BucketItem(ModFluidsRegister.STILL_LONG_COFFEE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_STRONG_PURULENT_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "strong_purulent_tea"), new StrongPurulentTeaFluid.Still());
        FLOWING_STRONG_PURULENT_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_strong_purulent_tea"), new StrongPurulentTeaFluid.Flowing());
        STRONG_PURULENT_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_purulent_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_STRONG_PURULENT_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        STRONG_PURULENT_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_purulent_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_STRONG_PURULENT_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_STRONG_ROSE_HIP_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "strong_rose_hip_tea"), new StrongRoseHipTeaFluid.Still());
        FLOWING_STRONG_ROSE_HIP_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_strong_rose_hip_tea"), new StrongRoseHipTeaFluid.Flowing());
        STRONG_ROSE_HIP_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_rose_hip_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_STRONG_ROSE_HIP_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        STRONG_ROSE_HIP_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_rose_hip_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_STRONG_ROSE_HIP_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_STRONG_BLACK_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "strong_black_tea"), new StrongBlackTeaFluid.Still());
        FLOWING_STRONG_BLACK_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_strong_black_tea"), new StrongBlackTeaFluid.Flowing());
        STRONG_BLACK_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_black_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_STRONG_BLACK_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        STRONG_BLACK_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_black_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_STRONG_BLACK_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_STRONG_YELLOW_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "strong_yellow_tea"), new StrongYellowTeaFluid.Still());
        FLOWING_STRONG_YELLOW_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_strong_yellow_tea"), new StrongYellowTeaFluid.Flowing());
        STRONG_YELLOW_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_yellow_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_STRONG_YELLOW_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        STRONG_YELLOW_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_yellow_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_STRONG_YELLOW_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_STRONG_GREEN_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "strong_green_tea"), new StrongGreenTeaFluid.Still());
        FLOWING_STRONG_GREEN_TEA = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_strong_green_tea"), new StrongGreenTeaFluid.Flowing());
        STRONG_GREEN_TEA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_green_tea_block"),
                new FluidBlock(ModFluidsRegister.STILL_STRONG_GREEN_TEA, FabricBlockSettings.copyOf(Blocks.WATER)));
        STRONG_GREEN_TEA_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_green_tea_bucket"),
                new BucketItem(ModFluidsRegister.STILL_STRONG_GREEN_TEA, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_STRONG_COFFEE = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "strong_coffee"), new StrongCoffeeFluid.Still());
        FLOWING_STRONG_COFFEE = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_strong_coffee"), new StrongCoffeeFluid.Flowing());
        STRONG_COFFEE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_coffee_block"),
                new FluidBlock(ModFluidsRegister.STILL_STRONG_COFFEE, FabricBlockSettings.copyOf(Blocks.WATER)));
        STRONG_COFFEE_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "strong_coffee_bucket"),
                new BucketItem(ModFluidsRegister.STILL_STRONG_COFFEE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_ROSE_HIP_JAM = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "rose_hip_jam"), new RoseHipJamFluid.Still());
        FLOWING_ROSE_HIP_JAM = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_rose_hip_jam"), new RoseHipJamFluid.Flowing());
        ROSE_HIP_JAM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "rose_hip_jam_block"),
                new FluidBlock(ModFluidsRegister.STILL_ROSE_HIP_JAM, FabricBlockSettings.copyOf(Blocks.WATER)));
        ROSE_HIP_JAM_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "rose_hip_jam_bucket"),
                new BucketItem(ModFluidsRegister.STILL_ROSE_HIP_JAM, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_BLAZING_CHILI = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "blazing_chili"), new BlazingChiliFluid.Still());
        FLOWING_BLAZING_CHILI = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_blazing_chili"), new BlazingChiliFluid.Flowing());
        BLAZING_CHILI_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "blazing_chili_block"),
                new FluidBlock(ModFluidsRegister.STILL_BLAZING_CHILI, FabricBlockSettings.copyOf(Blocks.WATER)));
        BLAZING_CHILI_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "blazing_chili_bucket"),
                new BucketItem(ModFluidsRegister.STILL_BLAZING_CHILI, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_TEA_CURRY = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "tea_curry"), new TeaCurryFluid.Still());
        FLOWING_TEA_CURRY = Registry.register(Registry.FLUID,
                new Identifier(RespiteCreatorsMod.MOD_ID, "flowing_tea_curry"), new TeaCurryFluid.Flowing());
        TEA_CURRY_BLOCK = Registry.register(Registry.BLOCK, new Identifier(RespiteCreatorsMod.MOD_ID, "tea_curry_block"),
                new FluidBlock(ModFluidsRegister.STILL_TEA_CURRY, FabricBlockSettings.copyOf(Blocks.WATER)));
        TEA_CURRY_BUCKET = Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, "tea_curry_bucket"),
                new BucketItem(ModFluidsRegister.STILL_TEA_CURRY, new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}