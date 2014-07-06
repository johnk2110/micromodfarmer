package micromodfarmer.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class CommonProxy {

	public int addArmor(String string) {
		// TODO Auto-generated method stub
		return RenderingRegistry.addNewArmourRendererPrefix(string);
	}
}
