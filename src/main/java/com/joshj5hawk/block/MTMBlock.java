package com.joshj5hawk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.joshj5hawk.itemBlocks.ItemBlockSlipperyBlocks;
import com.joshj5hawk.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class MTMBlock 
{
	public static Block blockSlipperyBlocks;
	
	
	public static void initBlocks()
	{
		/*Wood Planks
		 * Oak - Done
		 * Spruce
		 * Birch
		 * Jungle
		 * Acacia
		 * Dark Oak*/
		blockSlipperyBlocks = new BlockSlipperyBlocks(Material.rock).setBlockName("blockSlipperyBlocks").setBlockTextureName(Strings.modid + ":blockSlipperyBlocks");
		
		registerBlocks();
	}
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(blockSlipperyBlocks, ItemBlockSlipperyBlocks.class, "blockSlipperyBlocks");
		
	}
	
}
