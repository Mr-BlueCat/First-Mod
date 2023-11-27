package net.x4mok.x4mokmod.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
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

    public static final RegistryObject<Item> LUMINARIA_SLIVER = ITEMS.register("luminaria_sliver",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static final RegistryObject<SwordItem> LUMINARIA_SWORD = ITEMS.register("luminaria_sword",
            () -> new SwordItem(Tiers.LUMINARIA, 18,-2.4f, new Item.Properties().tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static final RegistryObject<PickaxeItem> LUMINARIA_PICKAXE = ITEMS.register("luminaria_pickaxe",
            () -> new PickaxeItem(Tiers.LUMINARIA, 4, -2.8f, new Item.Properties().tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static final RegistryObject<AxeItem> LUMINARIA_AXE = ITEMS.register("luminaria_axe",
            () -> new AxeItem(Tiers.LUMINARIA, 22, 1f, new Item.Properties().tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static final RegistryObject<ShovelItem> LUMINARIA_SHOVEL = ITEMS.register("luminaria_shovel",
            () -> new ShovelItem(Tiers.LUMINARIA, 3, -2.8f, new Item.Properties().tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static final RegistryObject<HoeItem> LUMINARIA_HOE = ITEMS.register("luminaria_hoe",
            () -> new HoeItem(Tiers.LUMINARIA, 2, -2.8f, new Item.Properties().tab(ModCreativeModeTab.X4MOKMOD_TAB)));

    public static class  Tiers {
        public static final Tier LUMINARIA = new ForgeTier(
                15,
                5112,
                0f,
                0f,
                30,
                null,
                () -> Ingredient.of(ModItems.LUMINARIA_INGOT.get()));
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
