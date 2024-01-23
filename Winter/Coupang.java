package Winter;

import java.util.*;

public class Coupang {
	List<Member> mem_list = new ArrayList<>(); //전체 회원 리스트
	List<Product> pro_list = new ArrayList<>(); //전체 상품 리스트
	
	//비교 : 배열안에 동일객체가 있는지 확인
	Member findMember(Member mem) {
		if(mem_list.contains(mem)) {
			return mem;
		}
		return null;
	}

	//회원가입
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
	
	//검색
	
	//구매
	
	//탈퇴

	
}
