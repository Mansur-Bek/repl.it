package solutions;

public class Repl_155_Methods_with_return_1_count_appearance {
	public int count_appearance(String[] arr, String t) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(t)) {
				count++;
			}
		}
		return count;

	} // end count_appearance
}
