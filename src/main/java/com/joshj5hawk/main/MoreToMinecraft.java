package com.joshj5hawk.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.joshj5hawk.block.MTMBlock;
import com.joshj5hawk.handler.ConfigurationHandler;
import com.joshj5hawk.item.MTMItem;
import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.proxies.CommonProxy;
import com.joshj5hawk.recipes.MTMCrafting;
import com.joshj5hawk.worldgen.MTMWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Strings.modid, version = Strings.version, name = Strings.name)
public class MoreToMinecraft 
{
	@Instance(Strings.modid)
	public static MoreToMinecraft instance;
	
	@SidedProxy(clientSide = "com.joshj5hawk.proxies.ClientProxy", serverSide = "com.joshj5hawk.proxies.CommonProxy")
	public static CommonProxy proxy;
	public static MTMBlock blocks;
	public static MTMItem items;
	
	public static CreativeTabs tabMoreToMinecraft;
	
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preInit)
	{
		//Config
		ConfigurationHandler.init(preInit.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		//CreativeTab
		tabMoreToMinecraft = new CreativeTabs("tabMoreToMinecraft")
		{
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Items.book;
			}
		};
		
		MTMWorldGen eventWorldGen = new MTMWorldGen();
		
		blocks.initBlocks();
		items.initItems();

		//World Gen
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent init)
	{
		
		//Crafting Recipes
		MTMCrafting.mainRegistry();
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postInit)
	{
		System.out.println(Strings.name + "-" + Strings.version + " Loaded");
	}
}
