package com.Bart.Mynite.block;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.item.ModItems;
import com.Bart.Mynite.lib.Strings;

public class BlockMyniteOre extends BlockMynite {
	public BlockMyniteOre(int id){
		super(id, Material.rock);
		this.setCreativeTab(Mynite.TabMynite);
		this.setUnlocalizedName(Strings.BLOCKMYNITEORE_NAME);
		this.setHardness(6F);
		this.setResistance(3F);
	}

	@Override
	public int idDropped (int i, Random rand, int j){
		return ModItems.ChunkOfMynite.itemID;
	}
	
	public int quantityDropped(Random par1Random) {
		return 6;
	}}
			
