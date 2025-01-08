package sub3;


/*
 * 날짜 : 2025/01/08
 * 이름 : 김철학
 * 내용 : Java 클래스 변수, 클래스 메서드 실습
 * 
 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드)
 *  - static 키워드를 선언한 변수, 메서드
 *  - Method Area 메모리 영역에 생성
 *  - 객체를 생성하지 않고 직접 클래스 타입으로 사용
 *  - 객체들 간의 데이터 공유 목적으로 사용
 *  
 * 싱글톤 객체
 *  - static 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리(Method Area)에 생성
 *  - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상 
 *  - static 인스턴스 생성, 인스턴스 Getter 정의, private 생성자 정의
 * 
 */
public class StaticTest {
	
	public static void main(String[] args) {
		
		// 정적 변수, 정적 메서드 
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반테", "검정", 20);
		Car grande = new Car("그랜져", "은색", 30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		// 전체 차량 수 클래스 변수
		System.out.println("전체 차량 수 : " + Car.count);
		
		// 전체 차량 수 클래스 메서드
		System.out.println("전체 차량 수 : " + Car.getCount());
		

		// Increment 실습
		Increment inc1 =  new Increment();
		Increment inc2 =  new Increment();
		Increment inc3 =  new Increment();
		
		// 싱글톤 실습
		Calc c1 = Calc.getInstance();
		
		int result1 = c1.plus(1, 2);		
		System.out.println("result1 : " + result1);

		Calc c2 = Calc.getInstance();
		
		int result2 = c2.minus(1, 2);
		System.out.println("result2 : " + result2);
		
	}

}

















