package Prob4;

public class Admin {
	public static double computeTotalRent(Building[] properties) {
		double totalRent = 0;
		for (Building o : properties) {
				totalRent += o.computeRent();
		}
		return totalRent;
	}
}
