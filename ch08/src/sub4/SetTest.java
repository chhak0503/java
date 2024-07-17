package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 날짜 : 2024/07/17
 * 이름 : 김철학
 * 내용 : Set 실습하기
 */
public class SetTest {
	
	public static void main(String[] args) {
		
		// Set 생성
		Set<Integer> set = new HashSet<>();
		
		// 데이터 저장
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
		
		
		// 반복자를 이용한 데이터 출력
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			// 다음 데이터가 있을때 까지 반복 실행
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		
		// 반복문으로 데이터 출력
		for(int num : set) {
			System.out.print(num + ", ");
		}
		
	}
}














