package com.hyrega.taletweaks.core.init;

import com.hyrega.taletweaks.TaleTweaks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			TaleTweaks.MOD_ID);
	
	public static final RegistryObject<Block> TALEIUM_ORE = BLOCKS.register("taleium_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON)
					.hardnessAndResistance(15, 3)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.METAL)));
}
