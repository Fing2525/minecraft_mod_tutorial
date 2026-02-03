package com.test_item.test_item.registry;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegistryObject;

import com.test_item.test_item.TestItemMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, TestItemMod.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM =
            ITEMS.register("test_item",
                    () -> new Item(new Item.Properties()));
}
