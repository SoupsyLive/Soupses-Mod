package com.soupsy.soupsesmod.item;

import com.soupsy.soupsesmod.SoupsesMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CRYSTAL = registerItem("crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.SOUPSES)));

    public static final Item RUBBER_BALL = registerItem("rubber_ball",
            new Item(new FabricItemSettings().group(ModItemGroup.SOUPSES)));

    public static final Item SOUPSES = registerItem("soupses",
            new Item(new FabricItemSettings().group(ModItemGroup.SOUPSES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SoupsesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SoupsesMod.LOGGER.info("Registering Mod Items for " + SoupsesMod.MOD_ID);

    }

}
