package com.Bart.Mynite.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.lib.Strings;

public class ItemMyniteAxe extends ItemAxe{

	public ItemMyniteAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1-256, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.MYNITEAXE_NAME);
		this.setCreativeTab(Mynite.TabMynite);
		

	}
	
	

}
