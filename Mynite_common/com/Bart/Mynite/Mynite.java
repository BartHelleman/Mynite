package com.Bart.Mynite;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.Bart.Mynite.block.ModBlocks;
import com.Bart.Mynite.configuration.ConfigurationHandler;
import com.Bart.Mynite.core.handler.LocalizationHandler;
import com.Bart.Mynite.core.proxy.CommonProxy;
import com.Bart.Mynite.creativetab.TabMynite;
import com.Bart.Mynite.item.ModItems;
import com.Bart.Mynite.lib.Reference;
import com.Bart.Mynite.world.generator.WorldGeneratorMynite;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(
		modid=Reference.MOD_ID,
		name=Reference.MOD_NAME,
		version=Reference.VERSION)

@NetworkMod(
		channels = {Reference.CHANNEL_NAME},
		serverSideRequired = false,
		clientSideRequired = true)

public class Mynite {
	
	WorldGeneratorMynite worldGenerator = new WorldGeneratorMynite();

	@SidedProxy(
			clientSide = Reference.CLIENT_PROXY_LOCATION,
			serverSide = Reference.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	public static CreativeTabs TabMynite = new TabMynite(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		
		LocalizationHandler.loadLanguages();
		
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));

		ModBlocks.BlocksInit();
		
		ModItems.ItemInit();
		
		GameRegistry.registerWorldGenerator(worldGenerator);
	}
	@Init
	public void Init(FMLInitializationEvent event){
		
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
