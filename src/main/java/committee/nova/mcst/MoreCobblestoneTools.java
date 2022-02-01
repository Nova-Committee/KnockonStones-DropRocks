package committee.nova.mcst;

import committee.nova.mcst.common.tab.MCST;
import committee.nova.mcst.init.ModBlocksInit;
import committee.nova.mcst.init.ModItemsInit;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreCobblestoneTools.MOD_ID)
public class MoreCobblestoneTools {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mcst";
    public static final ItemGroup MCST_TAB = new MCST();

    public final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public MoreCobblestoneTools() {
        MinecraftForge.EVENT_BUS.register(this);
        ModItemsInit.ITEMS.register(eventBus);
        ModBlocksInit.BLOCKS.register(eventBus);
        LOGGER.info("Thank you to download MoreCobblestoneTools");
    }

}
