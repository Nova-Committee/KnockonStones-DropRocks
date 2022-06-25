package committee.nova.kosdr.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.tags.BlockTags;

/**
 * @author goulixiaoji
 */
public class StoneShears extends ShearsItem {
    public StoneShears(Properties properties) {
        super(properties);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if (!state.is(Blocks.COBWEB) && !state.is(BlockTags.LEAVES)) {
            return state.is(BlockTags.WOOL) ? 5.0F : super.getDestroySpeed(stack, state);
        }
        return 10.0F;
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState state) {
        return state.is(Blocks.COBWEB) || state.is(Blocks.REDSTONE_WIRE) || state.is(Blocks.TRIPWIRE) || state.is(Blocks.GRASS);
    }

}
