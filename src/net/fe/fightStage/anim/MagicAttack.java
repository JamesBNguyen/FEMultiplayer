package net.fe.fightStage.anim;

import net.fe.fightStage.FightStage;
import chu.engine.AnimationData;
import chu.engine.anim.AudioPlayer;

public class MagicAttack extends AttackAnimation{

	public MagicAttack(AnimationData data, FightStage stage,
			AnimationArgs animArgs) {
		super(data, stage, animArgs);
	}

	@Override
	public void onLastHit() {
		stage.addEntity(new MagicEffect(animationArgs));
		stage.addEntity(new BackgroundEffect(animationArgs.unit.getWeapon().name.toLowerCase(), 
				animationArgs.left));
		loopNextFrames(freeze);
		onHit();
	}

	@Override
	public void onHit() {
		//TODO: Magic sounds
	}

}