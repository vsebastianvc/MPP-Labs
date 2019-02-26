package lesson8.labs.prob1;

import java.util.function.Supplier;

public class PartJ {
	class InnerSupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}

	}

	public static void main(String[] args) {
		PartJ exampleJ = new PartJ();
		Supplier<Double> supplier = exampleJ.new InnerSupplier();

		Double result = supplier.get();
		System.out.println(result);
	}
}
