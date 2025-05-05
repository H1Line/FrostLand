
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package frostland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import frostland.block.SnowySpruceLogBlock;
import frostland.block.SnowySpruceLeavesBlock;
import frostland.block.SnowBlockBlock;

import frostland.FrostlandMod;

public class FrostlandModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FrostlandMod.MODID);
	public static final RegistryObject<Block> SNOW_BLOCK = REGISTRY.register("snow_block", () -> new SnowBlockBlock());
	public static final RegistryObject<Block> SNOWY_SPRUCE_LOG = REGISTRY.register("snowy_spruce_log", () -> new SnowySpruceLogBlock());
	public static final RegistryObject<Block> SNOWY_SPRUCE_LEAVES = REGISTRY.register("snowy_spruce_leaves", () -> new SnowySpruceLeavesBlock());
}
