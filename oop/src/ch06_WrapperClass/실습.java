// Wrapper(포장) 클래스
// - 8개의 기본 타입에 해당하는 8개의 클래스
// - java.lang 패티지에 포함
// - Byte(byte), Character(char), Short(short), Integer(int)
// - Long(long), Float(float), Double(double), Boolean(boolean)
// - 박싱(boxing) vs. 언박싱(Unboxing)
//   - 박싱: 기본 타입을 포장 객체로 만드는 과정
//   - 언박싱: 포장 객체를 기본 타입으로 얻어내는 과정

package ch06_WrapperClass;


public class 실습 {

	public static void main(String[] args) {
		// 박싱(자동 박싱) - Integer 보기
    Integer i1 = new Integer(3);
    Integer i2 = 3;
	System.out.println(i1);
	System.out.println(i1.equals(i2));
	System.out.println(i1.hashCode());
	System.out.println(i2.hashCode());
	System.out.println(i1==i2);
	
	Double d1 = new Double(3.5);
    Double d2 = 3.5;
	System.out.println(d1);
	System.out.println(d1.equals(i2));
	System.out.println(d1.hashCode());
	System.out.println(d2.hashCode());
	System.out.println(d1==d2);
	
	
	
		// 언박싱(자동 언박싱) - Double 보기
    
		
		// 연산 보기

		
	}
}
