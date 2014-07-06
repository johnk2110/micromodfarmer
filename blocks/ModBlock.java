package micromodfarmer.blocks;

import micromodfarmer.MicroMod;
import micromodfarmer.libs.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block {

	protected ModBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}

	public ModBlock(String string) {
		super(Material.rock);
		this.setBlockName(string);
		this.setCreativeTab(MicroMod.getCreativeTab());
		CreateBlocks.register(this);
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
	    return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	@Override
	public String getUnlocalizedName()
	{
	     return String.format("%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
}
