package red.aka.rpg.launcher;

import red.aka.rpg.beans.BeanContext;
import red.aka.rpg.menu.MenuManager;

public class GameLanucher {


	public static void launchGame() {
		MenuManager menuManager = BeanContext.getBean(MenuManager.class);

		menuManager.listMenuItems();
	}
}
