package Winter.WinterProject.src.Winter;

public class BronzeMemberShip extends Membership{

    public BronzeMemberShip(Member member) {
        super(member);
    }

    @Override
    public double DiscountP() {
        System.out.println("브론즈멤버쉽혜택으로 5퍼센트 혜택을 받으실수있습니다.");
        return 0.05;
    }

    public String convenienceStoreCoupon() {
        System.out.println("이 혜택은 골드멤버쉽부터 적용됩니다.");
        return null;
    }

    @Override
    public void selectOttservice() {
        System.out.println("브론즈 멤버쉽은 Ott서비스가 제공되지 않습니다.");
    }


    @Override
    public void rewardPoints(int chargemoney){
        member.setCoupaymoney(member.getCoupaymoney() + chargemoney + (int) (0.05 * chargemoney));
        System.out.println("브론즈 멤버쉽으로 5퍼센트만큼의 추가 쿠페이머니 적립이있습니다. " + member.getCoupaymoney());
    }

    public void ShowMemberShipBenefit() {
        System.out.println("브론즈 멤버쉽으로 혜택은 다음과 같습니다.");
        System.out.println("1.쿠페이머니 5퍼 추가적립  2.물품구매시 5퍼센트 할인");
    }


}