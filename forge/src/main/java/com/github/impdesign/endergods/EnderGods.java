package com.github.impdesign.endergods;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.github.impdesign.endergods.help.Reference;
import com.github.impdesign.endergods.init.ModItems;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class EnderGods 
{
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
