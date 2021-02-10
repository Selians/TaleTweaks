//package com.hyrega.taletweaks.common.entities;
//
//import net.minecraft.block.BlockState;
//import net.minecraft.entity.CreatureAttribute;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.IChargeableMob;
//import net.minecraft.entity.MobEntity;
//import net.minecraft.entity.ai.attributes.AttributeModifierMap;
//import net.minecraft.entity.ai.attributes.Attributes;
//import net.minecraft.entity.ai.controller.FlyingMovementController;
//import net.minecraft.entity.monster.BlazeEntity;
//import net.minecraft.pathfinding.FlyingPathNavigator;
//import net.minecraft.util.DamageSource;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.text.ITextComponent;
//import net.minecraft.world.BossInfo;
//import net.minecraft.world.World;
//import net.minecraft.world.server.ServerBossInfo;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//@OnlyIn(value = Dist.CLIENT, _interface = IChargeableMob.class)
//public class TaleogathEntity extends BlazeEntity {
//	
//	private final ServerBossInfo boss = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS);
//
//	public TaleogathEntity(EntityType<? extends TaleogathEntity> type, World world) {
//		super(type, world);
//		this.experienceValue = 666;
//		enablePersistence();
//		this.moveController = new FlyingMovementController(this, 10, true);
//		this.navigator = new FlyingPathNavigator(this, this.world);
//	}
//	
//	public static AttributeModifierMap.MutableAttribute getAttributes() {
//		return MobEntity.func_233666_p_()
//				.createMutableAttribute(Attributes.MAX_HEALTH, 360)
//				.createMutableAttribute(Attributes.ARMOR, 8)
//				.createMutableAttribute(Attributes.FLYING_SPEED, .8)
//				.createMutableAttribute(Attributes.FOLLOW_RANGE, 64)
//				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 8)
//				.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 3);
//	}
//	
//	public void bossTag(ITextComponent name) {
//		super.setCustomName(name);
//		this.boss.setName(this.getDisplayName());
//	}
//	
//	@Override
//	public CreatureAttribute getCreatureAttribute() {
//		return CreatureAttribute.UNDEAD;
//	}
//	
//	@Override
//	public boolean canDespawn(double distanceToClosestPlayer) {
//		return false;
//	}
//
//	@Override
//	public boolean attackEntityFrom(DamageSource source, float amount) {
//		if (source == DamageSource.FALL)
//			return false;
//		if (source == DamageSource.DROWN)
//			return false;
//		if (source == DamageSource.LIGHTNING_BOLT)
//			return false;
//		return super.attackEntityFrom(source, amount);
//	}
//
//	@Override
//	protected void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
//	}
//	
//	@Override
//	public void setNoGravity(boolean ignored) {
//		super.setNoGravity(true);
//	}
//
//	public void livingTick() {
//		super.livingTick();
//		this.setNoGravity(true);
//	}
//}
