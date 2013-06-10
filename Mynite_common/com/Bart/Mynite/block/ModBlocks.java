package com.Bart.Mynite.block;

import net.minecraft.block.Block;

import com.Bart.Mynite.lib.BlockIds;
import com.Bart.Mynite.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block MyniteOre;
	public static void BlocksInit(){
		MyniteOre = new BlockMyniteOre(BlockIds.BLOCKMYNITEORE_ID);
		
		GameRegistry.registerBlock(MyniteOre, Strings.BLOCKMYNITEORE_NAME);
	}	

	
	}
