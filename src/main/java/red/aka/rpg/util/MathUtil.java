package red.aka.rpg.util;

import java.util.concurrent.ThreadLocalRandom;

public class MathUtil {

	public static int randomIntExclusive(int minInclusive, int maxExclusive) {
		return ThreadLocalRandom.current().nextInt(minInclusive, maxExclusive);
	}

	public static int randomIntExclusive(int maxExclusive) {
		return ThreadLocalRandom.current().nextInt(0, maxExclusive);
	}
}
