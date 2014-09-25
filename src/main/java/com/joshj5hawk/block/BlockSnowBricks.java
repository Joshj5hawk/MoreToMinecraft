package com.joshj5hawk.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSnowBricks extends Block
{
	public BlockSnowBricks(Material mat)
	{
		super(mat);
		this.setHardness(2.0F);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg)
	{
		this.blockIcon = iconReg.registerIcon(this.getTextureName());
	}
}
