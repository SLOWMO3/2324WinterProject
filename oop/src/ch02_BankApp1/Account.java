package ch02_BankApp1;

class Account implements Accountable {
	private int ano;		// 계좌번호
	private String owner;	// 소유자
	private double balance;	// 잔액

	Account(int ano) {
		this.ano = ano;
	}
	Account(int ano, String owner, double balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// get/set 메소드
	int getAno() {
		return ano;
	}
	void setAno(int ano) {
		this.ano = ano;
	}
	String getOwner() {
		return owner;
	}
	void setOwner(String owner) {
		this.owner = owner;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void deposit(int money) {
		this.balance += money;
	}

	@Override
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	double computeInterest() { 
		return 0.0;
	}; 

	String getInfo() {
		String str = "계좌번호:" + ano + ", " + 
					"소유자:" + owner + ", " + 
					"잔액:" + balance;
		return str;
	}
}
