package com.joshj5hawk.item;

import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.main.MoreToMinecraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MTMItem 
{
	public static Item itemCopperIngot;
	public static Item itemMithrilIngot;
	public static Item itemSaroniteNugget;
	public static Item itemSaroniteIngot;
	public static Item itemOnyxGem;
	public static Item itemOnyxIngot;
	
	public static Item itemTopazGem;
	public static Item itemAmethystGem;
	public static Item itemSapphireGem;
	public static Item itemRubyGem;
	
	public static void initItems()
	{
		itemCopperIngot = new Item().setUnlocalizedName("itemCopperIngot").setTextureName(Strings.modid + ":itemCopperIngot").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemMithrilIngot = new Item().setUnlocalizedName("itemMithrilIngot").setTextureName(Strings.modid + ":itemMithrilIngot").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemSaroniteNugget = new Item().setUnlocalizedName("itemSaroniteNugget").setTextureName(Strings.modid + ":itemSaroniteNugget").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemSaroniteIngot = new Item().setUnlocalizedName("itemSaroniteIngot").setTextureName(Strings.modid + ":itemSaroniteIngot").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemOnyxGem = new Item().setUnlocalizedName("itemOnyxGem").setTextureName(Strings.modid + ":itemOnyxGem").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemOnyxIngot = new Item().setUnlocalizedName("itemOnyxIngot").setTextureName(Strings.modid + ":itemOnyxIngot").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		
		itemTopazGem = new Item().setUnlocalizedName("itemTopazGem").setTextureName(Strings.modid + ":itemTopazGem").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemAmethystGem = new Item().setUnlocalizedName("itemAmethystGem").setTextureName(Strings.modid + ":itemAmethystGem").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemSapphireGem = new Item().setUnlocalizedName("itemSapphireGem").setTextureName(Strings.modid + ":itemSapphireGem").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		itemRubyGem = new Item().setUnlocalizedName("itemRubyGem").setTextureName(Strings.modid + ":itemRubyGem").setCreativeTab(MoreToMinecraft.tabMoreToMinecraft);
		
		registerItems();
	}
	
	public static void registerItems()
	{
		GameRegistry.registerItem(itemCopperIngot, "itemCopperIngot");
		GameRegistry.registerItem(itemMithrilIngot, "itemMithrilIngot");
		GameRegistry.registerItem(itemSaroniteNugget, "itemSaroniteNugget");
		GameRegistry.registerItem(itemSaroniteIngot, "itemSaroniteIngot");
		GameRegistry.registerItem(itemOnyxGem, "itemOnyxGem");
		GameRegistry.registerItem(itemOnyxIngot, "itemOnyxIngot");
		
		GameRegistry.registerItem(itemTopazGem, "itemTopazGem");
		GameRegistry.registerItem(itemAmethystGem, "itemAmethystGem");
		GameRegistry.registerItem(itemSapphireGem, "itemSapphireGem");
		GameRegistry.registerItem(itemRubyGem, "itemRubyGem");
	}
	
}