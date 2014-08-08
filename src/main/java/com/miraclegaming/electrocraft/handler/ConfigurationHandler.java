package com.miraclegaming.electrocraft.handler;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.event.Event;

import com.miraclegaming.electrocraft.reference.Reference;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void Init(File configFile)

    {
        if (configuration == null)
        {
            Configuration configuration = new Configuration(configFile);
            //loadConfiguration();
        }
    }
}
