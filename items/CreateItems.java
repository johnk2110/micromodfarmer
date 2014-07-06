package micromodfarmer.items;



import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.registry.GameRegistry;

public class CreateItems {
	
	public static Item trialItem;
	public static Item rotavator;

	
	public static void init(){
		
		//trialItem = new ModItem("trialItem");
		rotavator = new Rotavator("rotavator");


	}
	
	public static void register(ModItem item)
	{
	    GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));
	}

}
