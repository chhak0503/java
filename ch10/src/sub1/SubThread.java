package sub1;

public class SubThread extends Thread {

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { // 작업 스레드로 처리할 메서드 
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println(name + " Thread 실행...");
			
			try {
				Thread.sleep(1000); // 스레드 1초 대기 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " Thread 종료...");
	}
}
