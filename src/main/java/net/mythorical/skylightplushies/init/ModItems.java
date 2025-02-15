package net.mythorical.skylightplushies.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mythorical.skylightplushies.SkylightPlushies;
import net.mythorical.skylightplushies.item.BaneItem;
import net.mythorical.skylightplushies.item.ZanItem;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public interface ModItems {
    Map<Item, Identifier> ITEMS = new LinkedHashMap();
    ArrayList<ItemStack> MYTH_ITEMS = new ArrayList();
    Item BANE_OF_THE_GODS = createItem("bane_of_the_gods",
            new BaneItem(ToolMaterial.NETHERITE, 9, -3.1F, new Item.Settings().maxDamage(0).registryKey(RegistryKey.of(RegistryKeys.ITEM, SkylightPlushies.id("bane_of_the_gods"))).attributeModifiers(BaneItem.createAttributeModifiers())));

    Item ZANPAKUTO = createItem("zanpakuto",
            new ZanItem(ToolMaterial.NETHERITE, 8, -2.6F, new Item.Settings().maxDamage(0).registryKey(RegistryKey.of(RegistryKeys.ITEM, SkylightPlushies.id("zanpakuto"))).attributeModifiers(ZanItem.createAttributeModifiers())));

    static <T extends Item> T createItem(String name, T item) {
        ITEMS.put(item, SkylightPlushies.id(name));
        MYTH_ITEMS.add(item.getDefaultStack());
        return item;
    }

    static void init() {
        ITEMS.forEach((item, identifier) -> Registry.register(Registries.ITEM, identifier, item));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(buildingItemGroup -> {
            buildingItemGroup.addAfter(Items.MACE, ZANPAKUTO);
            buildingItemGroup.addAfter(ModItems.ZANPAKUTO, BANE_OF_THE_GODS);
        });
    }

}
