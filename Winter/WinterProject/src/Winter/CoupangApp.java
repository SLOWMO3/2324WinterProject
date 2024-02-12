package Winter.WinterProject.src.Winter;

public class CoupangApp {

	public static void main(String[] args) {
		Coupang coupang = new Coupang();


		coupang.addMember(new Member(1111, "철수"));
		coupang.addMember(new Member(2222, "영희"));
		coupang.addMember(new Member(3333, "훈이"));

		coupang.addProduct(coupang.mem_list.get(0),new Product("짱돌", 100000, 2));
		coupang.addProduct(coupang.mem_list.get(1),new Product("인형", 3000, 1));
		coupang.addProduct(coupang.mem_list.get(2),new Product("친구", 1500, 1));
		coupang.addProduct(coupang.mem_list.get(2),new Product("짱돌", 2500, 1));

		coupang.start();
	}
}