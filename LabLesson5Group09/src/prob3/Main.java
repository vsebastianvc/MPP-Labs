package prob3;

public class Main {
	public static void main (String [] agrs) {

	Shape[] shape = {new Triangle(2.0,4.0), new Circle(5.8), new Rectangle(10.0,8.0)};

		double sum=0;
		for (Shape s : shape) {
			sum+=s.computeArea();
		}
		System.out.println("Sum of Areas: "+sum);
	}
}
