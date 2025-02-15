package net.mythorical.skylightplushies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mythorical.skylightplushies.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class PlushiesBlockLootTableGen extends FabricBlockLootTableProvider {
        public PlushiesBlockLootTableGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
            super(dataOutput, registryLookup);
        }
        // Copy and Paste addDrop(ModBlocks.INSERT_PLUSH_NAMESPACE);
        // Make sure to run datagen after doing this
        public void generate() {
            addDrop(ModBlocks.MAYOR_EGG);
            addDrop(ModBlocks.MARKETABLE_MYTHPLUS);
            addDrop(ModBlocks.MY_PAL_SKYCON);
            addDrop(ModBlocks.MARKETABLE_DUMB);
            addDrop(ModBlocks.MARKETABLE_DUMBMINUS);
            addDrop(ModBlocks.MARKETABLE_HARV);
            addDrop(ModBlocks.HERO_ROBOT_ACTION_PLUSH);
            addDrop(ModBlocks.YAGI_PLUSH);
            // PASTE HERE
        }
    }

