package com.miraclegaming.electrocraft.item;

public class ItemDestructOCatalyst extends ItemElectroCraft 
{
	//NO ID's in 1.7
	public ItemDestructOCatalyst(int ID)
	{
		super(ID);
		this.setUnlocalizedName("destructOCatalyst"); //For Names class do: Names.Items.DESTRUCT_O_CATALYST
		this.setTextureName("destructOCatalyst");
		this.setMaxStackSize(1);
		this.getContainerItem();
	}
}
