package com.joshj5hawk.itemBlocks;

import com.joshj5hawk.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockSlipperyBlocks  extends ItemBlock
{
	private final static String[] SUBNAMES = {"Oak", "Spruce", "Birch", "Jungle", "Acacia", "Dark Oak"};
	@SideOnly(Side.CLIENT)
	private IIcon overlay;
	
	public ItemBlockSlipperyBlocks(Block block)
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		overlay = iconRegister.registerIcon(Strings.modid + ":slipperyOverlay");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses()
	{
		return true;
	}
	
	@Override
	public int getRenderPasses(int meta)
	{
		return 2;
	}
	
	@Override
	public IIcon getIcon(ItemStack itemstack, int pass)
	{
		return pass == 0 ? Blocks.planks.getIcon(itemstack.getItemDamage(), pass) : overlay;
	}
	
}
