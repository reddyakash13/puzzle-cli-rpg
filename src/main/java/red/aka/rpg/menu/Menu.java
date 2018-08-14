package red.aka.rpg.menu;

public interface Menu<T> {

	T printMenuListAndSelect();

	void printMessage(String message);

	T readOptionSelected();
}
