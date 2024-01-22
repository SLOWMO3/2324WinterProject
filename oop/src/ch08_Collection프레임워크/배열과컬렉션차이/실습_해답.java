// 컬렉션(Collection) vs. 배열(array)
// - 컬렉션: 동일 타입의 원소들을 묶어 동적으로 관리하는 자료구조
// - 배열: 동일 타입의 원소들을 묶어 정적으로 관리하는 자료구조
// - 배열은 생성 시점에 크기 정해지고 변경 불가
// - 컬렉션에서 원소는 객체만 가능 -> Collection<int> 불가
// - 컬렉션의 자료구조 특성에 따라 List, Set, Map으로 구분
//   - List
//     - 순서유지(연속적/순차적 저장), 중복저장 가능
//   - Set
//     - 순서없음(인덱스 정보 없음), 중복저장 불가
//   - Map
//     - 키와 값(데이터) 쌍으로 구성된 엔트리 객체 저장 -> Map.Entry 타입으로 정의됨
//     - 순서없음, 키 중복 불가, 값 중복 가능

package ch08_Collection프레임워크.배열과컬렉션차이;

import java.util.*;

public class 실습_해답 {

	public static void main(String[] args) {
		// 배열
		// - 문자열 배열 생성과 이용 보기
//		String[] arr = new String[6];
//		System.out.println(arr.length); 
//		System.out.println(Arrays.toString(arr));
//		
//		arr = new String[] {"가", "다", "나", "라", "바", "마"};
//		System.out.println(arr.length); 
//		System.out.println(Arrays.toString(arr));
//		
//		arr[2] = null;
//		arr[5] = null;
//		System.out.println(arr.length);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr); // 배열 객체는 toString() 재정의 X
		
		// - Student 객체 배열 생성과 이용 보기
//		Student[] arr = new Student[6];
//		System.out.println(arr.length); 
//		System.out.println(Arrays.toString(arr));
//		
//		arr[0] = new Student("성구", 1);
//		arr[1] = new Student("경미", 2);
//		arr[2] = new Student("성구", 1);
//		arr[4] = new Student("지은", 3);
//		System.out.println(arr.length); 
//		System.out.println(Arrays.toString(arr));
//		
//		arr[0] = null;
//		arr[2] = null;
//		System.out.println(arr.length);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr); // 배열 객체는 toString() 재정의 X
		
		// 컬렉션
		// - 문자열 컬렉션 생성과 이용 보기
//		Collection<String> col = new ArrayList<>();
//		System.out.println(col.size());
//		System.out.println(col); // 컬렉션 객체는 toString() 재정의 
//		
//		col.add("가"); col.add("나"); col.add("다");
//		col.add("라"); col.add("마"); col.add("바");
//		System.out.println(col.size());
//		System.out.println(col);
//		
//		col.remove("다"); col.remove("바");
//		System.out.println(col.size());
//		System.out.println(col);
		
		// - 정수형 컬렉션 생성과 이용 보기
//		Collection<Integer> col = new ArrayList<>();
//		System.out.println(col.size());
//		System.out.println(col); // 컬렉션 객체는 toString() 재정의 
//		
//		col.add(1); col.add(2); col.add(3);
//		col.add(4); col.add(5); col.add(6);
//		System.out.println(col.size());
//		System.out.println(col);
//		
//		col.remove(2); col.remove(5);
//		System.out.println(col.size());
//		System.out.println(col);
		
		// - Student 컬렉션 생성과 이용 보기
//		Collection<Student> col = new ArrayList<>();
//		System.out.println(col.size());
//		System.out.println(col); // 컬렉션 객체는 toString() 재정의 
//		
//		col.add(new Student("성구", 1)); 
//		col.add(new Student("경미", 2)); 
//		col.add(new Student("성구", 1)); 
//		col.add(new Student("지은", 3)); 
//		System.out.println(col.size());
//		System.out.println(col);
//
//		col.remove(new Student("성구", 1));
//		System.out.println(col.size());
//		System.out.println(col);
	}
}
