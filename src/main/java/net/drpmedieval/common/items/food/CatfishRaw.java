package net.drpmedieval.common.items.food;

import net.drpmedieval.common.handler.DRPMedievalCreativeTabs;
import net.minecraft.item.ItemFood;

public class CatfishRaw extends ItemFood {

	public CatfishRaw() {
		super(2, 0.3F, false);
		setCreativeTab(DRPMedievalCreativeTabs.drpmedievalFoodTab);
		this.setRegistryName("CatfishRaw");
		setUnlocalizedName("CatfishRaw");
		setMaxStackSize(64);
	}
}
