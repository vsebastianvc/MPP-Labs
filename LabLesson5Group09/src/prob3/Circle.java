package prob3;

public final class Circle implements Shape{
	private final double RADIUS;
	
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		RADIUS=r;
	}

	public double getRadius() {
		return RADIUS;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI * RADIUS * RADIUS;
	}
	
}
