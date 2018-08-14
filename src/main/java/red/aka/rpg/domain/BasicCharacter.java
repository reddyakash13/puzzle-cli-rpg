package red.aka.rpg.domain;

import java.util.List;

import red.aka.rpg.position.CellContent;

public abstract class BasicCharacter {

	private String name;
	private String story;
	private String strength;
	private List<Weapon> weapons;
	private List<String> achievements;
	private Integer points;
	private Status status;

	public BasicCharacter(String name, String story, String strength, List<Weapon> weapons, List<String> achievements,
			Integer points, Status status) {
		super();
		this.name = name;
		this.story = story;
		this.strength = strength;
		this.weapons = weapons;
		this.achievements = achievements;
		this.points = points;
		this.status = status;
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

	public List<String> getAchievements() {
		return achievements;
	}

	public Integer getPoints() {
		return points;
	}

	public Status getStatus() {
		return status;
	}

	abstract CellContent getCellContentType();
}
