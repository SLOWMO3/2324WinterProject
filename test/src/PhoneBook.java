import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("인원수");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		Phone[] pArray= new Phone[x];
		
		for(int i=0; i<pArray.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>>");
			String name = scan.next();
			String tel = scan.next();
			pArray[i] = new Phone(name, tel);
			
		}
		System.out.println("저장되었습니다...");
		
		String text = "";
		do {
		System.out.print("검색할 이름>>");
		text = scan.next();
		for(int j=0; j<pArray.length; j++) {
			if(pArray[j].name.equals(text)) {
				System.out.print(text+"의 번호는 " + pArray[j].tel+"입니다.");
				break;
			}
			if(j==(pArray.length-1)) {
				if(text.equals("그만")) {
					break;
				}
				System.out.print(text+"이 없습니다,,,");
			
			}
		}
		
		
		}while(!text.equals("그만"));
		

		System.out.println("종료되었습니다.");
	}

}
