package com.caseyy.caseyysaitaddon.registry;

import com.caseyy.caseyysaitaddon.CaseyysAiTAddon;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CASEYYS_AIT_ADDON_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(CaseyysAiTAddon.MOD_ID, "caseyys_ait_addon"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.caseyys_ait_addon"))
                    .icon(() -> new ItemStack(ModItems.JAMMY_DODGER))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.JAMMY_DODGER);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        CaseyysAiTAddon.LOGGER.info("Registering item groups for " + CaseyysAiTAddon.MOD_ID);
    }
}