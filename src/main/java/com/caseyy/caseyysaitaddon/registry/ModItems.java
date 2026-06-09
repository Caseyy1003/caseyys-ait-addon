package com.caseyy.caseyysaitaddon.registry;

import com.caseyy.caseyysaitaddon.CaseyysAiTAddon;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JAMMY_DODGER = registerItem(
            "jammy_dodger",
            new Item(new Item.Settings().food(
                    new FoodComponent.Builder()
                            .hunger(3)
                            .saturationModifier(0.3f)
                            .snack()
                            .build()
            ))
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(CaseyysAiTAddon.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        CaseyysAiTAddon.LOGGER.info("Registering items for " + CaseyysAiTAddon.MOD_ID);
    }
}