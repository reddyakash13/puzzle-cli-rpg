package red.aka.rpg.model.weapons;

import red.aka.rpg.domain.Weapon;
import red.aka.rpg.domain.WeaponStatus;

public class SoundTransducer extends Weapon {

	public SoundTransducer() {
		super("Sound Transducer", "Destroy enemies hearing capability", 5L, false, WeaponStatus.ALWAYS_READY_TO_USE);
	}

}
