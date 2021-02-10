package com.hyrega.taletweaks.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CinderstoneFuel extends Item {
	
	public CinderstoneFuel(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 1800;
	}
}
