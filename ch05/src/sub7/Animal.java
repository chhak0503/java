package sub7;

// 추상 클래스 - 추상 메서드를 갖는 클래스, 상속을 위한 클래스, 실제 구현 X
public abstract class Animal {

	public void move() {
		System.out.println("Animal move...");
	}
	
	// 추상 메서드 - 내용이 없는 메서드, 오버라이드를 위한 메서드
	public abstract void hunt();
	
}
