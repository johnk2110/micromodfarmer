package micromodfarmer;

import micromodfarmer.blocks.CreateBlocks;
import micromodfarmer.items.CreateItems;
import micromodfarmer.items.FarmerArmor;
import micromodfarmer.libs.References;
import micromodfarmer.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)

public class MicroMod {
	
	public static Item farmerTop,farmerBottom,farmerBoots;

	@SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
	public static CommonProxy proxy;
	
	
	@Mod.Instance
    public static MicroMod instance;
	
private static CreativeTabs wardTab = new MicroTab(CreativeTabs.getNextID(), References.MODID);
	
	public static CreativeTabs getCreativeTab()
    {
        return wardTab;
    }
	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
		final ArmorMaterial farmer = EnumHelper.addArmorMaterial("Farmer", 3, new int[]{1, 3,2,1}, 2);
		int armor = proxy.addArmor("FarmerArmor");
		farmerTop = new FarmerArmor(farmer, armor, 1);
		farmerBottom = new FarmerArmor(farmer, armor, 2);
		farmerBoots = new FarmerArmor(farmer, armor, 3);
		CreateBlocks.init();
		CreateItems.init();
		CraftingHandler.init();
    }
 
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
    }
 
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
    }

}
