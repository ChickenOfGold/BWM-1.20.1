package net.chickenofgold.bwm.item;
import net.chickenofgold.bwm.BWM;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BWM.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CHEFS_DREAM_TAB = CREATIVE_MODE_TABS.register("bwm_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KATANA.get()))
                    .title(Component.translatable("creativetab.bwm"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        //Weapons
                        pOutput.accept(ModItems.KATANA.get());
                        pOutput.accept(ModItems.SAI.get());
                        pOutput.accept(ModItems.BO.get());
                        pOutput.accept(ModItems.NAGINATA.get());
                        pOutput.accept(ModItems.MACE.get());
                        pOutput.accept(ModItems.TAMA_KNIFE.get());
                        pOutput.accept(ModItems.KNIFE.get());

                        //Materials
                        pOutput.accept(ModItems.MORNING_STAR.get());
                        pOutput.accept(ModItems.IRON_SAND.get());
                        pOutput.accept(ModItems.TAMAHAGANE.get());
                        pOutput.accept(ModItems.BLADE.get());




                    })
                    .build() );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
