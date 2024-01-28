package Winter.WinterProject.src.Winter;

public class CoupangApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coupang coupang = new Coupang();

		System.out.println("나는 의태");

		//실행시 1.로그인 2.회원가입
		coupang.start();
		
		//접속시 1.상품등록 2.상품삭제 3.개인정보확인 4. 구매 등등 ==> Coupang에 작성할것 로그인 성공시 메소드로!
	}

	public void test() {
		System.out.println('test');
	}

}