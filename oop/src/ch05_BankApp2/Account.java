package ch05_BankApp2;

public class Account implements Accountable {
	private int ano;		// 계좌번호
	private String owner;	// 소유자
	private double balance;	// 잔액

	public Account(int ano) {
		this.ano = ano;
	}
	public Account(int ano, String owner, double balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// get/set 메소드


	public int getAno() { return ano; }
	public void setAno(int ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	
	@Override
	public void deposit(int money) {
		this.balance += money;
	}
	
	@Override
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public double computeInterest() {
		return 0.0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.ano == ((Account)obj).ano)
			return true;
		return false;
	}

	@Override
	public String toString() {
		String str = "계좌번호:" + ano + ", " + 
					"소유자:" + owner + ", " + 
					"잔액:" + balance;
		return str;
	}
	
	
}
