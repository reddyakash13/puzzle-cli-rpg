package red.aka.rpg.model.weapons;

import red.aka.rpg.domain.Weapon;
import red.aka.rpg.domain.WeaponStatus;

public class MechanicalArm extends Weapon {

	public MechanicalArm() {
		super("Mechanical Arm", "Brain controlled suit with eight arms", 30L, false, WeaponStatus.ALWAYS_READY_TO_USE);
	}

}
