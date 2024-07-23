package sub3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2024/07/23
 * 이름 : 김철학
 * 내용 : 자바 컬렉션 스트림 필터 실습하기
 */
public class StreamFilterTest {
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(nums);
		
		// 중복제거
		nums.stream().distinct().forEach((num)->{
			System.out.print(num + ", ");
		});
		System.out.println();
		
		// 5 이상 필터링
		nums.stream()
			.filter((num)->{
				if(num >= 5) {
					return false;
				}
				return true;
			})
			.forEach((num)->{
				System.out.print(num + ", ");
			});
		
		System.out.println();
		
		// 중복제거, 짝수 데이터 필터링, 내림차순 정렬
		nums.stream()
			.distinct()
			.filter(num -> num % 2 == 0)
			.sorted(Collections.reverseOrder())
			.forEach(System.out::println);
		
	}
}










