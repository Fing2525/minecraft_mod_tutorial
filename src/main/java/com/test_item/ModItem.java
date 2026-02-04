package com.test_item;

import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil.Test;

import com.test_item.TestItemMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.minecraft.world.item.Item;

public class ModItem {

    public static  DeferredItem<Item> TEST_ITEM = TestItemMod.ITEMS.registerSimpleItem("item_test");

    // public static void register(IEventBus eventBus) {
    //     TEST_ITEM.register(eventBus);
    // }
}