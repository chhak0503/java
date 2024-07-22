package sub5;


/*
 * 날짜 : 2024/07/22
 * 이름 : 김철학
 * 내용 : 데몬 스레드 실습하기
 * 
 * 데몬스레드(Daemon)
 *  - 메인스레드를 보조하는 보조스레드
 *  - 메인스레드가 종료되면 데몬스레드도 같이 종료
 */
class SubThread extends Thread {

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { // 작업 스레드로 처리할 메서드 
		
		for(;;) {
			System.out.println(name + " Thread 실행...");
			
			try {
				Thread.sleep(1000); // 스레드 1초 대기 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThreadTest {

	public static void main(String[] args) {
		
		SubThread sub = new SubThread("Sub");
		sub.setDaemon(true); // 데몬스레드 설정
		
		sub.start();
		
		for(int i=1 ; i<=10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("main 스레드 실행...");
		}
		
		System.out.println("main 스레드 종료...");
	}
}













