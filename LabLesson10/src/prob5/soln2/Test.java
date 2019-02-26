package prob5.soln2;

import static org.junit.Assert.assertEquals;

import prob5.Employee;

public class Test {
	@org.junit.Test
	public void testSalaryGreaterThan100000() {
		Employee joe = new Employee("Joe", "Davis", 120000);
		Employee john = new Employee("John", "Sims", 110000);
		Employee andrew = new Employee("Andrew", "Reardon", 80000);
		
		assertEquals(LibraryCompanion.salaryGreaterThan100000(joe), true);
		assertEquals(LibraryCompanion.salaryGreaterThan100000(john), true);
		assertEquals(LibraryCompanion.salaryGreaterThan100000(andrew), false);
		
	}
	
	@org.junit.Test
	public void testLastNameAfterM() {
		Employee joe = new Employee("Joe", "Davis", 120000);
		Employee john = new Employee("John", "Sims", 110000);
		Employee andrew = new Employee("Andrew", "Reardon", 80000);
		
		assertEquals(LibraryCompanion.lastNameAfterM(joe), false);
		assertEquals(LibraryCompanion.lastNameAfterM(john), true);
		assertEquals(LibraryCompanion.lastNameAfterM(andrew), true);
		
	}
	
	@org.junit.Test
	public void testFullName() {
		Employee joe = new Employee("Joe", "Davis", 120000);
		Employee john = new Employee("John", "Sims", 110000);
		Employee andrew = new Employee("Andrew", "Reardon", 80000);
		
		assertEquals(AsString.fullName(joe), "Joe Davis");
		assertEquals(AsString.fullName(john), "John Sims");
		assertEquals(AsString.fullName(andrew), "Andrew Reardon");
		
	}
}
