package ch05_BankApp2;

public class CMAAccount extends Account {
	double dayRate;		// 매일 이자율

	public CMAAccount(int ano, String owner, double balance, double dayRate) {
		super(ano, owner, balance);
		this.dayRate = dayRate;
	}
	
	@Override
	public double computeInterest() {
		return super.getBalance() * dayRate;
	}
	
	@Override
	public String toString() {
		String str = "매일이자율:" + dayRate;
		return "CMA계좌 -> " + super.toString() + ", " + str;
	}
}
