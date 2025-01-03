package sub1;

/*
 * 날짜 : 2024/12/31
 * 이름 : 김철학
 * 내용 : ch02.변수와 연산자
 */
public class VariableTest {

	public static void main(String[] args) {
		
		// 변수
		int a = 3; // 초기화(최초로 변수에 값을 저장)
		int b = 7;
		
		System.out.println("a 값 : " + a);
		System.out.println("b 값 : " + b);
		
		a = 5; // 재할당(변수에 값을 다시 저장)
		b = 9;
		
		System.out.println("a 값 : " + a);
		System.out.println("b 값 : " + b);		
		
		// 상수
		final int NUM = 5; // 상수는 대문자 표기
		
		// 상수는 최초의 값으로 고정되기 때문에 재할당 할 수 없음
		//NUM = 7;
		
		System.out.println("NUM 값 : " + NUM);
		
	}
}
