package sub2;

/**
 * 날짜 : 2025/01/06
 * 이름 : 김철학
 * 내용 : Java 메서드 실습하기
 */
public class MethodTest {

	// main 메서드 : 자바 프로그램의 시작 메서드(진입점)
	public static void main(String[] args) {
		
		// 메서드 호출(실행)
		int y1 = fx(1);
		int y2 = fx(2);
		int y3 = fx(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
	}
	
	// 메서드 정의
	public static int fx(int x) { // main 메서드에서 호출해야하기 때문에 main과 같이 static 키워드 맞춰줌
		
		int y = 2 * x + 3;
				
		return y;
	}
	
	
	
	
}











