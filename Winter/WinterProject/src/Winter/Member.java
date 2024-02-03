package Winter.WinterProject.src.Winter;

import java.util.*;

public class Member {
	private int id;				//아이디
	private String nickname;	//닉네임
	private int coupaymoney = 0;    //보유하고있는 쿠페이머니 잔액

	public Member(int id, String nickname) {
		this.id = id;
		this.nickname = nickname;
	}

	//총 구매액, 판매액으로 등급+혜택 적용
	private int total_PA; 		//총구매액(purchase amount)
	private int total_SA; 		//총판매액(sales amount)

	//구매, 판매 상품 리스트
	List<Product> my_purchased = new ArrayList<>(); //구매한 상품
	List<Product> my_purchase = new ArrayList<>(); //구매
	List<Product> my_sale = new ArrayList<>(); // 판매
	List<Product> my_cart = new ArrayList<>(); // 카트

	//get/set 메소드
	public int get_id() { return id; }
	public void set_id(int id) { this.id = id; }
	public String get_nickname() { return nickname; }
	public void set_nickname(String nickname) { this.nickname = nickname; }
	public int getTotal_PA() { return total_PA; }
	public void setTotal_PA(int total_PA) { this.total_PA = total_PA; }
	public int getTotal_SA() { return total_SA; }
	public void setTotal_SA(int total_SA) { this.total_SA = total_SA; }
	public int getCoupaymoney() {
		return coupaymoney;
	}
	public void setCoupaymoney(int coupaymoney) {
		this.coupaymoney = coupaymoney;
	}

	//equals, toString 재정의
	@Override
	public boolean equals(Object obj) {
		Member temp = (Member)obj;
		if(this.id == temp.id)
			return true;
		return false;
	}

	String rank(){
		if(0 <= total_PA + total_SA && total_PA + total_SA < 5000)
			return "브론즈";
		else if (5000 <= total_PA + total_SA && total_PA + total_SA < 10000)
			return "실버";
		else if (10000 <= total_PA + total_SA && total_PA + total_SA < 20000)
			return "골드";
		else return "다이아";
	}

	@Override //미완
	public String toString() {
		return "닉네임:" + nickname + " 등급:" + rank() + " 쿠페이머니:" + coupaymoney;
	}

}