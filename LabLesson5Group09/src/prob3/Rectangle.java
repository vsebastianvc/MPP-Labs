package prob3;

public final class Rectangle implements Shape {
	private final double WIDTH;
	private final double HEIGTH;
	
	public Rectangle(double w, double h) {
		// TODO Auto-generated constructor stub
		WIDTH=w;
		HEIGTH=h;
	}

	public double getWidth() {
		return WIDTH;
	}

	public double getHeight() {
		return HEIGTH;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return WIDTH*HEIGTH;
	}
	
	
}
