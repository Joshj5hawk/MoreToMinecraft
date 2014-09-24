package com.joshj5hawk.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.joshj5hawk.block.MTMBlock;
import com.joshj5hawk.worldgen.structures.StructureSmallHouse;

import cpw.mods.fml.common.IWorldGenerator;


public class MTMWorldGen implements IWorldGenerator
{
	public static MTMBlock blocks;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider cG, IChunkProvider cP) 
	{
		switch(world.provider.dimensionId)
		{
			case 0:
				//Generate Overworld
				generateSurface(world, random, chunkX*16, chunkZ*16);
			case -1:
				//Generate Nether
				generateNether(world, random, chunkX*16, chunkZ*16);
			case 1:
				//Generate End
				generateEnd(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) 
	{
		//this.addOreSpawn(BLOCK, world, random, x, z, maxX, MaxZ, maxVeinSize, percentChanceToSpawn, minY, maxY);
		this.addOreSpawn(blocks.blockGemOres, 0, world, random, x, z, 16, 16, 4 + random.nextInt(50), 25, 50, 128);
		
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);
		
		if ((biome == BiomeGenBase.plains || biome == BiomeGenBase.desert))
		{
			for(int a = 0; a < 1; a++)
			{
				int i = x + random.nextInt(10);
				int k = random.nextInt(200);
				int j = z + random.nextInt(10);
				
				new StructureSmallHouse().generate(world, random, i, j, k);
			}
		}
		
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		
	}

	private void generateEnd(World world, Random random, int x, int z) 
	{
		
	}
	
	private void addOreSpawn(Block block, int meta, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int spawnChance, int minY, int maxY) 
	{
		for(int i = 0; i < spawnChance; i ++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, meta, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
		}
	}
}
