package prob5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


//	public static <T> T secondSmallest(List<T> list) {
//		return list.stream().sorted().skip(1).findFirst().get();
//	}
	
	public static <T> T secondSmallest(List<? extends T> list) {
		return list.stream().sorted().skip(1).findFirst().get();
		
	}
	

	public static void main(String[] args) {
		List<Integer> numbers1 = new ArrayList<>(); 
		numbers1.add(6);
		numbers1.add(16);
		numbers1.add(12);
		numbers1.add(88);
		numbers1.add(29);
		numbers1.add(5);

		List<Double> doubleElements = new ArrayList<>();
		doubleElements.add(0.5);
		doubleElements.add(6.84);
		doubleElements.add(1.3);
		doubleElements.add(1.5);
		
		List<String> stringElements = new ArrayList<>();
		stringElements.add("C");
		stringElements.add("O");
		stringElements.add("B");
		stringElements.add("O");
		stringElements.add("A");
		
		Comparator<Integer> num = Comparator.comparing(x -> x==0);
		System.out.println("Integer : " + secondSmallest(numbers1));
		System.out.println("Double : " + secondSmallest(doubleElements));
		System.out.println("Strings : " + secondSmallest(stringElements));
	
		int[] chupelo = {0,1,2,3,4,5,6,7,8,9};
		Stream.of(chupelo).map(x->x.toString()).collect(Collectors.toList());
		
		class chupelo implements Comparator<String>{
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}

	
		}

	}

}