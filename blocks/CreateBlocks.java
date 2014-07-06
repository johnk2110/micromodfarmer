package micromodfarmer.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class CreateBlocks {
	
	public static Block trial;
	
	public static void init(){
		//trial = new ModBlock("trial");
	}

	
	public static void register(ModBlock block)
	{
	    GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
	}
}
