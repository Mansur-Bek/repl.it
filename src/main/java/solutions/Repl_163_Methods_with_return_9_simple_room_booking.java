package solutions;

public class Repl_163_Methods_with_return_9_simple_room_booking {
	public boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		if (isAvailable == true && year == 2018) {
			if (!(month == 7 && (day >= 1 && day <= 8)))
				return true;
		}
		return false;
	}
}
