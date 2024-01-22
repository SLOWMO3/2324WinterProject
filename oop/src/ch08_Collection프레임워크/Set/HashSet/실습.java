package ch08_Collection프레임워크.Set.HashSet;

import java.util.*;

public class 실습 {

	public static void main(String[] args) {
		// 객체 추가: add(E element): boolean
		// - Integer 객체 추가: Integer에서 equals(), hashCode() 이미 재정의되어 중복 저장 불가
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); 
//		System.out.println(set);
		

		// - String 객체 추가: String에서 equals(), hashCode() 이미 재정의되어 중복 저장 불가
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); 
//		System.out.println(set);
		
		
		// - Student 사용자 클래스 객체 추가: equals(), hashCode() 재정의해야 중복불가
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1)); 
//		System.out.println(set);
		
		
		// 객체 수정: 메소드 없음 -> 객체 제거 후 추가 메소드 사용으로 대체
		// - Integer 객체 수정
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
//		System.out.println(set);
		
		
		// - String 객체 수정
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//		System.out.println(set);
		
		
		// - Student 사용자 클래스 객체 수정
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
		
		
		// 객체 제거: remove(Object o):boolean, clear():void	
		// - Integer 객체 제거
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
//		System.out.println(set);
		
		
		// - 문자열 객체 제거
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//		System.out.println(set);
		
		// - Student 사용자 클래스 객체 제거
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
		
		
		// 객체 검색: isEmpty():boolean, size():int, contains(Object o):boolean 
		// - Integer 객체 검색
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
//		System.out.println(set);
		
		
		// - 문자열 객체 검색
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//		System.out.println(set);
		
		
		// - Student 사용자 클래스 객체 검색
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
		
		
		// 모든 요소 접근: for-each, iterator():Iterator<E>
		// - 반복자(iterator): 컬렉션에 저장된 요소를 읽어오는 표준화된 방법
		// - 모든 Integer 객체 요소 접근
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
		
		
		// - 모든 String 객체 요소 접근
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//		System.out.println(set);
		
		
		// - 모든 Student 사용자 클래스 객체 요소 접근
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
		
		
		// 모든 동일 원소 제거시 중복 허용하지 않으므로 단순 제거
		// (1) remove(Object o):boolean 사용
		// (2) removeAll(Collection<?> c):boolean 사용
		// - remove(Object o):boolean 사용
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1)); 
//		set.add(new Student("경미", 2)); 
//		set.add(new Student("성구", 1)); 
//		set.add(new Student("지은", 3)); 
//		System.out.println(set);
		
		
		// - removeAll(Collection<?> c):boolean
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1)); 
//		set.add(new Student("경미", 2)); 
//		set.add(new Student("성구", 1)); 
//		set.add(new Student("지은", 3)); 
//		System.out.println(set);
		
		// - Iterator의 remove() 사용 - 불필요
		
		// - for 사용 - 불필요
		
		// - for-each 사용 - 불필요
		
		// Object 객체 다루기
		// - 배열
//		Object[] objs = new Object[4];
//		objs[0] = "lee";
//		objs[1] = new Student("성구", 1);
//		objs[2] = 35;
//		objs[3] = new Student("경미", 2);
//		System.out.println(Arrays.toString(objs));
		
		
		// - 컬렉션
//		Set set = new HashSet(); // = Set<Object> set = new HashSet<>();
//		set.add("lee");
//		set.add(new Student("성구", 1));
//		set.add(35);
//		set.add(new Student("경미", 2));
//		System.out.println(set);
		
		
		// Collection 기타 메소드들
		// - addAll(Collection<? extends E> c): boolean
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo");
//		System.out.println(set);
		
		
		// - containsAll(Collection<?> c): boolean
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo");
//		System.out.println(set);
		
		
		// - removeAll(Collection<?> c): boolean
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo"); set.add("sung");
//		System.out.println(set);
		
		
		// - toArray(): Object[]
		// - toArray(T[] a): T[] -> 매개변수 타입 배열로 만들기 위해 사용
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo"); set.add("sung");
//		System.out.println(set);
		
		
		
		
	}
}
