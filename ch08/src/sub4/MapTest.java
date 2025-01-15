package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 날짜 : 2025/01/15
 * 이름 : 김철학
 * 내용 : Java 컬렉션 Map 실습하기
 */
public class MapTest {
	
	public static void main(String[] args) {
		
		// Map 생성
		Map<Character, String> map = new HashMap<>();
		
		// 데이터 입력
		map.put('A', "Apple"); // Key, Value 
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		// Map 크기
		System.out.println("map 크기 : " + map.size());
		
		// 데이터 출력
		System.out.println("map key-A : " + map.get('A'));
		System.out.println("map key-B : " + map.get('B'));
		System.out.println("map key-C : " + map.get('C'));
		
		// 반복문 출력
		for(char key : map.keySet()) {
			// map의 키값을 Set으로 반복처리
			System.out.println(key + " - " + map.get(key));
		}
		
		// List와 Map을 이용한 자료구조
		List<Map<Integer, Apple>> mapList = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("미국", 3000));
		m1.put(103, new Apple("일본", 3000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("중국", 3000));
		m2.put(202, new Apple("호주", 3000));
		m2.put(203, new Apple("영국", 3000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 3000));
		m3.put(303, new Apple("인도", 3000));
		
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		// 한국 사과
		Map<Integer, Apple> map1 = mapList.get(0);
		Apple apple = map1.get(101);
		apple.show();
		
		// 미국 사과
		mapList.get(0).get(102).show(); // 메서드 체이닝
		
		// 호주 사과
		mapList.get(1).get(202).show();
		
		// 대만 사과
		mapList.get(2).get(301).show();
		
		// 인도 사과
		mapList.get(2).get(303).show();
		
	}

}

























