package net.martin.ideas;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPORE = registerItem("spore", new Item(new Item.Settings()));
    public static final Item INFECTED_SPORE = registerItem("infected_spore", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MartinIdeas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MartinIdeas.LOGGER.info("Registering Mod Items for " + MartinIdeas.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SPORE);
            fabricItemGroupEntries.add(INFECTED_SPORE);
        });
    }
}
