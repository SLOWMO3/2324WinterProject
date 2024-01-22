package ch05_BankApp2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bank korea = new Bank("한국은행", 100);
     
    Account acc1 = new CheckAccount(1, "1", 1, 1);
    Account acc2 = new CMAAccount(3, "3", 3, 3);
    
    korea.addAccount(acc1);
    korea.addAccount(acc2);

    korea.printAccList();
	}

}
