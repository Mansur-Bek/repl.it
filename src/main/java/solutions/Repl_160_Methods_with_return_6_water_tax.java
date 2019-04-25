package solutions;

public class Repl_160_Methods_with_return_6_water_tax {
	public double waterTax(double units) {
		double bill = 0.0;

		if (units <= 50)
			bill = units * 0.60;
		else if (units > 150)
			bill = units * 0.90 + 100;
		else if (units > 100)
			bill = units * 0.90 + 50;
		else
			bill = units * 0.90;
		return bill;
	}

}
