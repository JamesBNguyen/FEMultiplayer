package net.fe.fightStage;

import net.fe.RNG;
import net.fe.unit.Unit;

public class Luna extends CombatTrigger {
	public Luna(){
		super(REPLACE_NAME);
	}
	@Override
	public void attempt(Unit user) {
		success = RNG.get() < user.get("Skl")/2;
	}

	@Override
	public boolean runPreAttack(FightStage stage, Unit a, Unit d) {
		d.setTempMod("Def", -d.get("Def"));
		return true;
	}

}