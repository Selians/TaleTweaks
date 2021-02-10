package com.hyrega.taletweaks.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HadeanFuel extends Item {
	
	public HadeanFuel(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 18000;
	}
}
