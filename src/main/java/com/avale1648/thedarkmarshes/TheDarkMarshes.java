package com.avale1648.thedarkmarshes;

import com.avale1648.thedarkmarshes.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

@Mod(modid = TheDarkMarshes.MODID, name = TheDarkMarshes.NAME, version = TheDarkMarshes.VERSION)
public class TheDarkMarshes
{
    public static final String MODID = "thedarkmarshes";
    public static final String NAME = "The Dark Marshes";
    public static final String VERSION = "1.0.0";
    @SidedProxy(clientSide = "com.avale1648.thedarkmarshes.proxy.ClientProxy", serverSide = "com.avale1648.thedarkmarshes.proxy.CommonProxy")
    public static CommonProxy commonProxy;
    private static Logger logger;
    @EventHandler
    public void PreInit(FMLPreInitializationEvent e)
    {
        logger = e.getModLog();
        commonProxy.PreInit(e);
    }
    @EventHandler
    public void Init(FMLInitializationEvent e)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        commonProxy.Init(e);
    }
    @EventHandler
    public void PostInit(FMLPostInitializationEvent e)
    {
        commonProxy.PostInit(e);
    }
}
