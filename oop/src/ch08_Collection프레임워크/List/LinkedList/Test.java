// LinkedList vs. ArrayList 성능 비교
// - LinkedList는 빈번한 객체 추가/제거 수행시 효율적
// - ArrayList는 검색에 효율적

package ch08_Collection프레임워크.List.LinkedList;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Integer> array_list = new ArrayList<>();
		List<Integer> linked_list = new LinkedList<>();
		
		long startTime = 0, endTime = 0;
		
		// ArrayList 추가 시간
		startTime = System.currentTimeMillis(); // 1970년1월1일00시00분 이후 1/1000 단위 시간 반환
		for (int i = 0; i < 100000; i++) {
			array_list.add(0, i);
		}
		endTime = System.currentTimeMillis(); 
		System.out.println("ArrayList 추가 시간 = " + (endTime - startTime) + "ms");
	
		// LinkedList 추가 시간
		startTime = System.currentTimeMillis(); 
		for (int i = 0; i < 100000; i++) {
			linked_list.add(0, i);
		}
		endTime = System.currentTimeMillis(); 
		System.out.println("LinkedList 추가 시간 = " + (endTime - startTime) + "ms");

		// ArrayList 검색 시간
		startTime = System.currentTimeMillis(); 
		for (int i = 0; i < 100000; i++) {
			array_list.get(i);
		}
		endTime = System.currentTimeMillis(); 
		System.out.println("ArrayList 검색 시간 = " + (endTime - startTime) + "ms");
	
		// LinkedList 검색 시간
		startTime = System.currentTimeMillis(); 
		for (int i = 0; i < 100000; i++) {
			linked_list.get(i);
		}
		endTime = System.currentTimeMillis(); 
		System.out.println("LinkedList 검색 시간 = " + (endTime - startTime) + "ms");
		
		// ArrayList 제거 시간
		startTime = System.currentTimeMillis(); // 1970년1월1일00시00분 이후 1/1000 단위 시간 반환
		for (int i = 0; i < 100000; i++) {
			array_list.remove(0);
		}
		endTime = System.currentTimeMillis(); 
		System.out.println("ArrayList 제거 시간 = " + (endTime - startTime) + "ms");
	
		// LinkedList 제거 시간
		startTime = System.currentTimeMillis(); // 1970년1월1일00시00분 이후 1/1000 단위 시간 반환
		for (int i = 0; i < 100000; i++) {
			linked_list.remove(0);
		}
		endTime = System.currentTimeMillis(); 
		System.out.println("LinkedList 제거 시간 = " + (endTime - startTime) + "ms");
		
		// 최종 원소 갯수
		System.out.println("ArrayList 원소 갯수 = " + array_list.size());
		System.out.println("LinkedList 원소 갯수 = " + linked_list.size());
	}
}

