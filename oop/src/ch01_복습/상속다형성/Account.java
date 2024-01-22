package ch01_복습.상속다형성;

class Account {
	int ano;
	String owner;
	double balance;

	Account() { } // 생성자 중복정의
	Account(int ano, String owner, double balance) { // 생성자 중복정의
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	void deposit() { // 메소드 중복정의
		System.out.println("Account에서 deposit()");
		this.balance += 20;
	}
	void deposit(int money) { // 메소드 중복정의
		System.out.println("Account에서 deposit(int)");
		this.balance += money;
	}
	void withdraw(int money) {
		System.out.println("Account에서 withdraw(int)");
		this.balance -= money;
	}
	double computeInterest() {
		System.out.println("Account에서 computeInterest()");
		return balance * 0.01;
	}

	String getInfo() { 
		String str = "계좌번호:" + ano + ", " + 
				"소유자:" + owner + ", " + 
				"잔액:" + balance;
		return str;
	}
}