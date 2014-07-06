package micromodfarmer.items;


import micromodfarmer.libs.References;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Rotavator extends ModItem {

	public Rotavator(String string) {
		super(string);
		this.setTextureName(References.RESOURCESPREFIX+"rotavator");
		this.setMaxDamage(16);
		}
	

	
	
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player,
			World world, int x, int y, int z, int side, float hitX, float hitY,
			float hitZ) {
		for(int i = -1;i<2;i++){
			for(int j = -1;j<2;j++){
				if((world.getBlock(x+i, y, z+j) == Blocks.dirt || world.getBlock(x+i, y, z+j) == Blocks.grass) && world.getBlock(x, y+1, z) == Blocks.air ){
				world.setBlock(x+i, y, z+j, Blocks.air);
				world.setBlock(x+i, y, z+j, Blocks.farmland);
				}
			}
		}
		stack.setItemDamage(stack.getItemDamage()+1);
		if(stack.getItemDamage()>stack.getMaxDamage()){
			stack.stackSize--;
		}
		return super.onItemUseFirst(stack, player, world, x, y, z, side, hitX, hitY,
				hitZ);
	}

}
