import java.util.Scanner;

// 멤버십 등급별로 혜택이 달라지는 프로그램을 만들었습니다.

interface Benefit{
	double discount();
	void selectgift();
	double charge(double chargemoney);
	
}

class Member implements Benefit{
	private String membername;
	private String sex;
	private String phonenum;
	private double memberpoint=0.0;
	private double shoppingcartprice=0.0;

	
	public Member(String membername, String sex, String phonenum,double memberpoint, double shoppingcartprice) {
		// TODO Auto-generated constructor stub
		this.membername = membername;
		this.sex = sex;
		this.phonenum = phonenum;
		this.memberpoint = memberpoint;
		this.shoppingcartprice = shoppingcartprice;
	}



	double payment(){
	 return this.memberpoint -= this.shoppingcartprice;
	}
	

	
	public String getMembername() {
		return membername;
	}



	public void setMembername(String membername) {
		this.membername = membername;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getPhoneNum() {
		return phonenum;
	}



	public void setPhoneNum(String phoneNum) {
		this.phonenum = phoneNum;
	}



	public double getMemberpoint() {
		return memberpoint;
	}



	public void setMemberpoint(int memberpoint) {
		this.memberpoint = memberpoint;
	}



	public double getShoppingcartprice() {
		return shoppingcartprice;
	}



	public void setShoppingcartprice(int shoppingcartprice) {
		this.shoppingcartprice = shoppingcartprice;
	}
   


	@Override
	public String toString() {
		String str = "멤버이름:" + membername + ", " + 
				    "성별:" + sex + ", " + 
					"멤버 전화번호:" + phonenum + ", " + 
					"포인트잔액:" + memberpoint+ ", "+
					"장바구니총금액" +shoppingcartprice;
					;
		return str;
	}

	@Override
	public boolean equals(Object obj) { //equals 재정의
		if(this.membername == ((Member)obj).membername);
			return true;
	}

	@Override
	public double discount() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double charge(double chargemoney) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void selectgift() {
		// TODO Auto-generated method stub
	
	}
	
}





class BronzeMemberShip extends Member{
	public BronzeMemberShip(String membername, String sex, String phonenum, double memberpoint,double shoppingcartprice) {
		super(membername,sex,phonenum,memberpoint,shoppingcartprice);	
	}
	
	
	
	@Override
	public double charge(double chargemoney) {//충전시 추가로 받는 돈
		// TODO Auto-generated method stub
		double pluscharge = chargemoney*0.1;
		return super.getMemberpoint()+pluscharge+chargemoney;
	}

	@Override
	public double discount() { //할인받는금액
		// TODO Auto-generated method stub
	   return super.getShoppingcartprice()*0.05; 
	}
	
	@Override
	double payment(){ //총 결제금액
		 double totalmoney = super.getShoppingcartprice()-super.discount();
		 return super.getMemberpoint() - totalmoney;
		}
	
	@Override
	public String toString() {
		String str = "{브론즈 등급의 회원}" +","+
				 	"멤버이름:" + super.getMembername() + ", " + 
					"성별:" + super.getSex()+ ", "+
					"멤버 전화번호:" + super.getPhoneNum() + ", " + 
					"포인트잔액:" + super.getMemberpoint()+ ", "+
					"장바구니총금액" +super.getShoppingcartprice();
					;
		return str;
	}

	

}



class SilverMemberShip extends Member{
	String gift [] = {"과자세트","화장품세트","음료수세트"};
	public  SilverMemberShip (String membername, String sex, String phonenum, double memberpoint,double shoppingcartprice,String gift[]) {
		super(membername,sex,phonenum,memberpoint,shoppingcartprice);	
		this.gift = gift;
	}
	
