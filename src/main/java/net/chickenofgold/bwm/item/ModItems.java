package net.chickenofgold.bwm.item;
import net.chickenofgold.bwm.BWM;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BWM.MOD_ID);


    //weapons
    public static final RegistryObject<Item> KATANA = ITEMS.register("katana",
            () -> new SwordItem(ModToolTiers.TAMAHAGANE, 2,-2f, new Item.Properties()));
    public static final RegistryObject<Item> BO= ITEMS.register("bo",
            () -> new SwordItem(Tiers.WOOD, 2,1.6f, new Item.Properties()));


    //materials
    public static final RegistryObject<Item> IRON_SAND = ITEMS.register("iron_sand",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAMAHAGANE = ITEMS.register("tamahagane",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}

