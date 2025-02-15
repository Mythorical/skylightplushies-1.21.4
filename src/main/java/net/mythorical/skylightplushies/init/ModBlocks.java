package net.mythorical.skylightplushies.init;

import net.acoyt.acornlib.AcornLibDatagen;
import net.acoyt.acornlib.init.AcornBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mythorical.skylightplushies.SkylightPlushies;
import net.mythorical.skylightplushies.block.PlushieBlock;

import java.util.LinkedHashMap;
import java.util.Map;


public interface ModBlocks {
    Map<Block, Identifier> BLOCKS = new LinkedHashMap();

    Block MAYOR_EGG = createBlock("mayor_egg",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("mayor_egg")))));


    Block MARKETABLE_DUMB = createBlock("marketable_dumb",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("marketable_dumb")))));


    Block MY_PAL_SKYCON = createBlock("my_pal_skycon",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("my_pal_skycon")))));

    Block MARKETABLE_MYTHPLUS = createBlock("marketable_mythplus",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("marketable_mythplus")))));


    Block HERO_ROBOT_ACTION_PLUSH = createBlock("hero_robot_action_plush",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("hero_robot_action_plush")))));


    Block MARKETABLE_DUMBMINUS = createBlock("marketable_dumbminus",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("marketable_dumbminus")))));


    Block YAGI_PLUSH = createBlock("yagi_plush",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("yagi_plush")))));

    Block MARKETABLE_HARV = createBlock("marketable_harv",
            new PlushieBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).registryKey(RegistryKey.of(RegistryKeys.BLOCK, SkylightPlushies.id("marketable_harv")))));


    private static Block createBlock(String name, Block block) {
        createBlockItem(name, block);
        return (Block)Registry.register(Registries.BLOCK, SkylightPlushies.id(name), block);
    }

    private static void createBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, SkylightPlushies.id(name), new BlockItem(block, (new Item.Settings()).registryKey(RegistryKey.of(RegistryKeys.ITEM, SkylightPlushies.id(name))).useBlockPrefixedTranslationKey()));
    }

    static void init() {
        BLOCKS.forEach((block, id) -> Registry.register(Registries.BLOCK, id, block));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(buildingItemGroup -> {
            buildingItemGroup.addAfter(AcornBlocks.MYTHORICAL_PLUSH, MAYOR_EGG);
            buildingItemGroup.addAfter(MAYOR_EGG, MARKETABLE_DUMB);
            buildingItemGroup.addAfter(MARKETABLE_DUMB, MY_PAL_SKYCON);
            buildingItemGroup.addAfter(MY_PAL_SKYCON, MARKETABLE_MYTHPLUS);
            buildingItemGroup.addAfter(MARKETABLE_MYTHPLUS, HERO_ROBOT_ACTION_PLUSH);
            buildingItemGroup.addAfter(HERO_ROBOT_ACTION_PLUSH, MARKETABLE_DUMBMINUS);
            buildingItemGroup.addAfter(MARKETABLE_DUMBMINUS, YAGI_PLUSH);
            buildingItemGroup.addAfter(YAGI_PLUSH, MARKETABLE_HARV);
        });
    }
}