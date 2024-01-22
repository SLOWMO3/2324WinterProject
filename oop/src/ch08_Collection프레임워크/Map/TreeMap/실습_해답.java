// Map - TreeMap
// - 키와 데이터로 구성된 엔트리 객체 저장, 순서없음
//   - 키는 중복 저장 불가, 데이터는 중복 저장 가능
// - 균형 이진 탐색 트리를 이용하여 Map의 특징을 구현한 자료구조
// - Map의 기본 기능에 정렬 및 검색 기능 추가
// - 입력 순서와 관계 없이 크기 순으로 출력
// - 사용자 정의 객체 크기 비교 위해 Comparable/Comparator 인터페이스 구현 필요

package ch08_Collection프레임워크.Map.TreeMap;

import java.util.*;

public class 실습_해답 {

	public static void main(String[] args) {
		// String, Wrapper 객체가 key인 경우 
		// - put(), remove(), containsKey(), entrySet() 연습
		//Map<String, Integer> map = new TreeMap<>(); 
	//	map.put("성구", 111);
	//map.put("경미", 333);		map.put("현우", 222);
	//	map.put("지은", 444);
	//	map.put("성구", 777);
	//	System.out.println(map);
	//	System.out.println(map.remove("성구"));
	//	System.out.println(map);
	//	System.out.println(map.containsKey("현우"));
		
	//	for (Map.Entry<String, Integer> entry : map.entrySet()) {
	//	String key = entry.getKey();
	//		Integer val = entry.getValue();
		//System.out.println("key:" + key + ", value:" + val);
		//}
		
		// 사용자 정의 객체(Student)가 key인 경우 
		// - put(), remove(), containsKey(), entrySet() 연습
		Map<Student, Integer> map = new TreeMap<>(); 
		map.put(new Student("성구", 1), 111);
		map.put(new Student("경미", 3), 333);
		map.put(new Student("현우", 2), 222);
	map.put(new Student("지은", 4), 444);
		map.put(new Student("길동", 4), 777);
		System.out.println(map);
		
		System.out.println(map.remove(new Student("성구", 2)));
		System.out.println(map);
		System.out.println(map.containsKey(new Student("진우", 3)));	
		
		for (Map.Entry<Student, Integer> entry : map.entrySet()) {
			Student key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key:" + key + ", value:" + val);
		}
	}
}
