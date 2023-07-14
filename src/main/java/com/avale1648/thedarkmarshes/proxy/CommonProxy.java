package com.avale1648.thedarkmarshes.proxy;
import com.avale1648.thedarkmarshes.blocks.BlockRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
public class CommonProxy
{
    public void PreInit(FMLPreInitializationEvent e)
    {
        BlockRegister.Register();
    }

    public void Init(FMLInitializationEvent e)
    {

    }

    public void PostInit(FMLPostInitializationEvent e) {

    }
}
