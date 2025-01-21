package sub1;

/*
 * 날짜 : 2025/01/21
 * 이름 : 김철학
 * 내용 : Java 람다식 실습
 */

@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double a);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface D {
	public void method();
}

@FunctionalInterface
interface E {
	public double method(double num);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		// 람다식 정의
		A a1 = (int a, int b) -> {
			int c = a + b;			
			return c;
		};
		
		A a2 = (a, b) -> {
			return a + b;
		};
		
		A a3 = (a, b) -> a + b; // 중괄호가 없으면 리턴
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		B b1 = (double a) -> {
			System.out.println("a : " + a);
		};
		
		B b2 = a -> System.out.println("a : " + a);
		
		B b3 = System.out::println; // 람다식 메서드 참조
		
		b1.method(1.0);
		b2.method(2.0);
		b3.method(3.0);
		
		C c1 = () -> {
			return true;
		};
		
		C c2 = () -> false;
		
		boolean res1 = c1.method();
		boolean res2 = c2.method();
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		
		D d1 = () -> {
			System.out.println("d1 호출...");
		};
		
		D d2 = () -> System.out.println("d2 호출...");
		
		d1.method();
		d2.method();
		
		// 메서드 참조 연산자
		E e1 = Math::ceil;
		E e2 = Math::floor;
		E e3 = Math::round;
		
		double n1 = e1.method(1.2);
		double n2 = e2.method(1.8);
		double n3 = e3.method(2.5);
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		
		// 람다식을 이용한 스레드
		Runnable run = () -> {
			
			for(int i=0 ; i<10 ; i++) {
				
				System.out.println("작업 스레드 실행...");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(run);
		thread.start();
		
		for(int i=0 ; i<10 ; i++) {
			
			System.out.println("메인 스레드 실행...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		
	}
	
}




















