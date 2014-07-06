package micromodfarmer;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MicroTab extends CreativeTabs {

	public MicroTab(int id, String modid)
    {
        super(id, modid);
    }
 
    @Override
    public Item getTabIconItem()
    {
        return Items.wheat_seeds;
    }

}