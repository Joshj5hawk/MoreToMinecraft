package com.joshj5hawk.recipes;

import com.joshj5hawk.block.MTMBlock;
import com.joshj5hawk.item.MTMItem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MTMCrafting 
{
	public static MTMBlock blocks;
	public static MTMItem items;

	public static void mainRegistry()
	{
		shapedRecipes();
		shapelessRecipes();
	}

	public static void shapelessRecipes() 
	{
		
	}

	public static void shapedRecipes() 
	{
		//SlipperyPlanks
		//Oak
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 0), new Object[]{"PIP", "IPI", "PIP", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 0))});
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 0), new Object[]{"IPI", "PIP", "IPI", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 0))});
		//Spruce
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 1), new Object[]{"PIP", "IPI", "PIP", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 1))});
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 1), new Object[]{"IPI", "PIP", "IPI", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 1))});
		//Birch
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 2), new Object[]{"PIP", "IPI", "PIP", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 2))});
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 2), new Object[]{"IPI", "PIP", "IPI", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 2))});
		//Jungle
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 3), new Object[]{"PIP", "IPI", "PIP", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 3))});
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 3), new Object[]{"IPI", "PIP", "IPI", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 3))});
		//Acacia
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 4), new Object[]{"PIP", "IPI", "PIP", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 4))});
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 4), new Object[]{"IPI", "PIP", "IPI", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 4))});
		//DarkOak
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 5), new Object[]{"PIP", "IPI", "PIP", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 5))});
		GameRegistry.addRecipe(new ItemStack(blocks.blockSlipperyPlanks, 4, 5), new Object[]{"IPI", "PIP", "IPI", 'I', Blocks.ice, 'P', (new ItemStack(Blocks.planks, 1, 5))});
		
		//Obsidian Glass
		GameRegistry.addRecipe(new ItemStack(blocks.blockObsidianGlass, 8), new Object[]{"OGO", "GOG", "OGO", 'O', Blocks.obsidian, 'G', Blocks.glass});
	}
}
