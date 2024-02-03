package Winter.WinterProject.src.Winter;

public class BronzeMemberShip extends Membership{

    public BronzeMemberShip(int id, String nickname, double BronzemembershipDiscountP) {
        super(id, nickname,0.15);
    }

    @Override
    public void selectOttservice() {
       System.out.println("브론즈 멤버쉽은 Ott서비스가 제공되지 않습니다.");
    }


    @Override
    public void rewardPoints(){
        setCoupaymoney(getCoupaymoney() + (int) (0.05 * getCoupaymoney()));
        System.out.println("브론즈 멤버쉽으로 5퍼센트만큼의 추가 쿠페이머니 적립이있습니다. " + getCoupaymoney());
    }

}
