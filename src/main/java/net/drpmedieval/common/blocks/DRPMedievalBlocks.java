package net.drpmedieval.common.blocks;

import net.drpmedieval.common.DarkRoleplayMedieval;
import net.drpmedieval.common.blocks.building.CleanPlanks;
import net.drpmedieval.common.blocks.building.PackedIceBricks;
import net.drpmedieval.common.blocks.craftingstations.*;
import net.drpmedieval.common.blocks.decorative.*;
import net.drpmedieval.common.blocks.decorative.apiaries.*;
import net.drpmedieval.common.blocks.decorative.barrelChair.*;
import net.drpmedieval.common.blocks.decorative.barrels.*;
import net.drpmedieval.common.blocks.decorative.buckets.*;
import net.drpmedieval.common.blocks.decorative.hangingBridges.HangingBridge2;
import net.drpmedieval.common.blocks.decorative.simpleChairs.SimpleChair;
import net.drpmedieval.common.blocks.decorative.simpleTables.SimpleTable;
import net.drpmedieval.common.blocks.other.RegeneratingOre;
import net.drpmedieval.common.blocks.plants.*;
import net.drpmedieval.common.blocks.plants.apples.Apple;
import net.drpmedieval.common.blocks.plants.mushrooms.Mushroom;
import net.drpmedieval.common.blocks.plants.pears.Pear;
import net.drpmedieval.common.blocks.storage.*;
import net.drpmedieval.common.items.DRPMedievalItems;
import net.drpmedieval.common.items.blocks.CleanPlankItem;
import net.drpmedieval.common.items.seeds.SeedBarley;
import net.drpmedieval.common.util.DRPMedievalCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DRPMedievalBlocks {
	
	/** A **/

	public static Anvil ANVIL = new Anvil("anvil");
	public static Apiary APIARY_OAK = new Apiary("apiary_oak");
	public static Apiary APIARY_BIRCH = new Apiary("apiary_birch");
	public static Apiary APIARY_SPRUCE = new Apiary("apiary_spruce");
	public static Apiary APIARY_JUNGLE = new Apiary("apiary_jungle");
	public static Apiary APIARY_ACACIA = new Apiary("apiary_acacia");
	public static Apiary APIARY_DARK_OAK = new Apiary("apiary_dark_oak");

	public static Apple APPLE_GREEN = new Apple("apple_green", new ItemStack(DRPMedievalItems.AppleGreen, 1)); //TODO FIX APPLES
	public static Apple APPLE_RED = new Apple("apple_red", new ItemStack(Items.APPLE, 1));
	public static Apple APPLE_YELLOW = new Apple("apple_yellow", new ItemStack(DRPMedievalItems.AppleYellow, 1));

	/** B **/

	public static Barley BARLEY = new Barley();
	
	public static BarrelChair BARREL_CHAIR_OAK = new BarrelChair("barrel_chair_oak");
	public static BarrelChair BARREL_CHAIR_BIRCH = new BarrelChair("barrel_chair_birch");
	public static BarrelChair BARREL_CHAIR_SPRUCE = new BarrelChair("barrel_chair_spruce");
	public static BarrelChair BARREL_CHAIR_JUNGLE = new BarrelChair("barrel_chair_jungle");
	public static BarrelChair BARREL_CHAIR_ACACIA = new BarrelChair("barrel_chair_acacia");
	public static BarrelChair BARREL_CHAIR_DARK_OAK = new BarrelChair("barrel_chair_dark_oak");
	
	public static BarrelEmpty BARREL_EMPTY_OAK = new BarrelEmpty("barrel_empty_oak");
	public static BarrelEmpty BARREL_EMPTY_BIRCH = new BarrelEmpty("barrel_empty_birch");
	public static BarrelEmpty BARREL_EMPTY_SPRUCE = new BarrelEmpty("barrel_empty_spruce");
	public static BarrelEmpty BARREL_EMPTY_JUNGLE = new BarrelEmpty("barrel_empty_jungle");
	public static BarrelEmpty BARREL_EMPTY_ACACIA = new BarrelEmpty("barrel_empty_acacia");
	public static BarrelEmpty BARREL_EMPTY_DARK_OAK = new BarrelEmpty("barrel_empty_dark_oak");
	
	public static BarrelFilled BARREL_WATER_OAK = new BarrelFilled("barrel_water_oak");
	public static BarrelFilled BARREL_WATER_BIRCH = new BarrelFilled("barrel_water_birch");
	public static BarrelFilled BARREL_WATER_SPRUCE = new BarrelFilled("barrel_water_spruce");
	public static BarrelFilled BARREL_WATER_JUNGLE = new BarrelFilled("barrel_water_jungle");
	public static BarrelFilled BARREL_WATER_ACACIA = new BarrelFilled("barrel_water_acacia");
	public static BarrelFilled BARREL_WATER_DARK_OAK = new BarrelFilled("barrel_water_dark_oak");
	
	public static BarrelClosed BARREL_CLOSED_OAK = new BarrelClosed("barrel_closed_oak");
	public static BarrelClosed BARREL_CLOSED_BIRCH = new BarrelClosed("barrel_closed_birch");
	public static BarrelClosed BARREL_CLOSED_SPRUCE = new BarrelClosed("barrel_closed_spruce");
	public static BarrelClosed BARREL_CLOSED_JUNGLE = new BarrelClosed("barrel_closed_jungle");
	public static BarrelClosed BARREL_CLOSED_ACACIA = new BarrelClosed("barrel_closed_acacia");
	public static BarrelClosed BARREL_CLOSED_DARK_OAK = new BarrelClosed("barrel_closed_dark_oak");
	
	public static BarrelFilled BARREL_GUNPOWDER_OAK = new BarrelFilled("barrel_gunpowder_oak");
	public static BarrelFilled BARREL_GUNPOWDER_BIRCH = new BarrelFilled("barrel_gunpowder_birch");
	public static BarrelFilled BARREL_GUNPOWDER_SPRUCE = new BarrelFilled("barrel_gunpowder_spruce");
	public static BarrelFilled BARREL_GUNPOWDER_JUNGLE = new BarrelFilled("barrel_gunpowder_jungle");
	public static BarrelFilled BARREL_GUNPOWDER_ACACIA = new BarrelFilled("barrel_gunpowder_acacia");
	public static BarrelFilled BARREL_GUNPOWDER_DARK_OAK = new BarrelFilled("barrel_gunpowder_dark_oak");
		
	public static BedFrame BED_FRAME_OAK = new BedFrame("bed_frame_oak", DRPMedievalItems.BedFrameOak);
	public static BedFrame BED_FRAME_SPRUCE = new BedFrame("bed_frame_spruce", DRPMedievalItems.BedFrameSpruce);
	public static BedFrame BED_FRAME_BIRCH = new BedFrame("bed_frame_birch", DRPMedievalItems.BedFrameBirch);
	public static BedFrame BED_FRAME_JUNGLE = new BedFrame("bed_frame_jungle", DRPMedievalItems.BedFrameJungle);
	public static BedFrame BED_FRAME_ACACIA = new BedFrame("bed_frame_acacia", DRPMedievalItems.BedFrameAcacia);
	public static BedFrame BED_FRAME_DARK_OAK = new BedFrame("bed_frame_dark_oak", DRPMedievalItems.BedFrameDarkOak);

	public static BookOne bookOne = new BookOne("book_one");
	public static BucketDirt BUCKET_DIRT = new BucketDirt("bucket_dirt");
	public static Bucket BUCKET_EMPTY = new Bucket("bucket_empty");
	public static Bucket BUCKET_WATER = new Bucket("bucket_water");

	/** C **/

	public static Cauldron CAULDRON = new Cauldron("cauldron");
	public static Chain CHAIN = new Chain("chain");
	public static ChoppingBlock CHOPPING_BLOCK = new ChoppingBlock("chopping_block");
	public static CleanPlanks CLEAN_PLANKS = new CleanPlanks("clean_planks");
	public static Crate CRATE = new Crate("crate");

	/** D **/

	public static DungeonChest DUNGEON_CHEST = new DungeonChest("dungeon_chest");

	/** E **/

	/** F **/

	public static Firepit FIREPIT = new Firepit("firepit_lit");

	/** G **/

	public static GoldenShipsBell GOLDEN_SHIPS_BELL = new GoldenShipsBell("golden_ship_bell");
	public static Grindstone GRINDSTONE = new Grindstone("grindstone");

	/** H **/

	public static HangingBridge HANGING_BRIDGE = new HangingBridge("hanging_bridge");
	public static HangingBridge2 HANGING_BRIDGE_BOTTOM = new HangingBridge2("hanging_bridge_bottom" ,0F); //TODO NEW
	public static HangingBridge2 HANGING_BRIDGE_TOP = new HangingBridge2("hanging_bridge_top" ,0.5F); //TODO NEW
	public static HangingCauldron HANGING_CAULDRON = new HangingCauldron("hanging_cauldron");

	/** I **/
	public static Hook IRON_HOOK = new Hook("iron_hook");
	
	/** J **/

	/** K **/

	public static KeyHanging KEY_HANGING = new KeyHanging("key_hanging");

	/** L **/

	public static LogChair LOG_CHAIR_OAK = new LogChair("log_chair_oak");
	public static LogChair LOG_CHAIR_SPRUCE = new LogChair("log_chair_spruce");
	public static LogChair LOG_CHAIR_BIRCH = new LogChair("log_chair_birch");
	public static LogChair LOG_CHAIR_JUNGLE = new LogChair("log_chair_jungle");
	public static LogChair LOG_CHAIR_ACACIA = new LogChair("log_chair_acacia");
	public static LogChair LOG_CHAIR_DARK_OAK = new LogChair("log_chair_dark_oak");

	
	/** M **/

	public static Mortar MORTAR = new Mortar("mortar");
	public static MugBeer MUG_BEER = new MugBeer("mug_beer");
	public static MugEmpty MUG_EMPTY = new MugEmpty("mug_empty");
	public static Mushroom MUSHROOM_BROWN = new Mushroom("mushroom_brown");
	public static Mushroom MUSHROOM_RED = new Mushroom("mushroom_red");

	/** N **/

	/** O **/

	/** P **/

	public static PackedIceBricks PACKED_ICE_BRICKS = new PackedIceBricks("packed_ice_bricks");
	public static Pear PEAR_GREEN = new Pear("pear_green", new ItemStack(DRPMedievalItems.PearGreen, 1)); //TODO FIX PEARS
	public static Pear PEAR_YELLOW = new Pear("pear_yellow", new ItemStack(DRPMedievalItems.PearYellow, 1));
	public static PotionEmpty POTION_EMPTY = new PotionEmpty("potion_empty"); //TODO Fix Potions

	/** Q **/

	/** R **/

	public static RegeneratingOre rgO = new RegeneratingOre("regenOre", DRPMedievalCreativeTabs.drpmedievalMiscTab, 0.4F, 5); //TODO REGENERATING ORES
	public static Rope ROPE = new Rope("rope");
	public static RopeAnchor ROPE_ANCHOR = new RopeAnchor("rope_anchor");

	/** S **/

	public static SimpleChair SIMPLE_CHAIR_OAK = new SimpleChair("simple_chair_oak");;
	public static SimpleChair SIMPLE_CHAIR_BIRCH = new SimpleChair("simple_chair_birch");
	public static SimpleChair SIMPLE_CHAIR_SPRUCE = new SimpleChair("simple_chair_spruce");
	public static SimpleChair SIMPLE_CHAIR_JUNGLE = new SimpleChair("simple_chair_jungle");
	public static SimpleChair SIMPLE_CHAIR_ACACIA = new SimpleChair("simple_chair_acacia");
	public static SimpleChair SIMPLE_CHAIR_DARK_OAK = new SimpleChair("simple_chair_dark_oak");
	
	public static SimpleTable SIMPLE_TABLE_OAK = new SimpleTable("simple_table_oak");
	public static SimpleTable SIMPLE_TABLE_BIRCH = new SimpleTable("simple_table_birch");
	public static SimpleTable SIMPLE_TABLE_SPRUCE = new SimpleTable("simple_table_spruce");
	public static SimpleTable SIMPLE_TABLE_JUNGLE = new SimpleTable("simple_table_jungle");
	public static SimpleTable SIMPLE_TABLE_ACACIA = new SimpleTable("simple_table_acacia");
	public static SimpleTable SIMPLE_TABLE_DARK_OAK = new SimpleTable("simple_table_dark_oak");
	
	public static ShipsHelm SHIPS_HELM = new ShipsHelm("ships_helm");
	
	public static SpinningWheel SPINNING_WHEEL = new SpinningWheel("spinning_wheel");

	/** T **/

	public static Target TARGET = new Target("target");
	public static TorchHolderEmpty TORCH_HOLDER_EMPTY = new TorchHolderEmpty("torch_holder_empty");
	public static TorchHolderLit TORCH_HOLDER_LIT = new TorchHolderLit("torch_holder_lit");
	public static TorchHolderUnlit TORCH_HOLDER_UNLIT = new TorchHolderUnlit("torch_holder_unlit");

	/** U **/

	/** V **/

	/** W **/

	/** X **/

	/** Y **/

	/** Z **/

	public static void preInit(FMLPreInitializationEvent event) {
		//registerBlock(rgO);

		registerBlock(SIMPLE_CHAIR_OAK, false);
		registerBlock(SIMPLE_CHAIR_BIRCH, false);
		registerBlock(SIMPLE_CHAIR_SPRUCE, false);
		registerBlock(SIMPLE_CHAIR_JUNGLE, false);
		registerBlock(SIMPLE_CHAIR_ACACIA, false);
		registerBlock(SIMPLE_CHAIR_DARK_OAK, false);
		
		registerBlock(SIMPLE_TABLE_OAK, false);
		registerBlock(SIMPLE_TABLE_BIRCH, false);
		registerBlock(SIMPLE_TABLE_SPRUCE, false);
		registerBlock(SIMPLE_TABLE_JUNGLE, false);
		registerBlock(SIMPLE_TABLE_ACACIA, false);
		registerBlock(SIMPLE_TABLE_DARK_OAK, false);
		
		registerBlock(BARREL_EMPTY_OAK);
		registerBlock(BARREL_EMPTY_BIRCH);
		registerBlock(BARREL_EMPTY_SPRUCE);
		registerBlock(BARREL_EMPTY_JUNGLE);
		registerBlock(BARREL_EMPTY_ACACIA);
		registerBlock(BARREL_EMPTY_DARK_OAK);
		
		registerBlock(BARREL_WATER_OAK);
		registerBlock(BARREL_WATER_BIRCH);
		registerBlock(BARREL_WATER_SPRUCE);
		registerBlock(BARREL_WATER_JUNGLE);
		registerBlock(BARREL_WATER_ACACIA);
		registerBlock(BARREL_WATER_DARK_OAK);
		
		registerBlock(BARREL_CLOSED_OAK);
		registerBlock(BARREL_CLOSED_BIRCH);
		registerBlock(BARREL_CLOSED_SPRUCE);
		registerBlock(BARREL_CLOSED_JUNGLE);
		registerBlock(BARREL_CLOSED_ACACIA);
		registerBlock(BARREL_CLOSED_DARK_OAK);
		
		registerBlock(BARREL_GUNPOWDER_OAK);
		registerBlock(BARREL_GUNPOWDER_BIRCH);
		registerBlock(BARREL_GUNPOWDER_SPRUCE);
		registerBlock(BARREL_GUNPOWDER_JUNGLE);
		registerBlock(BARREL_GUNPOWDER_ACACIA);
		registerBlock(BARREL_GUNPOWDER_DARK_OAK);
		
		registerBlock(BED_FRAME_OAK, null);
		registerBlock(BED_FRAME_BIRCH, null);
		registerBlock(BED_FRAME_SPRUCE, null);
		registerBlock(BED_FRAME_JUNGLE, null);
		registerBlock(BED_FRAME_ACACIA, null);
		registerBlock(BED_FRAME_DARK_OAK, null);
		
		registerBlock(APIARY_OAK);
		registerBlock(APIARY_BIRCH);
		registerBlock(APIARY_SPRUCE);
		registerBlock(APIARY_JUNGLE);
		registerBlock(APIARY_ACACIA);
		registerBlock(APIARY_DARK_OAK);
		
		registerBlock(BARREL_CHAIR_OAK);
		registerBlock(BARREL_CHAIR_BIRCH);
		registerBlock(BARREL_CHAIR_SPRUCE);
		registerBlock(BARREL_CHAIR_JUNGLE);
		registerBlock(BARREL_CHAIR_ACACIA);
		registerBlock(BARREL_CHAIR_DARK_OAK);
		
		registerBlock(LOG_CHAIR_OAK);
		registerBlock(LOG_CHAIR_BIRCH);
		registerBlock(LOG_CHAIR_SPRUCE);
		registerBlock(LOG_CHAIR_JUNGLE);
		registerBlock(LOG_CHAIR_ACACIA);
		registerBlock(LOG_CHAIR_DARK_OAK);
		
		registerBlock(CLEAN_PLANKS, new CleanPlankItem(CLEAN_PLANKS));
		
		registerBlock(CHOPPING_BLOCK);
		registerBlock(APPLE_RED, null);
		registerBlock(APPLE_YELLOW, null);
		registerBlock(APPLE_GREEN, null);
		registerBlock(PEAR_YELLOW, null);
		registerBlock(PEAR_GREEN, null);
		registerBlock(MUSHROOM_BROWN);
		registerBlock(MUSHROOM_RED);
		registerBlock(BUCKET_EMPTY);
		registerBlock(BUCKET_DIRT);
		registerBlock(BUCKET_WATER);
		registerBlock(MUG_EMPTY);
		registerBlock(MUG_BEER);
		registerBlock(MORTAR);
		registerBlock(GRINDSTONE);
		registerBlock(ANVIL);
		registerBlock(CAULDRON);
		registerBlock(HANGING_CAULDRON);
		
		
		registerBlock(HANGING_BRIDGE);
		registerBlock(HANGING_BRIDGE_BOTTOM);
		registerBlock(HANGING_BRIDGE_TOP);
		
		registerBlock(bookOne);
		registerBlock(ROPE);
		registerBlock(ROPE_ANCHOR);
		registerBlock(CHAIN);
		registerBlock(CRATE);
		registerBlock(DUNGEON_CHEST);
		registerBlock(IRON_HOOK);
		registerBlock(KEY_HANGING);
		registerBlock(SHIPS_HELM);
		registerBlock(TARGET);
		registerBlock(TORCH_HOLDER_EMPTY);
		registerBlock(TORCH_HOLDER_UNLIT);
		registerBlock(TORCH_HOLDER_LIT);
		registerBlock(FIREPIT);
		//registerBlock(BARLEY,null);
		registerBlock(PACKED_ICE_BRICKS);
		
		registerBlock(SPINNING_WHEEL);
		
		DRPMedievalItems.SeedBarley = new SeedBarley();
		//DRPMedievalItems.registerItem(DRPMedievalItems.SeedBarley);
		
		registerBlock(GOLDEN_SHIPS_BELL);
		
	}

	public static final void init(FMLInitializationEvent event) {}

	public static final void postInit(FMLPostInitializationEvent event) {}

	//public static final void registerBlockOld(Block block) {

		//GameRegistry.registerBlock(block, (block.getUnlocalizedName().split("[.]"))[1]);
	//}
	
	public static final void registerBlock(Block block) {
		registerBlock(block,new ItemBlock(block).setRegistryName(block.getRegistryName()),true);
	}
	
	public static final void registerBlock(Block block, boolean registerMesh) {
		registerBlock(block,new ItemBlock(block).setRegistryName(block.getRegistryName()), registerMesh);
	}

	public static final void registerBlock(Block block, Item item) {
		registerBlock(block, item, true);

	}
	
	public static final void registerBlock(Block block, Item item, boolean registerMesh) {
		GameRegistry.register(block);
		if(item != null){
			GameRegistry.register(item);
			DarkRoleplayMedieval.proxy.addItemToRegisterMesh(item);
		}
	}
	
}
