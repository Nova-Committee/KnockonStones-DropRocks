package committee.nova.mcst.init;

import committee.nova.mcst.MoreCobblestoneTools;
import net.minecraft.item.Item;
import net.minecraft.item.ShearsItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreCobblestoneTools.MOD_ID);

    public static final RegistryObject<Item> STONE_SHEARS = register("stone_shears", new ShearsItem(new Item.Properties().tab(MoreCobblestoneTools.MCST_TAB).stacksTo(1).durability(137)));// Don't ask me why I use 137, you know!
    public static final RegistryObject<Item> LITTLE_STONE = register("little_stone", new Item(new Item.Properties().tab(MoreCobblestoneTools.MCST_TAB)));

    public static RegistryObject<Item> register(String regName, Item item){
        return ITEMS.register(regName, ()-> item);
    }
}
