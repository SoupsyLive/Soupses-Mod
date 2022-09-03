package com.soupsy.soupsesmod;

import com.soupsy.soupsesmod.block.ModBlocks;
import com.soupsy.soupsesmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoupsesMod implements ModInitializer {
	public static final String MOD_ID = "soupses";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlock();

		LOGGER.info("Hello Fabric world!");
	}
}
