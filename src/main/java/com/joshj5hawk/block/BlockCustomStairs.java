package com.joshj5hawk.block;

import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.main.MoreToMinecraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomStairs extends BlockStairs
{
	private Block b;
	
	public BlockCustomStairs(Block block, Material mat)
	{
		super(block, 0);
		this.b = b;
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
