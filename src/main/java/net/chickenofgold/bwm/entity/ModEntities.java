package net.chickenofgold.bwm.entity;

import net.chickenofgold.bwm.BWM;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.EnderpearlItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BWM.MOD_ID);

    //Projectiles
        public static final RegistryObject<EntityType<KunaiProjectileEntity>> KUNAI_PROJECTILE =
            ENTITY_TYPES.register("kunai_projectile", () -> EntityType.Builder.<KunaiProjectileEntity>of(KunaiProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f,0.5f).build("kuani_projectile"));
        public static final RegistryObject<EntityType<KunaiProjectileEntity>> ENDSW_PROJECTILE =
            ENTITY_TYPES.register("endsw_projectile", () -> EntityType.Builder.<KunaiProjectileEntity>of(KunaiProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f,0.5f).build("endsw_projectile"));



        public static void register(IEventBus eventBus) { ENTITY_TYPES.register(eventBus);}
}
