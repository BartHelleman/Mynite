package com.Bart.Mynite.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

import com.Bart.Mynite.block.ModBlocks;
import com.Bart.Mynite.lib.ItemIds;
import com.Bart.Mynite.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item ChunkOfMynite;
	public static Item PieceOfMynite;
	public static Item MyniteIngot;
	public static Item MynitePickaxe;
	public static Item MyniteAxe;
	public static Item MyniteShovel;
	public static Item MyniteSword;
	
	
	public static EnumToolMaterial MyniteToolMaterial;
	
	public static void ItemInit(){
	
		MyniteToolMaterial = EnumHelper.addToolMaterial(Strings.MYNITETOOLMATERIAL_NAME, 3, 2048, 15F, 5, 2);
		ChunkOfMynite = new ItemChunkOfMynite(ItemIds.CHUNKOFMYNITE_ID);
		PieceOfMynite = new ItemPieceOfMynite(ItemIds.PIECEOFMYNITE_ID);
		MyniteIngot = new ItemMyniteIngot(ItemIds.MYNITEINGOT_ID);
		MynitePickaxe = new ItemMynitePickaxe(ItemIds.MYNITEPICKAXE_ID, MyniteToolMaterial);
		MyniteAxe = new ItemMyniteAxe(ItemIds.MYNITEAXE_ID, MyniteToolMaterial);
		MyniteShovel = new ItemMyniteShovel(ItemIds.MYNITESHOVEL_ID, MyniteToolMaterial);
		MyniteSword = new ItemMyniteSword(ItemIds.MYNITESWORD_ID, MyniteToolMaterial);
	
		recipesInit();
		
	}
	
	public static void recipesInit(){
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.MynitePickaxe, 1, 0), new Object[]{
			"MMM"," S "," S ", 'M', ModItems.MyniteIngot, 'S', Item.stick 
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.MyniteAxe, 1, 0), new Object[]{
			"MMA","MS "," S ", 'M', ModItems.MyniteIngot, 'S', Item.stick 
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.MyniteShovel, 1, 0), new Object[]{
			" M "," S "," S ", 'M', ModItems.MyniteIngot, 'S', Item.stick 
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.MyniteSword, 1, 0), new Object[]{
			" M "," M "," S ", 'M', ModItems.MyniteIngot, 'S', Item.stick 
		});
		
		GameRegistry.addSmelting(ModItems.ChunkOfMynite.itemID, new ItemStack(ModItems.MyniteIngot,1,0), 8F);


		GameRegistry.addSmelting(ModBlocks.MyniteOre.blockID, new ItemStack(ModItems.MyniteIngot,1,0), 8F);

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PieceOfMynite,1,0), new Object[]{
		new ItemStack(ModItems.ChunkOfMynite), new ItemStack(ModItems.ChunkOfMynite), new ItemStack(ModItems.ChunkOfMynite), new ItemStack(ModItems.ChunkOfMynite), new ItemStack(ModItems.ChunkOfMynite), new ItemStack(ModItems.ChunkOfMynite)	
		});		
		
}}
