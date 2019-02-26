package lesson8.labs.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");

		//print each element of the list in upper case format

		//		list.stream().forEach(new Consumer<String>() {
		//			@Override
		//			public void accept(String t) {
		//				System.out.println(t.toUpperCase());
		//			}
		//		});
		list.forEach(x -> System.out.println(x.toUpperCase()));
		System.out.println("--------");
		list.forEach(ForEachExample::toUpperCase);//Class::staticMethod

	}
		public static void toUpperCase(String value) {
			System.out.println(value.toUpperCase());
		}

	//implement a Consumer


}