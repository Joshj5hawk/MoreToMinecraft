package com.joshj5hawk.main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.gen.feature.WorldGenFlowers;

import com.joshj5hawk.lib.Strings;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Strings.modid, version = Strings.version, name = Strings.name)
public class MoreToMinecraft 
{
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preInit)
	{
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent init)
	{
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postInit)
	{
		System.out.println(Strings.name + "- " + Strings.version + " Loaded");
	}
}
