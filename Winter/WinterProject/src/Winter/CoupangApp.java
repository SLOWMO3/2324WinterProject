package Winter.WinterProject.src.Winter;

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

		coupang.start();
	}
}