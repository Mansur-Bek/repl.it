package solutions;

public class Repl_164_Methods_with_return_10_thunder_blazz {
	public boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {
		if (available || gift) {
			return true;
		} else if (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) {
			return true;
		} else if (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2) {
			return true;
		}

		else {

			return false;
		}

	}
}
