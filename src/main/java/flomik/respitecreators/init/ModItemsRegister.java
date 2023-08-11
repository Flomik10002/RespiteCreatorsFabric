package flomik.respitecreators.init;

import flomik.respitecreators.RespiteCreatorsMod;
import flomik.respitecreators.item.ModItemsGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemsRegister {
    public static final Item INCOMPLETE_BLACK_COD = registerItem("incomplete_black_cod",
            new Item(new FabricItemSettings().group(ModItemsGroup.main).recipeRemainder(Items.BOWL).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_ROSE_HIP_PIE = registerItem("incomplete_rose_hip_pie",
            new Item(new FabricItemSettings().group(ModItemsGroup.main).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_COFFEE_CAKE = registerItem("incomplete_coffee_cake",
            new Item(new FabricItemSettings().group(ModItemsGroup.main).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item COFFEE_CAKE_SPONGE = registerItem("coffee_cake_sponge",
            new Item(new FabricItemSettings().group(ModItemsGroup.main).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item COFFEE_CAKE_COATING = registerItem("coffee_cake_coating",
            new Item(new FabricItemSettings().group(ModItemsGroup.main).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RespiteCreatorsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RespiteCreatorsMod.LOGGER.debug("Registering Mod Items for " + RespiteCreatorsMod.MOD_ID);
    }
}
