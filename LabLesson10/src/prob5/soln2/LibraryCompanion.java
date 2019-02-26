package prob5.soln2;

import java.util.function.Predicate;

import prob5.Employee;

public class LibraryCompanion {
	public static final Predicate<Employee> salaryCheck = e -> (e.getSalary() > 100000);

	public static final Predicate<Employee> lastNameCheck = e -> (e.getLastName().charAt(0) > 'M');
	
	public static boolean salaryGreaterThan100000(Employee e) {
		return salaryCheck.test(e);
	}

	public static boolean lastNameAfterM(Employee e) {
		return lastNameCheck.test(e);
	}
}
