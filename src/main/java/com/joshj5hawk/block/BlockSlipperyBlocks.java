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

public class BlockSlipperyBlocks extends Block 
{
	public static int currentPass = 0;
	
	@SideOnly(Side.CLIENT)
	private IIcon overlay;
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	public BlockSlipperyBlocks(Material mat)
	{
		super(mat);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		this.slipperiness = 0.98F;
		this.setStepSound(soundTypeGlass);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		overlay = register.registerIcon(Strings.modid + ":slipperyOverlay");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
	{
		for(int i = 0; i < 6; ++ i)
		{
			list.add(new ItemStack(MTMBlock.blockSlipperyBlocks, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return currentPass == 0 ? Blocks.planks.getIcon(side, meta) : this.overlay;
	}
	
	@Override
	public int getRenderBlockPass()
	{
		return 1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean canRenderInPass(int pass)
	{
		currentPass = pass;
		return true;
	}
	
	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}
	
	
}
