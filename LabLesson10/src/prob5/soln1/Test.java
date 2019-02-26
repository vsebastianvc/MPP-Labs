package prob5.soln1;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import prob5.Employee;
import prob5.Main;

public class Test {

	@org.junit.Test
	public void testAsString() {
		String expected = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
		List<Employee> emps = data();
		String actual = Main.asString(emps);
		assertEquals(expected, actual);
	}

	
	public static List<Employee> data(){
		return Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));
	}
}
