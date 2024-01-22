package ch05_BankApp2;

public class SaveAccount extends Account {
	private double interestRate;	// 이자율
	private int period;				// 저축기간

	public SaveAccount(int ano, String owner, double balance, double interestRate, int period) {
		super(ano, owner, balance);
		this.interestRate = interestRate;
		this.period = period;
	}
	
	@Override
	public double computeInterest() {
		return super.getBalance() * interestRate * period;
	}
	
	@Override
	public String toString() {
		String str = "이자율:" + interestRate + ", " + 
					"저축기간:" + period;
		return "저축계좌 -> " + super.toString() + ", " + str;
	}
}
