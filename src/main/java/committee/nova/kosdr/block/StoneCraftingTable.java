package committee.nova.kosdr.block;

import committee.nova.kosdr.container.CraftingContainer;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/**
 * @author goulixiaoji
 */
public class StoneCraftingTable extends CraftingTableBlock {
    private static final ITextComponent CONTAINER_TITLE = new TranslationTextComponent("container.crafting");

    public StoneCraftingTable(Properties properties) {
        super(properties);
    }

    @Override
    public INamedContainerProvider getMenuProvider(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedContainerProvider((id, inventory, data)-> new CraftingContainer(id, inventory, IWorldPosCallable.create(world, pos), this), CONTAINER_TITLE);
    }
}
