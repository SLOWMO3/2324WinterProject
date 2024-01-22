package ch01_복습.상속다형성;

class CheckAccount extends Account { // 상속
	int cardNo;	// 직불카드 번호

	CheckAccount(int ano, String owner, double balance, int cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;
	}

	@Override
	double computeInterest() { // 메소드 재정의
		System.out.println("CheckAccount에서 computeInterest()");
		return balance * 0.045;
	}

	@Override
	String getInfo() { // 메소드 재정의
		String str = "카드번호:" + cardNo;
		return "보통계좌 -> " + super.getInfo() + ", " + str;
	}
}
