package Winter.WinterProject.src.Winter;

public class SilverMembership extends Membership {

    public SilverMembership (Member member) {
        super(member);
    }


    @Override
    public double DiscountP() {
        System.out.println("실버멤버쉽혜택으로 10퍼센트 혜택을 받으실수있습니다.");
        return 0.1;
    }

    public String convenienceStoreCoupon() {
        System.out.println("이 혜택은 골드멤버쉽부터 적용됩니다.");
        return null;
    }
    @Override
    public void rewardPoints(int chargemoney){
        member.setCoupaymoney(member.getCoupaymoney() + chargemoney + (int) (0.1* chargemoney));
        System.out.println("실버 멤버쉽으로 10퍼센트만큼의 추가 쿠페이머니 적립이있습니다. " + member.getCoupaymoney());
    }

    @Override
    public void selectOttservice() {
        System.out.println("실버 멤버쉽으로 쿠팡플레이, 티빙, 넷플릭스중 하나를 선택해 OTT서비스를 제공받을 수 있습니다. 제공받을 서비스를 선택해주세요.");
        String choiceOtt = scan.next();
        switch (choiceOtt) {
            case "쿠팡플레이": {
                System.out.println("쿠팡플레이 서비스를 제공받습니다.");
            }
            case "티빙": {
                System.out.println("티빙 서비스를 제공받습니다.");
            }
            case "넷플릭스": {
                System.out.println("넷플릭스 서비스를 제공받습니다.");
            }
        }
    }

    public void ShowMemberShipBenefit() {
        System.out.println("실버 멤버쉽으로 혜택은 다음과 같습니다.");
        System.out.println("1.쿠페이머니 10퍼 추가적립  2.물품구매시 10퍼센트 할인   3.3가지의 Ott서비스중 한가지 서비스 제공" );
    }
}