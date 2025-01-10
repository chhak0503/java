package sub7;

/*
 * 날짜 : 2025/01/10
 * 이름 : 김철학
 * 내용 : Java 추상클래스 실습하기
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성X
		//Animal animal = new Animal();
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
	}
}
