package net.drpmedieval.common.blocks.craftingstations;

import java.util.Random;

import net.drpmedieval.common.blocks.templates.DRPMedievalMaterials;
import net.drpmedieval.common.blocks.tileentitys.TileEntityFirepit;
import net.drpmedieval.common.util.DRPMedievalCreativeTabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Firepit extends BlockContainer {

	public Firepit(String registryName) {
		super(DRPMedievalMaterials.wood);
		this.setRegistryName(registryName);
		this.setUnlocalizedName(registryName);
		this.setLightLevel(0.875F);
		this.setCreativeTab(DRPMedievalCreativeTabs.drpmedievalBlocksTab);
		this.setHardness(2F);
		this.setSoundType(SoundType.WOOD);
	}
	
	// -------------------------------------------------- Block Data --------------------------------------------------
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return new AxisAlignedBB(0F,0F,0F,1F,0.625F,1F);
    }
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side){
	        return worldIn.isSideSolid(pos.offset(EnumFacing.DOWN), EnumFacing.UP, true);
	}
	
	// -------------------------------------------------- Block Events --------------------------------------------------
	
	@Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if(world.isRemote){
			//TODO FIX CRAFTING BLOCK player.openGui(DarkRoleplayCore.instance,GuiHandler.GUI_CRAFTING_RECIPESELECTION,player.worldObj,pos.getX(),pos.getY(),pos.getZ());
		}
		return true;
	}
	
	// -------------------------------------------------- Rendering Stuff --------------------------------------------------
	
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand){
		Double x = (double) pos.getX() + 0.25D;
		Double y = (double) pos.getY() + 0.1D;
		Double z = (double) pos.getZ() + 0.25D;
		for(int i = 0; i < 3; i++){
			world.spawnParticle(EnumParticleTypes.FLAME, x + rand.nextDouble() / 2, y + rand.nextDouble() / 2, z + rand.nextDouble() / 2, 0.0D, 0.001D, 0.0D);
			world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, x + rand.nextDouble() / 2, y + rand.nextDouble() / 2, z + rand.nextDouble() / 2, 0.0D, 0.1D, 0.0D);
		}
	}
	
	// -------------------------------------------------- Old Rendering System --------------------------------------------------

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.INVISIBLE;
    }

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {

		return new TileEntityFirepit();
	}
	
}
