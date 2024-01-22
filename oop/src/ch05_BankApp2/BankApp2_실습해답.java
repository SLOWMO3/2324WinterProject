package ch05_BankApp2;

import java.util.Scanner;

public class BankApp2_실습해답 {

	public static void main(String[] args) {
		Bank bank = new Bank("한국은행", 100); 
		Account acc;
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true; 
		
		while(run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 계좌제거 | 4.예금 | 5.출금 | 6.이자 | 7.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) { // 계좌생성
				System.out.println("-------------------------------");
				System.out.println("1.보통계좌 | 2.저축계좌 | 3.CMA계좌");
				System.out.println("-------------------------------");
				System.out.print("계좌종류선택: ");
				int kind = Integer.parseInt(scanner.nextLine());
				
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				// 동일 계좌가 있는지 확인 후 있다면 계좌 생성 없이 반복문 계속하는 코드 작성
				acc = bank.findAccount(new Account(ano));
				if(acc != null) { // 동일 계좌가 있는 경우
					System.out.println("동일 계좌가 이미 존재하여 생성 불가합니다.");
					continue;
				}
				
				System.out.print("계좌주: "); 
				String owner = scanner.nextLine();
				System.out.print("초기입금액: ");
				double balance = Double.parseDouble((scanner.nextLine()));
				if(kind == 1) { // 보통 계좌(CheckAccount)
					System.out.print("카드번호: ");
					int cardNo = Integer.parseInt(scanner.nextLine()); 

					// 보통 계좌(Check Account) 생성후 배열에 저장하는 코드 작성
					acc = new CheckAccount(ano, owner, balance, cardNo);
					bank.addAccount(acc);
					System.out.println("결과: 보통 계좌가 생성되었습니다.");
				} else if(kind == 2) { // 저축 계좌(Save Account)
					System.out.print("이자율: ");
					double interestRate = Double.parseDouble(scanner.nextLine());
					System.out.print("기간: ");
					int period = Integer.parseInt(scanner.nextLine());
					
					// 저축 계좌(Save Account) 생성후 배열에 저장하는 코드 작성
					acc = new SaveAccount(ano, owner, balance, interestRate, period);
					bank.addAccount(acc);
					System.out.println("결과: 저축 계좌가 생성되었습니다.");
				} else if (kind == 3) { // CMA 계좌(CMA Account)
					System.out.print("매일이자율: ");
					double dayRate = Double.parseDouble(scanner.nextLine());
					
					// CMA 계좌(CMA Account) 생성후 배열에 저장하는 코드 작성
					acc = new CMAAccount(ano, owner, balance, dayRate);
					bank.addAccount(acc);
					System.out.println("결과: CMA 계좌가 생성되었습니다.");
				}
			} else if(selectNo == 2) { // 계좌목록
				// 모든 계좌 정보 출력하는 코드 작성
				System.out.println();
				System.out.println("-----------------전체 계좌 목록--------------------");
				bank.printAccList();
				System.out.println("------------------------------------------------");
				System.out.println();
			} else if(selectNo == 3) { // 계좌제거
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				acc = bank.findAccount(new Account(ano)); // 동일 계좌 확인
				if(acc == null) {
					System.out.println("결과: 동일 계좌가 없어 제거가 불가합니다.");
					continue;
				}
				
				// 사용자로 부터 입력 받은 계좌 제거하는 코드 작성 
				bank.removeAccount(acc);
				System.out.println("결과: 제거 하였습니다.");	
			} else if(selectNo == 4) { // 예금
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				acc = bank.findAccount(new Account(ano)); // 동일 계좌 확인
				if(acc == null) {
					System.out.println("결과: 동일 계좌가 존재하여 예금이 불가합니다.");
					continue;
				}
				
				System.out.print("예금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				// 사용자로 부터 입력 받은 계좌에 예금액을 추가하는 코드 작성 
				acc.deposit(money); 
				System.out.println("결과: 예금 하였습니다.");		
			} else if(selectNo == 5) { // 출금
				System.out.print("계좌번호: "); 
				int ano = Integer.parseInt(scanner.nextLine());
				acc = bank.findAccount(new Account(ano)); // 동일 계좌 확인
				if(acc == null) {
					System.out.println("결과: 동일 계좌가 존재하여 출금이 불가합니다.");
					continue;
				}
				
				System.out.print("출금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				// 사용자로 부터 입력 받은 계좌에 출금액을 감액하는 코드 작성 
				acc.withdraw(money); 
				System.out.println("결과: 출금 하였습니다.");
			} else if(selectNo == 6) { // 이자 계산
				// 모든 계좌에 이자를 추가하는 코드 작성
				bank.addInterest();
				System.out.println("결과: 모든 계좌 잔액에 이자를 더하였습니다.");
			} else if(selectNo == 7) { // 종료
				// 시스템 종료 메시지와 함께 시스템을 종료하는 코드 작성
				System.out.println("시스템을 종료 합니다...");
				run = false;
			}
		} // while
	} // main()
} // Bank
