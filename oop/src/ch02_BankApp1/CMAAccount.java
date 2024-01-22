package ch02_BankApp1;

// CMA 계좌
class CMAAccount extends Account {
	private double dayRate;		// 매일 이자율

	CMAAccount(int ano, String owner, double balance, double dayRate) {
		super(ano, owner, balance);
		this.dayRate = dayRate;
	}
	
	@Override
	public double computeInterest() {
		return super.getBalance() * dayRate;
	}
	
	@Override
	public String getInfo() {
		String str = "매일이자율:" + dayRate;
		return "CMA계좌 -> " + super.getInfo() + ", " + str;
	}
}
