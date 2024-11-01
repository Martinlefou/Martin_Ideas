package net.martin.ideas;

import net.fabricmc.api.ModInitializer;

import net.martin.ideas.item.ModItemGroups;
import net.martin.ideas.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MartinIdeas implements ModInitializer {
	public static final String MOD_ID = "martinideas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}