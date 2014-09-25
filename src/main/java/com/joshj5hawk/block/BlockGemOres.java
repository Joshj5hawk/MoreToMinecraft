package com.joshj5hawk.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.joshj5hawk.item.MTMItem;
import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGemOres extends Block 
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] subBlocks = new String[] {"Topaz", "Amethyst", "Sapphire", "Ruby"};
	
	public BlockGemOres(Material mat)
	{
		super(mat);
		this.setHardness(5.0F);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		this.setHarvestLevel("pickaxe", 0, 0);
		this.setHarvestLevel("pickaxe", 1, 1);
		this.setHarvestLevel("pickaxe", 2, 2);
		this.setHarvestLevel("pickaxe", 3, 3);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg)
	{
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++)
		{
			texture[i] = iconReg.registerIcon(Strings.modid + ":block" + subBlocks[i] + "Ore");
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs tab, List list)
	{
		for(int i = 0; i < subBlocks.length; i++)
		{
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return texture[meta];
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune)
	{
		switch(meta)
		{
			case 0:
				return MTMItem.itemTopazGem;
			case 1:
				return MTMItem.itemAmethystGem;
			case 2:
				return MTMItem.itemSapphireGem;
			case 3: 
				return MTMItem.itemRubyGem;
		}
		
		return MTMItem.itemTopazGem;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 3 + rand.nextInt(3);
	}
	
	public int damageDropped(int meta)
	{
		return meta;
	}
}
