
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package frostland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import frostland.block.TentBlock;

import frostland.FrostlandMod;

public class FrostlandModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FrostlandMod.MODID);
	public static final RegistryObject<Block> TENT = REGISTRY.register("tent", () -> new TentBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
