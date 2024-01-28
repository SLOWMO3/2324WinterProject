package Winter;

import java.io.ObjectInputStream.GetField;

public class CoupangApp {

	public static void main(String[] args) {
		Coupang coupang = new Coupang();
		
		coupang.addMember(new Member(1111, "철수"));
		coupang.addMember(new Member(2222, "영희"));
		coupang.addMember(new Member(3333, "훈이"));
		
		coupang.addProduct(new Member(1111, "철수"),new Product("짱돌", 2000, 2));
		coupang.addProduct(new Member(2222, "영희"),new Product("인형", 3000, 1));
		coupang.addProduct(new Member(3333, "훈이"), new Product("친구", 1500, 1));
		coupang.addProduct(new Member(3333, "훈이"), new Product("짱돌", 2500, 1));
		
		//실행시 1.로그인 2.회원가입
		//접속시 1.상품등록 2.상품삭제 3.개인정보확인 4. 구매 등등 ==> Coupang에 작성할것 로그인 성공시 메소드로!
		coupang.start();

	}

}