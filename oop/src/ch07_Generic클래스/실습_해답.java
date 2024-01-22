// 제너릭(Generic) 클래스
// - 클래스에서 결정되지 않은 타입을 매개변수로 처리하고 실제 생성시
//   매개변수에 해당하는 부분을 구체적인 타입으로 대체하는 클래스
// - 클래스를 정의하는 시점에 타입을 정의하는 것이 아니라
//   객체를 생성하는 시점에 타입을 지정하는 클래스
// 제너릭 매개변수명 관례
// - T(타입), K(키이), V(값), N(숫자), E(원소)
// 제너릭 인터페이스
// - List<E>, Set<E>, Map<K,V>
// 제너릭 메소드
// - 일반 클래스에서 제너릭으로 선언된 메소드

package ch07_Generic클래스;

public class 실습_해답 {

	public static void main(String[] args) {
		// 구체 클래스 객체 생성
//		C obj = new C(); 
//		obj.setF(123);	
//		System.out.println(obj.getF());
		
		// 제너릭 매개변수 1개를 갖는 제너릭 클래스 객체 생성		
		// - Integer 제너릭 매개변수를 갖는 제너릭 클래스 객체 생성
//		C1<Integer> obj1 = new C1<>(); 
//		obj1.setF(456);
//		System.out.println(obj1.getF());
		
		// - String 제너릭 매개변수를 갖는 제어릭 클래스 객체 생성
//		C1<String> obj2 = new C1<>(); 
//		obj2.setF("lee");	
//		System.out.println(obj2.getF());
		
		// - 사용자 클래스 제너릭 매개변수를 갖는 제어릭 클래스 객체 생성
//		C1<C> obj3 = new C1<>();
//		obj3.setF(new C());
//		System.out.println(obj3.getF());
		
		// - Object 제너릭 매개변수를 갖는 제어릭 클래스 객체 생성
//		C1 obj4 = new C1();  // 제너릭 매개변수 생략하면 <Object> 자동 포함 -> C1<Object>
//		obj4.setF(456);
//		System.out.println(obj4.getF());
//		obj4.setF("lee");
//		System.out.println(obj4.getF());
//		obj4.setF(new C());
//		System.out.println(obj4.getF());
		
		// 제너릭 매개변수 2개를 갖는 제너릭 클래스 객체 생성		
		// - Integer, String 제너릭 매개변수를 갖는 제너릭 클래스 객체 생성
//		C2<Integer, String> obj1 = new C2<>();
//		obj1.setF1(1);
//		obj1.setF2("성구");
//		System.out.println(obj1.getF1() + " " + obj1.getF2());
//		
		// - Object, Object 제너릭 매개변수를 갖는 제어릭 클래스 객체 생성
//		C2 obj2 = new C2(); // 제너릭 매개변수 생략하면 <Object, Object> 자동 포함 -> C2<Object, Object>
//		obj2.setF1(1);
//		obj2.setF2("성구");
//		System.out.println(obj2.getF1() + " " + obj2.getF2());
//		obj2.setF1("성구");
//		obj2.setF2(1);
//		System.out.println(obj2.getF1() + " " + obj2.getF2());
//		obj2.setF1(new C());
//		obj2.setF2("성구");
//		System.out.println(obj2.getF1() + " " + obj2.getF2());
	}
}
