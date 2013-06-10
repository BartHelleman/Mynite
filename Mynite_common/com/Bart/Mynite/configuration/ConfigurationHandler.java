package com.Bart.Mynite.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.Bart.Mynite.lib.BlockIds;
import com.Bart.Mynite.lib.ItemIds;
import com.Bart.Mynite.lib.Reference;
import com.Bart.Mynite.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
	public static Configuration config;
	
	public static void init(File file){
		config = new Configuration(file);
		
		try{
			config.load();
			
			BlockIds.BLOCKMYNITEORE_ID = config.getBlock(Strings.BLOCKMYNITEORE_NAME, BlockIds.BLOCKMYNITEORE_ID_DEFAULT).getInt(BlockIds.BLOCKMYNITEORE_ID_DEFAULT);
			ItemIds.CHUNKOFMYNITE_ID = config.getItem(Strings.CHUNKOFMYNITE_NAME, ItemIds.CHUNKOFMYNITE_ID_DEFAULT).getInt(ItemIds.CHUNKOFMYNITE_ID_DEFAULT);
			ItemIds.PIECEOFMYNITE_ID = config.getItem(Strings.PIECEOFMYNITE_NAME, ItemIds.PIECEOFMYNITE_ID_DEFAULT).getInt(ItemIds.PIECEOFMYNITE_ID_DEFAULT);
			ItemIds.MYNITEINGOT_ID = config.getItem(Strings.MYNITEINGOT_NAME, ItemIds.MYNITEINGOT_ID_DEFAULT).getInt(ItemIds.MYNITEINGOT_ID_DEFAULT);
			ItemIds.MYNITEPICKAXE_ID = config.getItem(Strings.MYNITEPICKAXE_NAME, ItemIds.MYNITEPICKAXE_ID_DEFAULT).getInt(ItemIds.MYNITEPICKAXE_ID_DEFAULT);
			ItemIds.MYNITEAXE_ID = config.getItem(Strings.MYNITEAXE_NAME, ItemIds.MYNITEAXE_ID_DEFAULT).getInt(ItemIds.MYNITEAXE_ID_DEFAULT);
			ItemIds.MYNITESHOVEL_ID = config.getItem(Strings.MYNITESHOVEL_NAME, ItemIds.MYNITESHOVEL_ID_DEFAULT).getInt(ItemIds.MYNITESHOVEL_ID_DEFAULT);
			ItemIds.MYNITESWORD_ID = config.getItem(Strings.MYNITESWORD_NAME, ItemIds.MYNITESWORD_ID_DEFAULT).getInt(ItemIds.MYNITESWORD_ID_DEFAULT);

			
		}
		catch(Exception e){
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
		}
		finally{
			config.save();
		}
	}
}
