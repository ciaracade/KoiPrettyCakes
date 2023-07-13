package net.koishomaru.prettycakes;

import net.koishomaru.prettycakes.block.ModBlocks;
import net.koishomaru.prettycakes.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrettyCakes.MODID);

    public static final RegistryObject<CreativeModeTab> KOI_PRETTY_CAKES_TAB = CREATIVE_MODE_TABS.register("koi_pretty_cakes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CREAM.get()))
                    .title(Component.translatable("creativetab.koi_pretty_cakes_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CREAM.get());
                        pOutput.accept(Items.MILK_BUCKET);
                        pOutput.accept(Items.SUGAR);
                        pOutput.accept(Items.EGG);
                        pOutput.accept(Items.RED_DYE);
                        pOutput.accept(Items.GREEN_DYE);
                        pOutput.accept(Items.BLUE_DYE);
                        pOutput.accept(Items.YELLOW_DYE);
                        pOutput.accept(Items.ORANGE_DYE);
                        pOutput.accept(Items.PINK_DYE);
                        pOutput.accept(Items.PURPLE_DYE);
                        pOutput.accept(Items.LIGHT_BLUE_DYE);
                        pOutput.accept(Items.LIME_DYE);
                        pOutput.accept(Items.GRAY_DYE);
                        pOutput.accept(Items.LIGHT_GRAY_DYE);
                        pOutput.accept(Items.CYAN_DYE);
                        pOutput.accept(Items.MAGENTA_DYE);
                        pOutput.accept(Items.BROWN_DYE);
                        pOutput.accept(Items.BLACK_DYE);
                        pOutput.accept(Items.WHITE_DYE);
                        pOutput.accept(ModBlocks.CAKE_BASE.get());
                        pOutput.accept(ModBlocks.WHITE_CAKE.get());
                        pOutput.accept(ModBlocks.ORANGE_CAKE.get());
                        pOutput.accept(ModBlocks.MAGENTA_CAKE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_CAKE.get());
                        pOutput.accept(ModBlocks.YELLOW_CAKE.get());
                        pOutput.accept(ModBlocks.LIME_CAKE.get());
                        pOutput.accept(ModBlocks.PINK_CAKE.get());
                        pOutput.accept(ModBlocks.GRAY_CAKE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_CAKE.get());
                        pOutput.accept(ModBlocks.CYAN_CAKE.get());
                        pOutput.accept(ModBlocks.PURPLE_CAKE.get());
                        pOutput.accept(ModBlocks.BLUE_CAKE.get());
                        pOutput.accept(ModBlocks.BROWN_CAKE.get());
                        pOutput.accept(ModBlocks.GREEN_CAKE.get());
                        pOutput.accept(ModBlocks.RED_CAKE.get());
                        pOutput.accept(ModBlocks.BLACK_CAKE.get());
                        pOutput.accept(ModItems.WHITE_CREAM.get());
                        pOutput.accept(ModItems.ORANGE_CREAM.get());
                        pOutput.accept(ModItems.MAGENTA_CREAM.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_CREAM.get());
                        pOutput.accept(ModItems.YELLOW_CREAM.get());
                        pOutput.accept(ModItems.LIME_CREAM.get());
                        pOutput.accept(ModItems.PINK_CREAM.get());
                        pOutput.accept(ModItems.GRAY_CREAM.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_CREAM.get());
                        pOutput.accept(ModItems.CYAN_CREAM.get());
                        pOutput.accept(ModItems.PURPLE_CREAM.get());
                        pOutput.accept(ModItems.BLUE_CREAM.get());
                        pOutput.accept(ModItems.BROWN_CREAM.get());
                        pOutput.accept(ModItems.GREEN_CREAM.get());
                        pOutput.accept(ModItems.RED_CREAM.get());
                        pOutput.accept(ModItems.BLACK_CREAM.get());


                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
