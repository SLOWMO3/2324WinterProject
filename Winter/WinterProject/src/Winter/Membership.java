package Winter.WinterProject.src.Winter;

import java.util.Scanner;

public class Membership {
    Scanner scan = new Scanner(System.in);
    protected Member member;

    public Membership(Member member) {
        this.member = member;

    }


    public double DiscountP() {
        return 0;
    }

    public void selectOttservice() {
        System.out.println("멤버쉽에 가입되어있지않아 Ott서비스를 제공받을수 없음");
    }

    public void rewardPoints(int chargemoney,Member nowMember){
        nowMember.setCoupaymoney(nowMember.getCoupaymoney() + chargemoney);
    }




public void ShowMemberShipBenefit() {
        System.out.println("멤버쉽에 가입되어있지 않아 혜택이없습니다.");
}

}