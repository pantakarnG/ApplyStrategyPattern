
public class Skimpy implements BonusCalculator {

	@Override
	public double computeBonus(double wage) {

		return wage * 3 / 100;
	}

}
