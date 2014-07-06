package micromodfarmer.items;

import micromodfarmer.MicroMod;
import micromodfarmer.libs.References;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItem extends Item {
	
	
	
	public ModItem(String string) {
		this.setUnlocalizedName(string);
		this.setCreativeTab(MicroMod.getCreativeTab());
		CreateItems.register(this);
	}

	public String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
 
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
 
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
 

}
