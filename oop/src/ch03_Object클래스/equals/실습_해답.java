// 최상위 클래스 Object - equals()
// - Object 클래스의 equals()는 위치(번지) 비교하는 == 연산자와 동일
// - 사용자 정의 클래스의 객체 비교를 위해 equals() 메소드 재정의 필요
// - String 클래스와 Wrapper 클래스는 equals() 메소드 재정의되어 있음
//   - 내용이 같으면 true 반환
// - String과 Wrapper 클래스는 다음 메소드를 이미 재정의함
//   - Object 클래스의 equals(), hashCode() 메소드
//   - comparable 인터페이스의 compareTo() 메소드

package ch03_Object클래스.equals;

class 실습_해답 {
	public static void main(String[] args) {
		// 문자열 리터럴과 문자열 객체 생성하여 ==, equals() 비교
		String a = "lee";
		String b = "lee";
		String c = new String("lee");
		String d = new String("lee");
		
		System.out.println(a==b); 
		System.out.println(a.equals(b)); 	
		System.out.println(a==c); 
		System.out.println(a.equals(c)); 	
		System.out.println(c==d); 
		System.out.println(c.equals(d)); 
		
		// A 객체 2개 생성하여 ==, equals() 비교
//		A a1 = new A("안녕");
//		A a2 = new A("안녕");
//		System.out.println(a1==a2); 
//		System.out.println(a1.equals(a2));

		// B 객체 2개 생성하여 ==, equals() 비교
//		B b1 = new B("안녕"); 
//		B b2 = new B("안녕"); 
//		System.out.println(b1==b2); 
//		System.out.println(b1.equals(b2));
//		
//		B b3 = new B(new String("안녕"));
//		B b4 = new B(new String("안녕"));
//		System.out.println(b3==b4); 
//		System.out.println(b3.equals(b4));	
	}
}
