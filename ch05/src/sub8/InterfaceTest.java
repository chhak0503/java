package sub8;

/**
 * 날짜 : 2025/01/10
 * 이름 : 김철학
 * 내용 : Java 인터페이스 실습하기
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		// 인터페이스 예제1 - 표준화된 공통 클래스 구조 설계
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		samsung.powerOff();
		
		// 인터페이스 예제2 - 유연성(다형성을 통한 결합도 완화)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
		// 인터페이스 예제3 - 다중 상속 효과
		
		
		
		
		
	}
}
