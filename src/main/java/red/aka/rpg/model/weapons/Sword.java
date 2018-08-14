package red.aka.rpg.model.weapons;

import red.aka.rpg.domain.Weapon;
import red.aka.rpg.domain.WeaponStatus;

public class Sword extends Weapon {

	public Sword() {
		super("Sword", "I can only be lifted by an Asgardian", 12L, false, WeaponStatus.ALWAYS_READY_TO_USE);
	}

}
