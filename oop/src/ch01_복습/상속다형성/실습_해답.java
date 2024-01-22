// (06) 클래스와 객체
// - 클래스: 객체를 만들기 위한 설계도(= 타입)
// - 객체: 클래스에 의해 생성된 실체 (= 인스턴스)
// - 클래스 내부 구조
//   - 필드 + 메소드 + 생성자
//     - 필드: 인스턴스 필드 vs. 정적 필드
//     - 메소드: 인스턴스 메소드 vs. 정적 메소드
//   - 필드와 vs. (지역)변수
//     - 필드: 클래스에 소속된 변수, 힙 영역에 위치, 강제 초기화 
//     - 변수: 메소드에 소속된 변수, 스택 영역에 위치, 초기화 X
// - 클래스 외부 구조
//   - 패키지, 임포트
// (07) 메소드 오버로딩(중복정의)
// (08) 상속
// - 부모 클래스, 자식 클래스 = 수퍼 클래스, 서브 클래스
// (09) 다형성
// (10) 메소드 오버라이딩(재정의)

package ch01_복습.상속다형성;

public class 실습_해답 {

	public static void main(String[] args) {
		// 객체 생성 보기
		CheckAccount ca = new CheckAccount(2, "성구", 200, 12345);
		System.out.println(ca.getInfo());
		
		// 생성자 중복정의 보기
		Account acc1 = new Account();
		Account acc2 = new Account(3, "경미", 300);
		System.out.println(acc1.getInfo());
		System.out.println(acc2.getInfo());
		
		// 메소드 중복정의 보기
		Account acc3 = new Account(4, "현우", 400);
		acc3.deposit(12);
		System.out.println(acc3.getInfo());
		acc3.deposit();
		System.out.println(acc3.getInfo());
		
		// 다형성과 메소드 재정의 보기
		Account acc4 = new Account(5, "지은", 500);
		Account acc5 = new CheckAccount(6, "길동", 600, 23456);
		acc4.computeInterest();
		acc5.computeInterest();
	}
}
