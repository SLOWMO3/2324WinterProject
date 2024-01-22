// 최상위 클래스 Object - hashcode()
// - 해쉬함수 정의
//   - 임의의 크기를 갖는 데이터를 고정된 크기를 갖는 데이터로 변환하는 함수
// - 자바의 hashCode() = 해쉬함수
//   - 임의의 데이터를 정수 데이터로 변환하는 함수 
//   - 객체의 위치와 관련된 정수 값 반환
// - String 클래스와 Wrapper 클래스는 equals()와 함께 hashcode() 메소드도 재정의되어 있음
//   - 내용이 같으면 동일 값(정수) 반환
// - (중요사항) String과 Wrapper 클래스는 다음 메소드를 이미 재정의함
//   - Object 클래스의 equals(), hashCode() 메소드
//   - comparable 인터페이스의 compareTo() 메소드

package ch03_Object클래스.hashCode;

class 실습_해답 {
	public static void main(String[] args) {
		// 문자열 객체 2개 생성후 hash 값 출력
		String s1 = "lee";
		String s2 = new String("lee");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// Integer 객체 2개 생성후 hash 값 출력
		Integer i1 = 3;
		Integer i2 = new Integer(3);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		// A 객체 2개 생성후 hash 값 출력
		A a1 = new A();
		System.out.println(a1.hashCode());
		A a2 = new A();
		System.out.println(a2.hashCode());

		// B 객체 2개 생성후 hash 값 출력(case1)
		B b1 = new B(10, "lee");
		System.out.println(b1.hashCode());
		B b2 = new B(10, "sung");
		System.out.println(b2.hashCode());
		
		// B 객체 2개 생성후 hash 값 출력(case2)
		B b3 = new B(20, "lee");
		System.out.println(b3.hashCode());
		B b4 = new B(30, "lee");
		System.out.println(b4.hashCode());
		
		// B 객체 2개 생성후 hash 값 출력(case3)
		B b5 = new B(40, "lee");
		System.out.println(b5.hashCode());
		B b6 = new B(40, "lee");
		System.out.println(b6.hashCode());
	}
}
