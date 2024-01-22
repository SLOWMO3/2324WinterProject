package ch05_BankApp2;

public class Bank {
	private String name;
	private Account[] accounts;

	Bank(String name, int accountNum) {
		this.name = name;
		this.accounts = new Account[accountNum];
	}
	
	void addAccount(Account acc) {		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = acc;
				break;
			}
		}
	}

	void printAccList() {
		for(int i=0; i<accounts.length; i++) {
			Account acc = accounts[i];
			if(acc != null)
				System.out.println(acc);	
			else
				continue;
		}
	}

	Account findAccount(Account acc) { // BankApp1과 차이
		for(Account acc_ele : accounts) {
			if(acc_ele != null && acc_ele.equals(acc)) // 원소가 있고 객체 내용이 동일한 경우
					return acc_ele;
		}
		return null;
	}
	
	void removeAccount(Account acc) { // BankApp1과 차이
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null  && accounts[i].equals(acc)) { // 원소가 있고 계좌 객체 내용이 동일한 경우
					accounts[i] = null;
					break;
			}
		}
	}
	
	void addInterest() {
		for(Account acc : accounts) {
			if(acc == null)
				break;
			else {
				double interest = acc.computeInterest();
				acc.setBalance(interest);
			}
		}
	}
}
