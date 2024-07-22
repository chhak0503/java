package sub3;


/*
 * 날짜 : 2024/07/22
 * 이름 : 김철학
 * 내용 : 스레드 동기화 실습하기 
 * 
 * 동기 vs 비동기
 *  - 동기(Syncronize)는 일련의 로직을 순서대로 처리하는 흐름
 *  - 비동기(Asyncronize)는 일련의 로직을 순서를 지키지 않고 처리하는 흐름   
 * 
 */
public class ThreadSyncTest {

	public static void main(String[] args) {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		try {
			ct1.join();
			ct2.join();
			ct2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("count : " + count.getNum());
	}
	
}
