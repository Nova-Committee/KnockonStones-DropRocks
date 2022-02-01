package committee.nova.mcst.common.tab;

import committee.nova.mcst.MoreCobblestoneTools;
import committee.nova.mcst.init.ModItemsInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MCST extends ItemGroup {
    public MCST() {
        super(MoreCobblestoneTools.MOD_ID);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItemsInit.STONE_SHEARS.get());
    }
}
