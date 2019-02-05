package prob3;

public final class Triangle implements Shape {
	private final double BASE;
	private final double HEIGTH;

	public Triangle(double b, double h) {
		// TODO Auto-generated constructor stub
		BASE = b;
		HEIGTH = h;
	}

	public double getBase() {
		return BASE;
	}

	public double getHeight() {
		return HEIGTH;
	}

	public final double computeArea() {
		return 0.5 * BASE * HEIGTH;

	}
}
