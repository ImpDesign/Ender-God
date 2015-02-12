package com.github.impdesign.endergods.init;

import com.github.impdesign.endergods.help.RegisterHelper;
import com.github.impdesign.endergods.items.EnderGodsItem;

import net.minecraft.item.Item;

public class ModItems 
{
	public static Item waxCandle = new EnderGodsItem().setUnlocalizedName("waxCandle");
	public static void init()
	{
		RegisterHelper.registerItem(waxCandle);
	}
}
