package sub8;

public class SmartTv extends Tv implements Computer {

	@Override
	public void boot() {
		System.out.println("SmartTv boot...");
	}

	@Override
	public void internet() {
		System.out.println("SmartTv internet...");
	}
	
	public void process() {
		powerOn();
		boot();
		internet();
	}
}
