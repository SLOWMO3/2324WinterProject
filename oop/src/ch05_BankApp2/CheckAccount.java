package ch05_BankApp2;

public class CheckAccount extends Account {
	private int cardNo;	// 직불카드 번호

	public CheckAccount(int ano, String owner, double balance, int cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;
	}
	
	@Override
	public double computeInterest() {
		return super.getBalance() * 0.02;
	}

	@Override
	public String toString() {
		String str = "카드번호:" + cardNo;
		return "보통계좌 -> " + super.toString() + ", " + str;
	}
}
