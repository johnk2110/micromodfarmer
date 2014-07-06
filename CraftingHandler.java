package micromodfarmer;

import micromodfarmer.items.CreateItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {
	
	public static void init(){
		createRecipes();
	}

	private static void createRecipes() {
		CraftingManager.getInstance().addRecipe(new ItemStack(MicroMod.farmerBoots), "sbs", "ddd", 's', Items.wheat_seeds, 'b', Items.leather_boots, 'd', Blocks.dirt);
		CraftingManager.getInstance().addRecipe(new ItemStack(MicroMod.farmerBottom), "bbb", "dtd","bbb", 'd', new ItemStack(Items.dye,1,4),'t', Items.leather_leggings, 'b',new ItemStack(Items.dye,1,15));
		CraftingManager.getInstance().addRecipe(new ItemStack(MicroMod.farmerTop), "blb","gtg","blb", 'g', Items.gold_ingot, 't', Items.leather_chestplate,'l', new ItemStack(Items.dye,1,4), 'b',new ItemStack(Items.dye,1,15));
		CraftingManager.getInstance().addRecipe(new ItemStack(CreateItems.rotavator), "cic", "cic"," s ", 's', Items.stick, 'c', Blocks.cobblestone, 'i', Items.iron_ingot);
	}

}
