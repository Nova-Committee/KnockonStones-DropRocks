package committee.nova.kosdr.event;

import committee.nova.kosdr.KnockOnStonesDropRocks;
import committee.nova.kosdr.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

/**
 * @author goulixiaoji
 */
@Mod.EventBusSubscriber
public class MineStoneEvent {

    @SubscribeEvent
    public static void mineStone(BlockEvent.BreakEvent event){
        PlayerEntity player = event.getPlayer();
        BlockPos pos = event.getPos();
        BlockState stoneBlock = event.getState();
        World world = player.getCommandSenderWorld();

        final MinecraftServer mcs = world.getServer();

        Random random = new Random();

        ItemEntity stoneItemEntity = new ItemEntity(EntityType.ITEM, world);
        stoneItemEntity.setItem(new ItemStack(isOnLoad() ? ForgeRegistries.ITEMS.getValue(new ResourceLocation("exnihilosequentia:pebble_stone")) : ItemInit.ROCK_ITEM.get(), random.nextInt(3)+1));
        stoneItemEntity.setPos(pos.getX(), pos.getY(), pos.getZ());

        if (stoneBlock.is(Blocks.STONE) || stoneBlock.is(Blocks.COBBLESTONE) && !(player.isCreative())){

            if (player.getMainHandItem().getHarvestLevel(ToolType.PICKAXE, player, stoneBlock) < 0){

                mcs.overworld().addFreshEntity(stoneItemEntity);
            }
        }
    }

    private static boolean isOnLoad(){
        return ModList.get().isLoaded("exnihilosequentia");
    }
}
