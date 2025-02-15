package net.mythorical.skylightplushies;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.mythorical.skylightplushies.init.ModBlocks;

public class SkylightPlushiesClient implements ClientModInitializer {


    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.MAYOR_EGG, ModBlocks.MARKETABLE_DUMB, ModBlocks.MY_PAL_SKYCON, ModBlocks.MARKETABLE_MYTHPLUS, ModBlocks.HERO_ROBOT_ACTION_PLUSH, ModBlocks.MARKETABLE_DUMBMINUS, ModBlocks.YAGI_PLUSH, ModBlocks.MARKETABLE_HARV});
    }
}
