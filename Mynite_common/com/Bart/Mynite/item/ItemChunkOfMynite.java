package com.Bart.Mynite.item;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.lib.Strings;

public class ItemChunkOfMynite extends ItemMynite {
	public ItemChunkOfMynite(int id){
		super(id);
		this.setCreativeTab(Mynite.TabMynite);
		this.setUnlocalizedName(Strings.CHUNKOFMYNITE_NAME);
	}
}
