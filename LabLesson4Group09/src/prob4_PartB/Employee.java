package prob4_PartB;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	List<Account> acct = new ArrayList<>();
	
	public Employee(String name) {
		this.name=name;
	}
	
	public void addAccount(Account acct) {
		this.acct.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double sum=0.0;
		for (Account account : acct) {
			sum+=account.computeUpdateBalance();
		}
		return sum;
	}
}
