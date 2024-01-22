// 최상위 클래스 Object - toString()
// - 객체 정보를 문자열로 반환
//   - 객체정보: 패키지이름.클래스이름@해쉬코드
//   - 해쉬코드: 객체가 저장된 위치 관련 값
// - 일반적으로 자식 클래스의 객체 정보 출력을 위해 재정의하여 사용
// - 많은 표준 라이브러리 클래스들은 toString() 메소드 재정의되어 있음
//   - String, Wrapper, Collection, ... 클래스

package ch03_Object클래스.toString;

class 실습 {
	public static void main(String[] args) {
		// Account 객체 생성 후 정보 출력
	Account acc = new Account("1","lee", 100);
	System.out.println(acc);
	
	Object o = new Object();
	System.out.println(o);
	
	Integer i1 = new Integer(34);
	int i2 = 34;
	System.out.println(i1);
	System.out.println(i2);
	}
}
