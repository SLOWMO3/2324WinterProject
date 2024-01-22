// Set - HashSet
// - 순서 없음(인덱스 정보 없음), 중복 저장 불가
// - HashMap을 이용하여 Set의 특징을 구현한 자료구조
// - 입력 순서와 관계 없이 출력 
// - 사용자 정의 객체 동등 비교 위해 hashcode() 및 equals() 재정의 필요
// - Hash 자료구조의 동일 객체 확인 방법
//   - (1) hashcode() 값이 동일한지 확인
//   - (2) equals() 결과가 true인지 확인

package ch08_Collection프레임워크.Set.HashSet;

import java.util.*;

public class 실습_해답 {

	public static void main(String[] args) {
		// 객체 추가: add(E element):boolean
		// - Integer 객체 추가: Integer에서 equals(), hashCode() 이미 재정의되어 중복 저장 불가
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); 
//		System.out.println(set);
//		
//		System.out.println(set.add(3));
//		System.out.println(set); 

		// - String 객체 추가: String에서 equals(), hashCode() 이미 재정의되어 중복 저장 불가
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); 
//		System.out.println(set);
//		
//		System.out.println(set.add("koo"));
//		System.out.println(set); 
		
		// - Student 사용자 클래스 객체 추가: equals(), hashCode() 재정의해야 중복불가
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1)); 
//		System.out.println(set);
//		
//		System.out.println(set.add(new Student("경미", 2))); 
//		System.out.println(set); 	
		
		// 객체 수정: 메소드 없음 -> 객체 제거와 추가 메소드 사용으로 대체
		// - Integer 객체 수정
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
//		System.out.println(set);
//		
//		System.out.println(set.remove(1));
//		System.out.println(set.add(45));
//		System.out.println(set);
		
		// - String 객체 수정
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//		System.out.println(set);
//		
//		System.out.println(set.remove("sung"));
//		System.out.println(set.add("kkk"));
//		System.out.println(set);
		
		// - Student 사용자 클래스 객체 수정
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
//		
//		System.out.println(set.remove(new Student("성구", 1)));
//		System.out.println(set.add(new Student("현우", 4)));
//		System.out.println(set);
		
		// 객체 제거: remove(Object o):boolean, clear():void
		// - Integer 객체 제거
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
//		System.out.println(set);
//		
//		System.out.println(set.remove(1)); 
//		System.out.println(set);
//		System.out.println(set.remove(new Integer(1))); 
//		System.out.println(set);
//		System.out.println(set.remove(Integer.valueOf(1)));
//		System.out.println(set);
//		set.clear();
//		System.out.println(set);	

		// - 문자열 객체 제거
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//		System.out.println(set);
//		
//		System.out.println(set.remove(1));	
//		System.out.println(set);
//		System.out.println(set.remove("lee")); 
//		System.out.println(set);
//		set.clear();
//		System.out.println(set);	

		// - Student 사용자 클래스 객체 제거
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
//		
//		System.out.println(set.remove(1)); 
//		System.out.println(set);
//		System.out.println(set.remove(new Student("성구", 1))); 
//		System.out.println(set);
//		set.clear();
//		System.out.println(set);	
		
		// 객체 검색: isEmpty():boolean, size():int, contains(Object o):boolean 
		// - Integer 객체 검색
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
//		System.out.println(set);
//		
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		System.out.println(set.contains(3)); 
//		System.out.println(set.contains(Integer.valueOf(3))); 

		// - 문자열 객체 검색
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//		System.out.println(set);
//		
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		System.out.println(set.contains("lee"));
		
		// - Student 사용자 클래스 객체 검색
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
//		
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		System.out.println(set.contains(new Student("성구", 1))); 
		
		// 모든 요소 접근: for-each, iterator():Iterator<E>
		// - 반복자(iterator): 컬렉션에 저장된 요소를 읽어오는 표준화 방법
		// - 모든 Integer 객체 요소 접근
