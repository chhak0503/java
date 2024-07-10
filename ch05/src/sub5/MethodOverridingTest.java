package sub5;

/*
 * 날짜 : 2024/07/10
 * 이름 : 김철학
 * 내용 : 메서드 오버라이딩 실습하기
 */

class AAA {

	public void method1() {
		System.out.println("AAA::method1...");
	}
	
	public void method2() {
		System.out.println("AAA::method2...");
	}
	
	public void method3() {
		System.out.println("AAA::method3...");
	}
}
class BBB extends AAA {
	
	@Override
	public void method2() {
		System.out.println("BBB::method2...");
	}
	
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}	
}
class CCC extends BBB {
	
	@Override
	public void method1() {
		System.out.println("CCC::method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC::method2...");
	}
	
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
	}
}

public class MethodOverridingTest {
	public static void main(String[] args) {
		
		// 메서드 Overriding 실습
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		// Car 클래스 메서드 재정의
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(100);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 1000);
		bongo.speedUp(100);
		bongo.show();
		
	}
}














