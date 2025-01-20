package sub3;

/*
 * 날짜 : 2025/01/20
 * 이름 : 김철학
 * 내용 : Java 스레드 동기화 실습하기
 */
public class ThreadSyncTest {

	public static void main(String[] args) {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		// 작업 스레드 실행(비동기 작업)
		ct1.start();
		ct2.start();
		ct3.start();
		
		try {
			ct1.join();
			ct2.join();
			ct3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count 결과 : " + count.getNum());	
		
	}
}
