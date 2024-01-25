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
			System.out.println("1.구매 2.판매 3.로그아웃"); // 메뉴 출력
			int input = scan.nextInt();
			switch(input) {
			case 1: //구매
				buy();
				break;
			case 2: //판매
				sell();
				break;
			case 3: //로그아웃
				return;

			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
			}
		}
	}
	
	// 판매
	private void sell() {
		// TODO Auto-generated method stub
		System.out.println("작성필요!!!!!!!!!!!!!!");
		System.out.println();
		while(true) {
			System.out.println("1.물품등록 2.물품삭제 3.이전메뉴"); // 메뉴 출력
			int input = scan.nextInt();
			switch(input) {
			case 1: //물품등록
				break;
			case 2: //물품삭제
				break;
			case 3: //이전메뉴
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
			}
		}
	}

	// 구매
	private void buy() {
		// TODO Auto-generated method stub
		System.out.println("작성필요!!!!!!!!!!!!!!");
		System.out.println();
	}


	//검색

	//구매

	//탈퇴


}