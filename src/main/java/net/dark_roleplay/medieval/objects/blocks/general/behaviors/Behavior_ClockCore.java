package net.dark_roleplay.medieval.objects.blocks.general.behaviors;

import net.dark_roleplay.library.experimental.blocks.behaviors.IActivatedBehavior;
import net.dark_roleplay.medieval.holders.MedievalItems;
import net.dark_roleplay.medieval.objects.blocks.utility.other.clock_core.TileEntityClockCore;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class Behavior_ClockCore implements IActivatedBehavior{

	@Override
	public boolean execute(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(player.getHeldItemMainhand().getItem() == MedievalItems.WOOD_WRENCH){
			TileEntity te = world.getTileEntity(pos);
			if(te != null && te instanceof TileEntityClockCore){
				TileEntityClockCore teCC = (TileEntityClockCore) te;
				if(teCC.isRealTime()){
					teCC.setRealTime(false);
					player.sendStatusMessage(new TextComponentTranslation("drpcore.blocks.clock_core.change.ingame"), true);
				}else{
					teCC.setRealTime(true);
					player.sendStatusMessage(new TextComponentTranslation("drpcore.blocks.clock_core.change.real"), true);
				}
			}
			return true;
		}
        return false;
	}

}