package committee.nova.mcst.init;

import committee.nova.mcst.MoreCobblestoneTools;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocksInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreCobblestoneTools.MOD_ID);

    public static RegistryObject<Block> register(String regName, Block block){
        return BLOCKS.register(regName, ()-> block);
    }
}
