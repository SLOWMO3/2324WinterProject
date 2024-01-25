package Winter;

import java.util.*;

public class Coupang {
	Scanner scan = new Scanner(System.in); // 스캐너 : scan
	List<Member> mem_list = new ArrayList<>(); //전체 회원 리스트
	List<Product> pro_list = new ArrayList<>(); //전체 상품 리스트
	Member nowMember; // 현재 회원이 누구인지 플래그


	//비교 : 배열안에 동일객체가 있는지 확인
	Member findMember(Member mem) {
		if(mem_list.contains(mem)) {
			return mem;
		}
		return null;
	}

	//회원가입(단순추가)
	void addMember(Member mem) {		
		mem_list.add(mem);
	}
	

	public Member getNowMember() {
		return nowMember;
	}

	public void setNowMember(Member nowMember) {
		this.nowMember = nowMember;
	}

	//등록 : 동일 상품 등록시 배열에 추가되는게 아닌 수량이 증가
	void addProduct(Member mem, Product pro) {
		pro.set_s_name(mem.get_nickname()); //로그인된 닉네임 받아서 상품추가
		if(pro_list.contains(pro)) { //판매자와 상품이름이 모두 같으면
			for (int i = 0; i < pro_list.size(); i++) { //배열에서 해당상품 찾아서
				if(pro_list.get(i).equals(pro)) {
					pro_list.get(i).setQuantity(pro_list.get(i).getQuantity()+pro.getQuantity()); //원래 배열에 있던 상품의 수량을 증가시킴
					break;
				}
			}
		}
		else {pro_list.add(pro);} //그게 아니면 배열에 상품등록

	}
	//삭제 : 상품 삭제 및 수량 변경 -> 수량 0이면 물품없어짐
   void removeProduct(Member mem, Product pro) {
	   pro.set_s_name(mem.get_nickname());
		if(pro_list.contains(pro)) { //판매자와 상품이름이 모두 같으면
			for (int i = 0; i < pro_list.size(); i++) { //배열에서 해당상품 찾아서
				if(pro_list.get(i).equals(pro)) {
					pro_list.get(i).setQuantity(pro_list.get(i).getQuantity()-pro.getQuantity()); //원래 배열에 있던 상품의 수량을 감소시킴
				   if(pro_list.get(i).getQuantity() == 0) {
					   pro_list.remove(i);
						 System.out.println("제품개수가 0이되어서 완전히 삭제되었습니다.");
						 break;
				   }
				   else if(pro_list.get(i).getQuantity() < 0) {
					   System.out.println("삭제하려는 개수보다 물품의 개수가 더 적습니다.");
				   }
				   else System.out.println("제품수량이 감소하였습니다.");
					break;
				}
			}
		}
		else System.out.println("등록되어 있지 않은 상품입니다.");
   }

	//초기화면
	public void start() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료"); // 두 가지 메뉴 출력
			int input = scan.nextInt();
			switch(input) {
			case 1: //회원가입
				this.join();
				break;
			case 2: //로그인
				this.login();
				break;
			case 3: //종료
				return;

			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}


