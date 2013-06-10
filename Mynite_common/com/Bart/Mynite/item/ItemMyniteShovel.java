package com.Bart.Mynite.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.lib.Strings;


public class ItemMyniteShovel extends ItemSpade {

	public ItemMyniteShovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1-256, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.MYNITESHOVEL_NAME);
		this.setCreativeTab(Mynite.TabMynite);

	}
	

}
