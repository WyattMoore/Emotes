package vazkii.emotes.client.emote;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.emotes.client.emote.base.EmoteBase;
import vazkii.emotes.client.emote.base.ModelAccessor;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;

public class EmoteStand extends EmoteBase {

	public EmoteStand(EntityPlayer player, ModelBiped model, ModelBiped armorModel, ModelBiped armorLegsModel) {
		super(player, model, armorModel, armorLegsModel);
	}

	@Override
	public Timeline getTimeline(EntityPlayer player, ModelBiped model) {
		Timeline timeline = Timeline.createSequence()
			.beginParallel()
				.push(Tween.to(model, ModelAccessor.RIGHT_ARM_X, 400F).target(-0.3F))
				.push(Tween.to(model, ModelAccessor.RIGHT_ARM_Y, 400F).target(0F))
				.push(Tween.to(model, ModelAccessor.RIGHT_ARM_Z, 400F).target(-pi / 2 + pi / 8))
				.push(Tween.to(model, ModelAccessor.LEFT_ARM_X, 400F).target(0.3F))
				.push(Tween.to(model, ModelAccessor.LEFT_ARM_Y, 400F).target(0F))
				.push(Tween.to(model, ModelAccessor.LEFT_ARM_Z, 400F).target(pi / 4))
			.end()
			.repeatYoyo(1, 2000F);
	
		return timeline;
	}

	@Override
	public boolean usesBodyPart(int part) {
		return part == ModelAccessor.LEFT_ARM || part == ModelAccessor.RIGHT_ARM;
	}

}
