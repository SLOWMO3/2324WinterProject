// 최상위 클래스 Object - toString()
// - 객체 정보를 문자열로 반환
//   - 객체정보: 패키지이름.클래스이름@해쉬코드
//   - 해쉬코드: 객체가 저장된 위치 관련 값
// - 일반적으로 자식 클래스의 객체 정보 출력을 위해 재정의하여 사용
// - 많은 표준 라이브러리 클래스들은 toString() 메소드 재정의되어 있음
//   - String, Wrapper, Collection, ... 클래스

package ch03_Object클래스.toString;

class Account {
	String ano;		// 계좌번호
	String owner;	// 소유자
	double balance;	// 잔액
	
	public Account() { } 
	public Account(String ano, String owner, int balance) { 
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "ano" +  "owner" + "balance";
		
	}
	
	
}
