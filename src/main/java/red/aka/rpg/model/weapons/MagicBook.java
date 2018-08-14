package red.aka.rpg.model.weapons;

import red.aka.rpg.domain.Weapon;
import red.aka.rpg.domain.WeaponStatus;

public class MagicBook extends Weapon {

	public MagicBook() {
		super("Magic book", "Magic spells written in ancient language", 15L, false, WeaponStatus.ALWAYS_READY_TO_USE);
	}

}
