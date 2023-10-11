package flomik.respitecreators.item;

import flomik.respitecreators.RespiteCreatorsMod;
import flomik.respitecreators.init.ModFluidsRegister;
import flomik.respitecreators.init.ModItemsRegister;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup RESPITE_CREATORS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RespiteCreatorsMod.MOD_ID, "respite_creators"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.respite_creators"))
                    .icon(() -> new ItemStack(ModItemsRegister.INCOMPLETE_ROSE_HIP_PIE)).entries((displayContext, entries) -> {
                        entries.add(ModItemsRegister.INCOMPLETE_COFFEE_CAKE);
                        entries.add(ModItemsRegister.INCOMPLETE_BLACK_COD);
                        entries.add(ModItemsRegister.INCOMPLETE_ROSE_HIP_PIE);
                        entries.add(ModItemsRegister.COFFEE_CAKE_COATING);
                        entries.add(ModItemsRegister.COFFEE_CAKE_SPONGE);
                        entries.add(ModFluidsRegister.PURULENT_TEA_BUCKET);
                        entries.add(ModFluidsRegister.DANDELION_TEA_BUCKET);
                        entries.add(ModFluidsRegister.ROSE_HIP_TEA_BUCKET);
                        entries.add(ModFluidsRegister.BLACK_TEA_BUCKET);
                        entries.add(ModFluidsRegister.YELLOW_TEA_BUCKET);
                        entries.add(ModFluidsRegister.GREEN_TEA_BUCKET);
                        entries.add(ModFluidsRegister.COFFEE_BUCKET);
                        entries.add(ModFluidsRegister.LONG_DANDELION_TEA_BUCKET);
                        entries.add(ModFluidsRegister.LONG_BLACK_TEA_BUCKET);
                        entries.add(ModFluidsRegister.LONG_YELLOW_TEA_BUCKET);
                        entries.add(ModFluidsRegister.LONG_GREEN_TEA_BUCKET);
                        entries.add(ModFluidsRegister.LONG_COFFEE_BUCKET);
                        entries.add(ModFluidsRegister.STRONG_PURULENT_TEA_BUCKET);
                        entries.add(ModFluidsRegister.STRONG_ROSE_HIP_TEA_BUCKET);
                        entries.add(ModFluidsRegister.STRONG_BLACK_TEA_BUCKET);
                        entries.add(ModFluidsRegister.STRONG_YELLOW_TEA_BUCKET);
                        entries.add(ModFluidsRegister.STRONG_COFFEE_BUCKET);
                        entries.add(ModFluidsRegister.ROSE_HIP_JAM_BUCKET);
                        entries.add(ModFluidsRegister.TEA_CURRY_BUCKET);
                        entries.add(ModFluidsRegister.BLAZING_CHILI_BUCKET);

                    }).build());

    public static void registerModItemGroup(){
        RespiteCreatorsMod.LOGGER.debug("Registering Mod Item Group for " + RespiteCreatorsMod.MOD_ID);
    }
}