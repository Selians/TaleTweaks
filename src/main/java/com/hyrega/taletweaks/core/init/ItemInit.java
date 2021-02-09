package com.hyrega.taletweaks.core.init;

import com.hyrega.taletweaks.TaleTweaks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TaleTweaks.MOD_ID);
	
	//Item items
	public static final RegistryObject<Item> TALEIUM_SHARDS = ITEMS.register("taleiumshards",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> CINDERSTONE = ITEMS.register("cinderstone",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> TALEIUMPULVER = ITEMS.register("taleiumpulver",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> TALEBOOK1 = ITEMS.register("talebook1",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> TALEBOOK2 = ITEMS.register("talebook2",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> TALEBOOK3 = ITEMS.register("talebook3",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static Item taleogath_entity_egg;
	
	//Block items
	public static final RegistryObject<BlockItem> TALEIUM_ORE = ITEMS.register("taleium_ore",
			() -> new BlockItem(BlockInit.TALEIUM_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}