package sub2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sub1.Apple;

/**
 * 날짜 : 2025/01/15
 * 이름 : 김철학
 * 내용 : Java 컬렉션 List 실습하기
 */
public class ListTest {
	public static void main(String[] args) {
		
		// List(ArrayList) 생성
		List<Integer> list = new ArrayList<>();
		
		// 데이터 저장
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		// 데이터 삽입
		list.add(1, 6); // 인덱스 1번 데이터 삽입
		System.out.println(list);
		
		// 데이터 제거
		list.remove(1); // 인덱스 1번 데이터 삭제
		System.out.println(list);
		
		// 데이터 참조
		System.out.println("list 1번째 원소 : " + list.get(0));
		System.out.println("list 2번째 원소 : " + list.get(1));
		System.out.println("list 4번째 원소 : " + list.get(3));
		
		// 리스트 크기
		System.out.println("list 크기 : " + list.size());
		
		// 리스트 반복문
		for(int num : list) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		// 문자열 리스트
		List<String> persons = new ArrayList<>();
		persons.add("김유신");
		persons.add("김춘추");
		persons.add("장보고");
		persons.add("강감찬");
		persons.add("이순신");
		System.out.println(persons);
		
		// 마지막 '정약용' 추가
		persons.add("정약용");
		System.out.println(persons);
		
		// 강감찬, 이순신 사이에 '이성계' 추가
		persons.add(4, "이성계");
		System.out.println(persons);
		
		// 김유신, 김춘추 사이에 '선덕여왕' 추가
		persons.add(persons.indexOf("김춘추"), "선덕여왕");
		System.out.println(persons);
		
		// 장보고 제거 후 '왕건' 추가
		persons.remove(3);
		persons.add(3, "왕건");
		System.out.println(persons);
		
		
		// 객체 리스트
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		Apple a3 = new Apple("일본", 1000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(a3);
		
		for(Apple apple : apples) {
			System.out.println(apple);	
		}
		
		// LinkedList 실습
		List<String> cities = new LinkedList<>();
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		System.out.println(cities);
		
		cities.add(1, "수원");
		cities.addFirst("인천");
		cities.addLast("울산");
		System.out.println(cities);
		
		
	}
}










