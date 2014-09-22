package com.joshj5hawk.block;

import java.util.Random;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

import com.joshj5hawk.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockObsidianGlass extends BlockBreakable
{
	
	public BlockObsidianGlass(Material mat, boolean bool)
	{
		super(Strings.modid + ":blockObsidianGlass", mat, bool);
		this.setStepSound(soundTypeGlass);
	}
	
	@Override
	public int quantityDropped(Random rand)
    {
        return 0;
    }

   @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    protected boolean canSilkHarvest()
    {
        return true;
    }
}
