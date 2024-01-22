 //정의태(202058023)
// 게임 캐릭터 3가지 직업을 만들고 직업에 따른 싸움방식과 스킬 사용을 하는 간단한 프로그램을 만들어봤습니다.


interface WeaponSystem { //인터페이스
	void useWeapon();
}

class Character implements WeaponSystem{
	
	Character() {}
    int hp; //체력
    double mp; //마나
	String skill;//스킬
	WeaponSystem weapon;
	
	 int heal(int hpup) {
		 this.hp += hpup;
		 return this.hp;
	 }
	 double heal(double mpup) { //중복정의
		 this.mp += mpup;
		 return this.mp;
	 }
	 void setWeapon(WeaponSystem w) {
	        this.weapon = w;
	    }
 public void useWeapon( ) {
	 System.out.println("무기를 사용합니다.");
 }	
 
 void useSkill() {
	 System.out.println("스킬을 사용합니다.");
 }
 
 void fight() {
	 System.out.println("다음 캐릭터는 다음 방식으로 공격합니다.");
 }
 
 class sword implements WeaponSystem{
		@Override
		public void useWeapon(){
			System.out.println("검을 휘두릅니다."); // 메소드재정의 
	   }
	}

	class arrow implements WeaponSystem{
		@Override
		public void useWeapon(){
			System.out.println("활을 쏩니다."); // 메소드재정의 
	   }
	}

	class commendations implements WeaponSystem{
		@Override
		public void useWeapon(){
			System.out.println("표창을 던집니다."); // 메소드재정의 
	   }
	}
 Character(int hp,double mp,String skill){
    this.hp = hp;
    this.mp  = mp;
    this.skill = skill;
 }
 
}


class Warrior extends Character{
	
	
	Warrior(int hp,double mp,String skill) {
		super(hp,mp,skill);
		this.weapon = new sword();
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	   void fight() {
		   System.out.println("전사는 다음과 같이 공격합니다->");
		   weapon.useWeapon();
	   }
	 @Override
   void useSkill() {
		 System.out.println("분노스킬을 사용합니다.");
	 }
  
}

class Archer extends Character implements WeaponSystem {

	Archer(int hp,double mp, String skill) {
		super(hp,mp,skill);
		this.weapon = new arrow();
		// TODO Auto-generated constructor stub
	}

	@Override
	void fight() {
		   System.out.println("궁수는 다음과 같이 공격합니다->");
		   weapon.useWeapon();
	   }
	
	 @Override
	   void useSkill() {
			 System.out.println("다중화살 스킬을 사용합니다.");
		 }
	
}

class Thief extends Character implements WeaponSystem {

	Thief(int hp,double mp, String skill) {
		super(hp,mp,skill);
		this.weapon = new commendations();
		// TODO Auto-generated constructor stub
	}
	@Override
	void fight() {
		   System.out.println("도적은 다음과 같이 공격합니다->");
		   weapon.useWeapon();
	   }
	 @Override
	   void useSkill() {
			 System.out.println("은신 스킬을 사용합니다.");
		 }
	
}


public class GameCharacter {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	   
	   Character[] GameCharacter = new Character[3]; //배열로 3개의 캐릭터생성
	   GameCharacter[0] = new Warrior(100,80.0,"분노");
	   GameCharacter[1] = new Archer(80,100.0,"다중화살");
	   GameCharacter[2] = new Thief(90,90.0,"은신");
	   
	   
	   for(int i = 0; i < GameCharacter.length; i++) {
		   GameCharacter[i].fight();
		   GameCharacter[i].useSkill();
		   GameCharacter[i].heal(50);
		   GameCharacter[i].heal(50.0);
		  
	   }
	   
}
}