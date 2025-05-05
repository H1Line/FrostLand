
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package frostland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import frostland.item.SpruceWoodItem;

import frostland.FrostlandMod;

public class FrostlandModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FrostlandMod.MODID);
	public static final RegistryObject<Item> SNOW_BLOCK = block(FrostlandModBlocks.SNOW_BLOCK);
	public static final RegistryObject<Item> SNOWY_SPRUCE_LOG = block(FrostlandModBlocks.SNOWY_SPRUCE_LOG);
	public static final RegistryObject<Item> SPRUCE_WOOD = REGISTRY.register("spruce_wood", () -> new SpruceWoodItem());
	public static final RegistryObject<Item> SNOWY_SPRUCE_LEAVES = block(FrostlandModBlocks.SNOWY_SPRUCE_LEAVES);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
