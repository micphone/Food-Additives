package com.food.additives.item;

import com.food.additives.FoodAdditives;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

/*
* A class for registering the creative tabs
*/
public class ModCreativeTab {
    // The deferred register for the creative tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodAdditives.MOD_ID);

    // The id for the food additives creative tab
    public static final String FOOD_ADDITIVES_TAB_ID =
            "creativetab.food_additives";

    // The food additives creative tab
    public static final Supplier<CreativeModeTab> FOOD_ADDITIVES_TAB =
            CREATIVE_MODE_TAB.register("food_additives", () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .title(Component.translatable(FOOD_ADDITIVES_TAB_ID))
                    .icon(() -> ModItems.VEGETABLEOIL.get().getDefaultInstance())
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VEGETABLEOIL.get());
                        pOutput.accept(ModItems.SALT.get());
                        pOutput.accept(ModItems.POWDEREDSUGAR.get());
                        pOutput.accept(ModItems.VINEGAR.get());
                        pOutput.accept(ModItems.YEAST.get());
                    })
                    .build());

    // The method for registering the creative tabs
    public static void register(IEventBus bus) {
        CREATIVE_MODE_TAB.register(bus);
    }
}
