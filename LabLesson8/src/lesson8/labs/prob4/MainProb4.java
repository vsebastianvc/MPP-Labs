package lesson8.labs.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainProb4 {
	public int countWords(List<String> words, char c, char d, int len) {
		return words.stream().filter(x -> x.length() == len).filter(x -> x.contains(String.valueOf(c)))
				.filter(x -> !x.contains(String.valueOf(d))).collect(Collectors.toList()).size();
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Victor", "Sebastian", "Valencia", "Correa", "Ruben", "Leo", "Panamito",
				"Carlos");

		MainProb4 main = new MainProb4();
		int result = main.countWords(words, 'c', 'd', 3);
		System.out.println(result);
	}
}
