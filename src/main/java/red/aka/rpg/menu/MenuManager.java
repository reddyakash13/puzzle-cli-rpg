package red.aka.rpg.menu;

import red.aka.rpg.menu.dto.MainMenuItems;
import red.aka.rpg.menu.types.MainMenu;
import red.aka.rpg.realms.RealmConfiguration;

public class MenuManager {

	private RealmConfiguration realmConfiguration;
	private MainMenu mainMenu;

	public MenuManager(RealmConfiguration realmConfiguration, MainMenu mainMenu) {
		this.realmConfiguration = realmConfiguration;
		this.mainMenu = mainMenu;
	}

	public void listMenuItems() {
		mainMenu.printMessage("Welcome to the main menu of the game \n");

		MainMenuItems selected = mainMenu.printMenuListAndSelect();

		switch(selected) {
			case START:
			case EXIT:
		}
	}
}
