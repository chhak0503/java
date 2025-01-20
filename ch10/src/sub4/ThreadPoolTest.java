package sub4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 날짜 : 2025/01/20
 * 이름 : 김철학
 * 내용 : Java 스레드풀 실습하기
 */

class Task implements Runnable {

	private String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " - " + name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class ThreadPoolTest {

	public static void main(String[] args) {
		
		// 스레드풀 생성, 스레드 갯수에 따라 처리 시간이 달라짐
		ExecutorService executor = Executors.newFixedThreadPool(2); 
		
		// 작업을 스레드풀 제출
		for(int i=1 ; i<=10 ; i++){
			executor.submit(new Task("Task " + i));			
		}
		
		// 스레드풀 종료
		executor.shutdown();
		
		System.out.println("프로그램 종료...");		
	}	
}













