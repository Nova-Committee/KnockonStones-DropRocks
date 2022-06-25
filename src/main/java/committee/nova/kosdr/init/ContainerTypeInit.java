package committee.nova.kosdr.init;

import committee.nova.kosdr.KnockOnStonesDropRocks;
import committee.nova.kosdr.container.CraftingContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.IWorldPosCallable;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author goulixiaoji
 */
public class ContainerTypeInit {

    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, KnockOnStonesDropRocks.MOD_ID);

    public static final RegistryObject<ContainerType<CraftingContainer>> CRAFTING_CONTAINER =
            CONTAINERS.register("stone_crafting_table_container",
                    ()-> (IForgeContainerType.create(
                            (id, inventory, data)->
                                    new CraftingContainer(id, inventory,
                                            IWorldPosCallable.create(Minecraft.getInstance().level, data.readBlockPos()),
                                            BlockInit.STONE_CRAFTING_TABLE_BLOCK.get()))));


}
