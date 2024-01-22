package ch08_Collection프레임워크.Set.TreeSet;

import java.util.*;

public class 실습 {

	public static void main(String[] args) {
		// String, Wrapper 객체가 원소인 경우 
		// - camparable 인터페이스의 compareTo() 이미 재정의 됨
//		Set<String> set = new TreeSet<>(); 
//		set.add("성구"); set.add("경미"); set.add("현우");
//		set.add("지은"); set.add("성구");
//		System.out.println(set);
		
		
		// 사용자 정의 객체(Student)가 원소인 경우 
		// - 크기 비교 기준을 정의하기 위해 Comparable 인터페이스의 compareTo() 재정의 필요
//		Set<Student> set = new TreeSet<>(); 
//		set.add(new Student("성구", 1));
//		set.add(new Student("경미", 2));
//		set.add(new Student("현우", 3));
//		set.add(new Student("지은", 4));
//		set.add(new Student("성구", 2));
//		System.out.println(set);
		
		
	}
}
