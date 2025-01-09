package sub5;

public class Truck extends Car {
	
	private int capacity;

	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed += (speed - capacity);
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		super.show(); // 부모클래스 show() 호출
		System.out.println("적재용량 : " + this.capacity);
	}

}
