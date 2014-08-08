package com.miraclegaming.electrocraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.miraclegaming.electrocraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemElectroCraft extends Item 
{
	//NO ID's in 1.7
	public ItemElectroCraft(int ID) {
		super(ID-256);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)		//IIconRegister in 1.7
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
}
