package sub3;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	
	// 동기화 블럭 : 스레드간 경합을 막고 동기방식으로 실행
	public synchronized void setNum() {
		
		// 임계영역 : 멀티 스레드에 의해 공유자원이 참조되는 영역
		num++;		
	}
	
	
}
