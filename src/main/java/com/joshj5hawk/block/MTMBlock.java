package com.joshj5hawk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import com.joshj5hawk.itemblock.CustomItemBlockSlab;
import com.joshj5hawk.itemblock.ItemBlockGemIngotBlock;
import com.joshj5hawk.itemblock.ItemBlockGemOres;
import com.joshj5hawk.itemblock.ItemBlockIngotOres;
import com.joshj5hawk.itemblock.ItemBlockSlipperPlanks;
import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.common.registry.GameRegistry;

public class MTMBlock 
{
	public static Block blockSlipperyPlanks;
	public static Block blockObsidianGlass;
	public static Block blockIngotOres;
	public static Block blockGemOres;
	public static Block blockGemIngotBlock;
	public static Block blockSnowBricks;
	public static Block blockSnowBrickStairs;
	public static Block blockSnowBrickSlabSingle;
	public static Block blockSnowBrickSlabDouble;
	
	
	public static void initBlocks()
	{
		/*Wood Planks
		 * Oak - Done
		 * Spruce
		 * Birch
		 * Jungle
		 * Acacia
		 * Dark Oak*/
		blockSlipperyPlanks = new BlockSlipperyPlanks(Material.wood).setBlockName("blockSlipperyPlanks").setBlockTextureName(Strings.modid + ":blockSlipperyPlanks").setHardness(2.5F);
		blockObsidianGlass = new BlockObsidianGlass(Material.glass, false).setBlockName("blockObsidianGlass").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft).setResistance(600000.0F).setHardness(0.3F);
		blockIngotOres = new BlockIngotOres(Material.rock).setBlockName("blockIngotOres");
		blockGemOres = new BlockGemOres(Material.rock).setBlockName("blockGemOres");
		blockGemIngotBlock = new BlockGemIngotBlock(Material.iron).setBlockName("blockGemIngotBlock");
		blockSnowBricks = new BlockSnowBricks(Material.craftedSnow).setBlockName("blockSnowBricks").setBlockTextureName(Strings.modid + ":blockSnowBricks");
		blockSnowBrickStairs = new BlockCustomStairs(Blocks.snow, Material.craftedSnow).setBlockName("blockSnowBrickStairs").setBlockTextureName(Strings.modid + ":blockSnowBricks");
		blockSnowBrickSlabSingle = new BlockCustomSlab(false, blockSnowBricks.getMaterial(), 1, blockSnowBrickSlabSingle, blockSnowBricks, 0).setBlockName("blockSnowBrickSingle");
		blockSnowBrickSlabDouble = new BlockCustomSlab(false, blockSnowBricks.getMaterial(), 1, blockSnowBrickSlabDouble, blockSnowBricks, 0).setBlockName("blockSnowBrickDouble");
		
		registerBlocks();
	}
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(blockSlipperyPlanks, ItemBlockSlipperPlanks.class, "blockSlipperyPlanks");
		GameRegistry.registerBlock(blockObsidianGlass, "blockObsidianGlass");
		GameRegistry.registerBlock(blockIngotOres, ItemBlockIngotOres.class, "blockIngotOres");
		GameRegistry.registerBlock(blockGemOres, ItemBlockGemOres.class, "blockGemOres");
		GameRegistry.registerBlock(blockGemIngotBlock, ItemBlockGemIngotBlock.class, "blockGemIngotBlock");
		GameRegistry.registerBlock(blockSnowBricks,"blockSnowBricks");
		GameRegistry.registerBlock(blockSnowBrickStairs, "blockSnowBrickStairs");
		GameRegistry.registerBlock(blockSnowBrickSlabSingle, CustomItemBlockSlab.class, blockSnowBrickSlabSingle.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSnowBrickSlabDouble, CustomItemBlockSlab.class, blockSnowBrickSlabDouble.getUnlocalizedName().substring(5));
	}
	
}
