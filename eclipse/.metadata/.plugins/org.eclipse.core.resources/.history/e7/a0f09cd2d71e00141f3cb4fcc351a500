package com.miraclegaming.electrocraft;

import com.miraclegaming.electrocraft.proxy.IProxy;
import com.miraclegaming.electrocraft.reference.Reference;
import com.miraclegaming.electrocraft.utility.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
																					//Add , guiFactory = Reference.GUI_FACTORY_CLASS in 1.7 for Gui enabled configs.
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ElectroCraft
{

    @Mod.Instance(Reference.MOD_ID)
    public static ElectroCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //ConfigurationHandler.Init(event.getSuggestedConfigurationFile());
        //FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("pre-Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Initialization Complete!");
    }

}
