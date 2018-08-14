package red.aka.rpg.position;

import static red.aka.rpg.util.MathUtil.randomIntExclusive;

import java.util.HashMap;
import java.util.Map;

import red.aka.rpg.domain.EnemyCharacter;
import red.aka.rpg.domain.FriendCharacter;
import red.aka.rpg.factory.BasicCharacterFactory;
import red.aka.rpg.model.Enemies;
import red.aka.rpg.realms.RealmConfiguration;

public class FieldMap {

	private Map<Coordinates, FriendCharacter> friends;
	private Map<Coordinates, EnemyCharacter> enemies;

	private Location[][] cells;

	public FieldMap(RealmConfiguration realmConfig) {
		cells = new Location[realmConfig.getMapSize()][realmConfig.getMapSize()];
		friends = new HashMap<>();
		enemies = new HashMap<>();
		this.organizeMap(realmConfig);
	}

	private void organizeMap(RealmConfiguration realmConfig) {
		initializeEnemyLocation(realmConfig);
	}

	private void initializeEnemyLocation(RealmConfiguration realmConfig) {
		// TODO: For now lets add all enemies in random locations

		BasicCharacterFactory factory = realmConfig.getFactory();
		for (Enemies enemy : Enemies.values()) {
			EnemyCharacter enemyCharacter = factory.createEnemyCharacter(enemy);
			Coordinates coordinates = findCoordinatesWithoutEmptySpace();
			enemies.put(coordinates, enemyCharacter);
		}
	}

	private Coordinates findCoordinatesWithoutEmptySpace() {
		Coordinates coordinates;
		do {
			coordinates = randomCoordinates(cells.length);
		} while (isSpaceOccupied(coordinates));

		return coordinates;
	}

	private boolean isSpaceOccupied(Coordinates coordinates) {
		return enemies.containsKey(coordinates);
	}

	static Coordinates randomCoordinates(int mapSize) {
		int randomX = randomIntExclusive(mapSize);
		int randomY = randomIntExclusive(mapSize);
		return new Coordinates(randomX, randomY);
	}

}
