package com.avale1648.thedarkmarshes.proxy;

import com.avale1648.thedarkmarshes.blocks.BlockRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void PreInit(FMLPreInitializationEvent e)
    {
        super.PreInit(e);
    }
    @Override
    public void Init(FMLInitializationEvent e)
    {
        super.Init(e);
        BlockRegister.RegisterRender();
    }
    @Override
    public void PostInit(FMLPostInitializationEvent e)
    {
        super.PostInit(e);
    }
}
