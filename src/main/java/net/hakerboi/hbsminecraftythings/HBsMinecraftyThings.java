package net.hakerboi.hbsminecraftythings;

import net.fabricmc.api.ModInitializer;

import net.hakerboi.hbsminecraftythings.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HBsMinecraftyThings implements ModInitializer {
	public static final String MOD_ID = "hbs-minecrafty-things";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}