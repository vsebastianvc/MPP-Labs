package prob4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Employee employeeHourly = new Hourly(150, 49);
		employeeHourly.calcCompensation(LocalDate.of(2018, 12, 1));
		System.out.println("======================");
		
		Employee employeeMonthly = new Salaried(4600);
		employeeMonthly.calcCompensation(LocalDate.of(2018, 8, 1));
		System.out.println("======================");

		List<Order> orders1 = Arrays.asList(
				new Order(1,LocalDate.of(2017, 9, 1), 20000),
				new Order(2,LocalDate.of(2018, 2, 6), 10000)

				);
		
		Employee employeeCommissioned = new Commissioned(2900, 2500,orders1);
		employeeCommissioned.calcCompensation(LocalDate.of(2018, 10, 1));
		System.out.println("======================");
		
		
		List<Order> orders2 = Arrays.asList(
				new Order(3,LocalDate.of(2017, 12, 24), 1500),
				new Order(4,LocalDate.of(2018, 9, 10), 2500),
				new Order(5,LocalDate.of(2018, 9, 18), 5000)
				);
		Employee employeeCommissionedTwo = new Commissioned(9900, 100,orders2);
		employeeCommissionedTwo.calcCompensation(LocalDate.of(2018, 9, 1));
	}
}
