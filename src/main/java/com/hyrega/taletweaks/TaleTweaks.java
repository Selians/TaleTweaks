package com.hyrega.taletweaks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hyrega.taletweaks.core.init.BlockInit;
import com.hyrega.taletweaks.core.init.ItemInit;
import com.hyrega.taletweaks.world.OreGeneration;

@Mod(TaleTweaks.MOD_ID)
public class TaleTweaks
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "taletweaks";

    public TaleTweaks() {
    	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
                
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

}