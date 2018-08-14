package red.aka.rpg.position;

import red.aka.rpg.domain.BasicCharacter;

public class Location {

	private Coordinates coordinates;
	private CellContent cellContent;
	private BasicCharacter character;

	public Location(Coordinates coordinates, CellContent cellContent, BasicCharacter character) {
		this.coordinates = coordinates;
		this.cellContent = cellContent;
		this.character = character;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public CellContent getCellContent() {
		return cellContent;
	}

	public BasicCharacter getCharacter() {
		return character;
	}
}
