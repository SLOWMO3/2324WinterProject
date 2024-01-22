package ch01_복습.인터페이스;

abstract class Account implements Interest {
	int ano;		// 계좌번호
	String owner;	// 소유자
	double balance;	// 잔액
	
	Account() { } // 생성자 중복정의
	Account(int ano, String owner, double balance) { // 생성자 중복정의
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit() { // 메소드 중복정의
	
		this.balance += 20;
	}
	void deposit(int money) { // 메소드 중복정의
		
		this.balance += money;
	}
	void withdraw(int money) {
		this.balance -= money;
	}
	
	public abstract double computeInterest(); // 추상 메소드

	String getInfo() { 
		String str = "계좌번호:" + ano + ", " + 
					"소유자:" + owner + ", " + 
					"잔액:" + balance;
		return str;
	}
}
