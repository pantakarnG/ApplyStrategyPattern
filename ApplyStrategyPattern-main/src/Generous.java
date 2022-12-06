
public class Generous implements BonusCalculator {

	@Override
	public double computeBonus(double wage) {

		return wage * 10 / 100;
	}

}
