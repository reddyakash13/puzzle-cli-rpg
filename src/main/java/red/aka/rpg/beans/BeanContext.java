package red.aka.rpg.beans;

import java.util.HashMap;
import java.util.Map;

import red.aka.rpg.adaptors.InputParser;
import red.aka.rpg.adaptors.OutputWriter;
import red.aka.rpg.factory.BasicCharacterFactory;
import red.aka.rpg.menu.GameMainMenu;
import red.aka.rpg.menu.MenuManager;
import red.aka.rpg.menu.types.MainMenu;
import red.aka.rpg.realms.AmazonForestRealm;
import red.aka.rpg.realms.RealmConfiguration;

public class BeanContext {

	private static final Map<Class, Object> beans = new HashMap<>();

	static {
		ioBeans();
		menuBeans();
		realmConfigurations();
	}

	private static void ioBeans() {
		OutputWriter outputWriter = new OutputWriter(System.out);
		addToBeans(OutputWriter.class, outputWriter);

		InputParser inputParser = new InputParser(outputWriter, System.in);
		addToBeans(InputParser.class, inputParser);
	}

	private static void menuBeans() {
		OutputWriter outputWriter = getBean(OutputWriter.class);
		InputParser inputParser = getBean(InputParser.class);

		MainMenu menu = new GameMainMenu(inputParser, outputWriter);
		addToBeans(MainMenu.class, menu);

	}

	private static void realmConfigurations() {
		BasicCharacterFactory characterFactory = new BasicCharacterFactory();
		addToBeans(BasicCharacterFactory.class, characterFactory);

		RealmConfiguration realmConfig = new AmazonForestRealm(characterFactory);
		addToBeans(RealmConfiguration.class, realmConfig);

		MainMenu menu = getBean(MainMenu.class);
		MenuManager menuManager = new MenuManager(realmConfig, menu);
		addToBeans(MenuManager.class, menuManager);
	}

	private static void addToBeans(Class cls, Object obj) {
		beans.put(cls, obj);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> cls) {
		if (beans.containsKey(cls)) {
			return (T) beans.get(cls);
		}
		return null;
	}
}
