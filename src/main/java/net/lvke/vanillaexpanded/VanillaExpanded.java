package net.lvke.vanillaexpanded;

import net.fabricmc.api.ModInitializer;
import net.lvke.vanillaexpanded.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaExpanded implements ModInitializer {

	public static final String MOD_ID = "vanillaexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
