package red.aka.rpg.domain;

import java.util.ArrayList;

import red.aka.rpg.model.Enemies;
import red.aka.rpg.position.CellContent;

public class EnemyCharacter extends BasicCharacter {

	public EnemyCharacter(Enemies enemies, Integer points) {
		super(enemies.getName(), enemies.getStory(), enemies.getStrength(), enemies.getWeapons(), new ArrayList<>(),
				points, Status.ALIVE);
	}

	@Override
	CellContent getCellContentType() {
		return CellContent.ENEMY;
	}

}
