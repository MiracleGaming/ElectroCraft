package com.miraclegaming.electrocraft.init;

import com.miraclegaming.electrocraft.item.ItemDestructOCatalyst;
import com.miraclegaming.electrocraft.item.ItemElectroCraft;

import cpw.mods.fml.common.registry.GameRegistry;

//Do @GameRegistry.ObjectHolder(Reference.MOD_ID) in 1.7
public class ModItems 
{
	public static final ItemElectroCraft destructOCatalyst = new ItemDestructOCatalyst(3000);
	
	public static void init()
	{
		GameRegistry.registerItem(destructOCatalyst, "destructOCatalyst");
	}
}
