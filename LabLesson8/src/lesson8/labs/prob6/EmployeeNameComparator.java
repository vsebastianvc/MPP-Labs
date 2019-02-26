package lesson8.labs.prob6;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int result = e1.getName().compareTo(e2.getName());
		
		if (result != 0)
			return result;
		if (e1.getSalary() == e2.getSalary())
			return 0;
		else if (e1.getSalary() < e2.getSalary())
			return -1;

		return 1;
	}
}
