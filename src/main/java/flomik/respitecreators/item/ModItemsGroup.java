package flomik.respitecreators.item;

import flomik.respitecreators.RespiteCreatorsMod;
import flomik.respitecreators.init.ModItemsRegister;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup main = FabricItemGroupBuilder.build(
            new Identifier(RespiteCreatorsMod.MOD_ID, "main"), () -> new ItemStack(ModItemsRegister.INCOMPLETE_ROSE_HIP_PIE));
}
