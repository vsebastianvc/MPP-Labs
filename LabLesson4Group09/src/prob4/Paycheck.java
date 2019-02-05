package prob4;

public final class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public Paycheck(double totalSalary, double fica, double state, double local, double medicare,
			double socialSecurity) {
		this.grossPay = totalSalary;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.print();
		System.out.println("netPaid: " + this.getNetPay());
	}

	public void print() {
		System.out.println("grossPay: " + grossPay + ", fica: " + fica + ", state: " + state + ", local: " + local
				+ ", medicare: " + medicare + ", socialSecurity: " + socialSecurity);
	}

	public double getNetPay() {
		return grossPay - fica - state - local - medicare - socialSecurity;
	}
}
