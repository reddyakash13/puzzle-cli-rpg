package red.aka.rpg.menu;

import java.util.List;

import red.aka.rpg.adaptors.InputParser;
import red.aka.rpg.adaptors.OutputWriter;

public abstract class BaseMenuImpl<TYPE extends Enum> implements Menu<TYPE> {

	protected final InputParser inputParser;
	protected final OutputWriter outputWriter;
	protected final List<TYPE> menuItems;

	public BaseMenuImpl(InputParser inputParser, OutputWriter outputWriter) {
		this(inputParser, outputWriter, null);
	}

	public BaseMenuImpl(InputParser inputParser, OutputWriter outputWriter, List<TYPE> menuItems) {
		this.inputParser = inputParser;
		this.outputWriter = outputWriter;
		this.menuItems = menuItems;
	}

	@Override
	public void printMessage(String message) {
		outputWriter.showMessage(message);
	}

	@Override
	public TYPE readOptionSelected() {
		int choice = inputParser.tryReadingMenuChoice(menuItems.size());
		return menuItems.get(choice);
	}

	@Override
	public TYPE printMenuListAndSelect() {
		outputWriter.showMessage("Please select one option from below list:");
		for (int i = 0; i < menuItems.size(); i++) {
			outputWriter.showMessage((i + 1) + ". " + menuItems.get(i).toString());
		}
		return readOptionSelected();
	}

}