	@Override
	public void selectgift() {
		if(super.getShoppingcartprice()>= 200000) {
			System.out.println("장바구니금액이 20만원이 넘었으므로 실버 등급 기프트가 주어집니다. 무엇을 선택하시겠습니까?");
			System.out.println("0.과자세트,1.화장품세트,2.음료수세트");
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
		    System.out.println("선택을 완료했습니다.");
			}
			 }
		
	
	
	
	
	
	
	
	@Override
	public double charge(double chargemoney) {//충전시 추가로 받는 돈
		// TODO Auto-generated method stub
		double pluscharge = chargemoney*0.2;
		return super.getMemberpoint()+pluscharge+chargemoney;
	}

	@Override
	public double discount() { //할인받는금액
		// TODO Auto-generated method stub
	   return super.getShoppingcartprice()*0.1; 
	}
	
	@Override
	double payment(){ //총 결제금액
		 double totalmoney = super.getShoppingcartprice()-super.discount();
		 return super.getMemberpoint() - totalmoney;
		}
	
	@Override
	public String toString() { //등급별로 toString 재정의
		String str = "{실버 등급의 회원}" +","+
				 	"멤버이름:" + super.getMembername() + ", " + 
					"성별:" + super.getSex()+ ", "+
					"멤버 전화번호:" + super.getPhoneNum() + ", " + 
					"포인트잔액:" + super.getMemberpoint()+ ", "+
					"장바구니총금액" +super.getShoppingcartprice();
		return str;
	}
}


class GoldMemberShip extends Member{
	String watchthing[] = {"넷플릭스","디즈니플러스","티빙","왓챠"};
	String gift2[] = {"육류세트","디저트세트","홍삼세트"};
	public  GoldMemberShip (String membername, String sex, String phonenum, double memberpoint,double shoppingcartprice,String gift2[],String watchthing[]) {
		super(membername,sex,phonenum,memberpoint,shoppingcartprice);	
		this.gift2 = gift2;
		this.watchthing = watchthing;
	}

	
	@Override
	public void selectgift() {
		if(super.getShoppingcartprice()>= 200000) {
			System.out.println("장바구니금액이 20만원이 넘었으므로 골드 등급 기프트가 주어집니다. 무엇을 선택하시겠습니까?");
			System.out.println("0.육류세트,1.디저트세트,2.홍삼세트");
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			System.out.println("선택을 완료했습니다.");
		
			 }
		}
	
	
	public void selectwatch() {
		if(super.getShoppingcartprice() >= 300000) {
				System.out.println("장바구니금액이 30만원이 넘었으므로 OTT 1년서비스가 무료로 제공됩니다. 무엇을 선택하시겠습니까?");
				System.out.println("0.넷플릭스,1.디즈니플러스,2.티빙,3.왓챠");
				Scanner scanner = new Scanner(System.in);
				int num2 = Integer.parseInt(scanner.nextLine());
				System.out.println("선택을 완료했습니다.");
		}
	
	}
	
	@Override
	public double charge(double chargemoney) {//충전시 추가로 받는 돈
		// TODO Auto-generated method stub
		double pluscharge = chargemoney*0.3;
		return super.getMemberpoint()+pluscharge+chargemoney;
	}

	@Override
	public double discount() { //할인받는금액
		// TODO Auto-generated method stub
	   return super.getShoppingcartprice()*0.15; 
	}
	
	@Override
	double payment(){ //총 결제금액
		 double totalmoney = super.getShoppingcartprice()-super.discount();
		 return super.getMemberpoint() - totalmoney;
		}
	
	@Override
	public String toString() { //등급별로 toString 재정의
		String str = "{골드 등급의 회원}" +","+
				 	"멤버이름:" + super.getMembername() + ", " + 
					"성별:" + super.getSex()+ ", "+
					"멤버 전화번호:" + super.getPhoneNum() + ", " + 
					"포인트잔액:" + super.getMemberpoint()+ ", "+
					"장바구니총금액" +super.getShoppingcartprice();
		return str;
	}
}

class MemberShip {
	private Member[] memberships;
	MemberShip(int membershipsNum) {
		this.memberships = new Member[membershipsNum];
	}
			public MemberShip(String membername, String sex, String phonenum, double memberpoint, double shoppingcartprice) {
		// TODO Auto-generated constructor stub
	}

