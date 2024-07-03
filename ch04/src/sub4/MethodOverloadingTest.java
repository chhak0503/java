package sub4;

/*
 * 날짜 : 2024/07/03
 * 이름 : 김철학
 * 내용 : 메서드 오버로딩 실습하기
 */
public class MethodOverloadingTest {
	
	public static void main(String[] args) {
	
		int    r1 = add(3);
		int    r2 = add(1, 2);
		double r3 = add(1.0, 2.1);
		String r4 = add("Hello", "World");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);		
	}
	
	// 오버로드 메서드 정의
	public static int add(int a) {
		return a + a;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static String add(String a, String b) {
		return a + b;
	}
	
}
