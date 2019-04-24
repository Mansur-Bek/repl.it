package solutions;

public class Repl_158_Methods_with_return_4_profit_or_loss {
	public String c_profits(int buyPrice, int sellPrice) {
		// your code here

		if (sellPrice > buyPrice) {
			return "profit";
		} else if (sellPrice == buyPrice) {
			return "no loss";
		} else {
			return "loss";
		}

	}
	
}
