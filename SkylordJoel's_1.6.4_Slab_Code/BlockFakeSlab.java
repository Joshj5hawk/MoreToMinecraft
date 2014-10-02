package addedcompat.common;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockFakeSlab extends BlockHalfSlab {

	private Block extendingBlock;
	
	public BlockFakeSlab(int id, boolean fullBlock, Block block, Material material) {
		super(id, fullBlock, material);
		
		this.extendingBlock = block;
		
		if(!fullBlock) {
			this.setCreativeTab(AddedCompat.tabAddedCompat);
			this.useNeighborBrightness[id] = true;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		this.blockIcon = register.registerIcon(AddedCompat.modid + ":" + this.extendingBlock.getUnlocalizedName().substring(5));
	}

	public String getFullSlabName(int i) {
		return super.getUnlocalizedName();
	}
	
	@SideOnly(Side.CLIENT)
	public int idPicked(World world, int x, int y, int z) {
		return AddedCompat.fakeHalfSlab.blockID;
	}
	
	public int idDropped(int par1, Random random, int par3) {
		return AddedCompat.fakeHalfSlab.blockID;
	}

}
