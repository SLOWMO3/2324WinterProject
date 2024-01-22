package ch08_Collection프레임워크.Map.HashMap;

import java.util.*;

public class 실습 {

	public static void main(String[] args) {
		// 객체 추가: put(K key, V value): V
		// - Integer 객체가 키이고 Sting 객체가 값인 경우
		
		
		
		// - String 객체가 키이고 Integer 객체가 값인 경우

		
		
		// - Integer 객체가 키이고 Student 객체가 값인 경우
		
		
		
		// - Student 객체가 키이고 Integer 객체가 값인 경우
		
		
		
		// 객체 수정: replace(K key, V value): V
		// - Integer 객체가 키이고 Student 객체가 값인 경우
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student("성구", 111)); 
//		map.put(2, new Student("경미", 222)); 
//		map.put(3, new Student("지은", 333));
//		System.out.println(map);
		

		
		// - Student 객체가 키이고 Integer 객체가 값인 경우
//		Map<Student, Integer> map = new HashMap<>(); 
//		map.put(new Student("성구", 1), 111); 
//		map.put(new Student("경미", 2), 222); 
//		System.out.println(map);
		

		
		// 객체 제거: remove(Object key, Object value):boolean, remove(Object key):value, clear():void
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student("성구", 111)); 
//		map.put(2, new Student("경미", 222)); 
//		map.put(3, new Student("지은", 333));
//		System.out.println(map);
		
		
		
		// 객체 검색: 
		// - get(Object key):V, containsKey(Object key):boolean, containsValue(Object value): boolean
		// - keySet():Set<K>, values():Collection<V>, entrySet():Set<Map.Entry<K,V>>
		// - size():int, isEmpty():boolean
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");		
		
		
		
		// 모든 요소 접근: for-each, iterator():Iterator<E>
		// - entrySet() 혹은 keySet()에 의해 반환된 Set 컬렉션의 반복자 이용
		// - Map은 iterator() 직접 호출 불가 하므로 Set 형태로 반환된 컬렉션에 iterator() 호출	
		// - entrySet() 이용
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");

		
		
		// - keySet() 이용
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");


		
		// - 다음 Student 객체의 모든 정보 출력 - entrySet() 이용
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student("성구", 111)); 
//		map.put(2, new Student("경미", 222)); 
//		map.put(3, new Student("지은", 333));
		
		
		
	}
}
