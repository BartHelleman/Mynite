package com.Bart.Mynite.item;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.lib.Strings;

public class ItemMyniteIngot extends ItemMynite {
	public ItemMyniteIngot(int id){
		super(id);
		this.setCreativeTab(Mynite.TabMynite);
		this.setUnlocalizedName(Strings.MYNITEINGOT_NAME);
	}
}
