package com.joshj5hawk.itemblock;

import com.joshj5hawk.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockSlipperPlanks  extends ItemBlock
{
	private final static String[] SUBNAMES = {"Oak", "Spruce", "Birch", "Jungle", "Acacia", "Dark Oak"};
	@SideOnly(Side.CLIENT)
	private IIcon overlay;
	
	public ItemBlockSlipperPlanks(Block block)
	{
		super(block);
		setHasSubtypes(true);
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack itemStack)
	{
		return "Slippery " + SUBNAMES[itemStack.getItemDamage()] + " Planks";
	}
	
	@Override
	public int getMetadata(int meta)
	{
		return meta;
	}
	
}
