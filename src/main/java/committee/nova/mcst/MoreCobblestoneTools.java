package committee.nova.mcst;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreCobblestoneTools.MOD_ID)
public class MoreCobblestoneTools {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mcst";

    public MoreCobblestoneTools() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Thank you to download MoreCobblestoneTools");
    }

}
