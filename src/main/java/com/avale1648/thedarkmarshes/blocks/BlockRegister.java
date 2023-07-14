package com.avale1648.thedarkmarshes.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRegister
{
    public static Block MossyTempleBricks = new BasicBlock("mossy_temple_bricks");
    public static Block CrackedTempleBricks = new BasicBlock("cracked_temple_bricks");
    public static Block BloodyTempleBricks = new BasicBlock("bloody_temple_bricks");
    public static void Register()
    {
        SetRegister(MossyTempleBricks);
        SetRegister(CrackedTempleBricks);
        SetRegister(BloodyTempleBricks);
    }
    private static void SetRegister(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
    @SideOnly(Side.CLIENT)
    public static void RegisterRender()
    {
        SetRender(MossyTempleBricks);
        SetRender(CrackedTempleBricks);
        SetRender(BloodyTempleBricks);
    }
    @SideOnly(Side.CLIENT)
    private static void SetRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
    }
}
