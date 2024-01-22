package ch08_Collection프레임워크.List.ArrayList;

import java.util.*;

public class 실습 {

	public static void main(String[] args) {
		// 객체 추가: add(E element):boolean , add(int index, E element):void
		// - Integer 객체 추가
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); 
//		System.out.println(list);
		
		
		// - String 객체 추가
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); 
//		System.out.println(list);
		
		
		// - Student 사용자 클래스 객체 추가
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		System.out.println(list);
		
		
		// 객체 수정: set(int index, E element): E
		// - Integer 객체 수정
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//		System.out.println(list);
		
		
		// - String 객체 수정
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		System.out.println(list);
		
		
		// - Student 사용자 클래스 객체 수정
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3));
//		System.out.println(list);
		
		
		// 객체 제거: remove(int index):E, remove(Object o):boolean, clear():void
		// - Integer 객체 제거
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//		System.out.println(list);
		
		
		// - 문자열 객체 제거
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		System.out.println(list);
		
		
		// - Student 사용자 클래스 객체 제거
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3));
//		System.out.println(list);
		
		
		// 객체 검색: isEmpty():boolean, size():int, get(int index):E, contains(Object o):boolean 
		// - Integer 객체 검색
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//		System.out.println(list);
		
		
		// - 문자열 객체 검색
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		System.out.println(list);
		
		
		// - Student 사용자 클래스 객체 검색
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3));
//		System.out.println(list);
		
		
		// 모든 요소 접근: for, for-each, iterator():Iterator<E>
		// - 반복자(iterator): 컬렉션에 저장된 요소를 읽어오는 표준화된 방법
		// - 모든 Integer 객체 요소 접근
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
		
		
		
		// - 모든 문자열 객체 요소 접근
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
		
		
		
		// - 모든 Student 사용자 클래스 객체 요소 접근
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3));
		
		// 모든 동일 원소 제거시 3가지 방법 
		// (1) remove(Object o):boolean 사용
		// (2) removeAll(Collection<?> c):boolean 사용
		// (3) Iterator의 remove() 사용
		// - remove(Object o):boolean 사용
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("경미", 2)); 
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("지은", 3)); 
//		System.out.println(list.size());
//		System.out.println(list);
		
		
		// - removeAll(Collection<?> c):boolean
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("경미", 2)); 
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("지은", 3)); 
//		System.out.println(list.size());
//		System.out.println(list);
		
		
		// - Iterator의 remove() 사용
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("경미", 2)); 
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("지은", 3)); 
//		System.out.println(list.size());
//		System.out.println(list);
		
		// - for 사용 - 예외발생X, 그러나 결과 이상
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("경미", 2)); 
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3)); 
//		list.add(new Student("성구", 1)); // list.add(new Student("성구", 1)); 추가의 경우 결과 이상
//		System.out.println(list.size());
//		System.out.println(list);	
//		
//		for(int i=1; i<list.size(); i++) { 
//			// System.out.println(i + ", " + list.size());
//			list.remove(new Student("성구", 1));
//		}
//		System.out.println(list.size());
//		System.out.println(list);
		
		// - for-each 사용 - 예외발생
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("경미", 2)); 
//		list.add(new Student("성구", 1)); 
//		list.add(new Student("지은", 3)); 
//		System.out.println(list.size());
//		System.out.println(list);
//		
//		for(Student ele : list) {
//			list.remove(new Student("성구", 1));
//		}
//		System.out.println(list.size());
//		System.out.println(list);
		
		// Object 객체 다루기 - 배열 vs. 컬렉션
		// - 배열
		
		
		// - 컬렉션
		
		
		// Collection 기타 메소드들
		// - addAll(Collection<? extends E> c): boolean
		// - addAll(int index, Collection<? extends E> c): boolean
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo");
//		System.out.println(list);
		
		
		// - containsAll(Collection<?> c): boolean
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo");
//		System.out.println(list);
		
		
		// - removeAll(Collection<?> c): boolean
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo"); list.add("sung");
//		System.out.println(list);
		
		
		// - toArray(): Object[]
		// - toArray(T[] a): T[] -> 매개변수 타입 배열로 만들기 위해 사용
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo"); list.add("sung");
//		System.out.println(list);
		
		
		
	}

}