	// 회원가입
	private void join() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("가입할 ID를 입력해주세요.(숫자)");
			int id = scan.nextInt();
			System.out.println("가입할 닉네임을 입력해주세요.");
			String nn = scan.next();
			Member mb = new Member(id, nn);
			Member flag = findMember(mb);
			if(flag==null) {
				this.addMember(mb);
				System.out.println("가입이 완료되었습니다.");
				System.out.println();
				break;
			}else {
				System.out.println("이미 존재하는 ID입니다.");
				System.out.println();
				continue;
			}
		}
	}
	
	//로그인
	private void login() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("ID를 입력해주세요.(숫자)");
			int id = scan.nextInt();
			System.out.println("닉네임을 입력해주세요.");
			String nn = scan.next();
			Member mb = new Member(id, nn);
			Member flag = findMember(mb);
			if(flag==null) {
				System.out.println("존재하지않는 회원입니다.");
				System.out.println();
				continue;
			}else {
				nowMember = mb;
				System.out.println("로그인에 성공하였습니다.");
				System.out.println();
				break;
			}
		}
		this.showMenu();
	}
	
	// 로그인 성공 시 창
	private void showMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1.구매 2.판매 3.쿠페이머니 충전 4.로그아웃"); // 메뉴 출력
			int input = scan.nextInt();
			switch(input) {
			case 1: //구매
				buy();
				break;
			case 2: //판매
				sell();
				break;
			case 3: //쿠페이머니 충전
				charge();
				break;
			case 4: //로그아웃
				return;

			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
			}
		}
	}
	
	private void charge() {
		// TODO Auto-generated method stub
		System.out.println("얼마를 충전하시겠습니까? 현재 보유하고있는 쿠페이머니는 " + getNowMember().getCoupaymoney()+"입니다.");
		int chargeMoney = scan.nextInt();
		getNowMember().setCoupaymoney(getNowMember().getCoupaymoney()+chargeMoney);
		System.out.println("성공적으로 충전되었습니다.");
		System.out.println("충전 후 보유하고 계신 쿠페이머니는 "+getNowMember().getCoupaymoney()+"원입니다.");
				}

	// 판매
	private void sell() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1.물품등록 2.물품삭제 3.이전메뉴"); // 메뉴 출력
			int input = scan.nextInt();
			switch(input) {
			case 1: //물품등록
				this.productRegistration();
				break;
			case 2: //물품삭제
				this.productRemove();
				break;
			case 3: //이전메뉴
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
			}
		}
	}
	private void productRegistration() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("등록하실 물품의 제품명,가격,수량을 입력해주세요 : ");
			String name = scan.next();
			int price = scan.nextInt();
		    int Qy = scan.nextInt();
			Product pd = new Product(name,price,Qy);
		    addProduct(getNowMember(),pd);
		    System.out.println("물픔등록이 완료되었습니다.");
		    break;
		}
	
		
	}
	
	private void productRemove() {
		while(true) {
		 System.out.println("제거하실 물품의 제품명과 제거할 수량을 입력해주세요 :");
		 String removename = scan.next();
		 int removeQy = scan.nextInt();
		 Product removepd = new Product(removename,removeQy);
		 removeProduct(getNowMember(),removepd);
		 break;
		 
		}
	}
	
	private void productSearch() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("찾는 상품을 검색해주세요: ");
			String s_name = scan.next();
			for (int i = 0; i < pro_list.size(); i++) { //배열에서 검색한 상품이 있는지 확인
				if(pro_list.get(i).get_p_name().equals(s_name)) {
					System.out.println("찾으시는 상품이 있습니다.");
					System.out.println("");
					break;
				}
			
				else
					System.out.println("찾으시는 상품이 없습니다. 다시 검색해주세요.");
	
		
		}
	
		
	}
	}
	
	// 구매
	private void buy() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1.물품검색 2.물품구매 3.이전메뉴"); // 메뉴 출력
			int input = scan.nextInt();
			switch(input) {
			case 1: //물품등록
				this.productSearch();
				break;
			case 2: //물품삭제
				this.productPurchase();
				break;
			case 3: //이전메뉴
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
			}
		}
	}

	private void productPurchase() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("구매하실 상품을 검색해주세요: ");
			String s_name = scan.next();
			for (int i = 0; i < pro_list.size(); i++) { //배열에서 검색한 상품이 있는지 확인
				if(pro_list.get(i).get_p_name().equals(s_name)) {
					System.out.println("상품을 찾았습니다.");
					System.out.println("");
					System.out.println("몇개를 구매하시겠습니까? 구매가능 최대개수는"+pro_list.get(i).getQuantity()+"입니다.");
					int pc_count = scan.nextInt();
					if(pro_list.get(i).getQuantity()>= pc_count) {
						System.out.println("구매가능한 수량입니다. 총 구매액은 " + pro_list.get(i).getPrice()*pc_count +"원입니다."+" 구매하시겠습니까? Y/N으로 답해주세요:");
						String choice = scan.next();
						switch(choice) {
						case "Y": 
							if(getNowMember().getCoupaymoney() >= pro_list.get(i).getPrice()*pc_count) {
								getNowMember().setCoupaymoney(getNowMember().getCoupaymoney()-pro_list.get(i).getPrice()*pc_count);
								System.out.println("구매완료했습니다!");
								break;
							}
							else 
								System.out.println("보유하고있는 쿠페이머니보다 구매금액이 더 커서 구매할 수 없습니다. 먼저 쿠페이머니를 충전해주세요!");
							break;
						case "N" :
							System.out.println("구매가 취소되었습니다.");
							break;
						
						default:
							System.out.println("잘못된 입력입니다.");
							System.out.println();
							break;
						}
				
					}
				}
			
				else
					System.out.println("찾으시는 상품이 없습니다. 다시 검색해주세요.");
				break;
		}
	
		break;
	}
	}

}
