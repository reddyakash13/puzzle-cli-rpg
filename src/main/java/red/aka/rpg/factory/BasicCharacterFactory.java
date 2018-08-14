package red.aka.rpg.factory;

import static red.aka.rpg.model.Enemies.EGGMAN;

import red.aka.rpg.domain.EnemyCharacter;
import red.aka.rpg.model.Enemies;

public class BasicCharacterFactory {

	public EnemyCharacter createEnemyCharacter(Enemies enemies) {
		switch(enemies) {
		case EGGMAN:
			return new EnemyCharacter(EGGMAN, 100);

		case TINGLE:
			return new EnemyCharacter(Enemies.TINGLE, 60);

		case RINOA:
			return new EnemyCharacter(Enemies.RINOA, 90);

		case DEACON:
			return new EnemyCharacter(Enemies.DEACON, 120);

		case WAKKA:
			return new EnemyCharacter(Enemies.WAKKA, 150);

		case OCTOPUS:
			return new EnemyCharacter(Enemies.OCTOPUS, 200);

		default:
		}
		return null;
	}
}
