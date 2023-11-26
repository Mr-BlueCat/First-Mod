package net.x4mok.x4mokmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.x4mok.x4mokmod.item.ModCreativeModeTab;
import net.x4mok.x4mokmod.item.ModItems;
import net.x4mok.x4mokmod.x4mokMod;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, x4mokMod.MOD_ID);

    public static final RegistryObject<Block> LUMINARIA_BLOCK = registerBlock("luminaria_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.X4MOKMOD_TAB);
    public static final RegistryObject<Block> LUMINARIA_ORE = registerBlock("luminaria_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.X4MOKMOD_TAB);
    public static final RegistryObject<Block> DEEPSLATE_LUMINARIA_ORE = registerBlock("deepslate_luminaria_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.X4MOKMOD_TAB);
    public static final RegistryObject<Block> RAW_LUMINARIA_BLOCK = registerBlock("raw_luminaria_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.X4MOKMOD_TAB);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
