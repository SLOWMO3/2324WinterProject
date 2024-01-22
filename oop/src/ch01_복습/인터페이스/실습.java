// (11) 추상 클래스
//  - 하나 이상의 추상 메소드 있으면 추상 클래스
//  - 객체 생성 불가
// (12) 인터페이스
//  - 모든 필드 제어자는 public static final, 생략가능
//  - 모든 메소드 제어자는 public abstract, 생략 가능
//  - 객체 생성 불가

package ch01_복습.인터페이스;

public class 실습 {

	public static void main(String[] args) {
		Account[] accs = new Account[3];
		accs[0] = new CheckAccount(1, "check1", 100, 12345);
		accs[1] = new SaveAccount(2, "save1", 200, 0.2, 2);
		accs[2] = new CheckAccount(3, "check2", 300, 23456);
		
		// 모든 계좌의 입금, 출금, 이자계산 행위(메소드) 수행
		for (int i = 0; i<=accs.length; i ++) {
			System.out.println(accs[i].getInfo());
			accs[i].deposit();
			accs[i].withdraw(i);
			accs[i].computeInterest();
			System.out.println(accs[i].getInfo());
		}
	}
}
