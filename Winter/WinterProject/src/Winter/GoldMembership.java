package Winter.WinterProject.src.Winter;

public class GoldMembership extends Membership {

    public GoldMembership(Member member) {
        super(member);
    }

    @Override
    public double DiscountP() {
        System.out.println("골드멤버쉽혜택으로 15퍼센트 혜택을 받으실수있습니다.");
        return 0.15;
    }

    @Override
    public void rewardPoints(int chargemoney) {
        member.setCoupaymoney(member.getCoupaymoney() + chargemoney + (int) (0.15 * chargemoney));
        System.out.println("골드 멤버쉽으로 15퍼센트만큼의 추가 쿠페이머니 적립이있습니다. " + member.getCoupaymoney());
    }

    @Override
    public void selectOttservice() {
        System.out.println("골드 멤버쉽혜택으로 쿠팡플레이, 티빙, 넷플릭스,왓챠,웨이브중 하나를 선택해 OTT서비스를 제공받을 수 있습니다. 제공받을 서비스를 선택해주세요.");
        String choiceOtt = scan.toString();
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
            case "왓챠": {
                System.out.println("왓챠 서비스를 제공받습니다.");
            }
            case "웨이브": {
                System.out.println("웨이브 서비스를 제공받습니다.");
            }
            default:
                System.out.println("잘못된 입력입니다.");
                System.out.println();
        }
    }

    public String convenienceStoreCoupon() {
        System.out.println("골드멤버쉽혜택으로 편의점쿠폰을 받을 수 있습니다. 쿠폰의 금액은 3만원입니다.");
        System.out.println("원하시는 편의점을 선택해주세요 1.CU, 2.GS25, 3.이마트24, 4.세븐일레븐");
        String choiceCoupon = scan.next();
        String coupon = null;
        switch (choiceCoupon) {
            case "CU": {
                System.out.println("CU쿠폰을발급받습니다.");
                coupon = "2024CUGold";
                return coupon;
            }
            case "GS25": {
                System.out.println("GS25쿠폰을발급받습니다.");
                coupon = "2024GS25Gold";
                return coupon;
            }
            case "이마트24": {
                System.out.println("이마트24 쿠폰을발급받습니다.");
                coupon = "2024Emart24Gold";
                return coupon;
            }
            case "세븐일레븐": {
                System.out.println("세븐일레븐 쿠폰을발급받습니다.");
                coupon = "2024SevenelevenGold";
                return coupon;
            }
            default:
                System.out.println("잘못된 입력입니다.");
                System.out.println();
        }
        return null;
    }

    public void ShowMemberShipBenefit() {
        System.out.println("골드 멤버쉽으로 혜택은 다음과 같습니다.");
        System.out.println("1.쿠페이머니 15퍼 추가적립  2.물품구매시 15퍼센트 할인  3.5개의 Ott 서비스중 1개의 서비스 지원  4.원하는편의점쿠폰 발급");
    }
}