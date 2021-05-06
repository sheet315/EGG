package net.mcreator.quantumrecomplex.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.quantumrecomplex.enchantment.DarksharpEnchantment;
import net.mcreator.quantumrecomplex.QuantumRecomplexModElements;
import net.mcreator.quantumrecomplex.QuantumRecomplexMod;

import java.util.Map;

@QuantumRecomplexModElements.ModElement.Tag
public class LifestealProcedureProcedure extends QuantumRecomplexModElements.ModElement {
	public LifestealProcedureProcedure(QuantumRecomplexModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				QuantumRecomplexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure LifestealProcedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				QuantumRecomplexMod.LOGGER.warn("Failed to load dependency itemstack for procedure LifestealProcedure!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 1)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 15, (int) 1));
		} else if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 2)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 10, (int) 1));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 10, (int) 2));
		} else if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 3)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 15, (int) 2));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 15, (int) 3));
		} else if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 4)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 20, (int) 3));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 20, (int) 4));
		} else if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 5)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 25, (int) 4));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 25, (int) 5));
		} else if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 6)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 30, (int) 5));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 30, (int) 6));
		} else if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 7)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 35, (int) 6));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 35, (int) 7));
		} else if (((EnchantmentHelper.getEnchantmentLevel(DarksharpEnchantment.enchantment, (itemstack))) == 8)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 40, (int) 7));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 40, (int) 8));
		}
	}
}
