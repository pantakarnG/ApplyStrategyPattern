import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

	@Test
	void testComputeBonus() {
		Manager m1 = new Manager(10000);
//		System.out.println(m1.getSalary()) ;
		assertEquals(10000.0, m1.getSalary());
		m1.setBonuscompute(new DoubleBonus());
		m1.CalculatcBonus();
		assertEquals(10000.0, m1.getBonus());
	}

}
