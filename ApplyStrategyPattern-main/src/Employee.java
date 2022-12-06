
public class Employee {

	protected double salary = 0;
	protected double bonus = 0;

	protected BonusCalculator bc;

	public double getSalary() {

		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public double CalculatcBonus() {
		return bonus = bc.computeBonus(salary);
	}

	public void setBonuscompute(BonusCalculator b) {
		bc = b;
	}
}
