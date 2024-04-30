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
    public static final RegistryObject<Item> TAMA_KNIFE = ITEMS.register("tama_knife",
            () -> new SwordItem(ModToolTiers.TAMAHAGANE, 0,-1f, new Item.Properties()));
    public static final RegistryObject<Item> BO= ITEMS.register("bo",
            () -> new SwordItem(Tiers.WOOD, 2,1.6f, new Item.Properties()));
    public static final RegistryObject<Item> NAGINATA= ITEMS.register("naginata",
            () -> new SwordItem(Tiers.IRON, 6,-2f, new Item.Properties()));
    public static final RegistryObject<Item> MACE= ITEMS.register("mace",
            () -> new SwordItem(Tiers.IRON, 10,-3f, new Item.Properties()));
    public static final RegistryObject<Item> SAI= ITEMS.register("sai",
            () -> new SwordItem(Tiers.IRON, 0,0f, new Item.Properties()));
    public static final RegistryObject<Item> KNIFE= ITEMS.register("knife",
            () -> new SwordItem(Tiers.IRON, -1,4f, new Item.Properties()));


    //materials
    public static final RegistryObject<Item> IRON_SAND = ITEMS.register("iron_sand",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAMAHAGANE = ITEMS.register("tamahagane",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MORNING_STAR = ITEMS.register("morning_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLADE = ITEMS.register("blade",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



}

