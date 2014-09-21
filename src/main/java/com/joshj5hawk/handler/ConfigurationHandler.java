package com.joshj5hawk.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.joshj5hawk.lib.Strings;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


public class ConfigurationHandler 
{
	public static Configuration config;
	
	public static void init(File configFile)
	{
		if(config == null)
		{
			config = new Configuration(configFile);
			loadConfiguration();
		}
	}
	private static void loadConfiguration()
	{
		//Config Options Here
		
		if(config.hasChanged())
		{
			config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Strings.modid))
		{
			loadConfiguration();
		}
	}
}
