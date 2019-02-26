package lesson8.labs.prob2ProbA;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	
//	@Override
//	public int compare(Employee e1, Employee e2) {
//		return e1.name.compareTo(e2.name);
//	}
	@Override
	public int compare(Employee e1, Employee e2) {
		int result = e1.name.compareTo(e2.name);
		
		if (result != 0)
			return result;
		if (e1.salary == e2.salary)
			return 0;
		else if (e1.salary < e2.salary)
			return -1;

		return 1;
	}
}
