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
    public static final RegistryObject<Item> WHITE_CREAM = ITEMS.register("white_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_CREAM = ITEMS.register("orange_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_CREAM = ITEMS.register("magenta_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_CREAM = ITEMS.register("light_blue_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CREAM = ITEMS.register("yellow_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_CREAM = ITEMS.register("lime_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_CREAM = ITEMS.register("pink_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_CREAM = ITEMS.register("gray_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_CREAM = ITEMS.register("light_gray_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CREAM = ITEMS.register("cyan_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CREAM = ITEMS.register("purple_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CREAM = ITEMS.register("blue_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CREAM = ITEMS.register("brown_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CREAM = ITEMS.register("green_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_CREAM = ITEMS.register("red_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CREAM = ITEMS.register("black_cream",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
