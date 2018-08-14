package red.aka.rpg.domain;

import java.util.List;

import red.aka.rpg.position.CellContent;

public class FriendCharacter extends BasicCharacter {

	public FriendCharacter(String name, String story, String strength, List<Weapon> weapons, List<String> achievements,
			Integer points, Status status) {
		super(name, story, strength, weapons, achievements, points, status);
	}

	@Override
	CellContent getCellContentType() {
		return CellContent.PLAYER;
	}

}
