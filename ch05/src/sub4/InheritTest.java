package sub4;

/*
 * 날짜 : 2025/01/09
 * 이름 : 김철학
 * 내용 : Java 클래스 상속 실습하기
 */

class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent {	
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2); // 부모클래스 생성자 호출
		this.num3 = num3;
		this.num4 = num4;
	}

	public int minus() {
		return num3 - num4;
	}
}

public class InheritTest {
	
	public static void main(String[] args) {
	
		// 상속 객체 생성
		Child child = new Child(1, 2, 3, 4);
		int result1 = child.plus();
		int result2 = child.minus();
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		// Car 상속 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		//sonata.name = "아반테";
		sonata.show();		
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		// Account 상속 객체 생성
		StockAccount kb = new StockAccount("KB증권", "101-11-1001", "홍길동", 10000, "삼성전자", 0, 50000);
		kb.deposit(1000000);
		kb.buy(10, 50000);
		kb.show();
		
		kb.sell(5, 60000);
		kb.show();
		
		// Person 상속 객체 생성
		Doctor doctor = new Doctor("김유신", 33, "소아과");
		Engineer engineer = new Engineer("김춘추", 34, "소프트웨어");
		
		doctor.work();
		engineer.work();
		
	}

}












