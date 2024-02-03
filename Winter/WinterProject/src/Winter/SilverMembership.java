package Winter.WinterProject.src.Winter;

public class SilverMembership extends Membership {

    SilverMembership(int id, String nickname, double SilvermembershipDiscountP) {
        super(id, nickname, 0.25);
    }

    @Override
    public void selectOttservice() {
        System.out.println("실버 멤버쉽으로 쿠팡플레이, 티빙, 넷플릭스중 하나를 선택해 OTT서비스를 제공받을 수 있습니다. 제공받을 서비스를 선택해주세요.");
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
       }
    }
}