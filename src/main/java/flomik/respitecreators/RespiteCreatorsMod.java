package flomik.respitecreators;

import flomik.respitecreators.init.ModFluidsRegister;
import flomik.respitecreators.init.ModItemsRegister;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RespiteCreatorsMod implements ModInitializer {
    public static final String MOD_ID = "respitecreators";
	public static final Logger LOGGER = LoggerFactory.getLogger("Respite Creators");

	@Override
	public void onInitialize() {
		ModFluidsRegister.register();
		ModItemsRegister.registerModItems();
	}
}