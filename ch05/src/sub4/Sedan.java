package sub4;

public class Sedan extends Car {
		
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); // 부모클래스 생성자 호출
		this.cc = cc;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + cc);
	}

}
