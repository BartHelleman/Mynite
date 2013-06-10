package com.Bart.Mynite.item;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.lib.Strings;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemMynitePickaxe extends ItemPickaxe {

	public ItemMynitePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1-256, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.MYNITEPICKAXE_NAME);
		this.setCreativeTab(Mynite.TabMynite);
	}
	
}
