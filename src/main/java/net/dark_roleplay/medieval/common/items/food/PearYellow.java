package net.dark_roleplay.medieval.common.items.food;

import net.dark_roleplay.medieval.common.handler.DRPMedievalCreativeTabs;
import net.minecraft.item.ItemFood;

public class PearYellow extends ItemFood {

	public PearYellow() {
		super(4, 0.3F, false);
		setCreativeTab(DRPMedievalCreativeTabs.drpmedievalFoodTab);
		this.setRegistryName("PearYellow");
		setUnlocalizedName("PearYellow");
		setMaxStackSize(64);
	}

}