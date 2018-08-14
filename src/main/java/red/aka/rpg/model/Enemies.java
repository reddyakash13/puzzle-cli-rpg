package red.aka.rpg.model;

import static java.util.Collections.singletonList;

import java.util.List;

import red.aka.rpg.domain.Weapon;
import red.aka.rpg.model.weapons.EggGun;
import red.aka.rpg.model.weapons.MagicBook;
import red.aka.rpg.model.weapons.MechanicalArm;
import red.aka.rpg.model.weapons.Sniper;
import red.aka.rpg.model.weapons.SoundTransducer;
import red.aka.rpg.model.weapons.Sword;

public enum Enemies {

	EGGMAN("Eggman", "I have a egg story", "I can attack buy throwing eggs", singletonList(new EggGun())),
	TINGLE("Tingle", "I can tell fantasy stories", "I can hypnotze with my talk", singletonList(new SoundTransducer())),
	RINOA("Rinda", "I was a undercover spy", "I am the best sniper on this planet", singletonList(new Sniper())),
	DEACON("Deacon", "I work in jungle", "I can muscle down any opponet", singletonList(new Sword())),
	WAKKA("Wakka", "I come the rural tribes with voodoo skills", "I can create magical weapons to kill you",
			singletonList(new MagicBook())),
	OCTOPUS("Octopus", "Underwater villan since centuries", "You can't kill me with two hands",
			singletonList(new MechanicalArm()));

	private String name;
	private String story;
	private String strength;
	private List<Weapon> weapons;

	private Enemies(String name, String story, String strength, List<Weapon> weapons) {
		this.name = name;
		this.story = story;
		this.strength = strength;
		this.weapons = weapons;
	}

	public String getName() {
		return name;
	}

	public String getStory() {
		return story;
	}

	public String getStrength() {
		return strength;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}
}
