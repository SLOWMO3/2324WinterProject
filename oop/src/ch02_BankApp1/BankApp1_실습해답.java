package ch02_BankApp1;

public class BankApp1_실습해답 {

	public static void main(String[] args) {
		// 계좌 5개를 갖는 "한국은행" 생성
		Bank bank = new Bank("한국은행", 5); 
		
		// 계좌번호 1,2,3번인 보통, 저축, CMA 계좌 생성
		Account acc1 = new CheckAccount(1, "성구", 1, 1);
		Account acc2 = new SaveAccount(2, "경미", 2, 2, 2);
		Account acc3 = new CMAAccount(3, "현우", 3, 3);
		bank.printAccList();
		System.out.println("--------------");

		// 생성된 3개의 계좌 저장
		bank.addAccount(acc1);
		bank.addAccount(acc2);
		bank.addAccount(acc3);
		bank.printAccList();
		System.out.println("--------------");
		
		// 계좌번호 3번 확인 후 해당 계좌 제거
		Account acc = bank.findAccount(3);
		if(acc == null)
			System.out.println("결과: 3번 계좌가 없습니다.");
		else
			bank.removeAccount(3);
		bank.printAccList();
		System.out.println("--------------");
		
		// 계좌번호 1번 확인 후 해당 계좌에 100 예금
		acc = bank.findAccount(1);
		if(acc == null)
			System.out.println("결과: 1번 계좌가 없습니다.");
		else
			acc.deposit(100); 
		bank.printAccList();
		System.out.println("--------------");
		
		// 계좌번호 1번 확인 후 해당 계좌에 50 출금
		acc = bank.findAccount(1);
		if(acc == null)
			System.out.println("결과: 1번 계좌가 없습니다.");
		else
			acc.withdraw(50); 
		bank.printAccList();
		System.out.println("--------------");
		
		// 모든 계좌에 대한 이자 계산
		bank.addInterest();
		bank.printAccList();
	} 
} 
