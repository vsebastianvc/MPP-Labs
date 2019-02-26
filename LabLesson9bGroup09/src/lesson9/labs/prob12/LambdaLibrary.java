package lesson9.labs.prob12;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, Integer, Character, String> FILTER_EMPLOYEE_SALARY = (emps, salary,
			match) -> emps.stream().filter(x -> x.getSalary() > salary).filter(x -> x.getLastName().charAt(0) > match)
					.map(x -> x.getFirstName() + " " + x.getLastName()).sorted().collect(Collectors.joining(", "));

	public static final TriFunction<List<Employee>, Integer, Character, String> FILTER_EMPLOYEE_UPPER_CASE = (emps, salary,
			match) -> emps.stream().filter(x -> x.getSalary() > salary).filter(x -> x.getFirstName().charAt(0) < match)
					.map(x -> x.getFirstName().toUpperCase() + " " + x.getLastName().toUpperCase()).sorted().collect(Collectors.joining(", "));

}
