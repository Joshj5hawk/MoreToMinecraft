package com.joshj5hawk.itemblock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.joshj5hawk.block.MTMBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockWoolSlab extends ItemBlock {

	private final boolean field_150948_b;
	private final BlockSlab singleSlab;
	private final BlockSlab doubleSlab;
	private static final String _OBFID = "CL_00000071";

	public ItemBlockWoolSlab(Block block) 
	{
		super(block);
		this.singleSlab = (BlockSlab) MTMBlock.blockWoolSlabSingle;
		this.doubleSlab = (BlockSlab) MTMBlock.blockWoolSlabDouble;

		this.field_150948_b = false;
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) 
	{
		return Block.getBlockFromItem(this).getIcon(2, meta);
	}

	public String getUnlocalizedName(ItemStack is) 
	{
		return this.singleSlab.func_150002_b(is.getItemDamage());
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World world, int x, int y, int z, int meta, float a, float b, float c) 
	{
		if (this.field_150948_b) 
		{
			return super.onItemUse(par1ItemStack, player, world, x, y, z, meta, a, b, c);
		} 
		else if (par1ItemStack.stackSize == 0) 
		{
			return false;
		} 
		else if (!player.canPlayerEdit(x, y, z, meta, par1ItemStack)) 
		{
			return false;
		} 
		else 
		{
			Block block = world.getBlock(x, y, z);
			int i1 = world.getBlockMetadata(x, y, z);
			int j1 = i1 & 7;
			boolean flag = (i1 & 8) != 0;
			if ((meta == 1 && !flag || meta == 0 && flag) && block == this.singleSlab && j1 == par1ItemStack.getItemDamage()) 
			{
				if (world.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBoxFromPool(world, x, y, z)) && world.setBlock(x, y, z, this.doubleSlab, j1, 3)) 
				{
					world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F), this.doubleSlab.stepSound.func_150496_b(), (this.doubleSlab.stepSound.getVolume() + 1.0F) / 2.0F, this.doubleSlab.stepSound.getPitch() * 0.8F);
					if (!player.capabilities.isCreativeMode)
					{
						--par1ItemStack.stackSize;
					}
				}
				return true;
			} 
			else 
			{
				return this.func_150946_a(par1ItemStack, player, world, x, y, z, meta) ? true : super.onItemUse(par1ItemStack, player, world, x, y, z, meta, a, b, c);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean func_150936_a(World world, int x, int y, int z, int meta, EntityPlayer player, ItemStack is) 
	{
		int i1 = x;
		int j1 = y;
		int k1 = z;
		Block block = world.getBlock(x, y, z);
		int l1 = world.getBlockMetadata(x, y, z);
		int i2 = l1 & 7;
		boolean flag = (l1 & 8) != 0;
		if ((meta == 1 && !flag || meta == 0 && flag) && block == this.singleSlab && i2 == is.getItemDamage()) 
		{
			return true;
		} 
		else 
		{
			if (meta == 0) 
			{
				--y;
			}
			if (meta == 1) 
			{
				++y;
			}
			if (meta == 2) 
			{
				--z;
			}
			if (meta == 3) 
			{
				++z;
			}
			if (meta == 4) 
			{
				--x;
			}
			if (meta == 5) 
			{
				++x;
			}
			Block block1 = world.getBlock(x, y, z);
			int j2 = world.getBlockMetadata(x, y, z);
			i2 = j2 & 7;
			return block1 == this.singleSlab && i2 == is.getItemDamage() ? true : super.func_150936_a(world, i1, j1, k1, meta, player, is);
		}
	}

	private boolean func_150946_a(ItemStack is, EntityPlayer player, World world, int x, int y, int z, int meta)
	{
		if (meta == 0) 
		{
			--y;
		}
		if (meta == 1) 
		{
			++y;
		}
		if (meta == 2) 
		{
			--z;
		}
		if (meta == 3) 
		{
			++z;
		}
		if (meta == 4) 
		{
			--x;
		}
		if (meta == 5) 
		{
			++x;
		}
		Block block = world.getBlock(x, y, z);
		int i1 = world.getBlockMetadata(x, y, z);
		int j1 = i1 & 7;
		if (block == this.singleSlab && j1 == is.getItemDamage()) 
		{
			if (world.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBoxFromPool(world, x, y, z))&& world.setBlock(x, y, z, this.doubleSlab, j1, 3))
			{
				world.playSoundEffect((double) ((float) x + 0.5F),(double) ((float) y + 0.5F),(double) ((float) z + 0.5F), this.doubleSlab.stepSound.func_150496_b(), (this.doubleSlab.stepSound.getVolume() + 1.0F) / 2.0F, this.doubleSlab.stepSound.getPitch() * 0.8F);
				if (!player.capabilities.isCreativeMode)
				{
					--is.stackSize;
				}
			}
			return true;
		} 
		else
		{
			return false;
		}
	}
	public int getMetadata(int meta)
	{
		return meta;
	}
}