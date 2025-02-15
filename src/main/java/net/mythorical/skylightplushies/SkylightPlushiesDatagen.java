package net.mythorical.skylightplushies;

import net.mythorical.skylightplushies.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SkylightPlushiesDatagen implements DataGeneratorEntrypoint {
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        FabricDataGenerator.Pack pack = dataGenerator.createPack();

        pack.addProvider(PlushiesModelGen::new);
        pack.addProvider(PlushiesLangGen::new);
        pack.addProvider(PlushiesBlockLootTableGen::new);
    }
}
