// Set - TreeSet
// - 순서 없음(인덱스 정보 없음), 중복 저장 불가
// - Set의 기본 기능에 정렬 및 검색 기능 추가
//   - 검색/정렬 기능 이용하기 위해 Set이 아닌 TreeSet으로 선언 필요
// - 균형 이진 검색 트리(binary search tree) 형태로 여러 노드가 서로 연결된 컬렉션 
// - 입력 순서와 관계 없이 크기 순으로 출력
// - 사용자 정의 객체 크기 비교 위해 Comparable/Comparator 인터페이스 구현 필요

package ch08_Collection프레임워크.Set.TreeSet;

import java.util.*;

public class 실습_해답 {

	public static void main(String[] args) {
		// String, Wrapper 객체가 원소인 경우 
		// - camparable 인터페이스의 compareTo() 이미 재정의 됨
//		Set<String> set = new TreeSet<>(); 
//		set.add("성구"); set.add("경미"); set.add("현우");
//		set.add("지은"); set.add("성구");
//		System.out.println(set);
//		
//		System.out.println(set.remove("성구"));
//		System.out.println(set);
//		System.out.println(set.contains("현우"));
//
//		System.out.println("a".compareTo("b"));
//		
//		Integer a = 1;
//		Integer b = 4;
//		System.out.println(a.compareTo(b));
		
		
		// 사용자 정의 객체(Student)가 원소인 경우 
		// - 크기 비교 기준을 정의하기 위해 Comparable 인터페이스의 compareTo() 재정의 필요
//		Set<Student> set = new TreeSet<>(); 
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("현우", 3));
//		set.add(new Student("지은", 4));
//		set.add(new Student("성구", 2));
//		System.out.println(set);
//		
//		System.out.println(set.remove(new Student("성구", 2)));
//		System.out.println(set);
//		System.out.println(set.contains(new Student("lee", 3)));
//		
//		System.out.println(new Student("성구", 1).compareTo(new Student("경미", 1)));
	}
}
