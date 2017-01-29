package net.drpmedieval.common.items.food;

import net.drpmedieval.common.util.DRPMedievalCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChickenStew extends ItemFood {

	public ChickenStew() {
		super(8, 0.5F, false);
		this.setRegistryName("ChickenStew");
		this.setUnlocalizedName("ChickenStew");
		setMaxStackSize(1);
		this.setCreativeTab(DRPMedievalCreativeTabs.drpmedievalFoodTab);
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn) {

		stack.shrink(1);
		playerIn.getFoodStats().addStats(this, stack);
		//TODO FIX SOUND
		//worldIn.playSoundAtEntity(playerIn, "random.burp", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
		this.onFoodEaten(stack, worldIn, playerIn);
		
		return new ItemStack(Items.BOWL);
	}
}
