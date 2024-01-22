// Wrapper(포장) 클래스
// - 8개의 기본 타입에 해당하는 8개의 클래스
// - java.lang 패티지에 포함
// - Byte(byte), Character(char), Short(short), Integer(int)
// - Long(long), Float(float), Double(double), Boolean(boolean)
// - 박싱(boxing) vs. 언박싱(Unboxing)
//   - 박싱: 기본 타입을 포장 객체로 만드는 과정
//   - 언박싱: 포장 객체를 기본 타입으로 얻어내는 과정

package ch06_WrapperClass;

public class 실습_해답 {

	public static void main(String[] args) {
		// 박싱(자동 박싱) - Integer 보기
//		Integer i1 = new Integer(3); // deprecated
//		Integer i2 = 3; // 자동 박싱
//		System.out.println(i2); // Integer 클래스에서 toString() 재정의
//		System.out.println(i1.equals(i2)); // Integer 클래스 equals() 재정의
//		System.out.println(i1.hashCode()); // Integer 클래스 hashCode() 재정의
//		System.out.println(i2.hashCode()); // Integer 클래스 hashCode() 재정의
//		System.out.println(i1 == i2); // 번지 비교
		
		// 언박싱(자동 언박싱) - Double 보기
//		Double d1 = new Double(3.5); // deprecated
//		Double d2 = 3.5; // 자동 박싱
//		System.out.println(d2); // Double 클래스 toString() 재정의
//		System.out.println(d1.equals(d2)); // Double 클래스 equals() 재정의
//		System.out.println(d1.hashCode()); // Double 클래스 hashCode() 재정의
//		System.out.println(d2.hashCode()); // Double 클래스 hashCode() 재정의
//		System.out.println(d1 == d2); // 기본 타입에서 ==
		
		// 연산 보기
		Integer i1 = 3; 
		Double d1 = 3.5;
		int i2 = 4;  
		double d2 = i1 + i2 + 4 + d1;
		Integer i3 = 2 + 3 + i1;
		System.out.println(d2);
		System.out.println(i3);
	}
}
