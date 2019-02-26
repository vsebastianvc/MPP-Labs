package lesson8.labs.prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {

	// A: Class::instanceMethod
	Function<Employee, String> employeeName1 = e -> e.getName();
	Function<Employee, String> employeeName2 = Employee::getName;

	// B: Class::instanceMethod
	BiConsumer<Employee, String> setName1 = (e, s) -> e.setName(s);
	BiConsumer<Employee, String> setName2 = Employee::setName;

	// C: Class::instanceMethod
	Comparator<String> comparatorString1 = (s1, s2) -> s1.compareTo(s2);
	Comparator<String> comparatorString2 = String::compareTo;

	// D: Class::staticMethod
	BiFunction<Integer, Integer, Double> exponentialFunction1 = (x, y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> exponentialFunction2 = Math::pow;

	// E: Class::instanceMethod
	Function<Apple, Double> appleWeight1 = a -> a.getWeight();
	Function<Apple, Double> appleWeight2 = Apple::getWeight;
	
	// F: Class::staticMethod
	Function<String, Integer> parseInt1 = x -> Integer.parseInt(x);
	Function<String, Integer> parseInt2 = Integer::parseInt;
	
	//G: object::instanceMethod
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> comparatorEmployee1 = (e1, e2) -> comp.compare(e1, e2);
	Comparator<Employee> comparatorEmployee2 = comp::compare;
	
	private void evaluator() {
		Employee employee1 = new Employee("Sebastian", 300000);
		Apple apple1 = new Apple(140.9);
		
		System.out.println("employeeName:");
		System.out.println(employeeName2.apply(employee1));
		System.out.println("----");
		
		System.out.println("setName to: Carlos");
		setName2.accept(employee1, "Sebastian");
		System.out.println(employeeName2.apply(employee1));
		System.out.println("----");
		
		System.out.println("ComparatorStrings: Hello and Goodbye"); 
		System.out.println(comparatorString2.compare("Hello", "Goodbye"));
		System.out.println("----");
		
		System.out.println("ExponentialFunction2: 3 ^ 5"); 
		System.out.println(exponentialFunction2.apply(3, 5));
		System.out.println("----");
		
		System.out.println("AppleWeight: "); 
		System.out.println(appleWeight2.apply(apple1));
		System.out.println("----");
		
		System.out.println("ParseInt: 350"); 
		System.out.println(parseInt2.apply("350"));
		System.out.println("----");
		
		System.out.println("ComparatorEmployee:"); 
		System.out.println(comparatorEmployee1.compare(employee1, new Employee("Valencia", 300000)));
		System.out.println("----");
		
		
	}

	public static void main(String[] args) {
		Examples examples = new Examples();
		examples.evaluator();
	}

	class Apple {
		private double weight;

		Apple(double weight) {
			this.weight = weight;
		}

		public double getWeight() {
			return weight;
		}
	}

}
