package net.koishomaru.prettycakes.items;

import net.koishomaru.prettycakes.PrettyCakes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrettyCakes.MODID);

    public static final RegistryObject<Item> CREAM = ITEMS.register("cream",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
