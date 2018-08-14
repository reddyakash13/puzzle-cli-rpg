package red.aka.rpg.adaptors;


import java.io.InputStream;
import java.util.Scanner;

public class InputParser {
	private static final int MAX_RETRY = 5;

	private final OutputWriter outputWriter;
	private final Scanner scanner;

	public InputParser(OutputWriter outputWriter, InputStream source) {
		this.outputWriter = outputWriter;
		this.scanner = new Scanner(source);
	}

	public String readUserInputAsString(String message) {
		outputWriter.showMessage(message);
		return readUserInputAsString();
	}

	public String readUserInputAsString() {
		return scanner.nextLine();
	}

	public int tryReadingMenuChoice(String message, int optionsSize) {
		outputWriter.showMessage(message);
		return tryReadingMenuChoice(optionsSize);
	}

	/*
	 * menu choice is specific, because menu items are numbered from 1, not from
	 * 0.
	 */
	public int tryReadingMenuChoice(int optionsSize) {
		return tryReadingInputAsInt(optionsSize + 1) - 1;
	}

	public int tryReadingInputAsInt(String message) {
		outputWriter.showMessage(message);
		return tryReadingInputAsInt();
	}

	public int tryReadingInputAsInt() {
		return tryReadingInputAsInt(Integer.MAX_VALUE);
	}

	public int tryReadingInputAsInt(String message, int optionsSize) {
		outputWriter.showMessage(message);
		return tryReadingInputAsInt(optionsSize);
	}

	public int tryReadingInputAsInt(int optionsSize) {
		for (int i = 1; i <= MAX_RETRY; i++) {
			try {
				 int result = Integer.parseInt(scanner.nextLine());
				return result;
			} catch (Exception e) {
				if (MAX_RETRY == i) {
					throw e;
				} else {
					outputWriter.showMessage(e.getMessage());
				}
			}
		}

		return -1;
	}

}
