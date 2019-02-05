package prob4_PartB;

public class CheckingAccount extends Account {
	private double balance;
	private double monthlyFee;
	private String accId;
	
	public CheckingAccount(String accId,double fee, double startBalance) {
		this.accId=accId;
		this.monthlyFee=fee;
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
		return balance-monthlyFee;
	}

}
