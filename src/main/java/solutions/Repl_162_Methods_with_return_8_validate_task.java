package solutions;

public class Repl_162_Methods_with_return_8_validate_task {
	public boolean validateTask(boolean notEmpty, int taskId, int currentId) {
		if (notEmpty && ((taskId - currentId) == 1))
			return true;
		return false;

	}
}
