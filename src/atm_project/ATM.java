package atm_project;

public class ATM {

	private double balance;
	private double depositedAmount;
	private double withdrawnAmount;
	
	public ATM() {
		
	}
	public ATM(double balance, double depositedAmount, double withdrawnAmount) {
		super();
		this.balance = balance;
		this.depositedAmount = depositedAmount;
		this.withdrawnAmount = withdrawnAmount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositedAmount() {
		return depositedAmount;
	}

	public void setDepositedAmount(double depositedAmount) {
		this.depositedAmount = depositedAmount;
	}

	public double getWithdrawnAmount() {
		return withdrawnAmount;
	}

	public void setWithdrawnAmount(double withdrawnAmount) {
		this.withdrawnAmount = withdrawnAmount;
	}
	
	
	
}
