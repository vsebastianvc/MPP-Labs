package lesson9.labs.prob9;

import java.util.stream.Stream;

public class PrintSquare {

	public static void main(String[] agrs) {
		PrintSquare.printSquares(10);
	}

	public static void printSquares(int num) {
		Stream.iterate(1, n -> n + 1).limit(num).forEach(n->System.out.println(n * n));
	}
}