//		Set<Integer> set = new HashSet<>();
//		set.add(1); set.add(2); set.add(1); set.add(3);
//		System.out.println(set);
//		
//		for(Integer ele : set)
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<Integer> iter = set.iterator();
//		while (iter.hasNext()) {
//			Integer ele = iter.next();
//			System.out.print(ele + " ");
//		}

		// - 모든 String 객체 요소 접근
//		Set<String> set = new HashSet<>();
//		set.add("lee"); set.add("sung"); set.add("lee"); set.add("koo");
//
//		for(String ele : set)
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) {
//			String ele = iter.next();
//			System.out.print(ele + " ");
//		}
		
		// - 모든 Student 사용자 클래스 객체 요소 접근
//		Set<Student> set = new HashSet<>();
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("성구", 1));
//		set.add(new Student("지은", 3));
//		System.out.println(set);
//		
//		for(Student ele : set)
//			System.out.print(ele + " ");
//		System.out.println();
//
//		Iterator<Student> iter = set.iterator();
//		while (iter.hasNext()) {
//			Student ele = iter.next();
//			System.out.print(ele + " ");
//		}
		
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
//
//		set.remove(set.remove(new Student("성구", 1)));
//		System.out.println(set);
		
		 - removeAll(Collection<?> c):boolean
		Set<Student> set = new HashSet<>();
		set.add(new Student("성구", 1)); 
		set.add(new Student("경미", 2)); 
		set.add(new Student("성구", 1)); 
		set.add(new Student("지은", 3)); 
		System.out.println(set);
		
		Set<Student> remove_list = new HashSet<>();
		remove_list.add(new Student("성구", 1));
		remove_list.add(new Student("경미", 2));
		System.out.println(set.removeAll(remove_list));
		System.out.println(set);
		
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
//		
//		for(Object obj : objs) {
//			if(obj instanceof Student) { // - instanceOf 필요
//				Student st = (Student)obj;
//				System.out.println(st.getName());
//			}
//		}

		// - 컬렉션
//		Set set = new HashSet(); // = Set<Object> set = new HashSet<>();
//		set.add("lee");
//		set.add(new Student("성구", 1));
//		set.add(35);
//		set.add(new Student("경미", 2));
//		System.out.println(set);
//
//		for(Object ele : set) {
//			if(ele instanceof Student) { // - instanceOf 필요
//				Student st = (Student)ele;
//				System.out.println(st.getName());
//			}
//		}
		
		// Collection 기타 메소드들
		// - addAll(Collection<? extends E> c): boolean
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo");
//		System.out.println(set);
//		
//		Set<String> set_1 = new HashSet<>(); 
//		set_1.add("aa"); set_1.add("bb");
//		
//		System.out.println(set.addAll(set_1));
//		System.out.println(set);
		
		// - containsAll(Collection<?> c): boolean
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo");
//		System.out.println(set);
//		
//		Set<String> set_1 = new HashSet<>(); 
//		set_1.add("koo"); set_1.add("sung");
//		
//		System.out.println(set.containsAll(set_1));
		
		// - removeAll(Collection<?> c): boolean
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo"); set.add("sung");
//		System.out.println(set);
//		
//		Set<String> set_1 = new HashSet<>(); 
//		set_1.add("koo"); set_1.add("sung");
//		
//		System.out.println(set.removeAll(set_1));
//		System.out.println(set);
		
		// - toArray(): Object[]
		// - toArray(T[] a): T[] -> 매개변수 타입 배열로 만들기 위해 사용
//		Set<String> set = new HashSet<>(); 
//		set.add("lee"); set.add("sung"); set.add("koo"); set.add("sung");
//		System.out.println(set);
//		
//		Object[] objs = set.toArray();
//		System.out.println(Arrays.toString(objs));
//		System.out.println(objs[1]);
//		
//		String[] strs1 = set.toArray(new String[6]); 
//		System.out.println(Arrays.toString(strs1));	
//		String[] strs2 = set.toArray(new String[2]); 
//		System.out.println(Arrays.toString(strs2));	
//		String[] strs3 = set.toArray(new String[0]); 
//		System.out.println(Arrays.toString(strs3));		
	}
}


