//package com.hyrega.taletweaks.core.init;
//
//import net.minecraftforge.client.event.ModelRegistryEvent;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//
//import com.hyrega.taletweaks.TaleTweaks;
//import com.hyrega.taletweaks.common.entities.TaleogathEntity;
//
//import net.minecraft.entity.EntityClassification;
//import net.minecraft.entity.EntityType;
//import net.minecraft.util.ResourceLocation;
//
//public class EntityInit {
//	
//	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, TaleTweaks.MOD_ID);
//	
//	//Register Taleogath as a DeferredRegister. This is where I give up...
//	public static final RegistryObject<EntityType<TaleogathEntity>> TALEOGATH_ENTITY = 
//			ENTITY_TYPES.register("taleogath_entity", () -> EntityType.Builder.<TaleogathEntity>create(TaleogathEntity::new, 
//					EntityClassification.CREATURE).size(0.8f, 0.8f).build(new ResourceLocation (TaleTweaks.MOD_ID, "taleogath_entity").toString()));
//}