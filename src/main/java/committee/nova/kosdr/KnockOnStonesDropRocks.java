package committee.nova.kosdr;

import committee.nova.kosdr.init.BlockInit;
import committee.nova.kosdr.init.ContainerTypeInit;
import committee.nova.kosdr.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author goulixiaoji
 */
@Mod(KnockOnStonesDropRocks.MOD_ID)
public class KnockOnStonesDropRocks {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "kosdr";

    public KnockOnStonesDropRocks() {

        final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modBus);
        BlockInit.BLOCKS.register(modBus);
        ContainerTypeInit.CONTAINERS.register(modBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
