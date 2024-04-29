package net.chickenofgold.bwm.item;

import net.chickenofgold.bwm.BWM;
import net.chickenofgold.bwm.util.ModTags;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier TAMAHAGANE = TierSortingRegistry.registerTier(
            new ForgeTier(3,800,5f,4f, 25, ModTags.Blocks.NEEDS_TAMAHAGANE,
                    () -> Ingredient.of(ModItems.TAMAHAGANE.get())),
            new ResourceLocation(BWM.MOD_ID, "tamahagane"), List.of(Tiers.STONE), List.of());





}
