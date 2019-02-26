package lesson8.labs.prob1;

import java.util.function.Supplier;

public class MainPartJ {
	public static void main(String[] args) {
		Supplier<Double> supplier1 = Math::random;
		Supplier<Double> supplier2 = () -> Math.random();
		
		double result = supplier2.get();
		System.out.println(result);
		
	}	
}
