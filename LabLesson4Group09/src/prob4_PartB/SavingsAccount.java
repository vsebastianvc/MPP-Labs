package prob4_PartB;

public class SavingsAccount extends Account{
	private double balance;
	private double interestRate;
	private String accId;
	
	public SavingsAccount(String accId,double interestRate, double startBalance) {
		this.accId=accId;
		this.interestRate=interestRate;
		this.balance=startBalance;
	}

	@Override
	public String getAccount() {
		// TODO Auto-generated method stub
		return accId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return balance+(interestRate*balance);
	}
}
