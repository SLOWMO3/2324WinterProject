package Winter.WinterProject.src.Winter;

import java.util.Scanner;

public class Membership {
    Scanner scan = new Scanner(System.in);
    protected Member member;

    public Membership(Member member) {
        this.member = member;
    }

   public String convenienceStoreCoupon() {
       System.out.println("멤버쉽에 가입되어 있지않아 쿠폰을 받을 수 없습니다.");
       return null;
   }

    public double DiscountP() {
        return 0;
    }

    public void selectOttservice() {
        System.out.println("멤버쉽에 가입되어있지않아 Ott서비스를 제공받을수 없음");
    }

    public void rewardPoints(int chargemoney){
        member.setCoupaymoney(member.getCoupaymoney() + chargemoney);
    }


    public void updateMembershipGrade() {
        int combinedAmount = member.getTotal_PA()+member.getTotal_SA();


        if (combinedAmount >= 150000) {
            member.set_membershipGrade("Gold");
            // Add Gold membership benefit
            // ...
        } else if (combinedAmount >= 100000) {
            member.set_membershipGrade("Silver");
            // Add Silver membership benefits
            // ...
        } else if (combinedAmount >= 50000) {
            member.set_membershipGrade("Bronze");
            // Add Bronze membership benefits
            // ...
        }
        else member.set_membershipGrade("No MemberShip");

    }

public void ShowMemberShipBenefit() {
        System.out.println("멤버쉽에 가입되어있지 않아 혜택이없습니다.");
}

}