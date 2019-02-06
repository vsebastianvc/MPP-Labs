package lesson7.labs.prob2;

public final class EquilateralTriangle implements Polygon {

	private final double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double[] getSides() {
		return new double[]{side, side, side};
	}

}
