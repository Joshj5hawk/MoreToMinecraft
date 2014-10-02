package addedcompat.common;

@Mod(modid=AddedCompat.modid, name="AddedCompat: Alchemy", version=AddedCompat.version, dependencies="required-after:Forge")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class AddedCompat {

	
	public static CreativeTabs tabAddedCompat = new CreativeTabs("tabAddedCompat") {
		public ItemStack getIconItemStack() {
			return new ItemStack(AddedCompat.metaItemCompat);
		}
	};
	
	@SidedProxy(clientSide = "addedcompat.client.ClientProxy", serverSide = "addedcompat.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String modid = "AddedCompat";
	
	public static final String version = "Beta 0.5";
	
	@Instance("AddedCompat")
	public static AddedCompat instance;
	
	public static Block fakeHalfSlab;
	public static int fakeHalfSlabID;
	public static Block fakeDoubleSlab;
	public static int fakeDoubleSlabID;
	
	public void initConfiguration(FMLInitializationEvent event) {
		Configuration config = new Configuration(new File("config/AwesCorp/AddedCompat.cfg"));
		config.load();
		
		fakeHalfSlabID = config.get("Blocks", "The ID AddedCompat uses for the aesthetic half slab", 505).getInt();
		fakeDoubleSlabID = config.get("Blocks", "The ID AddedCompat uses for the aesthetic double slab", 506).getInt();
		
		config.save();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LogHelper.log(Level.INFO, "Preinitialised successfully");
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		this.initConfiguration(event);
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerTable);
		
		fakeHalfSlab = new BlockFakeSlab(this.fakeHalfSlabID, false, metaQuartzCompat, Material.rock).setUnlocalizedName("fakequartzslab");
		fakeDoubleSlab = new BlockFakeSlab(this.fakeDoubleSlabID, true, metaQuartzCompat, Material.rock).setUnlocalizedName("fakequartzdoubleslab");
		
		gameRegisters();
		languageRegisters();
		craftingRecipes();
		smeltingRecipes();
		blockHarvest();
		registerOre();
		
		proxy.registerRenderers();
	}
	

	public void blockHarvest() {
		
	}

	public void smeltingRecipes() {
		
	}

	public void craftingRecipes() {
		
		LogHelper.log(Level.INFO, "Initialised successfully");
		
	}
	
	public void registerOre() {		
		LogHelper.log(Level.INFO, "Registered ores to the OreDictionary");
	}
	

	public void languageRegisters() {
		LanguageRegistry.addName(fakeHalfSlab, "Quartz Slab");
		LanguageRegistry.addName(fakeDoubleSlab, "Quartz Slab");
		
		LanguageRegistry.addName(table, "Alchemical Transmutator");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabAddedCompat", "en_US", "AddedCompat: Alchemy");
	}

	public void gameRegisters() {
		GameRegistry.registerBlock(fakeHalfSlab, "Quartz Slab");
		GameRegistry.registerBlock(fakeDoubleSlab, "Quartz Double Slab");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Item.itemsList[fakeHalfSlab.blockID] =  new ItemSlab(fakeHalfSlab.blockID-256, (BlockFakeSlab)fakeHalfSlab, (BlockFakeSlab)fakeDoubleSlab, false);
		LogHelper.log(Level.INFO, "Postinitialised successfully");
	}
}
