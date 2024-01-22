// Scanner 클래스
// - 분리문자: 개행문자(\n), 탭문자(\t), 공백문자
// - 엔터키 입력할 때까지 키보드 입력 내용은 버퍼 메모리에 저장
// - 다음 Scanner 클래스 메소드들은 버퍼에 내용 있는지 확인후 없으면 대기
//   - nextInt(): 분리문자 무시하고 토큰 입력 받아 int 반환
//   - nextDouble(): 분리문자 무시하고 토큰 입력 받아 double 반환
//   - next(): 분리문자 무시하고 토큰 입력 받아 문자열 반환
//   - nextLine(): 한줄 단위로 개행문자까지 입력 받아 개행문자 앞의 문자열 반환

package ch04_Scanner클래스;

import java.util.Scanner;

public class 실습 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		// 2개의 정수를 입력 받아 합계 출력
        System.out.print("입력1:");
        String s1 = scanner.nextLine();
        int i1 =Integer.parseInt(s1);
        System.out.print("입력2:");
        String s2 = scanner.nextLine();
        int i2 =Integer.parseInt(s1);

		// 사용자가 문자열 q 입력하면 종료되도록 다음 코드 완성
		while(true) {
			System.out.print("입력 문자열(종료:q): ");
			String data = scanner.nextLine();
            if(data.equals("q")) {
            	break;
            }
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		
		// 2개의 정수 합계 계산 및 문자열 q 입력하면 종료
		while(true) {
			System.out.print("x: ");
			String data = scanner.nextLine();
			int x = Integer.parseInt(data);
			System.out.print("y: " );
			data = scanner.nextLine();
			int y = Integer.parseInt(data);
            if(data.equals("q")) {
            	break;
            
            
    
			System.out.println("결과: " + (x+y));
			System.out.println();
		}
		System.out.println("종료");
		
	
	}
}
