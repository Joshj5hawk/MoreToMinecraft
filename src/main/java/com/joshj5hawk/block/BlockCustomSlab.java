package com.joshj5hawk.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomSlab extends BlockSlab
{
	
	public static Block singleSlab;
	public static Block doubleSlab;
	
	public BlockCustomSlab(boolean isFullBlock, Material mat, Block _singleSlab, Block _doubleSlab)
	{
		super(isFullBlock, mat);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		this.setLightOpacity(0);
		singleSlab = _singleSlab;
		doubleSlab = _doubleSlab;
		
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
