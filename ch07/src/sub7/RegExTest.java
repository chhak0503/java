package sub7;

import java.util.regex.Pattern;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김철학
 * 내용 : Java 정규표현식 클래스 실습하기
 */
public class RegExTest {
	
	public static void main(String[] args) {
		
		
		// 정규표현식
		String pattern = "a[a-z]*";
		
		boolean r1 = Pattern.matches(pattern, "apple");
		boolean r2 = Pattern.matches(pattern, "banana");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		// 자주 사용하는 정규표현식 패턴
		String[] patterns = {
				"[0-9]+",  	// 숫자 1개 이상
				"1[0-9]*", 	// 1로 시작하는 숫자 0개 이상
				"^[0-9]",  	// 숫자로 시작하는 문자
				"[^0-9]",  	// 숫자가 아닌 문자
				".",	   	// 문자 1개
				"[a-z]?",	// 영어 소문자 1개
				"[a-z]*",	// 영어 소문자 0개 이상
				"[a-z]+",	// 영어 소문자 1개 이상
				"[A-Z]*",	// 영어 대문자 0개 이상
				"[가-힣]+",	// 한글 1자 이상
				"^[0-9a-z]*",   // 숫자+영어 조합 0개 이상								
				"^[0-9가-힣]*",  // 숫자+한글 조합 0개 이상
				"^[A-Z][a-z]*", // 영어 대문자로 시작하는 문자 0개 이상 
				"\\s",		// 공백
				"\\S",		// 공백이 아닌 문자
				"\\d",		// 숫자
				"\\w",		// 숫자와 문자
				"\\W",		// 특수문자
			};
		
		String[] words = {"apple", "123abc", "123456", "011한글", "hello", "홍길동", "1", "Banana", "APPLE", "#"};
		
		for(String word : words) {
			
			System.out.print(word + " 문자와 일치하는 패턴 : ");
			
			for(String ptt : patterns) {
				boolean result = Pattern.matches(ptt, word);
				
				if(result) {
					System.out.print(ptt + ", ");
				}
			}
			
			System.out.print("\n");			
		}
	}
}






