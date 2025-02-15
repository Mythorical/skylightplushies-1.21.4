package net.mythorical.skylightplushies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mythorical.skylightplushies.init.ModBlocks;
import net.mythorical.skylightplushies.init.ModItems;

import java.util.concurrent.CompletableFuture;

public class PlushiesLangGen extends FabricLanguageProvider {
    public PlushiesLangGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){

        super(output, registryLookup);
    }
    // Copy and paste builder.add(ModBlocks.INSERT_PLUSH_NAMESPACE, "The name you want to display in game goes here");
    // Make sure to run datagen after doing this
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder) {
        builder.add(ModBlocks.MARKETABLE_DUMB, "Marketable Dumb");
        builder.add(ModBlocks.MARKETABLE_MYTHPLUS, "Marketable Myth Plus");
        builder.add(ModBlocks.MAYOR_EGG, "Mayor Egg Plush");
        builder.add(ModBlocks.MY_PAL_SKYCON, "My Pal Skycon");
        builder.add(ModBlocks.HERO_ROBOT_ACTION_PLUSH, "The Hero Robot Action Plush");
        builder.add(ModBlocks.MARKETABLE_DUMBMINUS, "Marketable Dumb Minus");
        builder.add(ModBlocks.YAGI_PLUSH, "Yagi Plush");
        builder.add(ModBlocks.MARKETABLE_HARV, "Marketable Harv");
        builder.add(ModItems.BANE_OF_THE_GODS, "Bane Of The Gods");
        builder.add(ModItems.ZANPAKUTO, "Zanpakuto");
        // PASTE HERE
    }
}
