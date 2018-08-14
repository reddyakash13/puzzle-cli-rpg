package red.aka.rpg.realms;

import red.aka.rpg.factory.BasicCharacterFactory;

public class RealmConfiguration {

	private int mapSize;
	private BasicCharacterFactory factory;

	public RealmConfiguration(BasicCharacterFactory characterFactory, int mapSize) {
		this.factory = characterFactory;
		this.mapSize = mapSize;
	}

	public int getMapSize() {
		return mapSize;
	}

	public BasicCharacterFactory getFactory() {
		return factory;
	}
}
