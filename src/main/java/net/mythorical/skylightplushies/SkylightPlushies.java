package net.mythorical.skylightplushies;

import net.acoyt.acornlib.init.AcornComponents;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.util.Identifier;
import net.mythorical.skylightplushies.init.ModBlocks;
import net.mythorical.skylightplushies.init.ModItems;
import net.mythorical.skylightplushies.item.BaneItem;
import net.mythorical.skylightplushies.item.ZanItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

public class SkylightPlushies implements ModInitializer {
	public static final String MOD_ID = "skylightplushies";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public void onInitialize() {
		ModBlocks.init();
		ModItems.init();
		// If you want to make custom plushies ignore all this
		DefaultItemComponentEvents.MODIFY.register(ctx -> ctx.modify(
				Predicate.isEqual(ModItems.BANE_OF_THE_GODS),
				(builder, item) -> builder.add(DataComponentTypes.ATTRIBUTE_MODIFIERS, BaneItem.createAttributeModifiers())
		));

		DefaultItemComponentEvents.MODIFY.register(ctx -> ctx.modify(
				Predicate.isEqual(ModItems.ZANPAKUTO),
				(builder, item) -> builder.add(DataComponentTypes.ATTRIBUTE_MODIFIERS, ZanItem.createAttributeModifiers())
		));

		DefaultItemComponentEvents.MODIFY.register(ctx -> ctx.modify(
				Predicate.isEqual(ModItems.BANE_OF_THE_GODS),
				(builder, item) -> builder.add(AcornComponents.TWO_HANDED, true)
		));

		DefaultItemComponentEvents.MODIFY.register(ctx -> ctx.modify(
				Predicate.isEqual(ModItems.ZANPAKUTO),
				(builder, item) -> builder.add(AcornComponents.TWO_HANDED, true)
		));

	}

	public static Identifier id(String name) {
		return Identifier.of(MOD_ID, name);
	}
}
