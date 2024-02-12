package Winter.WinterProject.src.Winter;

import java.util.*;

public class Member {
	private int id;				//회원가입, 로그인할때 쓸 아이디
	private String nickname;	//닉네임
	private int coupaymoney = 0;    //보유하고있는 쿠페이머니 잔액
	private String membershipGrade;
	private Membership membership;
	private int total_PA(){ //총구매액(purchase amount)
		int tpa = 0;
		for(int i = 0; i<my_purchased.size(); i++){
			tpa += my_purchased.get(i).getQuantity() * my_purchased.get(i).getPrice();
		}
		return tpa;
	}
	private int total_SA = 0; 	//총판매액(sales amount)

	//총 구매액, 판매액으로 등급+혜택 적용 -> if문 사용??


	//구매, 판매 상품 리스트
    List<Product> my_purchased = new ArrayList<>(); //구매한 상품
	List<Product> my_sale = new ArrayList<>(); // 판매중 상품
	List<Product> my_cart = new ArrayList<>();
	List<Product> my_present = new ArrayList<>();

	public Member(int id, String nickname) {
        this.id = id;
		this.nickname = nickname;
	}

	public Member(int id) {
		this.id = id;
	}
	public Member() {

	}

	//get/set 메소드
	public int get_id() { return id; }
	public void set_id(int id) { this.id = id; }
	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	public Membership getMembership() {
		return membership;
	}
	public String get_nickname() { return nickname; }
	public void set_nickname(String nickname) { this.nickname = nickname; }
	public String get_membershipGrade() { return membershipGrade; }
	public void set_membershipGrade(String membershipGrade) { this.membershipGrade = membershipGrade; }
	public int getTotal_PA() { return total_PA(); }
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
	@Override //미완
	public String toString() {
		return "닉네임:" + nickname + " 멤버쉽:" + membershipGrade + " 쿠페이머니:" + coupaymoney;
	}

}
