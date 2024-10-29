package net.martin.ideas.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.martin.ideas.MartinIdeas;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SPOROUS_CAVES_GROUP =Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MartinIdeas.MOD_ID, "sporous_caves"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPORE))
                    .displayName(Text.translatable("itemgroup.martinideas.sporous_caves"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SPORE);
                        entries.add(ModItems.INFECTED_SPORE);
                    }).build());


    public static void registerItemGroups() {
        MartinIdeas.LOGGER.info("Registering Item Groups for " + MartinIdeas.MOD_ID);
    }
}
