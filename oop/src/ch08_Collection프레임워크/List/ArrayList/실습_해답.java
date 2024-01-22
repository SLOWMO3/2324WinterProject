// List - ArrayList
// - 순서유지(연속적/순차적 저장), 중복저장 가능
// - 배열을 이용하여 List의 특징을 구현한 자료구조
// - 배열과 같이 인덱스로 원소 관리
// - 비동기화 메소드로 구성, 싱글 쓰레드 환경에 효율적
// - contains(), remove() 메소드 위해 사용자 정의 객체에 대한 equals() 재정의 필요

package ch08_Collection프레임워크.List.ArrayList;

import java.util.*;

public class 실습_해답 {

	public static void main(String[] args) {
		// 객체 추가: add(E element):boolean , add(int index, E element):void
		// - Integer 객체 추가
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); 
//		System.out.println(list);
//		
//		System.out.println(list.add(3));
//		System.out.println(list); // Integer에서 equals() 이미 재정의 해도 List는 중복 저장 가능
//		list.add(2, 777);
//		System.out.println(list);
//		
		// - String 객체 추가
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); 
//		System.out.println(list);
//		
//		System.out.println(list.add("koo"));
//		System.out.println(list); // String에서 equals() 이미 재정의 해도 List는 중복 저장 가능
//		list.add(2, "777");
//		System.out.println(list);
		
		// - Student 사용자 클래스 객체 추가
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		System.out.println(list);
//		
//		System.out.println(list.add(new Student("성구", 1)));
//		System.
//		out.println(list); // Student에서 equals() 재정의 해도 List는 중복 저장 가능	
//		list.add(1, new Student("현우", 111));
//		System.out.println(list);
		
		// 객체 수정: set(int index, E element): E
		// - Integer 객체 수정
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//		System.out.println(list);
//		
//		System.out.println(list.set(1, 45));
//		System.out.println(list);
//		
		// - String 객체 수정
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		System.out.println(list);
//		
//		System.out.println(list.set(1, "kkk"));
//		System.out.println(list);
		
		// - Student 사용자 클래스 객체 수정
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3));
//		System.out.println(list);
//		
//		System.out.println(list.set(1, new Student("길동", 5)));
//		System.out.println(list);
		
		// 객체 제거: remove(int index):E, remove(Object o):boolean, clear():void
		// - Integer 객체 제거
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//		System.out.println(list);
//		
//		System.out.println(list.remove(1)); 
//		System.out.println(list);
//		System.out.println(list.remove(new Integer(1))); // Integer 클래스는 equals() 재정의됨
//		System.out.println(list);
//		System.out.println(list.remove(Integer.valueOf(1)));
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);	

		// - 문자열 객체 제거
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		System.out.println(list);
//		
//		System.out.println(list.remove(1));	
//		System.out.println(list);
//		System.out.println(list.remove("lee")); 			// String 클래스는 equals() 재정의됨 
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);	

		// - Student 사용자 클래스 객체 제거
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3));
//		System.out.println(list);
//		
//		System.out.println(list.remove(1)); 
//		System.out.println(list);
//		System.out.println(list.remove(new Student("성구", 1))); // equals() 재정의 필요
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);	
		
		// 객체 검색: isEmpty():boolean, size():int, get(int index):E, contains(Object o):boolean 
		// - Integer 객체 검색
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//		System.out.println(list);
//		
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.get(1));
//		System.out.println(list.contains(3)); // Integer 클래스는 equals() 이미 재정의됨
//		System.out.println(list.contains(Integer.valueOf(3))); // 중복정의되지 않으므로 불필요

		// - 문자열 객체 검색
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		System.out.println(list);
//		
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.get(1));
//		System.out.println(list.contains("lee")); // Integer 클래스는 equals() 이미 재정의됨
		
		// - Student 사용자 클래스 객체 검색
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("성구", 1));
//		list.add(new Student("경미", 2));
//		list.add(new Student("성구", 1));
//		list.add(new Student("지은", 3));
//		System.out.println(list);
//		
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.get(1)); 
//		System.out.println(list.contains(new Student("성구", 1))); // equals() 재정의 필요 
		
		// 모든 요소 접근: for, for-each, iterator():Iterator<E>
		// - 반복자(iterator): 컬렉션에 저장된 요소를 읽어오는 표준화된 방법
		// - 모든 Integer 객체 요소 접근
