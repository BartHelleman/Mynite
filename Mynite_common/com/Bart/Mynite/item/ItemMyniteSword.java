package com.Bart.Mynite.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.lib.Strings;

public class ItemMyniteSword extends ItemSword {

	public ItemMyniteSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1-256, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.MYNITESWORD_NAME);
		this.setCreativeTab(Mynite.TabMynite);

	}
	

}
