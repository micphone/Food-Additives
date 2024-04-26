package com.food.additives.item;

import com.food.additives.FoodAdditives;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, FoodAdditives.MOD_ID);

    public static final Supplier<Item> POWDEREDSUGAR = ITEMS.register("powderedsugar", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> VEGETABLEOIL = ITEMS.register("vegetableoil", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> VINEGAR = ITEMS.register("vinegar", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> YEAST = ITEMS.register("yeast",() -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
