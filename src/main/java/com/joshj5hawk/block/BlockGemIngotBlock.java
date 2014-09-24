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

public class BlockGemIngotBlock extends Block
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] subBlocks = new String[] {"Copper", "Tin", "Mithril", "Saronite", "Onyx",
													"Titanium", "Topaz", "Amethyst", "Sapphire", "Ruby"};
	
	public BlockGemIngotBlock(Material mat)
	{
		super(mat);
		this.setHardness(5.0F);
		this.setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg)
	{
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++)
		{
			texture[i]	= iconReg.registerIcon(Strings.modid + ":block" + subBlocks[i] + "Block");
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs tab, List list)
	{
		for(int i = 0; i < subBlocks.length; i ++)
		{
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return texture[meta];
	}
	
	public int damageDropped(int meta)
	{
		return meta;
	}
}
