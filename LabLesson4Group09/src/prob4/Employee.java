package prob4;

import java.time.LocalDate;

public abstract class Employee {
	private int empId;
	
	private final double FICA=0.23;
	private final double STATE=0.05;
	private final double LOCAL=0.01;
	private final double MEDICARE=0.03;
	private final double SOCIALSEC=0.075;

	public void print() {
		System.out.println("Employee id: " + empId);
	}

	public Paycheck calcCompensation(LocalDate month) {
		double grossPay = this.calcGrossPay();
		double fica = grossPay * FICA;
		double state = grossPay * STATE;
		double local = grossPay * LOCAL;
		double medicare = grossPay * MEDICARE;
		double socialSecurity = grossPay * SOCIALSEC;

		Paycheck paycheck = new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
		return paycheck;
	}

	public abstract double calcGrossPay();
}