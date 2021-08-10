package author.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ModClass.MOD_ID)
public class ModClass {
	
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "modid";
	
	public ModClass() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(this::setup);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		// Setup code //
	}
}
