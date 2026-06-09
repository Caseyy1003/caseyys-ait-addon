package com.caseyy.caseyysaitaddon;

import com.caseyy.caseyysaitaddon.registry.ModItemGroups;
import com.caseyy.caseyysaitaddon.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaseyysAiTAddon implements ModInitializer {
    public static final String MOD_ID = "caseyys_ait_addon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();

        LOGGER.info("Caseyy's AiT Addon has loaded!");
    }
}