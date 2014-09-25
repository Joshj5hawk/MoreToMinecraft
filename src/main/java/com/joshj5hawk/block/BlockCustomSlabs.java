package com.joshj5hawk.block;

import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockCustomSlabs extends BlockSlab
{

	public BlockCustomSlabs(boolean isFullBlock, Material mat) 
	{
		super(isFullBlock, mat);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
	}

	@Override
	public String func_150002_b(int meta) 
	{
		return this.getUnlocalizedName();
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
