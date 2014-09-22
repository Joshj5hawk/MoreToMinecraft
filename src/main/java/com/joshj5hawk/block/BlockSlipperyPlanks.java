package com.joshj5hawk.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlipperyPlanks extends Block 
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	public BlockSlipperyPlanks(Material mat)
	{
		super(mat);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		this.slipperiness = 0.98F;
		this.setStepSound(soundTypeWood);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		texture = new IIcon[6];
		for(int i = 0; i < 6; i ++)
		{
			texture[i] = register.registerIcon(Strings.modid + ":blockSlipperyPlanks_" + i);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
	{
		for(int i = 0; i < 6; ++ i)
		{
			list.add(new ItemStack(MTMBlock.blockSlipperyPlanks, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return texture[meta];
	}
	
	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}
	
	
}
