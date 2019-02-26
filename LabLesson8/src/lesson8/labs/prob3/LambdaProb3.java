package lesson8.labs.prob3;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaProb3 {
	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> function = (x,y) -> {
			List<Double> list = new ArrayList<>(); 
			list.add(Math.pow(x,y));
			list.add(x * y);
			return list;
		};
		List<Double> result = function.apply(2.0, 3.0);
		result.forEach(d->System.out.println(d));
	}
}
