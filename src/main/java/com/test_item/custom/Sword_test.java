package com.test_item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Sword_test extends Item {
    public Sword_test(Properties properties) {
         super(properties);
      }

        @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    // Add potion effect
    attacker.addEffect(new MobEffectInstance(
            MobEffects.REGENERATION,
            100,
            3 ));
    target.addEffect(new MobEffectInstance(
            MobEffects.POISON,
            100,
            3 
    ));
}
}

