package net.drpmedieval.common.items.food;

import net.drpmedieval.common.handler.DRPMedievalCreativeTabs;
import net.minecraft.item.ItemFood;

public class WolfMeatCooked extends ItemFood {

	public WolfMeatCooked() {
		super(6, 0.4F, false);
		setCreativeTab(DRPMedievalCreativeTabs.drpmedievalFoodTab);
		this.setRegistryName("WolfMeatCooked");
		setUnlocalizedName("WolfMeatCooked");
		setMaxStackSize(64);
	}
}
