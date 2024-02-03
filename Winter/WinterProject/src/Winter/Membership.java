package Winter.WinterProject.src.Winter;

import java.util.Scanner;

public class Membership extends Member {
    Scanner scan = new Scanner(System.in);

    private double membershipDiscountP;


    public Membership(int id, String nickname, double membershipDiscountP) {
        super(id, nickname);
        this.membershipDiscountP = membershipDiscountP;

    }

    public void setMembershipDiscountP(double membershipDiscountP) {
        this.membershipDiscountP = membershipDiscountP;
    }

    public double getMembershipDiscountP() {
        return membershipDiscountP;
    }

    public void selectOttservice() {
    }

    public void selecsdtOttservice() {
    }
    public void rewardPoints(){

    }


    public void displayMemberShip() {
        System.out.println("닉네임: " + get_nickname());
        System.out.println("멤버쉽등급은: " + get_membershipGrade());
    }

    public void updateMembershipGrade() {
        int combinedAmount = super.getTotal_PA()+getTotal_SA();


        if (combinedAmount >= 150000) {
            set_membershipGrade("골드");
            // Add Gold membership benefit
            // ...
        } else if (combinedAmount >= 100000) {
            set_membershipGrade("실버");
            // Add Silver membership benefits
            // ...
        } else if (combinedAmount >= 50000) {
            set_membershipGrade("브론즈");
            // Add Bronze membership benefits
            // ...
        }
        else
            set_membershipGrade("계정이 멤버쉽에 가입되어 있지 않습니다.");
    }


}






