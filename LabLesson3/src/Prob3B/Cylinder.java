package Prob3B;

public class Cylinder {
	private double height;
	private double radius;

	public Cylinder(double h, double r) {
		this.height = h;
		this.radius = r;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double computeVolume() {
		return Math.PI * radius * radius * height;
	}

}