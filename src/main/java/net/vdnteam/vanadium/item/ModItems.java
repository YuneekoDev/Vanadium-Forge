package net.vdnteam.vanadium.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vdnteam.vanadium.Vanadium;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Vanadium.MOD_ID);

    public static final RegistryObject<Item> BLITZ_QUARTZ = ITEMS.register("blitz_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLITZ_QUARTZ_INGOT = ITEMS.register("blitz_quartz_ingot",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
