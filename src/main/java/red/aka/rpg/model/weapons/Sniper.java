package red.aka.rpg.model.weapons;

import red.aka.rpg.domain.Weapon;
import red.aka.rpg.domain.WeaponStatus;

public class Sniper extends Weapon {

	public Sniper() {
		super("Sniper", "Long distance shot with focus", 10L, true, WeaponStatus.FULLY_LOADED);
	}

}
