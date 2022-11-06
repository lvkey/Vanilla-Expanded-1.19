package net.lvke.vanillaexpanded.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lvke.vanillaexpanded.VanillaExpanded;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ENDTANIUM_INGOT = registerItem ("endtanium_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ENDTANIUM_ALLOT_INGOT = registerItem ("endtanium_alloy_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item STEEL_INGOT = registerItem ("steel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaExpanded.LOGGER.debug("Registering Mod Items for " + VanillaExpanded.MOD_ID);
    }
}
