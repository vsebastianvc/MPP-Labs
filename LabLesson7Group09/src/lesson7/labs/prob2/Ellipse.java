package lesson7.labs.prob2;

public final class Ellipse implements ClosedCurve {

	private final double semiMajorAxis;
	private final double ellipticIntegral;

	public Ellipse(double semiMajorAxis, double ellipticIntegral) {
		this.semiMajorAxis = semiMajorAxis;
		this.ellipticIntegral = ellipticIntegral;
	}

	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}

	public double getEllipticIntegral() {
		return ellipticIntegral;
	}

	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * ellipticIntegral;
	}

}
