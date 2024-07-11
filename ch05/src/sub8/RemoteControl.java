package sub8;

public interface RemoteControl {

	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();   // abstract 키워드 생략가능
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}