			void addMemberShip(Member members) { // 첫번째 null인 원소에 계좌 저장
				for(int i=0; i<memberships.length; i++) {
					if(memberships[i] == null) {
						memberships[i] = members;
						break;
					}
				}
			}
			
			void printAccList() {
				for(Member memb : memberships) {
					if(memb != null)
						System.out.println((memb.toString()));	
					else
						break;
				}
			}
	}


public class MemberShipApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberShip memb = new MemberShip(100); 
		Member members = null;
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while(run) {System.out.print("번호를 선택해주세요.");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1.멤버십생성및혜택확인| 2.멤버정보보기 | 3.장바구니계산하기 | 4.충전 | 5.종료 ");
		System.out.println("----------------------------------------------------------------");
		int num = Integer.parseInt(scanner.nextLine());
		if(num == 1) {
			System.out.println("멤버십 등급을 선택해주세요.");
			System.out.println("1.브론즈 | 2.실버 | 3.골드");
			System.out.println("-------------------------------");
			int num2 = Integer.parseInt(scanner.nextLine());
			
			System.out.print("멤버이름: "); 
			String membername = scanner.nextLine();
			System.out.print("성별: "); 
			String sex = scanner.nextLine();
			System.out.print("전화번호: "); 
			String phonenum = scanner.nextLine();
			System.out.print("보유포인트: "); 
			double memberpoint = Double.parseDouble(scanner.nextLine());
			System.out.print("장바구니총금액: "); 
			double shoppingcartprice = Double.parseDouble(scanner.nextLine());
			
			
			if(num2 == 1) {
				members = new BronzeMemberShip(membername, sex, phonenum, memberpoint,shoppingcartprice);
				memb.addMemberShip(members);
				System.out.println("브론즈등급 멤버십을 생성했습니다.");
				System.out.println("브론즈 멤버십의 장바구니 할인률은 5퍼센트이고 포인트충전시 추가충전혜택은 10퍼센트입니다. ");
			}
			else if(num2 ==2) {
				System.out.println("실버기프트박스 입력");
				members = new SilverMemberShip(membername, sex, phonenum, memberpoint,shoppingcartprice,args);
				memb.addMemberShip(members);
				System.out.println("실버등급 멤버십을 생성했습니다.");
				System.out.println("실버 멤버십의 장바구니 할인률은 10퍼센트이고 포인트충전시 추가충전혜택은 20퍼센트입니다. "
						+ "또한 장바구니 20만원이상구매시 실버 기프트박스를 증정합니다. ");
				members.selectgift();
			}
			else if(num2 ==3) {
				members = new GoldMemberShip(membername, sex, phonenum, memberpoint,shoppingcartprice, args, args);
				memb.addMemberShip(members);
				System.out.println("골드등급 멤버십을 생성했습니다.");
				System.out.println("골드 멤버십의 장바구니 할인률은 15퍼센트이고 포인트충전시 추가충전혜택은 30퍼센트입니다."
						+ " 또한 장바구니 20만원이상구매시 골드 기프트박스를 증정합니다. "
						+ "그리고 30만원이상구매시에는 OTT1년구독서비스를 드립니다.");
			}
			
		    }
		else if(num == 2) {
			System.out.println("멤버십 생성 목록");
			memb.printAccList();
			System.out.println("------------------------------------------------");
			System.out.println();
		}
		else if(num == 3) {
			System.out.println("장바구니를 결제합니다.");
		   System.out.println("결제완료 되었습니다. 남은잔액은 : " +members.payment());
		}
		else if(num == 4) {
			System.out.println("충전할 금액을 입력하시오");
			double chargemoney = Double.parseDouble(scanner.nextLine());
		   System.out.println("충전 후 보유 포인트:" + members.charge(chargemoney));
	    }
		else if(num == 5) { // 종료
			// 시스템 종료 메시지와 함께 시스템을 종료하는 코드 작성
			System.out.println("시스템을 종료 합니다...");
			run = false;
	    
	}

	}
	}
}

