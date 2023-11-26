package net.x4mok.x4mokmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab X4MOKMOD_TAB = new CreativeModeTab("x4mokmod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LUMINARIA_INGOT.get());
        }
    };
    // for second tab just copy paste with different name (e.g X4MOKMOD_TAB2) and a different label (e.g "x4mokmod_tab2")

}
