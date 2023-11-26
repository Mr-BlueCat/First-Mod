package net.x4mok.x4mokmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.x4mok.x4mokmod.x4mokMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, x4mokMod.MOD_ID);

    public static final RegistryObject<Item> LUMINARIA_INGOT = ITEMS.register("luminaria_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static final RegistryObject<Item> RAW_LUMINARIA = ITEMS.register("raw_luminaria",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
