package com.miraclegaming.electrocraft.block;

public class BlockOreRuby extends BlockElectroCraft 
{
	public BlockOreRuby(int ID)
	{
		super(ID);//setUnlocalizedName = setBlockName in 1.7
		this.setUnlocalizedName("oreRuby");
		this.setTextureName("oreRuby");
		this.setHardness(1.5F);
	}
}
