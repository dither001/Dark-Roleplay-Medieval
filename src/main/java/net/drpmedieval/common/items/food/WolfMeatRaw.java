package net.drpmedieval.common.items.food;

import net.drpmedieval.common.handler.DRPMedievalCreativeTabs;
import net.minecraft.item.ItemFood;

public class WolfMeatRaw extends ItemFood {

	public WolfMeatRaw() {
		super(2, 0.15F, false);
		setCreativeTab(DRPMedievalCreativeTabs.drpmedievalFoodTab);
		this.setRegistryName("WolfMeatRaw");
		setUnlocalizedName("WolfMeatRaw");
		setMaxStackSize(64);
	}

}
