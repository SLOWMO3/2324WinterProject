package Winter.WinterProject.src.Winter;

import java.util.*;

public class Coupang {
	Scanner scan = new Scanner(System.in); // 스캐너 : scan
	private List<Member> mem_list = new ArrayList<>(); //전체 회원 리스트
	private List<Product> pro_list = new ArrayList<>(); //전체 상품 리스트
	Member nowMember; // 현재 회원이 누구인지 플래그

	int logout_exit_flag = 0; //메뉴창에서 바로 종료 가능하게 만들려고

	// get/set
	public Member getNowMember() {
		return nowMember;
	}

	public void setNowMember(Member nowMember) {
		this.nowMember = nowMember;
	}

	//비교 : 배열안에 동일객체가 있는지 확인
	Member findMember(Member mem) {
		if(mem_list.contains(mem)) {
			for(int i = 0; i < mem_list.size(); i++){
				if(mem.equals(mem_list.get(i))){
					return mem_list.get(i);}
			}
		}
		return null;
	}

	//배열 출력함수
	void printProductList(List<Product> list){
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + " ");
		System.out.println();
	}

	//회원가입(단순추가)
	void addMember(Member mem) {
		mem_list.add(mem);
	}

	//등록 : 동일 상품 등록시 배열에 추가되는게 아닌 수량이 증가
	void addProduct(Member mem, Product pro) {
		pro.set_s_name(mem.get_nickname()); //로그인된 닉네임 받아서 상품추가
		if(pro_list.contains(pro)) { //판매자와 상품이름이 모두 같으면
			for (int i = 0; i < pro_list.size(); i++) { //전체 상품 배열에서 수량을 증가시킴
				if(pro_list.get(i).equals(pro)) {
					pro_list.get(i).setQuantity(pro_list.get(i).getQuantity()+pro.getQuantity());
					break;
				}
			}
			for (int j = 0; j < mem.my_sale.size(); j++) { //개인 판매중 상품 배열에서 수량을 증가시킴
				if(mem.my_sale.get(j).equals(pro)) {
					mem.my_sale.get(j).setQuantity(mem.my_sale.get(j).getQuantity()+pro.getQuantity());
					break;
				}
			}
		}
		else {
			pro_list.add(pro); //전체 배열에 상품등록
			mem.my_sale.add(pro); //개인 판매중 상품 배열에 상품등록
		}

	}
	//회원 삭제
	void removeMember(Member mem) {
		mem_list.remove(mem);
	}

	//삭제 : 상품 삭제 및 수량 변경 -> 수량 0이면 물품없어짐 : 본인이 본인이 등록한 물건 삭제
	void removeProduct(Member mem, Product pro) {
		pro.set_s_name(mem.get_nickname());
		if(pro_list.contains(pro)) { //판매자와 상품이름이 모두 같으면
			for (int i = 0; i < pro_list.size(); i++) { //배열에서 해당상품 찾아서
				if(pro_list.get(i).equals(pro)) {
					if(pro_list.get(i).getQuantity()- pro.getQuantity() == 0) {
						pro_list.remove(i);
						mem.my_sale.remove(pro); //개인 판매중 상품 배열에 상품삭제
						System.out.println("제품이 삭제되었습니다.");
						break;}
					else if(pro_list.get(i).getQuantity()-pro.getQuantity() > 0) {
						pro_list.get(i).setQuantity(pro_list.get(i).getQuantity()-pro.getQuantity()); //전체 상품 배열에서 수량을 감소시킴
						mem.my_sale.get(i).setQuantity(mem.my_sale.get(i).getQuantity()-pro.getQuantity()); //개인 판매중 상품 배열에서 수량을 감소시킴
						System.out.println("제품수량이 감소하였습니다.");
						break;
					}
					else {System.out.println("삭제하고자 하는 상품의 수량이 기존 수량보다 많습니다!");
						break;}
				}
			}
		}
		else System.out.println("등록되지 않은 상품입니다.");
	}

	//초기화면
	public void start() {
		while(true) {
			if(logout_exit_flag == 1){System.out.println("앱을 종료합니다."); return;}
			System.out.println("------------------------------------------------");
			System.out.println("1.회원가입 2.로그인 3.종료"); // 두 가지 메뉴 출력
			System.out.println("------------------------------------------------");
			int input = scan.nextInt();
			switch(input) {
				case 1: //회원가입
					this.join();
					break;
				case 2: //로그인
					this.login();
					break;
				case 3: //종료
					System.out.println("앱을 종료합니다.");
					return;

				default:
					System.out.println("잘못된 입력입니다.");
			}
		}
	}


	// 회원가입
	private void join() {
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
		while(true) {
			System.out.println("ID를 입력해주세요.(숫자)");
			int id = scan.nextInt();
			System.out.println("닉네임을 입력해주세요.");
			String nn = scan.next();
			Member mb = new Member(id, nn);
			Member flag = findMember(mb);
			if(flag==null) {
				System.out.println("존재하지 않는 회원입니다.");
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
		while(true) {
			if(findMember(nowMember)==null){return;}
			System.out.println("------------------------------------------------");
			System.out.println("1.전체 상품보기 2.구매 3.판매 4.마이정보 5.쿠페이머니 충전 6.로그아웃 7.종료"); // 메뉴 출력
			System.out.println("------------------------------------------------");
			int input = scan.nextInt();
			switch(input) {
				case 1: //전체 상품보기
					printProductList(pro_list);
					break;
				case 2: //구매
					buy();
					break;
				case 3: //판매
					sell();
					break;
				case 4: //마이정보
					myMenu();
					break;
				case 5: //쿠페이머니 충전
					charge();
					break;
				case 6: //로그아웃
					return;
				case 7: //종료
					logout_exit_flag = 1;
					return;

				default:
					System.out.println("잘못된 입력입니다.");
					System.out.println();
			}
		}
	}

	//마이정보 -> 미완
	private void myMenu() {
		while(true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.개인정보 2.판매중 상품 3.구입 상품 4.회원탈퇴 5.이전메뉴"); // 메뉴 출력
			System.out.println("------------------------------------------------");
			int input = scan.nextInt();
			switch(input) {
				case 1: //개인정보
					System.out.println(nowMember.toString());
					break;
				case 2: //판매중인 상품
					printProductList(nowMember.my_sale);
					break;
				case 3: //구입한 상품
					printProductList(nowMember.my_purchased);
					break;
				case 4: //회원탈퇴
					removeMember(nowMember); //->미완 ,탈퇴후 로그인 창으로 이동해야됨
					return;
				case 5: //이전 메뉴
					return;
				default:
					System.out.println("잘못된 입력입니다.");
					System.out.println();
			}
		}
	}

	private void charge() {
		System.out.println("현재 보유 쿠페이머니: " + nowMember.getCoupaymoney());
		System.out.print("충전금엑: ");
		int chargeMoney = scan.nextInt();

		nowMember.setCoupaymoney(nowMember.getCoupaymoney()+chargeMoney);
		System.out.println("충전완료.");
		System.out.println("현재 보유 쿠페이머니: "+nowMember.getCoupaymoney()+"원입니다.");
	}

	//판매
	private void sell() {
		while(true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.물품등록 2.물품삭제 3.이전메뉴"); // 메뉴 출력
			System.out.println("------------------------------------------------");
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

	//물품등록
	private void productRegistration() {
		System.out.println("등록할 물품의 제품명,가격,수량을 입력해주세요.");
		System.out.println("제품명: ");
		String name = scan.next();
		System.out.println("가격: ");
		int price = scan.nextInt();
		System.out.println("수량: ");
		int Qy = scan.nextInt();

		Product pd = new Product(name,price,Qy);
		addProduct(nowMember,pd);
		System.out.println("물픔등록이 완료되었습니다.");
	}

	//물품삭제
	private void productRemove() {
		System.out.println("삭제할 상품의 제품명과 삭제할 수량을 입력해주세요 :");
		System.out.println("제품명: ");
		String removename = scan.next();
		System.out.println("수량: ");
		int removeQy = scan.nextInt();
		Product removepd = new Product(removename,removeQy);

		removeProduct(getNowMember(),removepd);
	}

	//구매
	private void buy() {
		while(true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.물품검색 2.물품구매 3.이전메뉴"); // 메뉴 출력
			System.out.println("------------------------------------------------");
			int input = scan.nextInt();
			switch(input) {
				case 1: //물품검색
					this.productSearch();
					break;
				case 2: //물품구매(장바구니에 추가)
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

	//상품검색 ==> 검색 대상 리스트가 자신이 등록한 물품도 검색됨
	private void productSearch() {
		int flag = 0;
		System.out.println("찾는 상품을 검색해주세요: ");
		String s_name = scan.next();

		for (int i = 0; i < pro_list.size(); i++) { //배열에서 검색한 상품이 있는지 확인
			if(s_name.equals(pro_list.get(i).get_p_name())) {
				System.out.println(pro_list.get(i).toString());
				System.out.println();
				flag++;
			}
		}
		if(flag==0){
			System.out.println("찾는 상품이 존재하지 않습니다.");
		}

	}

	private void productPurchase() {
		while(true) {
			int flag = 0;
			List<Product> ex_list = new ArrayList<>();
			System.out.println("구매하실 상품을 검색해주세요: (종료: r입력)");
			String s_name = scan.next();
			if(s_name.equals("r")){
				break;
			}
			for (int i = 0; i < pro_list.size(); i++) { //배열에서 검색한 상품이 있는지 확인
				if(s_name.equals(pro_list.get(i).get_p_name())) {
					System.out.print( flag+1 + ".");
					System.out.println(pro_list.get(i).toString());
					System.out.println();
					ex_list.add(pro_list.get(i));
					flag++;
				}
			}
			if(flag==0) {
				System.out.println("찾는 상품이 존재하지 않습니다.");
				continue;
			}
			while(true) {
				System.out.println("구매하실 상품의 번호를 입력하세요.(종료:0)");
				int num1 = scan.nextInt();
				if(num1==0){break;}
				if (1 <= num1 && num1 < ex_list.size()) {
					System.out.println("구매하실 수량을 입력하세요.");
					int num2 = scan.nextInt();
					Product pro = ex_list.get(num1 - 1);
					if (0 < num2 && num2 <= pro.getQuantity()) {
						Product cart = new Product(pro.get_p_name(), pro.getPrice(), num2);
						nowMember.my_cart.add(cart);
						System.out.println("추가되었습니다.");
					} else {
						System.out.println("잘못된 수량입니다.");
					}
				} else {
					System.out.println("없는 번호입니다.");
				}
			}

		}
	}


}
