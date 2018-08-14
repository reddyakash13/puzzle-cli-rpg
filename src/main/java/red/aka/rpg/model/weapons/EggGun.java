package red.aka.rpg.model.weapons;

import red.aka.rpg.domain.Weapon;
import red.aka.rpg.domain.WeaponStatus;

public class EggGun extends Weapon {

	public EggGun() {
		super("EggGun", "Fires eggs at opponents", 8L, true, WeaponStatus.FULLY_LOADED);
	}

}