//		List<Integer> list = new ArrayList<>();
//		list.add(1); list.add(2); list.add(1); list.add(3);
//
//		for (int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i) + " ");
//		System.out.println();
//		
//		for(Integer ele : list)
//			System.out.print(ele + " ");
//		System.out.println();
////
//		Iterator<Integer> iter = list.iterator();
//		while (iter.hasNext()) {
//			Integer ele = iter.next();
//			System.out.println(ele);
//		}

		// - 모든 String 객체 요소 접근
//		List<String> list = new ArrayList<>();
//		list.add("lee"); list.add("sung"); list.add("lee"); list.add("koo");
//		
//		for (int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i) + " ");
//		System.out.println();
//
//		for(String ele : list)
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<String> iter = list.iterator();
//		while (iter.hasNext()) {
//			String ele = iter.next();
//			System.out.print(ele + " ");
//		}
		
		// - 모든 Student 사용자 클래스 객체 요소 접근
		List<Student> list = new ArrayList<>();
		list.add(new Student("성구", 1));
		list.add(new Student("경미", 2));
		list.add(new Student("성구", 1));
		list.add(new Student("지은", 3));
		
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		for(Student ele : list)
			System.out.print(ele + " ");
		System.out.println();

		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student ele = iter.next();
			System.out.print(ele + " ");
		}
		
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
//		
//		Student st = new Student("성구", 1);
//		while(list.contains(st)) // = while(list.remove(new Student("성구", 1))) { }
//			list.remove(st);
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
//		
//		List<Student> remove_list = new ArrayList<>();
//		remove_list.add(new Student("성구", 1));
//		remove_list.add(new Student("경미", 2));
//		System.out.println(list.removeAll(remove_list));
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
//		
//		Iterator<Student> it = list.iterator();       
//		while(it.hasNext()) {                       
//			if (it.next().equals(new Student("성구", 1)))               
//				it.remove();
//		}
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
		
		// Object 객체 다루기
		// - 배열
//		Object[] objs = new Object[4];
//		objs[0] = "lee";
//		objs[1] = new Student("성구", 1);
//		objs[2] = 35;
//		objs[3] = new Student("경미", 2);
//		System.out.println(Arrays.toString(objs));
//		
//		for(Object obj : objs) {
//			if(obj instanceof Student) { // - instanceOf 필요
//				Student st = (Student)obj;
//				System.out.println(st.getName());
//			}
//		}

		
	//	List list = new ArrayList(); // = List<Object> list = new ArrayList<>();
		//list.add("lee");
		//list.add(new Student("성구", 1));
	//	list.add(35);
		//list.add(new Student("경미", 2));
	//	System.out.println(list);

		//for(Object ele : list) {
		//	if(ele instanceof Student) { // - instanceOf 필요
		//		Student st = (Student)ele;
	//			System.out.println(st.getName());
		//	}
	//	}
		
		
		// Collection 기타 메소드들
		// - addAll(Collection<? extends E> c): boolean
		// - addAll(int index, Collection<? extends E> c): boolean
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo");
//		System.out.println(list);
//		
//		List<String> list_1 = new ArrayList<>(); 
//		list_1.add("aa"); list_1.add("bb");
//		
//		System.out.println(list.addAll(list_1));
//		System.out.println(list);
//		System.out.println(list.addAll(1, list_1));
//		System.out.println(list);
		
		// - containsAll(Collection<?> c): boolean
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo");
//		System.out.println(list);
//		
//		List<String> list_1 = new ArrayList<>(); 
//		list_1.add("koo"); list_1.add("sung");
//		
//		System.out.println(list.containsAll(list_1));
		
		// - removeAll(Collection<?> c): boolean
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo"); list.add("sung");
//		System.out.println(list);
//		
//		List<String> list_1 = new ArrayList<>(); 
//		list_1.add("koo"); list_1.add("sung");
//		
//		System.out.println(list.removeAll(list_1));
//		System.out.println(list);
		
		// - toArray(): Object[]
		// - toArray(T[] a): T[] -> 매개변수 타입 배열로 만들기 위해 사용
//		List<String> list = new ArrayList<>(); 
//		list.add("lee"); list.add("sung"); list.add("koo"); list.add("sung");
//		System.out.println(list);
//		
//		Object[] objs = list.toArray();
//		System.out.println(Arrays.toString(objs));
//		System.out.println(objs[1]);
//		
//		String[] strs1 = list.toArray(new String[6]); 
//		System.out.println(Arrays.toString(strs1));	
//		String[] strs2 = list.toArray(new String[2]); 
//		System.out.println(Arrays.toString(strs2));	
//		String[] strs3 = list.toArray(new String[0]); 
//		System.out.println(Arrays.toString(strs3));	
	}
}


