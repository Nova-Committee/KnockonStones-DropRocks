package committee.nova.kosdr.container;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.util.IWorldPosCallable;

/**
 * @author goulixiaoji
 */
public class CraftingContainer extends WorkbenchContainer {

    private final Block workbench;
    private final IWorldPosCallable callable;

    public CraftingContainer(int id, PlayerInventory inventory, IWorldPosCallable callable, Block workbench) {
        super(id, inventory, callable);
        this.workbench = workbench;
        this.callable = callable;
    }

    protected static boolean isWithinUsableDistance(IWorldPosCallable callable, PlayerEntity player, Block workbenchBlock){
        return callable.evaluate(
                (world, pos) ->
                        (world.getBlockState(pos).getBlock() == workbenchBlock) && (player.distanceToSqr(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D) <=48)
        ).get();
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return CraftingContainer.isWithinUsableDistance(this.callable, player, this.workbench);
    }
}
