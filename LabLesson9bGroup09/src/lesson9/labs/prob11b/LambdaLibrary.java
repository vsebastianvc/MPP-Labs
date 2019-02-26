package lesson9.labs.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, Integer, Character, String> FILTER_EMPLOYEE =
		 (emps,salary,match) ->emps.stream().filter(x -> x.getSalary() > salary).filter(n -> n.getLastName().charAt(0) > match)
				.map(x -> x.getFirstName() + " " + x.getLastName()).sorted().collect(Collectors.joining(", "));
		
	

}
