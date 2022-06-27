package committee.nova.kosdr.init;

import committee.nova.kosdr.KnockOnStonesDropRocks;
import committee.nova.kosdr.item.StoneShears;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author goulixiaoji
 */
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KnockOnStonesDropRocks.MOD_ID);

    public static final RegistryObject<Item> ROCK_ITEM = ITEMS.register("rock", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_CRAFTING_TABLE_BLOCK_ITEM = ITEMS.register("stone_crafting_table", ()->
            new BlockItem(BlockInit.STONE_CRAFTING_TABLE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STONE_SHEARS = ITEMS.register("stone_shears",()-> new StoneShears(new Item.Properties().defaultDurability(137)));
    public static final RegistryObject<Item> STONE_STICK = ITEMS.register("stone_stick", ()-> new Item(new Item.Properties()));
}
