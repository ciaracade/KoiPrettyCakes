package net.koishomaru.prettycakes.block;

import net.koishomaru.prettycakes.PrettyCakes;
import net.koishomaru.prettycakes.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PrettyCakes.MODID);

    public static final RegistryObject<Block> CAKE_BASE = registerBlock("cake_base",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> WHITE_CAKE = registerBlock("white_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> ORANGE_CAKE = registerBlock("orange_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> MAGENTA_CAKE = registerBlock("magenta_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CAKE = registerBlock("light_blue_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> YELLOW_CAKE = registerBlock("yellow_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> LIME_CAKE = registerBlock("lime_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> PINK_CAKE = registerBlock("pink_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> GRAY_CAKE = registerBlock("gray_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CAKE = registerBlock("light_gray_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> CYAN_CAKE = registerBlock("cyan_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> PURPLE_CAKE = registerBlock("purple_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> BLUE_CAKE = registerBlock("blue_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> BROWN_CAKE = registerBlock("brown_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> GREEN_CAKE = registerBlock("green_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> RED_CAKE = registerBlock("red_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> BLACK_CAKE = registerBlock("black_cake",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CAKE)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
