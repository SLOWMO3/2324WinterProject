package Winter.WinterProject.src.Winter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Coupang {
    Scanner scan = new Scanner(System.in); // 스캐너 : scan
    List<Member> mem_list = new ArrayList<>(); //전체 회원 리스트
    List<Product> pro_list = new ArrayList<>(); //전체 상품 리스트
    List<Product> review_list = new ArrayList<>(); //후기게시판
    Member nowMember = new Member(); // 현재 회원이 누구인지 플래그



    int logout_exit_flag = 0; //메뉴창에서 바로 종료 가능하게 만들려고

    // get/set
    public Member getNowMember() {
        return nowMember;
    }

    public void setNowMember(Member nowMember) {
        this.nowMember = nowMember;
    }

    public void checkNowMember(Member nowMember) {
        if(nowMember != null ) {
            nowMember.updateMembershipGrade(nowMember);
            if (nowMember.get_membershipGrade() != null) {
                switch (nowMember.get_membershipGrade()) {
                    case "Bronze":
                        nowMember.setMembership(new BronzeMemberShip(nowMember));
                        break;
                    case "Silver":
                        nowMember.setMembership(new SilverMembership(nowMember));
                        break;
                    case "Gold":
                        nowMember.setMembership(new GoldMembership(nowMember));
                        break;
                    default:
                        nowMember.setMembership(new Membership(nowMember));
                }
            }
        }
        else System.out.println("잘못된접근");
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
    void printProductList(List<Product> list) {
        if (list.isEmpty()) {
            System.out.println("등록된 상품이 없습니다.");
        } else {
            for (Product product : list) {
                System.out.println(product.toString());
            }
        }
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
                    if (pro_list.get(i).getQuantity() - pro.getQuantity() == 0) {
                        pro_list.remove(i);
                        mem.my_sale.remove(pro); //개인 판매중 상품 배열에 상품삭제
                        System.out.println("제품이 삭제되었습니다.");
                        break;
                    } else if (pro_list.get(i).getQuantity() - pro.getQuantity() > 0) {
                        pro_list.get(i).setQuantity(pro_list.get(i).getQuantity() - pro.getQuantity()); //전체 상품 배열에서 수량을 감소시킴
                        System.out.println("제품수량이 감소하였습니다.");
                        break;
                    } else {
                        System.out.println("삭제하고자 하는 상품의 수량이 기존 수량보다 많습니다!");
                        break;
                    }
                }
            }
        }else {System.out.println("등록되지 않은 상품입니다.");}
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
            System.out.print("ID(숫자) : ");
            int id = scan.nextInt();
            System.out.print("닉네임 : ");
            String nn = scan.next();
            Member mb = new Member(id, nn);
            Member flag = findMember(mb);
            if(flag==null) {
                System.out.println("존재하지 않는 회원입니다.");
                System.out.println();
                continue;
            }else {
                nowMember = flag;
                System.out.println("로그인에 성공하였습니다.");
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
            System.out.println("1.구매 2.판매 3.마이정보 4.쿠페이머니충전 5.선물함 6.후기 7.로그아웃 8.종료"); // 메뉴 출력
            System.out.println("------------------------------------------------");
            int input = scan.nextInt();
            switch(input) {
                case 1: //구매
                    buy();
                    break;
                case 2: //판매
                    sell();
                    break;
                case 3: //마이정보
                    myMenu();
                    break;
                case 4: //쿠페이머니 충전
                    charge();
                    break;
                case 5: // 선물확인
                    gift();
                case 6: //후기
                    review();
                    break;
                case 7: //로그아웃
                    return;
                case 8: //종료
                    logout_exit_flag = 1;
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    System.out.println();
            }
        }
    }

    //마이정보
    private void myMenu() {
        while(true) {
            System.out.println("------------------------------------------------");
            System.out.println("1.개인정보 2.판매중상품 3.구입상품 4.반품 5.회원탈퇴 6.멤버쉽혜택확인 7.이전메뉴"); // 메뉴 출력
            System.out.println("------------------------------------------------");
            int input = scan.nextInt();
            switch(input) {
                case 1: //개인정보
                    nowMember.updateMembershipGrade(nowMember);
                    System.out.println(nowMember.toString());
                    break;
                case 2: //판매중인 상품
                    printProductList(nowMember.my_sale);
                    break;
                case 3: //구입한 상품
                    printProductList(nowMember.my_purchased);
                    break;
                case 4: returnItem(nowMember);
                    break;
                case 5: //회원탈퇴
                    removeMember(nowMember);
                    return;
                case 6: //혜택 확인
                    checkNowMember(nowMember);
                    Membership membership = nowMember.getMembership();
                    if (membership != null) {
                        membership.ShowMemberShipBenefit(nowMember);
                    } else {
                        System.out.println("Membership is null.");
                        // Handle the case where membership is null
                    }
                    return;
                case 7: //이전 메뉴
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    System.out.println();
            }
        }
    }


    // 상품을 판매한 원래 판매자를 찾아내는 함수
    private Member findMemberByNickname(String nickname) {
        for (Member member : mem_list) {
            if (member.get_nickname().equals(nickname)) {
                return member;
            }
        }
        return null; // 찾지 못한 경우
    }



    private void returnItem(Member nowMember) {
        System.out.println("반품하실 물품의 이름을 입력해주세요.");
        String item = scan.next();
        Iterator<Product> iterator = nowMember.my_purchased.iterator();

        while (iterator.hasNext()) {
            Product purchasedProduct = iterator.next();

            if (purchasedProduct.get_p_name().equals(item)) {
                System.out.println("반품하실 수량을 입력해주세요");
                int returnMoney = 3000;
                int returnQuantity = scan.nextInt();

                if (returnQuantity <= purchasedProduct.getQuantity()) {
                    nowMember.setCoupaymoney(nowMember.getCoupaymoney() + returnQuantity*purchasedProduct.getPrice() - returnMoney);
                    purchasedProduct.setQuantity(purchasedProduct.getQuantity() - returnQuantity);
                    Member originalSeller = findMemberByNickname(purchasedProduct.get_s_name());
                    String s_name = purchasedProduct.get_s_name();
                    String p_name = purchasedProduct.get_p_name();
                    int price = purchasedProduct.getPrice();
                    if(originalSeller.my_sale.contains(purchasedProduct)){
                        int i = originalSeller.my_sale.indexOf(purchasedProduct);
                        originalSeller.my_sale.get(i).setQuantity(originalSeller.my_sale.get(i).getQuantity() + returnQuantity);
                    }else{
                        Product p = new Product(p_name, price, returnQuantity);
                        p.set_s_name(s_name);
                        originalSeller.my_sale.add(p);
                    }

                    if (originalSeller != null) {
                        addProduct(originalSeller, purchasedProduct);
                    }

                    if (purchasedProduct.getQuantity() == 0) {
                        iterator.remove(); // 반복자를 통해 안전하게 제거
                    }

                    System.out.println("반품이 완료되었습니다.");
                } else {
                    System.out.println("수량이 잘못되었습니다.");
                }
            }
        }
    }

    private void charge() {
        checkNowMember(nowMember);
        Membership membership = nowMember.getMembership();
        if (nowMember != null && membership!= null) {
            System.out.println("현재 보유 쿠페이머니: " + nowMember.getCoupaymoney());
            System.out.print("충전금엑: ");
            int chargeMoney = scan.nextInt();
                membership.rewardPoints(chargeMoney, nowMember);
            System.out.println("충전완료.");
            System.out.println("현재 보유 쿠페이머니: " + nowMember.getCoupaymoney() + "원입니다.");
        }
        else
            System.out.println("회원이없습니다.");
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
            }
        }
    }

    //물품등록
    private void productRegistration() {
        System.out.println("등록할 물품의 제품명,가격,수량을 입력해주세요.");
        System.out.print("제품명: ");
        String name = scan.next();
        System.out.print("가격: ");
        int price = scan.nextInt();
        System.out.print("수량: ");
        int Qy = scan.nextInt();

        Product pd = new Product(name,price,Qy);
        addProduct(nowMember,pd);
        System.out.println("물픔등록이 완료되었습니다.");
    }

    //물품삭제
    private void productRemove() {
        System.out.println("삭제할 상품의 제품명과 삭제할 수량을 입력해주세요.");
        System.out.print("제품명: ");
        String removename = scan.next();
        System.out.print("수량: ");
        int removeQy = scan.nextInt();
        Product removepd = new Product(removename,removeQy);

        removeProduct(getNowMember(),removepd);
    }

    //구매
    private void buy() {
        while(true) {
            System.out.println("------------------------------------------------");
            System.out.println("1.물품검색 2.물품구매 3.장바구니(결제) 4.이전메뉴"); // 메뉴 출력
            System.out.println("------------------------------------------------");
            int input = scan.nextInt();
            switch(input) {
                case 1: //물품검색
                    this.printProductList(pro_list);;
                    break;
                case 2: //물품구매(장바구니에 추가)
                    this.productPurchase();
                    break;
                case 3: //장바구니 확인 및 결제
                    this.showCart();
                    break;
                case 4: //이전메뉴
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    System.out.println();
            }
        }
    }

    private void showCart() {
        int result=0;
        for (Product product : nowMember.my_cart) {
            result += product.getPrice()*product.getQuantity();
            System.out.println("------------------------------------------------");
            System.out.println(product);
        }
        while(true){
            System.out.println("------------------------------------------------");
            System.out.println("총 결제금액 : " + result + "\t잔액 : " + nowMember.getCoupaymoney());
            System.out.println("1.결제 2.선물하기 3.이전");
            System.out.println("------------------------------------------------");
            int in = scan.nextInt();
            switch(in) {
                case 1:
                    this.doPayment(result);
                    return;
                case 2:
                    doSend(result);
                    return;
                case 3:
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    System.out.println();
            }
        }
    }

    private void doPayment(int payAmount) {
        checkNowMember(nowMember);
        int result = nowMember.getCoupaymoney()-payAmount;
        if(result<0){
            System.out.println("잔액이 부족하여 충전이 필요합니다.");
        }else {
            nowMember.setCoupaymoney((int) (nowMember.getCoupaymoney() - payAmount+(payAmount * nowMember.getMembership().DiscountP())));
            System.out.println("결제가 완료되었습니다.");
            System.out.println("잔액 : " + nowMember.getCoupaymoney());
            System.out.println("------------------------------------------------");

            nowMember.my_purchased.addAll(nowMember.my_cart); //구매내역에 추가(같은상품이여도 따로 구매하면 따로 기록됨)
            for(int i = 0; i<nowMember.my_cart.size(); i++){ //카트에 담은 상품 하나씩
                for(int j=0; j<mem_list.size(); j++) { //해당 상품의 판매자를 찾아서
                    if (nowMember.my_cart.get(i).get_s_name().equals(mem_list.get(j).get_nickname())){
                        mem_list.get(j).setTotal_SA(mem_list.get(j).getTotal_SA() + (nowMember.my_cart.get(i).getPrice()*nowMember.my_cart.get(i).getQuantity())); //해당상품 판매자의 총판매가격 증가
                        for(int k = 0; k<mem_list.get(j).my_sale.size(); k++){  //판매자의 판매리스트에서 삭제 또는 감소
                            if(mem_list.get(j).my_sale.get(k).getQuantity()-nowMember.my_cart.get(i).getQuantity() == 0) { //수량이 0이되면 삭제
                                mem_list.get(j).my_sale.remove(nowMember.my_cart.get(i));
                                break;
                            }else {mem_list.get(j).my_sale.get(k).setQuantity(mem_list.get(j).my_sale.get(k).getQuantity()-nowMember.my_cart.get(i).getQuantity());
                                break;} //수량이 0이상(0이하는 카트에 안담기므로 제외)
                        }
                        break;
                    }
                }
                for(int l = 0; l<pro_list.size(); l++){ //전체 상품 리스트
                    if(nowMember.my_cart.get(i).get_s_name().equals(pro_list.get(l).get_s_name())){
                        if(pro_list.get(l).getQuantity()-nowMember.my_cart.get(i).getQuantity() == 0){
                            pro_list.remove(nowMember.my_cart.get(i));
                            break;
                        }else {pro_list.get(l).setQuantity(pro_list.get(l).getQuantity()-nowMember.my_cart.get(i).getQuantity());
                            break;}
                    }
                }
            }

            nowMember.my_cart.clear();
        }
    }
    private void doSend(int payAmount) {
        System.out.print("받는 사람의 ID를 입력하세요 : ");
        int receiver_id = scan.nextInt();
        Member receiver = findMember(new Member(receiver_id));
        if(receiver == null){
            System.out.println("존재하지 않는 사용자입니다.");
        }else {
            checkNowMember(nowMember);
            int result = nowMember.getCoupaymoney() - payAmount;
            if (result < 0) {
                System.out.println("잔액이 부족하여 충전이 필요합니다.");
            } else {
                nowMember.setCoupaymoney((int) (nowMember.getCoupaymoney() - payAmount + (payAmount * nowMember.getMembership().DiscountP())));
                System.out.println("결제가 완료되었습니다.");
                System.out.println("잔액 : " + nowMember.getCoupaymoney());
                System.out.println("------------------------------------------------");

                nowMember.my_purchased.addAll(nowMember.my_cart); //구매내역에 추가(같은상품이여도 따로 구매하면 따로 기록됨)
                receiver.my_present.addAll(nowMember.my_cart);  // 받은 선물 목록에 추가
                for(Product product : receiver.my_present){
                    product.setSender(nowMember.get_nickname());
                }

                for (int i = 0; i < nowMember.my_cart.size(); i++) { //카트에 담은 상품 하나씩
                    for (int j = 0; j < mem_list.size(); j++) { //해당 상품의 판매자를 찾아서
                        if (nowMember.my_cart.get(i).get_s_name().equals(mem_list.get(j).get_nickname())) {
                            mem_list.get(j).setTotal_SA(mem_list.get(j).getTotal_SA() + (nowMember.my_cart.get(i).getPrice() * nowMember.my_cart.get(i).getQuantity())); //해당상품 판매자의 총판매가격 증가
                            for (int k = 0; k < mem_list.get(j).my_sale.size(); k++) {  //판매자의 판매리스트에서 삭제 또는 감소
                                if (mem_list.get(j).my_sale.get(k).getQuantity() - nowMember.my_cart.get(i).getQuantity() == 0) { //수량이 0이되면 삭제
                                    mem_list.get(j).my_sale.remove(nowMember.my_cart.get(i));
                                    break;
                                } else {
                                    mem_list.get(j).my_sale.get(k).setQuantity(mem_list.get(j).my_sale.get(k).getQuantity() - nowMember.my_cart.get(i).getQuantity());
                                    break;
                                } //수량이 0이상(0이하는 카트에 안담기므로 제외)
                            }
                            break;
                        }
                    }
                    for (int l = 0; l < pro_list.size(); l++) { //전체 상품 리스트
                        if (nowMember.my_cart.get(i).get_s_name().equals(pro_list.get(l).get_s_name())) {
                            if (pro_list.get(l).getQuantity() - nowMember.my_cart.get(i).getQuantity() == 0) {
                                pro_list.remove(nowMember.my_cart.get(i));
                                break;
                            } else {
                                pro_list.get(l).setQuantity(pro_list.get(l).getQuantity() - nowMember.my_cart.get(i).getQuantity());
                                break;
                            }
                        }
                    }
                }

                nowMember.my_cart.clear();
            }
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
                if(!nowMember.get_nickname().equals(pro_list.get(i).get_s_name())) {
                    if (s_name.equals(pro_list.get(i).get_p_name())) {
                        System.out.print(flag + 1 + ".");
                        System.out.println(pro_list.get(i).toString());
                        System.out.println();
                        ex_list.add(pro_list.get(i));
                        flag++;
                    }
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
                if (1 <= num1 && num1 <= ex_list.size()) {
                    System.out.println("구매하실 수량을 입력하세요.");
                    int num2 = scan.nextInt();
                    Product pro = ex_list.get(num1 - 1);
                    int extra = 0;
                    if(nowMember.my_cart.contains(pro)){
                        int i = nowMember.my_cart.indexOf(pro);
                        extra = pro.getQuantity() - nowMember.my_cart.get(i).getQuantity();
                        if (0 < num2 && num2 <= extra) {
                            int j = nowMember.my_cart.get(i).getQuantity();
                            nowMember.my_cart.get(i).setQuantity(j+num2);
                            System.out.println("추가되었습니다.");
                        } else {
                            System.out.println("잘못된 수량입니다.");
                        }
                    }else {
                        extra = pro.getQuantity();
                        if (0 < num2 && num2 <= extra) {
                            Product cart = new Product(pro.get_p_name(), pro.getPrice(), num2);
                            cart.set_s_name(pro.get_s_name());
                            nowMember.my_cart.add(cart);
                            System.out.println("추가되었습니다.");
                        } else {
                            System.out.println("잘못된 수량입니다.");
                        }
                    }
                } else {
                    System.out.println("없는 번호입니다.");
                }
            }
        }
    }

    private void gift(){
        if(!nowMember.my_present.isEmpty()){
            for(Product product : nowMember.my_present){
                System.out.println(product + "보낸사람:" + product.getSender());
            }
        }else{
            System.out.println("받은 선물이 없습니다.");
        }
    }

    private void review() {
        while(true) {
            if(findMember(nowMember)==null){return;}
            System.out.println("------------------------------------------------");
            System.out.println("1.후기게시판 2.후기작성 3.이전");
            System.out.println("------------------------------------------------");
            int input = scan.nextInt();
            switch(input) {
                case 1: //후기게시판
                    printReview_list();
                    break;
                case 2: //후기작성
                    review_write();
                    break;
                case 3: //이전
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    System.out.println();
            }
        }
    }
    private void printReview_list(){
        for (int i = 0; i < review_list.size(); i++){
            System.out.println(review_list.get(i).toString());
            System.out.println("-> 후기 : " + review_list.get(i).getReview());
        }
    }
    private void review_write() {
        int flag = 0;
        for (int i = 0; i < nowMember.my_purchased.size(); i++) { //배열에서 검색한 상품이 있는지 확인
            System.out.println("------------------------------------------------");
            System.out.print( flag+1 + ".");
            System.out.println(nowMember.my_purchased.get(i).toString());
            System.out.println("------------------------------------------------");
            flag++;
        }
        if(flag==0) {
            System.out.println("후기작성이 가능한 상품이 존재하지 않습니다.");
        }else{
            System.out.println("후기를 작성할 상품의 번호를 입력해주세요(기존에 작성된 후기는 삭제됩니다.)");
            int num = scan.nextInt();
            if(0<num && num <= nowMember.my_purchased.size()) {
                System.out.println("후기 내용을 작성해주세요.");
                String review_contents = scan.next();
                nowMember.my_purchased.get(num-1).setReview(review_contents);
                review_list.add(nowMember.my_purchased.get(num-1));
                System.out.println("후기가 작성되었습니다.");
            }else {System.out.println("잘못된 입력입니다.");}
        }
    }
}