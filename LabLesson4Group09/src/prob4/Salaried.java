package prob4;

public class Salaried extends Employee {
	private double salary;

	public Salaried(double salary) {
		this.salary =salary;
	}

	public double calcGrossPay() {
		return salary;
	}
}
