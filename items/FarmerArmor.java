package micromodfarmer.items;

import micromodfarmer.MicroMod;
import micromodfarmer.libs.References;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.common.registry.GameRegistry;

public class FarmerArmor extends ItemArmor {

	int ticks = 0;

	public FarmerArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName("farmerarmor" + p_i45325_3_);
		
		if(p_i45325_3_ ==1){
			this.setTextureName(References.RESOURCESPREFIX+"farmerTop");
		}
		if(p_i45325_3_ ==2){
			this.setTextureName(References.RESOURCESPREFIX+"farmerLegs");
		}
		if(p_i45325_3_ ==3){
			this.setTextureName(References.RESOURCESPREFIX+"farmerBoots");
		}
		this.setCreativeTab(MicroMod.getCreativeTab());

		GameRegistry.registerItem(this, this.getUnlocalizedName());
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		int layer = 1;
		if (slot == 2) {
			layer = 2;
		}
		return References.RESOURCESPREFIX + "textures/models/armor/FarmerArmor"
				+ layer + ".png";
	}
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player,
			ItemStack itemStack) {

		if (!world.isRemote) {
			ItemStack[] top = player.inventory.armorInventory;
			if (top[0] != null && top[1] != null && top[2] != null) {
				if (top[0].getItem() instanceof FarmerArmor
						&& top[1].getItem() instanceof FarmerArmor
						&& top[2].getItem() instanceof FarmerArmor) {
					ticks++;
					if (ticks > 20) {
						int range = 3;
						int x = (int) player.posX;
						int y = (int) player.posY;
						int z = (int) player.posZ;
						for (int i = -range; i < range + 1; i++) {
							for (int j = -range; j < range + 1; j++) {
								Block update = world.getBlock(x + i, y, z
										+ j);
								if (update instanceof IPlantable) {
									update.updateTick(world, x + i, y, z
											+ j, world.rand);
								}

							}
						}
						ticks = 0;
					} else {
						ticks++;
					}
				}

			}
		}
	}

}
