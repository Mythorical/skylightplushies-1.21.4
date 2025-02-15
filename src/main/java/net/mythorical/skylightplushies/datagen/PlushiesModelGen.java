package net.mythorical.skylightplushies.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.mythorical.skylightplushies.init.ModBlocks;

public class PlushiesModelGen extends FabricModelProvider {
    public PlushiesModelGen(FabricDataOutput output){
        super(output);
    }

    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerNorthDefaultHorizontalRotation(ModBlocks.MARKETABLE_MYTHPLUS);
        generator.registerNorthDefaultHorizontalRotation(ModBlocks.MARKETABLE_DUMB);
        generator.registerNorthDefaultHorizontalRotation(ModBlocks.MY_PAL_SKYCON);
        generator.registerNorthDefaultHorizontalRotation(ModBlocks.HERO_ROBOT_ACTION_PLUSH);
        generator.registerNorthDefaultHorizontalRotation(ModBlocks.MARKETABLE_DUMBMINUS);
        generator.registerNorthDefaultHorizontalRotation(ModBlocks.YAGI_PLUSH);
        generator.registerNorthDefaultHorizontalRotation(ModBlocks.MARKETABLE_HARV);
    }

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

}
