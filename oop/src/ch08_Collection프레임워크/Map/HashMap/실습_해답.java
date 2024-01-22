// Map - HashMap
// - 키와 데이터로 구성된 엔트리 객체 저장, 순서없음
//   - 키는 중복 저장 불가, 데이터는 중복 저장 가능
// - 데이터 검색에 효율적
// - 배열과 해쉬 함수 이용하여 Map의 특징을 구현한 자료구조
// - 비동기화 메소드로 구성, 싱글 쓰레드 환경에 효율적
// - 사용자 정의 객체 동등 비교 위해 hashcode() 및 equals() 재정의 필요

package ch08_Collection프레임워크.Map.HashMap;

import java.util.*;

public class 실습_해답 {

	public static void main(String[] args) {
		// 객체 추가: put(K key, V value): V
		// - Integer 객체가 키이고 Sting 객체가 값인 경우
//		Map<Integer, String> map = new HashMap<>(); 
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");
//		System.out.println(map);	
//		
//		System.out.println(map.put(3, "DaDaDa")); // 키 중복 불가
//		System.out.println(map);
//		map.put(5, "가가가");
//		System.out.println(map);
		
		// - String 객체가 키이고 Integer 객체가 값인 경우
//		Map<String, Integer> map = new HashMap<>(); 
//		map.put("나나나", 2); map.put("가가가", 1); map.put("다다다", 3);
//		System.out.println(map);
//		
//		System.out.println(map.put("DaDaDa", 3)); 
//		System.out.println(map);
//		map.put("가가가", 5);  // 키 중복 불가
//		System.out.println(map);
		
		// - Integer 객체가 키이고 Student 객체가 값인 경우
//		Map<Integer, Student> map = new HashMap<>(); 
//		map.put(111, new Student("성구", 1)); 
//		System.out.println(map);
//		
//		System.out.println(map.put(222, new Student("경미", 2))); 
//		System.out.println(map);
//		System.out.println(map.put(111, new Student("성구", 999))); // 키 중복 불가
//		System.out.println(map);	

		// - Student 객체가 키이고 Integer 객체가 값인 경우
//		Map<Student, Integer> map = new HashMap<>(); 
//		map.put(new Student("성구", 1), 111); 
//		map.put(new Student("경미", 2), 222); 
//		System.out.println(map);
//		
//		map.put(new Student("지은", 3), 333);
//		System.out.println(map);
//		System.out.println(map.put(new Student("성구", 2), 999)); // 키 중복 불가
//		System.out.println(map);	

		// 객체 수정: replace(K key, V value): V
		// - Integer 객체가 키이고 Student 객체가 값인 경우
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student("성구", 111)); 
//		map.put(2, new Student("경미", 222)); 
//		map.put(3, new Student("지은", 333));
//		System.out.println(map);
//		
//		System.out.println(map.replace(1, new Student("길동", 444)));
//		System.out.println(map);
//		System.out.println(map.replace(7, new Student("한수", 444)));
		
		// - Student 객체가 키이고 Integer 객체가 값인 경우
//		Map<Student, Integer> map = new HashMap<>(); 
//		map.put(new Student("성구", 1), 111); 
//		map.put(new Student("경미", 2), 222); 
//		System.out.println(map);
//		
//		Integer temp = map.replace(new Student("성구", 1), 777);
//		System.out.println(temp);
//		System.out.println(map);

		// 객체 제거: remove(Object key, Object value):boolean, remove(Object key):value, clear():void
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student("성구", 111)); 
//		map.put(2, new Student("경미", 222)); 
//		map.put(3, new Student("지은", 333));
//		System.out.println(map);
//		
//		System.out.println(map.remove(1, new Student("성구", 111)));
//		System.out.println(map);
//		map.remove(2);
//		System.out.println(map);
//		map.clear();
//		System.out.println(map);
//		System.out.println(map.size());	
		
		// 객체 검색: 
		// - get(Object key):V, containsKey(Object key):boolean, containsValue(Object value): boolean
		// - keySet():Set<K>, values():Collection<V>, entrySet():Set<Map.Entry<K,V>>
		// - size():int, isEmpty():boolean
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");
//
//		System.out.println(map.get(2));
//		System.out.println(map.containsKey(1));
//		System.out.println(map.containsValue("가가가"));
//		
//		Set<Integer> keySet = map.keySet();
//		System.out.println(keySet);
//
//		Collection<String> values = map.values();
//		System.out.println(values);
//		
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		System.out.println(entrySet);
//		
//		System.out.println(map.size());
//		System.out.println(map.isEmpty());
		
		// 모든 요소 접근: for-each, iterator():Iterator<E>
		// - entrySet() 혹은 keySet()에 의해 반환된 Set 컬렉션의 반복자 이용
		// - Map은 iterator() 직접 호출 불가 하므로 Set 형태로 반환된 컬렉션에 iterator() 호출	
		// - entrySet() 이용
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");
//		
//		for (Map.Entry<Integer, String> entry : map.entrySet()) { 
//			Integer key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println("Key=" + key + ", Value=" + val);
//		}
//		
//		Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator(); 
//		while (iter.hasNex t()) {
//		    Map.Entry<Integer, String> entry = iter.next();
//		    Integer key = entry.getKey();
//		    String val = entry.getValue();
//		    System.out.println("Key=" + key + ", Value=" + val);
//		}
		
		// - keySet() 이용
//		Map<Integer, String> map = new HashMap<>();
//		map.put(2, "나나나"); map.put(1, "가가가"); map.put(3, "다다다");
//		
//		for (Integer key : map.keySet()) { 
//			String val = map.get(key);
//			System.out.println("Key=" + key + ", Value=" + val);
//		}
//		
//		Iterator<Integer> iter = map.keySet().iterator(); 
//		while (iter.hasNext()) {
//			Integer key = iter.next();
//			String val = map.get(key);
//			System.out.println("Key=" + key + ", Value=" + val);
//		}

		// - 다음 Student 객체의 모든 정보 출력 - entrySet() 이용
//		Map<Integer, Student> map = new HashMap<>();
//		map.put(1, new Student("성구", 111)); 
//		map.put(2, new Student("경미", 222)); 
//		map.put(3, new Student("지은", 333));
//
//		for (Map.Entry<Integer, Student> entry : map.entrySet()) { 
//			Integer key = entry.getKey();
//			Student val = entry.getValue();
//			String name = val.getName();
//			int id = val.getId();
//			System.out.println("ID " + id + "번 학생 이름은 " + name + 
//					"이고, " + "Key 번호는 " + key + " 입니다.");
//		}
//
//		for (Map.Entry<Integer, Student> entry : map.entrySet()) { 
//			Integer key = entry.getKey();
//			Student val = entry.getValue();
//			String name = val.getName();
//			int id = val.getId();
//			System.out.println("ID " + id + "번 학생 이름은 " + name + 
//					"이고, " + "Key 번호는 " + key + " 입니다.");
//		}
	}
}
