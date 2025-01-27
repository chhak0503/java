package test5;

/*
 * 날짜 : 2025/01/27
 * 이름 : 김철학
 * 내용 : 자바 총정리 연습문제
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		char var1 = 'A';
		int var2 = var1;				
		char var3 = 'B';
		int var4 = var1 + var3;
		String var5 = """
						Hello World!
						Hello Korea!
						Hello Busan!
					  """;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println(var5);
			
		int a = 10;
		int b = 5;
						
		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);
		
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);

		System.out.println(a == b & test());
		System.out.println(a == b && test());

		System.out.println(b > 0 & (a / b > 0));
		System.out.println(b > 0 && (a / b > 0));
		
	}
	
	public static boolean test() {
		System.out.println("test() 실행...");
		return true;
	}
}