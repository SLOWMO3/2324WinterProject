// (01) 자료형 종류
// - 기본 자료형
//   - byte, short, char, int, long, float, double, boolean
// - 참조 자료형
//   - 배열, 클래스, 인터페이스
// (02) 연산자 종류
// - 산술, 증감, 비트(X), 시프트(X), 비교, 논리, 대입 삼항(조건)
// (03) 제어문 종류
// - 선택문: if, if-else, if-else-if, switch
// - 반복문: for, while, do-while
// (04) 배열
// - 참조 자료형
// - 연속된 메모리에 같은 타입의 데이터를 저장하는 자료구조
// - 인덱스로 접근 가능
// - 데이터 중복 가능
// (05) 문자열
// - 참조 자료형

package ch01_복습.배열;

import java.util.Arrays;

public class 실습_해답 {

	public static void main(String[] args) {
		// 기본 타입 vs. 참조 타입
		int num = 3;
		double radius = 3.4;

		String name1 = "lee";
		String name2 = new String("lee");

		// 배열 생성 4가지 방법
		int[] arr1 = new int[3];	// int arr1[] -> 사용 X

		String[] arr2;	
		arr2 = new String[3];

		int[] arr3 = {3, 4, 5};	 
		
		String[] arr4;
		arr4 = new String[] {"lee", "sung", "koo"};
		
		// 배열 출력 3가지 방법
		for(int i=0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		
		for(String ele : arr2)
			System.out.println(ele);
		
		System.out.println(Arrays.toString(arr3));
		
		// 문자열 생성 2가지 방법
		String str1 = new String("안녕");	// new 연산자 이용
		String str2 = "안녕";				// 문자열 리터럴 이용
		String str3 = "안녕";
		String str4 = new String("안녕");
		System.out.println(str1 == str2);	// == 주소 비교
		System.out.println(str2 == str3); 
		System.out.println(str3 == str4); 
		System.out.println(str4 == str1); 
		System.out.println(str1.equals(str2));	// String, Wrapper 클래스는 내용 비교로 equals() 재정의
		System.out.println(str1.equals(str4));
	}
}
