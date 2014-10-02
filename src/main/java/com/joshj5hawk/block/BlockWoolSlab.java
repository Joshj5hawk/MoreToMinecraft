package com.joshj5hawk.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWoolSlab extends BlockSlab
{
	
	private boolean isDoubleSlab;
	private int numSubBlocks;
	private Block singleSlab;
	private Block textureBlock;
	private int textureStartCounter;

	public BlockWoolSlab(boolean _isDoubleSlab, Material mat, int _numSubBlocks, Block _singleSlab, Block _textureBlock, int _textureStartCounter) 
	{
		super(_isDoubleSlab, mat);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		
		isDoubleSlab = _isDoubleSlab;
		numSubBlocks = _numSubBlocks;
		singleSlab = _singleSlab;
		textureBlock = _textureBlock;
		textureStartCounter = _textureStartCounter;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs ta, List subItems)
	{
		for (int i = 0; i < numSubBlocks; i++)
		{
			subItems.add(new ItemStack(this, 1, i));
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return textureBlock.getIcon(side, (meta % 8) + textureStartCounter);
	}
	
	@Override
	public Item getItemDropped(int a ,Random rand, int b)
	{
		return (isDoubleSlab ? Item.getItemFromBlock(singleSlab) : Item.getItemFromBlock(this));
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return (isDoubleSlab ? 2 : 1);
	}
	
	@Override
	public int damageDropped(int meta)
	{
		return meta % 8;
	}

	
	@Override
	protected ItemStack createStackedBlock(int meta)
	{
		return new ItemStack(singleSlab, 2, meta & 7);
	}
	
	@Override
	public String func_150002_b(int a)
	{
		if ((a < 0 || (a >= numSubBlocks)))
		{
			a = 0;
		}
		return super.getUnlocalizedName() + "." + (a + 1);
	}
}
