package lesson9.labs.prob10;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		//Problem B
		Stream<String> stream = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(stream.reduce((x,y)->x+ ", "+y).orElse(""));
		
		Stream<String> streamOptional = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(streamOptional.collect(Collectors.joining(", ")));
		
		
		//Problem C
		Stream<Integer> myIntStream = Stream.of(1,150,6,3,49,6,84,2,4,66,0);

		
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(x->x));
		System.out.println("Maximum "+summary.getMax());
		System.out.println("Minimum "+summary.getMin());

	}

}
