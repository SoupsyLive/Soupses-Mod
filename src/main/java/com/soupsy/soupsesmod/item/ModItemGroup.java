package com.soupsy.soupsesmod.item;

import com.soupsy.soupsesmod.SoupsesMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
public static final ItemGroup SOUPSES = FabricItemGroupBuilder.build(new Identifier(SoupsesMod.MOD_ID, "soupses"),
        () -> new ItemStack(ModItems.SOUPSES));
}
