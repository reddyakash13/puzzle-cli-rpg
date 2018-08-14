package red.aka.rpg.menu;

import java.util.Arrays;

import red.aka.rpg.adaptors.InputParser;
import red.aka.rpg.adaptors.OutputWriter;
import red.aka.rpg.menu.dto.MainMenuItems;
import red.aka.rpg.menu.types.MainMenu;

public class GameMainMenu extends BaseMenuImpl<MainMenuItems> implements MainMenu {

	public GameMainMenu(InputParser inputParser, OutputWriter outputWriter) {
		super(inputParser, outputWriter, Arrays.asList(MainMenuItems.values()));
	}

}
