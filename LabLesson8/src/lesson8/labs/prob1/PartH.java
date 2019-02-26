package lesson8.labs.prob1;

import java.util.function.Consumer;

public class PartH {
	public static void main(String[] args) {
		Consumer<String> print1 = System.out::println;
		Consumer<String> print2 = p -> System.out.println(p);
		
		print1.accept("Hello world p1");
		print2.accept("Hello world p2");
	}
}
