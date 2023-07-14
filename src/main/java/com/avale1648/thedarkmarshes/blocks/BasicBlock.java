package com.avale1648.thedarkmarshes.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BasicBlock extends Block
{
    public BasicBlock(String name)
    {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
}
