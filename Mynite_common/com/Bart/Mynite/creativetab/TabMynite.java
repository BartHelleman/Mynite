package com.Bart.Mynite.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.Bart.Mynite.item.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMynite extends CreativeTabs {
	public TabMynite(int id, String name){
		super(id, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack(){
		
		return new ItemStack(ModItems.MyniteIngot,1,0);
	}
		
}
