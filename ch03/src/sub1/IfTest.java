package sub1;

/*
 * 날짜 : 2024/07/01
 * 이름 : 김철학
 * 내용 : 조건문 if 실습
 */
public class IfTest {

	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if( num1 < num2 ) {
			// 조건이 참일때 실행
			System.out.println("num1은 num2보다 작다.");
		}
		
		if(num1 > 1) {
			System.out.println("num1은 1보다 크다.");
		}
				
		if(num1 > 0) {			
			if(num2 > 1) {				
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}			
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
		}
				
		// if ~ else
		int var1 = 1, var2 = 2;
		
		if(var1 > var2) {
			// 조건이 참 일때
			System.out.println("var1이 var2보다 크다.");			
		}else {
			// 조건이 거짓 일때
			System.out.println("var1이 var2보다 작다.");			
		}		
		
		// if ~ else if ~ else		
		int n1=1, n2=2, n3=3, n4=4;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
			
		}else if(n2 > n3) {
			System.out.println("n2이 n3보다 크다.");
			
		}else if(n3 > n4) {
			System.out.println("n3이 n4보다 크다.");
			
		}else {
			System.out.println("n4가 가장 크다.");			
		}		
	}
}







