package com.miraclegaming.electrocraft.init;

import com.miraclegaming.electrocraft.block.BlockOreRuby;
import com.miraclegaming.electrocraft.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

//Do @GameRegistry.ObjectHolder(Reference.MOD_ID) in 1.7
public class ModBlocks 
{
	public static final BlockOreRuby oreRuby = new BlockOreRuby(500);
	
	public static void init()
	{
		GameRegistry.registerBlock(oreRuby, "oreRuby");
	}
}
