package red.aka.rpg.menu.dto;

public enum MainMenuItems {

	START("Let's start a new game"),
	EXIT("Exit the game");

	private String desciption;

	MainMenuItems(String description) {
		this.desciption = description;
	}

	@Override
	public String toString() {
		return desciption;
	}
}
