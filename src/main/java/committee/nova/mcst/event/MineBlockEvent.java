package committee.nova.mcst.event;

import committee.nova.mcst.init.ModItemsInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber
public class MineBlockEvent {

    @SubscribeEvent
    public static void onBlockBreak(final BlockEvent.BreakEvent event){
        BlockState state = event.getState();
        PlayerEntity player = event.getPlayer();

        if (!(state.is(Blocks.STONE) || state.is(Blocks.COBBLESTONE)) || player.isCreative()) return;

        IWorld world = event.getWorld();
        BlockPos pos = event.getPos();

        ItemStack stackInHand = player.getMainHandItem();
        int level = stackInHand.getHarvestLevel(ToolType.PICKAXE, player, state);

        //stone's HarvestLevel is 0
        if (0 > level){
            world.removeBlock(pos, true);
            Random random = new Random();
            ItemStack stack = new ItemStack(ModItemsInit.LITTLE_STONE.get());
            stack.setCount(random.nextInt(3));

            ItemEntity itemEntity = new ItemEntity(player.level, pos.getX(), pos.getY(), pos.getZ(), stack);

           world.addFreshEntity(itemEntity);

        }


    }

}
