package net.chickenofgold.bwm.entity;

import net.chickenofgold.bwm.item.custom.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class KunaiProjectileEntity extends ThrowableItemProjectile {
    public KunaiProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public KunaiProjectileEntity(Level pLevel) {
        super(ModEntities.KUNAI_PROJECTILE.get(), pLevel);
    }

    public KunaiProjectileEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.KUNAI_PROJECTILE.get(), livingEntity, pLevel);
    }


    @Override
    protected Item getDefaultItem() {
        return ModItems.KUNAI.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        Entity $$1 = pResult.getEntity();

        $$1.hurt(this.damageSources().thrown(this, this.getOwner()), 6f);
    }

    @Override
    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte) 3);
            this.discard();
        }

    }
}
