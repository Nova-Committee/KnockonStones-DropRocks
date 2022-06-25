package committee.nova.kosdr.init;

import committee.nova.kosdr.KnockOnStonesDropRocks;
import committee.nova.kosdr.block.StoneCraftingTable;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author goulixiaoji
 */
public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KnockOnStonesDropRocks.MOD_ID);

    public static final RegistryObject<Block> STONE_CRAFTING_TABLE_BLOCK = BLOCKS.register("stone_crafting_table",
            ()-> new StoneCraftingTable(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE)
                    .strength(1.5F, 6.0F)));
}
