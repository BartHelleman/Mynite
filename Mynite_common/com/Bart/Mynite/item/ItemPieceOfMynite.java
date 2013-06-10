package com.Bart.Mynite.item;

import com.Bart.Mynite.Mynite;
import com.Bart.Mynite.lib.Strings;

public class ItemPieceOfMynite extends ItemMynite {
	public ItemPieceOfMynite(int id){
		super(id);
		this.setCreativeTab(Mynite.TabMynite);
		this.setUnlocalizedName(Strings.PIECEOFMYNITE_NAME);
	}
}
