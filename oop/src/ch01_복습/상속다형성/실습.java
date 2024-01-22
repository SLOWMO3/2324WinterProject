// (06) 클래스와 객체

package ch01_복습.상속다형성;

public class 실습 {

	public static void main(String[] args) {
		// 객체 생성 보기
		CheckAccount ca = new CheckAccount(2, "의태", 200, 12345);
		System.out.println(ca.getInfo());
		
		// 생성자 중복정의 보기
        Account acc1 = new Account();
        Account acc2 = new Account(3, "3", 3);
        acc1.deposit();
        acc2.deposit();
		// 메소드 중복정의 보기
		Account acc3 = new Account(4, "홍원", 400);
		acc3.deposit();
		System.out.println(acc3.getInfo());
		acc3.deposit(555);
		System.out.println(acc3.getInfo());
		
		
		// 다형성과 메소드 재정의 보기
        Account acc4 = new Account(5,"지은",500);
        Account acc5 = new CheckAccount(6,"길동",600,23456);
        acc4.computeInterest();
       
	}
}
