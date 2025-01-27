package test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + taskName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ThreadPoolTest {

	public static void main(String[] args) {
		
		// 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(2); // 2,3,4,5,10 점진적으로 늘려서 실습

        // 작업을 스레드 풀에 제출
        for (int i=1 ; i<=10 ; i++) {
            executorService.execute(new Task("Task " + i));
        }

        // 모든 작업이 끝난 후 ExecutorService 종료
        executorService.shutdown();
		
		System.out.println("프로그램 종료...");
	}
}
