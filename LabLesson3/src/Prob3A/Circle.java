package Prob3A;

//Explain
//Circle inherits a computeVolume method that is not useful (compute volume doesn't apply for a 2-d shape, bad practice).
//The circle inherits the setHeight method. And the circle can not have a different height of zero.
public class Circle extends Cylinder {
	
	public Circle(double radius){
		super(radius, 0);
	}
	
	public double computeArea() {
		return getRadius() * getRadius() * Math.PI;
	}
}
