
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package frostland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import frostland.FrostlandMod;

public class FrostlandModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FrostlandMod.MODID);
	public static final RegistryObject<CreativeModeTab> FROST_ITEM_TAB = REGISTRY.register("frost_item_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.frostland.frost_item_tab")).icon(() -> new ItemStack(Items.POWDER_SNOW_BUCKET)).displayItems((parameters, tabData) -> {
				tabData.accept(FrostlandModBlocks.SNOW_BLOCK.get().asItem());
				tabData.accept(FrostlandModBlocks.SNOWY_SPRUCE_LOG.get().asItem());
				tabData.accept(FrostlandModItems.SPRUCE_WOOD.get());
				tabData.accept(FrostlandModBlocks.SNOWY_SPRUCE_LEAVES.get().asItem());
			})

					.build());
}
